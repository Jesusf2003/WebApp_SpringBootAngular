import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { UbigeoService } from './services/ubigeo/ubigeo.service';
import { PersonaService } from './services/persona/persona.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  personaForm!: FormGroup;
  persona: any;
  ubigeo: any;
  constructor(
    public fb: FormBuilder,
    public UbigeoService: UbigeoService,
    public PersonaService: PersonaService
  ) { }
  ngOnInit(): void {
    this.personaForm = this.fb.group({
      codPer: ['', Validators.required],
      nombre: ['', Validators.required],
      apellido: ['', Validators.required],
      user: ['', Validators.required],
      password: ['', Validators.required],
      celular: ['', Validators.required],
      dni: ['', Validators.required],
      estado: ['', Validators.required],
      mail: ['', Validators.required],
      direc: ['', Validators.required],
      rol: ['', Validators.required],
      codUbi: ['', Validators.required]
    });

    this.PersonaService.getAllPersonas().subscribe(resp => {
      this.persona = resp;
    },
      error => { console.error(error)}
    );

    this.UbigeoService.getAllUbigeo().subscribe(resp => {
      this.ubigeo = resp;
    },
      error => { console.error(error) }
    );
  }
}

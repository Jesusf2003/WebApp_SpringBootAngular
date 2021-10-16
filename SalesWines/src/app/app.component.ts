// Importaciones
import { Component, OnInit } from '@angular/core';
import { AbstractControlOptions, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { UbigeoService } from './services/ubigeo/ubigeo.service';
import { PersonaService } from './services/persona/persona.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit{

  personaForm!: FormGroup;

  constructor(
    public fb: FormBuilder,
    public UbigeoService: UbigeoService,
    public PersonaService: PersonaService
  ) { }

  ngOnInit(): void {
    this.personaForm = this.fb.group({
      nombre : ['', Validators.required],
      apellido: ['', Validators.required],
      user : ['', Validators.required],
      password : ['', Validators.required],
      celular: ['', Validators.required],
      dni: ['', Validators.required],
      estado: ['', Validators.required],
      mail: ['', Validators.required],
      direc: ['', Validators.required],
      rol : ['', Validators.required]
    })
  }

  guardar() : void{}
}

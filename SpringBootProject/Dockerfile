# Distribution of Linux
FROM alpine:3.13

# aadiendo condifugración para archivo SSH
RUN apk --no-cache add openssh-client

COPY ssh_config /root/.ssh/config

RUN chmod 644 /root/.ssh/config

ENTRYPOINT [ "ssh" ]
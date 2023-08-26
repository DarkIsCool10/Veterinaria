package com.joki.veterinaria.model;

import java.time.LocalDate;

public class AtencionVeterinaria {
    private Cliente cliente;
    private Mascota mascota;
    private Veterinario veterinario;
    private EstadoAtencion estadoAtencion;
    private LocalDate fechaAtencion;

    public AtencionVeterinaria(Cliente cliente, Mascota mascota, Veterinario veterinario, EstadoAtencion estadoAtencion, LocalDate fechaAtencion) {
        this.cliente = cliente;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.estadoAtencion = estadoAtencion;
        this.fechaAtencion = fechaAtencion;
    }

    public AtencionVeterinaria() {

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public EstadoAtencion getEstadoAtencion() {
        return estadoAtencion;
    }

    public void setEstadoAtencion(EstadoAtencion estadoAtencion) {
        this.estadoAtencion = estadoAtencion;
    }

    public LocalDate getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(LocalDate fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }
}
package com.nttdata_empresa.models;

import com.nttdata_empresa.models.ids.EmpleadosTareasId;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "empleados_tareas")
public class EmpleadosTareas
{
    @EmbeddedId
    private EmpleadosTareasId empleadosTareasId;

    @Column
    private String estado;
    
    @ManyToOne
    @MapsId("idEmpleado")
    @JoinColumn(name = "idEmpleado")
    private Empleado empleado;

    @ManyToOne
    @MapsId("idTarea")
    @JoinColumn(name = "idTarea")
    private Tareas tarea;

}

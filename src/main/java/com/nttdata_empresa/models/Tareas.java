package com.nttdata_empresa.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tareas")
public class Tareas
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTarea;
    
	@NotBlank(message = "El nombreTarea no puede estar vacio")
    @Column(nullable = false)
	private String nombreTarea;

	@NotBlank(message = "La fechaInicio no puede estar vacia")
    @Column(nullable = false)
    private Date fechaInicio;
	
	@NotBlank(message = "La fechaFin no puede estar vacia")
    @Column(nullable = false)
    private Date fechaFin;
    
	@NotBlank(message = "El estado no puede estar vacio")
    @Column(nullable = false)
    private String estado;
    
    @ManyToOne
    @JoinColumn(name = "idProyecto")
    private Proyectos proyecto;
   
    @ManyToOne
    @JoinColumn(name = "idEmpleado")
    private Empleado empleado;
    
}

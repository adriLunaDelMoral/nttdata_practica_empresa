package com.nttdata_empresa.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name="tareas")
public class Tareas
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTarea;
    
	@Column
	private String nombreTarea;

    @Column
    private Date fechaInicio;
    
    @Column
    private Date fechaFin;
    
    @ManyToOne
    @JoinColumn(name = "idProyecto")
    private Proyectos proyecto;
   
    @OneToMany(mappedBy = "tarea")
    private List<EmpleadosTareas> empleadoTareas;
    
}

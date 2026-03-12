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
@Table(name="proyectos")
public class Proyectos
{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProyecto;
    
    @Column
    private String nombreProyecto;
    
    @Column
    private String estado;
    
    @Column
    private Date fechaInicio;

    @Column
    private Date fechaEstimada;
    
    @ManyToOne
    @JoinColumn(name = "idDepartamento")
    private Departamento departamento;

    @OneToMany(mappedBy = "proyecto")
    private List<Tareas> tareas;
    
}


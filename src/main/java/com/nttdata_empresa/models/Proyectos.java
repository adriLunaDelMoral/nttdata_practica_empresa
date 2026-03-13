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
@Table(name="proyectos")
public class Proyectos
{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProyecto;
    
	@NotBlank(message = "El nombreProyecto no puede estar vacio")
    @Column(nullable = false)
    private String nombreProyecto;
	
	@NotBlank(message = "El estado no puede estar vacio")
    @Column(nullable = false)
    private String estado;
    
	@NotBlank(message = "La fechaInicio no puede estar vacia")
    @Column(nullable = false)
    private Date fechaInicio;

	@NotBlank(message = "La fechaEstimada no puede estar vacia")
    @Column(nullable = false)
    private Date fechaEstimada;
    
    @ManyToOne
    @JoinColumn(name = "idDepartamento")
    private Departamento departamento;

    @OneToMany(mappedBy = "proyecto")
    private List<Tareas> tareas;
    
}


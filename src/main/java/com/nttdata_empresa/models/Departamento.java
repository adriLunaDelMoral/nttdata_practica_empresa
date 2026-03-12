package com.nttdata_empresa.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
@Table(name="departamento")
public class Departamento
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDepartamento;
    
    @Column
    private String nombreDepartamento;
    
    @Column
    private String ubicacion;

    @OneToOne
    @JoinColumn(name = "idResponsable")
    private Empleado responsable;
    
    @OneToMany(mappedBy = "departamento")
    private List<Empleado> empleados;

    @OneToMany(mappedBy = "departamento")
    private List<Proyectos> proyectos;
    
    
}

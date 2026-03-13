package com.nttdata_empresa.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
@Table(name="empleado")
public class Empleado
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpleado;
    
    @NotBlank(message = "El nombre no puede estar vacio")
    @Column(nullable = false)
    private String nombre;
    
    @NotBlank(message = "El salario no puede estar vacio")
    @Column(nullable = false)
    private Double salario;
    
    @Column
    private Integer edad;
    
    @ManyToOne
    @JoinColumn(name = "idDepartamento")
    private Departamento departamento;

    @OneToMany(mappedBy = "empleado")
    private List<Tareas> tareas;
    
    @OneToOne(mappedBy = "responsable")
    private Departamento departamentoResponsable;
}

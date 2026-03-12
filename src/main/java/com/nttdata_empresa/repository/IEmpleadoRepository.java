package com.nttdata_empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata_empresa.models.Empleado;

public interface IEmpleadoRepository extends JpaRepository<Empleado, Long>
{

}

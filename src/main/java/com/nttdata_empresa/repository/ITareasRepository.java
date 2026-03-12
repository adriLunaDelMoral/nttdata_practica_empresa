package com.nttdata_empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata_empresa.models.Tareas;

public interface ITareasRepository extends JpaRepository<Tareas, Long>
{

}

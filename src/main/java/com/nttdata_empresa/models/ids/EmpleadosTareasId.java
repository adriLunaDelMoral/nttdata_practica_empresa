package com.nttdata_empresa.models.ids;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class EmpleadosTareasId implements Serializable
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column
	private Long idEmpleado;
	
	@Column
    private Long idTarea;
}

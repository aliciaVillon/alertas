package pe.edu.ucsur.java.ms.sc.ventas.msgestionemergencia.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class PacienteDTO implements Serializable{
		  
	private static final long serialVersionUID = -9807309035903996L;
	private Long id;
  	private String razonSocial;
  	private String ruc;
  	private String direccion;

  	private String telefono;

  	private String correo;
  	
  	private String estado;

}

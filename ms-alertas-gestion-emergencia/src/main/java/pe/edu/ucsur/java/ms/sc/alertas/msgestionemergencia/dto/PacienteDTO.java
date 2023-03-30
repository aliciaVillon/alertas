package pe.edu.ucsur.java.ms.sc.alertas.msgestionemergencia.dto;

import java.io.Serializable;

import javax.persistence.Column;

import lombok.Data;

@Data
public class PacienteDTO implements Serializable{
		  
	private static final long serialVersionUID = -9807309035903996L;
	private Long id;
	private String apellidoPaterno; 
  	private String apellidoMaterno; 
  	private String nombres; 
  	private String fechaNacimiento; 
  	private int idTipoDocumentoCat02; 
  	private String nroDocumento; 
  	private int idSexoCat02; 
  	private String idRegUbigeoDireccion; 
  	private String direccion; 
  	private String telefono; 
  	private String correo; 
  	private String activo; 
  	private String fechaRegistro; 
  	private String fechaModificacion;
  	private String usuarioRegistro;
  	private String usuarioModificacion;
  	private String ipRegistro;
  	private String ipModificacion;

}

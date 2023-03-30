package pe.edu.ucsur.java.ms.sc.alertas.msgestionemergencia.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "Paciente")
public class PacienteEntity implements Serializable{
		  
	private static final long serialVersionUID = -2170897015344177815L;

		@Id
	  	@Column(name = "idPaciente")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
	  
	  	@NotNull(message = "Nombre del producto es requerido")
	  	@Size(min = 5, max = 120, message = "El nombre.....")
	  	@Column(name = "apellidoPaterno")
	  	private String apellidoPaterno;
	  	
	  	@Column(name = "apellidoMaterno")
	  	private String apellidoMaterno;

	  	@Column(name = "nombres")
	  	private String nombres;

	  	@Column(name = "fechaNacimiento")
	  	private String fechaNacimiento;
	  	
	  	@Column(name = "idTipoDocumentoCat02")
	  	private int idTipoDocumentoCat02;
	  	 
	  	@Column(name = "nroDocumento")
	  	private String nroDocumento;
	  	   
	  	@Column(name = "idSexoCat02")
	  	private int idSexoCat02;
	  	
	  	@Column(name = "idRegUbigeoDireccion")
	  	private String idRegUbigeoDireccion;
	  	
	  	@Column(name = "direccion")
	  	private String direccion;
	  	
	  	@Column(name = "telefono")
	  	private String telefono;
	  	
	  	@Column(name = "correo")
	  	private String correo;
	  	
	  	@Column(name = "activo")
	  	private String activo;
	  	
	  	@Column(name = "fechaRegistro")
	  	private String fechaRegistro;
	  	 
	  	private String fechaModificacion;
	  	private String usuarioRegistro;
	  	private String usuarioModificacion;
	  	private String ipRegistro;
	  	private String ipModificacion;
	  		

}

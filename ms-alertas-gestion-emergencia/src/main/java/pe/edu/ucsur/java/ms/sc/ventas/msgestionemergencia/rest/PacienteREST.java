package pe.edu.ucsur.java.ms.sc.ventas.msgestionemergencia.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;
import pe.edu.ucsur.java.ms.sc.ventas.msgestionemergencia.dto.PacienteDTO;
import pe.edu.ucsur.java.ms.sc.ventas.msgestionemergencia.service.PacienteService;

import static pe.edu.ucsur.java.ms.sc.ventas.msgestionemergencia.commons.GlobalConstants.API_Paciente;
import static pe.edu.ucsur.java.ms.sc.ventas.msgestionemergencia.commons.GlobalConstants.COD_MSG_EXITO;
import static pe.edu.ucsur.java.ms.sc.ventas.msgestionemergencia.commons.GlobalConstants.MSG_CONSULTA_EXITO;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping(API_Paciente)
public class PacienteREST {

	private PacienteService PacienteService;

	public PacienteREST(PacienteService PacienteService) {
		super();
		this.PacienteService = PacienteService;
	}

	@GetMapping
	public ResponseEntity<Response>  findByLike(){
		try {
			List<PacienteDTO> lstPacienteDTO= this.PacienteService.findByLike(null);
			if (lstPacienteDTO.isEmpty()) {
				return ResponseEntity.noContent().build();
			}
			return ResponseEntity.ok(
					Response
					.builder()
					.message(Message.builder().code(COD_MSG_EXITO).message(MSG_CONSULTA_EXITO).build())
					.data(lstPacienteDTO)
					.build());
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return ResponseEntity.internalServerError().build();
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<Response>  findById(@PathVariable Long id){
		try {
			Optional<PacienteDTO> optPacienteDTO= this.PacienteService.findById(id);
			if (optPacienteDTO.isEmpty()) {
				return ResponseEntity.noContent().build();
			}
			return ResponseEntity.ok(
					Response
					.builder()
					.message(Message.builder().code(COD_MSG_EXITO).message(MSG_CONSULTA_EXITO).build())
					.data(optPacienteDTO.get())
					.build());
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return ResponseEntity.internalServerError().build();
		}
	}

	
	@PostMapping
	public ResponseEntity<Response>  save(@RequestBody PacienteDTO PacienteDTO){
		try {
			PacienteDTO rPacienteDTO=  this.PacienteService.save(PacienteDTO);
			 
			if (rPacienteDTO==null) {
				return ResponseEntity.noContent().build();
			}
			return ResponseEntity.ok(
					Response
					.builder()
					.message(Message.builder().code(COD_MSG_EXITO).message(MSG_CONSULTA_EXITO).build())
					.data(rPacienteDTO)
					.build());
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return ResponseEntity.internalServerError().build();
		}
	}


}

package pe.edu.ucsur.java.ms.sc.alertas.msgestionemergencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.ucsur.java.ms.sc.alertas.msgestionemergencia.entity.PacienteEntity;


@Repository
public interface PacienteRepository extends JpaRepository<PacienteEntity, Long>{

}

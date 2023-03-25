package pe.edu.ucsur.java.ms.sc.alertas.msgestionemergencia.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.fasterxml.jackson.databind.json.JsonMapper;

@Configuration
public class GlobalConfigutation {

	public GlobalConfigutation() {
		
	}
	
	@Bean
	public JsonMapper getJsonMapper() {
		return new JsonMapper();
	}

}

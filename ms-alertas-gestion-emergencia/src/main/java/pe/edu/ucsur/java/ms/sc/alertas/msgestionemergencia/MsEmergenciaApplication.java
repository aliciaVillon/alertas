package pe.edu.ucsur.java.ms.sc.alertas.msgestionemergencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class MsEmergenciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsEmergenciaApplication.class, args);
	}

}

package tn.greentravel.tracking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TransportationServiceRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransportationServiceRegisterApplication.class, args);
	}

}

package com.reto.actuator;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@RestControllerEndpoint(id = "custom")
public class CustomActuator {
	
	@GetMapping("/prueba")
	public ResponseEntity<String> custom(){
		return new ResponseEntity<>("Esto es una prueba de Actuator", HttpStatus.OK);
	}

}

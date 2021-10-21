package com.reto.actuator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "endpoint")
public class CustomEndpoint {
	
	private List<String> lista = new ArrayList<>();

	@ReadOperation
	public List<String> endpoint(){
		return lista;
	}
	
	@WriteOperation
	public void writeOperation(@Selector String newEstado) {
		lista.add(newEstado);
	}
	
	@DeleteOperation
	public void deleteOperation(@Selector String deleteEstado) {
		lista.remove(deleteEstado);
	}
}

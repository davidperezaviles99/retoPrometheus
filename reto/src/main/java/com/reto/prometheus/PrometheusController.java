package com.reto.prometheus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
public class PrometheusController {

	private Counter counter;
	
	public PrometheusController(MeterRegistry registrar) {
		this.counter = Counter.builder("invocaciones.nombre").description("Numero de invocaciones").register(registrar);		
	}

	@GetMapping("/nombre")
	public String nombre() {
		counter.increment();
		return "Hola David. Bienvenido";
	}
}

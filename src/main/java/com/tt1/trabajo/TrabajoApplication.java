package com.tt1.trabajo;

import modelo.DatosSolicitud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import utilidades.ConsumidorMV;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@ComponentScan(basePackages = {"servicios", "com.tt1.trabajo"})
public class TrabajoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrabajoApplication.class, args);

		//System.out.println("Haciendo prueba de consumo de servicio con ID REAL...");
		//ConsumidorMV prueba = new ConsumidorMV();
		//Creo un mapa para simular los datos de mis universidad
		//Map<Integer, Integer> datosMapa = new HashMap<>();
		//Tiene un id tan alto ya que usé swagger para identificar que ids usaba la mv
		//datosMapa.put(1640289678, 100);
		//DatosSolicitud misDatos = new DatosSolicitud(datosMapa);
		//Mando los datos por mi clase consumidora
		//prueba.probarConexion(misDatos);
	}

}

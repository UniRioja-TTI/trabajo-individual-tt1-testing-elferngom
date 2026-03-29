package utilidades;

import modelo.DatosSolicitud;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.HashMap;
import java.util.Map;

public class ConsumidorMV {
    private final String URL = "http://localhost:8080/Solicitud/Solicitar?nombreUsuario=Estudiante";
    public void probarConexion(DatosSolicitud datos) {
        RestTemplate restTemplate = new RestTemplate();
        // Me daba error 415 (Unsupported Media Type)
        //Como ya me salió un error de que no se podia comunicar con json utilizaré httpheaders para evitarlo
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        // La MV me pedía por Swagger el nombreUsuario y la solicitud
        Map<String, Object> body = new HashMap<>();
        body.put("nombreUsuario", "Estudiante");
        // Meto los datos y las cabeceras en un paquete
        HttpEntity<Map<String, Object>> paquete = new HttpEntity<>(body, headers);

        System.out.println("Enviando petición con ID real de Swagger...");
        // POST: restTemplate.postForEntity(url, request, Clase.class).
        var respuesta = restTemplate.postForEntity(URL, paquete, String.class);

        if (respuesta==null||respuesta.equals("{}")) {
            System.out.println("La MV respondió con éxito (200 OK) pero el cuerpo está vacío {}");
        } else {
            System.out.println("Respuesta de la MV: " + respuesta);
        }
    }
}
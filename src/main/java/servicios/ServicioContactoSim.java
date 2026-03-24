package servicios;

import interfaces.InterfazContactoSim;
import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import modelo.Entidad;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Stream;

@Service
public class ServicioContactoSim implements InterfazContactoSim {

    private final Map<Integer, DatosSolicitud> almacenamientoProvisional = new HashMap<>();
    private final Random random = new Random();

    @Override
    public List<Entidad> getEntities() {
        return Stream.of("Universidad de Barcelona", "Universidad de la Rioja", "Universidad Complutense de Madrid")
                .map(nombre -> new Entidad(nombre))
                .toList();
    }

    @Override
    public boolean isValidEntityId() {
        return true;
    }

    @Override
    public int solicitarSimulation(DatosSolicitud ds) {
        int token = 1000 + random.nextInt(9000);
        almacenamientoProvisional.put(token, ds);
        return token;
    }

    @Override
    public DatosSimulation descargarDatos(int ticket) {
        return null;
    }
}
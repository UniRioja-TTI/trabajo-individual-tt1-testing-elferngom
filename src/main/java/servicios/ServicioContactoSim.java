package servicios;

import interfaces.InterfazContactoSim;
import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import modelo.Entidad;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ServicioContactoSim implements InterfazContactoSim {
    private final Map<Integer, DatosSolicitud> almacenamientoProvisional = new HashMap<>();
    private final Random random = new Random();
    @Override
    public List<Entidad> getEntities() {
        return new ArrayList<>();
    }
    @Override
    public boolean isValidEntityId() {
        return false;
    }
    @Override
    public int solicitarSimulation(DatosSolicitud ds) {
        return -1;
    }
    @Override
    public DatosSimulation descargarDatos(int ticket) {
        return null;
    }
}

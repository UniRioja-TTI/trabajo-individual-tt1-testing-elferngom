package servicios;

import modelo.DatosSolicitud;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ServicioContactoSimTest {
    ServicioContactoSim servicio = new ServicioContactoSim();

    @Test
    void testGetEntities() {
        var entidades = servicio.getEntities();
        assertNotNull(entidades);
        assertEquals(0, entidades.size());
    }

    @Test
    void testIsValidEntityId() {
        boolean resultado = servicio.isValidEntityId();
        assertFalse(resultado);
    }

    @Test
    void testSolicitarSimulation() {
        DatosSolicitud ds = new DatosSolicitud(new HashMap<>());
        int token = servicio.solicitarSimulation(ds);
        assertEquals(-1, token);
    }
    @Test
    void testDescargarDatos() {
        assertNull(servicio.descargarDatos(123));
    }
}
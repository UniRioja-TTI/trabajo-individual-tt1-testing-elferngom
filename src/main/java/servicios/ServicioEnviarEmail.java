package servicios;

import interfaces.InterfazEnviarEmails;
import modelo.Destinatario;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class ServicioEnviarEmail implements InterfazEnviarEmails {
    private final Logger logger;
    public ServicioEnviarEmail(Logger logger) {
        this.logger = logger;
    }
    @Override
    public boolean enviarEmail(Destinatario dest, String email) {
        logger.info("Simulando envío de email a {}: {}", dest, email);
        return true;
    }
}

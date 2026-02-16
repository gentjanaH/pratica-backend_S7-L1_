package gentjanahani.u2w3d1.exceptions;

import java.util.UUID;

public class NotFoundException extends RuntimeException {
    public NotFoundException(UUID id) {
        super("Nessun elemento trovato con id: " + id);
    }
}

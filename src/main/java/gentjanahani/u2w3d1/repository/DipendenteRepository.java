package gentjanahani.u2w3d1.repository;

import gentjanahani.u2w3d1.entities.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface DipendenteRepository extends JpaRepository<Dipendente, UUID> {

    Optional<Dipendente> findByEmail(String email);

    Optional<Dipendente> findByUsername(String username);

    Dipendente findByIdDipendente(UUID iaDipendente);
}

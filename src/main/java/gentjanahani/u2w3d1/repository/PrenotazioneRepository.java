package gentjanahani.u2w3d1.repository;

import gentjanahani.u2w3d1.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.UUID;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, UUID> {

    Prenotazione findByIdPrenotazione(UUID idPrenotazione);

    boolean existsByDipendente_idDipendenteAndViaggio_idViaggio(UUID idDipendente, UUID idViaggio);

    boolean existsByDipendente_idDipendenteAndDataRichiesta(UUID idDipendente, LocalDate dataRichiesta);
}

package gentjanahani.u2w3d1.controllers;

import gentjanahani.u2w3d1.entities.Prenotazione;
import gentjanahani.u2w3d1.payloads.DipendenteDTO;
import gentjanahani.u2w3d1.payloads.LoginDTO;
import gentjanahani.u2w3d1.payloads.LoginResponseDTO;
import gentjanahani.u2w3d1.payloads.PrenotazioneDTO;
import gentjanahani.u2w3d1.services.AuthorizationService;
import gentjanahani.u2w3d1.services.DipendenteService;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AthorizationController {

    private final DipendenteService dipendenteService;
private final AuthorizationService authorizationService;

    public AthorizationController(DipendenteService dipendenteService, AuthorizationService authorizationService) {
        this.dipendenteService = dipendenteService;
        this.authorizationService = authorizationService;
    }

    // http://localhost:3026/auth/login
    @PostMapping("/login")
    public LoginResponseDTO login(@RequestBody LoginDTO bodyLogin){
        return new LoginResponseDTO(this.authorizationService.checkAndGenerate(bodyLogin));
    }

    // http://localhost:3026/auth/reserve
//    @PostMapping("/reserve")
//    public Prenotazione signin(@RequestBody @Validated PrenotazioneDTO payload, BindingResult validationResult){
//
//    }
}

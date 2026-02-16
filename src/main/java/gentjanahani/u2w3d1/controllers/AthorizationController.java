package gentjanahani.u2w3d1.controllers;
import gentjanahani.u2w3d1.entities.Dipendente;
import gentjanahani.u2w3d1.payloads.DipendenteDTO;
import gentjanahani.u2w3d1.payloads.LoginDTO;
import gentjanahani.u2w3d1.payloads.LoginResponseDTO;
import gentjanahani.u2w3d1.payloads.UpdateDipendenteDTO;
import gentjanahani.u2w3d1.services.AuthorizationService;
import gentjanahani.u2w3d1.services.DipendenteService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

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



}

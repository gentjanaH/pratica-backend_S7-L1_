package gentjanahani.u2w3d1.security;


import gentjanahani.u2w3d1.entities.Dipendente;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class CreateAndVerify {
    @Value("${jwt.secret}")//dopo aver salvato il segreto nel'env.properties e averlo richiamato nel application.properties,
    private String secret;// lo salvo in una variabile così da poterlo usare quando mi serve

    public String generateToken(Dipendente dipendente){
        return Jwts.builder()
                .issuedAt(new Date(System.currentTimeMillis()))//data di emissione in millisecondi
                .expiration(new Date(System.currentTimeMillis()+ 1000 * 60 * 60 * 24 * 7))//data di scadenza
                .subject(String.valueOf(dipendente.getIdDipendente()))
    }
}

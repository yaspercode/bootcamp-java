package academy.atl.newsletter.controllers;

import academy.atl.newsletter.models.Lead;
import academy.atl.newsletter.repository.EmailRepository;
import academy.atl.newsletter.validators.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewslettersController {

    @Autowired
    private EmailRepository repositorioDeEmail;


    @PostMapping("/api/newsletter")
    public String registrar(@RequestBody Lead lead){
        String email = lead.getEmail();
        EmailValidator emailValidator = new EmailValidator();
        if(emailValidator.esValido(email) == false){
            return "El email no es valido";
        }
        repositorioDeEmail.guardarEmail(email);
        return "Email guardado";
    }

    @PostMapping("/api/newsletter/unsuscribe")
    public String eliminar(@RequestBody Lead lead){
        String email = lead.getEmail();
        repositorioDeEmail.eliminarEmail(email);
        return "Email borrado";
    }

    @GetMapping("/api/newsletter")
    public List<Lead> listarEmail(Lead lead){
        List<Lead> emails = repositorioDeEmail.listadoDeEmail();
        return emails;
    }
}

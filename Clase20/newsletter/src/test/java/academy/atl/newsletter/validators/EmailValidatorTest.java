package academy.atl.newsletter.validators;

import org.junit.Assert;
import org.junit.Test;

public class EmailValidatorTest {
    @Test
    public void elEmailTieneArroba(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("sdsgamil.com");
        Assert.assertFalse(resultado);
    }
    @Test
    public void queElArrobaNoSeaLaUltimaLetra(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("lucas.smoy@");
        Assert.assertFalse(resultado);
    }
    @Test
    public void queNoTengaEspacios(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("lucas moy@gmail.com");
        Assert.assertFalse(resultado);
    }
}

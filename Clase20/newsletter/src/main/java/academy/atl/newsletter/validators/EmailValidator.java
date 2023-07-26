package academy.atl.newsletter.validators;

public class EmailValidator {
    public boolean esValido(String email){
        //comprobar que el email tenga un arroba
        if(!email.contains("@")){
            return false;
        }
        if(!email.contains(".")){
            return false;
        }
        if(email.endsWith("@")){
            return false;
        }
        if(email.contains(" ")){
            return false;
        }
        if(email.length() > 255){
            return false;
        }
        return true;
    }
}

package academy.atl.bootcamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class PeopleManager {
    String[] fullName = {"miguel", "luisa", "carlos", "maría","laura","camila"};
    List<String> fullNamePerson = new ArrayList<>(Arrays.asList("miguel", "luisa", "carlos", "maría","laura","camila"));
    @GetMapping("/busqueda-personas/{search}")
    public String findByName (@PathVariable String search){
        String mensaje = "";
        for(String name: fullName){
            if(name.equalsIgnoreCase(search)){
                mensaje = "Si esta en la lista";
                break;
            }else
                mensaje = "Persona no encontrada";
        }
        return mensaje;
    }

    @GetMapping("/agregar-nombre/{agregar}")
    //Agregar personas
    public String[]  agregarPersona (@PathVariable String agregar){
        String[] newFullName = new String[fullName.length+1];
        int contador = 0;
        for(String nombre: fullName){
            newFullName[contador] = fullName [contador];
            contador++;
        }
        newFullName[contador] = agregar;
        return newFullName;
    }

    @GetMapping("/eliminar-nombre/{eliminar}")
    public List<String> eliminarPersonas(@PathVariable String eliminar) {
        fullNamePerson.removeIf(nombre -> nombre.equalsIgnoreCase(eliminar));
        return fullNamePerson;
    }

}

package academy.atl.bootcamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BusquedaController {
    @GetMapping("/busqueda-usuario/{busqueda}")
    public String[] obtenerPalabrasAutocompletar(@PathVariable String busqueda){

        String[] fraseTipicaDeBusqueda = {"bootcamp java","java backend","curso de java gratis"};

        String[] resultadoDeLaBusqueda = new String[10];
        int contador = 0;
        for (String frase : fraseTipicaDeBusqueda){
            //Encuentra si concide las palabras
            if(frase.contains(busqueda)){
                resultadoDeLaBusqueda[contador] = frase;
                contador++;
            }

        }
        return resultadoDeLaBusqueda;
    }

}

package academy.atl.bootcamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {
    @GetMapping("/generar-password")
    public String primeraPrueba() {
        String[] almacenarCaracter = new String[6];
        generateRamdonCharacters(almacenarCaracter);
        String password = generatePassword(almacenarCaracter);
        return password;
    }

    private static String generatePassword(String[] almacenarCaracter) {
        double aleatorio = Math.random() * 1000000;
        long numeroAleatorio = Math.round(aleatorio);
        String cadena = "";
        for(int i = 0; i < almacenarCaracter.length; i++){
            cadena += almacenarCaracter[i];
        }
        String password = cadena + numeroAleatorio;
        return password;
    }

    private static void generateRamdonCharacters(String[] almacenarCaracter) {
        String caracter = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < almacenarCaracter.length; i++){
            int numeroAleatorio = (int) (Math.random() * 52);
            String tomarCaracter = Character.toString(caracter.charAt(numeroAleatorio));
            almacenarCaracter[i] = tomarCaracter;
        }
    }
}

public class GeneratePassword {
    public static void main(String[] args) {
        String[] almacenarCaracter = new String[6];
        generateRamdonCharacters(almacenarCaracter);
        String password = generatePassword(almacenarCaracter);
        System.out.println(password);
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

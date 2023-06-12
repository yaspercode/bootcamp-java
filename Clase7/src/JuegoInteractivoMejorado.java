import java.util.Scanner;

public class JuegoInteractivoMejorado {
    private static final String[] CUENTO = new String[4];
    private static int  opcion;
    private static int  muerte = 0;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Realizar este ejercicio con arreglos

        //Hasta que este muerto el personaje o continue ..
        do{
            mostratTexto();

            switch (opcion){
                case 1:
                    mostratCamino1();
                    break;
                case 2:
                    mostratCamino2();
                    break;
                case 3:
                    mostratCamino3();
                    break;
            }

        }while (muerte < 1);
    }
    public static void mostratTexto(){
        CUENTO[0] = "El Sol de la mañana se alza sobre el horizonte mientras te preparas para\n" +
                "el evento más esperado del año: los Juegos de la Supervivencia. Eres un valiente tributo\n" +
                "de tu distrito y te encuentras rodeado de otros competidores ansiosos. El Capitolio observa\n" +
                "con expectación desde las pantallas.";
        CUENTO[1] = "1. Decides mostrar tu fuerza: te lanzas hacia el centro del campo de batalla en busca de armas y suministros.";
        CUENTO[2] = "2. Prefieres mantener un perfil bajo: corres hacia el bosque en busca de refugio y recursos naturales.";
        CUENTO[3] = "3. Decides unirte a un grupo: te acercas a otros tributos y forman una alianza para enfrentar los desafíos juntos.";
        mostrarCuento();
        ingreseOpcion();
    }
    public static void mostratCamino1(){
        CUENTO[0] = "Con determinación, te lanzas hacia el centro del campo de batalla, donde\n" +
                "se encuentran los suministros. Rápidamente, te abalanzas sobre una mochila y consigues\n" +
                "un arco y flechas. Pero antes de que puedas alejarte, otro tributo se acerca a atacarte.";
        CUENTO[1] = "1. Utilizas tu arco para defenderte y eliminar al tributo antes de que te ataque.";
        CUENTO[2] = "2. Decides entregar el arco y las flechas al tributo como una muestra de paz y colaboración.";
        CUENTO[3] = "3. Huyes rápidamente sin enfrentarte al tributo y te refugias en los árboles cercanos.";
        mostrarCuento();
        ingreseOpcion();
        finalHistoria();
    }
    public static void mostratCamino2(){
        CUENTO[0] = "Prefiriendo mantener un perfil bajo, corres hacia el bosque en busca de\n" +
                "refugio y recursos naturales. Después de un tiempo, encuentras un arroyo y decides\n" +
                "seguirlo para buscar agua y comida. Sin embargo, te encuentras con una trampa oculta.";
        CUENTO[1] = "1. Logras evadir la trampa y continúas tu camino con precaución.";
        CUENTO[2] = "2. Caes en la trampa, pero logras liberarte y sigues adelante con más cuidado.";
        CUENTO[3] = "3. Quedas atrapado en la trampa y te enfrentas a la amenaza que se acerca.";
        mostrarCuento();
        ingreseOpcion();
        finalHistoria();
    }
    public static void mostratCamino3(){
        CUENTO[0] = "Decides unirte a un grupo de tributos que también buscan sobrevivir.\n" +
                "Juntos, forman una alianza estratégica y se adentran en el campo de batalla. Después \n" +
                "de un tiempo, encuentran un río y necesitan cruzarlo.";
        CUENTO[1] = "1. Deciden nadar hasta la otra orilla.";
        CUENTO[2] = "2. Buscan un puente cercano para cruzar con seguridad.";
        CUENTO[3] = "3. Intentan construir una balsa improvisada para cruz";
        mostrarCuento();
        ingreseOpcion();
        finalHistoria();
    }
    public static void mostrarCuento(){
        for (int contador = 0; contador < CUENTO.length; contador++){
            System.out.println(CUENTO[contador]);
        }
    }
    public static void ingreseOpcion(){
        System.out.print("Ingrese su opción: ");
        opcion = scanner.nextInt();
    }
    public static void finalHistoria(){
        System.out.print("Continuara ..");
        muerte++;
    }
}

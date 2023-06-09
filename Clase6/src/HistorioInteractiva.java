import java.util.Scanner;

public class HistorioInteractiva {
    public static void main(String[] args) {
        //prompt: Genérame una historia interactiva al estilo juegos del hambre, en la que yo tenga que elegir por opciones 1 , 2 y 3
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.print("------- Historia: los juegos de supervivencia------");
        System.out.println("\nEl Sol de la mañana se alza sobre el horizonte mientras te preparas para" +
                "\n el evento más esperado del año: los Juegos de la Supervivencia. Eres un valiente tributo " +
                "\nde tu distrito y te encuentras rodeado de otros competidores ansiosos. El Capitolio observa" +
                "\n con expectación desde las pantallas.");

        System.out.println("**** Opciones **** " +
                "\n1. Decides mostrar tu fuerza: te lanzas hacia el centro del campo de batalla en busca de armas y suministros. " +
                "\n2. Prefieres mantener un perfil bajo: corres hacia el bosque en busca de refugio y recursos naturales. " +
                "\n3. Decides unirte a un grupo: te acercas a otros tributos y forman una alianza para enfrentar los desafíos juntos.");
        System.out.print("Ingrese la opción: ");
        opcion= scanner.nextInt();

        if(opcion == 1) {
            System.out.println("\nCon determinación, te lanzas hacia el centro del campo de batalla, donde " +
                    "\nse encuentran los suministros. Rápidamente, te abalanzas sobre una mochila y consigues " +
                    "\nun arco y flechas. Pero antes de que puedas alejarte, otro tributo se acerca a atacarte.");
            System.out.println("**** Opciones **** " +
                    "\n1. Utilizas tu arco para defenderte y eliminar al tributo antes de que te ataque. " +
                    "\n2. Decides entregar el arco y las flechas al tributo como una muestra de paz y colaboración." +
                    "\n3. Huyes rápidamente sin enfrentarte al tributo y te refugias en los árboles cercanos.");
            System.out.print("Ingrese la opción: ");
            opcion= scanner.nextInt();
            System.out.println("Continuara ...");
        }
        if(opcion == 2){
            System.out.println("\nPrefiriendo mantener un perfil bajo, corres hacia el bosque en busca de " +
                    "\nrefugio y recursos naturales. Después de un tiempo, encuentras un arroyo y decides " +
                    "\nseguirlo para buscar agua y comida. Sin embargo, te encuentras con una trampa oculta.");
            System.out.println("**** Opciones **** " +
                    "\n1. Logras evadir la trampa y continúas tu camino con precaución. " +
                    "\n2. Caes en la trampa, pero logras liberarte y sigues adelante con más cuidado. " +
                    "\n3. Quedas atrapado en la trampa y te enfrentas a la amenaza que se acerca.");
            System.out.print("Ingrese la opción: ");
            opcion= scanner.nextInt();
            System.out.println("Continuara ...");
        }
        if(opcion == 3){
            System.out.println("\nDecides unirte a un grupo de tributos que también buscan sobrevivir. " +
                    "\nJuntos, forman una alianza estratégica y se adentran en el campo de batalla. Después " +
                    "\nde un tiempo, encuentran un río y necesitan cruzarlo.");
            System.out.println("**** Opciones ****" +
                    "\n1. Deciden nadar hasta la otra orilla." +
                    "\n2. Buscan un puente cercano para cruzar con seguridad." +
                    "\n3. Intentan construir una balsa improvisada para cruz");
            System.out.print("Ingrese la opción: ");
            opcion= scanner.nextInt();
            System.out.println("Continuara ...");
        }

    }
}

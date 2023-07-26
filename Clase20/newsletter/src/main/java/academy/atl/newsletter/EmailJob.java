package academy.atl.newsletter;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

//Ejcutar funciones de noche
@EnableScheduling
public class EmailJob {
    //Establecer una cron
    @Scheduled(cron = "0 0 3 * * 1")
    public void generarBackupDeLaBaseDeDatos(){
    }
}

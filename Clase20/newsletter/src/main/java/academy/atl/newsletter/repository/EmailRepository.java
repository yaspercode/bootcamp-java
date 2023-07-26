package academy.atl.newsletter.repository;

import academy.atl.newsletter.models.Lead;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public class EmailRepository {
    @PersistenceContext
    EntityManager baseDeDatos;
    @Transactional
    public void guardarEmail(String emailUser){
        //Evitar poner comillas simples en los parametros
        String consultaSql = "INSERT INTO `Lead` (email) VALUES (:paramEmail)";
        //Evitar el hacking de inyección de sql
        baseDeDatos.createNativeQuery(consultaSql)
                .setParameter("paramEmail",emailUser)
                .executeUpdate();
    }
    @Transactional
    public void eliminarEmail(String emailUser) {
        String consultaSql = "DELETE FROM Lead WHERE email = :paramEmail";
        baseDeDatos.createQuery(consultaSql)
                .setParameter("paramEmail",emailUser)
                .executeUpdate();
    }

    @Transactional
    public List<Lead> listadoDeEmail() {
        String consultaHql = "FROM Lead";
        List<Lead> correos = baseDeDatos.createQuery(consultaHql, Lead.class)
                .getResultList();
        return correos;
    }
}

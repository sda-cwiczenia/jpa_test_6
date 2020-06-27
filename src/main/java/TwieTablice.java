import model.Person;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class TwieTablice {
    public static void main(String[] args) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("myDatabase2").createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.merge(new Person("Jan","Nowak", 4000, "Bydgoszcz", "Kwiatowa 5", "85-100"));
        entityManager.getTransaction().commit();
    }
}

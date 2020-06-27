import model.Adres2;
import model.Osoba2;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class JednaTablicaDwieKlasy {
    public static void main(String[] args) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("myDatabase2").createEntityManager();

        Adres2 adres = new Adres2("Bydgoszcz", "Polna 2", "85-100");
        Osoba2 osoba = new Osoba2("Piotr", "Nowaczyk", 4000, adres);

        entityManager.getTransaction().begin();
        entityManager.merge(osoba);
        entityManager.getTransaction().commit();
    }
}

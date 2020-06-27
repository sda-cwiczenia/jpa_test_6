import model.Produkt;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("myDatabase").createEntityManager();

        Produkt produkt1 = new Produkt();
        produkt1.setNazwa("Buty");
        produkt1.setCena(200);


        System.out.println(produkt1);

        Produkt produkt3;

        Produkt produkt2 = new Produkt("Spodnie", 150);

        Produkt produkt4 = new Produkt("Spodnie", 100);

        entityManager.getTransaction().begin();
        produkt3 = entityManager.merge(produkt1);
        System.out.println(produkt1);
        System.out.println(produkt3);
        entityManager.persist(produkt2);
        produkt2.setCena(100);
        entityManager.remove(produkt2);
        entityManager.getTransaction().commit();

//        produkt2.setNazwa("Czapka");
//        produkt2.setCena(40);
//
//        entityManager.getTransaction().begin();
//        entityManager.merge(produkt2);
//        entityManager.getTransaction().commit();


    }
}

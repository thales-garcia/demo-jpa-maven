package application;

import domain.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(null, "Thales Garcia", "thales@gmail.com");  //database will define the id
        Pessoa p2 = new Pessoa(null, "Roger Souza", "roger@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); //same name in persistence.xml (persistence unit)
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p1); //save the object (p1) in database
        em.persist(p2); //save the object (p2) in database
        em.getTransaction().commit();
        System.out.println("Done!");

    }

}

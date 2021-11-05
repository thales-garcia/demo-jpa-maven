package application;

import domain.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); //same name in persistence.xml (persistence unit)
        EntityManager em = emf.createEntityManager();

        Pessoa p = em.find(Pessoa.class, 2);  //Search the Pessoa with ID=2

        System.out.println(p);

        System.out.println("Done!");

        em.close();
        emf.close();

    }

}

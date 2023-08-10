import Util.Hibernate;
import entity.Pessoa;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Elisa", "Santos", "elisaa.santos.santos.teixeira");
        Pessoa p2 = new Pessoa("Sarah", "Sabongi", "sarahsabongi92@gmail.com");
        Pessoa p3 = new Pessoa ("Débora", "Sabongi", "deborasabongi92@gmail.com");
        Pessoa p4 = new Pessoa ("Emanuel", "Aguilar", "emaunuelaguilar@gmail.com");

        Session session = Hibernate.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(p1);
        session.persist(p2);
        session.persist(p3);
        session.persist(p4);

        transaction.commit();

        List<Pessoa> pessoas = session.createQuery("from Pessoa", Pessoa.class).list();

        pessoas.forEach(p -> System.out.println(p.toString()));

       // for (Pessoa p: pessoas){
            //System.out.println(p.toString());
        //}

    }
}

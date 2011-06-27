package demo;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //Logger.getLogger(App.class).debug("test debug message");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
        
    }
}

package hello;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestGreeter {



   private Greeter g = new Greeter();


   @Test

   public void testGreeterEmpty()

   {

      assertEquals(g.getName(),"");

      assertEquals(g.sayHello(),"Bark!");

   }



   @Test

   public void testGreeter()

   {

      g.setName("World");

      assertEquals(g.getName(),"World");

      assertEquals(g.sayHello(),"Hello World!");

   }

   @Test
    public void passTestCVGreeterPass()
    {

       g.setName("Dave");

       assertEquals(g.getName(),"Dave");

       assertEquals(g.sayHello(),"Hello World!");

    }

}

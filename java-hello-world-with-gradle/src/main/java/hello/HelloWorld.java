package hello;

import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args)  {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);
    
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
  public void testCrypto () throws NoSuchAlgorithmException {
        //test non compliant code for vulnerability
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        keyPairGen.initialize(512); // Noncompliant
  }
}

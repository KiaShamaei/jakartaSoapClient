package ir.digixo;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws MalformedURLException {
        HelloWorldImplService helloWorldImplService=new HelloWorldImplService(new URL("http://localhost:8080/hello?wsdl"));
        HelloWorld helloWorldImplPort = helloWorldImplService.getHelloWorldImplPort();

        Human mahsa=new Human();
        mahsa.setId(12l);
        mahsa.setName("mahsa");

        GetHuman getHuman = new GetHuman();
        GetHumanResponse response = helloWorldImplPort.getHuman(getHuman, mahsa);


        System.out.println(response.getReturn().getId());
        System.out.println(response.getReturn().getName());

    }
}

package ir.digixo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.3
 * 2023-10-09T17:44:53.660+03:30
 * Generated source version: 4.0.3
 *
 */
@WebServiceClient(name = "HelloWorldImplService",
                  wsdlLocation = "http://localhost:8080/hello?wsdl",
                  targetNamespace = "http://digixo.ir/")
public class HelloWorldImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://digixo.ir/", "HelloWorldImplService");
    public final static QName HelloWorldImplPort = new QName("http://digixo.ir/", "HelloWorldImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/hello?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloWorldImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/hello?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloWorldImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloWorldImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorldImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public HelloWorldImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public HelloWorldImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public HelloWorldImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns HelloWorld
     */
    @WebEndpoint(name = "HelloWorldImplPort")
    public HelloWorld getHelloWorldImplPort() {
        return super.getPort(HelloWorldImplPort, HelloWorld.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWorld
     */
    @WebEndpoint(name = "HelloWorldImplPort")
    public HelloWorld getHelloWorldImplPort(WebServiceFeature... features) {
        return super.getPort(HelloWorldImplPort, HelloWorld.class, features);
    }

}

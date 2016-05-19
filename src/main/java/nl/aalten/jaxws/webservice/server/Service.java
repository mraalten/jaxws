package nl.aalten.jaxws.webservice.server;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://nl.aalten.jaxws.webservice/wsdl")
public interface Service {

    String sayHi(@WebParam(name="text") String text);
}

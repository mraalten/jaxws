package nl.aalten.jaxws.webservice.server;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(
        portName = "ServiceImplPort",
        serviceName = "ServiceImplService",
        targetNamespace = "http://nl.aalten.jaxws.webservice/wsdl",
        endpointInterface = "nl.aalten.jaxws.webservice.server.Service")
public class ServiceImpl implements Service {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

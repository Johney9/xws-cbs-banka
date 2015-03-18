
package rs.ac.uns.ftn.xws.cbs.banka;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.6.5
 * 2015-03-09T05:21:54.680+01:00
 * Generated source version: 2.6.5
 * 
 */
 
public class BankaPort_BankaPort_Server{

    protected BankaPort_BankaPort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new BankaPortImpl();
        String address = "http://localhost:8080/banka";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new BankaPort_BankaPort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
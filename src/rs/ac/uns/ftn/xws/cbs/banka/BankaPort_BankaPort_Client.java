
package rs.ac.uns.ftn.xws.cbs.banka;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.5
 * 2015-03-09T05:21:54.608+01:00
 * Generated source version: 2.6.5
 * 
 */
public final class BankaPort_BankaPort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.ftn.uns.ac.rs/xws/cbs/banka", "BankaService");

    private BankaPort_BankaPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = BankaService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        BankaService ss = new BankaService(wsdlURL, SERVICE_NAME);
        BankaPort port = ss.getBankaPort();  
        
        {
        System.out.println("Invoking posaljiIzvod...");
        rs.ac.uns.ftn.xws.cbs.zahtev_za_izvod.ZahtevZaIzvod _posaljiIzvod_zahtev = null;
        rs.ac.uns.ftn.xws.cbs.izvod.Izvod _posaljiIzvod__return = port.posaljiIzvod(_posaljiIzvod_zahtev);
        System.out.println("posaljiIzvod.result=" + _posaljiIzvod__return);


        }
        {
        System.out.println("Invoking primiMT103...");
        rs.ac.uns.ftn.xws.cbs.mt103.Mt103 _primiMT103_mt103 = null;
        port.primiMT103(_primiMT103_mt103);


        }
        {
        System.out.println("Invoking primiMT910...");
        rs.ac.uns.ftn.xws.cbs.mt910.Mt910 _primiMT910_mt910 = null;
        port.primiMT910(_primiMT910_mt910);


        }
        {
        System.out.println("Invoking primiNalog...");
        rs.ac.uns.ftn.xws.cbs.nalog_za_placanje.NalogZaPlacanje _primiNalog_nalog = null;
        port.primiNalog(_primiNalog_nalog);


        }
        {
        System.out.println("Invoking primiMT102...");
        rs.ac.uns.ftn.xws.cbs.mt102.Mt102 _primiMT102_mt102 = null;
        port.primiMT102(_primiMT102_mt102);


        }
        {
        System.out.println("Invoking primiMT900...");
        rs.ac.uns.ftn.xws.cbs.mt900.Mt900 _primiMT900_mt900 = null;
        port.primiMT900(_primiMT900_mt900);


        }

        System.exit(0);
    }

}

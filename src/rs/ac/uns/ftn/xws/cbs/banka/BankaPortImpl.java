
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package rs.ac.uns.ftn.xws.cbs.banka;

import java.util.logging.Logger;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.5
 * 2015-03-09T05:21:54.656+01:00
 * Generated source version: 2.6.5
 * 
 */

@javax.jws.WebService(
                      serviceName = "BankaService",
                      portName = "BankaPort",
                      targetNamespace = "http://www.ftn.uns.ac.rs/xws/cbs/banka",
                      wsdlLocation = "file:/C:/Users/Nikola/Desktop/Fax/4 godina/2 semestar/xws/workspace/xws-cbs-banka/../xws-model/xml/wsdl/Banka.wsdl",
                      endpointInterface = "rs.ac.uns.ftn.xws.cbs.banka.BankaPort")
                      
public class BankaPortImpl implements BankaPort {

    private static final Logger LOG = Logger.getLogger(BankaPortImpl.class.getName());

    /* (non-Javadoc)
     * @see rs.ac.uns.ftn.xws.cbs.banka.BankaPort#posaljiIzvod(rs.ac.uns.ftn.xws.cbs.zahtev_za_izvod.ZahtevZaIzvod  zahtev )*
     */
    public rs.ac.uns.ftn.xws.cbs.izvod.Izvod posaljiIzvod(rs.ac.uns.ftn.xws.cbs.zahtev_za_izvod.ZahtevZaIzvod zahtev) { 
        LOG.info("Executing operation posaljiIzvod");
        System.out.println(zahtev);
        try {
            rs.ac.uns.ftn.xws.cbs.izvod.Izvod _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see rs.ac.uns.ftn.xws.cbs.banka.BankaPort#primiMT103(rs.ac.uns.ftn.xws.cbs.mt103.Mt103  mt103 )*
     */
    public void primiMT103(rs.ac.uns.ftn.xws.cbs.mt103.Mt103 mt103) { 
        LOG.info("Executing operation primiMT103");
        System.out.println(mt103);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see rs.ac.uns.ftn.xws.cbs.banka.BankaPort#primiMT910(rs.ac.uns.ftn.xws.cbs.mt910.Mt910  mt910 )*
     */
    public void primiMT910(rs.ac.uns.ftn.xws.cbs.mt910.Mt910 mt910) { 
        LOG.info("Executing operation primiMT910");
        System.out.println(mt910);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see rs.ac.uns.ftn.xws.cbs.banka.BankaPort#primiNalog(rs.ac.uns.ftn.xws.cbs.nalog_za_placanje.NalogZaPlacanje  nalog )*
     */
    public void primiNalog(rs.ac.uns.ftn.xws.cbs.nalog_za_placanje.NalogZaPlacanje nalog) { 
        LOG.info("Executing operation primiNalog");
        System.out.println(nalog);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see rs.ac.uns.ftn.xws.cbs.banka.BankaPort#primiMT102(rs.ac.uns.ftn.xws.cbs.mt102.Mt102  mt102 )*
     */
    public void primiMT102(rs.ac.uns.ftn.xws.cbs.mt102.Mt102 mt102) { 
        LOG.info("Executing operation primiMT102");
        System.out.println(mt102);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see rs.ac.uns.ftn.xws.cbs.banka.BankaPort#primiMT900(rs.ac.uns.ftn.xws.cbs.mt900.Mt900  mt900 )*
     */
    public void primiMT900(rs.ac.uns.ftn.xws.cbs.mt900.Mt900 mt900) { 
        LOG.info("Executing operation primiMT900");
        System.out.println(mt900);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
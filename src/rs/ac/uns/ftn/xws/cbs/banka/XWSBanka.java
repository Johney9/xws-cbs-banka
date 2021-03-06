package rs.ac.uns.ftn.xws.cbs.banka;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.5
 * 2015-06-23T17:53:36.380+02:00
 * Generated source version: 2.6.5
 * 
 */
@WebService(targetNamespace = "http://www.ftn.uns.ac.rs/xws/cbs/banka", name = "XWSBanka")
@XmlSeeAlso({rs.ac.uns.ftn.xws.cbs.mt103.ObjectFactory.class, rs.ac.uns.ftn.xws.cbs.zahtev_za_izvod.ObjectFactory.class, rs.ac.uns.ftn.xws.cbs.nalog_za_placanje.ObjectFactory.class, rs.ac.uns.ftn.xws.cbs.mt910.ObjectFactory.class, rs.ac.uns.ftn.xws.cbs.izvod.ObjectFactory.class, rs.ac.uns.ftn.xws.cbs.mt102.ObjectFactory.class, rs.ac.uns.ftn.xws.cbs.mt900.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface XWSBanka {

    @WebResult(name = "izvod", targetNamespace = "http://www.ftn.uns.ac.rs/xws/cbs/izvod", partName = "izvod")
    @WebMethod
    public rs.ac.uns.ftn.xws.cbs.izvod.Izvod posaljiIzvod(
        @WebParam(partName = "zahtev", name = "zahtev_za_izvod", targetNamespace = "http://www.ftn.uns.ac.rs/xws/cbs/zahtev_za_izvod")
        rs.ac.uns.ftn.xws.cbs.zahtev_za_izvod.ZahtevZaIzvod zahtev
    );

    @Oneway
    @WebMethod
    public void primiMT103(
        @WebParam(partName = "mt103", name = "mt103", targetNamespace = "http://www.ftn.uns.ac.rs/xws/cbs/mt103")
        rs.ac.uns.ftn.xws.cbs.mt103.Mt103 mt103
    );

    @Oneway
    @WebMethod
    public void primiMT910(
        @WebParam(partName = "mt910", name = "mt910", targetNamespace = "http://www.ftn.uns.ac.rs/xws/cbs/mt910")
        rs.ac.uns.ftn.xws.cbs.mt910.Mt910 mt910
    );

    @Oneway
    @WebMethod
    public void primiNalog(
        @WebParam(partName = "nalog", name = "nalog_za_placanje", targetNamespace = "http://www.ftn.uns.ac.rs/xws/cbs/nalog_za_placanje")
        rs.ac.uns.ftn.xws.cbs.nalog_za_placanje.NalogZaPlacanje nalog
    );

    @Oneway
    @WebMethod
    public void primiMT102(
        @WebParam(partName = "mt102", name = "mt102", targetNamespace = "http://www.ftn.uns.ac.rs/xws/cbs/mt102")
        rs.ac.uns.ftn.xws.cbs.mt102.Mt102 mt102
    );

    @Oneway
    @WebMethod
    public void primiMT900(
        @WebParam(partName = "mt900", name = "mt900", targetNamespace = "http://www.ftn.uns.ac.rs/xws/cbs/mt900")
        rs.ac.uns.ftn.xws.cbs.mt900.Mt900 mt900
    );
}

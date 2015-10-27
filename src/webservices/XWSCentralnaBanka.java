package webservices;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.5
 * 2015-06-23T18:00:54.318+02:00
 * Generated source version: 2.6.5
 * 
 */
@WebService(targetNamespace = "http://www.ftn.uns.ac.rs/xws/cbs/centralna_banka", name = "XWSCentralnaBanka")
@XmlSeeAlso({rs.ac.uns.ftn.xws.cbs.mt103.ObjectFactory.class, rs.ac.uns.ftn.xws.cbs.mt910.ObjectFactory.class, rs.ac.uns.ftn.xws.cbs.mt102.ObjectFactory.class, rs.ac.uns.ftn.xws.cbs.mt900.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface XWSCentralnaBanka {

    @Oneway
    @WebMethod
    public void primiMT102(
        @WebParam(partName = "mt102", name = "mt102", targetNamespace = "http://www.ftn.uns.ac.rs/xws/cbs/mt102")
        rs.ac.uns.ftn.xws.cbs.mt102.Mt102 mt102
    );

    @Oneway
    @WebMethod
    public void primiMT103(
        @WebParam(partName = "mt103", name = "mt103", targetNamespace = "http://www.ftn.uns.ac.rs/xws/cbs/mt103")
        rs.ac.uns.ftn.xws.cbs.mt103.Mt103 mt103
    );
}

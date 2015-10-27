package delegators;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import rs.ac.uns.ftn.xws.cbs.banka_app_mapper.BankaAppMapper;
import rs.ac.uns.ftn.xws.cbs.mt102.Mt102;
import rs.ac.uns.ftn.xws.cbs.mt103.Mt103;
import webservices.XWSCentralnaBanka;
import builders.XWSCentralBankWebServiceBuilder;
import facades.DatabaseFacade;


public class CentralBankDelegator {
	private static DatabaseFacade dbFacade = new DatabaseFacade();
	private static XWSCentralnaBanka centralnaBanka=null;
	private static final String CENTRAL_BANK_SWIFT = "NBSXRS01";
	
	public static void sendMt102(Mt102 mt102) throws JAXBException, IOException, Exception {
		
		buildCentralnaBanka();
		centralnaBanka.primiMT102(mt102);
	}
	
	public static void sendMt103(Mt103 mt103) throws JAXBException, IOException, Exception {
		
		buildCentralnaBanka();
		centralnaBanka.primiMT103(mt103);
	}
	
	private static void buildCentralnaBanka() throws JAXBException, IOException, Exception {
		if(centralnaBanka==null) {
			BankaAppMapper bam = new BankaAppMapper();
			bam=dbFacade.readFromDatabase(bam, CENTRAL_BANK_SWIFT);
			
			XWSCentralBankWebServiceBuilder cbwsb = new XWSCentralBankWebServiceBuilder();
			centralnaBanka = cbwsb.buildPort(bam.getNazivAplikacije(),bam.getIpAddress());
		}
	}
}

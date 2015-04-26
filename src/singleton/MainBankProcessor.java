package singleton;

import java.io.IOException;
import java.util.Properties;

import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;

import processing.DataProcessing;
import processing.XWSDataProcessor;
import processing.states.BankState;
import processing.states.ProcessingState;
import rs.ac.uns.ftn.xws.cbs.izvod.Izvod;
import rs.ac.uns.ftn.xws.cbs.mt102.Mt102;
import rs.ac.uns.ftn.xws.cbs.mt103.Mt103;
import rs.ac.uns.ftn.xws.cbs.mt900.Mt900;
import rs.ac.uns.ftn.xws.cbs.mt910.Mt910;
import rs.ac.uns.ftn.xws.cbs.nalog_za_placanje.NalogZaPlacanje;
import rs.ac.uns.ftn.xws.cbs.zahtev_za_izvod.ZahtevZaIzvod;
import util.PropertiesLoader;
import utility.MtCoupler;

public class MainBankProcessor {

	protected static final String propertiesName = "ant.properties";
    protected Properties properties = PropertiesLoader.load(propertiesName);
	protected MtCoupler mtc;
	protected DataProcessing processor;
	protected ProcessingState state;
	
	private MainBankProcessor() {
		state = new BankState();
		processor = new XWSDataProcessor(state);
	}

	private static class SingletonHolder {
        private static final MainBankProcessor INSTANCE = new MainBankProcessor();
	}

	public static MainBankProcessor getInstance() {
	        return SingletonHolder.INSTANCE;
	}

	public Object process(Mt102 mt102) throws JAXBException, IOException,
			SAXException, Exception {
		// TODO Auto-generated method stub
		return processor.process(mt102);
	}

	public Object process(Mt103 mt103) throws JAXBException, IOException,
			SAXException, Exception {
		// TODO Auto-generated method stub
		return processor.process(mt103);
	}

	public Object process(Mt900 mt900) throws JAXBException, IOException,
			SAXException, Exception {
		// TODO Auto-generated method stub
		return processor.process(mt900);
	}

	public Object process(Mt910 mt910) throws JAXBException, IOException,
			SAXException, Exception {
		// TODO Auto-generated method stub
		return processor.process(mt910);
	}

	public Object process(Izvod izvod) throws JAXBException, IOException,
			SAXException, Exception {
		// TODO Auto-generated method stub
		return processor.process(izvod);
	}

	public Object process(NalogZaPlacanje nalog) throws JAXBException,
			IOException, SAXException, Exception {
		// TODO Auto-generated method stub
		return processor.process(nalog);
	}

	public Object process(ZahtevZaIzvod zahtev) throws JAXBException,
			IOException, SAXException, Exception {
		// TODO Auto-generated method stub
		return processor.process(zahtev);
	}
	
	

}

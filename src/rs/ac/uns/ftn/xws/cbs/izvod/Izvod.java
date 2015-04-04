
package rs.ac.uns.ftn.xws.cbs.izvod;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zaglavlje" type="{http://www.ftn.uns.ac.rs/xws/cbs/izvod}IzvodZaglavlje"/>
 *         &lt;element name="stavke" type="{http://www.ftn.uns.ac.rs/xws/cbs/izvod}IzvodStavka" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "zaglavlje",
    "stavke"
})
@XmlRootElement(name = "izvod")
public class Izvod {

    @XmlElement(required = true)
    protected IzvodZaglavlje zaglavlje;
    @XmlElement(required = true)
    protected List<IzvodStavka> stavke;

    /**
     * Gets the value of the zaglavlje property.
     * 
     * @return
     *     possible object is
     *     {@link IzvodZaglavlje }
     *     
     */
    public IzvodZaglavlje getZaglavlje() {
        return zaglavlje;
    }

    /**
     * Sets the value of the zaglavlje property.
     * 
     * @param value
     *     allowed object is
     *     {@link IzvodZaglavlje }
     *     
     */
    public void setZaglavlje(IzvodZaglavlje value) {
        this.zaglavlje = value;
    }

    /**
     * Gets the value of the stavke property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stavke property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStavke().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IzvodStavka }
     * 
     * 
     */
    public List<IzvodStavka> getStavke() {
        if (stavke == null) {
            stavke = new ArrayList<IzvodStavka>();
        }
        return this.stavke;
    }

}

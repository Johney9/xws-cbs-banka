
package rs.ac.uns.ftn.xws.cbs.izvod;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IzvodZaglavlje complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IzvodZaglavlje">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="broj_racuna" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TRacun"/>
 *         &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="broj_preseka">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="prethodno_stanje" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TIznos"/>
 *         &lt;element name="broj_promena_u_korist">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *               &lt;totalDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ukupno_u_korist" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TIznos"/>
 *         &lt;element name="broj_promena_na_teret">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *               &lt;totalDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ukupno_na_teret" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TIznos"/>
 *         &lt;element name="novo_stanje" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TIznos"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IzvodZaglavlje", propOrder = {
    "brojRacuna",
    "datumNaloga",
    "brojPreseka",
    "prethodnoStanje",
    "brojPromenaUKorist",
    "ukupnoUKorist",
    "brojPromenaNaTeret",
    "ukupnoNaTeret",
    "novoStanje"
})
public class IzvodZaglavlje {

    @XmlElement(name = "broj_racuna", required = true)
    protected String brojRacuna;
    @XmlElement(name = "datum_naloga", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumNaloga;
    @XmlElement(name = "broj_preseka", required = true)
    protected BigInteger brojPreseka;
    @XmlElement(name = "prethodno_stanje", required = true)
    protected BigDecimal prethodnoStanje;
    @XmlElement(name = "broj_promena_u_korist", required = true)
    protected BigInteger brojPromenaUKorist;
    @XmlElement(name = "ukupno_u_korist", required = true)
    protected BigDecimal ukupnoUKorist;
    @XmlElement(name = "broj_promena_na_teret", required = true)
    protected BigInteger brojPromenaNaTeret;
    @XmlElement(name = "ukupno_na_teret", required = true)
    protected BigDecimal ukupnoNaTeret;
    @XmlElement(name = "novo_stanje", required = true)
    protected BigDecimal novoStanje;

    /**
     * Gets the value of the brojRacuna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrojRacuna() {
        return brojRacuna;
    }

    /**
     * Sets the value of the brojRacuna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrojRacuna(String value) {
        this.brojRacuna = value;
    }

    /**
     * Gets the value of the datumNaloga property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumNaloga() {
        return datumNaloga;
    }

    /**
     * Sets the value of the datumNaloga property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumNaloga(XMLGregorianCalendar value) {
        this.datumNaloga = value;
    }

    /**
     * Gets the value of the brojPreseka property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBrojPreseka() {
        return brojPreseka;
    }

    /**
     * Sets the value of the brojPreseka property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBrojPreseka(BigInteger value) {
        this.brojPreseka = value;
    }

    /**
     * Gets the value of the prethodnoStanje property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrethodnoStanje() {
        return prethodnoStanje;
    }

    /**
     * Sets the value of the prethodnoStanje property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrethodnoStanje(BigDecimal value) {
        this.prethodnoStanje = value;
    }

    /**
     * Gets the value of the brojPromenaUKorist property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBrojPromenaUKorist() {
        return brojPromenaUKorist;
    }

    /**
     * Sets the value of the brojPromenaUKorist property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBrojPromenaUKorist(BigInteger value) {
        this.brojPromenaUKorist = value;
    }

    /**
     * Gets the value of the ukupnoUKorist property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUkupnoUKorist() {
        return ukupnoUKorist;
    }

    /**
     * Sets the value of the ukupnoUKorist property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUkupnoUKorist(BigDecimal value) {
        this.ukupnoUKorist = value;
    }

    /**
     * Gets the value of the brojPromenaNaTeret property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBrojPromenaNaTeret() {
        return brojPromenaNaTeret;
    }

    /**
     * Sets the value of the brojPromenaNaTeret property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBrojPromenaNaTeret(BigInteger value) {
        this.brojPromenaNaTeret = value;
    }

    /**
     * Gets the value of the ukupnoNaTeret property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUkupnoNaTeret() {
        return ukupnoNaTeret;
    }

    /**
     * Sets the value of the ukupnoNaTeret property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUkupnoNaTeret(BigDecimal value) {
        this.ukupnoNaTeret = value;
    }

    /**
     * Gets the value of the novoStanje property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNovoStanje() {
        return novoStanje;
    }

    /**
     * Sets the value of the novoStanje property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNovoStanje(BigDecimal value) {
        this.novoStanje = value;
    }

}


package webservicesserver;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 *<soapenv:Envelope
 * xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
 * xmlns:ns="http://sberbank.ru/soa/service/sudir/itdi/custom.fiori.account.management.webservice/1.0.0">
 *     <soapenv:Header/>
 *     <soapenv:Body>
 *         <ns:testConnection>
 *             <messageForEcho>efwefwef</messageForEcho>
 *         </ns:testConnection>
 *     </soapenv:Body>
 * </soapenv:Envelope>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "numberToDollarsResult"
})
@XmlRootElement(name = "NumberToDollarsResponse")
public class NumberToDollarsResponse {

    @XmlElement(name = "NumberToDollarsResult", required = true)
    protected String numberToDollarsResult;

    /**
     * Gets the value of the numberToDollarsResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberToDollarsResult() {
        return numberToDollarsResult;
    }

    /**
     * Sets the value of the numberToDollarsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberToDollarsResult(String value) {
        this.numberToDollarsResult = value;
    }

}

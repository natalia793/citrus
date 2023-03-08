package pojo;

import com.sun.xml.messaging.saaj.soap.Envelope;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace="http://schemas.xmlsoap.org/soap/envelope/",
    name = "http://sberbank.ru/soa/service/sudir/itdi/custom.fiori.account.management.webservice/1.0.0")
public class Welcome {
  private Envelope envelope;

  public Envelope getEnvelope() { return envelope; }
  public void setEnvelope(Envelope value) { this.envelope = value; }
}

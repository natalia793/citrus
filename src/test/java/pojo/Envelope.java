package pojo;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlRootElement
public class Envelope {


  public Object getHeader() {
    return this.Header; }
  public void setHeader(Object Header) {
    this.Header = Header; }
  Object Header;
  public Body getBody() {
    return this.Body; }
  public void setBody(Body Body) {
    this.Body = Body; }
  Body Body;
  public String getsoapenv() {
    return this.soapenv; }
  public void setsoapenv(String soapenv) {
    this.soapenv = soapenv; }
  String soapenv;
  public String getns() {
    return this.ns; }
  public void setns(String ns) {
    this.ns = ns; }
  String ns;
  public String gettext() {
    return this.text; }
  public void settext(String text) {
    this.text = text; }
  String text;
}

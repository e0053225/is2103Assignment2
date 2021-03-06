
package ejb.session.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "InvalidLoginException", targetNamespace = "http://ws.session.ejb/")
public class InvalidLoginException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidLoginException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public InvalidLoginException_Exception(String message, InvalidLoginException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public InvalidLoginException_Exception(String message, InvalidLoginException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: ejb.session.ws.InvalidLoginException
     */
    public InvalidLoginException getFaultInfo() {
        return faultInfo;
    }

}

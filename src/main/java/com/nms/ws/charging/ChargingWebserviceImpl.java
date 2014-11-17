
package com.nms.ws.charging;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ChargingWebserviceImpl", targetNamespace = "http://chargingwebservice.nms.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ChargingWebserviceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.nms.ws.charging.ContentPurcharseRes
     */
    @WebMethod(operationName = "ChargeItems")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ChargeItems", targetNamespace = "http://chargingwebservice.nms.com/", className = "com.nms.ws.charging.ChargeItems")
    @ResponseWrapper(localName = "ChargeItemsResponse", targetNamespace = "http://chargingwebservice.nms.com/", className = "com.nms.ws.charging.ChargeItemsResponse")
    @Action(input = "http://chargingwebservice.nms.com/ChargingWebserviceImpl/ChargeItemsRequest", output = "http://chargingwebservice.nms.com/ChargingWebserviceImpl/ChargeItemsResponse")
    public ContentPurcharseRes chargeItems(
        @WebParam(name = "arg0", targetNamespace = "")
        ContentPurcharseReq arg0);

}


package org.soap.web.service.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.soap.web.service.model.Product;

@XmlRootElement(name = "getProductsV2Response", namespace = "http://www.TestCatalog.com")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProductsV2Response", namespace = "http://www.TestCatalog.com")
public class GetProductsV2Response {

    @XmlElement(name = "return", namespace = "")
    private List<Product> _return;

    /**
     * 
     * @return
     *     returns List<Product>
     */
    public List<Product> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<Product> _return) {
        this._return = _return;
    }

}

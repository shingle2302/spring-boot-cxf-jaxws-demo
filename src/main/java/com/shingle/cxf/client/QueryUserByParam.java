
package com.shingle.cxf.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>queryUserByParam complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="queryUserByParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="param" type="{http://service.cxf.shingle.com/}userQueryParam" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryUserByParam", propOrder = {
    "param"
})
public class QueryUserByParam {

    protected UserQueryParam param;

    /**
     * 获取param属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UserQueryParam }
     *     
     */
    public UserQueryParam getParam() {
        return param;
    }

    /**
     * 设置param属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UserQueryParam }
     *     
     */
    public void setParam(UserQueryParam value) {
        this.param = value;
    }

}

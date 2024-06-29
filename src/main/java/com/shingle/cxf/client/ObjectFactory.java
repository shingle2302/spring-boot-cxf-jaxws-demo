
package com.shingle.cxf.client;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.shingle.cxf.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetUserById_QNAME = new QName("http://service.cxf.shingle.com/", "getUserById");
    private final static QName _GetUserByIdResponse_QNAME = new QName("http://service.cxf.shingle.com/", "getUserByIdResponse");
    private final static QName _QueryUserByParam_QNAME = new QName("http://service.cxf.shingle.com/", "queryUserByParam");
    private final static QName _QueryUserByParamResponse_QNAME = new QName("http://service.cxf.shingle.com/", "queryUserByParamResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.shingle.cxf.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserById }
     * 
     */
    public GetUserById createGetUserById() {
        return new GetUserById();
    }

    /**
     * Create an instance of {@link GetUserByIdResponse }
     * 
     */
    public GetUserByIdResponse createGetUserByIdResponse() {
        return new GetUserByIdResponse();
    }

    /**
     * Create an instance of {@link QueryUserByParam }
     * 
     */
    public QueryUserByParam createQueryUserByParam() {
        return new QueryUserByParam();
    }

    /**
     * Create an instance of {@link QueryUserByParamResponse }
     * 
     */
    public QueryUserByParamResponse createQueryUserByParamResponse() {
        return new QueryUserByParamResponse();
    }

    /**
     * Create an instance of {@link UserBo }
     * 
     */
    public UserBo createUserBo() {
        return new UserBo();
    }

    /**
     * Create an instance of {@link UserQueryParam }
     * 
     */
    public UserQueryParam createUserQueryParam() {
        return new UserQueryParam();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUserById }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.cxf.shingle.com/", name = "getUserById")
    public JAXBElement<GetUserById> createGetUserById(GetUserById value) {
        return new JAXBElement<GetUserById>(_GetUserById_QNAME, GetUserById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUserByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.cxf.shingle.com/", name = "getUserByIdResponse")
    public JAXBElement<GetUserByIdResponse> createGetUserByIdResponse(GetUserByIdResponse value) {
        return new JAXBElement<GetUserByIdResponse>(_GetUserByIdResponse_QNAME, GetUserByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryUserByParam }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryUserByParam }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.cxf.shingle.com/", name = "queryUserByParam")
    public JAXBElement<QueryUserByParam> createQueryUserByParam(QueryUserByParam value) {
        return new JAXBElement<QueryUserByParam>(_QueryUserByParam_QNAME, QueryUserByParam.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryUserByParamResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryUserByParamResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.cxf.shingle.com/", name = "queryUserByParamResponse")
    public JAXBElement<QueryUserByParamResponse> createQueryUserByParamResponse(QueryUserByParamResponse value) {
        return new JAXBElement<QueryUserByParamResponse>(_QueryUserByParamResponse_QNAME, QueryUserByParamResponse.class, null, value);
    }

}

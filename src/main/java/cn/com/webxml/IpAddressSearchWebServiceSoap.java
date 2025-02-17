package cn.com.webxml;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.0.4
 * 2024-06-28T21:08:54.668+08:00
 * Generated source version: 4.0.4
 *
 */
@WebService(targetNamespace = "http://WebXml.com.cn/", name = "IpAddressSearchWebServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface IpAddressSearchWebServiceSoap {

    /**
     * <br /><h3>通过输入IP地址查询国家、城市、所有者等信息。没有注明国家的为中国</h3><p>输入参数：IP地址（自动替换 " 。" 为 "."），返回数据： 一个一维字符串数组String(1)，String(0) = IP地址；String(1) = 查询结果或提示信息</p><br />
     */
    @WebMethod(action = "http://WebXml.com.cn/getCountryCityByIp")
    @RequestWrapper(localName = "getCountryCityByIp", targetNamespace = "http://WebXml.com.cn/", className = "cn.com.webxml.GetCountryCityByIp")
    @ResponseWrapper(localName = "getCountryCityByIpResponse", targetNamespace = "http://WebXml.com.cn/", className = "cn.com.webxml.GetCountryCityByIpResponse")
    @WebResult(name = "getCountryCityByIpResult", targetNamespace = "http://WebXml.com.cn/")
    public cn.com.webxml.ArrayOfString getCountryCityByIp(

        @WebParam(name = "theIpAddress", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String theIpAddress
    );

    /**
     * <br /><h3>获得您的IP地址和地址信息</h3><p>输入参数：无，返回数据： 一个一维字符串数组String(1)，String(0) = IP地址；String(1) = 地址信息</p><br />
     */
    @WebMethod(action = "http://WebXml.com.cn/getGeoIPContext")
    @RequestWrapper(localName = "getGeoIPContext", targetNamespace = "http://WebXml.com.cn/", className = "cn.com.webxml.GetGeoIPContext")
    @ResponseWrapper(localName = "getGeoIPContextResponse", targetNamespace = "http://WebXml.com.cn/", className = "cn.com.webxml.GetGeoIPContextResponse")
    @WebResult(name = "getGeoIPContextResult", targetNamespace = "http://WebXml.com.cn/")
    public cn.com.webxml.ArrayOfString getGeoIPContext()
;

    /**
     * <br /><h3>获得本IP地址搜索 WEB 服务的数据库版本更新时间</h3><p>输入参数：无，输出参数 String</p><br />
     */
    @WebMethod(action = "http://WebXml.com.cn/getVersionTime")
    @RequestWrapper(localName = "getVersionTime", targetNamespace = "http://WebXml.com.cn/", className = "cn.com.webxml.GetVersionTime")
    @ResponseWrapper(localName = "getVersionTimeResponse", targetNamespace = "http://WebXml.com.cn/", className = "cn.com.webxml.GetVersionTimeResponse")
    @WebResult(name = "getVersionTimeResult", targetNamespace = "http://WebXml.com.cn/")
    public java.lang.String getVersionTime()
;
}

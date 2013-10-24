
package com.huge.iunifiedechannelservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonTradeInfo" type="{http://www.huge.com/IUnifiedEChannelService/}CommonTradeInfo"/>
 *         &lt;element name="customerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bookingDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="purchaseInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="purchaseInfo" type="{http://www.huge.com/IUnifiedEChannelService/}PurchaseInfo" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "commonTradeInfo",
    "customerCode",
    "bookingDate",
    "purchaseInfos"
})
@XmlRootElement(name = "purchase")
public class Purchase {

    @XmlElement(required = true)
    protected CommonTradeInfo commonTradeInfo;
    @XmlElement(required = true)
    protected String customerCode;
    @XmlElement(required = true)
    protected String bookingDate;
    protected Purchase.PurchaseInfos purchaseInfos;

    /**
     * Gets the value of the commonTradeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CommonTradeInfo }
     *     
     */
    public CommonTradeInfo getCommonTradeInfo() {
        return commonTradeInfo;
    }

    /**
     * Sets the value of the commonTradeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonTradeInfo }
     *     
     */
    public void setCommonTradeInfo(CommonTradeInfo value) {
        this.commonTradeInfo = value;
    }

    /**
     * Gets the value of the customerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * Sets the value of the customerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
    }

    /**
     * Gets the value of the bookingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingDate() {
        return bookingDate;
    }

    /**
     * Sets the value of the bookingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingDate(String value) {
        this.bookingDate = value;
    }

    /**
     * Gets the value of the purchaseInfos property.
     * 
     * @return
     *     possible object is
     *     {@link Purchase.PurchaseInfos }
     *     
     */
    public Purchase.PurchaseInfos getPurchaseInfos() {
        return purchaseInfos;
    }

    /**
     * Sets the value of the purchaseInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Purchase.PurchaseInfos }
     *     
     */
    public void setPurchaseInfos(Purchase.PurchaseInfos value) {
        this.purchaseInfos = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="purchaseInfo" type="{http://www.huge.com/IUnifiedEChannelService/}PurchaseInfo" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "purchaseInfo"
    })
    public static class PurchaseInfos {

        @XmlElement(required = true)
        protected List<PurchaseInfo> purchaseInfo;

        /**
         * Gets the value of the purchaseInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the purchaseInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPurchaseInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PurchaseInfo }
         * 
         * 
         */
        public List<PurchaseInfo> getPurchaseInfo() {
            if (purchaseInfo == null) {
                purchaseInfo = new ArrayList<PurchaseInfo>();
            }
            return this.purchaseInfo;
        }

    }

}

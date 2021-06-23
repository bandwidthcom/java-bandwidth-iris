package com.bandwidth.iris.sdk.model;

import com.bandwidth.iris.sdk.IrisClient;
import com.bandwidth.iris.sdk.IrisPath;
import com.bandwidth.iris.sdk.IrisResponse;
import com.bandwidth.iris.sdk.utils.XmlUtils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.Map;

/**
 * Created by sbarstow on 11/17/14.
 */
@XmlRootElement(name = "AvailableNpaNxx")
@XmlAccessorType(XmlAccessType.FIELD)
public class AvailableNpaNxx {

    @XmlElement(name = "City")
    private String city;
    @XmlElement(name = "Npa")
    private String npa;
    @XmlElement(name = "Nxx")
    private String nxx;
    @XmlElement(name = "Quantity")
    private int quantity;
    @XmlElement(name = "State")
    private string state;

    public static List<AvailableNpaNxx> list(IrisClient client, Map<String, Object> query)
            throws Exception {

        SearchResultForAvailableNpaNxx searchResult = null;
        List<AvailableNpaNxx> availableNpaNxxList = null;
        IrisResponse irisResponse = client
                .get(client.buildAccountModelUri(new String[] { IrisPath.AVAILABLE_NPANXX_URI_PATH }, query));
        searchResult = XmlUtils.fromXml(irisResponse.getResponseBody(),
                SearchResultForAvailableNpaNxx.class);
        availableNpaNxxList = searchResult.getAvailableNpaNxxList();
        return availableNpaNxxList;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNpa() {
        return npa;
    }

    public void setNpa(String npa) {
        this.npa = npa;
    }

    public String getNxx() {
        return nxx;
    }

    public void setNxx(String nxx) {
        this.nxx = nxx;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public string getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}

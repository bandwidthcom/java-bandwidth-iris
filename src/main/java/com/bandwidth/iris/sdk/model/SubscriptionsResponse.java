package com.bandwidth.iris.sdk.model;


import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sbarstow on 11/19/14.
 */
@XmlRootElement(name="SubscriptionsResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class SubscriptionsResponse extends BaseResponse {
    @XmlElementWrapper(name="Subscriptions")
    @XmlElement(name="Subscription")
    private List<Subscription> subscriptions = new ArrayList<Subscription>();

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }
}

package de.cosmicit.pms.model;

public class SubscriptionType {


    private Long id;

    private String subscriptionTypeCode;

    private String subscriptionTypeDescription;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubscriptionTypeCode() {
        return subscriptionTypeCode;
    }

    public void setSubscriptionTypeCode(String subscriptionTypeCode) {
        this.subscriptionTypeCode = subscriptionTypeCode;
    }

    public String getSubscriptionTypeDescription() {
        return subscriptionTypeDescription;
    }

    public void setSubscriptionTypeDescription(String subscriptionTypeDescription) {
        this.subscriptionTypeDescription = subscriptionTypeDescription;
    }

//
//    public void setSubscriptions(Set<Subscription> subscriptions) {
//        if (!this.subscriptions.isEmpty()) {
//            this.subscriptions.forEach((Subscription subscription) -> subscription.setSubscriptionType(null));
//            this.subscriptions.clear();
//        }
//        subscriptions.forEach((Subscription subscription) -> subscription.setSubscriptionType(this));
//        this.subscriptions.addAll(subscriptions);
//    }
//
//    public void addSubscription(Subscription subscription) {
//        if (!this.subscriptions.contains(subscription)) {
//            this.subscriptions.add(subscription);
//        }
//    }
}

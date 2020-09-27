package be.pxl.ja.streamingservice.model;

public enum StreamingPlan {
    BASIC(1,7.99),
    STANDAARD(2,11.99),
    PREMIUM(4,15.99);

    private int numberOfProfiles;
    private double price;

    StreamingPlan(int profiles,double price){
        this.numberOfProfiles = profiles;
        this.price = price;
    }
}

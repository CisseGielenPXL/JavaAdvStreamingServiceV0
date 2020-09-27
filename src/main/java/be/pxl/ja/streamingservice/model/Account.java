package be.pxl.ja.streamingservice.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String email;
    private String password;
    private PaymentInfo paymentInfo;
    private StreamingPlan streamingPlan;
    private List<Profile> profiles;

    public Account(String email, String password){
        profiles = new ArrayList<>();
        Profile profile = new Profile();
        profile.setName("profile1");
        profiles.add(profile);
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public void setStreamingPlan(StreamingPlan streamingPlan) {
        this.streamingPlan = streamingPlan;
    }
    public boolean verifyPassword(String password){
        return false;//not implmented
    }
    public Profile getFirstProfile(){
        return profiles.get(0);
    }
}

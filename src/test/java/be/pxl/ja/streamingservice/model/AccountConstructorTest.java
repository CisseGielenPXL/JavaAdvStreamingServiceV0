package be.pxl.ja.streamingservice.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountConstructorTest {
    @Test
    public void ConstructorShouldMakeProfile1(){
        Profile profile = new Profile();
        profile.setName("profile1");
        Account account = new Account("bl","bl");
        Assertions.assertEquals(profile,account.getFirstProfile());
    }
}

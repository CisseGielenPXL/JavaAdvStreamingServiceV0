package be.pxl.ja.streamingservice.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountConstructorTest {
    @Test
    public void ConstructorShouldMakeProfile1WithNoDate(){
        Account account = new Account("bl","bl");
        Assertions.assertEquals("profile1",account.getFirstProfile().getName());
        Assertions.assertNull(account.getFirstProfile().getDateOfBirth());
    }
}

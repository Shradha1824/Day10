package user.registration;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

    //Test for Check User Name
    @Test
    public void givenUserName_is_True() {
        UserValidation validation = new UserValidation();
        boolean result = validation.validUserName("Shradhda");
        Assert.assertEquals(true, result);

    }

    @Test
    public void givenUserName_is_False() {
        UserValidation validation = new UserValidation();
        boolean result = validation.validUserName("shrdh12a");
        Assert.assertEquals(true, result);
    }

    //Test for checking Phone Number
    @Test
    public void givenPhoneNo_is_True() {
        UserValidation validation = new UserValidation();
        boolean result = validation.validPhoneNo("6363069692");
        Assert.assertEquals(true, result);

    }

    @Test
    public void givenPhoneNo_is_False() {
        UserValidation validation = new UserValidation();
        boolean result = validation.validPhoneNo("543223");
        Assert.assertEquals(true, result);
    }

    //Test for checking Email Id
    @Test
    public void givenEmailId_is_true() {
        UserValidation validation = new UserValidation();
        boolean result = validation.validEmailId("shradha18@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmailId_is_False() {
        UserValidation validation = new UserValidation();
        boolean result = validation.validEmailId("abc.gamil@123");
        Assert.assertEquals(true, result);
    }
}

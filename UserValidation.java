package user.registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
   private static final String USER_NAME_PATTERN = "^[A-Z]{1}[a-z]*";
   private static final String PHONE_NO_PATTERN = "^[6-9][0-9]{9}";
   private static final String EMAIL_ID_PATTERN = "^[a-zA-Z0-9]+[@][a-z_/.][a-z]{2,3}";

   //UserName validation check
    public boolean validUserName(String UserName){
        Pattern p = Pattern.compile(USER_NAME_PATTERN);
        if(UserName==null) {
            return false;
        }
        Matcher m = p.matcher(USER_NAME_PATTERN);
        return true;
    }

    //Phone Number validation check
    public boolean validPhoneNo(String PhoneNo){
        Pattern p1 = Pattern.compile(PHONE_NO_PATTERN);
        if(PhoneNo==null){
            return false;
        }
        Matcher m1 = p1.matcher(PHONE_NO_PATTERN);
        return true;
    }

    //Email Id validation check
    public boolean validEmailId(String EmailId){
        Pattern p2 = Pattern.compile(EMAIL_ID_PATTERN);
        if(EmailId==null){
            return false;
        }
        Matcher m2 = p2.matcher(EMAIL_ID_PATTERN);
        return true;

    }

}

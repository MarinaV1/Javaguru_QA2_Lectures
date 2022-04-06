package lecture9;

import lecture9.models.User;
import lecture9.models.UserStatic;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestForModels {

     static User user = new User();

    UserStatic userStatic = new UserStatic();

    @BeforeClass
    public static void setupUsser(){
        user.setUsername("username");
        user.setPassword("password");

    }

    @Test
    public void loginToJanisRozeUserDynamic(){
//        bla blab bal open webpage
//
        loginToWebPage(user.getUsername(), user.getPassword());
    }


    @Test
    public void loginToJanisRozeUserStatic(){
//        bla bla bal to webpage

        loginToWebPage(userStatic.getUsername(), userStatic.getPassword());
    }


    private void loginToWebPage(String username, String password) {
    }
}

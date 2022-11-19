package dnrru;

import com.codeborne.selenide.Selenide;
import test1.core.BaseTest;
import org.junit.Test;


public class LoginTest extends BaseTest {

    @Test
    public void loginTest (){
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        loginPage.enterLogin();
        homePage.userAccountName();
        Selenide.$x("//a[@class=\"exitIcon\"]").click();//Выход из аккаунта
        loginPage.setWrongPassword();

    }
}
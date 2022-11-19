package dnrru;

import org.junit.Assert;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {
    public void userAccountName(){
        Assert.assertEquals("6051079",
                $x("//span[@class=\"clientName\"]").getText().replaceAll("\\D+" , ""));
    }

}

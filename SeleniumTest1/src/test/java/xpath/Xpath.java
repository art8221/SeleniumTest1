package xpath;

import com.codeborne.selenide.Selenide;
import core.BaseTest;
import org.junit.Test;

public class Xpath extends BaseTest {
    private final static String URL="https://www.google.com.ua/search?q=linkedin&sxsrf=ALiCzsZTtEPYbhIbVxYURFEPBGwMf4T_2Q%3A1667206706604&ei=Mo5fY5y-JIn6kwXcxaYI&ved=0ahUKEwicn478jIr7AhUJ_aQKHdyiCQEQ4dUDCA8&uact=5&oq=linkedin&gs_lp=Egxnd3Mtd2l6LXNlcnC4AQP4AQEyChAuGMcBGNEDGCcyCBAAGIAEGLEDMgsQLhiABBjHARjRAzIFEAAYgAQyCBAAGIAEGMsBMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgATCAgsQABiABBixAxiDAcICCBAAGLEDGIMBwgIOEC4YgAQYsQMYxwEY0QPCAgsQLhiABBixAxiDAUj7G1AAWMMVcAB4AcgBAJABAJgBzwGgAbQKqgEFMC43LjHiAwQgQRgA4gMEIEYYAIgGAQ&sclient=gws-wiz-serp";

    @Test
    public void open(){
        Selenide.open(URL);
        //div[text()="64% шукачів роботи влаштовуються працювати за ..."]
        //*[text()="64% шукачів роботи влаштовуються працювати за ..."]
        //*[contains(text(),"Результаты поиска")]
        //h3[@class="LC20lb MBeuO DKV0Md"][contains(text(),"Википедия")]
        //h3[@class="LC20lb MBeuO DKV0Md"][text()="Как зайти на Linkedin (Линкедин)? - Фармакопея.рф"]
        //*[@jsname="MgN2vf"]/a[text()='Почему закрыт доступ к LinkedIn?']
        //*[@jsname="MgN2vf"]/a[text()='Почему закрыт доступ к LinkedIn?']/../../..
        //h3[@class="LC20lb MBeuO DKV0Md"]

    }

}

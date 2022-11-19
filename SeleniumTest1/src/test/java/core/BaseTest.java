package core;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;



abstract public class BaseTest {//Базовый абстрактный класс(от которого буду наследоваться в других тестовых классах)
    public void setUp() {//настройки для браузера
        WebDriverManager.chromedriver().setup();
        Configuration.browser  = "chrome";
        Configuration.driverManagerEnabled = true;//указываю что присутствует менеджер
        Configuration.browserSize = "1366x768";
        Configuration.headless = false;//буду ли я видеть сам браузер при выполнении тестов(false -видно)
        Configuration.timeout= 5000;
        //Configuration.pageLoadTimeout=30000;


    }
    @Before//Метод ДО теста
    public void init(){
        setUp();
    }
    @After//Метод ПОСЛЕ теста
    public void tearDown (){
        Selenide.closeWebDriver();
    }
}



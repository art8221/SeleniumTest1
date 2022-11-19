package hh;


import core.BaseTest;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;


public class HhTest extends BaseTest {//Класс для задачи ЛОГИКИ ПРОВЕРКИ
    private final static String BASE_URL ="https://hh.ru/";

    private final static String URL = "https://hh.ru/resume/8e0ca701ff0b21a4790039ed1f6849346f5972";


    @Test//Вся тестовая логика указывается только в тестоввых классах(указание переменных, сравнение..)
    //а логика взаимодействия с элементами(на страницах) должна происходить в Page классах
    public void checkAttributesHashMap (){
        MainPage mainPage= new MainPage(BASE_URL);
        mainPage.inTo();
        mainPage.setUser();
        HhResumePage hhResumePage = new HhResumePage();
        mainPage.inToResume();

        Map<String,Object>expectedGetAttrebutes = new HashMap<>();
        expectedGetAttrebutes.put(HhResumePage.GENDER, "М");
        expectedGetAttrebutes.put(HhResumePage.AGE, 40);
        expectedGetAttrebutes.put(HhResumePage.CITY, "Джанкой");
        expectedGetAttrebutes.put(HhResumePage.CONFIRMET_PHONE, true);
        expectedGetAttrebutes.put(HhResumePage.READY_TO_RELACATE, false);

        Map<String,Object>actualAttrebutes= hhResumePage.getAttrebutes();
        Assert.assertEquals(expectedGetAttrebutes,actualAttrebutes);

    }
    @Test
    public void checkAttributesClass (){
        MainPage mainPage= new MainPage(BASE_URL);
        mainPage.inTo();
        mainPage.setUser();
        HhResumePage hhResumePage = new HhResumePage();
        mainPage.inToResume();
        
        Resume expected = new Resume("М",40, "Джанкой", true, false);
        Resume actual = new Resume(hhResumePage.getGender(), hhResumePage.getAge(), hhResumePage.getCity(),
                hhResumePage.isPhoneConfirmed(), hhResumePage.getLiveDate());
        //Способы сравнения классов
      Assert.assertTrue(EqualsBuilder.reflectionEquals(expected,actual));//Все поля сразу
        //по отдельности
        Assert.assertEquals(expected.getGender(),actual.getGender());
        Assert.assertEquals(expected.getAge(),actual.getAge());
        Assert.assertEquals(expected.getCity(),actual.getCity());
        Assert.assertEquals(expected.isConfirmedPhoneNumber(),actual.isConfirmedPhoneNumber());
        Assert.assertEquals(expected.isReadyToRelacete(),actual.isReadyToRelacete());

    }


/* ТЕСТ КЙС
1)Открыть резюме которое доступно только по ссылке https://floraline24.ru/catalog/bukety/bukety_iz_kustovykh_roz/254865/
2)Получить информацию о профиле используя HashMap  или Class  в которой должны быть следующие атрибуты:
String sex, int age,  String city, bollen confirmedPhoneNumber, bollen readyToRelacete
Убедится что ожидаемый и фактический результат равны
 */

}

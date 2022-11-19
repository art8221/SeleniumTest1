package hh;


import com.codeborne.selenide.SelenideElement;


import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$x;

public class HhResumePage {
    private final SelenideElement gender = $x("//span[@data-qa=\"resume-personal-gender\"]");
    private final SelenideElement age = $x("//span[@data-qa=\"resume-personal-age\"]/span");
    private final SelenideElement city = $x("//span[@data-qa='resume-personal-address']");
    private final SelenideElement liveData = $x("//span[@data-qa=\"resume-personal-address\"]/ancestor::p");
    private final SelenideElement tick = $x("//span[@class=\"bloko-icon bloko-icon_done bloko-icon_initial-secondary\"]");
                                                        //div[@data-qa="resume-contacts-phone"]/span[1]
    public static String GENDER ="Пол";
    public static String AGE = "Возраст";
    public static String CITY = "Город";
    public static String CONFIRMET_PHONE = "Подтвержденный номер";
    public static String READY_TO_RELACATE = "Готовность к переезду";

    public Map<String,Object> getAttrebutes(){
        return new HashMap<>(){{
        put(GENDER, getGender());
        put(AGE, getAge());
        put(CITY, getCity());
        put(CONFIRMET_PHONE, isPhoneConfirmed());
        put(READY_TO_RELACATE, getLiveDate());
        }};
    /*Map<String,Object> attrebutes = new HashMap<>();
        attrebutes.put(GENDER, getGender());
        attrebutes.put(AGE, getAge());
        attrebutes.put(CITY, getCity());
        attrebutes.put(CONFIRMET_PHONE, isPhoneConfirmed());
        attrebutes.put(READY_TO_RELACATE, getLiveDate());
    return attrebutes;*/
    }
    public String getGender(){
        return gender.getText().equals("Мужчина") ? "М" : "Ж";
    }
    public int getAge(){
        return Integer.parseInt(age.getText().replaceAll("\\D+" , ""));//Забираю только число из строки при помощи регулярных выражений
    }
    public String getCity () {
        return city.getText();
    }
    public boolean getLiveDate(){
        return liveData.getText().split(", ")[1].equals("не готов к переезду") ? true : false;

    }
    public boolean isPhoneConfirmed(){
        return tick.isDisplayed();
    }
}

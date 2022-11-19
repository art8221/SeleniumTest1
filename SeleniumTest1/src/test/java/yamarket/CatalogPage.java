package yamarket;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CatalogPage {
    private final SelenideElement compNout =$x("//span[@class='_3krX4'][text()='Ноутбуки и компьютеры']");
    public void inCompNout(){//Переход компьютеры и ноутбуки
        compNout.click();
    }
}

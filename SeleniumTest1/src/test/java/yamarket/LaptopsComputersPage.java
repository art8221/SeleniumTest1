package yamarket;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LaptopsComputersPage {
    private final SelenideElement nout = $x ("//a[@href=\"/catalog--noutbuki-v-simferopole/54544/list?hid=91013\"][text()='Ноутбуки']");

    public void inToNout(){//переход в ноутбуки
        nout.click();
    }
}

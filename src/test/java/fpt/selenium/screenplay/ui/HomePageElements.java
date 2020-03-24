package fpt.selenium.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageElements {
    public static Target INPUT_FORM_BUTTON    =  Target.the("Input Forms")
            .located(By.xpath("//li[@class='dropdown']/a[contains(text(),'Input Forms')]"));

    public static Target SIMPLE_FORM_DEMO_BUTTON    =  Target.the("Input Forms")
            .located(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Simple Form Demo')]"));


     }

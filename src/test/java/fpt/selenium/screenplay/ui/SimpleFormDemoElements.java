package fpt.selenium.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SimpleFormDemoElements {
//    public static Target ENTER_TEXT_TARGET    =  Target.the("Input Text")
//            .located(By.xpath("//label[text()= '{0}']/following-sibling::input[@type='text']"));

    public static Target ENTER_TEXT_TARGET    =  Target.the("Input Text")
            .locatedBy ("//label[text()='{0}']/following-sibling::input[@type='text']");

    public static Target TOTAL_BUTTON    =  Target.the("Get Total")
            .located(By.xpath("//button[text()='Get Total']"));

    public static Target TOTAL_LABEL_BUTTON    =  Target.the("Total")
            .located(By.xpath("//label[text()=' Total a + b = ']"));

    public static Target DISPLAY_VALUE   =  Target.the("Total")
            .located(By.xpath("//span[@id='displayvalue']"));

}

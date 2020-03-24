package fpt.selenium.screenplay.tasks;

import fpt.selenium.screenplay.ui.HomePageElements;
import fpt.selenium.screenplay.ui.SimpleFormDemoElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class InputValueToSimpleFrom implements Task {
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SimpleFormDemoElements.ENTER_TEXT_TARGET),
                Click.on(HomePageElements.SIMPLE_FORM_DEMO_BUTTON)
        );
    }
}

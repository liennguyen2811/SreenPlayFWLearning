package fpt.selenium.screenplay.tasks;

import fpt.selenium.screenplay.interactions.Wait;
import fpt.selenium.screenplay.ui.HomePageElements;
import fpt.selenium.screenplay.ui.SimpleFormDemoElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InputValueToSimpleFrom implements Task {
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SimpleFormDemoElements.ENTER_TEXT_TARGET.of("Enter a")),
                Click.on(SimpleFormDemoElements.ENTER_TEXT_TARGET.of("Enter b")),
                Wait.aBit(10)
        );
    }
    public static InputValueToSimpleFrom inputValueToSimpleFrom(){
        return instrumented(InputValueToSimpleFrom.class);
    }
}

package fpt.selenium.screenplay.tasks;

import fpt.selenium.screenplay.interactions.Wait;
import fpt.selenium.screenplay.ui.SimpleFormDemoElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class InputValueToSimpleFrom implements Task {

    private final String numberToAdd;

    protected InputValueToSimpleFrom(String numberToAdd) {
        this.numberToAdd = numberToAdd;
    }
    @Step("Enter #numberToAdd")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
               // Click.on(SimpleFormDemoElements.ENTER_TEXT_TARGET.of("Enter a"))
                Enter.theValue(numberToAdd)
                        .into(SimpleFormDemoElements.ENTER_TEXT_TARGET.of("Enter a")),
                Wait.aBit(2),
                Enter.theValue(numberToAdd)
                        .into(SimpleFormDemoElements.ENTER_TEXT_TARGET.of("Enter b")),
                Wait.aBit(2),
                Click.on(SimpleFormDemoElements.TOTAL_LABEL_BUTTON),
                Wait.aBit(2)

        );
    }
    public static InputValueToSimpleFrom inputValueToSimpleFrom(String numberToAdd){
        return instrumented(InputValueToSimpleFrom.class,numberToAdd);
    }
}

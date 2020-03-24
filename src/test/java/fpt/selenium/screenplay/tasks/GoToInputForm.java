package fpt.selenium.screenplay.tasks;

import fpt.selenium.screenplay.ui.HomePageElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToInputForm implements Task {

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePageElements.INPUT_FORM_BUTTON),
                Click.on(HomePageElements.SIMPLE_FORM_DEMO_BUTTON)
        );
    }

    public static GoToInputForm goToInputForm(){
        return instrumented(GoToInputForm.class);
    }

}

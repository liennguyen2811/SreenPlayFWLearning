package fpt.selenium.screenplay.question;

import fpt.selenium.screenplay.ui.SimpleFormDemoElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Result implements Question <String> {

    @Override
    public String answeredBy(Actor actor) {
         return Text.of(SimpleFormDemoElements.DISPLAY_VALUE);
    }
    public static Result result( ) {
        return instrumented(Result.class);
    }
}

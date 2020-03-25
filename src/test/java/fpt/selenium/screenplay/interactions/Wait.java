package fpt.selenium.screenplay.interactions;

import fpt.selenium.screenplay.tasks.InputValueToSimpleFrom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Wait implements Interaction {

    private static final Logger LOGGER = LoggerFactory.getLogger(Wait.class);

    private int seconds;

    public Wait(int seconds) {
        this.seconds = seconds;
    }

    @Override
    @Step("{0} delays in #seconds seconds")
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            LOGGER.warn("Wait a bit method was interrupted.", e);
        }
    }

    public static Wait  aBit(int seconds ) {
        return instrumented(Wait.class, seconds);
    }

}

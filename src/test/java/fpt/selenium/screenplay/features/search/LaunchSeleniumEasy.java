package fpt.selenium.screenplay.features.search;

import fpt.selenium.screenplay.tasks.GoToInputForm;
import fpt.selenium.screenplay.tasks.OpenSeleniumEasyApplication;
import fpt.selenium.screenplay.tasks.OpenTheApplication;
import fpt.selenium.screenplay.tasks.Search;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.containsString;

@RunWith(SerenityRunner.class)
public class LaunchSeleniumEasy {

    Actor anna = Actor.named("Anna");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Steps
    OpenSeleniumEasyApplication openSeleniumEasyApplication;

    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void search_results_should_show_the_search_term_in_the_title() {

        givenThat(anna).wasAbleTo(openSeleniumEasyApplication);

        when(anna).attemptsTo(GoToInputForm.goToInputForm());

       // then(anna).should(eventually(seeThat(TheWebPage.title(), containsString("BDD In Action"))));

    }
}
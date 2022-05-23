package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.MaxtimeData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.PendingDay;
import tasks.Login;
import tasks.EnterReportMenu;
import tasks.ReportDay;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class MaxtimeStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^he enters in the aplication with the correct credentials$")
    public void heEntersInTheAplicationWithTheCorrectCredentials(List<MaxtimeData> credentials) {
        theActorCalled("Julian").wasAbleTo(Login.withThe(credentials));

    }

    @Given("^he select a day to report in the menu$")
    public void heSelectADayToReport() {
        theActorCalled("Julian").wasAbleTo(EnterReportMenu.toSelectDay());

    }

    @When("^he fill the parameters$")
    public void heFillTheParameters(List<MaxtimeData> parameters) {
        theActorInTheSpotlight().attemptsTo(ReportDay.withThe(parameters));

    }

    @Then("^he look the menu (.*)$")
    public void heLookTheMenuDíasPendientesPorCerrar(String message) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(PendingDay.message(message)));
    }
}

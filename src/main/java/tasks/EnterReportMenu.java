package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import userinterfaces.ReportDayHomeSection;

import static net.serenitybdd.screenplay.actions.Click.on;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.waits.WaitUntil.the;
import static userinterfaces.ReportDayHomeSection.*;

public class EnterReportMenu implements Task {

    private ReportDayHomeSection reportDayHomeSection;

    public static EnterReportMenu toSelectDay() {
        return Tasks.instrumented(EnterReportMenu.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                the(REPORT_TIME_BUTTOM,isVisible()).forNoMoreThan(10).seconds(),
                on(REPORT_TIME_BUTTOM),
                the(DATE_PENDING_BUTTOM,isVisible()).forNoMoreThan(10).seconds(),
                on(DATE_PENDING_BUTTOM),
                on(NEW_REPORT_INPUT)




        );
    }
}

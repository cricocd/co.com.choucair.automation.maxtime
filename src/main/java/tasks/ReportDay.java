package tasks;

import model.MaxtimeData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import userinterfaces.ReportDayDetailSection;

import java.util.List;

import static net.serenitybdd.screenplay.actions.Click.on;
import static net.serenitybdd.screenplay.actions.Enter.theValue;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.waits.WaitUntil.the;
import static userinterfaces.ReportDayDetailSection.*;
import static userinterfaces.ReportDayHomeSection.CLOSE_DAY_BUTTOM;
import static userinterfaces.ReportDayHomeSection.HOME_CLOSE_DAY_BUTTOM;

public class ReportDay implements Task {

    private List<MaxtimeData> maxtimeData;
    private ReportDayDetailSection reportDayDetailSection;

    public ReportDay(List<MaxtimeData> parameters) {
        this.maxtimeData = parameters;
    }

    public static ReportDay withThe(List<MaxtimeData> parameters){
        return Tasks.instrumented(ReportDay.class, parameters);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                on(PROJECT_BUTTOM),
                theValue(maxtimeData.get(0).getProject()).into(PROJECT_INPUT),
                on(PROJECT_SELECT),
                the(HOUR_TYPE_LIST,isVisible()).forNoMoreThan(10).seconds(),
                on(HOUR_TYPE_LIST),
                theValue(maxtimeData.get(0).getHourType()).into(HOUR_TYPE_INPUT),
                on(HOUR_TYPE_BUTTOM),
                on(SERVICE_BUTTOM),
                theValue(maxtimeData.get(0).getService()).into(SERVICE_INPUT),
                on(SEARCH_SERVICE_BUTTOM),
                the(SERVICE_INPUT,isVisible()).forNoMoreThan(10).seconds(),
                on(SERVICE_SELECT),
                on(ACTIVITY_TYPE_LIST),
                theValue(maxtimeData.get(0).getActivity()).into(ACTIVITY_TYPE_INPUT),
                on(ACTIVITY_TYPE_BUTTOM),
                theValue(maxtimeData.get(0).getHoursExecuted()).into(HOUR_EJECUTED_INPUT),
                theValue(maxtimeData.get(0).getCommentary()).into(COMMENTARY_INPUT),
                on(SAVE_BUTTOM),
                the(HOME_CLOSE_DAY_BUTTOM,isVisible()).forNoMoreThan(10).seconds(),
                on(HOME_CLOSE_DAY_BUTTOM),
                on(CLOSE_DAY_BUTTOM)
        );

    }
}

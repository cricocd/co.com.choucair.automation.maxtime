package tasks;

import model.MaxtimeData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import userinterfaces.MaxtimeLoginSection;

import java.util.List;

import static net.serenitybdd.screenplay.actions.Click.on;
import static net.serenitybdd.screenplay.actions.Enter.theValue;
import static net.serenitybdd.screenplay.actions.Open.browserOn;
import static userinterfaces.MaxtimeLoginSection.*;

public class Login implements Task {

    private List<MaxtimeData> maxtimeData;
    private MaxtimeLoginSection maxtimeLoginSection;

    public Login(List<MaxtimeData> maxtimeData) {
        this.maxtimeData = maxtimeData;
    }

    public static Login withThe(List<MaxtimeData> maxtimeData){
        return Tasks.instrumented(Login.class, maxtimeData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                browserOn(maxtimeLoginSection),
                theValue(maxtimeData.get(0).getUserName()).into(USERNAME_INPUT),
                theValue(maxtimeData.get(0).getPassword()).into(PASSWORD_INPUT),
                on(CONNECT_BUTTOM)

        );

    }
}

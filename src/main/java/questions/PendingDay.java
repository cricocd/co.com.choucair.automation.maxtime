package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.ReportDayHomeSection;

import static net.serenitybdd.screenplay.questions.Text.of;

public class PendingDay implements Question<Boolean> {

    private String message;

    public PendingDay(String message) {
        this.message = message;
    }

    public static PendingDay message(String message) {
        return new PendingDay(message);
    }

    @Override
    public Boolean answeredBy(Actor actor){
        boolean result;
        String pendingDayMessage = of(ReportDayHomeSection.PENDING_DAY_MESSAGE).viewedBy(actor).asString();
        if(message.equals(pendingDayMessage)){
            result = true;
        } else {
            result = false;
        }
        return result;

    }
}

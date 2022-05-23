package userinterfaces;

import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;
@DefaultUrl("http://operacion.choucairtesting.com/MaxtimeChc/default.aspx#ShortcutViewID=ReporteDiaSoloAnalista_ListView&ShortcutObjectClassName=MaxTime.Module.BusinessObjects.ReporteDia")

public class ReportDayHomeSection {

    public static final IFrame IFRAME = IFrame.withPath(By.className("dxpc-iFrame"));
    public static final Target REPORT_TIME_BUTTOM = the("where we open the report menu").
            located(By.id("Vertical_NC_NB_I0i0_"));
    public static final Target DATE_PENDING_BUTTOM = the("where we select a pending day").
            located(By.id("Vertical_v1_LE_v2_DXDataRow0"));
    public static final Target NEW_REPORT_INPUT = the("where we make a new report").
            located(By.id("Vertical_v3_MainLayoutView_xaf_l103_xaf_dviReporteDetallado_ToolBar_Menu_DXI0_T"));
    public static final Target HOME_CLOSE_DAY_BUTTOM = the("where we enter in a close day menu").
            located(By.id("Vertical_TB_Menu_DXI1_"));
    public static final Target CLOSE_DAY_BUTTOM = the("where we can close a day").
            inIFrame(IFRAME).located(By.id("Dialog_actionContainerHolder_Menu_DXI0_"));
    public static final Target PENDING_DAY_MESSAGE = the("where we check the days pending menu").
            located(By.xpath("//span[contains(text(),\"Días pendientes por cerrar\")]"));


}

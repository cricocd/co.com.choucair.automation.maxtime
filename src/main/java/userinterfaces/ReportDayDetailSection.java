package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class ReportDayDetailSection extends PageObject {

    public static final IFrame IFRAME = IFrame.withPath(By.className("dxpc-iFrame"));
    public static final Target PROJECT_BUTTOM = the("where we open the project dialog").
            located(By.id("Vertical_v6_MainLayoutEdit_xaf_l128_xaf_dviProyecto_Edit_Find_BImg"));
    public static final Target PROJECT_INPUT = the("where we write the project").
            inIFrame(IFRAME).located(By.id("Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_Ed_I"));
    public static final Target PROJECT_SELECT = the("where we select the project").
            inIFrame(IFRAME).located(By.id("Dialog_v7_LE_v8_tccell0_4"));
    public static final Target HOUR_TYPE_LIST = the("where we open the hour type list").
            located(By.id("Vertical_v6_MainLayoutEdit_xaf_l148_xaf_dviTipoHora_Edit_DD_B-1"));
    public static final Target HOUR_TYPE_INPUT = the("where we write the hour type").
            located(By.id("Vertical_v6_MainLayoutEdit_xaf_l148_xaf_dviTipoHora_Edit_DD_I"));
    public static final Target HOUR_TYPE_BUTTOM = the("where we select the hour type").
            located(By.id("Vertical_v6_MainLayoutEdit_xaf_l148_xaf_dviTipoHora_Edit_DD_DDD_L_LBI3T0"));
    public static final Target SERVICE_BUTTOM = the("where we open the servcie dialog").
            located(By.id("Vertical_v6_MainLayoutEdit_xaf_l153_xaf_dviServicio_Edit_Find_B"));
    public static final Target SERVICE_INPUT = the("where we write the service").
            inIFrame(IFRAME).located(By.id("Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_Ed_I"));
    public static final Target SERVICE_SELECT = the("where we select the service").
            inIFrame(IFRAME).located(By.id("Dialog_v9_LE_v10_tccell0_0"));
    public static final Target SEARCH_SERVICE_BUTTOM = the("where we search the service").
            inIFrame(IFRAME).located(By.id("Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_B_B"));
    public static final Target ACTIVITY_TYPE_LIST = the("where we open the activity type list").
            located(By.id("Vertical_v6_MainLayoutEdit_xaf_l158_xaf_dviActividad_Edit_DD_B-1"));
    public static final Target ACTIVITY_TYPE_INPUT = the("where we write the activity type").
            located(By.id("Vertical_v6_MainLayoutEdit_xaf_l158_xaf_dviActividad_Edit_DD_I"));
    public static final Target ACTIVITY_TYPE_BUTTOM = the("where we select the activity").
            located(By.id("Vertical_v6_MainLayoutEdit_xaf_l158_xaf_dviActividad_Edit_DD_DDD_L_LBI38T0"));
    public static final Target HOUR_EJECUTED_INPUT = the("where we write the hours ejecuted").
            located(By.id("Vertical_v6_MainLayoutEdit_xaf_l182_xaf_dviHoras_Edit_I"));
    public static final Target COMMENTARY_INPUT = the("where we write the commentary").
            located(By.id("Vertical_v6_MainLayoutEdit_xaf_l207_xaf_dviComentario_Edit_I"));
    public static final Target SAVE_BUTTOM = the("where we save the parameters").
            located(By.id("Vertical_EditModeActions2_Menu_DXI1_"));
}

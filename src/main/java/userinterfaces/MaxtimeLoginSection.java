package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import static net.serenitybdd.screenplay.targets.Target.*;

@DefaultUrl("http://operacion.choucairtesting.com/MaxtimeChc/Login.aspx?ReturnUrl=%2fMaxtimeChc%2fdefault.aspx")

public class MaxtimeLoginSection extends PageObject {

    public static final Target USERNAME_INPUT = the("where we write the username").
            located(By.id("Logon_v0_MainLayoutEdit_xaf_l30_xaf_dviUserName_Edit_I"));
    public static final Target PASSWORD_INPUT = the("where we write the password").
            located(By.id("Logon_v0_MainLayoutEdit_xaf_l35_xaf_dviPassword_Edit_I"));
    public static final Target CONNECT_BUTTOM = the("where we login in the page").
            located(By.id("Logon_PopupActions_Menu_DXI0_T"));

}

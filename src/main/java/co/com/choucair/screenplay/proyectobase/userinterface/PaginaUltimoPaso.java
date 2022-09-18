package co.com.choucair.screenplay.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaUltimoPaso extends PageObject {
    public static final Target INGRESAR_CLAVE = Target.the("input para ingresar contraseña del usuario").located(By.id("password"));
    public static final Target CONFIRMAR_CLAVE = Target.the("input para confirmar contraseña del usuario").located(By.id("confirmPassword"));
    public static final Target CHECK_INFORMADO = Target.the("check para mantenerse informado")
            .located(By.xpath("//a[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));
    public static final Target CHECK_TERMINOS = Target.the("check para aceptar terminos")
            .located(By.xpath("//a[@class='checkmark signup-consent__checkbox']"));
    public static final Target CHECK_POLITICAS = Target.the("check para aceptar politicas")
            .located(By.xpath("//a[@class='checkmark signup-consent__checkbox']"));
}

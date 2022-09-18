package co.com.choucair.screenplay.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaPaso2 extends PageObject {
    public static final Target INGRESAR_CIUDAD = Target.the("input para ingresar la cidad del usuario").located(By.id("city"));
    public static final Target INGRESAR_CODIGO_POSTAL = Target.the("input para ingresar el codigo postal del usuario").located(By.id("zip"));
    public static final Target INGRESAR_PAIS = Target.the("input para ingresar el pais del usuario").located(By.xpath("//span[@class='ui-select-placeholder text-muted']"));
    public static final Target BOTON_DISPOSITIVOS = Target.the("boton para dirigirse al formulario de dispositivos")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}

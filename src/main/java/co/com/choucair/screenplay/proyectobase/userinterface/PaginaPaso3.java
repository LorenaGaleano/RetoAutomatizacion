package co.com.choucair.screenplay.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaPaso3 extends PageObject {
    public static final Target INGRESAR_COMPUTADOR = Target.the("input para ingresar sistema operativo del computador del usuario").located(By.xpath("//a[@class='ui-select-match-text pull-left ui-select-allow-clear']"));
    public static final Target INGRESAR_VERSION = Target.the("input para ingresar la version sistema operativo del computador del usuario").located(By.xpath("//a[@class='btn btn-default form-control ui-select-toggle']"));
    public static final Target INGRESAR_IDIOMA = Target.the("input para ingresar el idioma del sistema operativo del computador del usuario").located(By.xpath("//a[@class='btn btn-default form-control ui-select-toggle']"));
    public static final Target INGRESAR_CELULAR = Target.the("input para ingresar el tipo de celular del usuario").located(By.xpath("//a[@class='btn btn-default form-control ui-select-toggle']"));
    public static final Target INGRESAR_MODELO = Target.the("input para ingresar el modelo del celular del usuario").located(By.xpath("//a[@class='btn btn-default form-control ui-select-toggle']"));
    public static final Target INGRESAR_SO = Target.the("input para ingresar el sistema operativo del celular del usuario").located(By.xpath("//a[@class='btn btn-default form-control ui-select-toggle']"));

    public static final Target BOTON_ULTIMO_PASO = Target.the("boton para dirigirse al formulario del ultimo paso")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}

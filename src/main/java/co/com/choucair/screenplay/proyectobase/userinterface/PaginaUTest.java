package co.com.choucair.screenplay.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class PaginaUTest extends PageObject {
    public static final Target BOTON_UNIR_HOY = Target.the("boton para iniciar el registro")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}

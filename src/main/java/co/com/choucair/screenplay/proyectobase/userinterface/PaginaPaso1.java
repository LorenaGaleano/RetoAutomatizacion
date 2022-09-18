package co.com.choucair.screenplay.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class PaginaPaso1 extends PageObject {
    public static final Target INGRESAR_NOMBRE = Target.the("input para ingresar el nombre del usuario").located(By.id("firstName"));
    public static final Target INGRESAR_APELLIDO = Target.the("input para ingresar el apellido del usuario").located(By.id("lastName"));
    public static final Target INGRESAR_CORREO = Target.the("input para ingresar el correo electronico del usuario").located(By.id("email"));
    public static final Target ELEGIR_MES_NACIMIENTO = Target.the("choice para elegir mes de nacimiento del usuario").located(By.id("birthMonth"));
    public static final Target ELEGIR_DIA_NACIMIENTO = Target.the("choice para elegir dia de nacimiento del usuario").located(By.id("birthDay"));
    public static final Target ELEGIR_ANIO_NACIMIENTO = Target.the("choice para elegir año de nacimiento del usuario").located(By.id("birthYear"));
    public static final Target BOTON_LOCALIZACION = Target.the("boton para dirigirse al formulario de la localizacion")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}

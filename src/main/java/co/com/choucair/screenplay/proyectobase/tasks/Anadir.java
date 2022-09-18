package co.com.choucair.screenplay.proyectobase.tasks;

import co.com.choucair.screenplay.proyectobase.userinterface.PaginaPaso1;
import co.com.choucair.screenplay.proyectobase.userinterface.PaginaPaso2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

public class Anadir implements Task {
    public static Anadir localizacion() {
        return Tasks.instrumented(Anadir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Bogot").into(PaginaPaso2.INGRESAR_CIUDAD),
                SendKeys.of(Keys.ARROW_DOWN, Keys.ENTER).into(PaginaPaso2.INGRESAR_CIUDAD),

                Enter.theValue("111931").into(PaginaPaso2.INGRESAR_CODIGO_POSTAL),

                Enter.theValue("Colombia").into(PaginaPaso2.INGRESAR_PAIS),
                SendKeys.of(Keys.ARROW_DOWN, Keys.ENTER).into(PaginaPaso2.INGRESAR_PAIS),

                Click.on(PaginaPaso2.BOTON_DISPOSITIVOS)
        );
    }
}

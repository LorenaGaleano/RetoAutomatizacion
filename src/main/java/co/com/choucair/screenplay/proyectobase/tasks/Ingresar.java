package co.com.choucair.screenplay.proyectobase.tasks;

import co.com.choucair.screenplay.proyectobase.userinterface.PaginaPaso1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

public class Ingresar implements Task {
    public static Ingresar datos() {
        return Tasks.instrumented(Ingresar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Lorena").into(PaginaPaso1.INGRESAR_NOMBRE),

                Enter.theValue("Galeano").into(PaginaPaso1.INGRESAR_APELLIDO),

                Enter.theValue("lorenagaleanoprada@gmail.com").into(PaginaPaso1.INGRESAR_CORREO),

                Click.on(PaginaPaso1.ELEGIR_MES_NACIMIENTO),
                SendKeys.of(Keys.ARROW_DOWN, Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ENTER).into(PaginaPaso1.ELEGIR_MES_NACIMIENTO),

                Click.on(PaginaPaso1.ELEGIR_DIA_NACIMIENTO),
                SendKeys.of(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).into(PaginaPaso1.ELEGIR_DIA_NACIMIENTO),

                Click.on(PaginaPaso1.ELEGIR_ANIO_NACIMIENTO),
                SendKeys.of(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).into(PaginaPaso1.ELEGIR_ANIO_NACIMIENTO),

                Click.on(PaginaPaso1.BOTON_LOCALIZACION)
        );
    }
}

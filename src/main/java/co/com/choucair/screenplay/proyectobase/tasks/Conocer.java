package co.com.choucair.screenplay.proyectobase.tasks;

import co.com.choucair.screenplay.proyectobase.userinterface.PaginaPaso2;
import co.com.choucair.screenplay.proyectobase.userinterface.PaginaPaso3;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Conocer implements Task {
    public static Conocer dispositivos() {
        return Tasks.instrumented(Conocer.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Windows").into(PaginaPaso3.INGRESAR_COMPUTADOR),
                Enter.theValue("11").into(PaginaPaso3.INGRESAR_VERSION),
                Enter.theValue("Spanish").into(PaginaPaso3.INGRESAR_IDIOMA),
                Enter.theValue("Xiaomi").into(PaginaPaso3.INGRESAR_CELULAR),
                Enter.theValue("Redmi Note 9").into(PaginaPaso3.INGRESAR_MODELO),
                Enter.theValue("Android 11").into(PaginaPaso3.INGRESAR_SO),
                Click.on(PaginaPaso3.BOTON_ULTIMO_PASO)
        );
    }
}

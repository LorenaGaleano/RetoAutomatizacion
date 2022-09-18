package co.com.choucair.screenplay.proyectobase.tasks;

import co.com.choucair.screenplay.proyectobase.userinterface.PaginaUltimoPaso;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Crear implements Task {
    public static Crear clave() {
        return Tasks.instrumented(Crear.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Lorena").into(PaginaUltimoPaso.INGRESAR_CLAVE),
                Enter.theValue("Lorena").into(PaginaUltimoPaso.CONFIRMAR_CLAVE),
                Click.on(PaginaUltimoPaso.CHECK_INFORMADO),
                Click.on(PaginaUltimoPaso.CHECK_TERMINOS),
                Click.on(PaginaUltimoPaso.CHECK_POLITICAS)
        );
    }
}

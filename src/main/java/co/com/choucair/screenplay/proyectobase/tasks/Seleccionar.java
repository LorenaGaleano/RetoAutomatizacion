package co.com.choucair.screenplay.proyectobase.tasks;

import co.com.choucair.screenplay.proyectobase.userinterface.PaginaUTest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

public class Seleccionar implements Task {
    public static Seleccionar botonUnirHoy() {
        return Tasks.instrumented(Seleccionar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaUTest.BOTON_UNIR_HOY)
        );
    }
}

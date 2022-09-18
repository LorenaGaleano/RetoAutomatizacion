package co.com.choucair.screenplay.proyectobase.tasks;

import co.com.choucair.screenplay.proyectobase.userinterface.PaginaUTest;
import com.sun.javafx.tk.Toolkit;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.Task;


public class Abrir implements Task {

    private PaginaUTest paginaUTest;
    public static Abrir paginauTest(){
        return Tasks.instrumented(Abrir.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaUTest));
    }
}

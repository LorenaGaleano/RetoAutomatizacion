package co.com.choucair.screenplay.proyectobase.stepdefinitions;



import co.com.choucair.screenplay.proyectobase.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class DefinicionPasos {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario abrio la pagina de uTest$")
    public void queElUsuarioAbrioLaPaginaDeUTest() {
        OnStage.theActorCalled("Lorena").wasAbleTo(Abrir.paginauTest());
    }

    @Cuando("^ingrese los datos de regitro$")
    public void ingreseLosDatosDeRegitro() {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.botonUnirHoy());
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.datos());
        OnStage.theActorInTheSpotlight().attemptsTo(Anadir.localizacion());
        OnStage.theActorInTheSpotlight().attemptsTo(Conocer.dispositivos());
        OnStage.theActorInTheSpotlight().attemptsTo(Crear.clave());
    }

    @Entonces("^el podra darle clic al boton Complete SetUp$")
    public void elPodraDarleClicAlBotonCompleteSetUp() {

    }

}

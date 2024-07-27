package com.youtube.stepDefinitios;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ReproducirCancionStepDefinition {
    @Before
    public void setStage() {
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }
    @Dado("que estoy en la pagina de youtube")
    public void queEstoyEnLaPaginaDeYoutube() {
        theActorCalled("Test").wasAbleTo(Open.url("https://www.youtube.com/"));
    }
    @Cuando("busco el nombre de mi cancion")
    public void buscoElNombreDeMiCancion() {

    }
    @Entonces("puedo reproucirla de manera exitosa")
    public void puedoReproucirlaDeManeraExitosa() {

    }


}

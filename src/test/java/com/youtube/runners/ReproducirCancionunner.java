package com.youtube.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        tags = "@reproducir",
        glue = "com.youtube.stepDefinitios",
        snippets =  CucumberOptions.SnippetType.CAMELCASE)

public class ReproducirCancionunner {
}

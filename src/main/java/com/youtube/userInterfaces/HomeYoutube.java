package com.youtube.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeYoutube {
    public static final Target lblValidarProducto = Target.the("Validar producto").
            located(By.xpath("//form[@id='search-form']"));

}

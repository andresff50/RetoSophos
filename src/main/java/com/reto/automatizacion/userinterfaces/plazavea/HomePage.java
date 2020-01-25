package com.reto.automatizacion.userinterfaces.plazavea;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.plazavea.com.pe/")
public class HomePage extends PageObject {
    public static final Target POPOVER_BUTTON_NO = Target.the("popover dialog")
            .located(By.id("onesignal-popover-cancel-button"));
    public static final Target POPUP_LEYSECA_BUTTONCLOSE = Target.the("popup ley seca")
            .located(By.xpath("//span[contains(@class,'PopupLeySeca__close')]"));
    public static final Target NAVBAR_ELECTROYHOGAR = Target.the("dropdown electyro y hogar")
            .located(By.xpath("//a[contains(text(),'ELECTRO Y HOGAR')]"));
    public static final Target MENU_TVLEDCATEGORY = Target.the("Menu Category TV led")
            .located(By.xpath("(//a[contains(text(),'LED')])[1]"));
}

package com.sophos.test.userinterfaces.plazavea;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.plazavea.com.pe/")
public class HomePage extends PageObject {
    public static final Target BTN_NO_POPOVER = Target.the("popover dialog")
            .located(By.id("onesignal-popover-cancel-button"));
    public static final Target BTN_CLOSE_POPUP = Target.the("popup ley seca")
            .located(By.xpath("//span[contains(@class,'PopupLeySeca__close')]"));
    public static final Target LIST_NAVBAR_ELECTROYHOGAR = Target.the("dropdown electyro y hogar")
            .located(By.xpath("//a[contains(text(),'ELECTRO Y HOGAR')]"));
    public static final Target SELECT_TVLED_CATEGORY = Target.the("Menu Category TV led")
            .located(By.xpath("(//a[contains(text(),'LED')])[1]"));
}

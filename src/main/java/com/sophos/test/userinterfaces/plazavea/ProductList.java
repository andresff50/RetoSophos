package com.sophos.test.userinterfaces.plazavea;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductList {
    public static final Target LNK_ENTER_THE_PRODUCT = Target.the("Add product TV Led")
            .located(By.xpath("//div[@data-prod='50461']//child::a[@class='Showcase__name']"));
    public static final Target BTN_ADD_PRODUCT = Target.the("Add product TV Led")
            .located(By.id("ProductCard__add-to-cart"));
}

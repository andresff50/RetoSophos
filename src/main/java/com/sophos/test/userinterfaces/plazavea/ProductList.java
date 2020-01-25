package com.sophos.test.userinterfaces.plazavea;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductList {
    public static final Target LNK_ENTER_THE_PRODUCT = Target.the("Add product TV Led")
            .located(By.xpath("//div[@data-prod='50461']//child::a[@class='Showcase__name']"));

    public static final Target BTN_ADD_PRODUCT = Target.the("Add product TV Led")
            .located(By.id("ProductCard__add-to-cart"));

    public static final Target BTN_SHOPPING_CART = Target.the("Shopping cart icon button")
            .located(By.xpath("//div[@class = 'cart__ico']"));

    public static final Target INFO_PRODUCT_DATASKU = Target.the("datasku product code")
            .located(By.xpath("//div[@class='ProductCard__information']//input[@id='___rc-p-sku-ids']"));

    public static final Target INFO_PRODUCT_SHOPPING_CART = Target.the("Shopping cart datasku code")
            .located(By.id("minicart__card_51524"));
}

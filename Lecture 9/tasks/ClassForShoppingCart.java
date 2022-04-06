package lecture9;

import lecture9.models.ShoppingCart;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ClassForShoppingCart {

    ShoppingCart shoppingCart = new ShoppingCart();

    @Test
    public void testShopingCart(){
//        open web
//        choose product
//        add to cart product
        shoppingCart.setProductName(getProductNameFromProductPage());
        shoppingCart.setPrice(getProductPriceFromProductPage());
//        go to Cart
//        fill client data
//        choose delivery
//        finalise cart
        String actualPrice = getCurrentPriceFromFinalPage();
        assertThat(actualPrice).isEqualTo(shoppingCart.getPrice());
    }
}


import org.example.Coffee;
import org.example.CoffeeIngredients;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class CoffeeTest {

    @Test
    public void isEspresso() {
        CoffeeIngredients result = Coffee.calcCoffeeIngredients("espresso", 2);
        Assert.assertEquals(new CoffeeIngredients(60, 0), result);
    }

    @Test
    public void isUnknownCoffee() {
        CoffeeIngredients result = Coffee.calcCoffeeIngredients("unknown", 1);
        Assert.assertEquals(new CoffeeIngredients(0, 0), result);
    }
}
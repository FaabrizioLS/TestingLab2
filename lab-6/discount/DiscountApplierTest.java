package tudelft.discount;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountApplierTest {

    @Test
    public void testDiscountForHomeProduct() {
        Product homeProduct = new Product("Silla", 100.0, "HOME");

        ProductDao dao = Mockito.mock(ProductDao.class);
        Mockito.when(dao.all()).thenReturn(Arrays.asList(homeProduct));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        assertEquals(90.0, homeProduct.getPrice(), 0.001);
    }

    @Test
    public void testDiscountForBusinessProduct() {
        Product businessProduct = new Product("Laptop", 200.0, "BUSINESS");

        ProductDao dao = Mockito.mock(ProductDao.class);
        Mockito.when(dao.all()).thenReturn(Arrays.asList(businessProduct));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        assertEquals(220.0, businessProduct.getPrice(), 0.001);
    }

    @Test
    public void testMixedProducts() {
        Product homeProduct = new Product("Mesa", 100.0, "HOME");
        Product businessProduct = new Product("Monitor", 300.0, "BUSINESS");

        ProductDao dao = Mockito.mock(ProductDao.class);
        Mockito.when(dao.all()).thenReturn(Arrays.asList(homeProduct, businessProduct));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        assertEquals(90.0, homeProduct.getPrice(), 0.001);
        assertEquals(330.0, businessProduct.getPrice(), 0.001);
    }
}

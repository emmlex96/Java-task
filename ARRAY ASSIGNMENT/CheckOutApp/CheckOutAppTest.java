import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 public class CheckOutAppTest {

    @Test
    void subTotal_shouldSumAllItemTotalsCorrectly() {
        double[] prices = {2100.00, 550.00};
        int[] quantities = {2, 2};

        double result = CheckOutApp.calculateSubTotal(prices, quantities);
        
        assertEquals(5300.00, result, 0.01);
    }
    @Test
    void subTotal_withSingleItem_shouldReturnPriceTimesQuantity() {
        double[] prices = {1000.00};
        int[] quantities = {3};

        double result = CheckOutApp.calculateSubTotal(prices, quantities);
        
        assertEquals(3000.00, result, 0.01);
    }

    @Test
    void discount_shouldBe8PercentOfSubTotal() {
        double result = CheckOutApp.calculateDiscount(5300.00);
        
        assertEquals(424.00, result, 0.01);
    }
    @Test
    void discount_onZeroSubTotal_shouldBeZero() {
        double result = CheckOutApp.calculateDiscount(0);
        assertEquals(0.00, result, 0.01);
    }


    @Test
    void vat_shouldBe17Point5PercentOfSubTotal() {
        double result = CheckOutApp.calculateVAT(5300.00);
        
        assertEquals(927.50, result, 0.01);
    }


    @Test
    void billTotal_shouldBeSubTotalMinusDiscountPlusVAT() {
        double result = CheckOutApp.calculateBillTotal(5300.00, 424.00, 927.50);
        
        assertEquals(5803.50, result, 0.01);
    }

    @Test
    void balance_shouldBeAmountPaidMinusBillTotal() {
        double result = CheckOutApp.calculateBalance(6000.00, 5803.50);
        
        assertEquals(196.50, result, 0.01);
    }
    @Test
    void balance_whenExactAmountPaid_shouldBeZero() {
        double result = CheckOutApp.calculateBalance(5803.50, 5803.50);
        
        assertEquals(0.00, result, 0.01);
    }
}

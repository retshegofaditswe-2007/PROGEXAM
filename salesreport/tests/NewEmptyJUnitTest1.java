/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package salesreport.tests;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import salesreport.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class NewEmptyJUnitTest1 {
    
    public NewEmptyJUnitTest1() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

  class ProductTest {
private final String[] names = {
"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"
};
private final int[][] sales = {
{25, 18, 20},
{15, 10, 12},
{18, 15, 20}
};
@Test
void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
Product product = new Product(names, sales);
assertEquals(153, product.GetTotalProductsSold());
}
@Test
void GetAverageSales_WithValidData_ReturnsCorrectValue() {
Product product = new Product(names, sales);
assertEquals(17.0, product.GetAverageProductSold(), 0.001);
}
}ic }

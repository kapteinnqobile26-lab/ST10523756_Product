package test;

import Product.Product;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

// Unit tests for the Product class


// This is the fixed version of your file
public class TestPackage {

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        // Arrange - Cozy: 23 + 18 + 20 = 61
        Product product = new Product("Cozy Nights Monarch", new int[]{23, 18, 20});

        // Act
        int result = product.GetTotalProductsSold();

        // Assert
        assertEquals(61, result);
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        // Arrange - (23 + 18 + 20) / 3 = 20.33
        Product product = new Product("Cozy Nights Monarch", new int[]{23, 18, 20});

        // Act
        double result = product.GetAverageProductSold();

        // Assert - allow 0.01 difference for double
        assertEquals(20.33, result, 0.01);
    }
}


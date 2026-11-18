// Represents one product and its sales for 3 months
public abstract class Product implements IProduct {

    // Fields - private for good encapsulation
    private String productName;
    private int[] monthlySales; // sales for month 1, 2, 3

    // Constructor
    public Product(String productName, int[] monthlySales) {
        this.productName = productName;
        this.monthlySales = monthlySales;
    }

    // Getters
    public String getProductName() {
        return productName;
    }

    public int[] getMonthlySales() {
        return monthlySales;
    }

    // Returns total sales for THIS product
    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int sale : monthlySales) {
            total += sale;
        }
        return total;
    }

    // Returns average sales per month for THIS product
    @Override
    public double GetAverageProductSold() {
        return (double) GetTotalProductsSold() / monthlySales.length;
    }

    // For a single product, the most popular is itself
    // The real comparison is done in PrintProduct for all products
    @Override
    public String GetMostPopularProduct() {
        return productName;
    }

    public abstract int GetTotalProductSols();
}

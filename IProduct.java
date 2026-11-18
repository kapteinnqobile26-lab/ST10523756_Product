public interface IProduct{
int GetTotalProductSold();
double GetAverageSold();

    // Returns total sales for THIS product
    int GetTotalProductsSold();

    // Returns average sales per month for THIS product
    double GetAverageProductSold();

    String GetMostPopularProduct();

}

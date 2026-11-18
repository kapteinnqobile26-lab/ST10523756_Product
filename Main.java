public class Main {
    public static void main(String[] args) {
        // Create the 3 products with their 3 months of sales
        Product[] products = {
                new Product("Cozy Nights Monarch", new int[]{23, 18, 20}) {
                    @Override
                    public int GetTotalProductSols() {
                        return 0;
                    }

                    @Override
                    public int GetTotalProductSold() {
                        return 0;
                    }

                    @Override
                    public int GetTotalProductSold() {
                        return 0;
                    }

                    @Override
                    public double GetAverageSold() {
                        return 0;
                    }
                },
                new Product("Restonic Barbados", new int[]{15, 10, 12}) {
                    @Override
                    public int GetTotalProductSols() {
                        return 0;
                    }

                    @Override
                    public int GetTotalProductSold() {
                        return 0;
                    }

                    @Override
                    public double GetAverageSold() {
                        return 0;
                    }
                },
                new Product("Sealy Phuket", new int[]{18, 15, 20}) {
                    @Override
                    public int GetTotalProductSols() {
                        return 0;
                    }

                    @Override
                    public int GetTotalProductSold() {
                        return 0;
                    }

                    @Override
                    public double GetAverageSold() {
                        return 0;
                    }
                }
        };

        // Use PrintProduct to print everything
        PrintProduct printer = new PrintProduct();
        printer.printMonthlySales(products);
        printer.printTotalProductSales(products);
        printer.printAverageProductSales(products);
        printer.printMostPopularProduct(products);
    }
}

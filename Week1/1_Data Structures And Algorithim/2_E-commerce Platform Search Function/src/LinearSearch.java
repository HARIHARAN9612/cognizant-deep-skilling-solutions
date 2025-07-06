public class LinearSearch {
    public static Product locateByCode(Product[] itemList, int searchCode) {
        for (Product prod : itemList) {
            if (prod.productId == searchCode) {
                return prod;
            }
        }
        return null;
    }
}

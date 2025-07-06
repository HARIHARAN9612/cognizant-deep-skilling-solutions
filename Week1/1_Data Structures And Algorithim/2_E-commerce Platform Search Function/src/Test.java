public class Test {
    public void test() {
        Product[] itemList = {
                new Product(1, "Keyboard", "Hardware"),
                new Product(2, "Smartphone", "Gadgets"),
                new Product(3, "Sneakers", "Clothing"),
                new Product(4, "Headphones", "Audio"),
        };

        System.out.println("Linear Search for ID 3:");
        Product foundLinear = LinearSearch.locateByCode(itemList, 3);
        System.out.println(foundLinear.productId + " " + foundLinear.productName + " " + foundLinear.category);

        System.out.println("Binary Search for ID 2:");
        BinarySearch.arrangeByCode(itemList);
        Product foundBinary = BinarySearch.locateByCode(itemList, 2);
        System.out.println(foundBinary.productId + " " + foundBinary.productName + " " + foundBinary.category);
    }
}

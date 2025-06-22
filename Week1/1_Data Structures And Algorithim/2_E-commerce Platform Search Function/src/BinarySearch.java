import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product locateByCode(Product[] itemList, int searchCode) {
        int left = 0, right = itemList.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (itemList[middle].productId == searchCode)
                return itemList[middle];
            else if (itemList[middle].productId < searchCode)
                left = middle + 1;
            else
                right = middle - 1;
        }
        return null;
    }

    public static void arrangeByCode(Product[] itemList) {
        Arrays.sort(itemList, Comparator.comparingInt(obj -> obj.productId));
    }
}

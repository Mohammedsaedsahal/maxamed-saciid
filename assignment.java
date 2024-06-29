import java.util.HashSet;
import java.util.Set;

public class assignment{
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {2, 3, 4};

        Set<Integer> commonElements = findCommonElements(array1, array2);

        System.out.println(commonElements);
    }

    public static Set<Integer> findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonElements = new HashSet<>();

        for (int num : array1) {
            set1.add(num);
        }

        for (int num : array2) {
            if (set1.contains(num)) {
                commonElements.add(num);
            }
        }

        return commonElements;

    }
}
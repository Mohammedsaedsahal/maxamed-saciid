
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignmenttwo{


    public static void main(String[] args) {
        int[] inputArray = {1, 2, 2, 3, 4, 4, 5};
        int[] resultArray = removeDuplicates(inputArray);
        System.out.println(Arrays.toString(resultArray));
    }

    public static int[] removeDuplicates(int[] array) {
        List<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (!uniqueList.contains(array[i])) {
                uniqueList.add(array[i]);
            }
        }

        int[] uniqueArray = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArray[i] = uniqueList.get(i);
        }

        return uniqueArray;
}


}

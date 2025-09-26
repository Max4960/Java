import java.util.ArrayList;
import java.util.List;

// Definition for a pair
class Pair {
     int key;
     String value;

     Pair(int key, String value) {
         this.key = key;
         this.value = value;
     }

//     @Override
//     public String toString() {
//         return "(" + key + ", " + value + ")";
//     }
}

public class InsertionSort {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> sorted = new ArrayList<>();
        for (int i = 0; i < pairs.size(); i++) {
            int key = pairs.get(i).key;
            int j = i-1;
            Pair current = pairs.get(i);
            while (j >= 0 && pairs.get(j).key > key) {
                pairs.set(j+1, pairs.get(j));
                j--;
            }

            pairs.set(j+1, current);
            //System.out.println(pairs.toString());
            sorted.add(new ArrayList<>(pairs));
        }
        return sorted;
    }

//    public static void main(String[] args) {
//        List<Pair> pairs = new ArrayList<>();
//        pairs.add(new Pair(5, "apple"));
//        pairs.add(new Pair(2, "banana"));
//        pairs.add(new Pair(9, "cherry"));
//
//        Solution s = new Solution();
//        List<List<Pair>> sorted = s.insertionSort(pairs);
//
//        System.out.println("Final result: " + sorted);
//    }
}


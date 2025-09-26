import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> words = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            words.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
        }

        List<List<String>> ans = new ArrayList<>(words.values());
        return ans;
    }
}


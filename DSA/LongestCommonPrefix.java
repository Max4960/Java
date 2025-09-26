public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        boolean found = false;
        for (int i = 0; i < strs[0].length(); i++) {
            for (String str : strs) {
                if (str.equals("")) {
                    return "";
                }
                if (i >= str.length() || str.charAt(i) != strs[0].charAt(i)) {
                    return prefix;
                }
            }
            if (!found) {
                prefix += strs[0].charAt(i);
            }
        }
        return prefix;
    }
}

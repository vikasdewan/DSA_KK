import java.util.Arrays;

public class SearhInString {
    public static void main(String[] args) {
        String name = "vikas";
        char target = 'k';
        // System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        return false;
    }
}
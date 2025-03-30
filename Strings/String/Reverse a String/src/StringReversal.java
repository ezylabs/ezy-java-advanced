public class StringReversal {
    public static String reverseStringSimple(String str) {
        char[] chars = str.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i]; // do not use += inside a loop. creates too many strings
        }
        return reversed;
    }


    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
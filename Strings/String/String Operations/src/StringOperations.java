

public class StringOperations {

    public static String createString() {
        return "Hello, Java!";
    }

    public static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    public static int getStringLength(String str) {
        return str.length();
    }

    public static char getFirstCharacter(String str) {
        return str.charAt(0);
    }

    public static String extractSubstring(String str, int startIndex) {
        return str.substring(startIndex);
    }

    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static boolean compareIgnoreCase(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }

    public static boolean containsSubstring(String str, String search) {
        return str.contains(search);
    }

    public static int getIndexOfSubstring(String str, String search) {
        return str.indexOf(search);
    }

    public static String convertToLower(String str) {
        return str.toLowerCase();
    }

    public static String convertToUpper(String str) {
        return str.toUpperCase();
    }

    public static String trimString(String str) {
        return str.trim();
    }

    public static String replaceSubstring(String str, String target, String replacement) {
        return str.replace(target, replacement);
    }

    public static void main(String[] args) {
        String literalString = createString();

        System.out.println("Concatenated: " + concatenateStrings(literalString, " Let's learn."));
        System.out.println("Length: " + getStringLength(literalString));
        System.out.println("First Character: " + getFirstCharacter(literalString));
        System.out.println("Substring: " + extractSubstring(literalString, 7));
        System.out.println("Equals Check: " + compareStrings(literalString, new String("Hello, Java!")));
        System.out.println("Ignore Case Check: " + compareIgnoreCase("java", "JAVA"));
        System.out.println("Contains 'Java': " + containsSubstring(literalString, "Java"));
        System.out.println("Index of 'Java': " + getIndexOfSubstring(literalString, "Java"));
        System.out.println("Lower Case: " + convertToLower(literalString));
        System.out.println("Upper Case: " + convertToUpper(literalString));
        System.out.println("Trimmed: '" + trimString("  Trim me  ") + "'");
        System.out.println("Replaced: " + replaceSubstring(literalString, "Java", "World"));
    }
}

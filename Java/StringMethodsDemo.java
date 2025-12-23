package Java;

class StringMethodsDemo {
public static void main(String[] args) {
String str = "Java Programming";
String str2 = "java programming";
System.out.println(" String Methods Demonstration \n");
// 1. length()
System.out.println("1. Length of string: " + str.length());
// 2. charAt()
System.out.println("2. Character at index 5: " + str.charAt(5));
// 3. substring()
System.out.println("3. Substring(5): " + str.substring(5));
System.out.println(" Substring(5, 11): " + str.substring(5, 11));
// 4. equals() and equalsIgnoreCase()
System.out.println("4. Equals: " + str.equals(str2));
System.out.println(" Equals Ignore Case: " + str.equalsIgnoreCase(str2));
// 5. compareTo()
System.out.println("5. CompareTo (lexicographically): " + str.compareTo(str2));
// 6. toUpperCase() and toLowerCase()
System.out.println("6. Uppercase: " + str.toUpperCase());
System.out.println(" Lowercase: " + str.toLowerCase());
// 7. trim()
String spaced = " Hello World ";
System.out.println("7. Trimmed string: '" + spaced.trim() + "'");
// 8. startsWith() and endsWith()
System.out.println("8. Starts with 'Java': " + str.startsWith("Java"));
System.out.println(" Ends with 'ing': " + str.endsWith("ing"));
// 9. contains()
System.out.println("9. Contains 'gram': " + str.contains("gram"));
// 10. indexOf() and lastIndexOf()
System.out.println("10. Index of 'a': " + str.indexOf('a'));
System.out.println(" Last index of 'a': " + str.lastIndexOf('a'));
// 11. replace() and replaceAll()
System.out.println("11. Replace 'Java' with 'Python': " + str.replace("Java", "Python"));
System.out.println(" Replace all 'a' with '*': " + str.replaceAll("a", "*"));

// 12. split()
System.out.println("12. Splitting words:");
String[] words = str.split(" ");
for (String w : words)
System.out.println(" " + w);
// 13. concat()
System.out.println("13. Concatenation: " + str.concat(" is fun!"));
// 14. isEmpty() and isBlank()
String emptyStr = "";
String blankStr = " ";
System.out.println("14. isEmpty() on '': " + emptyStr.isEmpty());
System.out.println(" isBlank() on ' ': " + blankStr.isBlank());
// 15. valueOf()
int num = 2025;
System.out.println("15. String.valueOf(2025): " + String.valueOf(num));
// 16. join()
System.out.println("16. Join example: " + String.join("-", "Java", "Python", "C++"));
// 17. toCharArray()
System.out.println("17. Characters in string:");
char[] chars = str.toCharArray();
for (char c : chars)
System.out.print(c + " ");
System.out.println();
// 18. matches() (regex)
String email = "test123@gmail.com";

System.out.println("\n18. Email validation: " + email.matches("[a-z0-9]+@[a-z]+\\.[a-z]{2,3}"));

// 19. repeat()
System.out.println("19. Repeat string 3 times: " + "Hi ".repeat(3));
// 20. format()
System.out.println("20. Formatted String: " + String.format("Name: %s | Age: %d",
"Ram", 21));
}
}
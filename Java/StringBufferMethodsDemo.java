package Java;

class StringBufferMethodsDemo {
public static void main(String[] args) {
System.out.println(" StringBuffer Methods Demonstration \n");
// 1. Creating a StringBuffer
StringBuffer sb = new StringBuffer("Java");
System.out.println("1. Initial Buffer: " + sb);
// 2. append() – Add text at the end
sb.append(" Programming");
System.out.println("2. After append(): " + sb);
// 3. insert() – Insert text at a specific position
sb.insert(4, " Language");
System.out.println("3. After insert(): " + sb);
// 4. replace() – Replace characters between start and end indices
sb.replace(5, 13, "Script");
System.out.println("4. After replace(): " + sb);
// 5. delete() – Remove characters between given indices
sb.delete(0, 5);
System.out.println("5. After delete(): " + sb);
// 6. reverse() – Reverse the entire sequence
sb.reverse();
System.out.println("6. After reverse(): " + sb);
sb.reverse(); // Restore original content
// 7. capacity() – Get the current capacity of the buffer
System.out.println("7. Current capacity: " + sb.capacity());
// 8. ensureCapacity() – Increase capacity if needed
sb.ensureCapacity(50);
System.out.println("8. Capacity after ensureCapacity(50): " + sb.capacity());
// 9. length() – Current number of characters
System.out.println("9. Length of buffer: " + sb.length());
// 10. setLength() – Truncate or extend the length
sb.setLength(8);
System.out.println("10. After setLength(8): '" + sb + "'");
// 11. charAt() – Get character at specific index
sb.setLength(0);
sb.append("JavaStringBuffer");

System.out.println("11. Character at index 4: " + sb.charAt(4));
// 12. setCharAt() – Change a character at a specific index
sb.setCharAt(0, 'K');
System.out.println("12. After setCharAt(0, 'K'): " + sb);
// 13. substring() – Extract part of the sequence
System.out.println("13. substring(4): " + sb.substring(4));
System.out.println(" substring(4, 10): " + sb.substring(4, 10));
// 14. deleteCharAt() – Remove character at given index
sb.deleteCharAt(0);
System.out.println("14. After deleteCharAt(0): " + sb);
// 15. append() with multiple types (method overloading)
sb.append(" Example ").append(2025).append(' ').append(true);
System.out.println("15. After multiple appends: " + sb);
// 16. capacity grows automatically when exceeded
System.out.println("16. Capacity before large append: " + sb.capacity());
sb.append(" This text is to check automatic capacity increment.");
System.out.println(" Capacity after large append: " + sb.capacity());
// 17. getChars() – Copy characters into an array
char[] arr = new char[10];
sb.getChars(0, 10, arr, 0);
System.out.print("17. getChars() output: ");
for (char c : arr)
System.out.print(c);
System.out.println();
}
}

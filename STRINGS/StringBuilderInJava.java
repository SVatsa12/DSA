package STRINGS;

public class StringBuilderInJava {
    public static void main(String[] args) {
               // 1. Creating StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Initial: " + sb);

        // 2. append() -> adds text at the end
        sb.append(" World");
        System.out.println("After append: " + sb);

        // 3. insert() -> inserts at specific index
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // 4. replace() -> replaces part of string
        sb.replace(6, 10, "Code");
        System.out.println("After replace: " + sb);

        // 5. delete() -> deletes characters
        sb.delete(5, 10);
        System.out.println("After delete: " + sb);

        // 6. deleteCharAt() -> deletes single character
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        // 7. reverse() -> reverses string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 8. length() -> gives length
        System.out.println("Length: " + sb.length());

        // 9. capacity() -> internal buffer size
        System.out.println("Capacity: " + sb.capacity());

        // 10. charAt() -> access character
        System.out.println("Character at index 2: " + sb.charAt(2));

        // 11. setCharAt() -> change character
        sb.setCharAt(2, 'X');
        System.out.println("After setCharAt: " + sb);

        // 12. substring() -> get substring
        System.out.println("Substring (1 to 4): " + sb.substring(1, 4));

        // 13. toString() -> convert to String
        String finalString = sb.toString();
        System.out.println("Final String: " + finalString);
    }
}

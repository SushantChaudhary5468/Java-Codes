/*
// 1.String is non-primitive data type(cause size is not fixed).
//primitive:-boolean,byte,short,Int,float,long,double
//Non-Primitive:-Arrays,Classes,Strings.

// 2. String is a sequence of characters.(i.e Array of characters).
// char[] c={'d','e', 'e', 'p' ,'a','k'};
// String s=new String(c); 
// is same as.... String s="deepak";

3. String is a class.


Here’s a list of the commonly used String methods in Java, mentioned line by line:
1. length()
2. charAt(int index)
3. substring(int beginIndex)
4. substring(int beginIndex, int endIndex)
5. toUpperCase()
6. toLowerCase()
7. trim()
8. equals(Object another)
9. equalsIgnoreCase(String another)
10. contains(CharSequence s)

11. startsWith(String prefix)
12. endsWith(String suffix)
13. indexOf(int ch)
14. indexOf(String str)
15. lastIndexOf(int ch)
16. lastIndexOf(String str)
17. replace(char oldChar, char newChar)
18. replace(CharSequence target, CharSequence replacement)
19. split(String regex)
20. isEmpty()

21. isBlank()
22. valueOf(Object obj)
23. compareTo(String anotherString)
24. compareToIgnoreCase(String anotherString)
25. concat(String str)
26. toCharArray()
27. intern()
28. matches(String regex)
29. repeat(int count) (Java 11 and above)
30. strip() (Java 11 and above)
31. stripLeading() (Java 11 and above)
32. stripTrailing() (Java 11 and above)


Java has numerous built-in methods across its classes, each with different purposes and applications.
 I’ll organize some of the most commonly used methods by category, along with examples to help you get 
 familiar with their usage.

1. String Class Methods

length() - Returns the length of a string.
charAt(int index) - Returns the character at a specified index.
substring(int beginIndex, int endIndex) - Returns a substring.
toUpperCase() and toLowerCase() - Converts to upper/lowercase.
trim() - Removes whitespace from both ends of a string.
equals(Object obj) - Compares two strings for equality.
java
String str = " Hello World ";
System.out.println("Length: " + str.length()); // Length: 13
System.out.println("Character at index 1: " + str.charAt(1)); // H
System.out.println("Substring: " + str.substring(1, 5)); // Hell
System.out.println("Uppercase: " + str.toUpperCase()); // HELLO WORLD
System.out.println("Trimmed: " + str.trim()); // Hello World


Java’s String class offers many methods for manipulating and inspecting strings. Here’s a list of some of the most commonly used methods, along with examples.
1. length()
Returns the length of the string.
java
Copy code
String str = "Hello";
System.out.println(str.length()); // Output: 5
2. charAt(int index)
Returns the character at the specified index.
java
Copy code
String str = "Hello";
System.out.println(str.charAt(1)); // Output: e
3. substring(int beginIndex) and substring(int beginIndex, int endIndex)
Extracts a substring starting from beginIndex.
Extracts a substring from beginIndex to endIndex (exclusive).
java
Copy code
String str = "Hello World";
System.out.println(str.substring(6)); // Output: World
System.out.println(str.substring(0, 5)); // Output: Hello
4. toUpperCase() and toLowerCase()
Converts all characters in the string to uppercase or lowercase.
java
Copy code
String str = "Hello";
System.out.println(str.toUpperCase()); // Output: HELLO
System.out.println(str.toLowerCase()); // Output: hello
5. trim()
Removes leading and trailing whitespace.
java
Copy code
String str = "   Hello World   ";
System.out.println(str.trim()); // Output: Hello World
6. equals(Object another) and equalsIgnoreCase(String another)
Compares two strings for equality.
Compares two strings, ignoring case differences.
java
Copy code
String str1 = "Hello";
String str2 = "hello";
System.out.println(str1.equals(str2)); // Output: false
System.out.println(str1.equalsIgnoreCase(str2)); // Output: true
7. contains(CharSequence s)
Checks if the string contains the specified sequence of characters.
java
Copy code
String str = "Hello World";
System.out.println(str.contains("World")); // Output: true

8. startsWith(String prefix) and endsWith(String suffix)
Checks if the string starts or ends with a specified prefix or suffix.
java
Copy code
String str = "Hello World";
System.out.println(str.startsWith("Hello")); // Output: true
System.out.println(str.endsWith("World")); // Output: true

9. indexOf(int ch) and indexOf(String str)
Returns the index of the first occurrence of the specified character or substring.
java
Copy code
String str = "Hello World";
System.out.println(str.indexOf('o')); // Output: 4
System.out.println(str.indexOf("World")); // Output: 6

10. lastIndexOf(int ch) and lastIndexOf(String str)
Returns the index of the last occurrence of the specified character or substring.
java
Copy code
String str = "Hello World";
System.out.println(str.lastIndexOf('o')); // Output: 7

11. replace(char oldChar, char newChar) and replace(CharSequence target, CharSequence replacement)
Replaces all occurrences of oldChar with newChar.
Replaces all occurrences of target with replacement.
java
Copy code
String str = "Hello World";
System.out.println(str.replace('o', 'a')); // Output: Hella Warld
System.out.println(str.replace("World", "Java")); // Output: Hello Java

12. split(String regex)
Splits the string around matches of the given regular expression.


String str = "apple,banana,orange";
String[] fruits = str.split(",");
System.out.println(Arrays.toString(fruits)); // Output: [apple, banana, orange]

13. isEmpty() and isBlank()
isEmpty() // returns true if the string is empty (length() == 0).
isBlank() // returns true if the string is empty or contains only whitespace.


String str = "   ";
System.out.println(str.isEmpty()); // Output: false
System.out.println(str.isBlank()); // Output: true

14. valueOf()
Converts different data types to a string.
java
Copy code
int num = 123;
String str = String.valueOf(num);
System.out.println(str); // Output: 123

15. compareTo(String anotherString) and compareToIgnoreCase(String anotherString)
Compares two strings lexicographically.
Compares two strings lexicographically, ignoring case differences.
java
Copy code
String str1 = "apple";
String str2 = "banana";
System.out.println(str1.compareTo(str2)); // Output: -1 (apple is lexicographically before banana)

16. concat(String str)
Concatenates the specified string to the end of the current string.


String str1 = "Hello";
String str2 = "World";
System.out.println(str1.concat(" ").concat(str2)); // Output: Hello World

17. toCharArray()
Converts the string into a character array.
java
Copy code
String str = "Hello";
char[] chars = str.toCharArray();
System.out.println(Arrays.toString(chars)); // Output: [H, e, l, l, o]

18. intern()
Returns a canonical representation of the string from the string pool.


String str1 = new String("Hello").intern();
String str2 = "Hello";
System.out.println(str1 == str2); // Output: true (both reference the same interned string)

19. matches(String regex)
Checks if the string matches the specified regular expression.


String str = "12345";
System.out.println(str.matches("\\d+")); // Output: true (only digits)

20. repeat(int count) (Java 11 and above)
Repeats the string count times.


String str = "Hello ";
System.out.println(str.repeat(3)); // Output: Hello Hello Hello 

21. strip(), stripLeading(), and stripTrailing() (Java 11 and above)
strip() removes leading and trailing whitespace (similar to trim(), but more Unicode-aware).
stripLeading() removes only leading whitespace.
stripTrailing() removes only trailing whitespace.
java
Copy code
String str = "   Hello World   ";
System.out.println(str.strip()); // Output: Hello World
System.out.println(str.stripLeading()); // Output: "Hello World   "
System.out.println(str.stripTrailing()); // Output: "   Hello World"


*/
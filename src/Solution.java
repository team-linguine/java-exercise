//TODO:Write a function called repeatString which repeats the given String src exactly count times.
public class Solution {

    public static String repeatStr(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }

        return sb.toString();
    }

}


//EXAMPLE: repeatStr(6, "I") // "IIIIII"
//         repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"
public class Atbash {

    public static void main(String... args) {
        String test1 = "Apple";
        String test2 = "apple";

        encryptAtbash(test1);
        encryptAtbash(test2);
    }

    public static void encryptAtbash(String initial) {
        String encrypted;
        char[] postArray = new char[initial.length()];
        int converted;

        for (int i =0; i<initial.length(); i++) {

            if (initial.charAt(i) >= 65 && initial.charAt(i) <= 90) {
                converted = initial.charAt(i) -65;
                converted = 90-converted;
                postArray[i] = (char) converted;
            } else if (initial.charAt(i) >= 97 && initial.charAt(i) <= 122) {
                converted = initial.charAt(i) + -97;
                converted = 122 - converted;
                postArray[i] = (char) converted;
            } else {
                postArray[i] = initial.charAt(i);
            }
        }
        encrypted = String.valueOf(postArray);
        System.out.println(encrypted);
    }
}

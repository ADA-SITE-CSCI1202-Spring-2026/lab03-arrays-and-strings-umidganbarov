public class EXERCISE7 {

    

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length()-1;i>-1; --i) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        
        String original = "Salam Baki!";String reversed = reverseString(original);

        System.out.println("ARGINAL== " + original);
        System.out.println("EDITED== " + reversed);
    }
}
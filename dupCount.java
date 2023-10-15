import java.util.Scanner;
public class dupCount {
    public static void main(String[] args) {

       Scanner sc= new Scanner(System.in);


        String inputString = sc.nextLine();

        
        char[] charArray = inputString.toCharArray();

        
        int[] charCount = new int[256]; // Assuming ASCII characters

        
        for (char ch : charArray) {
            charCount[ch]++;
        }

        
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println("Character '" + (char) i + "' appears " + charCount[i] + " times.");
            }
            sc.close();
        }
    }
}

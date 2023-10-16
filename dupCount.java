import java.util.Scanner;
public class dupCount {
    public static void main(String[] args) {

       Scanner sc= new Scanner(System.in);


        String inputString = sc.nextLine();

        
        char[] charArray = inputString.toCharArray();

        
        int[] cnt = new int[256];

        
        for (char ch : charArray) {
            cnt[ch]++;
        }

        
        for (int i = 0; i <cnt.length; i++) {
            if (cnt[i] > 1) {
                System.out.println("Character '" + (char) i + "' appears " + cnt[i] + " times.");
            }
            sc.close();
        }
    }
}

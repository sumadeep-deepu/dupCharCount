import java.util.Scanner;

class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");

        String inputString = sc.nextLine();

        char[] charArray = inputString.toCharArray();

        int[] cnt = new int[256];

        for (char ch : charArray) {
            if (ch != ' ') { 
                cnt[ch]++;
            }
        }

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > 1) {
                if ((char) i != ' ') { 
                    System.out.println("Character " + (char) i + ": " + cnt[i] + " times");
                }
            }
        }

        sc.close();
    }
}

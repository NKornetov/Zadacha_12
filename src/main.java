import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String text = in.nextLine();

        char[] chArray = text.toCharArray();

        for(int i = 0; i<chArray.length; i++) {
            if (chArray[i] == ' ') {

                chArray[i] = 0; // нашел это как самый простой способ вставить null в char, работает :)
            }
        }
        System.out.print(chArray);


    }
}
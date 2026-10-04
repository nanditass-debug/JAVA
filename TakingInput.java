import java.util.Scanner;
public class TakingInput {
    static void main(String[] args) {
        System.out.println("Taking Input From User");
        Scanner Ace = new Scanner(System.in);
        System.out.println("Enter number 1");
        //int a = Ace.nextInt();
        float a = Ace.nextFloat();
        System.out.println("Enter number 2");
        //int b = Ace.nextInt();
        float b = Ace.nextFloat();
//        int sum = a + b;
        float sum = a + b;
        System.out.println("The sum of two numbers is : ");
        System.out.println(sum);
        boolean b1 = Ace.hasNextInt(); //check whether the input is taking from input is of the data type that we mention
        System.out.println(b1);
        String str = Ace.next();//print only one word and don't print the space and after space words
        String str1 = Ace.nextLine();//print the whole line
        System.out.println(str);
        System.out.println(str1);
    }
}

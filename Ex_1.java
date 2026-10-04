import java.util.Scanner;
public class Ex_1 {
    static void main(String[] args) {
        //Question 1(Calculate percentage of 5 subject marks)
        Scanner Tae = new Scanner(System.in);
        System.out.println("Enter marks of 1st subject : ");
        float a = Tae.nextFloat();
        System.out.println("Enter marks of 2nd subject : ");
        float b = Tae.nextFloat();
        System.out.println("Enter marks of 3rd subject : ");
        float c = Tae.nextFloat();
        System.out.println("Enter marks of 4th subject : ");
        float d = Tae.nextFloat();
        System.out.println("Enter marks of 5th subject : ");
        float e = Tae.nextFloat();

        System.out.println("obtainedMarks : ");
        float obtainedMarks = a+b+c+d+e;
        System.out.println(obtainedMarks);
        System.out.println("totalMarks : ");
        float totalMarks = Tae.nextFloat();
        float percentage = (obtainedMarks/(5*totalMarks))*100;
        System.out.println("percentage" + percentage + "%" );

//        Question 2(calculate cgpa of three subject)
        Scanner Tae = new Scanner(System.in);
        System.out.println("Enter Marks of 1st subject : ");
        float a = Tae.nextFloat();
        System.out.println("Enter Marks of 2nd subject : ");
        float b = Tae.nextFloat();
        System.out.println("Enter Marks of 3rd subject : ");
        float c = Tae.nextFloat();
        float obtainedMarks = a + b + c;
        System.out.println("Obtained_Marks : " + obtainedMarks );
        float cgpa = obtainedMarks/30;
        System.out.println("CGPA : " + cgpa );

//        Question 3(km to miles)
        Scanner Tae = new Scanner(System.in);
        System.out.println("Enter Distance in KM :");
        double a = Tae.nextFloat();
        double miles = a * 0.621371;
        System.out.println("Miles = " + miles );

//        Question 4(take name as input from user and greet with that name)
        Scanner Tae = new Scanner(System.in);
        System.out.println( "Enter the name : ");
        String str = Tae.nextLine();
        System.out.println("Hello " + str + " , have a good day.");

//        Question 5(detect whether the no. is int or not)
        Scanner Tae = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        boolean a = Tae.hasNextInt();
        System.out.println(a);

    }
}

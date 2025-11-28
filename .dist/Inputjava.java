import java.util.*;

public class Inputjava {
    public static void main(String[] args) {
        /* inputs in java:
        next:it reads string until it encounters a space,if there is space betwwen strings then it will not read anything after that space.so most often we use nextLine input
        nextLine
        nextInt
        nextByte
        nextFloat
        nextDouble
        nextBoolean
        nextShort
        nextLong

        inorder to use inputs in java,we need to use scanner class in java
        which is declared as:Scanner scanner_name=new Scanner(System.in);
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum =a+b;

//        System.out.println("Enter two strings:");
//        String name=sc.next();//give input as Tony
//        System.out.println(name);
//        String name2=sc.next();//give input as Tony Stark
//        System.out.println("Name is:"+name);//it will not print stark

        //other option?best use nextLine
//        System.out.println("Enter a large sentence:");
//        String name3=sc.nextLine();//give long sentence as input
//        System.out.println("sentence is:"+name3);
        System.out.println("Sum is:"+sum);
        System.out.println("Enter a floating point number:");
        float f=sc.nextFloat();
        System.out.println("Number is:"+f);


        System.out.println("Enter two number whose product is to be found:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int p=x*y;
        System.out.println("Product is:"+p);

        sc.close();
    }
}

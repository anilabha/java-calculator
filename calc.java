import java.util.Scanner;
public class calc {
     public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        double x,y;
        System.out.println("enter the 1st no: ");
        x=reader.nextDouble();
        System.out.println("enter the 2st no: ");
        y=reader.nextDouble();
        System.out.println("enter your choice(+,-,*,/): ");
        char choice = reader.next().charAt(0);
        double result;
        switch (choice)
        {
            case'+':
                result=x+y;
                System.out.println("result= "+ result);
                break;
            case '-':
                result=x-y;
                System.out.println("result= "+ result);
                break;
            case '*':
                    result=x*y;
                    System.out.println("result= "+ result);
                    break;
            case '/':
                        result=x/y;
                        System.out.println("result= "+ result);
                        break;
        }



    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //mini project
        Scanner sc =new Scanner (System.in);
        int myNumber =(int)(Math.random()*100);
        int guess=0;

        do{
            System.out.println("guess number:");
             guess= sc.nextInt();
            if(guess==myNumber){
                System.out.println("u are correct");
                break;
            }
            else if (guess> myNumber){
                System.out.println("your number is larger ");
            }
            else   {
                System.out.println("your number is smaller ");
            }
        }while(guess>=0);

        System.out.print("my number");
        System.out.println(myNumber);
    }
}

import java.util.Scanner;
import java.util.InputMismatchException;

public class chapter12 {

    public static void main(String[] args) {
	

//input
                Scanner Keyboard = new Scanner(System.in);

                int sum=0,num=1;
               
                System.out.println("enter numbers... to get result enter 0");
//loop
                do
                {
                    try{
                        num = Keyboard.nextInt();
                        sum = num+sum;
                    }
                    catch(InputMismatchException ex){
                        System.out.println("ErroR!!...invalid input...numbers only");
                        String res = Keyboard.nextLine();
                    }
                }while (!(num == 0));
                System.out.println("The sum of all numbers entered is " + sum);



            }

        }

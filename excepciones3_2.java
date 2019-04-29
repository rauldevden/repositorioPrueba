package excepciones3_mltiplicarnumeros;
import java.util.*;
public class excepciones3_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=0,num2=0;
        boolean repite;
        do{
            try{
                repite=false;
                System.out.print("Dime el primer número: ");
                num1=sc.nextInt();
            }
            catch (InputMismatchException e){
                repite=true;
                System.out.println(" ** NUMERO INTRODUCIDO NO VÁLIDO ** ");
                sc.next();
            }
        }while(repite);
        do{
            try{
                repite=false;
                System.out.print("Dime el segundo número: ");
                num2=sc.nextInt();
            }
            catch (InputMismatchException e){
                repite=true;
                System.out.println(" ** NUMERO INTRODUCIDO NO VÁLIDO **");
                sc.next();
            }
        }while(repite);
        System.out.println( ">> El resultado de multiplicar los 2 números introducidos es: "+num1+" x "+num2+" = "+num1*num2+ " <<");
    }
}

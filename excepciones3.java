package excepciones3_mltiplicarnumeros;
import java.util.*;
public class excepciones3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        boolean continua;
        do{
            try{
                continua=false;
                System.out.print("Dime el primer número: ");
                num1=sc.nextInt();
                System.out.print("Dime el segundo número: ");
                num2=sc.nextInt();
                System.out.println("La multiplicación de los 2 números es: "+num1*num2);
            }catch (InputMismatchException e){
                System.out.println(" ** NUMERO INTRODUCIDO NO VÁLIDO ** ");
                continua=true;
                sc.next();
            }
        }while (continua);
    }
}

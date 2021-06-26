import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int number;
        int numCounter=0;
        int numberBas;

        int result=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        number=input.nextInt();
        int tempNumber=number;

        while (tempNumber!=0){
            tempNumber/=10;
            numCounter++;
        }

        tempNumber=number;

        while (tempNumber!=0){

            numberBas=tempNumber % 10;
            int numberPow=1;

            for(int i=1; i<=numCounter;i++){
                numberPow*=numberBas;
            }

            result+=numberPow;
            tempNumber/=10;
        }

        if (result==number){
            System.out.println(number+" sayısı bir Armstrong sayıdır.");
        }else
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
    }
}

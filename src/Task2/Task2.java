package Task2;
import java.util.Scanner;
public class Task2 {

    public static String primeFactors(int x, String answer) {
        int num=x;
        for(int i=2;i<=num;i++){
            if (x%i==0) {
              answer+=i+" ";
              x/=i;
              i=1;
            }}
        return answer;}

    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER:");
        String number=sc.next();
        for (int i=0;i<number.length();i++){
            if ((int)number.charAt(i)<48 || (int)number.charAt(i)>57)
            {
                System.out.print("ERROR!!! NOT AN INTEGER");
                return;
            }
        }
        String answer="1 ";
        //переводим число в int
        int x = 0;
        for (int i = 0; i < number.length() ; i++) {
            x*=10;
            x+=(int)number.charAt(i)-48;
        };
        System.out.print("PRIME FACTORS : " + primeFactors(x, answer));
    }
}

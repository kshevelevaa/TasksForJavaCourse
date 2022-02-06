package Task1;

public class Task1 {
    static int sumOfNumbers(int count, String numbers){
        int sum=0;
        for(int i=0; i<count; i++) {
            if(numbers.charAt(i)>=48 && numbers.charAt(i)<=57)
                sum+=numbers.charAt(i)-48;
        }
        return sum;
    };
    public static void main(String[] args) {
        String numbers="";
        int count=(int)((Math.random() * ((9) + 1)) + 0);//количество цифр в строке
        for (int i = 0; i < count; i++) {
            numbers+=(char)((Math.random() * ((93) + 1)) + 33);
        }
        System.out.println("String: " + numbers);
        //создали,записали,вывели строку
        System.out.print("Sum of numbers: ");
        System.out.println(sumOfNumbers(count, numbers));
    }
}

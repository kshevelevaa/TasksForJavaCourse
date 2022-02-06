package Task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        System.out.println("ENTER A NUMBER");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int turnOver=0;
        int count =0;
        while(number>0){
            count++;
            int k=number%10;
            number/=10;
            turnOver=turnOver*10+k;
            }
        String [] numbers= new String[7];
        for (int i=0;i<7;i++) numbers[i]="";
        for(int i=0;i<count;i++)
        {
            switch(turnOver%10) {
                case 0: {
                    numbers[0] += "  ***  ";
                    numbers[1] += " *   * ";
                    numbers[2] += "*     *";
                    numbers[3] += "*     *";
                    numbers[4] += "*     *";
                    numbers[5] += " *   * ";
                    numbers[6] += "  ***  ";
                    turnOver/=10;
                    break;
                }
                case 1:{
                    numbers[0] += "   **  ";
                    numbers[1] += "  ***  ";
                    numbers[2] += " * **  ";
                    numbers[3] += "   **  ";
                    numbers[4] += "   **  ";
                    numbers[5] += "   **  ";
                    numbers[6] += "  **** ";
                    turnOver/=10;
                    break;
                }
                case 2:{
                    numbers[0] += "  **   ";
                    numbers[1] += " *  *  ";
                    numbers[2] += "    *  ";
                    numbers[3] += "  **   ";
                    numbers[4] += " *     ";
                    numbers[5] += " *     ";
                    numbers[6] += " ****  ";
                    turnOver/=10;
                    break;
                }
                case 3:{
                    numbers[0] += "  **   ";
                    numbers[1] += " *  *  ";
                    numbers[2] += "    *  ";
                    numbers[3] += "  **   ";
                    numbers[4] += "    *  ";
                    numbers[5] += " *  *  ";
                    numbers[6] += "  **   ";
                    turnOver/=10;
                    break;
                }
                case 4:{
                    numbers[0] += " *  *  ";
                    numbers[1] += " *  *  ";
                    numbers[2] += " *  *  ";
                    numbers[3] += " ****  ";
                    numbers[4] += "    *  ";
                    numbers[5] += "    *  ";
                    numbers[6] += "    *  ";
                    turnOver/=10;
                    break;
                }
                case 5:{
                    numbers[0] += " ****  ";
                    numbers[1] += " *     ";
                    numbers[2] += " ***   ";
                    numbers[3] += "    *  ";
                    numbers[4] += "    *  ";
                    numbers[5] += " *  *  ";
                    numbers[6] += "  **   ";
                    turnOver/=10;
                    break;
                }
                case 6:{
                    numbers[0] += "  **   ";
                    numbers[1] += " *  *  ";
                    numbers[2] += " *     ";
                    numbers[3] += " ***   ";
                    numbers[4] += " *  *  ";
                    numbers[5] += " *  *  ";
                    numbers[6] += "  **   ";
                    turnOver/=10;
                    break;
                }
                case 7:{
                    numbers[0] += " ***** ";
                    numbers[1] += "     * ";
                    numbers[2] += "    *  ";
                    numbers[3] += "   *   ";
                    numbers[4] += "  *    ";
                    numbers[5] += " *     ";
                    numbers[6] += " *     ";
                    turnOver/=10;
                    break;
                }
                case 8:{
                    numbers[0] += "  ***  ";
                    numbers[1] += " *   * ";
                    numbers[2] += " *   * ";
                    numbers[3] += "  ***  ";
                    numbers[4] += " *   * ";
                    numbers[5] += " *   * ";
                    numbers[6] += "  ***  ";
                    turnOver/=10;
                    break;
                }
                case 9:{
                    numbers[0] += "  **   ";
                    numbers[1] += " *  *  ";
                    numbers[2] += " *  *  ";
                    numbers[3] += "  ***  ";
                    numbers[4] += "    *  ";
                    numbers[5] += " *  *  ";
                    numbers[6] += "  **   ";
                    turnOver/=10;
                    break;
                }
            }

        }
        for (int i=0; i<7;i++) System.out.println(numbers[i]);
    }}


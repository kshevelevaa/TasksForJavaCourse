package Task3;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    static void countOfLetters(String word, Dictionary[] dict, int i){
        int count=0;
        Pattern pattern1=Pattern.compile("[уеыаоэяиюУЕЫАОЭЯИЮёЁ]");
        Matcher matcher1=pattern1.matcher(word);
        for (int j=0; j<=word.length();j++){
            if(pattern1.matcher(word.substring(0,j)).find()) {
                word=word.substring(0,j-1) + Character.toUpperCase(word.charAt(j-1)) + word.substring(j);
                break;
            }
        }
        while( matcher1.find()) count++;
        Dictionary dict1=new Dictionary(word,count);//сам объект
        dict[i]=dict1;
        System.out.println( word +" contains " + count + " vowels");

        return;
    }
    public static void main(String[] args) {
        System.out.println("ENTER A SENTENCE");
        Scanner sc=new Scanner(System.in);
        String sentence= sc.nextLine();
        String[] word=sentence.split(" ");
        Dictionary[] dict= new Dictionary[10];//массив оьбъектов
        int count=0;
        System.out.println("*********************************************************");
        for(int i=0;i<word.length;i++) {
            count++;
            countOfLetters(word[i], dict, i);
        }
        for (int i=0;i<count-1;i++)
            for( int j=i+1; j<count;j++)
            if (dict[i].getVowelCount()<= dict[j].getVowelCount()){
                Dictionary t= dict[i];
                dict[i]=dict[j];
                dict[j]=t;
        }
        System.out.println("*********************************************************");
        System.out.println("SORTED LIST OF WORDS");
        for (int i=0; i<count;i++)
            System.out.println(dict[i].getWord());
        }
    }


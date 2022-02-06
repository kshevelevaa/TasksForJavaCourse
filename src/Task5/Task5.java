package Task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        System.out.println("ENTER THE VOLUME OF THE SAFE");
        Scanner sc=new Scanner(System.in);
        int safeVolume=sc.nextInt();
        Subject[] list= new Subject[10];
        for (int i=0; i<10;i++){//заполняем массив
            int k=(int)(Math.random()*(100+1)+1);//объем
            int c=(int)(Math.random()*(10+1)+1);//ценность
            String str="subject"+i;
            Subject subj=new Subject(c,k,str);
            list[i]=subj;
        }
        for (int i=0;i<10; i++)
            System.out.println("NAME: "+ list[i].getName() + " VOLUME: "+ list[i].getVolume()+ " VALUE: "+ list[i].getValue());
        for(int i=0;i<8;i++){
            for(int j=i;j<9;j++)
            if (list[i].getRatio()>list[j].getRatio()){
                Subject s=list[i];
                list[i]=list[j];
                list[j]=s;
            }
        }
        System.out.println("YOU CAN PUT IN SAFE:");
        for(int i=1; i<=10;i++){
            if (safeVolume-list[i-1].getVolume()>=0)
            {
                System.out.println("NAME: "+ list[i-1].getName() + " VOLUME: "+ list[i-1].getVolume()+ " VALUE: "+ list[i-1].getValue());
                safeVolume-=list[i-1].getVolume();
                i=i-1;
            };

        }
    }
}

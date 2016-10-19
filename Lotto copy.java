
/**
 * Write a description of class Lotto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Lotto
{
    public static void main(String args[]){

        ArrayList lotto = new ArrayList();
        int count = 0;
        int num=0;
        do{
            count++;
            num = (int) (Math.random()*50);
            lotto.add(num);
            System.out.println(num);
            if(count==7){
                int bonusnum=num;
                System.out.println("Bonus:"+num);
            }

        }while(count<7);
        Scanner input = new Scanner(System.in);
        int bonus =0;
        int matches=0;
        int a = 0;
        int bnum = 0;
      String bonusnum = Integer.toString(num);
        do{
            System.out.println("Input a number between 1-49");
            int numberuser=input.nextInt();
            lotto.trimToSize();
            int asize= lotto.size();
            for(int i = 0;i<asize;i++){

                if(bonusnum.equals(Integer.toString(numberuser))){
                    bonus=1;
                    bnum=1;

                }else{
                    bonus =0;

                }

                if(lotto.get(i).equals(numberuser)){
                    matches=matches+1;
                    lotto.remove(i);
                    break;

                }else if(!lotto.get(i).equals(numberuser)){
                    matches= matches;

                }
                
            }
            a++;
        }while(a<6);

        if(matches==3){
            System.out.println("YOU WON £10 !!!!");
        }  else if(matches==4){
            System.out.println("YOU WON £100 !!!!");
        } else if(matches==5 && bnum==0){
            System.out.println("YOU WON £10,000 !!!!");

        }else if(matches==6){
            System.out.println("YOU WON £1,000,000 !!!!");

        }else if(matches==5 && bnum==1){
            System.out.println("£100,000");
        }else{
            System.out.println("No matching numbers");

        }
    }
}

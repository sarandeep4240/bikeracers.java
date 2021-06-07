import java.io.*;
import java.util.*;
class BikeRacers
{
   public static void main(String[] args)
   {
     scanner sc=new Scanner(System.in);
     int speed[]=new int[5];
     for(int i=0;i<5;i++)
     {
         system.out.print("\nEnter the speed of Racer-"+(i+1)+": ");
         speed[i]=sc.nextInt();
     }
     int sum=0;
     for(int i=0;i<5;i++)
         sum+=speed[i];
     double avg=sum/5;
         System.out.print("\nAverage speed of BikeRacers is: "+avg);
     System.out.print("\nThe speed of qualifying racers are: ");
     for(int i=0;i<5;i++)
     {
         if(speed[i]>=avg)
             Systrem.out.print("\nRacer-"+(i+1)+": "+speed[i]);
      }
   }
}
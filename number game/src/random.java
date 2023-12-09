
import java.util.Random;
import java.util.Scanner;

public class random{
 
    public  int randomnumb(){
    Random ran=new Random();
     int  r1=ran.nextInt(10);
   
      return (r1+1);
    }
      public int guess(){
          System.out.println("enter any number");
          Scanner sc=new Scanner(System.in);
       int   n= sc.nextInt();
       return n;
         
          }
     
      }
    

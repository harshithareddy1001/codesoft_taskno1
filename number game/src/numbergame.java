
import java.util.Scanner;



public class numbergame  {
 
    public static void main(String[] args) {
     
         int maxattempt=5;
         int score=0;
         boolean playagain=true;
    while(playagain){
         int count=0;
        random obj=new random();
      int a=  obj.randomnumb();
      
        while(count < maxattempt){
        int b=obj.guess();
      
        if (a>b){
         System.out.println("you gussed it too low");
          
          
      }else if(a<b){
           System.out.println("you gussed it too high");
          }else{
           System.out.println("you gussed it correctly and you got 1 point");
           score++;
           break;
      }
        count++;
          
      }
     
      
         System.out.println("do you want to play again (yes/no)");
          Scanner sc=new Scanner(System.in);
          String ss=sc.next();
         playagain=ss.equals("yes");
    }
    System.out.println("your score="+score);
}
}

    
    


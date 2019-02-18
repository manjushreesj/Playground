import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sec;
      //int sec1;
      while(n>=100)
      {
        n=n/10;
      }
      sec=n%10;
      System.out.println(sec);
    }
}
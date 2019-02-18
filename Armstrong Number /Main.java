import java.util.Scanner;
class Main{
	public static void main (String[] args){
	 Scanner in=new Scanner(System.in);
    int n=in.nextInt();
      int temp;
      temp=n;
      int c=0,a;
      while(n>0)
      {
        a=n%10;
        n=n/10;
        c=c+(a*a*a);
        // Type your code here
	}
      if(temp==c)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
      
}
}
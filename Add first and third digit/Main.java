import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int frst;
      frst=n/100;
      int last;
      last=n%10;
      System.out.println(frst+last);// Type your code here
	}
}
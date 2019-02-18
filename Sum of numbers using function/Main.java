import java.util.Scanner;
class Main{
  public static int sum(int num)
  {
    int sum1=0;
    for(int i=1;i<=num;i++)
    {
      sum1=sum1+i;
    }
    return sum1;
  }
      
	public static void main (String[] args){
	Scanner in= new Scanner(System.in);
    int n=in.nextInt();
      int a=sum(n);
      System.out.println(a);// Type your code here
	}
}
package janani;
import java.util.Scanner;
public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,i,a=0,a1=0,a2=1;
System.out.println("enter the number");
Scanner ja=new Scanner(System.in);
n=ja.nextInt();
for(i=0;i<n;i++){
	a=a1+a2;
	a1=a2;
	a2=a;
	
}
System.out.println(a2+" ");
	}

}

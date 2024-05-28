package HomeWork;
import java.util.*;
public class Favnum {

	public static String Favnum(int y) {
		if(y==1 || y==10 || y==2||y==8||y==3)
			return y+" Favorite Number";
		else
			return y+" Not Favorite Number";
	}
	public static boolean check(int x) {
		if(x==0)
			return false;
		else
			return true;
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(check(x));
		System.out.println();
		//Favorite number
		int y = sc.nextInt();
		System.out.println(Favnum(y));
		
		//  Average marks
		
		int [] arr = {100,78,98,56,98};int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		System.out.println("Average Marks :");
		System.out.println("Total Marks== "+sum+" Average :"+sum/arr.length);
		//SWAP NUMBERS
		int z=20;int n=30;
		int d;
		d=n;
		n=z;
		z=d;
		System.out.println("Swapped Numbers");
		System.out.println(z+" "+n);
		
	}

}

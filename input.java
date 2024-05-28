package HomeWork;
import java.util.*;
public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your name: ");
		String s = sc.nextLine();
		System.out.println("Enter School Name: ");
		String s1 = sc.nextLine();
		System.out.println("Enter the Gender :");
		char a = sc.next().charAt(0);
		int [] arr = new int[5];
		int add =0;
		String [] aa = {"Tamil","English","Maths","Science","Social"};
		for(int i=0;i<5;i++) {
			System.out.println("Enter Your "+aa[i]+" Mark:");
			arr[i]=sc.nextInt();
			add+=arr[i];
		}
		
		float total = add/5;
		
		System.out.println("Total mark :"+ add);
		
		System.out.println("Average:"+ total);
	}

}

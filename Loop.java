package HomeWork;
import java.util.*;
public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		switch(num){
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Sunday");
			break;
		}
		
		
		String s = sc.next();
		s=s.toLowerCase();
		switch(s){
		case "male":
			System.out.println("Male");
			break;
		case "female":
			System.out.println("Female");
			break;
		}
		
		
		System.out.println("-----------------------------------");
		char a = sc.next().charAt(0);
		switch(a){
		case 'a':
			System.out.println("Vowels");
			break;
		case 'e':
			System.out.println("Vowels");
			break;
		case 'i':
			System.out.println("Vowels");
			break;
		case 'o':
			System.out.println("Vowels");
			break;
		case 'u':
			System.out.println("Vowels");
			break;
		default:
			System.out.println("Consonants");
			break;
		}
		
		System.out.println("-----------------------------------------");
		int res = num%2;
		
		switch(res){
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;
		}
		System.out.println("-----------------------------------------");
		int xx = sc.nextInt();
		int add =0; int m =2;
		for(int i=0;i<=xx;i++) {
			add = m*i;
			System.out.println("2 X "+i+" = "+add);
		}
		System.out.println("-----------------------------------------");
		int ent = sc.nextInt();
		int fac=1;
		for(int i=1;i<=ent;i++) {
			fac*=i;
		}
		
		System.out.println(fac);
		
		System.out.println("-----------------------------------------");
		
		int number = sc.nextInt();
		String str = Integer.toString(number);
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
			
		}
		System.out.println();
		int sum=0;
		while(number>0) {
			sum = number%10;
			System.out.print(sum);
			number/=10;
		}
		
	}

}

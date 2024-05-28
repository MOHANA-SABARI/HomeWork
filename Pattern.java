package HomeWork;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =1;
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(x+" ");
			}
			x+=1;
			System.out.println();
		}
		
		System.out.println("-----------Pattern 2 ---------");
		int z=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(z+" ");
				z++;
			}
		
			System.out.println();
		}
		System.out.println("-----------Pattern 3 ---------");
		
	        
	        for (int i = 1; i <= 4; i++) {
	            for (int j = 1; j <= i; j++) {
	                if ((i + j) % 2 == 0) {
	                	if(i!=2)
	                    System.out.print("0 ");
	                	else
	                		System.out.print("1 ");
	                } else {
	                    System.out.print("1 ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("-----------Pattern 4 ---------");

			for(int i=1;i<=4;i++) {
				//System.out.print("* ");
				for(int j=4;j>i;j--) {
					System.out.print("* ");
	
				}for(int k1=1;k1<=i;k1++) {
					System.out.print(k1+" ");
				}
				System.out.println();
			}
			System.out.println("-----------Pattern 5 ---------");

			for(int i=1;i<5;i++) {
				for(int j=1;j<i+1;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
			System.out.println("-----------Pattern 6 ---------");
			for(int i=1;i<=5;i++){
			    for(int j=1;j<=5;j++){
			        if(i==1 || j==1 || i==5 || j==5)
			        System.out.print("*");
			        else
			        System.out.print(" ");
			        
			    }
			    System.out.println();
			}
			
			System.out.println("-----------Pattern 7 ---------");
			
			int n = 5; // Number of lines to print
	        
	        for (int i = 1; i <= n; i++) {
	            for (int j = n; j >i; j--) {
	                System.out.print(" ");
	            }

	            for (int k = 1; k <= i; k++) {
	                System.out.print("* ");
	            }
	            
	            System.out.println();
	        }

	}

}

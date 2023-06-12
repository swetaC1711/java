//find duplicate in matrix of size(2X2)
import java.util.Scanner;

public class duplicate {
	void dup(int[][] a) {
		System.out.println("DUPLICATE:-\n");
		int flag=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				int c=0;
			
				for(int k=0;k<3;k++) {
					for(int l=0;l<3;l++) {
						if(a[i][j]==a[l][k]) {
						c++;
						flag=1;
						
					}
				}
				
			}
			System.out.println(a[i][j]+"="+c);
		}
		}
	}

	public static void main(String[] args) {
		int[][] a=new int[3][3];
		int[][] b=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values of 1st array:-\n");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("a["+i+"]["+j+"]=");
				a[i][j]=sc.nextInt();
			}
		}
		duplicate d=new duplicate();
		System.out.println("FIND DDUPLICATE:\n1.YES\n2.NO\n");
		int s=sc.nextInt();
		if(s==1) {
			d.dup(a);	
		}
		else {
			System.out.println("");
		}

	}

}

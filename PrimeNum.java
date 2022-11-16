import java.util.*;
public class PrimeNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[10];
		int i,j,m,x,k,flag=0;
		System.out.println("Enter the elements of the array: ");
		for(k=0;k<10;k++) {
			a[k]=sc.nextInt();
		}
		System.out.println("The prime numbers in the array are:  ");
		for(i=0;i<10;i++){
			m=a[i]/2;
			flag=0;
			if(a[i]==0||a[i]==1)
			continue;
			for(j=2;j<=m;j++) {
				if(a[i]%j==0) {	
					flag=1;
					break;
				}	
			}
		if(flag==0)
			System.out.println(a[i]);
		}
		sc.close();
	}
}
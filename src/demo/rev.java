package demo;

public class rev {
 public static void main(String args[]){
	 int n=123,t,rem,rev=0;
	 t=n;
	 while(n>0){
		 rem=n%10;
		 rev=rev*10+rem;
		 n=n/10;
	}
 System.out.println(rev);
 }
 
}

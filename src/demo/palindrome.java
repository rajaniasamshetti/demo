package demo;

public class palindrome {
	public static void main(String args[]){

	int n=1441,t,rem,rev=0;
	 t=n;
	 while(n>0){
		 rem=n%10;
		 rev=rev*10+rem;
		 n=n/10;
	 }
	 if(t==rev){
		 System.out.println("it is a palindrome");
	 }
	 else
	 {
System.out.println("not a palindrome");
}
}
}
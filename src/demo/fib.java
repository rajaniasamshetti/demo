package demo;

public class fib {
public static void main(String args[]){
	int f1=0,f2=1,f3 = 0,count=2;
	while(count<5)
	{
		f3=f1+f2;
		count++;
		System.out.println(f3);
	f1=f2;
	f2=f3;
	
	}
return;
}
}

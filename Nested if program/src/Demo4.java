// To find biggest of 3 numbers using nested if
public class Demo4 {
	public static void main(String[] args) {
	int a = 20 , b = 150 , c = 100;
	if(a>b)
	{
	if(a>c)
	{
	System.out.println("a is big");
	}
	else
	{
		System.out.println("c is big");
	}
}
	else
	{
	if(b>c)
	{
	System.out.println("b is big");
	}
	else
	{
	System.out.println("c is big");
	}
  }
 }
}

package assignment4;

public class D4c 

{
public D4c()
{
	this(11 ,12 ,13);
	System.out.println("default constructor");
}

public D4c(int a)
{
	this();
	System.out.println("one parameterized constructor");
}

public D4c(int a ,int b)
{
	this(12);
	System.out.println("two parameterized constructor");
}

public D4c(int a ,int b ,int c)
{
	System.out.println("three parameterized constructor");
}

public D4c(int a ,int b ,int c ,int d)
{
	this(11, 12);
	System.out.println("four parameterized constructor");
	
}
public static void main(String[] args) 
{
	new D4c(11, 13, 12 ,14);
}
}



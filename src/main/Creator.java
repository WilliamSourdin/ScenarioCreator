package main;

import scenario.Scenario;

public class Creator
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scenario a = new Scenario("HelloWorld");
		StringBuilder stringBuilder = new StringBuilder();
		a.generateElement(stringBuilder);
		
		System.out.println(stringBuilder);
	}

}

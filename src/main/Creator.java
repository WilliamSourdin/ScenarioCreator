package main;

import scenario.Scenario;

public class Creator
{

	public static void main(String[] args)
	{
		try
		{
			Scenario a = new Scenario("HelloWorld");
			a.generateScenario();
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
	}
}

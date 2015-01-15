import java.util.Scanner;
public class SubstantialPresenceTest
{
	public static void main(String[] args)
	{
		final String RESIDENT = "Your dependent is a resident alien for U.S. tax purposes.";
		final String NONRESIDENT = "Your dependent is a nonresident alien for U.S. tax purposes.";
		Scanner scan = new Scanner(System.in);
		System.out.println("How long has your dependent been physically present in the United States during 2013?");
		int year2013 = scan.nextInt();
			
		if (year2013<31)
		{
			System.out.println(NONRESIDENT);
		}
		else
		{
			System.out.println("How many days was your dependent present in the U.S during 2012?");
			int year2012 = scan.nextInt();
			System.out.println("How many days was your dependent present in the U.S during 2011?");
			int year2011 = scan.nextInt();
			int totaldays = year2013 + (year2012/3) + (year2011/6);
			if (totaldays<183)
			{
				System.out.println("For 2013, did your dependent have a tax home in a foreign country and a closer connection to that country than to the United States?(yes/no)");
				String answer = scan.next();
				if(answer.equalsIgnoreCase("yes"))
				{
					System.out.println(NONRESIDENT);
				}
				if(answer.equalsIgnoreCase("no"))
				{
					System.out.println(RESIDENT);
				}
			}
			if(totaldays>183)
			{
				System.out.println(RESIDENT);
			}
		}
	}
}
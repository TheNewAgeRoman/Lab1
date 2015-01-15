import java.util.Scanner;
public class FilingRequirements
{
	public static void main(String[] args)
	{
		final String FILE_RETURN_YES = "You must file a tax return.";
		final String FILE_RETURN_NO = "You don't need to file a tax return";
		
		System.out.println("Are you married or single?");
		Scanner scan = new Scanner(System.in);
		String relationshipAnswer = scan.nextLine();
		if(relationshipAnswer.equalsIgnoreCase("single"))
		{
			System.out.println("Were you either age 65 and older or blind?");
			String singleAnswer = scan.nextLine();
			if(singleAnswer.equalsIgnoreCase("no"))
			{
				System.out.println("How much unearned income do you make?");
				int incomeAnswer = scan.nextInt();
				if(incomeAnswer>1000)
				{
					System.out.println(FILE_RETURN_YES);
				}
				else
				{
					System.out.println("How much earned income do you make?");
					incomeAnswer = scan.nextInt();
					if(incomeAnswer>6100)
					{
						System.out.println(FILE_RETURN_YES);
					}
					else
					{
						System.out.println("How much gross income do you make?");
						incomeAnswer = scan.nextInt();
						if(incomeAnswer<1000)
						{
							System.out.println(FILE_RETURN_NO);
						}
						else
						{
							System.out.println(FILE_RETURN_YES);
						}
					}
				}
			}
			if(singleAnswer.equalsIgnoreCase("yes"))
			{
				System.out.println("How much unearned income do you make?");
				int incomeAnswer = scan.nextInt();
				if(incomeAnswer>4000)
				{
					System.out.println(FILE_RETURN_YES);
				}
				else
				{
					System.out.println("How much earned income do you make?");
					incomeAnswer = scan.nextInt();
					if(incomeAnswer>9100)
					{
						System.out.println(FILE_RETURN_YES);
					}
					else
					{
						System.out.println("How much gross income do you make?");
						incomeAnswer = scan.nextInt();
						if(incomeAnswer<4000)
						{
							System.out.println(FILE_RETURN_NO);
						}
						else
						{
							System.out.println(FILE_RETURN_YES);
						}
					}
				}
			}
		}
		if(relationshipAnswer.equalsIgnoreCase("married"))
		{
			System.out.println("Were you either age 65 and older or blind?");
			String marriedAnswer = scan.nextLine();
			if(marriedAnswer.equalsIgnoreCase("no"))
			{
				System.out.println("How much unearned income do you make?");
				int incomeAnswer = scan.nextInt();
				if(incomeAnswer>1000)
				{
					System.out.println(FILE_RETURN_YES);
				}
				else
				{
					System.out.println("How much earned income do you make?");
					incomeAnswer = scan.nextInt();
					if(incomeAnswer>6100)
					{
						System.out.println(FILE_RETURN_YES);
					}
					else
					{
						System.out.println("How much gross income do you make?");
						incomeAnswer = scan.nextInt();
						if(incomeAnswer>=5)
						{
							System.out.println("Is your spouse filing a separate return and itemizing deductions?(yes/no)");
							String spouseFilingAnswer = scan.nextLine();
							if(spouseFilingAnswer.equalsIgnoreCase("yes"))
							{
								System.out.println(FILE_RETURN_YES);
							}
							if(spouseFilingAnswer.equalsIgnoreCase("no"))
							{
								System.out.println(FILE_RETURN_NO);
							}
						}
						else
						{
							System.out.println(FILE_RETURN_NO);
						}
					}
				}
			}
			if(marriedAnswer.equalsIgnoreCase("yes"))
			{
				System.out.println("How much unearned income do you make?");
				int incomeAnswer = scan.nextInt();
				if(incomeAnswer>3400)
				{
					System.out.println(FILE_RETURN_YES);
				}
				else
				{
					System.out.println("How much earned income do you make?");
					incomeAnswer = scan.nextInt();
					if(incomeAnswer>8500)
					{
						System.out.println(FILE_RETURN_YES);
					}
					else
					{
						System.out.println("How much gross income do you make?");
						incomeAnswer = scan.nextInt();
						if(incomeAnswer>=5)
						{
							System.out.println("Is your spouse filing a separate return and itemizing deductions?(yes/no)");
							String spouseFilingAnswer = scan.nextLine();
							if(spouseFilingAnswer.equalsIgnoreCase("yes"))
							{
								System.out.println(FILE_RETURN_YES);
							}
							if(spouseFilingAnswer.equalsIgnoreCase("no"))
							{
								System.out.println(FILE_RETURN_NO);
							}
						}
						else
						{
							System.out.println(FILE_RETURN_NO);
						}
					}
				}
			}
		}
	}
}

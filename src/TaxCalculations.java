import java.util.Scanner;
//Single Formula1: $4,991.25 + 25% of amount over $36,250. (Two formulas due to the income range being)
//Single Formula2: $17,891.25 + 28% of amount over $87,850. (+ inbetween two brackets for taxes.)
//Filing Jointly Formula: $9,982.50 + 25% of amount over $72,500.
//Filing Separately Formula: $14,228.75 + 28% of amount over $73,200.
//Head of Household Formula: $6,652 + 25% of amount over $48,600.
public class TaxCalculations
{
	public static void main(String[] args)
	{
		double taxedIncome;
		final String PRINTED_INCOME = "Your taxable income is: $";
		Scanner incomeScanner = new Scanner(System.in);
		Scanner filingTypeScanner = new Scanner(System.in);
		System.out.println("Are you Single, Filing Jointly, Filing Separately, or the Head of Household?");
		String filingType = filingTypeScanner.nextLine();
		System.out.print("Please enter your taxable income: $");
		double income = incomeScanner.nextDouble();
		
		if(filingType.equalsIgnoreCase("single"))
		{
			if(income<87850)
			{
				taxedIncome = 4991.25 + ((income - (income % 50) + 25 - 36250) * .25);
				System.out.println(PRINTED_INCOME + Math.round(taxedIncome));	
			}
			else
			{
				taxedIncome = 17891.25 + ((income - (income % 50) + 25 - 87850) * .28);
				System.out.println(PRINTED_INCOME + Math.round(taxedIncome));
			}
		}
		if(filingType.equalsIgnoreCase("filing jointly"))
		{
			taxedIncome = 9982.50 + ((income - (income % 50) + 25 - 72500) * .25);
			System.out.println(PRINTED_INCOME + Math.round(taxedIncome));
		}
		if(filingType.equalsIgnoreCase("filing separately"))
		{
			taxedIncome = 14228.75 + ((income - (income % 50) + 25 - 73200) * .28);
			System.out.println(PRINTED_INCOME + Math.round(taxedIncome));
		}
		if(filingType.equalsIgnoreCase("head of household"))
		{
			taxedIncome = 6652 + ((income - (income % 50) + 25 - 48600) * .25);
			System.out.println(PRINTED_INCOME + Math.round(taxedIncome));
		}
	}
}
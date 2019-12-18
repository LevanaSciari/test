package temp2;

public class BankAccount
{
	private int sum = 0;
	
	public synchronized void add(int sumToAdd)
	{
		sum = sum + sumToAdd;
	}
	
	public int getSum()
	{
		return sum;
	}
}

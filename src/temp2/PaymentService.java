package temp2;

public class PaymentService implements Runnable 
{
	private BankAccount account;
	private int sumToPay;

	public PaymentService(BankAccount account, int sumToPay)
	{
		this.account = account;
		this.sumToPay = sumToPay;
	}
	
	public void pay()
	{
		for (int i = 0; i < sumToPay; i++){
			account.add(1);
		}
	}
	
	public void run()
	{
		pay();		
	}
}

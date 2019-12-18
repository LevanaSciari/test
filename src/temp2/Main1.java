package temp2;

public class Main1
{
	public static void main(String[] args) throws InterruptedException
	{
		BankAccount account = new BankAccount();
		
		PaymentService paymentService1 = new PaymentService(account, 1000);
		Thread t1 = new Thread(paymentService1);
		
		PaymentService paymentService2 = new PaymentService(account, 1000);
		Thread t2 = new Thread(paymentService2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(account.getSum());
	}
}

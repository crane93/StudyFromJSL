package Thread;

class Account{
	private int balance =1000;
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int money) {
		if(balance>=money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			balance -= money;
		}
	}
}

class RunnableEx21 implements Runnable{
	Account acc = new Account();
	
	public void run() {
		while(acc.getBalance() > 0) {
			int money = (int)(Math.random()*3+1) *100;
			acc.withdraw(money);
			System.out.println("balance: " + acc.getBalance());
		}
	}
}
public class AccountBalance {

	public static void main(String[] args) {
		Runnable r = new RunnableEx21();
		new Thread(r).start();
		new Thread(r).start();
		/*만약 synchronized를 안쓰고 스레드 두개를 돌리면 결과는?
		 * 음수값이 나올수도 있다. if가 있음에도 불구하고..!!
		 * 왜냐하면 스레드가 두개니 제어권을 노나가짐. 
		 * x스레드에서 이거이거해야지~라고 계획했는데 제어권이 y한테 넘어감
		 * y는 자기가 하고싶은대로 하고 제어권 x한테 넘겨줌 
		 * 제어권 다시 받은 x는 계획대로 일을 수행 but if의 조건과 맞지 않는 결과가 도출됨
		 * 
		 * 만약 진짜 은행 어플이 이렇게 설계됬다고 하면 코와이데스네~
		 * 
		 * so 제대로 synchronized를 걸어줘야합니다!
		 * */
	}

}

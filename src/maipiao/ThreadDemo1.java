package maipiao;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.log4j.Logger;

import sun.util.logging.resources.logging;

public class ThreadDemo1 {
	
	private static final Logger logger = Logger.getLogger(ThreadDemo1.class);
	
	public static void main(String[] args) {
		
		Account acc = new Account();
		
		customer ca = new customer(acc);
		customer cb = new customer(acc);
		
		new Thread(ca).start();
		new Thread(cb).start();
		
		
	}
}


/**
 * 用户
 *
 */
class customer implements Runnable {
	private static final Logger logger = Logger.getLogger(customer.class);
	
	private Account account;
	
	Lock l = new ReentrantLock();
	
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			account.deposit(1000);
		}
		
		/*l.lock();
		try {
			for (int i = 0; i < 3; i++) {
				account.deposit(1000);
			}
			//logger.debug(Thread.currentThread().getName()+"余额"+ account );
		} catch (Exception e) {
			logger.error("run()", e);
		}finally{
			l.unlock();
		}*/
	}
	public customer() {
		super();
	}
	public customer(Account account) {
		super();
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
}



/**
 * balance 账户方法
 */
class Account{
	
	private static final Logger logger = Logger.getLogger(Account.class);
	
	private double balance;
	
	//lock方法
	Lock l = new ReentrantLock();
	
	public void deposit(int amount){
		
		balance += amount;
		logger.debug(Thread.currentThread().getName() + "余额" +balance);
		/*l.lock();
		try {
			balance += amount;
			logger.debug(Thread.currentThread().getName() + "余额" +balance);
			
		} catch (Exception e) {
		}finally{
			l.unlock();
		}*/
	}
	
	//synchronizedf方法
	/*public synchronized void deposit(int amount){
		balance += amount;
		logger.debug(Thread.currentThread().getName() + "余额" +balance);
	}*/
	
	public Account() {
		super();
	}

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public double getbalance() {
		return balance;
	}

	public void setbalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "balance [balance=" + balance + "]";
	}
	

	
}


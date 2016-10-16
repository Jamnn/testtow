package maipiao;

import org.apache.catalina.tribes.membership.StaticMember;
import org.apache.log4j.Logger;

/**
 *之前的多线程
 *模拟售票程序，实现三个售票窗口同时售票100张
 */
public class ThreadDemo0 {
	
	private static final Logger logger = Logger.getLogger(ThreadDemo0.class);
	//实现Runnable接口
	public static void main(String[] args) {
		runnables run = new runnables();
		Thread w1 = new Thread(run,"w1");
		w1.start();
		
		Thread w2 = new Thread(run,"w2");
		w2.start();
		
		Thread w3 = new Thread(run,"w3");
		w3.start();
		
		
		
	}
	
	//实现Thread类
/*	public static void main(String[] args) {
		if (logger.isDebugEnabled()) {
			logger.debug("main(String[]) - start");
		}
		
		window w1 = new window();
		w1.setName("w1");
		w1.start();
		
		window w2 = new window();
		w2.setName("w2");
		w2.start();
		
		window w3 = new window();
		w3.setName("w3");
		w3.start();
		
	}*/
}


/**
 * 实现Runnable接口
 */

class runnables implements Runnable{

	private static final Logger logger = Logger.getLogger(runnables.class);
	
	int tick = 100;
	
	int a;
	
	public void run() {
		while(tick > 0){
			logger.debug(Thread.currentThread().getName() +"售票"+ --tick + "张");
			a ++;
		}
		logger.debug(a);
	}
}

/**
 *继承Thread
 * 
 
class window extends Thread{

	private static final Logger logger = Logger.getLogger(window.class);
	
	static int tick = 100;
	int a ;
	@Override
	public void run() {
		
		while (tick != 0) {
			logger.debug(Thread.currentThread().getName() +"售票"+ --tick + "张");
			a ++;
		}
		logger.debug(a);
	}
}
*/


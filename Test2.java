/**
 * 
 */
package sts;

public class Test2 {
	
	/*
	 * What will happen if these two methods are called by different threads?
	 * This is a deadlock. 
	 * mym1 starts. It locks String class. 
	 * Same time mym2 starts and it locks Integer class. 
	 * So mym1 cannot execute synchronized (Integer.class) and waits until mym2 finish and unlock it, 
	 * and mym2 cannot execute synchronized (String.class) and waits until mym1 finish and unlock it.
	 * 
	 * 
	 */
	public void mym1() {
		synchronized (String.class) {
			System.out.println("mym1 - In sychronized for String.class object");
			synchronized (Integer.class) {
				System.out.println("mym1 - In Synchronized for Integer.class object");
			}
		}
	}

	public void mym2() {
		synchronized (Integer.class) {
			System.out.println("mym2 - In Synchronized for Integer.class object");
			synchronized (String.class) {
				System.out.println("mym2 - In sychronized for String.class object");
			}
		}
	}
}

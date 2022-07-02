package com.tnsif.thread;

public class DemoThread extends Thread 
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args)
	{
		DemoThread obj=new DemoThread();
		Thread th=new Thread(obj);
		th.start();
	}

}

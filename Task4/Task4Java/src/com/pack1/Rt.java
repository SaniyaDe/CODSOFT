package com.pack1;
import java.util.Timer;
import java.util.TimerTask;

public class Rt extends TimerTask{

	Timer t=new Timer();
	public void run()
	{
		System.out.println("Time up.....");
		t.cancel();
	}
}

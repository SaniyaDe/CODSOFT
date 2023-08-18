package com.pack1;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Time_It {

	Timer t;
	public Time_It(long seconds)
	{
		t=new Timer();
		t.schedule(new Rt(),seconds*1000);
	}
	
	
	public static void takeTest(Question1[] questions)
	{
		int score=0;
		Scanner s=new Scanner(System.in);
		for(int i=0;i<questions.length;i++)
		{
			System.out.println(questions[i].prompt);
			String answer=s.nextLine();
			if(answer.equals(questions[i].answer))
			{
				score++;
			}
			System.out.println("you got "+score+"/"+questions.length);
		}
		System.out.println("Thanks for playing this quiz.");
	}
	
	public static void main(String[] args) {
		new Time_It(30);
		System.out.println("Countdown starts now!");
		
		System.out.println("You have 30 seconds to answer all the questions");
		
		String q1="What is the color of sky?"+"\n(a)red\n(b)blue\n(c)yellow\n(d)white";
		
		String q2="What is the color of your teeth?"+"\n(a)red\n(b)blue\n(c)yellow\n(d)white";
		
		String q3="What is the color of ocean?"+"\n(a)red\n(b)blue\n(c)yellow\n(d)white";
		
		String q4="What is the color of grass?"+"\n(a)red\n(b)blue\n(c)green\n(d)white";
		
		String q5="What is the color of a cherry?"+"\n(a)red\n(b)blue\n(c)yellow\n(d)white";
		
		Question1[] questions= {new Question1(q1,"b"),
								new Question1(q2,"d"),
								new Question1(q3,"b"),
								new Question1(q4,"c"),
								new Question1(q5,"a")
							   };
		
		takeTest(questions);
	}
}

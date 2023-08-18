package com.package1;
import java.util.Scanner;

public class Grades_Student{
	
	Scanner s=new Scanner(System.in);
	int Sub(int n)
	{
		
		int marks[]=new int[20];
		//for taking input
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the marks:");
			marks[i]=s.nextInt();
		}
		//for displaying
		for(int i=0;i<n;i++)
		{
			System.out.println("The marks for subject are:");
			System.out.println(marks[i]);
		}
		
		int sum_tot=0;
		for(int i=0;i<n;i++)
		{
			sum_tot+=marks[i];
		}
		System.out.println("Sum is"+sum_tot);
		return sum_tot;
	}
	
	int Avg_percen(int num,int sum_tot)
	{
		int avg=sum_tot/num;
		System.out.println("average is:"+avg);
		return avg;
	}
	
	void Grade_cal(int avg)
	{
		if(avg>=85 && avg<=100)
		{
			System.out.println("A grade alloted.");
		}
		else if(avg>=75 && avg<85)
		{
			System.out.println("B grade alloted.");
		}
		else if(avg>=65 && avg<75)
		{
			System.out.println("C grade alloted.");
		}
		else if(avg>=55 && avg<65)
		{
			System.out.println("D grade alloted.");
		}
		else if(avg>=35 && avg<55)
		{
			System.out.println("E grade alloted.");
		}
		else
		{
			System.out.println("Please attempt for retest.The candidate has failed in the exam.");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		Grades_Student g=new Grades_Student();
		
		System.out.println("Enter the number of sub:");
		int n=s.nextInt();
		g.Grade_cal(g.Avg_percen(n,g.Sub(n) ));	
	}

}

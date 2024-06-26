package com.app;


import java.util.*;
import java.lang.Math.*;
public class Point2d{

		private double x;
		private double y;
		Scanner sc=new Scanner(System.in);
		public Point2d()
		{
		this(0,0);	
		}
		
		public Point2d(double  x, double y) {
			
			this.x = x;
			this.y = y;
		}

		public double getX() {
			return x;
		}

		public void setX(double  x) {
			this.x = x;
		}

		public double getY() {
			return y;
		}

		public void setY(double y) {
			this.y = y;
		}
		
		public String getDetails()
		{
			return "x axis:"+getX()+", y axis: "+getY();
		}
		
		public void accept()
		{
			System.out.println("Enter x axis: ");
			Scanner sc=new Scanner(System.in);
			x=sc.nextDouble();
			System.out.println("Enter y axis: ");
			y=sc.nextDouble();
		}
		
		public boolean isEqual(Point2d p1)
		{
			if(x==p1.getX() && y==p1.getY())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		public double getDistance(Point2d p1)
		{
			double x,y;
			double distance;
			if(p1.getX()<this.x)
			{
				x=this.x-p1.getX();
			}
			else
			{
				x=p1.getX()-this.x;
			}
			if(p1.getY()<this.y)
			{
				y=this.y-p1.getY();
			}
			else
			{
				y=p1.getY()-this.y;
			}
			distance=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
			return distance;
			
			
		}
		
		public void display()
		{
			System.out.println("************************");
			System.out.println("The x courdinate is: "+x);
			System.out.println("************************");
			System.out.println("The y courdinate is: "+y);
		}
		
		
		
		
		
		
		
		
		
}

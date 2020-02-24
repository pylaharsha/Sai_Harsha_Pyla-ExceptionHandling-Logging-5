package com.epam.app;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class House_cost extends CostOfHouse {
	private static final Logger LOGGER = LogManager.getLogger(House_cost.class);
      Scanner s=new Scanner(System.in);
      @SuppressWarnings("resource")
	 public void House_cost1()
  	{
  		Scanner s=new Scanner(System.in);
  		LOGGER.info("Enter the area of your site in square feet");
  		float area=s.nextFloat();
  		LOGGER.info("Do you need fully automated home?.\n1.YES\n2.NO");
  		int choice=s.nextInt();
  		if (choice==2)
  		{
  			LOGGER.info("select the type of material you need to build the house\n1.Standard material\n2.Above Standard material\n3.High Standard material");
  			int choice0=s.nextInt();
  			if (choice0<1 && choice0>3)
  			{
  				LOGGER.info("Enter a valid choice...!");
  			}
  			else
  			{
  				LOGGER.info("cost for house construction : "+find_cost_house(choice0,area));
  			}
  		}
  		else if(choice==1)
  		{
  			LOGGER.info("cost for house construction : "+find_cost_house(4,area));
  		}
  		else
  		{
  			LOGGER.info("Enter a valid choice");
  		}
  	}
  	public static void main(String args[])
  	{
  		House_cost obj1=new House_cost();
  		obj1.House_cost1();
  	}

}

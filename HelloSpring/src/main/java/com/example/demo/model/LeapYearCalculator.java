package com.example.demo.model;

public class LeapYearCalculator {
	public int leap(int year)
	{
		int op;
		if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    op = 1;
                else
                    op = 0;
            }
            else
                op = 1;
        }
        else
            op = 0;
		
		return op;

	}

}

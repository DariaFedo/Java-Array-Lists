package List5;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Ad3 {

	public static void main(String[] args) throws ParseException  {

		SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
		ArrayList<Date> dateList = new ArrayList<Date>();
		Scanner scn = new Scanner(System.in);
		
		String stringDate = scn.nextLine();
		
		Date date = simpleDate.parse(stringDate);
		dateList.add(date);
		
		do {
			stringDate = scn.nextLine();
			date = simpleDate.parse(stringDate);
			
			if(!dateList.contains(date))
			{
			
				for(int i = 0; i < dateList.size(); i++) 
				{
					if(dateList.get(i).after(date)) 
					{ 
						dateList.add(i, date);
						
						if(!(dateList.size()<4))
						{
							dateList.remove(4);
							break;
						}
						break;
							
					}
					
					if(!dateList.contains(date)) 
						dateList.add(date);
					
					if(dateList.size()>4)
						dateList.remove(4);
				}
			}
		
			System.out.println(dateList);			
		}while(true);
		
	}
	
}


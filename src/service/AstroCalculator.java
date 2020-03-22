package service;

import model.User;

public class AstroCalculator {
	
public String toString(User user) 
	{
		return "Name:"+user.getName()+"\nGender:"+user.getGender()+"\nDOB:"+user.getDob();
	}

public String findSign(User user) {
	String date_untouched = user.getDob();
	String[] date = date_untouched.split("-");
	System.out.println(date);
	int day=Integer.parseInt(date[0]);
	int month=Integer.parseInt(date[1]);
	
	System.out.println(day);
	System.out.println(month);
	String zodiac=""; 
	
    if (month == 12){ 
        if (day < 22) 
        zodiac = "Sagittarius"; 
        else
        zodiac ="Capricorn"; 
    } 
          
    else if (month == 1){ 
        if (day < 20) 
        zodiac = "Capricorn"; 
        else
        zodiac = "Aquarius"; 
    } 
          
    else if (month == 2){ 
        if (day < 19) 
        zodiac = "Aquarius"; 
        else
        zodiac = "Pisces"; 
    } 
          
    else if(month == 3){ 
        if (day < 21)  
        zodiac = "Pisces"; 
        else
        zodiac = "Aries"; 
    } 
    else if (month == 4){ 
        if (day < 20) 
        zodiac = "Aries"; 
        else
        zodiac = "Taurus"; 
    } 
          
    else if (month == 5){ 
        if (day < 21) 
        zodiac = "Taurus"; 
        else
        zodiac = "Gemini"; 
    } 
          
    else if( month == 6){ 
        if (day < 21) 
        zodiac = "Gemini"; 
        else
        zodiac = "Cancer"; 
    } 
          
    else if (month == 7){ 
        if (day < 23) 
        zodiac = "Cancer"; 
        else
        zodiac = "Leo"; 
    } 
          
    else if( month == 8){ 
        if (day < 23)  
        zodiac = "Leo"; 
        else
        zodiac = "Virgo"; 
    } 
          
    else if (month == 9){ 
        if (day < 23) 
        zodiac = "Virgo"; 
        else
        zodiac = "Libra"; 
    } 
          
    else if (month == 10){ 
        if (day < 23) 
        zodiac = "Libra"; 
        else
        zodiac = "Scorpio"; 
    } 
          
    else if (month == 11){ 
        if (day < 22) 
        zodiac = "Scorpio"; 
        else
        zodiac = "Sagittarius"; 
    } 
   return zodiac;
} 

}
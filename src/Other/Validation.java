// VALIDATION CLASS (c)
// CREATOR: S. Govender (Seatides Combined School)
// VERSION: 5 (2012)
// OTHER VERSIONS: 1 (2008), 2 (2009), 3 (2010), 4 (2011)
// This class or any of its parts MAY NOT be copied, printed, distributed by itself or as part of 
// a package (including tuition) for which monetary gain is received, without receiving consent from the creator.
  
   package Other;
   
   import javax.swing.JOptionPane;
   import java.text.SimpleDateFormat;
   import java.util.Date;
        
    public class Validation
   {
   
       public boolean vDouble(String value, String message)
      {
         if (message.equalsIgnoreCase(""))
         {
            message = "Invalid Number";			
         }
      	
         boolean valid = false;
         try
         {
            double n = Double.parseDouble(value);
            valid = true;
         }
             catch (Exception e)
            {
               JOptionPane.showMessageDialog(null,message,"Error",JOptionPane.ERROR_MESSAGE);
               valid = false;
            }
         
         return valid;
      }    
   
   
       public boolean vDoublePositive(String value, String message)
      {
         if (message.equalsIgnoreCase(""))
         {
            message = "Invalid Number";			
         }
      	
         boolean valid = false;
         try
         {
            double n = Double.parseDouble(value);
            if(n > 0)
            {
               valid = true;
            }
            else
            {
               JOptionPane.showMessageDialog(null,message,"Error",JOptionPane.ERROR_MESSAGE); 
            }   	
         }
             catch (Exception e)
            {
               JOptionPane.showMessageDialog(null,message,"Error",JOptionPane.ERROR_MESSAGE);
               valid = false;
            }
         
         return valid;
      }    
   
     	
       public boolean vInteger(String value,String message)
      {
         if (message.equalsIgnoreCase(""))
         {
            message = "Invalid Integer";			
         }
      
         boolean valid = false;
         try
         {
            int n = Integer.parseInt(value);
            valid = true;
         }
             catch (Exception e)
            {
               JOptionPane.showMessageDialog(null,message,"Error",JOptionPane.ERROR_MESSAGE);
               valid = false;
            }
         
         return valid;
      }
   
   
       public boolean vIntegerPositive(String value,String message)
      {
         if (message.equalsIgnoreCase(""))
         {
            message = "Invalid Integer";			
         }
      
         boolean valid = false;
         try
         {
            int n = Integer.parseInt(value);
            if(n > 0)
            {
               valid = true;
            }
            else
            {
               JOptionPane.showMessageDialog(null,message,"Error",JOptionPane.ERROR_MESSAGE); 
            }   	
         }
             catch (Exception e)
            {
               JOptionPane.showMessageDialog(null,message,"Error",JOptionPane.ERROR_MESSAGE);
               valid = false;
            }
         
         return valid;
      }
   
      
       public boolean vDoubleRange(String value, String message1, String message2, double min, double max)
      {
         boolean validrange =  false;
         
         boolean valid = vDouble(value,message1);
         
         if (message2.equalsIgnoreCase(""))
         {
            message2 = "The Number does not fall between "+min+" and "+max;			
         }
      
         if (valid==true)
         {
            double n = Double.parseDouble(value);
            if ((n>=min) && (n<=max))
            {
               validrange = true;
            }
            else
            {
               JOptionPane.showMessageDialog(null,message2,"Error",JOptionPane.ERROR_MESSAGE);
               validrange = false;               
            }
         }
         return validrange;
      }
      
   
       public boolean vIntegerRange(String value,String message1,String message2, int min, int max)
      {
         boolean validrange =  false;
         
         boolean valid = vInteger(value,message1);
         
         if (message2.equalsIgnoreCase(""))
         {
            message2 = "The Integer does not fall between "+min+" and "+max;			
         }
      
         if (valid==true)
         {
            int n = Integer.parseInt(value);
            if ((n>=min) && (n<=max))
            {
               validrange = true;
            }
            else
            {
               JOptionPane.showMessageDialog(null,message2,"Error",JOptionPane.ERROR_MESSAGE);
               validrange = false;               
            }
         }
         return validrange;
      }
   
       
       public boolean vIntegerDigits(String value,String message1,String message2, int digits)
      {
         boolean validdigits = false;        
        
         boolean valid = vInteger(value,message1);
      	
         if (message2.equalsIgnoreCase(""))
         {
            message2 = "The Integer Value is not a "+digits+" digit value";			
         }
      
         if (valid==true)
         {
            int n = Integer.parseInt(value);  
            double n1 = Math.pow(10,digits-1);
            double n2 = Math.pow(10,digits)-1;
            if ((n>=n1) && (n<=n2))
            {
               validdigits = true;
            }
            else
            {
               JOptionPane.showMessageDialog(null,message2,"Error",JOptionPane.ERROR_MESSAGE);
               validdigits = false;               
            }      	 
         }
         return validdigits;     
      }
   
   
       public boolean vIntegerDigitsRange(String value,String message1,String message2, String message3, int digits, int min, int max)
      {
         boolean validdigitsrange = false;
           
         boolean valid1 = vIntegerDigits(value, message1, message2, digits);
           
         if (valid1==true)
         {
            boolean valid2 = vIntegerRange(value, message1,message3,min, max);
            if (valid2 == true)
            {
               validdigitsrange = true;  
            }
            else
            {
               validdigitsrange = false;  
            }
         }          
           
         return validdigitsrange;
      }
      
   	
       public boolean vStringAZ(String value,String message1,String message2)
      {
         if (message1.equalsIgnoreCase(""))
         {
            message1 = "Only Letters (A to Z) are allowed";			
         }
      	
         if (message2.equalsIgnoreCase(""))
         {
            message2 = "Please enter a Value";			
         }
      	        
         boolean valid = false;
         int lengthvalue=value.length()-1;
        
         if (lengthvalue>=0)
         {
            int k = 0;
            boolean invalid = false;
            while ((k<=lengthvalue) && (invalid==false)) 
            {	
               if(!(Character.isLetter(value.charAt(k))))
               {
                  invalid = true;
               }
               k++;
            }		
          
            if (invalid == true)
            {		
               JOptionPane.showMessageDialog(null,message1,"Error",JOptionPane.ERROR_MESSAGE);
               valid = false;
            }
            else
            {
               valid = true;
            }
         }
         else
         {
            JOptionPane.showMessageDialog(null,message2,"Error",JOptionPane.ERROR_MESSAGE);
            valid = false;
         }
      
         return valid;
      }
      
   
       public boolean vString09(String value,String message1, String message2)
      {
         if (message1.equalsIgnoreCase(""))
         {
            message1 = "Only Digits (0 to 9) are allowed";			
         }
      	
         if (message2.equalsIgnoreCase(""))
         {
            message2 = "Please enter a Value";			
         }
      
         boolean valid = false;
         int lengthvalue=value.length()-1;
      
         if (lengthvalue>=0)
         {
         
            int k = 0;
            boolean invalid = false;
            while ((k<=lengthvalue) && (invalid==false)) 
            {	
               if (!(Character.isDigit(value.charAt(k))))  
               {
                  invalid = true;
               }
               k++;
            }		
          
            if (invalid == true)
            {		
               JOptionPane.showMessageDialog(null,message1,"Error",JOptionPane.ERROR_MESSAGE);
               valid = false;
            }
            else
            {
               valid = true;
            }
         }
         else
         {
            JOptionPane.showMessageDialog(null,message2,"Error",JOptionPane.ERROR_MESSAGE);
            valid = false;
         }
      
         return valid;
      }
       
       
       public boolean vStringAZspace(String value,String message1,String message2)
      {
         if (message1.equalsIgnoreCase(""))
         {
            message1 = "Only Letters (A to Z) and Space/s are allowed";			
         }
      	
         if (message2.equalsIgnoreCase(""))
         {
            message2 = "Please enter a Value";			
         }
      	        
         boolean valid = false;
         int lengthvalue=value.length()-1;
        
         if (lengthvalue>=0)
         {
            int k = 0;
            boolean invalid = false;
            while ((k<=lengthvalue) && (invalid==false)) 
            {	
               if(!((Character.isLetter(value.charAt(k)))||(value.charAt(k)==' ')))
               {
                  invalid = true;
               }
               k++;
            }		
          
            if (invalid == true)
            {		
               JOptionPane.showMessageDialog(null,message1,"Error",JOptionPane.ERROR_MESSAGE);
               valid = false;
            }
            else
            {
               valid = true;
            }
         }
         else
         {
            JOptionPane.showMessageDialog(null,message2,"Error",JOptionPane.ERROR_MESSAGE);
            valid = false;
         }
      
         return valid;
      }
      
       
       public boolean vStringAZdash(String value,String message1,String message2)
      {
         if (message1.equalsIgnoreCase(""))
         {
            message1 = "Only Letters (A to Z) and Dash/es are allowed";			
         }
      	
         if (message2.equalsIgnoreCase(""))
         {
            message2 = "Please enter a Value";			
         }
      	        
         boolean valid = false;
         int lengthvalue=value.length()-1;
        
         if (lengthvalue>=0)
         {
            int k = 0;
            boolean invalid = false;
            while ((k<=lengthvalue) && (invalid==false)) 
            {	
               if(!((Character.isLetter(value.charAt(k)))||(value.charAt(k)=='-')))
               {
                  invalid = true;
               }
               k++;
            }		
          
            if (invalid == true)
            {		
               JOptionPane.showMessageDialog(null,message1,"Error",JOptionPane.ERROR_MESSAGE);
               valid = false;
            }
            else
            {
               valid = true;
            }
         }
         else
         {
            JOptionPane.showMessageDialog(null,message2,"Error",JOptionPane.ERROR_MESSAGE);
            valid = false;
         }
      
         return valid;
      }
       
   
       public boolean vStringAZspaceDash(String value,String message1,String message2)
      {
         if (message1.equalsIgnoreCase(""))
         {
            message1 = "Only Letters (A to Z), Space/s and Dash/es are allowed";			
         }
      	
         if (message2.equalsIgnoreCase(""))
         {
            message2 = "Please enter a Value";			
         }
      	        
         boolean valid = false;
         int lengthvalue=value.length()-1;
        
         if (lengthvalue>=0)
         {
            int k = 0;
            boolean invalid = false;
            while ((k<=lengthvalue) && (invalid==false)) 
            {	
               if(!((Character.isLetter(value.charAt(k)))||(value.charAt(k)==' ')||(value.charAt(k)=='-')))
               {
                  invalid = true;
               }
               k++;
            }		
          
            if (invalid == true)
            {		
               JOptionPane.showMessageDialog(null,message1,"Error",JOptionPane.ERROR_MESSAGE);
               valid = false;
            }
            else
            {
               valid = true;
            }
         }
         else
         {
            JOptionPane.showMessageDialog(null,message2,"Error",JOptionPane.ERROR_MESSAGE);
            valid = false;
         }
      
         return valid;
      }
       
   	 
       public boolean vStringAZ09(String value,String message1,String message2)
      {
         if (message1.equalsIgnoreCase(""))
         {
            message1 = "Only Letters (A to Z) and Digits (0 - 9) are allowed";			
         }
      	
         if (message2.equalsIgnoreCase(""))
         {
            message2 = "Please enter a Value";			
         }
      	        
         boolean valid = false;
         int lengthvalue=value.length()-1;
        
         if (lengthvalue>=0)
         {
            int k = 0;
            boolean invalid = false;
            while ((k<=lengthvalue) && (invalid==false)) 
            {	
               if(!((Character.isLetter(value.charAt(k)))||(Character.isDigit(value.charAt(k)))))
               {
                  invalid = true;
               }
               k++;
            }		
          
            if (invalid == true)
            {		
               JOptionPane.showMessageDialog(null,message1,"Error",JOptionPane.ERROR_MESSAGE);
               valid = false;
            }
            else
            {
               valid = true;
            }
         }
         else
         {
            JOptionPane.showMessageDialog(null,message2,"Error",JOptionPane.ERROR_MESSAGE);
            valid = false;
         }
      
         return valid;
      }
   	
       
       public boolean vStringAZ09space(String value,String message1,String message2)
      {
         if (message1.equalsIgnoreCase(""))
         {
            message1 = "Only Letters (A to Z), Digits (0 - 9) and Space/s are allowed";			
         }
      	
         if (message2.equalsIgnoreCase(""))
         {
            message2 = "Please enter a Value";			
         }
      	        
         boolean valid = false;
         int lengthvalue=value.length()-1;
        
         if (lengthvalue>=0)
         {
            int k = 0;
            boolean invalid = false;
            while ((k<=lengthvalue) && (invalid==false)) 
            {	
               if(!((Character.isLetter(value.charAt(k)))||(Character.isDigit(value.charAt(k)))||(value.charAt(k)==' ')))
               {
                  invalid = true;
               }
               k++;
            }		
          
            if (invalid == true)
            {		
               JOptionPane.showMessageDialog(null,message1,"Error",JOptionPane.ERROR_MESSAGE);
               valid = false;
            }
            else
            {
               valid = true;
            }
         }
         else
         {
            JOptionPane.showMessageDialog(null,message2,"Error",JOptionPane.ERROR_MESSAGE);
            valid = false;
         }
      
         return valid;
      }
   
       
       public boolean vStringAZ09spaceDash(String value,String message1,String message2)
      {
         if (message1.equalsIgnoreCase(""))
         {
            message1 = "Only Letters (A to Z), Digits (0 - 9), Space/s and Dash/es are allowed";			
         }
      	
         if (message2.equalsIgnoreCase(""))
         {
            message2 = "Please enter a Value";			
         }
      	        
         boolean valid = false;
         int lengthvalue=value.length()-1;
        
         if (lengthvalue>=0)
         {
            int k = 0;
            boolean invalid = false;
            while ((k<=lengthvalue) && (invalid==false)) 
            {	
               if(!((Character.isLetter(value.charAt(k)))||(Character.isDigit(value.charAt(k)))||(value.charAt(k)==' ')||(value.charAt(k)=='-')))
               {
                  invalid = true;
               }
               k++;
            }		
          
            if (invalid == true)
            {		
               JOptionPane.showMessageDialog(null,message1,"Error",JOptionPane.ERROR_MESSAGE);
               valid = false;
            }
            else
            {
               valid = true;
            }
         }
         else
         {
            JOptionPane.showMessageDialog(null,message2,"Error",JOptionPane.ERROR_MESSAGE);
            valid = false;
         }
      
         return valid;
      }
      
   	 
       public boolean vStringAZrange(String value,String message1,String message2, String message3, int size)
      {
         boolean validrange = false;
      	      
         boolean valid = vStringAZ(value,message1,message2);
      	
         if (message3.equalsIgnoreCase(""))
         {
            message3 = "Please enter a value that has at least "+size+" character/s";			
         }
      	
         if (valid == true)
         {
            if (value.length() == size)
            {
               validrange = true;
            }
            else
            {
               JOptionPane.showMessageDialog(null,message3,"Error",JOptionPane.ERROR_MESSAGE); 
               validrange = false;
            }		
         
         }
         return validrange;
      }
   	
   
       public boolean vString09range(String value,String message1, String message2,String message3, int size)
      {
         boolean validrange = false;
      	      
         boolean valid = vString09(value,message1,message2);
      	
         if (message3.equalsIgnoreCase(""))
         {
            message3 = "Please enter a value that has at least "+size+" character/s";			
         }
            	
         if (valid == true)
         {
            if (value.length() == size)
            {
               validrange = true;
            }
            else
            {
               JOptionPane.showMessageDialog(null,message3,"Error",JOptionPane.ERROR_MESSAGE); 
               validrange = false;
            }		
         
         }
         return validrange;
      }
   
   
       public boolean vStringAZspaceRange(String value,String message1,String message2,String message3, int size)
      {
         boolean validrange = false;
      	      
         boolean valid = vStringAZspace(value,message1,message2);
      	
         if (message3.equalsIgnoreCase(""))
         {
            message3 = "Please enter a value that has at least "+size+" character/s";			
         }
            	
         if (valid == true)
         {
            if (value.length() == size)
            {
               validrange = true;
            }
            else
            {
               JOptionPane.showMessageDialog(null,message3,"Error",JOptionPane.ERROR_MESSAGE); 
               validrange = false;
            }		
         
         }
         return validrange;
      }
   	
   	
       public boolean vStringAZ09range(String value,String message1,String message2, String message3, int size)
      {
         boolean validrange = false;
      	      
         boolean valid = vStringAZ09(value,message1,message2);
      	
         if (message3.equalsIgnoreCase(""))
         {
            message3 = "Please enter a value that has at least "+size+" character/s";			
         }
      	
         if (valid == true)
         {
            if (value.length() == size)
            {
               validrange = true;
            }
            else
            {
               JOptionPane.showMessageDialog(null,message3,"Error",JOptionPane.ERROR_MESSAGE); 
               validrange = false;
            }		
         
         }
         return validrange;
      }
   
   	
       public boolean vEmail(String emailAdd, String message)
      {
         boolean valid=false;
      
         if (emailAdd.equalsIgnoreCase(""))
         {
            message = "Please enter an email address";			
         }
         else   	
         {
            if (message.equalsIgnoreCase(""))
            {
               message = "Format for email address incorrect";			
            }
         
            String pattern = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
            if(emailAdd.matches(pattern))
            {
               valid = true;
            }
            else
            {
               JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);        
            }
         }
         return valid;
      }
   
       
       public boolean vWebsite(String webAdd, String message)
      {
         boolean valid=false;
      
         if (webAdd.equalsIgnoreCase(""))
         {
            message = "Please enter a web address";			
         }
         else   	
         {
            if (message.equalsIgnoreCase(""))
            {
               message = "Format for web address incorrect";			
            }
         
            String pattern = "^http(s{0,1})://[a-zA-Z0-9_/\\-\\.]+\\.([A-Za-z/]{2,5})[a-zA-Z0-9_/\\&\\?\\=\\-\\.\\~\\%]*";
            if(webAdd.matches(pattern))
            {
               valid = true;
            }
            else
            {
               JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);        
            }
         }
         return valid;
      }
       
       
       public boolean vDateString(String theDate, String dateFormat, String message)
      {
         boolean valid = false;
      
         if (dateFormat.equalsIgnoreCase(""))
         {
            dateFormat = "dd-MM-yyyy";			
         }
        
         if (message.equalsIgnoreCase(""))
         {
            message = "Invalid Date. Please enter a valid date in the format "+dateFormat;			
         }
      
         try
         {
            SimpleDateFormat d = new SimpleDateFormat(dateFormat);
            d.setLenient(false);
            d.parse(theDate);
         
            if(vIntegerDigitsRange(theDate.substring(dateFormat.indexOf("y")),"There must be a CORRECT year value","The year must have FOUR digits","Invalid year [1900 - "+(new java.util.Date().getYear() + 1900)+"]", 4, 1900, new java.util.Date().getYear() + 1900))
            {
               valid = true; 
            } 
              
         }  
             catch (Exception e)
            {
               JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            }
      
         return valid;
      }
    
       
       public boolean vDateParts(String day, String month, String year)
      {
         boolean valid = false;
      	
         if((vIntegerRange(day,"There must be at least one day","At most a month can only have 31 days", 1, 31))&&(vIntegerRange(month,"There must be at least one month","There are only 12 Months in a year", 1, 12))&&( vIntegerDigitsRange(year,"There must be a year value","A year must have FOUR digits","Invalid year [1900 - "+(new java.util.Date().getYear() + 1900)+"]", 4, 1900, new java.util.Date().getYear() + 1900))) 
         {
            valid = true;
         	
            switch (Integer.parseInt(month))
            {
               case 4: case 6: case 9: case 11:
                  {
                     if (Integer.parseInt(day) > 30)
                     {
                        valid = false;
                        JOptionPane.showMessageDialog(null, "There are only THIRTY days in this month","Error", JOptionPane.ERROR_MESSAGE);
                     }
                  
                     break;
                  }
               
               case 2:
                  {
                     if (Integer.parseInt(year) % 4 == 0)
                     {
                        if (Integer.parseInt(day) > 29)
                        {
                           valid = false; 
                           JOptionPane.showMessageDialog(null, "There are only 29 days in February for this year","Error", JOptionPane.ERROR_MESSAGE);
                          
                        }
                     } 
                     else
                     {
                        if (Integer.parseInt(day) > 28)
                        {
                           valid = false;
                           JOptionPane.showMessageDialog(null, "There are only 28 days in February for this year", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                     }
                  
                     break;
                  }
            }
         }
         return valid;
      }
       
   
       public boolean vTimeParts(String hour, String minutes, String seconds)
      {
         boolean valid = false;
        
         if((vIntegerRange(hour,"Invalid hour value [0 - 23]","There are 24 hours in a day [0 - 23]",0, 23))&&(vIntegerRange(minutes,"Invalid minute value [0 - 59]","There are 60 minutes in a hour [0 - 59]", 0, 59))&&(vIntegerRange(seconds,"Invalid second value [0 - 59]","There are 60 seconds in minute [0 - 59]", 0, 59)))      
         {
            valid = true;
         }
         return valid;
      }
    
    
       public boolean vTimeString(String theTime, String message)
      {
         boolean valid = false;
         
         String timeFormat = "HH:mm:ss";			
         
         if (message.equalsIgnoreCase(""))
         {
            message = "Invalid Time. Please enter a valid time in the format  "+timeFormat+"   [0-23] : [0-59] : [0-59]";			
         }
      
         try
         {
            SimpleDateFormat t = new SimpleDateFormat(timeFormat);
            t.setLenient(false);
            t.parse(theTime);
            valid = true;        
         }  
             catch (Exception e)
            {
               JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            }
      
         return valid;
      }
   	
   
       public String CurrentAge(String birthDate, String dateFormat, String message)
      {
         String line = "";    
      
         try
         {  
            if (dateFormat.equalsIgnoreCase(""))
            {
               dateFormat = "dd-MM-yyyy";			
            }
         
            if (message.equalsIgnoreCase(""))
            {
               message = "Invalid Date. Please enter a valid date in the format "+dateFormat;			
            }
         
            if(vDateString(birthDate, dateFormat, message))
            {
               Date dd = new SimpleDateFormat(dateFormat).parse(birthDate);
               
               int dayP = dd.getDate();
               int monthP = dd.getMonth()+1;
               int yearP = dd.getYear()+1900;
                     
               int day = new java.util.Date().getDate();
               int month = new java.util.Date().getMonth()+1;
               int year = new java.util.Date().getYear() + 1900;
            
               int y = year - yearP;
              
               int m = 0;
            
               int d=0;
            
               int numD = 0;  	
              
               if(month<monthP)
               {
                  m = (month - monthP) + 12;
                  y = y - 1;
               }
               else
               {
                  m = month - monthP;
               }
                        
               switch (month)
               {
                  case 4: case 6: case 9: case 11:
                     {
                        numD = 30;
                        break;
                     }
                   
                  case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                     {
                        numD = 31;
                        break;
                     }
                  
                  case 2:
                     {
                        if (year % 4 == 0)
                        {
                           numD = 29;               
                        } 
                        else
                        {
                           numD = 28;
                        }
                     
                        break;
                     }
               }
            
               if(day<dayP)
               {
                  d = (day - dayP) + numD;
                  m = m - 1;
               }
               else
               {
                  d = day - dayP;
               }
                    
               line = y+" year/s,  "+m+" month/s, "+d+" day/s";	
              	
            }
         }
             catch (Exception ex)
            {
               
            }
         return line;
        
      }
   
    
   }
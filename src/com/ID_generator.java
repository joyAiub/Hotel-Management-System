
package com;

import java.util.Calendar;

public class ID_generator {
    static String generateManagerID(String Email)
    {
        
        String ID = new String();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(year);
        int month = Calendar.getInstance().get(Calendar.MONTH)+1;
        String m = "0";
        System.out.println(month);
        int type = 2;
        String serial = new String();
        
        if(month<10)
        {
            ID = ""+year+"0"+month+type;
        }
        else
        {
            ID = ""+year+month+type;
        }
        
        
        int newManager = new Employee(Email).getNOM()+1;
        System.out.println(newManager);
        //int newManager=9999;
        
        if(newManager<10)
        {
            ID += "000"+ newManager;
        }
        else if(newManager<100)
        {
            ID += "00"+ newManager;
        }
        else if(newManager<1000)
        {
            ID += "0"+ newManager;
        }
        else if(newManager>=1000 && newManager<10000)
        {
            ID += ""+ newManager;
        }
        else
        {
            ID = "Sorry! Manager Registration limit exceeds!";
        }
        
        
        return ID;
    }
    
    static String generateCustomerID(String Email)
    {
        
        String ID = new String();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        //System.out.println(year);
        int month = Calendar.getInstance().get(Calendar.MONTH)+1;
        String m = "0";
        //System.out.println(month);
        int type = 3;
        String serial = new String();
        
        if(month<10)
        {
            ID = ""+year+"0"+month+type;
        }
        else
        {
            ID = ""+year+month+type;
        }
        
        
        int newCustomer = new Customer(Email).getNOC()+1;
       // System.out.println(newCustomer);
        //int newCustomer=5;
        
        if(newCustomer<10)
        {
            ID += "000"+ newCustomer;
        }
        else if(newCustomer<100)
        {
            ID += "00"+ newCustomer;
        }
        else if(newCustomer<1000)
        {
            ID += "0"+ newCustomer;
        }
        else if(newCustomer>=1000 && newCustomer<10000)
        {
            ID += ""+ newCustomer;
        }
        else
        {
            ID = "Sorry! Customer Registration limit exceeds!";
        }
        
        
        return ID;
    }
    
    public static void main(String[] args)
    {
        //System.out.println(generateCustomerID("ppalit.cghs@gmail.com"));
    }
}

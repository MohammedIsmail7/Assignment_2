package Assignment_2;
import java.util.*;

public class Employee extends person 
{
    private String office;
    private double sa;
    private mydate date_H;
  
    public Employee(String name,String address,String phoneNumber,String email,String office,double sa,mydate date_H)
    {
        super(name,address,phoneNumber,email);
        this.office = office;
        this.sa = sa;
        this.date_H = date_H;
    }
    public String toString()
    {
        return "\nName : "+getName()+ " Address = "+getAddress() +" Phone Number = "+getPhoneNumber()+" Email = "+ getEmail()+" Office : "+office +" Salary = "+salary + " date Hire = "+dateHired;
    }
}

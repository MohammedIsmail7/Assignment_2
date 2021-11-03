package Assignment_2;
import java.util.*;

public class Student extends Person
{
    private String status;
  
    public Student(String name,String address,String phoneNumber,String email,String status)
    {
        super(name,address,phoneNumber,email);
        this.status = status;  
    }	
    public String tostring()
   	 {
      	  return "Name = " + getName() + " Address = "+getAddress() +" PhoneNumber = "+getPhone_Number() + " Email = " + getEmail() + " Status ="+status;
    	 } 
    }

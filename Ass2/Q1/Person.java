package Assignment_2;
import java.util.*;

public class person 
{
    private String N;
    private String address;
    private String phone_Number;
    private String email;
    
    public person(String N,String address,String phone_Number,String email)
    {
        this.N = N;
        this.address = address;
        this.phone_Number = phone_Number;
        this.email = email;
    }

    public String getName()
    {
        return N;
    }

    public void setName(String N)
    {
        this.N = N;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getPhone_Number() 
    {
        return phone_Number;
    }

    public void setPhone_Number(String phone_Number)
    {
        this.phone_Number = phone_Number;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }   
}

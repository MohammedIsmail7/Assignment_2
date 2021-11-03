package Assignment_2;
import java.util.*;
public class mydate      
{
    private int d;
    private int m;    
    private int y;

    public myDate(int d,int m,int y)
    {
        this.d = d;
        this.m = m;
        this.y = y;
    }
   public String toString()
   {
       return "= " + d + " / " + m +" / " + y;
   }
   
}

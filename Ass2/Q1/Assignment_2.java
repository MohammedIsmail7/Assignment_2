package Assignment_2;
public class Assignment_2
{
    public static void main(String[] args)
    {
     Student s = new Student("Mohammed","Minya","01003376561","m7md999668@gmail.com","sophomore");
       System.out.println(s.toString());
     mydate d = new mydate(1,7,2013);
       Employee e = new Employee("Mahmoud","Minya","01011962928","mahmoud77@gmail.com","kenawy-street ",6500.0,d);
       System.out.println(e.tostring());
    }    
}

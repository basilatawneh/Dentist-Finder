/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.design.pattern;
import java.util.ArrayList;

public class Form  implements Form_Plan {
    Personal_Information Person;
    ArrayList<Address_Section> Address = new ArrayList<Address_Section>();
    Biography_Section Bio;
    ArrayList< Educatio_Section> Education= new ArrayList<Educatio_Section>();
    ArrayList< Areas_of_specialization_Section> Area=new ArrayList<Areas_of_specialization_Section>();


    @Override
     public void SetPersonalInformation (String fn,String ln,String email,String web,String phone) 
     {
         Person=new Personal_Information(fn,ln,email,web,phone);
     }
    public void SetBiography (String Lic,String LicNo,int year,boolean gen) 
    {
        Bio = new Biography_Section(Lic,LicNo,year,gen);
    }
    public void SetEducation(String deg,String maj,String sch,int year) 
    {
        Education.add( new Educatio_Section(deg, maj, sch, year));
        
    }
    public void SetAddress(String country, String state,String city,String street, String pos)
    {
        Address.add(new Address_Section(country, state, city, street, pos));
    }
    public void SetAreaOfSpecialization(String area,int year)
    {
        Area.add( new Areas_of_specialization_Section(area, year));
                
    }
    
}

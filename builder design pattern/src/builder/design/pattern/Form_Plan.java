/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.design.pattern;

/**
 *
 * @author Abed AL-Fattah Hroub
 */
public interface Form_Plan {
     public void SetPersonalInformation (String fn,String ln,String email,String web,String phone); 
  
    public void SetBiography (String Lic,String LicNo,int year,boolean gen); 
  
    public void SetEducation(String deg,String maj,String sch,int year); 
  
    public void SetAddress(String country, String state,String city,String street, String pos);
    public void SetAreaOfSpecialization(String area,int year);
  
}

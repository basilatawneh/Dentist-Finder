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
public interface Form_builder {
    public void buildPersonalInformation (String fn,String ln,String email,String web,String phone); 
  
    public void buildBiography (String Lic,String LicNo,int year,boolean gen); 
  
    public void buildEducation(String deg,String maj,String sch,int year); 
  
    public void buildAddress(String country, String state,String city,String street, String pos);
    public void buildAreaOfSpecialization(String area,int year);
  
    public Form getForm();
}

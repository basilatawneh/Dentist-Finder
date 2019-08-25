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
public class Portal_Form implements Form_builder{
     
    private Form form;
    
    public Portal_Form()
    {
    form =new Form();
    }
        public void buildPersonalInformation (String fn,String ln,String email,String web,String phone){
        form.SetPersonalInformation(fn, ln, email, web, phone);
    } 
  
    public void buildBiography (String Lic,String LicNo,int year,boolean gen){
        form.SetBiography(Lic, LicNo, year, gen);
    }
  
    public void buildEducation(String deg,String maj,String sch,int year){
        form.SetEducation(deg, maj, sch, year);
    }
  
    public void buildAddress(String country, String state,String city,String street, String pos){
        form.SetAddress(country, state, city, street, pos);
    }
    public void buildAreaOfSpecialization(String area,int year){
        form.SetAreaOfSpecialization(area, year);
    }
   public Form getForm(){
   return this.form;
   }
}

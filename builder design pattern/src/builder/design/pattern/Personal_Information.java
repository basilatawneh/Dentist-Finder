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
public class Personal_Information {
   private String FirstName;
 private String Last_Name;
 private String Email_Address;
 private String Website;
 private String Phone_Number;
 
 public  Personal_Information(String fn,String ln,String email,String web,String phone)
{
this.FirstName=fn;
this.Last_Name=ln;
this.Email_Address=email;
this.Website=web;
this.Phone_Number=phone;

} 
}

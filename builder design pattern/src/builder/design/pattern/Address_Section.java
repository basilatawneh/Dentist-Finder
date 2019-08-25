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
public class Address_Section {
   private String Country;
private String State;
private String  City;
private String  Street;
private String  PostalCode;
public Address_Section(String country, String state,String city,String street, String pos){
    this.City=city;
    this.Country=country;
    this.PostalCode=pos;
    this.State=state;
    this.Street=street;
}
}

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
public class Biography_Section {
    private String LicenseCountryName;
    private String LicenseNumber;
    private int YearsinPractice;
    private boolean Gender;
    
    public  Biography_Section(String Lic,String LicNo,int year,boolean gen){
        this.LicenseCountryName=Lic;
        this.LicenseNumber=LicNo;
        this.YearsinPractice=year;
        this.Gender=gen;
        
    }

    
}

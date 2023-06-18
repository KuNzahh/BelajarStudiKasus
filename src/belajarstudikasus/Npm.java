/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarstudikasus;

/**
 *
 * @author Acer
 */
public class Npm {
    Double Ipk;
 
    private String Grade; 
    
    public Npm(){
    }
    
    public Npm(String grade){
        setGrade(Grade);
    }
    
    public void setGrade(String grade){
        if (Ipk >=0 && Ipk<=2.5){ 
        System.out.println("Tidak Memuaskan");
        } else if (Ipk >=2.6 && Ipk<=2.9){
        System.out.println("Memuaskan");
        } else if (Ipk >=3 && Ipk<=3.4){
        System.out.println("Sangat Memuaskan");
        } else {
        System.out.println("Dengan Pujian");
        }
        this.setGrade(grade);
    }
    public String getGrade(){
        return this.Grade;
    }
}


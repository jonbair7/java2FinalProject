/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2finalproject;

/**
 *
 * @author Jon
 */
public class student extends person{
    private String grade;
    private double percentage;
    
    public student() {}
    
    public student(double p)
    {
        percentage = p;
    }
    
    public double getPercentage() { return percentage; }
    public String getGrade() { return grade; }
    
    public void setPercentage(double p) { percentage = p; }
    public void setGrade(String g) 
    {
        if(percentage >= 90)
            g = "A";
        else if(percentage >= 80 && percentage < 90)
            g = "B";
        else if(percentage >= 70 && percentage < 80)
            g = "C";
        else if(percentage >= 60 && percentage < 70)
            g = "D";
        else if(percentage >= 0 && percentage < 60)
            g = "F";
        grade = g;
    }
    
}

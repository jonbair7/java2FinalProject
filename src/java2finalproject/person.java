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
public class person {
    protected String fname;
    protected String lname;
    
    public person() 
    {
        fname = "John";
        lname = "Doe";
    }
    
    public person(String fn, String ln)
    {
        fname = fn;
        lname = ln;
    }
    
    public String getFname() { return fname; }
    public String getLname() { return lname; }
    
    public void setFname(String fn) { fname = fn; }
    public void setLname(String ln) { lname = ln; }
    
}

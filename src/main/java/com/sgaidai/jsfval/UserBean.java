/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgaidai.jsfval;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;

@ManagedBean(name="user")
@SessionScoped
public class UserBean implements Serializable{
    
    String confPassword;
    String password;
    
    
    private double price; 
    private int age;
 
   public int getAge() {
      return age;
   }
   
   public void setAge(int age) {
      this.age = age;
   } 
    
    public double getPrice() {
        return price; } 
    public void setPrice(double price) {
        this.price = price; }

    public String getPassword() {
        return password;    }

    public void setPassword(String password) {
        this.password = password;    }

    public String getConfPassword() {
        return confPassword;    }

    public void setConfPassword(String confPassword) {
        this.confPassword = confPassword;    }
	
}
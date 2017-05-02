/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgaidai.jsfval;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="mas")
@SessionScoped
public class ValMas implements Serializable{
    
    String uiinput = "Value is FALSE.";
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUiinput() {
        return uiinput;
    }

    public void setUiinput(String uiinput) {
        this.uiinput = uiinput;
    }
}

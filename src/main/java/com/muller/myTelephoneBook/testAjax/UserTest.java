package com.muller.myTelephoneBook.testAjax;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean(name = "userTest", eager = true)
@SessionScoped
public class UserTest implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name = "";

    public String getWelcomeMessage() {
        return "Hello " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

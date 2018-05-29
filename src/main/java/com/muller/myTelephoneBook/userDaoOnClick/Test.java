package com.muller.myTelephoneBook.userDaoOnClick;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import java.io.Serializable;
import java.util.Map;

@ManagedBean
@SessionScoped
public class Test implements Serializable {
    private static final long serialVersionUID = 1L;
    private static Map<String,String> countryMap;
    private String data = "sample data";

    public String myResult() {
        return "myResult";
    }

    public void updateData(ActionEvent e) {
        data = "Hello World";
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

package com.muller.myTelephoneBook.action;

import com.muller.myTelephoneBook.userDaoOnClick.Test;

import javax.faces.context.FacesContext;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Test test = (Test) FacesContext.getCurrentInstance()
                .getExternalContext().getSessionMap().get("test");
        test.setData("Hello World");
    }
}

package com.muller.myTelephoneBook.Navigation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class NavigationBean {

//    private String pageId;
//
//    public String showPage() {
//
//        if (pageId == null) {
//            return "index";
//        }
//        if (pageId.equals("1")) {
//            return "addUser";
//        } else if (pageId.equals("2")) {
//            return "getUsers";
//        } else {
//            return "index";
//        }
//    }

    public String moveTo_addUser() {
        return "addUser";
    }

    public String moveTo_getUsers() {
        return "getUsers";
    }

    public String moveTo_myTest() {
        return "myTest";
    }

    public String moveTo_findByName() {
        return "findByName";
    }

    public String moveTo_index() {
        return "index";
    }

}

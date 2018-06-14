package com.muller.myTelephoneBook.Navigation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean(name = "navig", eager = true)
@RequestScoped
public class NavigationBean implements Serializable {

    Logger log = LoggerFactory.getLogger(NavigationBean.class);
    @ManagedProperty(value = "#{param.pageId}")
    private String pageId;

    public String showPage() {
        log.info("show page navig, option: " + pageId);
        if (pageId == null) {
            return "index";
        }
        if (pageId.equals("1")) {
            return "addUser";
        } else if (pageId.equals("2")) {
            return moveTo_getUsers();
        } else if (pageId.equals("3")) {
            return moveTo_myTest();
        } else if (pageId.equals("4")) {
            return moveTo_findByName();
        } else {
            return "index";
        }
    }

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

    public String moveTo_myNavig() {
        return "myNavig";
    }

    public String moveTo_findResult() {
        return "findByNameResult";
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

}

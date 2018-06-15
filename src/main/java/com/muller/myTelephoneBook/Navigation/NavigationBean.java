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

    private final String errorNotFound = "Not Found";

    Logger log = LoggerFactory.getLogger(NavigationBean.class);
    @ManagedProperty(value = "#{param.pageId}")
    private String pageId;

    public String showPage() {
        log.info("show page navig, option: " + pageId);

        if (pageId == null) {
            log.info(errorNotFound);
            return "index";
        }

        if (pageId.equals("1")) {
            return "addUser";
        } else if (pageId.equals("2")) {
            return "getUsers";
        } else if (pageId.equals("3")) {
            return "myTest";
        } else if (pageId.equals("4")) {
            return "findByName";
        } else if (pageId.equals("0")) {
            return "index";
        }else {
            return "index";
        }
    }

    public String getPageId() {
        return pageId;
    }
    public void setPageId(String pageId) {
        this.pageId = pageId;
    }
}

//    public String moveTo_addUser() {
//        return "addUser";
//    }
//
//    public String moveTo_getUsers() {
//        return "getUsers";
//    }
//
//    public String moveTo_myTest() {
//        return "myTest";
//    }
//
//    public String moveTo_findByName() {
//        return "findByName";
//    }
//
//    public String moveTo_index() {
//        return "index";
//    }
//
//    public String moveTo_myNavig() {
//        return "myNavig";
//    }
//
//    public String moveTo_findResult() {
//        return "findByNameResult";
//    }

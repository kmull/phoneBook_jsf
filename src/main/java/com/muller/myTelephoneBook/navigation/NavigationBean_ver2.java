package com.muller.myTelephoneBook.navigation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name = "navig_2", eager = true)
public class NavigationBean_ver2 {

    private final String errorNotFound = "Not Found";

    @ManagedProperty(value = "#{param.pageId}")
    private String pageId;

    Logger log = LoggerFactory.getLogger(NavigationBean_ver2.class);

    public String showPage() {
        log.info("show page navig, option: " + pageId);
        if (pageId == null) {
            log.info(errorNotFound);
            return "version_2/index";
        } else if (pageId.equals("1")) {
            return "addUser";
        } else if (pageId.equals("2")) {
            return "version_2/getUser";
        } else if (pageId.equals("3")) {
            return "version_2/findUser";
        } else if (pageId.equals("0")) {
            return "version_2/index";
        } else {
            return "version_2/index";
        }
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }
}

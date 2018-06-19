package com.muller.myTelephoneBook.userDao;

import com.muller.myTelephoneBook.domain.MyUser;

import java.util.List;

public class UserControler {

    public static boolean checkIfUser(List<MyUser> myUserList, MyUser myUser) {

        for (MyUser tmpUser : myUserList) {
            if (tmpUser.getName().equals(myUser.getName()) &&
                    tmpUser.getSurname().equals(myUser.getSurname())) {
                return false;
            }
        }
        return true;
    }


//    MyUser errorMessage;

//    public String checkIfValid(MyUser myUser) {
//
//        if(myUser.getName().isEmpty() || myUser.getName() == null) {
//            return "error";
//        }
//        return null;
//    }
}

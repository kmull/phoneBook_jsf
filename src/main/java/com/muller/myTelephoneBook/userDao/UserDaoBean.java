package com.muller.myTelephoneBook.userDao;

import com.muller.myTelephoneBook.domain.MyUser;
import com.muller.myTelephoneBook.repository.UsersRepository;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import java.util.List;

@ManagedBean
public class UserDaoBean implements UserDao {
    @EJB
    UsersRepository usersRepository;
    private String name;
    private String surname;

    private MyUser findMyUser;
    private MyUser myUser = new MyUser();
    private boolean errorMessage_addUser = true;
    private boolean statusMessage_findUser;

    public boolean getErrorMessage_addUser() {
        return errorMessage_addUser;
    }

    public boolean getStatusMessage_findUser() {
        return statusMessage_findUser;
    }

    public MyUser getMyUser() {
        return myUser;
    }

    public void setMyUser(MyUser myUser) {
        this.myUser = myUser;
    }

    @Override
    public void addUser(MyUser myUser) {
        errorMessage_addUser = UserControler.checkIfUser(getUsers(), myUser);
        if (errorMessage_addUser == false) {
            return;
        }
        usersRepository.addUser(myUser);
    }

    @Override
    public List<MyUser> getUsers() {
        return usersRepository.getUserTable();
    }

    @Override
    public MyUser findMyUser() {
        findMyUser = usersRepository.getFindUser(name, surname);
        statusMessage_findUser = true;
        return findMyUser;
    }

    public MyUser getFindMyUser() {
        return findMyUser;
    }

    public void setFindMyUser(MyUser findMyUser) {
        this.findMyUser = findMyUser;
    }

    /**********************************************************/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    //    /*******************************************************/
//    private boolean visible = false;
//    private List<MyUser> listUser;// = new ArrayList<>();
//
//    public void getUserList(ActionListener event) {
//
//        setVisible(true);
//
//        if (visible == true) {
//            listUser = getUsers();
//
////            for (MyUser myUser : listUser) {
////                System.out.println(myUser.getGender());
////            }
//        }
//    }
//
//    public boolean isVisible() {
//        return visible;
//    }
//
//    public void setVisible(boolean visible) {
//        this.visible = visible;
//    }
//
//    public List<MyUser> getListUser() {
//        return listUser;
//    }
//
//    public void setListUser(List<MyUser> listUser) {
//        this.listUser = listUser;
//    }

}

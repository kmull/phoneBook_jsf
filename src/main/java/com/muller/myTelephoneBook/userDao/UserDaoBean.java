package com.muller.myTelephoneBook.userDao;

import com.muller.myTelephoneBook.domain.MyUser;
import com.muller.myTelephoneBook.repository.UsersRepository;
import org.hibernate.query.Query;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import java.awt.event.ActionListener;
import java.util.List;

//@ManagedBean(name = "userData", eager = true)
@ManagedBean
public class UserDaoBean implements UserDao {
    @EJB
    UsersRepository usersRepository;
    private String name;
    private String surname;

    private MyUser findMyUser;


    private MyUser myUser = new MyUser();

    public MyUser getMyUser() {
        return myUser;
    }

    public void setMyUser(MyUser myUser) {
        this.myUser = myUser;
    }

    @Override
    public void addUser(MyUser myUser) {
        usersRepository.addUser(myUser);
    }

    @Override
    public List<MyUser> getUsers() {
        return usersRepository.getUserTable();
    }

    @Override
    public MyUser findMyUser() {
        findMyUser = usersRepository.getFindUser(name, surname);
        return findMyUser;
//        return usersRepository.getFindUser(name, surname);
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

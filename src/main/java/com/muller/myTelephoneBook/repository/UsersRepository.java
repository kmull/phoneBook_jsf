package com.muller.myTelephoneBook.repository;

import com.muller.myTelephoneBook.domain.MyUser;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class UsersRepository {

    @PersistenceContext(name = "pUnit")
    private EntityManager em;
    private MyUser findUser;

    public void addUser(MyUser myUser) {
        em.persist(myUser);
    }

    public List<MyUser> getUserTable() {
        return em.createNamedQuery("user.getList").getResultList();
    }

    public MyUser getFindUser(String name, String surname) {
        try {
            findUser = (MyUser) em.createNamedQuery("user.find")
                    .setParameter("name", name).setParameter("surname", surname)
                    .getSingleResult();
        } catch (NoResultException e) {

        }
        return findUser;
//        return (MyUser) em.createNamedQuery("user.find").getSingleResult();
    }
}

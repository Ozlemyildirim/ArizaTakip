/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.service;

import com.project.entity.Ariza;
import com.project.util.HibernateUtil;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class ArizaService {

    public Ariza save(Ariza entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(entity);
        t.commit();
        session.close();
        return entity;
    }

    public Ariza update(Ariza entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(entity);
        t.commit();
        session.close();
        return entity;
    }

    public boolean delete(Ariza entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(entity);
        t.commit();
        session.close();
        return true;
    }

    @SuppressWarnings("unchecked")
	public List<Ariza> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Ariza.class);
//        criteria.add(Restrictions.not(Restrictions.eq("teslimAlindi", true)));
        return criteria.list();
    }

    public Ariza getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Ariza.class);
        criteria.add(Restrictions.eq("id", id));
     return (Ariza) criteria.uniqueResult();
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.project.entity.ArizaTip;
import com.project.util.HibernateUtil;

/**
 *
 * @author vektorel
 */
public class ArizaTipService {

    public ArizaTip save(ArizaTip entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(entity);
        t.commit();
        session.close();
        return entity;
    }

    public ArizaTip update(ArizaTip entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(entity);
        t.commit();
        session.close();
        return entity;
    }

    public boolean delete(ArizaTip entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(entity);
        t.commit();
        session.close();
        return true;
    }

    @SuppressWarnings("unchecked")
	public List<ArizaTip> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(ArizaTip.class);
//        criteria.add(Restrictions.not(Restrictions.eq("teslimAlindi", true)));
        return criteria.list();
    }

    public ArizaTip getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(ArizaTip.class);
        criteria.add(Restrictions.eq("id", id));
      return (ArizaTip) criteria.uniqueResult();
    }
}

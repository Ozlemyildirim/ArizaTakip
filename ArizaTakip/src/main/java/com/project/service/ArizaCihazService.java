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

import com.project.entity.ArizaCihaz;
import com.project.util.HibernateUtil;


public class ArizaCihazService {

    public ArizaCihaz save(ArizaCihaz entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(entity);
        t.commit();
        session.close();
        return entity;
    }

    public ArizaCihaz update(ArizaCihaz entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(entity);
        t.commit();
        session.close();
        return entity;
    }

    public boolean delete(ArizaCihaz entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(entity);
        t.commit();
        session.close();
        return true;
    }

    @SuppressWarnings("unchecked")
	public List<ArizaCihaz> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(ArizaCihaz.class);
        return criteria.list();
    }

    public ArizaCihaz getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(ArizaCihaz.class);
        criteria.add(Restrictions.eq("id", id));
      return (ArizaCihaz) criteria.uniqueResult();
    }
}

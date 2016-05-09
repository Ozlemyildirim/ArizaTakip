/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.service;

import com.project.entity.ArizaMarka;
import com.project.util.HibernateUtil;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class ArizaMarkaService {

    public ArizaMarka save(ArizaMarka entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(entity);
        t.commit();
        session.close();
        return entity;
    }

    public ArizaMarka update(ArizaMarka entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(entity);
        t.commit();
        session.close();
        return entity;
    }

    public boolean delete(ArizaMarka entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(entity);
        t.commit();
        session.close();
        return true;
    }

	@SuppressWarnings("unchecked")
	public List<ArizaMarka> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(ArizaMarka.class);
//        criteria.add(Restrictions.not(Restrictions.eq("teslimAlindi", true)));
        return criteria.list();
    }

    public ArizaMarka getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(ArizaMarka.class);
        criteria.add(Restrictions.eq("id", id));
     return (ArizaMarka) criteria.uniqueResult();
    }
}

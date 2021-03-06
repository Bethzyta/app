/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.ufg.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sv.edu.ufg.model.Pregunta;

/**
 *
 * @author Heraldo
 */
@Repository
public class PreguntaDaoImpl implements PreguntaDao {

	
	@Autowired SessionFactory sessionFactory;
	
	public void create(Object r) {
		sessionFactory.getCurrentSession().saveOrUpdate(r);
	}

	public void update(Object r) {
		sessionFactory.getCurrentSession().saveOrUpdate(r);

	}

	public void delete(Object r) {
		sessionFactory.getCurrentSession().delete(r);

	}

	public Object find(int id) {
		return sessionFactory.getCurrentSession().get(Pregunta.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Object> findAll() {
		return sessionFactory.getCurrentSession().createCriteria(Pregunta.class).list();
	}

}
package com.wsj.ssh.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wsj.ssh.bean.User;
import com.wsj.ssh.dao.UserDao;

@Repository("userDao")
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();		
	}
	
	public UserDaoImpl() {
		
	}

	public String register(User user) {		
		getSession().save(user);		
		return "success";
	}

	public User login(User user) {
		String hql = "from User u where u.username=? and u.password=?";
		Query query = getSession().createQuery(hql);
		query.setString(0, user.getUsername());
		query.setString(1, user.getPassword());		
		return (User)query.uniqueResult();
	}

	public User findUserById(Integer id) {
		String hql = "from User u where u.uid=?";
		Query query = getSession().createQuery(hql);
		query.setInteger(0, id);
		return (User) query.uniqueResult();
	}
	
	
	public List<User> findAll() {
		String hql = "from User";
		Query query = getSession().createQuery(hql);
		return query.list();
	}

}

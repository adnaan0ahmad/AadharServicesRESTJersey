package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Bean.Aadhar;


public class AadharCardOperations implements Operations<Aadhar>  {
	
	public static void dataValidator(Aadhar s) {
		if (s == null || s.getCity().trim().isEmpty() || s.getName().trim().isEmpty() || s.getAadharNo() <= 0)
			throw new InvalidDataQueryException("Invalid data passed as an entry for Database.");
	}

	public boolean add(Aadhar t) {
		dataValidator(t);
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction tr = s.beginTransaction();
		s.save(t);
		HibernateUtil.resourceCleanup(s, tr);
		return true;
	}


	public Aadhar get(int primaryKey) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction tr = s.beginTransaction();
		Aadhar a = s.get(Aadhar.class, primaryKey);
		HibernateUtil.resourceCleanup(s, tr);
		return a;
		
	}

	public List<Aadhar> getAll() {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction tr = s.beginTransaction();
		List <Aadhar> l = s.createQuery("From Aadhar").list();
		HibernateUtil.resourceCleanup(s, tr);
		return l;
	}

	public Aadhar update(Aadhar t) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction tr = s.beginTransaction();
		s.merge(t);
		HibernateUtil.resourceCleanup(s, tr);
		return t;
	}

	public boolean delete(int primaryKey) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction tr = s.beginTransaction();
		Aadhar a = s.get(Aadhar.class, primaryKey);
		s.delete(a);
		return true;
	}



	
}

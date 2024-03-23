package nha.dao;

import java.math.BigInteger;
import java.util.List;

import javax.websocket.Session;

import org.hibernate.Hibernate;

import nha.entity.EmployeesNguyenHongAn;

public class EmployeeDAOImpl implements EMPLOYEES_NguyenHongAn_Util  {
	
	@Override
	public List<EmployeesNguyenHongAn> getAllEmployee() {
		Session session = Hibernate.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			List<EmployeesNguyenHongAn> list = session.createQuery("from Employee").list();		
			session.getTransaction().commit();
			session.close();
			return list;
		} catch (Exception ex) {
			ex.printStackTrace();
			session.close();
		}
		return null;

	}

	@Override
	public EmployeesNguyenHongAn getEmployeeById(BigInteger id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			EmployeesNguyenHongAn EmployeesNguyenHongAn = (EmployeesNguyenHongAn)session.createQuery("from Employee where EMP_ID = :empId").setParameter("empId", id).uniqueResult();		
			session.getTransaction().commit();
			session.close();
			return employee;
		} catch (Exception ex) {
			ex.printStackTrace();
			session.close();
		}
		return null;
	}

	@Override
	public boolean insertEmployee(Employee employee) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.save(employee);
			session.getTransaction().commit();
			session.close();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			session.close();
		}
		return false;

	}

	@Override
	public boolean updateEmployee(Employee employee) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.update(employee);
			session.getTransaction().commit();
			session.close();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			session.close();
		}
		return false;

	}

	@Override
	public boolean deleteEmployee(BigInteger id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			int res = session.createQuery("delete from Employee where EMP_ID = :empId").setParameter("empId", id).executeUpdate();
			session.getTransaction().commit();
			session.close();
			if(res>0)
				return true;
				
		} catch (Exception ex) {
			ex.printStackTrace();
			session.close();
		}
		return false;

	}
	
	@Override
	public List<EmployeesNguyenHongAn> searchEmployeeByName(String name) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			List<EmployeesNguyenHongAn> list = session.createQuery("from Employee where EMP_NAME = :empName").setParameter("empName", name).list();		
			session.getTransaction().commit();
			session.close();
			return list;
		} catch (Exception ex) {
			ex.printStackTrace();
			session.close();
		}
		return null;
	}

	@Override
	public boolean insertEmployee(EmployeesNguyenHongAn EmployeesNguyenHongAn) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployee(EmployeesNguyenHongAn EmployeesNguyenHongAn) {
		// TODO Auto-generated method stub
		return false;
	}
}
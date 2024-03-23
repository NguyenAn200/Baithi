package nha.dao;

import java.math.BigInteger;
import java.util.List;

import nha.entity.EmployeesNguyenHongAn;

public interface EMPLOYEES_NguyenHongAn_Util {
	public List<EmployeesNguyenHongAn> getAllEmployee();
	public EmployeesNguyenHongAn getEmployeeById(BigInteger id);
	public boolean insertEmployee(EmployeesNguyenHongAn EmployeesNguyenHongAn);
	public boolean updateEmployee(EmployeesNguyenHongAn EmployeesNguyenHongAn);
	public boolean deleteEmployee(BigInteger id);
	public List<EmployeesNguyenHongAn> searchEmployeeByName(String id); 

}

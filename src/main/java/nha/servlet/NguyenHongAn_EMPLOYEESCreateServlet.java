package nha.servlet;

import java.math.BigInteger;
import java.util.Calendar;

import nha.dao.EmployeeDAOImpl;
import nha.entity.EmployeesNguyenHongAn;

public class NguyenHongAn_EMPLOYEESCreateServlet {
public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1999);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		
		EmployeesNguyenHongAn p = new EmployeesNguyenHongAn();
		p.setMans01(new BigInteger("7779"));
		p.setHotenns01("Gut");
		p.setHsluong01(4);	
	
		p.setAnhns01(null);
		p.setLuongcoban01(3000000);
		p.setTrangthai01(0);
		
		
		boolean flag = new EmployeeDAOImpl().insertEmployee(p);
		if(flag==true) {
			System.out.println("Thêm mới thành công!");
		}else {
			System.out.println("Sảy ra lỗi thêm mới sản phẩm");
		}
	}

}

package nha.entity;
// Generated Mar 23, 2024, 9:24:04 AM by Hibernate Tools 5.6.15.Final

/**
 * EmployeesNguyenHongAn generated by hbm2java
 */
public class EmployeesNguyenHongAn implements java.io.Serializable {

	private String mans01;
	private String hotenns01;
	private Integer hsluong01;
	private Double luongcoban01;
	private String anhns01;
	private Boolean trangthai01;

	public EmployeesNguyenHongAn() {
	}

	public EmployeesNguyenHongAn(String mans01) {
		this.mans01 = mans01;
	}

	public EmployeesNguyenHongAn(String mans01, String hotenns01, Integer hsluong01, Double luongcoban01,
			String anhns01, Boolean trangthai01) {
		this.mans01 = mans01;
		this.hotenns01 = hotenns01;
		this.hsluong01 = hsluong01;
		this.luongcoban01 = luongcoban01;
		this.anhns01 = anhns01;
		this.trangthai01 = trangthai01;
	}

	public String getMans01() {
		return this.mans01;
	}

	public void setMans01(String mans01) {
		this.mans01 = mans01;
	}

	public String getHotenns01() {
		return this.hotenns01;
	}

	public void setHotenns01(String hotenns01) {
		this.hotenns01 = hotenns01;
	}

	public Integer getHsluong01() {
		return this.hsluong01;
	}

	public void setHsluong01(Integer hsluong01) {
		this.hsluong01 = hsluong01;
	}

	public Double getLuongcoban01() {
		return this.luongcoban01;
	}

	public void setLuongcoban01(Double luongcoban01) {
		this.luongcoban01 = luongcoban01;
	}

	public String getAnhns01() {
		return this.anhns01;
	}

	public void setAnhns01(String anhns01) {
		this.anhns01 = anhns01;
	}

	public Boolean getTrangthai01() {
		return this.trangthai01;
	}

	public void setTrangthai01(Boolean trangthai01) {
		this.trangthai01 = trangthai01;
	}

}

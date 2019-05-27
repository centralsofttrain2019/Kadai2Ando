package jp.co.central_soft.train2019.bean;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EmployeeBean
{
	private 	int		employeeID	;//	INT	NOT	NULL,
	private 	String	employeeName	;//	VARCHAR(100),
	private 	BigDecimal	height	;//	DECIMAL(10	,	0),
	private 	BigDecimal	weight	;//	DECIMAL(10	,	0),
	private 	String	eMail	;//	VARCHAR(100),
	private 	int		hireFiscalYear	;//	INT,
	private 	LocalDate	birthday	;//	DATE,
	private 	String	bloodType	;//	VARCHAR(2),
	public int getEmployeeID() {
		return this.employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return this.employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public BigDecimal getHeight() {
		return this.height;
	}
	public void setHeight(BigDecimal height) {
		this.height = height;
	}
	public BigDecimal getWeight() {
		return this.weight;
	}
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
	public String getEMail() {
		return this.eMail;
	}
	public void setEMail(String eMail) {
		this.eMail = eMail;
	}
	public int getHireFiscalYear() {
		return this.hireFiscalYear;
	}
	public void setHireFiscalYear(int hireFiscalYear) {
		this.hireFiscalYear = hireFiscalYear;
	}
	public LocalDate getBirthday() {
		return this.birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public String getBloodType() {
		return this.bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + this.employeeID + ", employeeName=" + this.employeeName + ", height="
				+ this.height + ", weight=" + this.weight + ", eMail=" + this.eMail + ", hireFiscalYear="
				+ this.hireFiscalYear + ", birthday=" + this.birthday + ", bloodType=" + this.bloodType + "]";
	}
}


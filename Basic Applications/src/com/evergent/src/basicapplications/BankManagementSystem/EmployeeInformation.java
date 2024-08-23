package com.evergent.src.basicapplications.BankManagementSystem;

public class EmployeeInformation extends BankAccountDetails implements EmployeeInterface{
    int empno;
    double sal;
    String address;
    public void EmployeeInfo(int empno,float sal)
    {
    	this.empno=empno;
    	this.sal=sal;
    }
    public void EmployeeAddress(String address) {
    	this.address=address;
    }
    public void EmployeeDetails() {
    	System.out.println("Employee No :"+empno);
    	System.out.println("Employee sal :"+sal);
    	System.out.println("Employee Address :"+address);
    }
    public void AccountDetails() {
    	System.out.println("Myaccount details is : 1234578");
    }
    public void show() {
    	System.out.println("This is Show Local Method");
    }
    public static void main(String[] args) {
    	EmployeeInformation emp=new EmployeeInformation();
    	emp.EmployeeInfo(100,5000);
    	emp.EmployeeAddress("Hyderabad");
    	emp.EmployeeDetails();
    	emp.AccountDetails();
    	emp.BankDetails();
        new BankRBI();
    	new BankRBI(3.3,3.3);
    	BankRBI.GetBankDetails();
    	emp.show();
    }
}

package java8.concepts;

public class Employee implements Cloneable {

    private int empId;
    private String company;
    private String empName;
    private Address address;

    public Employee(int empId, String company, String empName, Address address) {
        this.empId = empId;
        this.company = company;
        this.empName = empName;
        this.address = address;
    }

    public int getEmpId() {
        return empId;
    }

    //Deep cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee emp = (Employee) super.clone();
        emp.setAddress((Address)address.clone());
        return emp;
    }

    //Shallow Cloning
    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/

    public String getCompany() {
        return company;
    }

    public String getEmpName() {
        return empName;
    }

    public Address getAddress() {
        return address;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", company='" + company + '\'' +
                ", empName='" + empName + '\'' +
                ", address=" + address +
                '}';
    }
}

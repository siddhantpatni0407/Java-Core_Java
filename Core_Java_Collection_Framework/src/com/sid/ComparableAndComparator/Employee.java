package com.sid.ComparableAndComparator;

/**
 * @author Siddhant Patni
 */
public class Employee implements Comparable<Employee> {
    public int employeeId;
    public String employeeName;

    public Employee(int employeeId, String employeeName) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Decreasing order sorting
	/*
	@Override
	public int compareTo(Employee obj) {
		if (this.employeeId > obj.employeeId)
			return -1;
		else if (this.employeeId < obj.employeeId)
			return 1;
		else
			return 0;
	}
	*/

    // Increasing order sorting
	/*
	@Override
	public int compareTo(Employee obj) {
		if (this.employeeId > obj.employeeId)
			return 1;
		else if (this.employeeId < obj.employeeId)
			return -1;
		else
			return 0;
	}
	*/

    @Override
    public int compareTo(Employee obj) {
        if (this.employeeId > obj.employeeId)
            return 1;
        else if (this.employeeId < obj.employeeId)
            return -1;
        else
            return this.employeeName.compareTo(obj.employeeName);
    }
}
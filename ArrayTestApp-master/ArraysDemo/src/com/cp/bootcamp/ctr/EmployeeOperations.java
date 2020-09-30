package com.cp.bootcamp.ctr;

import com.cp.bootcamp.bean.Employee;

public class EmployeeOperations {
	Employee arr[] = new Employee[100];
	static int index = 0;
	
	

	
	public boolean addEmployee(Employee e)
	{
		arr[index++] = e;
		return true;
	}
	
	public Employee getEmployeeById(int id)
	{
		Employee e = null;
		for (int i = 0; i < index; i++) {
			if(arr[i].getCode() == id)
			{
				return arr[i];
			}
		}
		return e;
	}
	
	public Employee[] displayAllEmployees()
	{
		return arr;
	}

	public int updateEmployeeSal(String project,int h)
	{
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getProject().contentEquals(project))
			{
				int s=arr[i].getSalary();
				s=(int)s+((s*h)/100);
				arr[i].setSalary(s);
				k=i;
			}
			
		}
		return arr[k].getSalary();
	}
}

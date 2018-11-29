package behavior.vistor;

import java.util.ArrayList;

public class EmployeeList {
	 //定义一个集合用于存储员工对象  
    private ArrayList<Employee> list = new ArrayList<Employee>();  

    public void addEmployee(Employee employee)  
    {  
        list.add(employee);  
    }  

    //遍历访问员工集合中的每一个员工对象  
    public void accept(Department handler)  
    {  
    	
    	for (Employee employee : list) {
			employee.accept(handler);
		}
    }  
}

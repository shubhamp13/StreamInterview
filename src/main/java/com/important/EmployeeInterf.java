package com.important;

import java.util.Date;
@FunctionalInterface
public interface EmployeeInterf 
{
	Employee getEmployee(String name,Double salary,Date join,String gender);
}

package com.psl.bean;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
 
@Controller
public class EmployeeController {
 
   Employee employee=new Employee();

    @RequestMapping(value = "/{name}", method = RequestMethod.GET/*, headers = "Accept=application/json"*/)
    public @ResponseBody Employee getEmployeeInJSON(@PathVariable String name) {
 
   	 employee.setName(name);
  	 employee.setEmail("employee1@genuitec.com");
 
    	return employee;
 
    }
    
   /* @RequestMapping(value="/{name}",method=RequestMethod.GET)
	@ResponseBody
	public String getMsg(@PathVariable String name){
		return "hello "+name;
		
	}*/
 
  /*  @RequestMapping(value = "/{name}.xml", method = RequestMethod.GET, headers = "application/xml")
    public @ResponseBody Employee getEmployeeInXML(@PathVariable String name) {
 
   	 employee.setName(name);
   	 employee.setEmail("employee1@genuitec.com");
 
   	 return employee;
 
    }*/
 
}

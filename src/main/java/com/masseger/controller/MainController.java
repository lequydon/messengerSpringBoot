package com.masseger.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "Welcome to Spring Boot + REST + JWT Example.";
    }
 
    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "{greeting: 'Hello'}";
    }
 
    // URL:
    // http://localhost:8080/employees
	/*
	 * @RequestMapping(value = "/employees", // method = RequestMethod.GET, //
	 * produces = { MediaType.APPLICATION_JSON_VALUE, //
	 * MediaType.APPLICATION_XML_VALUE })
	 */
 
    // URL:
    // http://localhost:8080/employee/{empNo}
	/*
	 * @RequestMapping(value = "/employee/{empNo}", // method = RequestMethod.GET,
	 * // produces = { MediaType.APPLICATION_JSON_VALUE, //
	 * MediaType.APPLICATION_XML_VALUE })
	 * 
	 * @ResponseBody public Employee getEmployee(@PathVariable("empNo") String
	 * empNo) { return employeeDAO.getEmployee(empNo); }
	 */
 
    // URL:
    // http://localhost:8080/employee
 
	/*
	 * @RequestMapping(value = "/employee", // method = RequestMethod.POST, //
	 * produces = { MediaType.APPLICATION_JSON_VALUE, //
	 * MediaType.APPLICATION_XML_VALUE })
	 * 
	 * @ResponseBody public Employee addEmployee(@RequestBody Employee emp) {
	 * 
	 * System.out.println("(Service Side) Creating employee: " + emp.getEmpNo());
	 * 
	 * return employeeDAO.addEmployee(emp); }
	 */
 
    // URL:
    // http://localhost:8080/employee
	/*
	 * @RequestMapping(value = "/employee", // method = RequestMethod.PUT, //
	 * produces = { MediaType.APPLICATION_JSON_VALUE, //
	 * MediaType.APPLICATION_XML_VALUE })
	 * 
	 * @ResponseBody public Employee updateEmployee(@RequestBody Employee emp) {
	 * 
	 * System.out.println("(Service Side) Editing employee: " + emp.getEmpNo());
	 * 
	 * return employeeDAO.updateEmployee(emp); }
	 */
 
    // URL:
    // http://localhost:8080/employee/{empNo}
	/*
	 * @RequestMapping(value = "/employee/{empNo}", // method =
	 * RequestMethod.DELETE, // produces = { MediaType.APPLICATION_JSON_VALUE,
	 * MediaType.APPLICATION_XML_VALUE })
	 * 
	 * @ResponseBody public void deleteEmployee(@PathVariable("empNo") String empNo)
	 * {
	 * 
	 * System.out.println("(Service Side) Deleting employee: " + empNo);
	 * 
	 * employeeDAO.deleteEmployee(empNo); }
	 */
}

package com.example.company.controller;

import com.example.company.model.Address;
import com.example.company.model.Employee;
import com.example.company.service.AddressService;
import com.example.company.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;
    private AddressService addressService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Employee> employeeList = employeeService.getAllEmployees();
        model.addAttribute("employees", employeeList);
        return "hello";
    }

    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "new_employee";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

    @GetMapping("showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable("id") Long id, Model model){
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "update_employee";
    }
}

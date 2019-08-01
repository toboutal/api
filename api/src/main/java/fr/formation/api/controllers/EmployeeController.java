package fr.formation.api.controllers;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.api.business.Employee;
import fr.formation.api.business.EmployeePatch;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Employee employee) {
	System.out.println(employee);
    }

    @GetMapping("/{internId}")
    public Employee employee(@PathVariable("internId") @Valid Long internId) {
	LocalDate entryDate = LocalDate.of(2012, 12, 21);
	Employee employee = new Employee(internId, "Boutaleb", entryDate);
	employee.setId(8);
	employee.setFirstName("Tom");
	employee.setDateOfBirth(LocalDate.of(1997, 12, 28));
	employee.setSalary(7589.5);
	return employee;
    }

    @GetMapping()
    public ArrayList<Employee> getAll() {
	ArrayList<Employee> employees = new ArrayList<>();
	LocalDate entryDate = LocalDate.of(2012, 12, 21);
	Long internId = Long.valueOf(8);
	Employee employee = new Employee(internId, "Boutaleb", entryDate);
	employee.setId(8);
	employee.setFirstName("Tom");
	employee.setDateOfBirth(LocalDate.of(1997, 12, 28));
	employee.setSalary(7589.5);
	//
	Long internId2 = Long.valueOf(9);
	Employee employee2 = new Employee(internId2, "Hubry", entryDate);
	employee2.setId(8);
	employee2.setFirstName("Emy");
	employee2.setDateOfBirth(LocalDate.of(1992, 12, 29));
	employee2.setSalary(5889.5);
	employee2.setFiredDate(LocalDate.of(2019, 07, 31));
	employees.add(employee);
	employees.add(employee2);
	return employees;
    }

    @DeleteMapping("/{internId}")
    public void delete(@PathVariable("internId") @Valid Long internId) {
	System.out.println("The employee " + internId + " is deleted");
    }

    @PatchMapping()
    public void fired(@RequestBody @Valid EmployeePatch endDate) {
	System.out.println("The employee is fired the " + endDate.getEndDate());
    }
}

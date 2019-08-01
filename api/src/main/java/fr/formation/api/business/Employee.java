package fr.formation.api.business;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

public class Employee {

    @NotEmpty
    private int id;

    @Size(min = 0, max = 10)
    private Long internId;

    @Size(min = 0, max = 150)
    private String firstName;

    @Size(min = 0, max = 150)
    private String lastName;

    @Past
    private LocalDate dateOfBirth;

    @PastOrPresent
    private LocalDate entryDate;

    @Min(0)
    private Double salary;

    @Future
    private LocalDate firedDate;

    // Constructor
    public Employee(Long internId, String lastName, LocalDate entryDate) {
	super();
	this.internId = internId;
	this.lastName = lastName;
	this.entryDate = entryDate;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public Long getInternId() {
	return internId;
    }

    public void setInternId(Long internId) {
	this.internId = internId;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
	return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getEntryDate() {
	return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
	this.entryDate = entryDate;
    }

    public Double getSalary() {
	return salary;
    }

    public void setSalary(Double salary) {
	this.salary = salary;
    }

    public LocalDate getFiredDate() {
	return firedDate;
    }

    public void setFiredDate(LocalDate firedDate) {
	this.firedDate = firedDate;
    }

    @Override
    public String toString() {
	return "Employee [id=" + id + ", internId=" + internId + ", firstName="
		+ firstName + ", lastName=" + lastName + ", dateOfBirth="
		+ dateOfBirth + ", entryDate=" + entryDate + ", salary="
		+ salary + ", firedDate=" + firedDate + "]";
    }
}

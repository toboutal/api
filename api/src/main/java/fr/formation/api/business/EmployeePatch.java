package fr.formation.api.business;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;

public class EmployeePatch {

    @Future
    @NotEmpty
    private LocalDate endDate;

    public LocalDate getEndDate() {
	return endDate;
    }

    public void setEndDate(LocalDate endDate) {
	this.endDate = endDate;
    }
}

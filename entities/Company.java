package com.rodrigo.aula134.entities;

public class Company extends TaxPayer {
	
	private Integer numberOfEmployee;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, Integer numberOfEmployee) {
		super(name, anualIncome);
		this.numberOfEmployee = numberOfEmployee;
	}

	public Integer getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(Integer numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	@Override
	public Double tax() {
		Double impost = 0.0;
		if(numberOfEmployee <=10) {
			impost = super.getAnualIncome() * 0.16;
		} else {
			impost = super.getAnualIncome() * 0.14;
		}
		return impost;
	}

}

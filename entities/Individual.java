package com.rodrigo.aula134.entities;

public class Individual extends TaxPayer{
	
	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		Double impost = 0.0;
		if(healthExpenditures <= (super.getAnualIncome() / 2.0)) {
			Double down = healthExpenditures /2;
			
			if( super.getAnualIncome() < 20000.00) {
				impost = (super.getAnualIncome() * 0.15) - down ;
			}else {
				impost = super.getAnualIncome() * 0.25 - down;
			}
		} else {
			if( super.getAnualIncome() < 20000.00) {
				impost = (super.getAnualIncome() * 0.15)  ;
			}else {
				impost = super.getAnualIncome() * 0.25 ;
			}
		}
		return impost;
	}

}

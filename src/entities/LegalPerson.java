package entities;

public class LegalPerson extends Taxpayer {

	private Integer numberEmployees;
	
	public LegalPerson() {
		super();
	}

	public LegalPerson(String name, Double income, Integer numberEmployees) {
		super(name, income);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}
	
	@Override
	public double tax() {
		
		if (numberEmployees < 10) {
			return super.getIncome() * 0.16;
		} else {
			return super.getIncome() * 0.14;
		}
		
	}
	
}

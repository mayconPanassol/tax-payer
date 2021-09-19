package entities;

public class PhysicalPerson extends Taxpayer{

	private Double helthExpenditures;
	
	public PhysicalPerson() {
		super();
	}

	public PhysicalPerson(String name, Double income, Double helthExpenditures) {
		super(name, income);
		this.helthExpenditures = helthExpenditures;
	}

	public Double getHelthExpenditures() {
		return helthExpenditures;
	}

	public void setHelthExpenditures(Double helthExpenditures) {
		this.helthExpenditures = helthExpenditures;
	}

	@Override
	public double tax() {
		
		if (helthExpenditures > 0) {
			
			if (super.getIncome() < 2000.00) {
				return ((super.getIncome() * 0.15) - (helthExpenditures * 0.5));
			} else {
				return ((super.getIncome() * 0.25) - (helthExpenditures * 0.5));
			}

		} else {
			
			if (super.getIncome() < 2000.00) {
				return (super.getIncome() * 0.15);
			} else {
				return (super.getIncome() * 0.25);
			}

		}
		
	}
	
}

package compositeModelCompany;

public class FinanceDepartment extends Company{

	public FinanceDepartment(String name) {
		super(name);
	}

	@Override
	public void add(Company company) {
		
	}

	@Override
	public void del(Company company) {
		
	}

	@Override
	public void show() {
		System.out.println("财务部:" + this.name);
	}

}

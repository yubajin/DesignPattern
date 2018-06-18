package compositeModelCompany;

public class HRDepartment extends Company{

	public HRDepartment(String name) {
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
		System.out.println("人力资源部:" + this.name);
	}

}

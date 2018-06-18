package compositeModelCompany;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company{
	private List<Company> children = new ArrayList<Company>(); 
	
	public ConcreteCompany(String name) {
		super(name);
	}

	@Override
	public void add(Company company) {
		children.add(company);
	}

	@Override
	public void del(Company company) {
		children.add(company);
	}

	@Override
	public void show() {
		System.out.println(this.name);
		System.out.println(this.name + "下属部门:");
			for (Company company : children) {
				System.out.print("\t");
				company.show();
			}
	}

}

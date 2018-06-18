package compositeModelCompany;

public abstract class Company {
	protected String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Company(String name){
		this.name = name;
	}
	public abstract void add(Company company);
	public abstract void del(Company company);
	public abstract void show();
	
}

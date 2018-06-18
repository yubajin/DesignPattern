package compositeModelCompany;

public class Client {
	public static void main(String[] args) {
		ConcreteCompany root = new ConcreteCompany("北京公司总部");
		
		FinanceDepartment financeDepartment = new FinanceDepartment("总公司财务部");
		HRDepartment hrDepartment = new HRDepartment("总公司人力资源部");
		ConcreteCompany shanghaiCompany = new ConcreteCompany("上海分公司");
		root.add(financeDepartment);
		root.add(hrDepartment);
		root.add(shanghaiCompany);

		FinanceDepartment shanghaiFinanceDepartment = new FinanceDepartment("上海分公司财务部");
		HRDepartment shanghaiHrDepartment = new HRDepartment("上海分公司人力资源部");
		ConcreteCompany nanjinAgency = new ConcreteCompany("南京办事处");
		shanghaiCompany.add(shanghaiFinanceDepartment);
		shanghaiCompany.add(shanghaiHrDepartment);
		shanghaiCompany.add(nanjinAgency);
		
		FinanceDepartment nanjinAgencyFinanceDepartment = new FinanceDepartment("南京办事处财务部");
		HRDepartment nanjinAgencyHrDepartment = new HRDepartment("南京办事处人力资源部");
		nanjinAgency.add(nanjinAgencyFinanceDepartment);
		nanjinAgency.add(nanjinAgencyHrDepartment);
		
		root.show();
	}
}

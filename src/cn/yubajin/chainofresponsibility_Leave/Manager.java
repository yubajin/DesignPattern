package cn.yubajin.chainofresponsibility_Leave;

public class Manager extends Leader{

	public Manager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays() < 10){
			System.out.println("经理" + name + "审批员工" + request.getLeaveName() + "的请假条天数为" + request.getLeaveDays() + "天。");			
		}else{
			if(this.successor != null){
				this.successor.handleRequest(request);
			}
		}
	}

}

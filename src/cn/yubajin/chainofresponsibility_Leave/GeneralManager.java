package cn.yubajin.chainofresponsibility_Leave;

public class GeneralManager extends Leader{
	public GeneralManager(String name){
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()<30){
			System.out.println("总经理" + name + "审批员工" + request.getLeaveName() + "的请假条天数为" + request.getLeaveDays() + "天。");			
		}else{
			System.out.println("总经理" + name + "拒绝审批员工" + request.getLeaveName() + "的请假");
		}
	}
}

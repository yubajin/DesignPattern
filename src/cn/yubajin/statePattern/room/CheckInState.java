package cn.yubajin.statePattern.room;

/** 
 * @Description: 入住可以退房
 */
public class CheckInState implements State {
	private static CheckInState singleton = new CheckInState();
    
	 public static State getInstance(){
	    return singleton;
	 }
	   
    public void bookRoom(Room room) {
        System.out.println("该房间已经入住了...");
    }

    public void checkInRoom(Room room) {
        System.out.println("该房间已经入住了...");
    }

    public void checkOutRoom(Room room) {
        System.out.println("退房成功....");
        room.changeState(FreeTimeState.getInstance());//变成空闲状态
    }

    public void unsubscribeRoom(Room room) {
        //不需要做操作
    }

}

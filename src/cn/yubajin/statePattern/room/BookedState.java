package cn.yubajin.statePattern.room;

/** 
 * @Description: 入住状态房间只能退房
 */
public class BookedState implements State {
	 private static BookedState singleton = new BookedState();
	    
	 public static State getInstance(){
	    return singleton;
	 }
	    
    public void bookRoom(Room room) {
        System.out.println("该房间已近给预定了...");
    }

    public void checkInRoom(Room room) {
        System.out.println("入住成功..."); 
        room.changeState(CheckInState.getInstance());//状态变成入住
    }

    public void checkOutRoom(Room room) {
        //不需要做操作
    }

    public void unsubscribeRoom(Room room) {
        System.out.println("退订成功,欢迎下次光临...");
        room.changeState(FreeTimeState.getInstance());//变成空闲状态
    }

}

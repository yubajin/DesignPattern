package cn.yubajin.statePattern.room;

/**  
 * @Description: 空闲状态只能预订和入住
 */
public class FreeTimeState implements State {
	//需要获取自身状态
    private static FreeTimeState singleton = new FreeTimeState();
    
    public static State getInstance(){
    	return singleton;
    }
    
    public void bookRoom(Room room) {
        System.out.println("您已经成功预订了...");
        room.changeState(BookedState.getInstance());//状态变成已经预订
    }

    public void checkInRoom(Room room) {
        System.out.println("您已经成功入住了...");
        room.changeState(CheckInState.getInstance());//状态变成已经入住
    }

    public void checkOutRoom(Room room) {
        //不需要做操作
    }

    public void unsubscribeRoom(Room room) {
        //不需要做操作
    }

}

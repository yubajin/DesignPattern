package cn.yubajin.statePattern.room;

public interface State {
   
	/**
	 * 有状态变化的函数需要传入Room
	 * @param room
	 */
    public void bookRoom(Room room);//预定
    
    public void unsubscribeRoom(Room room);//取消预定
    
    public void checkInRoom(Room room);//入住
    
    public void checkOutRoom(Room room);//退房
    
}

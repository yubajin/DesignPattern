package cn.yubajin.statePattern.room;

public abstract class AbsRoom {
	  	public void bookRoom(){}
	    
	    public void unsubscribeRoom(){}
	    
	    public void checkInRoom(){}
	    
	    public void checkOutRoom(){}
	    
	    public void changeState(State state){}
}

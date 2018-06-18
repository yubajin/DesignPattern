package cn.yubajin.statePattern.room;

public class Room extends AbsRoom{
    State state = FreeTimeState.getInstance();  
    
    public Room(){
    	
    }
    public void bookRoom(){
        state.bookRoom(this);
    }
    public void unsubscribeRoom(){
        state.unsubscribeRoom(this);
    }
    public void checkInRoom(){
        state.checkInRoom(this);
    }
    public void checkOutRoom(){
        state.checkOutRoom(this);
    } 
    //需要一个转换状态的函数
    public void changeState(State state){
    	this.state = state;
    }
    public String toString(){
        return "该房间的状态是:"+state.getClass().getName();
    }
    
}

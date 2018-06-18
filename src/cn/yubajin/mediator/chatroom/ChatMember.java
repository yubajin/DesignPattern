package cn.yubajin.mediator.chatroom;

public class ChatMember {
	protected AbstractChatroom chatroom;
	protected String name;
	
	public ChatMember(String name){
		
	}
	public AbstractChatroom getChatroom() {
		return chatroom;
	}
	public void setChatroom(AbstractChatroom chatroom) {
		this.chatroom = chatroom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void sendText(String to, String message){
		
	}
	public void sendImage(String to, String image){
		
	}
	public void receiveText(String from, String message){
		
	}
	public void receiveImage(String from, String image){
		
	}
}

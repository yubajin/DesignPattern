package cn.yubajin.mediator.chatroom;

public abstract class AbstractChatroom {
	public void register(ChatMember member){};
	public void sendText(String from, String to, String message){};
	public void sendImage(String from, String to, String image){};
}

package net.mcreator.lchengzhijian;

/**
 * 用于区分客户端/服务端线程组，供 LchengzhijianMod#queueServerWork 判断调用线程。
 */
public class SidedThreadGroups {
	public static final ThreadGroup CLIENT = new ThreadGroup("Client thread group");
	public static final ThreadGroup SERVER = new ThreadGroup("Server thread group");
}

package net.mcreator.lchengzhijian;

/**
 * 供 LchengzhijianMod#queueServerWork 使用的延时任务包装。
 */
public class TickTask {
	private final int tick;
	private final Runnable runnable;

	public TickTask(int tick, Runnable runnable) {
		this.tick = tick;
		this.runnable = runnable;
	}

	public int getTick() {
		return this.tick;
	}

	public void run() {
		this.runnable.run();
	}

	@Override
	public String toString() {
		return "TickTask{tick=" + this.tick + "}";
	}
}

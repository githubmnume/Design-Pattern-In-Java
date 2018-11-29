package structural.bridge;
/**
 * 播放器
 * @author zhouufen
 *
 */
public class Player {

	public void play() {
		OS os=new Windows(new RMVB());
		os.work();
	}

}

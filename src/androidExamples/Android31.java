package androidExamples;
//ID = 993137
import android.content.Context;
import android.os.PowerManager;

public class Android31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				PowerManager pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
				PowerManager.WakeLock wl = pm.newWakeLock(PowerManager.FULL_WAKE_LOCK, "My Tag");
	}

	private static PowerManager getSystemService(String powerService) {
		// TODO Auto-generated method stub
		return null;
	}

}

package androidExamples;
//ID = 1215817
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentFilter.MalformedMimeTypeException;
import android.os.Bundle;
import android.util.Log;

public class Android45 extends Activity {

private static final String TAG = "MyActivity";

@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    IntentFilter intentFilter = new IntentFilter();
    intentFilter.addAction(Intent.ACTION_SEND);
    intentFilter.addCategory(Intent.CATEGORY_DEFAULT);
    try {
  intentFilter.addDataType("image/*");
 } catch (MalformedMimeTypeException e) {
  Log.e(TAG, e.toString());
 }

    Intent x = registerReceiver(new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) { 
         Log.d(TAG, "Received intent "+intent);
         intent.setComponent(new ComponentName(context, Uploader.class));
         startActivity(intent);
        }
        }, intentFilter);

    if (x==null)
        Log.i(TAG, "failed to regist a receiver");
    else
        Log.i(TAG, "registed a receiver successfully");

}
class Uploader
{}
}
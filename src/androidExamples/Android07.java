package androidExamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import gen.R;
//ID = 288044
public class Android07 extends Activity{

			String[] mainItems = {
			    "Inbox", "Projects", "Contexts", "Next Actions"
			};

			@Override
			public void onCreate(Bundle icicle) {
			    super.onCreate(icicle);
			    setContentView(R.layout.main);

			    setListAdapter(new ArrayAdapter<String>(
			            this, android.R.layout.simple_list_item_1, mainItems));
			    registerForContextMenu(getListView());
			}

			private void setListAdapter(ArrayAdapter<String> arrayAdapter) {
				// TODO Auto-generated method stub
				
			}

			private View getListView() {
				// TODO Auto-generated method stub
				return null;
			}

}

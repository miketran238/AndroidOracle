package androidExamples;
//ID = 901057
import java.util.ArrayList;

import android.app.ListActivity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import gen.R;

public class Android25 extends ListActivity {
    /** Called when the activity is first created. */
    private final String MY_DATABASE_NAME = "myCoolUserDB.db";
    private final String MY_DATABASE_TABLE = "t_Users"; 
    Context c;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<String> results = new ArrayList<String>();
        setContentView(R.layout.main);
        SQLiteDatabase mydb=null;
        try
        {
            mydb.openOrCreateDatabase(MY_DATABASE_NAME,  null);

        } catch(Exception e){}
    }

}

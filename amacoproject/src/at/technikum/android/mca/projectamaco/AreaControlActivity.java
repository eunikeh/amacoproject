package at.technikum.android.mca.projectamaco;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AreaControlActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_area_control);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.area_control, menu);
		return true;
	}

}

package androidExamples;
//ID = 1153920

import java.util.List;

import android.os.Bundle;
import gen.R;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Overlay;

public class Android39 extends MapActivity {

	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);

		setContentView(R.layout.main);

		MapView myMapView = (MapView) findViewById(R.id.lay);
		MapController mapController = myMapView.getController();

		List<Overlay> overlays = myMapView.getOverlays();
		MyLocationOverlay myLocationOverlay = new MyLocationOverlay(this, myMapView);
		overlays.add(myLocationOverlay);
		myLocationOverlay.enableMyLocation();
	}

	protected boolean isRouteDisplayed() {

		return false;
	}

}

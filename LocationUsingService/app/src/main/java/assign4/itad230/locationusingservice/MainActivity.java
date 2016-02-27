package assign4.itad230.locationusingservice;

import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;

public class MainActivity extends AppCompatActivity {
    private GoogleApiClient mGoogleApiClient;
    private Location mLastLocation;
    private LocationRequest mLocationRequest;

    private TextView mLatitude;
    private TextView mLongitude;
    private TextView mLastUpdate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        //mGoogleApiClient.connect();
        super.onStart();
    }

    @Override
    protected void onStop() {
        //mGoogleApiClient.disconnect();
        super.onStop();
    }

    public void startButtonClick(View view) {
        Intent intent = new Intent(this, LocationService.class);
        startService(intent);
    }

    public void stopButtonClick(View view) {
        Intent intent = new Intent(this, LocationService.class);
        stopService(intent);
    }

    public void locsButtonClick(View view) {
        String str = "";
        for (String s : LocationService.locations) {
            str += (s + "\n");
        }
        TextView tv = (TextView) findViewById(R.id.locations);
        tv.setText(str);
    }
}

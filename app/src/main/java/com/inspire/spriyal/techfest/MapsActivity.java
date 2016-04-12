package com.inspire.spriyal.techfest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.maps.GoogleMap;

public class MapsActivity extends ActionBarActivity {

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);


        // Go to myurl.com when clicking on logo
        ImageView img = (ImageView)findViewById(R.id.imageView);

        img.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //WebView browser = (WebView) findViewById(R.id.webView2);
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                //browser.loadUrl("https://www.google.co.in/maps/place/C.K.Pithawalla+College+of+Engineering+and+Technology/@21.1331804,72.7170984,17z/data=!4m2!3m1!1s0x0000000000000000:0x00e21fee62fc1d40\"))");
                intent.setData(Uri.parse("https://www.google.co.in/maps/place/C.K.Pithawalla+College+of+Engineering+and+Technology/@21.1331804,72.7170984,17z/data=!4m2!3m1!1s0x0000000000000000:0x00e21fee62fc1d40"));
                startActivity(intent);
            }
        });

    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_maps);
//        //getActionBar().setTitle("R");
//
//        setUpMapIfNeeded();
//    }
//    }
}

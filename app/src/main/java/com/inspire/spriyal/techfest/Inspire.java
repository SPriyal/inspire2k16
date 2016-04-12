package com.inspire.spriyal.techfest;

/**
 * Created by Dhruv on 09-Feb-15.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by Dhruv on 09-Feb-15.
 */
public class Inspire extends Activity {

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 1000;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_splash);
        getActionBar().hide();

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(Inspire.this, MainActivity.class);
                Inspire.this.startActivity(mainIntent);
                Inspire.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}

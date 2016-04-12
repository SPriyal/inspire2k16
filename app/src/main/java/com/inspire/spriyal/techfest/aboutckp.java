package com.inspire.spriyal.techfest;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class aboutckp extends ActionBarActivity {

    ImageView iv,lv;
    TextView tv;
    AnimationDrawable frameanimation;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutusit);
        getSupportActionBar().hide();
        iv = (ImageView)findViewById(R.id.imageview);

        lv= (ImageView)findViewById(R.id.loopview);
        lv.setScaleType(ImageView.ScaleType.FIT_XY);
        lv.setBackgroundResource(R.drawable.animation_lis);


        iv.setImageResource(R.drawable.about);
        iv.setScaleType(ImageView.ScaleType.FIT_XY);


        tv = (TextView)findViewById(R.id.tv);
        tv.setText("C.K Pithawalla College of Engineering and Technology is a self financed Institute which started its functioning in December, 1998 affiliated with Veer Narmad South Gujarat University Surat initially and now with Gujrat Technological University (GTU) Gujrat. C.K Pithawalla College of Engineering And Technology is being managed by the Navyug Vidyabhavan Trust which was founded in February, 1965. Within a short span of its operation, the college has provided all the necessary facilities to help the students. Mr. C.K. Pithawalla has been the driving force for the setting up of this college named after him and is continuously drawing inspiration from him.");

        frameanimation = (AnimationDrawable)lv.getBackground();
        /*AnimationDrawable animation = new AnimationDrawable();
        animation.addFrame(getResources().getDrawable(R.drawable.geekwars), 100);
        animation.addFrame(getResources().getDrawable(R.drawable.robohustle), 500);
        animation.addFrame(getResources().getDrawable(R.drawable.roborace), 300);
        animation.setOneShot(false);


        iv.setBackgroundDrawable(animation);

        // start the animation!
        animation.start();
        //startAnimation();
*/


    }



    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            // Starting the animation when in Focus
            frameanimation.start();
        } else {
            // Stoping the animation when not in Focus
            frameanimation.stop();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_aboutusit, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*class Starter implements Runnable {
        public void run() {
            animation.start();
        }
    }

    private void startAnimation(){
        animation = new AnimationDrawable();
        animation.addFrame(getResources().getDrawable(R.drawable.circuitrix), 100);
        animation.addFrame(getResources().getDrawable(R.drawable.robohustle), 100);
        animation.addFrame(getResources().getDrawable(R.drawable.geekwars), 100);
        animation.addFrame(getResources().getDrawable(R.drawable.fest), 100);

        animation.setOneShot(true);

        ImageView imageView = (ImageView)findViewById(R.id.imageview);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(80, 90);
        params.alignWithParent = true;
        params.addRule(RelativeLayout.CENTER_IN_PARENT);

        imageView.setLayoutParams(params);
        imageView.setImageDrawable(animation);
        imageView.post(new Starter());
    }*/

}

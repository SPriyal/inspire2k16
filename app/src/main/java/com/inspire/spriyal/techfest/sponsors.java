package com.inspire.spriyal.techfest;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class sponsors extends ActionBarActivity {
    String[] values = new String[]{"abc","abc","abc"};
    private List<SP_images> t_events ;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);
        t_events = new ArrayList<SP_images>();
        t_events.add(new SP_images(R.drawable.uber));
        t_events.add(new SP_images(R.drawable.aquaair));
        t_events.add(new SP_images(R.drawable.atigo));
        t_events.add(new SP_images(R.drawable.avadh));
        t_events.add(new SP_images(R.drawable.axis));
        t_events.add(new SP_images(R.drawable.cad_expree));
        t_events.add(new SP_images(R.drawable.cad_2));
        t_events.add(new SP_images(R.drawable.city_bb));
        t_events.add(new SP_images(R.drawable.coffee));
        t_events.add(new SP_images(R.drawable.cool_fresh));
        t_events.add(new SP_images(R.drawable.destine));
        t_events.add(new SP_images(R.drawable.ecovision));
        t_events.add(new SP_images(R.drawable.ed_world));
        t_events.add(new SP_images(R.drawable.elight));
        t_events.add(new SP_images(R.drawable.etv));
        t_events.add(new SP_images(R.drawable.global));
        t_events.add(new SP_images(R.drawable.greenleaf));
        t_events.add(new SP_images(R.drawable.ice));
        t_events.add(new SP_images(R.drawable.image1));
        t_events.add(new SP_images(R.drawable.metalcraft));
        t_events.add(new SP_images(R.drawable.planet));
        t_events.add(new SP_images(R.drawable.rediocity));
        t_events.add(new SP_images(R.drawable.rush));
        t_events.add(new SP_images(R.drawable.sagar));
        t_events.add(new SP_images(R.drawable.yamaha));

        setTitle("Our Sponsors");

        final ArrayAdapter<SP_images> adapter = new MyListAdapter(this,values);
        ((ListView)findViewById(R.id.sp_list)).setAdapter(adapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

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


    private class MyListAdapter extends ArrayAdapter<SP_images> {
        //private final Context context;
        //private final String[] values;

        private final Context context;
        private final String[] values;

        public MyListAdapter(Context context, String[] values) {
            super(context, R.layout.sponsors, t_events);
            this.values = values;
            this.context = context;
        }
        //getView function is going to be implemented/overridden here..
        //Alt+Shift+S
        private int lastPosition = -1;




        public View getView(int position, View convertView, ViewGroup parent) {
            // Make sure we have a view to work with(may have been given null)

            final ViewHolder holder;
            View itemView = convertView;
            if (itemView == null) {

                itemView = getLayoutInflater().inflate(R.layout.sponsors, parent, false);
                holder = new ViewHolder();

                holder.imageView = (ImageView) itemView.findViewById(R.id.sp_imageview);

                itemView.setTag(holder);
            }else {

                holder = (ViewHolder)itemView.getTag();
            }
            //Find the car to work with.

            final SP_images currentimage = t_events.get(position);
            //Fill the View

            holder.imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            holder.imageView.setImageResource(currentimage.getImage_id());

            /*//Condition
            TextView conditionText = (TextView)itemView.findViewById(R.id.item_txtCondition);
            conditionText.setText(currentCar.getCondition());*/
            Animation animation = AnimationUtils.loadAnimation(getContext(), (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
            itemView.startAnimation(animation);
            lastPosition = position;
            return itemView;

            //return super.getView(position, convertView, parent);
        }
    }
    static class ViewHolder{
        ImageView imageView;


    }

}

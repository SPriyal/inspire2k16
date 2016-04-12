package com.inspire.spriyal.techfest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.util.Log;


public class contactus extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);
        //getSupportActionBar().setTitle("Contact US");
        getSupportActionBar().hide();

//        Button button = (Button) findViewById(R.id.imageButton);
//        button.OnClickListener(call());
//        b1=(Button)findViewById(R.id.button);
//        call();



        final Button button = (Button) findViewById(R.id.imageButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                call();// Perform action on click
            }
        });

        final Button button1 = (Button) findViewById(R.id.imageButton1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                call1();// Perform action on click
            }
        });

        final Button button2 = (Button) findViewById(R.id.imageButton2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                call2();// Perform action on click
            }
        });

        final Button button3 = (Button) findViewById(R.id.imageButton3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                call3();// Perform action on click
            }
        });

        final Button button4 = (Button) findViewById(R.id.imageButton4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                call4();// Perform action on click
            }
        });

        final Button button5 = (Button) findViewById(R.id.imageButton5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                call5();// Perform action on click
            }
        });

        final Button button6 = (Button) findViewById(R.id.imageButton6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                call6();// Perform action on click
            }
        });


        final Button button0 = (Button) findViewById(R.id.imageButton0);
        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                call0();// Perform action on click
            }
        });

        final Button button7 = (Button) findViewById(R.id.imageButton7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                call7();// Perform action on click
            }
        });

        final Button button8 = (Button) findViewById(R.id.imageButton8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                call8();// Perform action on click
            }
        });

        final Button button9 = (Button) findViewById(R.id.imageButton9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                call9();// Perform action on click
            }
        });

        final Button button10 = (Button) findViewById(R.id.imageButton10);
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                call10();// Perform action on click
            }
        });

        final Button button11 = (Button) findViewById(R.id.imageButton11);
        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                call11();// Perform action on click
            }
        });

        final Button button12 = (Button) findViewById(R.id.imageButton12);
        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                call12();// Perform action on click
            }
        });

        final Button button13 = (Button) findViewById(R.id.imageButton13);
        button13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                call13();// Perform action on click
            }
        });

        final Button button14 = (Button) findViewById(R.id.imageButton14);
        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                call14();// Perform action on click
            }
        });

        final Button button15 = (Button) findViewById(R.id.imageButton15);
        button15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                call15();// Perform action on click
            }
        });

        final Button button16 = (Button) findViewById(R.id.imageButton16);
        button16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                call16();// Perform action on click
            }
        });

        final Button button17 = (Button) findViewById(R.id.imageButton17);
        button17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                call17();// Perform action on click
            }
        });

        final Button button18 = (Button) findViewById(R.id.imageButton18);
        button18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                call18();// Perform action on click
            }
        });

        final Button button19 = (Button) findViewById(R.id.imageButton19);
        button19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                call19();// Perform action on click
            }
        });

        final Button button20 = (Button) findViewById(R.id.imageButton20);
        button20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                call20();// Perform action on click
            }
        });


    }

//    public void onClick(View v) {
//        Button button = (Button) findViewById(R.id.imageButton);
//
//        call();
//    }

//    final Button button = (Button) findViewById(R.id.imageButton);
//    button.OnClickListener (new View.OnClickListener()){
//        call();
//    }
//    button.setOnClickListener (new View.OnClickListener() {
//        public void onClick(View v) {
//            // Perform action on click
//
//            Intent activityChangeIntent = new Intent(PresentActivity.this, NextActivity.class);
//
//            // currentContext.startActivity(activityChangeIntent);
//
//            PresentActivity.this.startActivity(activityChangeIntent);
//        }
//    });



    private void call() {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9537358746"));
        startActivity(intent);
    }


    private void call1() {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9898203506"));
        startActivity(intent);
    }

    private void call2() {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9726117962"));
        startActivity(intent);
    }

    private void call3() {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9978555699"));
        startActivity(intent);
    }

    private void call4() {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9016190263"));
        startActivity(intent);
    }

    private void call5() {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "8866066301"));
        startActivity(intent);
    }

    private void call6() {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9099171614"));
        startActivity(intent);
    }

    private void call0() {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9712933288"));
        startActivity(intent);
        Log.d("check0", "check");
    }

    private void call7() {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "8980430366"));
        startActivity(intent);
        Log.d("check0","check");
    }

    private void call8() {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "8866649197"));
        startActivity(intent);
        Log.d("check0","check");
    }

    private void call9() {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9099689465"));
        startActivity(intent);
        Log.d("check0","check");
    }

    private void call10() {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "8460765178"));
        startActivity(intent);
        Log.d("check0","check");
    }

    private void call11() {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9624822175"));
        startActivity(intent);
    }

    private void call12() {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9913545352"));
        startActivity(intent);
    }

    private void call13() {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "8866279740"));
        startActivity(intent);
    }

    private void call14() {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "8460414977"));
        startActivity(intent);
    }

    private void call15() {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9825106121"));
        startActivity(intent);
    }

    private void call16() {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9825106121"));
        startActivity(intent);
    }

    private void call17() {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9909320833"));
        startActivity(intent);
    }

    private void call18() {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "7405163100"));
        startActivity(intent);
    }

    private void call19() {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "8460225662"));
        startActivity(intent);
    }

    private void call20() {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "8866245147"));
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_contactus, menu);
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
}

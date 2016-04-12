package com.inspire.spriyal.techfest.fragments_main;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.inspire.spriyal.techfest.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class home_fragment extends android.app.Fragment {
    TextView desc;
    String about = new String("C.K.PITHAWALA COLLEGE OF ENGINEERING AND TECHNOLOGY. \n" +
            "E-mail: inspire2k16@ckpcet.ac.in \n" +
            "Address: Near Malvan Mandir, Via Magdalla Port, Dumas Road, Surat. Technical Secretaries: \n" +
            "Somil Shah (+91 90161 90263),\n" +
            "Mihir Parmar (+91 88660 66301),\n" +
            "Shubham Dubey (+91 90991 71614)\n" +
            "Technical Co-ordinators:\n" +
            "Denish Mehta(+91 97261 17962)\n" +
            "Gopi Patel(+91 99785 55699) Chief Co-ordinators:\n" +
            "Ritesh Jha (+91 95373 58746)\n" +
            "Ashna Lakdawala (+91 98982 03506)");
    public home_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home_fragment, container, false);

       // desc.setText(about);

        return v;


    }


}

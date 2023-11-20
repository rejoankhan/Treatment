package com.android.treatment_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import soup.neumorphism.NeumorphButton;

public class AmbulanceActivity extends AppCompatActivity {
    ListView listViewAmbu;

    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance);
        listViewAmbu = findViewById(R.id.listViewAmbu);



        hashMap = new HashMap<>();
        hashMap.put("name", "এ্যামবুলেন্স ড্রাইভারঃ রুবেল রানা");
        hashMap.put("mobText", " মোবাইল নম্বরে ক্লিক করুনঃ ");
        hashMap.put("neuAmbu", " 01754547097 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", " এ্যামবুলেন্স ড্রাইভারঃ রুবেল রানা");
        hashMap.put("mobText", " মোবাইল নম্বরে ক্লিক করুনঃ ");
        hashMap.put("neuAmbu", " 01754547097 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", " এ্যামবুলেন্স ড্রাইভারঃ রুবেল রানা");
        hashMap.put("mobText", " মোবাইল নম্বরে ক্লিক করুনঃ");
        hashMap.put("neuAmbu", " 01754547097 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", " এ্যামবুলেন্স ড্রাইভারঃ রুবেল রানা");
        hashMap.put("mobText", " মোবাইল নম্বরে ক্লিক করুনঃ");
        hashMap.put("neuAmbu", " 01754547097 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "এ্যামবুলেন্স ড্রাইভারঃ রুবেল রানা");
        hashMap.put("mobText", " মোবাইল নম্বরে ক্লিক করুনঃ ");
        hashMap.put("neuAmbu", " 01754547097 ");
        arrayList.add(hashMap);



       MyAdapter myAdapter = new MyAdapter();
        listViewAmbu.setAdapter(myAdapter);


    }

    private class MyAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return arrayList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myView = layoutInflater.inflate(R.layout.sample_ambulance_layout, viewGroup, false);



            TextView ambuNameId = myView.findViewById(R.id.ambuNameId);
            TextView ambuTextMob = myView.findViewById(R.id.ambuTextMob);
            NeumorphButton neuAmbuId = myView.findViewById(R.id.neuAmbuId);


            HashMap<String, String> hashMap = arrayList.get(position);


            String name = hashMap.get("name");
            String mobText = hashMap.get("mobText");
            String neuAmbu = hashMap.get("neuAmbu");


            ambuNameId.setText(name);
            ambuTextMob.setText(mobText);
            neuAmbuId.setText(neuAmbu);


            // Set an OnClickListener to handle the click event
            neuAmbuId.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Get the mobile number from the TextView
                    String mobileNumber = neuAmbuId.getText().toString();

                    // Create an Intent to initiate the phone call
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + mobileNumber));

                    // Start the phone call activity
                    startActivity(intent);
                }
            });




            return myView;
        }
    }
}
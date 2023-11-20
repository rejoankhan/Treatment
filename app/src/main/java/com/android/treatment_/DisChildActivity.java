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

public class DisChildActivity extends AppCompatActivity {
    ListView listViewChild;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis_child);
        listViewChild = findViewById(R.id.listViewChild);



        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ তামান্না লিসা ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এফসিপিএস(শিশু) ");
        hashMap.put("specialist", " শিশু, কিশোর ও নবজাতক রোগের চিকিৎসক ");
        hashMap.put("station", "   শহীদ সোহরাওয়ার্দী মেডিকেল কলেজ,ঢাকা");
        hashMap.put("chamberTime", "চেম্বারঃ যমুনা ডায়াগনস্টিক সেন্টার,প্রতিদিন বিকাল ০৩ টা থেকে রাত ০৮টা");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01773980070 ");
        hashMap.put("secondCall", "01773980070   ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ মোঃ রুহুল আমিন");
        hashMap.put("degree", " এমবিবিএস ,এমপিএইচ,ডিসিএইচ (বিএসএমএমইউ)  ");
        hashMap.put("specialist", " শিশু কিশোর রোগ বিশেষজ্ঞ ");
        hashMap.put("station", " সহকারী অধ্যাপক (শিশু) (অবঃ) রংপুর মেডিকেল কলেজ রংপুর");
        hashMap.put("chamberTime", "চেম্বারঃ আলফা ডায়াগনস্টিক সেন্টার,প্রতিদিন বিকাল ৪ টা থেকে রাত ১০টা, বাসায় সরাসরি সিরিয়াল দিতে হয় সকাল ৭.০০ টা থেকে রোগী দেখে ১০ টা থেকে ১.০০ টা  ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01737088766 ");
        hashMap.put("secondCall", " 01912207915 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ মোঃ মোজাম্মেল হক ");
        hashMap.put("degree", " এমবিবিএস, এম এস (শিশু সার্জারী ");
        hashMap.put("specialist", "শিশুদের সার্জারী ও বিশেষজ্ঞ সার্জন  ");
        hashMap.put("station", " সহকারী অধ্যাপক- শহীদ মনসুর আলী মেডিকেল কলেজ- সিরাজগঞ্জ ");
        hashMap.put("chamberTime", "চেম্বারঃ সেন্ট্রাল ডায়াগনস্টিক সেন্টার (সিডিসি), প্রতি শুক্র ও শনিবার বিকাল ০৪ টা হতে রাত ০৮ টা,  ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01774336336 ");
        hashMap.put("secondCall", " 01774336336 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ মোঃ শাহিনুর রহমান (শাওন) ");
        hashMap.put("degree", " এমবিবিএস,বিসিএস স্বাস্থ্য, এম এস (শিশু সার্জারী) বিএসএমএমইউ ");
        hashMap.put("specialist", " নবজাতক, শিশু, কিশোর রোগ বিশেষজ্ঞ সার্জন  ");
        hashMap.put("station", " শিশু সার্জারী বিভাগ - রংপুর মেডিকেল কলেজ ও হাসপাতাল ");
        hashMap.put("chamberTime", "চেম্বারঃ রেইনবো হাসপাতাল এন্ড ডায়াগনস্টিক সেন্টার, প্রতি শুক্রবার সকাল ১০ টা হতে সন্ধ্যা ০৬ টা,  ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01869061360 ");
        hashMap.put("secondCall", "01869061390 ");
        arrayList.add(hashMap);




        MyAdapter myAdapter = new MyAdapter();
        listViewChild.setAdapter(myAdapter);


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
            View myView = layoutInflater.inflate(R.layout.sample_layout, viewGroup, false);

            TextView docNameId = myView.findViewById(R.id.docNameId);
            TextView docDegreeId = myView.findViewById(R.id.docDegreeId);
            TextView specialistId = myView.findViewById(R.id.specialistId);
            TextView workStationId = myView.findViewById(R.id.workStationId);
            TextView chamberTimeId = myView.findViewById(R.id.chamberTimeId);
            TextView callTextId = myView.findViewById(R.id.callTextId);
            NeumorphButton firstCallId = myView.findViewById(R.id.firstCallId);
            NeumorphButton secondCallId = myView.findViewById(R.id.secondCallId);


            HashMap<String, String> hashMap = arrayList.get(position);


            String name = hashMap.get("name");
            String degree = hashMap.get("degree");
            String specialist = hashMap.get("specialist");
            String station = hashMap.get("station");
            String chamberTime = hashMap.get("chamberTime");
            String callText= hashMap.get("callText");
            String firstCall = hashMap.get("firstCall");
            String secondCall = hashMap.get("secondCall");


            docNameId.setText(name);
            docDegreeId.setText(degree);
            specialistId.setText(specialist);
            workStationId.setText(station);
            chamberTimeId.setText(chamberTime);
            callTextId.setText(callText);
            firstCallId.setText(firstCall);
            secondCallId.setText(secondCall);

            // Set an OnClickListener to handle the click event
            firstCallId.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Get the mobile number from the TextView
                    String mobileNumber = firstCallId.getText().toString();

                    // Create an Intent to initiate the phone call
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + mobileNumber));

                    // Start the phone call activity
                    startActivity(intent);
                }
            });
            secondCallId.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Get the mobile number from the TextView
                    String mobileNumber = secondCallId.getText().toString();

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
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

public class DisNeckActivity extends AppCompatActivity {
    ListView listViewNeck;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis_neck);
        listViewNeck = findViewById(R.id.listViewNeck);

        hashMap = new HashMap<>();
        hashMap.put("name", " অধ্যাপক ডাঃ মোঃ আব্দুল ওয়াহেদ খান  ");
        hashMap.put("degree", " এমবিবিএস, ডিএলও (ডি.ইউ)   ");
        hashMap.put("specialist", "  নাক কান গলা ও হেড-নেক সার্জারী বিভাগ ");
        hashMap.put("station", " অধ্যাপক ও বিভাগীয় প্রধান (প্রাক্তন) রংপুর মেডিকেল কলেজ ও হাসপাতাল, রংপুর ");
        hashMap.put("chamberTime", "চেম্বারঃ হাসান এক্স-রে ক্লিনিক এন্ড প্যাথলজি, প্রতি শুক্রবার সকাল ১০ টা থেকে বিকাল ৫.০০ টা  ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01958439163");
        hashMap.put("secondCall", " 01773553536 ");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ মোঃ মন্জুরুল ইসলাম সুমন");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য,এমএস (ই এন টি) ");
        hashMap.put("specialist", " নাক কান গলা ও হেড-নেক বিশেষজ্ঞ ও সার্জন ");
        hashMap.put("station", " সহকারী অধ্যাপক ও বিভাগীয় প্রধান, এম আব্দুর রহিম মেডিকেল কলেজ ও হাসপাতাল দিনাজপুর");
        hashMap.put("chamberTime", "চেম্বারঃ সেবা ডায়াগনস্টিক সেন্টার,প্রতি শুক্রবার সকাল ০৯ টা থেকে সন্ধা ০৭টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01713671227 ");
        hashMap.put("secondCall", " 01713671229 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ  এ এম আল রাব্বানী ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এম এস (ইএনটি) ");
        hashMap.put("specialist", " নাক কান গলা ও হেড-নেক বিশেষজ্ঞ ও সার্জন ");
        hashMap.put("station", "   অধ্যাপক ও বিভািগীয় প্রধান, রংপুর মেডিকেল কলেজ ও হাসপাতাল রংপুর");
        hashMap.put("chamberTime", "চেম্বারঃ নিরাপদ ডায়াগনস্টিক সেন্টার, প্রতি শুক্রবার সকাল ১০ টা থেকে বিকাল ৬ টা পর্জন্ত");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01309262716 ");
        hashMap.put("secondCall", " 01785416642 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ শেখ মাসুদ ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এফসিপিএস (নাক, কান ও গলা) ");
        hashMap.put("specialist", " নাক কান গলা ও হেড-নেক বিশেষজ্ঞ ও সার্জন ");
        hashMap.put("station", "   সিনিয়র কনসালটেন্ট - ঠাকুরগা্ঁও জেনারেল হাসপাতাল");
        hashMap.put("chamberTime", "চেম্বারঃ নিরাপদ ডায়াগনস্টিক সেন্টার,শনিবার হতে বৃহস্পতিবার বিকাল ০৪ টা থেকে রাত ০৮টা");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01309262716 ");
        hashMap.put("secondCall", " 01785416642 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ শ্যামল চন্দ্র রায়");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এফসিপিএস (নাক, কান ও গলা) ");
        hashMap.put("specialist", " নাক কান গলা ও হেড-নেক বিশেষজ্ঞ ও সার্জন ");
        hashMap.put("station", "  আবাসিক সার্জন- রংপুর মেডিকেল কলেজ ও হাসপাতাল, রংপুর");
        hashMap.put("chamberTime", "চেম্বারঃ মাম হাসপাতাল ও ডায়াগনস্টিক সেন্টার,প্রতি শুক্রবার বিকাল ১০ টা থেকে রাত ০৮টা");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01746309999 ");
        hashMap.put("secondCall", " 01750668980 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ এ.এইচ.এম রসিদ-ই-মাহবুব ");
        hashMap.put("degree", " এমবিবিএস,বিসিএস স্বাস্থ্য , এফ.সি.পি .এস  ( নাক-কান - গলা ");
        hashMap.put("specialist", " নাক-কান-গলা রোগ বিশেষজ্ঞ ও হেড-নেক সার্জন  ");
        hashMap.put("station", " কনসালটেন্ট (নাক-কান-গলা) রংপুর মেডিকেল কলেজ ও হাসপাতাল-রংপুর ");
        hashMap.put("chamberTime", "চেম্বারঃ রেইনবো হাসপাতাল এন্ড ডায়াগনস্টিক সেন্টার, প্রতি শুক্রবার সকাল ১০ টা হতে রাত ০৬ টা,  ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01869061360 ");
        hashMap.put("secondCall", "01869061390 ");
        arrayList.add(hashMap);

        MyAdapter myAdapter = new MyAdapter();
        listViewNeck.setAdapter(myAdapter);


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
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

public class DisOrthoActivity extends AppCompatActivity {
    ListView listViewOrtho;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis_ortho);
        listViewOrtho = findViewById(R.id.listViewOrtho);



        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ আবু বকর সিদ্দিক দিপু");
        hashMap.put("degree", " এমবিবিএস বিসিএস স্বাস্থ্য  ");
        hashMap.put("specialist", " বাত ব্যথা প্যারালাইসিস, হাড় জোড়া   ");
        hashMap.put("station", " ঠাকুরগাঁও জেনারেল হাসপাতাল");
        hashMap.put("chamberTime", "চেম্বারঃ সেবা ডায়াগনস্টিক সেন্টার, প্রতিদিন বিকাল ৪.০০ টা থেকে রাত ১০.০০ টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01713671227 ");
        hashMap.put("secondCall", " 01713671229 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ মোঃ জিল্লুর রহমান সিদ্দিকি ");
        hashMap.put("degree", " এমবিবিএস, এম এস (আর্থ-সার্জারী) ");
        hashMap.put("specialist", " বাত ব্যথা,হাড়-জোড়া, আঘাত জনিত বিশেষজ্ঞ ও সার্জন ");
        hashMap.put("station", " সহকারী অধ্যাপক , এম আব্দুর রহিম মেডিকেল কলেজ ও হাসপাতাল দিনাজপুর");
        hashMap.put("chamberTime", "চেম্বারঃ নিরাপদ ডায়াগনস্টিক সেন্টার,সোমবার ও বুধবার বিকাল ০৪ টা থেকে রাত ০৮টা, শুক্রবার সকাল ১০ টা থকে-বিকাল৪ টা");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01309262716 ");
        hashMap.put("secondCall", " 01785416642 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ মোঃ মোস্তাফিজুর রহমান");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এফসিপিএস অর্থপেডিকস, পিজিটি (মেডিসিন)  ");
        hashMap.put("specialist", " বাত ব্যথা প্যারালাইসিস, হাড় জোড়া   ");
        hashMap.put("station", "মেডিকেল অফিসার,   ঠাকুরগাঁও জেনারেল হাসপাতাল");
        hashMap.put("chamberTime", "চেম্বারঃ যমুনা ডায়াগনস্টিক সেন্টার, প্রতিদিন বিকাল ৩.০০ টা থেকে রাত ০৮.০০ টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01773980070");
        hashMap.put("secondCall", " 01773980070 ");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ মোঃ মামুনুর রশীদ ");
        hashMap.put("degree", " এমবিবিএস,বিসিএস স্বাস্থ্য , এম এস (অর্থপেডিক সার্জারী) (পঙ্গু হাসপাতাল, ঢাকা) ");
        hashMap.put("specialist", " অর্থপেডিক ও ট্রমা রোগের বিশেষজ্ঞ ও সার্জন  ");
        hashMap.put("station", " কনসালটেন্ট (অর্থপেডিক সার্জারী) রংপুর মেডিকেল কলেজ ও হাসপাতাল-রংপুর ");
        hashMap.put("chamberTime", "চেম্বারঃ রেইনবো হাসপাতাল এন্ড ডায়াগনস্টিক সেন্টার, প্রতি শুক্রবার সকাল ১০ টা হতে রাত ০৮ টা,  ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01869061360 ");
        hashMap.put("secondCall", "01869061390 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ এনামুল হক");
        hashMap.put("degree", " এমবিবিএস,বিসিএস স্বাস্থ্য , এম এস (আর্থো)  ");
        hashMap.put("specialist", " হাড়-জোড়া-রোগের বিশেষজ্ঞ ও সার্জন  ");
        hashMap.put("station", " সহযোগী অধ্যাপক স্পোর্টস মেডিসিন এন্ড আর্থোস্কপি -এম আব্দুর রহিম মেডিকেল কলেজ -দিনাজপুর ");
        hashMap.put("chamberTime", "চেম্বারঃ সেন্ট্রাল ডায়াগনস্টিক সেন্টার (সিডিসি), প্রতিদিন বিকাল ০৩ টা হতে সন্ধা ০৬ টা,  ");
        hashMap.put("callText", " ফোনে সিরিয়াল নেওয়া হয় না সরাসরি যোগাযোগ করুন");
        hashMap.put("firstCall", " 000000000 ");
        hashMap.put("secondCall", " 000000000 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ মোঃ আব্দুল মোমেন");
        hashMap.put("degree", " এমবিবিএস,বিসিএস স্বাস্থ্য , এম এস (আর্থো - সার্জারী)  ");
        hashMap.put("specialist", " হাড়-জোড়া, বাত-ব্যাথা, ট্রমা বিশেষজ্ঞ ও সার্জন  ");
        hashMap.put("station", " সহযোগী অধ্যাপক  -রংপুর মেডিকেল কলেজ ও হাসপাতাল-রংপুর ");
        hashMap.put("chamberTime", "চেম্বারঃ দেশ এক্স-রে ক্লিনিক এন্ড প্যাথলজি , প্রতি শুক্রবার সকাল ১০ টা হতে রাত ০৮ টা  ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01722415651 ");
        hashMap.put("secondCall", "01722415651 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ মোঃ জিয়াউর রহমান");
        hashMap.put("degree", " এমবিবিএস,বিসিএস স্বাস্থ্য , এম এস (আর্থো - সার্জারী)  ");
        hashMap.put("specialist", " হাড়-জোড়া, বাত-ব্যাথা, ট্রমা বিশেষজ্ঞ ও সার্জন  ");
        hashMap.put("station", " কনসালটেন্ট (আর্থো-সার্জারী বিভাগ)  -রংপুর মেডিকেল কলেজ ও হাসপাতাল-রংপুর ");
        hashMap.put("chamberTime", "চেম্বারঃ দেশ এক্স-রে ক্লিনিক এন্ড প্যাথলজি , প্রতি শুক্রবার সকাল ০৯ টা হতে রাত ০৮ টা  ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01722415651 ");
        hashMap.put("secondCall", "01722415651 ");
        arrayList.add(hashMap);




        MyAdapter myAdapter = new MyAdapter();
        listViewOrtho.setAdapter(myAdapter);


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
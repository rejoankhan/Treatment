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

public class DisSkinActivity extends AppCompatActivity {
    ListView listViewSkin;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis_skin);
        listViewSkin = findViewById(R.id.listViewSkin);



        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ মোঃ সুলতান মাহবুব    ");
        hashMap.put("degree", " এমবিবিএস, এমডি (ডার্মাটোলোজি) এক্স-আই,এম ও ");
        hashMap.put("specialist", " চর্ম-যৌন, এলার্জি ও কুষ্ঠ রোগ বিশেষজ্ঞ ");
        hashMap.put("station", " রংপুর মেডিকেল কলেজ ও হাসপাতাল, রংপুর ");
        hashMap.put("chamberTime", "চেম্বারঃ মাম হাসপাতাল ও ডায়াগনস্টিক সেন্টার,প্রতি মাসের ২য় সপ্তাহ  শুক্রবার ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01746309999 ");
        hashMap.put("secondCall", " 01717371517 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ মোঃ আব্দুল কুদ্দুস ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এমফিল ( বিএসএমএমইউ)  (সিসি ডার্মাটোলোজি)");
        hashMap.put("specialist", " চর্ম, যৌন, এলার্জী ও কুষ্ঠরোগ বিশেষজ্ঞ ");
        hashMap.put("station", "  সহকারী অধ্যাপক, এম আব্দুর রহিম মেডিকেল কলেজ ও হাসপাতাল, দিনাজপুর");
        hashMap.put("chamberTime", "চেম্বারঃ যমুনা ডায়াগনস্টিক সেন্টার,প্রতি শুক্রবার সকাল ১০টা থেকে সন্ধা ০৮টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01766241916 ");
        hashMap.put("secondCall", " 01766241916 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ মোঃ সাজ্জাত হোসেন ");
        hashMap.put("degree", " এমবিবিএস, ডি ইউ  (ডিভিডি),বিএসএমএমইউ (পিজি হাসপাতাল)");
        hashMap.put("specialist", " চর্ম, যৌন, এলার্জী ও কুষ্ঠরোগ বিশেষজ্ঞ ");
        hashMap.put("station", "  রংপুর মেডিকেল কলেজ ও হাসপাতাল, রংপুর");
        hashMap.put("chamberTime", "চেম্বারঃ সেবা ডায়াগনস্টিক সেন্টার,প্রতি শুক্রবার সকাল ১০টা থেকে সন্ধা ০৭টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01713671227 ");
        hashMap.put("secondCall", " 01713671229 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ মোঃ রওজা ফিরোজ   ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, ডিডিভি (চর্ম ও যৌন) ( বিএসএমএমইউ) ");
        hashMap.put("specialist", " চর্ম, যৌন, এলার্জী ও কুষ্ঠ রোগ বিশেষজ্ঞ ");
        hashMap.put("station", " এক্স মেডিকেল অফিসার স্যার সলিমুল্লাহ মেডিকেল কলেজ মিটফোর্ড হাসপাতাল ঢাকা  ");
        hashMap.put("chamberTime", "চেম্বারঃ ফেয়ার এক্সরে এন্ড প্যাথলজি,প্রতি শুক্রবার বিকাল ১০ টা থেকে বিকাল ০৪ টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01716408889 ");
        hashMap.put("secondCall", " 017170907152 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ জলধি নাথ রায়   ");
        hashMap.put("degree", " এমবিবিএস (ডিএমসি), বিসিএস স্বাস্থ্য, এমফিল (সাইকিয়ার্ট্রি,বিএসএমএমইউ) ");
        hashMap.put("specialist", " মানসিক রোগ,স্নায়ুরোগ, মাদকাসক্তি ও যৌন দূর্বলতা বিশেষজ্ঞ ");
        hashMap.put("station", " সহকারী অধ্যাপক , এম আব্দুর রহিম মেডিকেল কলেজ ও হাসপাতাল দিনাজপুর  ");
        hashMap.put("chamberTime", "চেম্বারঃ ফেয়ার এক্সরে এন্ড প্যাথলজি,প্রতি শুক্রবার বিকাল ১০ টা থেকে বিকাল ০৪ টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01773565648 ");
        hashMap.put("secondCall", " 017170907152 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ  নুর নেওয়াজ আহমেদ ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, পিজিটি ইন ( মেডিসিন আমেরিকা),পিজিটি ইন (সার্জারী) এমসিএল (ভেলর ইন্ডিয়া) এমপিএইচ (কমিনিউটি মেডিসিন) এলি কোর্স (মেলবোর্ন অষ্ট্রেলিয়া) এম আর সি এস (ইন কোর্স) ডিএমইউ (আল্ট্র)");
        hashMap.put("specialist", " মেডিসিন হৃদরোগ ও চর্মরোগে বিশেষজ্ঞ  ");
        hashMap.put("station", " সিভিল সার্জন, ঠাকুরগা্ঁও  ");
        hashMap.put("chamberTime", "চেম্বারঃ নাহিন প্যাথলজি এন্ড ডিজিটাল এক্স-রে , ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01718545854 ");
        hashMap.put("secondCall", "02589931739 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ মোঃ তারেক জামাল ");
        hashMap.put("degree", " এমবিবিএস,(রাজ) পিজিটি (মেডিসিন) সিএমইউ, ডিএমইউ (আল্ট্রাসনোগ্রাম) ");
        hashMap.put("specialist", " মেডিসিন, ডায়াবেটিকস, বাত ব্যথা, বাথজ্বর, চর্ম-যৌন, মা ও শিশু, রোগের চিকিৎসক ");
        hashMap.put("station", " মেডিকেল অফিসার ও সনোলজিস্ট");
        hashMap.put("chamberTime", "চেম্বারঃ সুরক্ষা ডায়াগনস্টিক সেন্টার , প্রতিদিন সকাল ১০ টা হতে রাত ০৮.০০ টা, শুক্রবার বন্ধ ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01739519970 ");
        hashMap.put("secondCall", "01717676475 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ মোস্তফা কবির আহমেদ ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, ডিডিভি (পিজি হাসপাতাল) এফসিপিএস চর্ম,যৈৗন (শেষ পর্ব) ");
        hashMap.put("specialist", " চর্ম,যৈৗন, এলার্জি ও কুষ্ঠ রোগের বিশেষজ্ঞ ও সার্জন");
        hashMap.put("station", " কনসালটেন্ট, চর্ম যৌন রোগ বিভাগ, রংপুর মেডিকেল কলেজ ও হাসপাতাল ");
        hashMap.put("chamberTime", "চেম্বারঃ ফ্রেন্ডস এ্যাপোলো হাসপাতাল , প্রতি শুক্রবার সকাল ০৯ টা হতে সন্ধা ০৬.০০ টা, ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01735563963 ");
        hashMap.put("secondCall", "01919775074");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", " অধ্যাপক ডাঃ কে.এম. মোঃ বদরুদ দোহা ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এম ডি (চর্ম,যৌন) ");
        hashMap.put("specialist", " চর্ম,যৈৗন, এলার্জি ও কুষ্ঠ রোগের বিশেষজ্ঞ ও সার্জন");
        hashMap.put("station", " বিভাগীয় প্রধান, দিনাজপুর মেডিকেল কলেজ ও হাসপাতাল ");
        hashMap.put("chamberTime", "চেম্বারঃ দেশ এক্স-রে ক্লিনিক এন্ড প্যাথলজি , প্রতি শুক্রবার দুপুর ০২ টা হতে সন্ধা ০৬.০০ টা, ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01722415651 ");
        hashMap.put("secondCall", "01722415651 ");
        arrayList.add(hashMap);


        MyAdapter myAdapter = new MyAdapter();
        listViewSkin.setAdapter(myAdapter);


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
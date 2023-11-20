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

public class DisBrainActivity extends AppCompatActivity {
    ListView listViewBrain;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis_brain);
        listViewBrain = findViewById(R.id.listViewBrain);


        hashMap = new HashMap<>();
        hashMap.put("name", "অধ্যাপক ডাঃ এএসএম বদরুল হাসান");
        hashMap.put("degree", " এমবিবিএস এমসিপিএস (মেডিসিন) এমডি (নিউরোলজি)  ");
        hashMap.put("specialist", " মেম্বার আমেরিকান একাডেমি অফ নিউরোলোজি, ব্রেইন ষ্ট্রোক, প্যারালাইসিস,মৃগীরোগ,মাথাব্যথা,কোমর ব্যথা, ঘাড়ব্যথাসহ সকল স্নায়ুরোগ বিশেষজ্ঞ ");
        hashMap.put("station", " অধ্যাপক ও বিভাগীয় প্রধান নিউরো মেডিসিন বিভাগ, এম আব্দুর রহিম মেডিকেল কলেজ ও হাসপাতাল দিনাজপুর");
        hashMap.put("chamberTime", "চেম্বারঃ সেবা ডায়াগনস্টিক সেন্টার,প্রতি শুক্রবার সকাল ০৯ টা থেকে সন্ধা ০৭টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01713671227 ");
        hashMap.put("secondCall", " 01713671229 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ এ.আর মজুমদার");
        hashMap.put("degree", " এমবিবিএস বিসিএস স্বাস্থ্য এমডি (নিউরোলজি)  ");
        hashMap.put("specialist", " ব্রেইন ষ্ট্রোক, প্যারালাইসিস,মৃগীরোগ,মাথাব্যথা,কোমর ব্যথা, ঘাড়ব্যথাসহ সকল স্নায়ুরোগ বিশেষজ্ঞ ");
        hashMap.put("station", " ঢাকা মেডিকেল কলেজ ও হাসপাতাল, ঢাকা সিসিডি (বারডেম),পিজিটি (মেডিসিন),সিএমএইচ. ক্যান্টনমেন্ট ঢাকা");
        hashMap.put("chamberTime", "চেম্বারঃ বন্ধন ডায়াগনস্টিক সেন্টার,প্রতি শুক্রবার সকাল ১০ টা থেকে সন্ধা ০৬টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01737618040 ");
        hashMap.put("secondCall", " 01713749744 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ মোঃ আব্দুন নূর ওয়াহেদী খান");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এফসিপিএস (মেডিসিন),এফ পি, এমডি (নিউরোলোজী)  ");
        hashMap.put("specialist", " মেডিসিন, নিউরো-মেডিসিন,হৃদরোগ ও ডায়াবেটিক রোগে অভিজ্ঞ");
        hashMap.put("station", " ");
        hashMap.put("chamberTime", "চেম্বারঃ যমুনা ডায়াগনস্টিক সেন্টার,প্রতিদিন  সকাল ১০ টা থেকে রাত ০৮ টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01773980070");
        hashMap.put("secondCall", " ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ এ টি এম আসাদুল্লাহ");
        hashMap.put("degree", " এমবিবিএস, এম এস (নিউরোসার্জারী) ");
        hashMap.put("specialist", " মাথা ও ঘাড় ব্যাথা, কোমড়ের ব্যাথা,মেরুদন্ডে ব্যাথা,রগেড় ব্যাথা,হাত পা ঝিঝি করা,স্পাইনে টিউমার,মৃগী রোগ, ব্রেইন টিউমার,স্টোক ও প্যারালাইসিস রোগ বিশেষজ্ঞ ও সার্জন");
        hashMap.put("station", " সহজোগী অধ্যাপক,নিউরোসার্জারী বিভাগ ন্যাশনাল ইনস্টিটিউট অব নিউরোসায়েন্স ও  হাসপাতাল, শেরে বাংলা নগড়, ঢাকা");
        hashMap.put("chamberTime", "চেম্বারঃ মাম হাসপাতাল ও ডায়াগনস্টিক সেন্টার,প্রতি মাসের ২য় সপ্তাহ  শুক্রবার ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 001746309999 ");
        hashMap.put("secondCall", " 01717371517 ");
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
        hashMap.put("name", " ডাঃ এস এম আসাদুজ্জামান জুয়েল  ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এম এস (নিউরোসার্জারী) বিএসএমএমইউ ");
        hashMap.put("specialist", " নিউরো সার্জারী বিশেষজ্ঞ ও সার্জন");
        hashMap.put("station", " সহকারী অথ্যাপক, সিলেট এম,এ,জি ওসমানী মেডিকেল কলেজ ও হাসপাতাল ");
        hashMap.put("chamberTime", "চেম্বারঃ দেশ এক্স-রে ক্লিনিক এন্ড প্যাথলজি , প্রতি মাসের ২য় ও ৪র্থ সকাল ১১ টা হতে সন্ধা ০৬.০০ টা, ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01722415651 ");
        hashMap.put("secondCall", "01722415651 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ মোঃ তোজাম্মেল হক ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এফসিপিএস (মেডিসিন) ");
        hashMap.put("specialist", "মেডিসিন-নিউরোলজি-বক্ষব্যাধি-লিভার বিশেষজ্ঞ  ");
        hashMap.put("station", " সিনিয়র কনসালটেন্ট, ২৫০ শয্যা বিশিষ্ট জেনারেল হাসপাতাল, ঠাকুরগাাঁও  ");
        hashMap.put("chamberTime", "চেম্বারঃ সেন্ট্রাল ডায়াগনস্টিক সেন্টার (সিডিসি), প্রতিদিন বিকাল ০৩ টা হতে রাত ০৮ টা, বৃহষ্পতি ও শুক্রবার বন্ধ ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01755969106 ");
        hashMap.put("secondCall", "01755969106");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ খন্দকার আনজুমানারা বেগম (শীলা) ");
        hashMap.put("degree", " এমবিবিএস,এমসিপিএস (সাইক) এম ফিল (সাইক) বিএসএমএমইউ ");
        hashMap.put("specialist", " মাদকাশক্তি ও মানসিক রোগ বিশেষজ্ঞ  ");
        hashMap.put("station", " সহকারী অধ্যাপক মনোরোগ বিভাগ - প্রাইম মেডিকেল কলেজ- রংপুর ");
        hashMap.put("chamberTime", "চেম্বারঃ ফ্রেন্ডস এ্যাপোলো হাসপাতাল , প্রতি শুক্রবার বিকাল ০৩ টা হতে সন্ধা ০৬.০০ টা, ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01735563963 ");
        hashMap.put("secondCall", "01919775074");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ মুজাহিদুল ইসলাম মামুন ");
        hashMap.put("degree", " এমবিবিএস,বিসিএস স্বাস্থ্য , এম এস (নিউরোসার্জারী) ");
        hashMap.put("specialist", " ব্রেইন, মেরুদন্ড, স্ট্রোক ও নার্ভ রোগের বিশেষজ্ঞ নিউরো সার্জন  ");
        hashMap.put("station", " নিউরোসার্জন বিভাগ - ন্যাশনাল ইনস্টিটিউট অব নিউরোসায়েন্স এন্ড হাসপাতাল -আগারগা্ঁও ঢাকা ");
        hashMap.put("chamberTime", "চেম্বারঃ রেইনবো হাসপাতাল এন্ড ডায়াগনস্টিক সেন্টার, মাসে দুই শুক্রবার সকাল ০৯ টা হতে বিকাল ০৫ টা,  ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01869061360 ");
        hashMap.put("secondCall", "01869061390 ");
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






        MyAdapter myAdapter = new MyAdapter();
        listViewBrain.setAdapter(myAdapter);


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
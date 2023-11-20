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

public class DisHearActivity extends AppCompatActivity {
    ListView listViewHeart;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis_hear);
        listViewHeart = findViewById(R.id.listViewHeart);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ মোঃ আলিউল ইসলাম আশিক");
        hashMap.put("degree", " এমবিবিএস এফসিপিএস (মেডিসিন),এফ পি, এমডি (নিউরোলোজী)  ");
        hashMap.put("specialist", " মেডিসিন,হৃদরোগ ও ডায়াবেটিক রোগে বিশেষজ্ঞ ");
        hashMap.put("station", " মেডিকেল অফিসার - ঠাকুরগা্ঁও জেনারেল হাসপাতাল");
        hashMap.put("chamberTime", "চেম্বারঃ যমুনা ডায়াগনস্টিক সেন্টার,প্রতিদিন  সকাল ০৩ টা থেকে রাত ০৮ টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01773980070");
        hashMap.put("secondCall", " ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ মোঃ মামুন ইবনে আসরাফী   ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এফ এম ডি,সিসিই (ইকো),এফসিপিএস এফ পি (মেডিসিন)  ");
        hashMap.put("specialist", " মেডিসিন ও হৃদরোগ চিকিৎসক ");
        hashMap.put("station", " এম আব্দুর রহিম মেডিকেল কলেজ ও হাসপাতাল দিনাজপুর  ");
        hashMap.put("chamberTime", "চেম্বারঃ ফেয়ার এক্সরে এন্ড প্যাথলজি,প্রতিদিন বিকাল ০৩ টা থেকে রাত ১০ টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01750335474 ");
        hashMap.put("secondCall", " 01773565648 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃমোঃ আব্দুল খালেক");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য ,এমডি (কার্ডিওলোজি-পি) পিজিটি মেডিসিন এন্ডোক্রইনোলজি(ডায়াবেটিকস)  ");
        hashMap.put("specialist", " হৃদরোগ ও মেডিসিন বিশেষজ্ঞ ");
        hashMap.put("station", " স্যার সলিমুল্লাহ মেডিকেল কলেজ হাসপাতাল-ঢাকা");
        hashMap.put("chamberTime", "চেম্বারঃ বন্ধন ডায়াগনস্টিক সেন্টার,প্রতি শুক্রবার সকাল ১০ টা থেকে সন্ধা ০৬টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01737618040 ");
        hashMap.put("secondCall", " 01713749744 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ মোঃ আব্দুল মান্নান");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য,এমডি ডি-কার্ট (ডি.ইউ)  ");
        hashMap.put("specialist", " হৃদরোগ বিশেষজ্ঞ");
        hashMap.put("station", " সিনিয়র কনসাল্টেন্ট (অবঃ) দিনাজপুর জেনারেল হাসপাতাল,দিনাজপুর।");
        hashMap.put("chamberTime", "চেম্বারঃ সেবা ডায়াগনস্টিক সেন্টার, প্রতিদিন বিকাল ১০.০০ টা থেকে রাত ০৯.০০ টা");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01713671227 ");
        hashMap.put("secondCall", " 01713671229 ");
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
        hashMap.put("name", "  ডাঃ মোঃ রেজাউল করিম শিপলু ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, সিসিডি ডি কার্ড (কার্ডিওলজি) ডি,ইউ ");
        hashMap.put("specialist", "মেডিসিন-উচ্চ রক্তচাপ-বাতজ্বর-হৃদরোগ বিশেষজ্ঞ  ");
        hashMap.put("station", " সিনিয়র কনসালটেন্ট কার্ডিওলজি, ২৫০ শয্যা বিশিষ্ট জেনারেল হাসপাতাল, ঠাকুরগাাঁও  ");
        hashMap.put("chamberTime", "চেম্বারঃ সেন্ট্রাল ডায়াগনস্টিক সেন্টার (সিডিসি), প্রতিদিন বিকাল ০৩ টা হতে রাত ০৯ টা, বৃহষ্পতি ও শুক্রবার বন্ধ ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01794924310 ");
        hashMap.put("secondCall", "01794924310 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ বিভাস কুমার শীল ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এম ডি(কার্ডিওলজি) এম.এস.সি.পি (মেডিসিন) সিসিডি (বারডেম) ");
        hashMap.put("specialist", "মেডিসিন-উচ্চ রক্তচাপ-হৃদরোগ বিশেষজ্ঞ  ");
        hashMap.put("station", " সহকারী রেজিস্টার (এক্স) জাতীয় হৃদরোগ ইনস্টিটিউব ও হাসপাতাল-ঢাকা, কনসালটেন্ট-দিনাজপুর জেনারেল হাসপাতাল,দিনাজপুর  ");
        hashMap.put("chamberTime", "চেম্বারঃ সুরক্ষা ডায়াগনস্টিক সেন্টার , প্রতিশুক্রবার সকাল ০৯ টা হতে রাত ০৮.০০ টা,  ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01739519970 ");
        hashMap.put("secondCall", "01717676475 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ এ.কে.এম জাহিন (মিঠু) ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এফ সি পি এস (মেডিসিন) ডি কার্ড (কার্ডিওলজি) এম.এ.সি.পি (আমেরিকা) সিসিডি-ডায়াবেটলজি (বারডেম) ");
        hashMap.put("specialist", "মেডিসিন-উচ্চ রক্তচাপ-হৃদরোগ বিশেষজ্ঞ  ");
        hashMap.put("station", " ২৫০ শয্যা বিশিষ্ট জেনারেল হাসপাতাল, ঠাকুরগাাঁও  ");
        hashMap.put("chamberTime", "চেম্বারঃ রেইনবো হাসপাতাল এন্ড ডায়াগনস্টিক সেন্টার , প্রতিদিন বিকাল ০৩ টা হতে রাত ১০ টা, শুক্রবার সকাল ১০ টা হতে রাত ০৮.০০ টা, ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01869061360 ");
        hashMap.put("secondCall", "01869061390 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ অনুপম ঝাঁ ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য,  ডি কার্ড (বিএসএমএমইউ) সিসিডি (বারডেম) ");
        hashMap.put("specialist", "মেডিসিন-উচ্চ রক্তচাপ-হৃদরোগ বিশেষজ্ঞ  ");
        hashMap.put("station", " কনসালটেন্ট কার্ডিওলজি বিভাগ- ২৫০ শয্যা বিশিষ্ট জেনারেল হাসপাতাল, ঠাকুরগাাঁও  ");
        hashMap.put("chamberTime", "চেম্বারঃ দেশ এক্স-রে ক্লিনিক এন্ড প্যাথলজি , প্রতিদিন বিকাল ০৩ টা হতে রাত ১০ টা  শুক্রবার সারাদিন ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01722415651 ");
        hashMap.put("secondCall", "01722415651 ");
        arrayList.add(hashMap);



        MyAdapter myAdapter = new MyAdapter();
        listViewHeart.setAdapter(myAdapter);


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
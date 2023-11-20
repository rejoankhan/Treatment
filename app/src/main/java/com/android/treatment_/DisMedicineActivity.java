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

public class DisMedicineActivity extends AppCompatActivity {
    ListView listViewMedicine;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis_medicine);
        listViewMedicine = findViewById(R.id.listViewMedicine);
        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ এ এম ওয়াদুদ আল হাসান ");
        hashMap.put("degree", " এমবিবিএস,বিসিএস স্বাস্থ্য , এফ সি পি এস (মেডিসিন)");
        hashMap.put("specialist", " মেডিসিন বিশেষজ্ঞ ");
        hashMap.put("station", " কনসালটেন্ট (মেডিসিন) ঠাকুরগাঁও জেনারেল হাসপাতাল-ঠাকুরগাঁও ");
        hashMap.put("chamberTime", "চেম্বারঃ দেশ এক্স-রে ক্লিনিক এন্ড প্যাথলজি , প্রতিদিন বিকাল ০৩ টা হতে রাত ১০ টা, শুক্রবার সারাদিন  ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01722415651 ");
        hashMap.put("secondCall", "01722415651 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ মোঃ নুরুল হুদা ");
        hashMap.put("degree", " এমবিবিএস,বিসিএস স্বাস্থ্য , ");
        hashMap.put("specialist", " মেডিসিন চিকিৎসক ");
        hashMap.put("station", " প্রাক্তন সিভিল সার্জন -দিনাজপুর ");
        hashMap.put("chamberTime", "চেম্বারঃ দেশ এক্স-রে ক্লিনিক এন্ড প্যাথলজি , প্রতিদিন সকাল ১০ টা হতে সন্ধা ০৬ টা, ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01722415651 ");
        hashMap.put("secondCall", "01722415651 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ নারায়ন চন্দ্র সরকার ");
        hashMap.put("degree", " এমবিবিএস,বিসিএস স্বাস্থ্য , এফ সি পি এস (মেডিসিন)");
        hashMap.put("specialist", " মেডিসিন বিশেষজ্ঞ ");
        hashMap.put("station", " সহকারী অ্ধ্যাপক (মেডিসিন) রংপুর মেডিকেল কলেজ ও হাসপাতাল- রংপুর ");
        hashMap.put("chamberTime", "চেম্বারঃ ফ্রেন্ডস এ্যাপোলো হাসপাতাল , প্রতি শুক্রবার বিকাল ০৩ টা হতে সন্ধা ০৬.০০ টা, ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01735563963 ");
        hashMap.put("secondCall", "01919775074");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ মোঃ ফিরোজ জামান জুয়েল   ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এম পি এইচ (কমিউনিটি মেডিসিন) সিসিডি (বারডেম)  ");
        hashMap.put("specialist", " কমিউনিটি মেডিসিন ও ডায়বেটিকস বিশেষজ্ঞ ");
        hashMap.put("station", " ঠাকুরগাঁও জেনারেল হাসপাতাল  ");
        hashMap.put("chamberTime", "চেম্বারঃ মাম হাসপাতাল ও ডায়াগনস্টিক সেন্টার,প্রতিদিন বিকাল ০৪ টা থেকে রাত ০৯ টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 001746309999 ");
        hashMap.put("secondCall", " 01797861905 ");
        arrayList.add(hashMap);



        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ মোঃ আলী আফজাল ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এমডি (মেডিসিন)");
        hashMap.put("specialist", " মেডিসিন বিশেষজ্ঞ ");
        hashMap.put("station", "  উপজেলা স্বাস্থ কমপ্লেক্স , বালিয়াডাঙ্গী ঠাকুরগা্ঁও");
        hashMap.put("chamberTime", "চেম্বারঃ সেবা ডায়াগনস্টিক সেন্টার,প্রতিদিন বিকাল ০৪ টা থেকে রাত ০৯টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01713671227 ");
        hashMap.put("secondCall", " 01713671229 ");
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
        hashMap.put("name", "ডাঃ শাহরিয়ার আহমেদ শাকিল");
        hashMap.put("degree", " এমবিবিএস, এফএমডি(ইউএসটি),এমএস(ডিইউ), ফেলো ইন পেইন মেডিসিন,ইএফআইসি(ডেনমার্ক),আইএসপি(আমেরিকা) ");
        hashMap.put("specialist", " ব্যথা মেডিসিন বিশেষজ্ঞ ");
        hashMap.put("station", " রাজউক হাসপাতাল-ঢাকা");
        hashMap.put("chamberTime", "চেম্বারঃ যমুনা ডায়াগনস্টিক সেন্টার,প্রতি বৃহস্পতিবার  সকাল ১০ টা থেকে রাত ০৮ টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01773980070");
        hashMap.put("secondCall", "01773980070 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ মোঃ মোস্তাফিজুর রহমান");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এফসিপিএস অর্থপেডিকস, পিজিটি (মেডিসিন)  ");
        hashMap.put("specialist", " বাত ব্যথা প্যারালাইসিস, হাড় জোড়া   ");
        hashMap.put("station", "মেডিকেল অফিসার,   ঠাকুরগাঁও জেনারেল হাসপাতাল");
        hashMap.put("chamberTime", "চেম্বারঃ যমুনা ডায়াগনস্টিক সেন্টার, প্রতিদিন বিকাল ৩.০০ টা থেকে রাত ০৮.০০ টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01773980070");
        hashMap.put("secondCall", "01773980070  ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ মোঃ হাবিব-রাসুল (লিটন)  ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এফসিপিএস (মেডিসিন) সিসিডি-ডায়াবেটোলোজী (বারডেম) এমএসিপি (আমেরিকা)  ");
        hashMap.put("specialist", "  মেডিসিন ও ডায়াবেটিস বিশেষজ্ঞ ");
        hashMap.put("station", " কনসালটেন্ট (মেডিসিনি) ঠাকুরগাঁও জেনারেল হাসপাতাল ");
        hashMap.put("chamberTime", "চেম্বারঃ হাসান এক্স-রে ক্লিনিক এন্ড প্যাথলজি, প্রতিদিন বিকাল ০৩.০০ টা থেকে রাত ১০ টা পর্জন্ত শুক্রবার সকাল ১০ টা থেকে রাত ১০.০০ টা  ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01958439163");
        hashMap.put("secondCall", " 01773553536 ");
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
        hashMap.put("name", "  ডাঃ  নুর নেওয়াজ আহমেদ ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, পিজিটি ইন ( মেডিসিন আমেরিকা),পিজিটি ইন (সার্জারী) এমসিএল (ভেলর ইন্ডিয়া) এমপিএইচ (কমিনিউটি মেডিসিন) এলি কোর্স (মেলবোর্ন অষ্ট্রেলিয়া) এম আর সি এস (ইন কোর্স) ডিএমইউ (আল্ট্র)");
        hashMap.put("specialist", " মেডিসিন হৃদরোগ ও চর্মরোগে বিশেষজ্ঞ  ");
        hashMap.put("station", " সিভিল সার্জন, ঠাকুরগা্ঁও  ");
        hashMap.put("chamberTime", "চেম্বারঃ নাহিন প্যাথলজি এন্ড ডিজিটাল এক্স-রে , ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01718545854 ");
        hashMap.put("secondCall", "02589931739 ");
        arrayList.add(hashMap);



        MyAdapter myAdapter = new MyAdapter();
        listViewMedicine.setAdapter(myAdapter);


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
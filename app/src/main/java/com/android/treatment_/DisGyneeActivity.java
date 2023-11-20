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

public class DisGyneeActivity extends AppCompatActivity {
    ListView listViewGynee;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis_gynee);
        listViewGynee = findViewById(R.id.listViewGyene);



        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ সালমা সুলতানা ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এফসিপিএস (গাইনি এন্ড অবস)");
        hashMap.put("specialist", " স্ত্রীরোগ ও প্রসুতি বিদ্যা বিশেষজ্ঞ ও সার্জন ");
        hashMap.put("station", "  কনসালটেন্ট (গাইনি এন্ড অবস বিভাগ  ঠাকুরগাঁও জেনারেল হাসপাতাল");
        hashMap.put("chamberTime", "চেম্বারঃ সেবা ডায়াগনস্টিক সেন্টার,প্রতিদিন বিকাল ০৪ টা থেকে রাত ০৯টা পর্জন্ত, বৃহস্পতিবার বন্ধ ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01713671227 ");
        hashMap.put("secondCall", " 01713671229 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ স্মৃতি হক ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এফসিপিএস (গাইনি এন্ড অবস) ");
        hashMap.put("specialist", " স্ত্রীরোগ ও প্রসুতি বিদ্যা বিশেষজ্ঞ ও সার্জন ");
        hashMap.put("station", "   কনসালটেন্ট - ঠাকুরগা্ঁও জেনারেল হাপাতাল");
        hashMap.put("chamberTime", "চেম্বারঃ নিরাপদ ডায়াগনস্টিক সেন্টার,শনিবার হতে বৃহস্পতিবার বিকাল ০৪ টা থেকে রাত ০৮টা");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01309262716 ");
        hashMap.put("secondCall", " 01785416642 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ আবিদা সুলতানা ");
        hashMap.put("degree", " এমবিবিএস, পিজিটি (গাইনি এন্ডস অবস) ");
        hashMap.put("specialist", " স্ত্রীরোগ ও প্রসুতি বিদ্যা বিশেষজ্ঞ ও সার্জন ও ডায়াবেটিক রোগে অভিজ্ঞ ");
        hashMap.put("station", "   সিসিডি (ডায়াবেটলজি),বারডেম,ঢাক");
        hashMap.put("chamberTime", "চেম্বারঃ যমুনা ডায়াগনস্টিক সেন্টার,প্রতিদিন সকাল ১০ টা থেকে রাত ০৮টা");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01773980070 ");
        hashMap.put("secondCall", "  ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ আনজুমান আরা বেগম লাকী ");
        hashMap.put("degree", " এমবিবিএস, পিজিটি (গাইনি এন্ডস অবস) ");
        hashMap.put("specialist", " স্ত্রীরোগ ও প্রসুতি বিদ্যা রোগে অভিজ্ঞ এব সনোলোজিস্ট");
        hashMap.put("station", "   সিসিডি ,বারডেম,ঢাকা");
        hashMap.put("chamberTime", "চেম্বারঃ যমুনা ডায়াগনস্টিক সেন্টার,প্রতিদিন সকাল ১০ টা থেকে রাত ০৮টা");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01773980070 ");
        hashMap.put("secondCall", "  ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ মোঃ জাফিরুল হাসান ");
        hashMap.put("degree", " এমবিবিএস, এমসিপিএস,এফসিপিএস (গাইনি এন্ড অবস) ");
        hashMap.put("specialist", " স্ত্রীরোগ ও প্রসুতি বিদ্যা রোগে বিশেষজ্ঞ ");
        hashMap.put("station", "   সহযোগী অধ্যাপক, ও বিভাগীয় প্রধান, রংপুর কমিউনিটি মেডিকেল কলেজ ও হাসপাতাল রংপুর");
        hashMap.put("chamberTime", "চেম্বারঃ যমুনা ডায়াগনস্টিক সেন্টার,প্রতিদিন সকাল ১০ টা থেকে রাত ০৮টা");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01719001221 ");
        hashMap.put("secondCall", " 01737088766 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ  আশরাফী রহমান ");
        hashMap.put("degree", " এমবিবিএস, (ডি.ইউ) পিজিটি (গাইনি এন্ড অবস) সিএমইউ (আল্ট্রাসনোগ্রাম),সিসিডি (ডায়াবেটলজি),বারডেম হাসপাতাল,ঢাকা ");
        hashMap.put("specialist", " ম স্ত্রীরোগ ও প্রসুতি চিকিৎসক ও সার্জন  ");
        hashMap.put("station", " সিভিল সার্জন, ঠাকুরগা্ঁও  ");
        hashMap.put("chamberTime", "চেম্বারঃ নাহিন প্যাথলজি এন্ড ডিজিটাল এক্স-রে , ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01718545854 ");
        hashMap.put("secondCall", "02589931739 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ মোছাঃ রোকেয়া সাত্তার ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এফসিপিএস (গাইনি এন্ড অবস) সিনিয়র কনসালটেন্ট গাইনি এন্ড অবস ");
        hashMap.put("specialist", " স্ত্রীরোগ ও প্রসুতি চিকিৎসক ও সার্জন  ");
        hashMap.put("station", " ২৫০ শয্যা বিশিষ্ট জেনারেল হাসপাতাল, ঠাকুরগাাঁও  ");
        hashMap.put("chamberTime", "চেম্বারঃ সেন্ট্রাল ডায়াগনস্টিক সেন্টার (সিডিসি), প্রতিদিন বিকাল ০৪ টা হতে রাত ০৮ টা, বৃহষ্পতি ও শুক্রবার বন্ধ ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01761827977 ");
        hashMap.put("secondCall", "01774336336 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ মোছাঃ নাহিদা সিদ্দিকা ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এফসিপিএস (গাইনি এন্ড অবস) কনসালটেন্ট গাইনি এন্ড অবস ");
        hashMap.put("specialist", " স্ত্রীরোগ ও প্রসুতি চিকিৎসক ও সার্জন  ");
        hashMap.put("station", " মাম হাসপাতাল এন্ড ডায়াগনস্টিক সেন্টার , ঠাকুরগাাঁও  ");
        hashMap.put("chamberTime", "চেম্বারঃ মাম হাসপাতাল এন্ড ডায়াগনস্টিক সেন্টার,প্রতিদিন বিকাল ০৪ টা হতে রাত ০৮ টা,  শুক্রবার বন্ধ  ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01746309999 ");
        hashMap.put("secondCall", "01797861905");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ ফারহানা রহমান মিতু ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, ডিজিও (গাইনি এন্ড অবস) বিএসএমএমইউ ");
        hashMap.put("specialist", " গাইনি বিশেষজ্ঞ ও সার্জন (বন্ধ্যা রোগে বিশেষ প্রশিক্ষন প্রাপ্ত)  ");
        hashMap.put("station", " ২৫০ শয্যা বিশিষ্ট জেনারেল হাসপাতাল, ঠাকুরগাাঁও ");
        hashMap.put("chamberTime", "চেম্বারঃ দেশ এক্স-রে ক্লিনিক এন্ড প্যাথলজি,প্রতিদিন বিকাল ০৩ টা হতে রাত ০৮ টা,  শুক্রবার সারাদিন  ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01722415651 ");
        hashMap.put("secondCall", "01722415651 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ খাদিজা করিম ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, ডিএমইউ, এফসিপিএস (গাইনি এন্ড অবস) বিএসএমএমইউ ");
        hashMap.put("specialist", " গাইনি, স্ত্রীরোগ ও প্রসুতি বিশেষজ্ঞ ও সার্জন  ");
        hashMap.put("station", " ২৫০ শয্যা বিশিষ্ট জেনারেল হাসপাতাল, ঠাকুরগাাঁও ");
        hashMap.put("chamberTime", "চেম্বারঃ ফ্রেন্ডস এপোলো হাসপাতাল, প্রতিদিন বিকাল ০৩ টা হতে রাত ০৮ টা,  শুক্রবার ঠাকুরগা্ও রোডে বসে (নিচের ২য় মোবাইল নং) ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01735563963 ");
        hashMap.put("secondCall", "01737177902 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ লাবনী বসাক ");
        hashMap.put("degree", " এমবিবিএস,(রাজ)  বিসিএস (পরিবার পরিকল্পনা), সিসিডি বারডেম, সিএমইউ (আল্ট্রা), ই্ওসিটি(গাইনি এন্ড অবস) বিএসএমএমইউ ");
        hashMap.put("specialist", " গাইনি, স্ত্রীরোগ ও প্রসুতি বিশেষজ্ঞ ও সার্জন  ");
        hashMap.put("station", " মেডিকেল অফিসার মাতৃসদন, ঠাকুরগাাঁও ");
        hashMap.put("chamberTime", "চেম্বারঃ শুভ প্যাথলজি , প্রতিদিন বিকাল ০৪ টা হতে রাত ০৮.৩০ টা, ছুটির দিন সারাদিন ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01733833685 ");
        hashMap.put("secondCall", "01733833685 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ রসনা বর্মন রোজ ");
        hashMap.put("degree", " এমবিবিএস,(রাজ)  সিসিডি বারডেম, সিএমইউ (আল্ট্রা), ই্ওসি পিজিটি (গাইনি এন্ড অবস) সিএমইউ, ডিএমইউ (সিমুড ঢাকা) আল্ট্রাসনোগ্রাম স্পেশালিস্ট ");
        hashMap.put("specialist", " শিশু, স্ত্রীরোগ ও প্রসুতি চিকিৎসক ও সার্জন  ");
        hashMap.put("station", " প্রাক্তন মেডিকেল অফিসার  ল্যাম্ব হাসপাতাল পার্বতিপুর দিনাজপুর, প্রাক্তন সহকারী রেজিস্টার, রংপুর কমিউনিটি মেডিকেল কলেজ ও হাসপাতাল রংপুর");
        hashMap.put("chamberTime", "চেম্বারঃ সুরক্ষা ডায়াগনস্টিক সেন্টার , প্রতিদিন সকাল ১০ টা হতে রাত ০৮.০০ টা, ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01739519970 ");
        hashMap.put("secondCall", "01717676475 ");
        arrayList.add(hashMap);





        MyAdapter myAdapter = new MyAdapter();
        listViewGynee.setAdapter(myAdapter);


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
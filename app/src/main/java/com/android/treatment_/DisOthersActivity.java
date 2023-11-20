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

public class DisOthersActivity extends AppCompatActivity {
    ListView listViewOthers;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis_others);

        listViewOthers = findViewById(R.id.listViewOthers);
        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ মোঃ হানিফ উলুব্বী");
        hashMap.put("degree", " এমবিবিএস, এম ডি (রেডিয়েশন অনকোলজী) ");
        hashMap.put("specialist", " ক্যান্সার বিশেষজ্ঞ  ");
        hashMap.put("station", " সহকারী অধ্যাপক জাতীয় ক্যান্সার গবেষনা ইন্সটিটিউট ও হাসপাতাল মহাখালী - ঢাকা ");
        hashMap.put("chamberTime", "চেম্বারঃ সেন্ট্রাল ডায়াগনস্টিক সেন্টার (সিডিসি), কেমোথেরাপি দেওয়া হয়-রোগী দেখার পরবর্তি তারিখের জন্য কল করুন  ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন");
        hashMap.put("firstCall", " 01774336336 ");
        hashMap.put("secondCall", "01774336336 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ মোঃ মাহমুদ হাসান সোহাগ  ");
        hashMap.put("degree", " এমবিবিএস, এম এস (ইউরোলজি) ");
        hashMap.put("specialist", "কিডনী, মুত্রথলী, প্রোস্টেট, পুরুষ যৌনাঙ্গ ও বন্ধাত্ব রোগ বিষেশজ্ঞ ও সার্জন  ");
        hashMap.put("station", " সহকারী অধ্যাপক -রংপুর মেডিকেল কলেজ হাসপাতাল-রংপুর ");
        hashMap.put("chamberTime", "চেম্বারঃ সেন্ট্রাল ডায়াগনস্টিক সেন্টার (সিডিসি), প্রতি শুক্রবার সকাল-১০ টা হতে বিকাল ৫ টা  ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন");
        hashMap.put("firstCall", " 01774336336 ");
        hashMap.put("secondCall", "01774336336 ");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ আকতার কামাল");
        hashMap.put("degree", " এমবিবিএস , সিসিডি (বারডেম),এমএমইডি ,পি এইচ ডি (নেফ্রোলোজি) ");
        hashMap.put("specialist", " মেডিসিন, কিডনি ও আইসিইউ বিশেষজ্ঞ");
        hashMap.put("station", " সিনিয়র কনসাল্টেন্ট , এম আব্দুর রহিম মেডিকেল কলেজ ও হাসপাতাল দিনাজপুর");
        hashMap.put("chamberTime", "চেম্বারঃ সেবা ডায়াগনস্টিক সেন্টার,প্রতি শুক্রবার সকাল ০৯ টা থেকে সন্ধা ০৭টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01713671227 ");
        hashMap.put("secondCall", " 01713671229 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ মোঃ রেজাউল করিম");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য,এফসিপিএস (সার্জারি) ");
        hashMap.put("specialist", " জেনারেল, ল্যাপরোস্কপিক, ব্রেস্ট কেন্সার ও কোলোরেক্টাল বিশেষজ্ঞ ও সার্জন ");
        hashMap.put("station", " সার্জারি বিভাগ, রংপুর মেডিকেল কলেজ ও হাসপাতাল, রংপুর");
        hashMap.put("chamberTime", "চেম্বারঃ সেবা ডায়াগনস্টিক সেন্টার,প্রতি শুক্রবার সকাল ১০টা থেকে সন্ধা ০৭টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01713671227 ");
        hashMap.put("secondCall", " 01713671229 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", " অধ্যাপক ডাঃ মোঃ রুহুল কুদ্দুছ");
        hashMap.put("degree", " এমবিবিএস, এফসিপিএস (সার্জারী),এম এস (ইউরোলোজি),এফআরসিএস (গ্লাসগো) ");
        hashMap.put("specialist", " জেনারেল, ল্যাপারোস্কপকি সার্জন ও ইউরোলজিস্ট");
        hashMap.put("station", "  অধ্যাপক ও অধ্যক্ষ সার্জারী- সাতক্ষীরা মেডিকেল কলেজ ও হাসপাতাল, সাতক্ষীরা");
        hashMap.put("chamberTime", "চেম্বারঃ মাম হাসপাতাল ও ডায়াগনস্টিক সেন্টার,প্রতি বৃহস্পতবিার রাত ০৮ টা থেকে ০৯ টা শুক্রবার বিকাল ১০ টা থেকে দুপুর ১২ টা");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01770721083 ");
        hashMap.put("secondCall", " 01750668980 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ শুভেন্দু কুমার দেবনাথ ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এফসিপিএস (সার্জারী-শেষ পর্ব) ");
        hashMap.put("specialist", " সার্জন");
        hashMap.put("station", "   ভারপ্রাপ্ত কনসালটেন্ট - ঠাকুরগা্ঁও বক্ষব্যাধি ক্লিনিক");
        hashMap.put("chamberTime", "চেম্বারঃ নিরাপদ ডায়াগনস্টিক সেন্টার,প্রতিদিন বিকাল ০৩ টা থেকে রাত ০৮ টা, ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01309262716 ");
        hashMap.put("secondCall", " 01785416642 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ মোঃ ময়নুল হক চেীধুরী  ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এফসিপিএস (ইউরোলোজি),সিপিএ (আমেরিকা)");
        hashMap.put("specialist", " জেনারেল এন্ডোস্কপিক ওল্যাপারোস্কোপিক সার্জন  ");
        hashMap.put("station", " সহকারী অধ্যাপক (ইউরোলজী বিভাগ) ন্যাশনাল ইনষ্টিটিউব অব কিডনিী ডিজিজেস এন্ড ইউরোলজী (নিকডু) ঢাকা  ");
        hashMap.put("chamberTime", "চেম্বারঃ ফেয়ার এক্সরে এন্ড প্যাথলজি,প্রতি শুক্রবার বিকাল ০৯ টা থেকে বিকাল ০৩ টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01773565648 ");
        hashMap.put("secondCall", " 017170907152 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ মোঃ নাজমুল হুদা (বাপ্পী)");
        hashMap.put("degree", " বিডিএস ঢাকা, পিজিটি পিজি হাসপাতাল -ঢাকা ");
        hashMap.put("specialist", " ওরাল এন্ড ডেন্টাল সার্জন  ");
        hashMap.put("station", " দেশ এক্স-রে ক্লিনিক এন্ড প্যাথলজি ");
        hashMap.put("chamberTime", "চেম্বারঃ দেশ এক্স-রে ক্লিনিক এন্ড প্যাথলজি , প্রতিদিন সকাল ১১ টা হতে রাত ০৯ টা  ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01722415651 ");
        hashMap.put("secondCall", "01722415651 ");
        arrayList.add(hashMap);


        MyAdapter myAdapter = new MyAdapter();
        listViewOthers.setAdapter(myAdapter);


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
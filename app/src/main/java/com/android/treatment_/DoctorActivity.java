package com.android.treatment_;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;



import java.util.ArrayList;
import java.util.HashMap;

import soup.neumorphism.NeumorphButton;
import soup.neumorphism.NeumorphTextView;

public class DoctorActivity extends AppCompatActivity {
    ListView listViewId;



    static ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;

    MyAdapter myAdapter = new MyAdapter(arrayList);
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);

        listViewId = findViewById(R.id.listViewID);
        searchView = findViewById(R.id.searchView);

        details();
        listViewId.setAdapter(myAdapter);
        // search view code
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                fileList(newText);
                return true;
            }
        });




    }
    private void details(){

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
        hashMap.put("name", "ডাঃ জিয়া হায়দার বসুনিয়া");
        hashMap.put("degree", " এমবিবিএস এফসিপিএস(মেডিসিন),এমডি (হেপাটোলজি)  ");
        hashMap.put("specialist", " লিভার ও লিভার ক্যান্সার, পরিপাকতন্ত্র, মেডিসিন বিশেষজ্ঞ ও এন্ডোসকপিস্ট   ");
        hashMap.put("station", " সহকারী অধ্যাপক লিভার বিভাগ রংপুর মেডিকেল কলেজ");
        hashMap.put("chamberTime", "চেম্বারঃ মাম হাসপাতাল এন্ড ডায়াগনস্টিক সেন্টার,প্রতি শুক্রবার সকাল ০৯টা থেকে রাত ০৮টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01788187707 ");
        hashMap.put("secondCall", " 01754547097 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ আবু হেনা মোঃ সোহেল রানা");
        hashMap.put("degree", " এমবিবিএস বিসিএস স্বাস্থ্য,এমডি (গ্যাস্ট্রোএন্টারোলজি) বিএসএমএমইউ  ");
        hashMap.put("specialist", " গ্যাস্ট্রোলিভার (পেটের অসুখ),জন্ডিস, মেডিসিন, কোলনস্কপি ও এন্ডোসকপি বিশেষজ্ঞ ");
        hashMap.put("station", " সহকারী অধ্যাপক গ্যাস্ট্রোএন্টারোলজি রংপুর মেডিকেল কলেজ রংপুর");
        hashMap.put("chamberTime", "চেম্বারঃ সেবা ডায়াগনস্টিক সেন্টার,প্রতি শুক্রবার সকাল ১০টা থেকে সন্ধা ০৭টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01713671227 ");
        hashMap.put("secondCall", " 01713671229 ");
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
        hashMap.put("name", "ডাঃ মোঃ নাজমুল করিম");
        hashMap.put("degree", " এমবিবিএস বিসিএস স্বাস্থ্য,এমডি (হেমাটোলোজি)  ");
        hashMap.put("specialist", " রক্তরোগ ও মেডিসিন বিশেষজ্ঞ ");
        hashMap.put("station", "  রংপুর মেডিকেল কলেজ ও হাসপাতাল রংপুর");
        hashMap.put("chamberTime", "চেম্বারঃ সেবা ডায়াগনস্টিক সেন্টার,প্রতি শুক্রবার সকাল ১০টা থেকে সন্ধা ০৭টা ");
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
        hashMap.put("name", "ডাঃ এম এন আজিজ (চপল) ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, ");
        hashMap.put("specialist", " মেডিসিন বিশেষজ্ঞ, ইন্টারনাল মেডিসিন");
        hashMap.put("station", "   ঠাকুরগা্ঁও জেনারেল হাসপাতাল");
        hashMap.put("chamberTime", "চেম্বারঃ নিরাপদ ডায়াগনস্টিক সেন্টার,বৃহস্পতিবার রাত ৮ টা-১০ টা, শুক্রবার বিকাল ০৪ টা থেকে রাত ১০টা, শনিবার সকাল ১০ টা থেকে বিকাল ৪টা পর্জন্ত");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01309262716 ");
        hashMap.put("secondCall", " 01785416642 ");
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
        hashMap.put("name", "ডাঃ শিহাব মাহমুদ শাহরিয়ার (সুজন) ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এফসিপিএস (সার্জারী) ");
        hashMap.put("specialist", " জেনারেল ও ল্যাপরোস্কপিক সার্জন");
        hashMap.put("station", "   কনসালটেন্ট - ঠাকুরগা্ঁও জেনারেল হাসপাতাল");
        hashMap.put("chamberTime", "চেম্বারঃ নিরাপদ ডায়াগনস্টিক সেন্টার,প্রতিদিন বিকাল ০৪ টা থেকে রাত ০৭টা, শুক্রবার বন্ধ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01309262716 ");
        hashMap.put("secondCall", " 01785416642 ");
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
        hashMap.put("name", "ডাঃ মোঃ আব্দুন নূর ওয়াহেদী খান");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এফসিপিএস (মেডিসিন),এফ পি, এমডি (নিউরোলোজী)  ");
        hashMap.put("specialist", " মেডিসিন, নিউরো-মেডিসিন,হৃদরোগ ও ডায়াবেটিক রোগে অভিজ্ঞ");
        hashMap.put("station", " ");
        hashMap.put("chamberTime", "চেম্বারঃ যমুনা ডায়াগনস্টিক সেন্টার,প্রতিদিন  সকাল ১০ টা থেকে রাত ০৮ টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01773980070");
        hashMap.put("secondCall", "01773980070 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ মোঃ আলিউল ইসলাম আশিক");
        hashMap.put("degree", " এমবিবিএস এফসিপিএস (মেডিসিন),এফ পি, এমডি (নিউরোলোজী)  ");
        hashMap.put("specialist", " মেডিসিন,হৃদরোগ ও ডায়াবেটিক রোগে বিশেষজ্ঞ ");
        hashMap.put("station", " মেডিকেল অফিসার - ঠাকুরগা্ঁও জেনারেল হাসপাতাল");
        hashMap.put("chamberTime", "চেম্বারঃ যমুনা ডায়াগনস্টিক সেন্টার,প্রতিদিন  সকাল ০৩ টা থেকে রাত ০৮ টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01773980070");
        hashMap.put("secondCall", "01773980070 ");
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
        hashMap.put("name", "ডাঃ মোঃ আব্দুল কুদ্দুস ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এমফিল ( বিএসএমএমইউ)  (সিসি ডার্মাটোলোজি)");
        hashMap.put("specialist", " চর্ম, যৌন, এলার্জী ও কুষ্ঠরোগ বিশেষজ্ঞ ");
        hashMap.put("station", "  সহকারী অধ্যাপক, এম আব্দুর রহিম মেডিকেল কলেজ ও হাসপাতাল, দিনাজপুর");
        hashMap.put("chamberTime", "চেম্বারঃ যমুনা ডায়াগনস্টিক সেন্টার,প্রতি শুক্রবার সকাল ১০টা থেকে সন্ধা ০৮টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01766241916 ");
        hashMap.put("secondCall", " 01773980070 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ আবিদা সুলতানা ");
        hashMap.put("degree", " এমবিবিএস, পিজিটি (গাইনি এন্ডস অবস) ");
        hashMap.put("specialist", " স্ত্রীরোগ ও প্রসুতি বিদ্যা বিশেষজ্ঞ ও সার্জন ও ডায়াবেটিক রোগে অভিজ্ঞ ");
        hashMap.put("station", "   সিসিডি (ডায়াবেটলজি),বারডেম,ঢাক");
        hashMap.put("chamberTime", "চেম্বারঃ যমুনা ডায়াগনস্টিক সেন্টার,প্রতিদিন সকাল ১০ টা থেকে রাত ০৮টা");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01773980070 ");
        hashMap.put("secondCall", " 01773980070 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ তামান্না লিসা ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এফসিপিএস(শিশু) ");
        hashMap.put("specialist", " শিশু, কিশোর ও নবজাতক রোগের চিকিৎসক ");
        hashMap.put("station", "   শহীদ সোহরাওয়ার্দী মেডিকেল কলেজ,ঢাক");
        hashMap.put("chamberTime", "চেম্বারঃ যমুনা ডায়াগনস্টিক সেন্টার,প্রতিদিন সকাল ০৩ টা থেকে রাত ০৮টা");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01773980070 ");
        hashMap.put("secondCall", " 01773980070 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ডাঃ আনজুমান আরা বেগম লাকী ");
        hashMap.put("degree", " এমবিবিএস, পিজিটি (গাইনি এন্ডস অবস) ");
        hashMap.put("specialist", " স্ত্রীরোগ ও প্রসুতি বিদ্যা রোগে অভিজ্ঞ এব সনোলোজিস্ট");
        hashMap.put("station", "   সিসিডি ,বারডেম,ঢাকা");
        hashMap.put("chamberTime", "চেম্বারঃ যমুনা ডায়াগনস্টিক সেন্টার,প্রতিদিন সকাল ১০ টা থেকে রাত ০৮টা");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01773980070 ");
        hashMap.put("secondCall", "01773980070  ");
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
        hashMap.put("name", "ডাঃ নরদেব রায়");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, ডি-অর্থো ( বিএসএমএমইউ)   ");
        hashMap.put("specialist", " হাড়-জোড়, বাত-ব্যথা অর্থোপেডিক্স বিশেষজ্ঞ ও সার্জন  ");
        hashMap.put("station", " কনসালটেন্ট রংপুর মেডিকেল কলেজ ও হাসপাতাল, রংপুর ");
        hashMap.put("chamberTime", "চেম্বারঃ হাসান এক্স-রে ক্লিনিক এন্ড প্যাথলজি, প্রতি শুক্রবার সকাল ১০ টা থেকে বিকাল ৫.০০ টা  ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01789672643");
        hashMap.put("secondCall", " 01722562498 ");
        arrayList.add(hashMap);

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
        hashMap.put("name", "  ডাঃ মোঃ নুরুজ্জামান জুয়েল  ");
        hashMap.put("degree", " এমবিবিএস,এমএস (শিশু সার্জারী),এমআইএস (কোরিয়া),এফএসিএস-সার্জারী (আমেরিকা)  ");
        hashMap.put("specialist", " জেনারেল, শিশু সার্জারী, কলোরেক্টাল সার্জারী, ক্যান্সার সার্জারী ও ল্যাপারোস্কপিক সার্জন");
        hashMap.put("station", " সহযোগী অধ্যাপক বিএসএমএমইউ (পিজি হাসপাতাল) ");
        hashMap.put("chamberTime", "চেম্বারঃ হাসান এক্স-রে ক্লিনিক এন্ড প্যাথলজি, প্রতি বৃহস্পতিবার ৪ টা থেকে রাত ০৯ টা, শুক্রবার সকাল ১০ টা থেকে বিকাল ০৫.০০ টা  ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01958439163");
        hashMap.put("secondCall", " 01773553536 ");
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
        hashMap.put("name", "  ডাঃ এ টি এম আসাদুল্লাহ");
        hashMap.put("degree", " এমবিবিএস, এম এস (নিউরোসার্জারী) ");
        hashMap.put("specialist", " মাথা ও ঘাড় ব্যাথা, কোমড়ের ব্যাথা,মেরুদন্ডে ব্যাথা,রগেড় ব্যাথা,হাত পা ঝিঝি করা,স্পাইনে টিউমার,মৃগী রোগ, ব্রেইন টিউমার,স্টোক ও প্যারালাইসিস রোগ বিশেষজ্ঞ ও সার্জন");
        hashMap.put("station", " সহজোগী অধ্যাপক,নিউরোসার্জারী বিভাগ ন্যাশনাল ইনস্টিটিউট অব নিউরোসায়েন্স ও  হাসপাতাল, শেরে বাংলা নগড়, ঢাকা");
        hashMap.put("chamberTime", "চেম্বারঃ মাম হাসপাতাল ও ডায়াগনস্টিক সেন্টার,প্রতি মাসের ২য় সপ্তাহ  শুক্রবার ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01746309999 ");
        hashMap.put("secondCall", " 01717371517 ");
        arrayList.add(hashMap);

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
        hashMap.put("name", "  ডাঃ মোঃ ফিরোজ জামান জুয়েল   ");
        hashMap.put("degree", " এমবিবিএস, বিসিএস স্বাস্থ্য, এম পি এইচ (কমিউনিটি মেডিসিন) সিসিডি (বারডেম)  ");
        hashMap.put("specialist", " কমিউনিটি মেডিসিন ও ডায়বেটিকস বিশেষজ্ঞ ");
        hashMap.put("station", " ঠাকুরগাঁও জেনারেল হাসপাতাল  ");
        hashMap.put("chamberTime", "চেম্বারঃ মাম হাসপাতাল ও ডায়াগনস্টিক সেন্টার,প্রতিদিন বিকাল ০৪ টা থেকে রাত ০৯ টা ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01746309999 ");
        hashMap.put("secondCall", " 01797861905 ");
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
        hashMap.put("name", "  ডাঃ  আশরাফী রহমান ");
        hashMap.put("degree", " এমবিবিএস, (ডি.ইউ) পিজিটি (গাইনি এন্ড অবস) সিএমইউ (আল্ট্রাসনোগ্রাম),সিসিডি (ডায়াবেটলজি),বারডেম হাসপাতাল,ঢাকা ");
        hashMap.put("specialist", " স্ত্রীরোগ ও প্রসুতি চিকিৎসক ও সার্জন  ");
        hashMap.put("station", " সিভিল সার্জন, ঠাকুরগা্ঁও  ");
        hashMap.put("chamberTime", "চেম্বারঃ নাহিন প্যাথলজি এন্ড ডিজিটাল এক্স-রে , ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01718545854 ");
        hashMap.put("secondCall", "02589931739 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "  ডাঃ  আশরাফী রহমান ");
        hashMap.put("degree", " এমবিবিএস, (ডি.ইউ) পিজিটি (গাইনি এন্ড অবস) সিএমইউ (আল্ট্রাসনোগ্রাম),সিসিডি (ডায়াবেটলজি),বারডেম হাসপাতাল,ঢাকা ");
        hashMap.put("specialist", " স্ত্রীরোগ ও প্রসুতি চিকিৎসক ও সার্জন  ");
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
        hashMap.put("name", " ডাঃ লাবনী বসাক ");
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
        hashMap.put("name", "  ডাঃ এ.এইচ.এম রসিদ-ই-মাহবুব ");
        hashMap.put("degree", " এমবিবিএস,বিসিএস স্বাস্থ্য , এফ.সি.পি .এস  ( নাক-কান - গলা ");
        hashMap.put("specialist", " নাক-কান-গলা রোগ বিশেষজ্ঞ ও হেড-নেক সার্জন  ");
        hashMap.put("station", " কনসালটেন্ট (নাক-কান-গলা) রংপুর মেডিকেল কলেজ ও হাসপাতাল-রংপুর ");
        hashMap.put("chamberTime", "চেম্বারঃ রেইনবো হাসপাতাল এন্ড ডায়াগনস্টিক সেন্টার, প্রতি শুক্রবার সকাল ১০ টা হতে রাত ০৬ টা,  ");
        hashMap.put("callText", " সিরিয়াল দিতে নাম্বারের উপর ক্লিক করুন ");
        hashMap.put("firstCall", " 01869061360 ");
        hashMap.put("secondCall", "01869061390 ");
        arrayList.add(hashMap);

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















    }

    class MyAdapter extends BaseAdapter {
        // searchView Code

        ArrayList<HashMap<String,String>>MyArrayList;

        public MyAdapter(ArrayList<HashMap<String, String>> myArrayList) {
            MyArrayList = myArrayList;
        }
        public void setFilteredList(ArrayList<HashMap<String,String>>filteredList){
            this.MyArrayList = filteredList;
            notifyDataSetChanged();
        }

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


            HashMap <String, String> hashMap = arrayList.get(position);


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
    //searchView code
    private void fileList(String newText){
        ArrayList<HashMap<String,String>>arrayList1=new ArrayList<>();
        for (HashMap<String,String>detailsItem:arrayList){
            if (detailsItem.get("name").toLowerCase().contains(newText.toLowerCase())){
                arrayList1.add(detailsItem);
            }
        }
        if (arrayList1.isEmpty()){
            Toast.makeText(this, "নাম খুজে পা্ওয়া যায় নাই", Toast.LENGTH_SHORT).show();
        }else {
            myAdapter.setFilteredList(arrayList1);
        }
    }

}
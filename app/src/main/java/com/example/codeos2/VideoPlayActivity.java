package com.example.codeos2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;

public class VideoPlayActivity extends YouTubeBaseActivity {

    //Button btnPlay;
    //TextView videoName;
    YouTubePlayerView youTubePlayerView;
    TextView note;
    YouTubePlayer.OnInitializedListener onInitializedListener;

    ArrayList<VideoLinksList> Java, Python, c, html, css, js;   //ArrayList for video links

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_play);

        note = findViewById(R.id.note);

        //btnPlay = findViewById(R.id.btnPlay);
        //videoName = findViewById(R.id.videoName);
        youTubePlayerView = findViewById(R.id.VideoPlayerView);


        //Java links
        Java = new ArrayList<>();

        VideoLinksList j1 = new VideoLinksList("yRpLlJmRo2w");
        VideoLinksList j2 = new VideoLinksList("LusTv0RlnSU");
        VideoLinksList j3 = new VideoLinksList("I5srDu75h_M");
        VideoLinksList j4 = new VideoLinksList("0r1SfRoLuzU");
        VideoLinksList j5 = new VideoLinksList("pFPZ83mgH00");
        VideoLinksList j6 = new VideoLinksList("qcSz4ef9UHA");
        VideoLinksList j7 = new VideoLinksList("pFPZ83mgH00");
        VideoLinksList j8 = new VideoLinksList("NTHVTY6w2Co");

        Java.add(j1);
        Java.add(j2);
        Java.add(j3);
        Java.add(j4);
        Java.add(j5);
        Java.add(j6);
        Java.add(j7);
        Java.add(j8);

        //Python Links

        Python = new ArrayList<>();
        VideoLinksList p1 = new VideoLinksList("vrQlEhmVFDA");
        VideoLinksList p2 = new VideoLinksList("uhUgIT68CoU");
        VideoLinksList p3 = new VideoLinksList("neTsPE9XFsQ");
        VideoLinksList p4 = new VideoLinksList("3VejIihDfwU");
        VideoLinksList p5 = new VideoLinksList("sSyCRQx5WM0");
        VideoLinksList p6 = new VideoLinksList("3VejIihDfwU");
        VideoLinksList p7 = new VideoLinksList("sSyCRQx5WM0");
        VideoLinksList p8 = new VideoLinksList("qvWuPZNOeGg");


        Python.add(p1);
        Python.add(p2);
        Python.add(p3);
        Python.add(p4);
        Python.add(p5);
        Python.add(p6);
        Python.add(p7);
        Python.add(p8);


        //c++ Links
        c = new ArrayList<>();
        VideoLinksList c1 = new VideoLinksList("z9bZufPHFLU");
        VideoLinksList c2 = new VideoLinksList("cnT1oW5_ePM");
        VideoLinksList c3 = new VideoLinksList("7dPdMtBX1d8");
        VideoLinksList c4 = new VideoLinksList("cyB3HNlQyjY");
        VideoLinksList c5 = new VideoLinksList("Stf7KBiA1vs");
        VideoLinksList c6 = new VideoLinksList("G80-j_xnE_");
        VideoLinksList c7 = new VideoLinksList("JBgZxnAj4hg");
        VideoLinksList c8 = new VideoLinksList("83KtncYgHYQ");

        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);
        c.add(c5);
        c.add(c6);
        c.add(c7);
        c.add(c8);

        //css links

//        ua24185-rcw
//        ArUL-He_AN0
//        oPPym7UaSIo
//        5Gz7j4gDrXM
//        EEw5OJCsiD
//        2zcHiaHo4Jo
//        5koxb4JaDqc
//        6G42rXal5-g
        css = new ArrayList<>();
        VideoLinksList cs1 = new VideoLinksList("ua24185-rcw");
        VideoLinksList cs2 = new VideoLinksList("ArUL-He_AN0");
        VideoLinksList cs3 = new VideoLinksList("oPPym7UaSIo");
        VideoLinksList cs4 = new VideoLinksList("5Gz7j4gDrXM");
        VideoLinksList cs5 = new VideoLinksList("EEw5OJCsiD");
        VideoLinksList cs6 = new VideoLinksList("2zcHiaHo4Jo");
        VideoLinksList cs7 = new VideoLinksList("5koxb4JaDqc");
        VideoLinksList cs8 = new VideoLinksList("6G42rXal5-g");

        css.add(cs1);
        css.add(cs2);
        css.add(cs3);
        css.add(cs4);
        css.add(cs5);
        css.add(cs6);
        css.add(cs7);
        css.add(cs8);

        //html links

//        uX9OsJQ7FJY
//        3D7CdN9EoEI
//        1cWMipIwokI
//        51VoZ5_0DSA
//                xJmydRDONc0
//        zyyH3oUxg7o
//                OIUIcEAHizI
//        XXj7-B3U08c

        html = new ArrayList<>();
        VideoLinksList ht1 = new VideoLinksList("uX9OsJQ7FJY");
        VideoLinksList ht2 = new VideoLinksList("3D7CdN9EoEI");
        VideoLinksList ht3 = new VideoLinksList("1cWMipIwokI");
        VideoLinksList ht4 = new VideoLinksList("51VoZ5_0DSA");
        VideoLinksList ht5 = new VideoLinksList("xJmydRDONc0");
        VideoLinksList ht6 = new VideoLinksList("zyyH3oUxg7o");
        VideoLinksList ht7 = new VideoLinksList("OIUIcEAHizI");
        VideoLinksList ht8 = new VideoLinksList("XXj7-B3U08c");

        html.add(ht1);
        html.add(ht2);
        html.add(ht3);
        html.add(ht4);
        html.add(ht5);
        html.add(ht6);
        html.add(ht7);
        html.add(ht8);

//        //js links
//        ZvbzSrg0afE
//                iLWTnMzWtj4
//        Fnlnw8uY6jo
//                gSDncyuGw0s
//        QCRpVw2KXf8
//                B7iF6G3EyIk
//        uH-tVP8MUs8
//        BNC6slYCj50
        js = new ArrayList<>();

        VideoLinksList js1 = new VideoLinksList("ZvbzSrg0afE");
        VideoLinksList js2 = new VideoLinksList("iLWTnMzWtj4");
        VideoLinksList js3 = new VideoLinksList("Fnlnw8uY6jo");
        VideoLinksList js4 = new VideoLinksList("gSDncyuGw0s");
        VideoLinksList js5 = new VideoLinksList("QCRpVw2KXf8");
        VideoLinksList js6 = new VideoLinksList("B7iF6G3EyIk");
        VideoLinksList js7 = new VideoLinksList("uH-tVP8MUs8");
        VideoLinksList js8 = new VideoLinksList("BNC6slYCj50");

        js.add(js1);
        js.add(js2);
        js.add(js3);
        js.add(js4);
        js.add(js5);
        js.add(js6);
        js.add(js7);
        js.add(js8);

        Intent b = getIntent();
        int subPos = b.getIntExtra("posSub", 0); // subjcet chi position milali intent madhun
        int topicPosition = b.getIntExtra("topicPosition", 0); // topic chi position milali intent madhun


        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                String link;

                switch(subPos){
                    case 0 : link = Java.get(topicPosition).getLink();
                        break;
                    case 1 : link = Python.get(topicPosition).getLink();
                        break;
                    case 2 : link = c.get(topicPosition).getLink();
                        break;
                    case 3 : link = html.get(topicPosition).getLink();
                        break;
                    case 4 : link = css.get(topicPosition).getLink();
                        break;
                    case 5 : link = js.get(topicPosition).getLink();
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + subPos);
                }

                youTubePlayer.loadVideo(link);
                //youTubePlayer.loadVideo("u-HgzgYe8KA");
                //youTubePlayerView.initialize("AIzaSyDzPT1mEgwaCJ1Jeh5G2ty9W9GA1A7lF8Q", onInitializedListener);
                //youTubePlayer.setFullscreen(true);
                youTubePlayer.play();

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };


        youTubePlayerView.initialize("AIzaSyCTJr8CQjhNKZ_VPrSbDAcEclb7RjA0n4M", onInitializedListener);


//        youTubePlayerView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                youTubePlayerView.initialize("AIzaSyDzPT1mEgwaCJ1Jeh5G2ty9W9GA1A7lF8Q", onInitializedListener);
//            }
//        });

//        btnPlay.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                youTubePlayerView.initialize("AIzaSyDzPT1mEgwaCJ1Jeh5G2ty9W9GA1A7lF8Q", onInitializedListener);
//
//            }
//        });
    }
}
package sdu.cs.eakkapod.trafficapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AboutApp extends AppCompatActivity {

    //Explicit
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);
    }

    public void clickBack(View view) {finish();
    } //clickback end

    public void playSound(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.open);
        mediaPlayer.start();
    } //playSound end

    public void clickFB(View view) {
        Intent fbIntent = new Intent(Intent.ACTION_VIEW);
        fbIntent.setData(Uri.parse("https://www.facebook.com/Nadzproject"));
        startActivity(fbIntent);
    } //clickFB


    public void clickMobile(View view) {
        Intent mobileIntent = new Intent(Intent.ACTION_DIAL);
        mobileIntent.setData(Uri.parse("tel:0615712454"));
        startActivity(mobileIntent);
    } //clickMobile

    public void clickMap(View view) {
        Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:13.776327, 100.510671(มหาวิทยาลัยสวนดุสิต)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        //mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    } //clickMap
} // class

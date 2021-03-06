package sdu.cs.eakkapod.trafficapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //ผูกตัวแปร java / xml
        TextView titleTextView = findViewById(R.id.txtTitle);
        TextView detailTextView = findViewById(R.id.txtDetail);
        ImageView logoImageView = findViewById(R.id.imvLogo);

        //รับค่าจาก Intent มาแสดงลง xml
        titleTextView.setText(getIntent().getStringExtra("Title"));
        detailTextView.setText(getIntent().getStringExtra("Detail"));
        logoImageView.setImageResource(getIntent().getIntExtra("Logo", R.drawable.traffic_01));


    } // end onCreate method

    public void clickBack(View view) {
        finish();
    } // end clickBack method

} // end Class

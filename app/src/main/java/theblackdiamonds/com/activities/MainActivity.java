package theblackdiamonds.com.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import theblackdiamonds.com.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startGame(View v) {
        Log.i("ImageButton", "clicked");
        Intent intent = new Intent(this, StartGameActivity.class);
        startActivity(intent);
        finish();
    }
}
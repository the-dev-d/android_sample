package in.dhaivathlal.testapplicationjava;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AudioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audio);

        Button play = findViewById(R.id.button);
        play.setOnClickListener(view -> {
            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.audio);
            mediaPlayer.start();
        });
    }
}

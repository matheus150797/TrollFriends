package rightside.tevinaredentor.trollfriends;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play(View view) {
        if (mediaPlayer == null ) {
            mediaPlayer = MediaPlayer.create(this,R.raw.gemidao);
        }
        mediaPlayer.start();

    }

}

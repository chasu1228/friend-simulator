package kr.hs.emirim.progh2.friendsimulator.u_jin;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String TAG = "장유진 : MainActivity";
    private ImageView mImageViewfriendVisual;
    private MediaPlayer mMeidaPlayer;
    private Vibrator mVib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreats 메소드 호출~");
        setContentView(R.layout.activity_main);
        mImageViewfriendVisual = (ImageView) findViewById(R.id.friend_visual);
        Log.d(TAG, "activity_main 레이아웃 세팅~");
        mMeidaPlayer = MediaPlayer.create(this, R.raw.tt);
        mMeidaPlayer.setLooping(false);
        mMeidaPlayer.start();
        mVib = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        mVib.vibrate(2000);

    }

    protected void onDestroy() {
        super.onDestroy();
        mMeidaPlayer.pause();
        mMeidaPlayer.stop();
    }


    void onClick(View view) {
        Log.d(TAG, "onCreats 메소드 호출~");
        Log.d(TAG, "클릭된 뷰 id : " + view.getId());
        mVib.vibrate(1000);
        if (mMeidaPlayer.isPlaying()) {
            mMeidaPlayer.pause();
        }
        switch (view.getId()) {
            case R.id.button1:
                Log.d(TAG, "버튼1 클릭");
                mImageViewfriendVisual.setImageResource(R.drawable.yu02);
                Toast.makeText(this, "뚜뚜들아~", Toast.LENGTH_SHORT).show();
                mMeidaPlayer = MediaPlayer.create(this, R.raw.dduddu);
                mMeidaPlayer.start();
                break;
            case R.id.button2:
                Log.d(TAG, "버튼2 클릭");
                mImageViewfriendVisual.setImageResource(R.drawable.yu04);
                Toast.makeText(this, "마자미야~", Toast.LENGTH_SHORT).show();
                mMeidaPlayer = MediaPlayer.create(this, R.raw.mazami);
                mMeidaPlayer.start();
                break;
            case R.id.button3:
                Log.d(TAG, "버튼3 클릭");
                mImageViewfriendVisual.setImageResource(R.drawable.yu01);
                Toast.makeText(this, "티티", Toast.LENGTH_SHORT).show();
                mMeidaPlayer = MediaPlayer.create(this, R.raw.tt);
                mMeidaPlayer.start();
                break;
            case R.id.button4:
                Log.d(TAG, "버튼4 클릭");
                mImageViewfriendVisual.setImageResource(R.drawable.yu05);
                Toast.makeText(this, "난 모르겠는걸..", Toast.LENGTH_SHORT).show();
                mMeidaPlayer = MediaPlayer.create(this, R.raw.know);
                mMeidaPlayer.start();
                break;
            case R.id.button5:
                Log.d(TAG, "버튼5 클릭");
                mImageViewfriendVisual.setImageResource(R.drawable.yu03);
                Toast.makeText(this, "왜여~", Toast.LENGTH_SHORT).show();
                mMeidaPlayer = MediaPlayer.create(this, R.raw.why);
                mMeidaPlayer.start();
                break;
            default:
                Log.d(TAG, "모르는 녀석 클릭");
                mImageViewfriendVisual.setImageResource(R.drawable.yu05);
                Toast.makeText(this, "뭐라는지 모르겠다", Toast.LENGTH_SHORT).show();
                mMeidaPlayer = MediaPlayer.create(this, R.raw.know);
                mMeidaPlayer.start();
                break;
        }

    }
}

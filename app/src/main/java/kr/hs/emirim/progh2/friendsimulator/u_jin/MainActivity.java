package kr.hs.emirim.progh2.friendsimulator.u_jin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String TAG="장유진 : MainActivity";
    private ImageView mImageViewfriendVisual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreats 메소드 호출~");
        setContentView(R.layout.activity_main);
        mImageViewfriendVisual = (ImageView) findViewById(R.id.friend_visual);
        Log.d(TAG,"activity_main 레이아웃 세팅~");

    }

    void onClick( View view) {
        Log.d(TAG,"onCreats 메소드 호출~");
        Log.d(TAG,"클릭된 뷰 id : "+view.getId());
        switch (view.getId()){
            case R.id.button1:
                Log.d(TAG,"버튼1 클릭");
                Toast.makeText(this, "뚜뚜들아~", Toast.LENGTH_SHORT).show(); break;
            case R.id.button2:
                Log.d(TAG,"버튼2 클릭");
                Toast.makeText(this, "마자미야~", Toast.LENGTH_SHORT).show(); break;
            case R.id.button3:
                Log.d(TAG,"버튼3 클릭");
                Toast.makeText(this, "티티", Toast.LENGTH_SHORT).show(); break;
            case R.id.button4:
                Log.d(TAG,"버튼4 클릭");
                Toast.makeText(this, "난 모르겠는걸..", Toast.LENGTH_SHORT).show(); break;
            case R.id.button5:
                Log.d(TAG,"버튼5 클릭");
                Toast.makeText(this, "왜여~", Toast.LENGTH_SHORT).show(); break;
        }

        }
    }

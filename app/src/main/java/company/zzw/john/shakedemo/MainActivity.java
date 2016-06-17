package company.zzw.john.shakedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn;
    private Random mRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);

        ShakeListener shakeListener = new ShakeListener(this);
        shakeListener.setOnShakeListener(new ShakeListener.OnShakeListener() {
            @Override
            public void onShake() {
                mRandom = new Random();
                int shuzi = mRandom.nextInt(100);
                btn.setText(shuzi + "");
            }
        });

    }
}

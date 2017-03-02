package androidaplications.pablolaiz.createimagecode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout mainLayout;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = (RelativeLayout) findViewById(R.id.activity_main);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        params.leftMargin = 550;
        params.topMargin = 660;

        ImageView myImage = new ImageView(this);
        myImage.setImageResource(R.mipmap.ic_launcher);
        mainLayout.addView(myImage, params);
    }
}

/*
        LinearLayout picLL = new LinearLayout(this);
        picLL.layout(0, 0, 100, 100);
        picLL.setLayoutParams(new LayoutParams(100, 100));
        picLL.setOrientation(LinearLayout.HORIZONTAL);
        ImageView myImage = new ImageView(this);
        myImage.setImageResource(R.drawable.ic_launcher);
        picLL.addView(myImage);
        setContentView(picLL);


 */
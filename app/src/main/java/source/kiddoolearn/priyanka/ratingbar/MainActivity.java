package source.kiddoolearn.priyanka.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RatingBar r1,r2;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1=(RatingBar)findViewById(R.id.ratingBar);
        r2=(RatingBar)findViewById(R.id.ratingBar2);
        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
        r1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if(rating<=2.0)
                    t1.setText("poor");
                if(rating<=3.0&&rating>=2.0)
                    t1.setText("good");
                if(rating<=4.0&&rating>=3.0)
                    t1.setText("excellent");
                if(rating<=5.0&&rating>=4.0)
                    t1.setText("Amazing");
            }
        });
    }
}

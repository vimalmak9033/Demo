package firstandroiddemo.com.firstanimation;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.transition.TransitionManager;

public class MainActivity extends AppCompatActivity {

    ViewGroup mayurLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         mayurLayout = (ViewGroup) findViewById(R.id.MayurLayout);
        mayurLayout.setOnTouchListener(new RelativeLayout.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                moveButton();
                return true;
            }
        });
    }
    @TargetApi(Build.VERSION_CODES.KITKAT)
    public void moveButton() {

for(int i = 0 ; i<5 ; i++) {


    if(i % 2 == 0 ) {
        View mayurbutton = findViewById(R.id.btmayur);
        TransitionManager.beginDelayedTransition(mayurLayout);

        RelativeLayout.LayoutParams positionrulse = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        positionrulse.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        positionrulse.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
        //   positionrulse.addRule(RelativeLayout.PERSISTENT_SCROLLING_CACHE,RelativeLayout.TRUE);
        mayurbutton.setLayoutParams(positionrulse);


        ViewGroup.LayoutParams sizerulse = mayurbutton.getLayoutParams();
        sizerulse.width = 250;
        sizerulse.height = 100;

        mayurbutton.setLayoutParams(sizerulse);
        dotop();
    }
    else {
        View mayurbutton = findViewById(R.id.btmayur);
        TransitionManager.beginDelayedTransition(mayurLayout);

        RelativeLayout.LayoutParams positionrulse = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        positionrulse.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        positionrulse.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
        //   positionrulse.addRule(RelativeLayout.PERSISTENT_SCROLLING_CACHE,RelativeLayout.TRUE);
        mayurbutton.setLayoutParams(positionrulse);


        ViewGroup.LayoutParams sizerulse = mayurbutton.getLayoutParams();
        sizerulse.width = 250;
        sizerulse.height = 100;

        mayurbutton.setLayoutParams(sizerulse);
        dotop();
    }
    }
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public void onclick(View view)
    {

        View mayurbutton = findViewById(R.id.btmayur);
        TransitionManager.beginDelayedTransition(mayurLayout);

        RelativeLayout.LayoutParams positionrulse = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        positionrulse.addRule(RelativeLayout.ALIGN_PARENT_TOP , RelativeLayout.TRUE);
        positionrulse.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
        //   positionrulse.addRule(RelativeLayout.PERSISTENT_SCROLLING_CACHE,RelativeLayout.TRUE);
        mayurbutton.setLayoutParams(positionrulse);


        ViewGroup.LayoutParams sizerulse = mayurbutton.getLayoutParams();
        sizerulse.width = 250;
        sizerulse.height = 100;

        mayurbutton.setLayoutParams(sizerulse);
        
       moveright();

    }




    @TargetApi(Build.VERSION_CODES.KITKAT)
    public void dotop()
    {
        View virasbutton = findViewById(R.id.btviras);
        TransitionManager.beginDelayedTransition(mayurLayout);

        RelativeLayout.LayoutParams positionrulse = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        positionrulse.addRule(RelativeLayout.ALIGN_PARENT_TOP , RelativeLayout.TRUE);
        positionrulse.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
        //   positionrulse.addRule(RelativeLayout.PERSISTENT_SCROLLING_CACHE,RelativeLayout.TRUE);
        virasbutton.setLayoutParams(positionrulse);


        ViewGroup.LayoutParams sizerulse = virasbutton.getLayoutParams();
        sizerulse.width = 250;
        sizerulse.height = 100;

        virasbutton.setLayoutParams(sizerulse);
        
    }
    @TargetApi(Build.VERSION_CODES.KITKAT)
    public void moveright() {

        View virasbutton = findViewById(R.id.btviras);
        TransitionManager.beginDelayedTransition(mayurLayout);

        RelativeLayout.LayoutParams positionrulse = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        positionrulse.addRule(RelativeLayout.ALIGN_PARENT_TOP , RelativeLayout.TRUE);
        positionrulse.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
        //   positionrulse.addRule(RelativeLayout.PERSISTENT_SCROLLING_CACHE,RelativeLayout.TRUE);
        virasbutton.setLayoutParams(positionrulse);


        ViewGroup.LayoutParams sizerulse = virasbutton.getLayoutParams();
        sizerulse.width = 100;
        sizerulse.height = 100;
        virasbutton.setLayoutParams(sizerulse);



      }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public void abc(View view)
    {

        View virasbutton = findViewById(R.id.btviras);
        TransitionManager.beginDelayedTransition(mayurLayout);

        RelativeLayout.LayoutParams positionrulse = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        positionrulse.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM , RelativeLayout.TRUE);
        positionrulse.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
        //   positionrulse.addRule(RelativeLayout.PERSISTENT_SCROLLING_CACHE,RelativeLayout.TRUE);
        virasbutton.setLayoutParams(positionrulse);


        ViewGroup.LayoutParams sizerulse = virasbutton.getLayoutParams();
        sizerulse.width = 150;
        sizerulse.height = 80;
        virasbutton.setLayoutParams(sizerulse);



    }


}
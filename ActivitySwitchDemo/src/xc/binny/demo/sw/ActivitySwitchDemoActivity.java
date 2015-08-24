package xc.binny.demo.sw;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivitySwitchDemoActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button leftRightSw_Btn = (Button)findViewById(R.id.button1);
        Button upDownSw_Btn = (Button)findViewById(R.id.button2);
        Button dyncLeftRightSw_Btn = (Button)findViewById(R.id.button3);
        Button dyncLeftRightSwG_Btn = (Button)findViewById(R.id.button4);
        leftRightSw_Btn.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(ActivitySwitchDemoActivity.this, SecondActivity.class);
				startActivity(intent);
				//�����л����������ұ߽��룬����˳�
				overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
			}
		});
        
        upDownSw_Btn.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(ActivitySwitchDemoActivity.this, SecondActivity.class);
				startActivity(intent);
				//�����л����������½��룬���˳�
				overridePendingTransition(R.anim.in_from_down, R.anim.out_to_up);
			}
		});
        
        dyncLeftRightSw_Btn.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(ActivitySwitchDemoActivity.this, SecondActivity.class);
				startActivity(intent);
				//�����л����������ұ߽��룬����˳�,����̬Ч��
				overridePendingTransition(R.anim.dync_in_from_right, R.anim.dync_out_to_left);
			}
		});
        
        dyncLeftRightSwG_Btn.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(ActivitySwitchDemoActivity.this, SecondActivity.class);
				startActivity(intent);
				//�����л����������ұ߽��룬����˳�,����̬Ч��
				overridePendingTransition(R.anim.new_dync_in_from_right, R.anim.new_dync_out_to_left);
			}
		});
    }
}
package com.yangjiujie.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PhoneActivity extends Activity {

	// 电话号码输入框
	private EditText mobilText;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mobilText = (EditText)this.findViewById(R.id.mobile);
        Button button= (Button)this.findViewById(R.id.button);
        // 点击button的事件
        button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				// 获取电话号码
				String mobile = mobilText.getText().toString();
				// 参数1：动作。在这指打电话
				// 参数2：提供给应用的数据。在这指电话号	
				Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + mobile));
				// 将意图传给操作系统
				// startActivity方法专门将意图传给操作系统
				PhoneActivity.this.startActivity(intent);
			}
		});
        
    }
}
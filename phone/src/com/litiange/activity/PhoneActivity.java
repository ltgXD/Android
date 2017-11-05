package com.yangjiujie.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PhoneActivity extends Activity {

	// �绰���������
	private EditText mobilText;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mobilText = (EditText)this.findViewById(R.id.mobile);
        Button button= (Button)this.findViewById(R.id.button);
        // ���button���¼�
        button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				// ��ȡ�绰����
				String mobile = mobilText.getText().toString();
				// ����1������������ָ��绰
				// ����2���ṩ��Ӧ�õ����ݡ�����ָ�绰��	
				Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + mobile));
				// ����ͼ��������ϵͳ
				// startActivity����ר�Ž���ͼ��������ϵͳ
				PhoneActivity.this.startActivity(intent);
			}
		});
        
    }
}
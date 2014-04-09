package com.example.callphone;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class CallPhoneActivity extends Activity {
	private Button[] butArr;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final EditText telText = (EditText) findViewById(R.id.tel);
		butArr = new Button[12];
		
		info();

		Button button = (Button) findViewById(R.id.call);

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent(Intent.ACTION_DIAL, Uri
						.parse(telText.getText().toString()));

				startActivity(intent);
			}
		});

		setButton(telText);
	}

	private void info() {

		butArr[0] = (Button) findViewById(R.id.one);
		butArr[1] = (Button) findViewById(R.id.two);
		butArr[2] = (Button) findViewById(R.id.thr);
		butArr[3] = (Button) findViewById(R.id.fo);
		butArr[4] = (Button) findViewById(R.id.fiv);
		butArr[5] = (Button) findViewById(R.id.six);
		butArr[6] = (Button) findViewById(R.id.sev);
		butArr[7] = (Button) findViewById(R.id.eig);
		butArr[8] = (Button) findViewById(R.id.nin);
		butArr[9] = (Button) findViewById(R.id.sha);
		butArr[10] = (Button) findViewById(R.id.zer);
		butArr[11] = (Button) findViewById(R.id.star);
	}

	private void setButton(final EditText text) {
		butArr[0].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				text.append("1");
			}
		});
		butArr[1].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				text.append("2");
			}
		});
		butArr[2].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				text.append("3");
			}
		});
		butArr[3].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				text.append("4");
			}
		});
		butArr[4].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				text.append("5");
			}
		});
		butArr[5].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				text.append("5");
			}
		});
		butArr[6].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				text.append("7");
			}
		});
		butArr[7].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				text.append("8");
			}
		});
		butArr[8].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				text.append("9");
			}
		});
		butArr[9].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				text.append("#");
			}
		});
		butArr[10].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				text.append("0");
			}
		});
		butArr[11].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				text.append("*");
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

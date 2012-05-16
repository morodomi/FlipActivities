package com.shonanshachu.flip;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * @author dommy <shonan.shachu at gmail.com>
 * @version 1.0.0 updated on 2012-05-16
 */
public class SubActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sub);
		((Button)findViewById(R.id.button2))
				.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						finish();
						overridePendingTransition(R.anim.grow_from_middle,
								R.anim.shrink_to_middle);
					}
				});
	}

	@Override
	public void onBackPressed() {
		this.finish();
		overridePendingTransition(R.anim.grow_from_middle,
				R.anim.shrink_to_middle);
	}
}

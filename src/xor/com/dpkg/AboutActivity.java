package xor.com.dpkg;

import android.os.Bundle;
import android.widget.TextView;


public class AboutActivity extends DashboardAppActivity
{
	public void onCreate(Bundle savedInstanceState) 
	{
	    super.onCreate(savedInstanceState);

	    setContentView (R.layout.about);
	    TextView tv = (TextView) findViewById (R.id.title_text);
	    if (tv != null) 
	    {
	    	tv.setText(getTitle());
	    }
	}
}

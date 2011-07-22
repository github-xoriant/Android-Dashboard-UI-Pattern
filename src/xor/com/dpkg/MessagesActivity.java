package xor.com.dpkg;

import android.os.Bundle;
import android.widget.TextView;

public class MessagesActivity extends DashboardAppActivity
{

	public void onCreate(Bundle savedInstanceState) 
	{
	    super.onCreate(savedInstanceState);

	    setContentView (R.layout.message);
	    TextView tv = (TextView) findViewById (R.id.title_text);
	    if (tv != null) 
	    {
	    	tv.setText(getTitle());
	    }
	}


}


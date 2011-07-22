package xor.com.dpkg;

import android.os.Bundle;
import android.widget.TextView;

public class PhotoAlbumActivity extends DashboardAppActivity
{
	public void onCreate(Bundle savedInstanceState) 
	{
	    super.onCreate(savedInstanceState);

	    setContentView (R.layout.photoalbum);
	    TextView tv = (TextView) findViewById (R.id.title_text);
	    if (tv != null) 
	    {
	    	tv.setText(getTitle());
	    }
	}



}

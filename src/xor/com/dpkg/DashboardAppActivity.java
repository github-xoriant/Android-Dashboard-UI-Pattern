package xor.com.dpkg;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public abstract class DashboardAppActivity extends Activity 
{
    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
    }
    
    //Lifecycle Methods
    
    protected void onDestroy()
    {
    	super.onDestroy();
    }
    
    protected void onStop()
    {
    	super.onStop();
    }
    
    protected void onStart()
    {
    	super.onStart();
    }
    
    protected void onPause()
    {
    	super.onPause();
    }
    
    protected void onResume()
    {
    	super.onResume();
    }
    
    //App Click Methods
    
    public void onSearch(View v)
    {
    	startActivity (new Intent(getApplicationContext(), SearchActivity.class));
    }
    
    public void onAbout(View v)
    {
    	startActivity (new Intent(getApplicationContext(), AboutActivity.class));
    }
    
    public void return2Home(Context context)
    {
        final Intent intent = new Intent(context, HomeActivity.class);
        intent.setFlags (Intent.FLAG_ACTIVITY_CLEAR_TOP);
        context.startActivity (intent);
    }
    
    public void onPhotoAlbum(View v)
    {
    	startActivity (new Intent(getApplicationContext(), PhotoAlbumActivity.class));
    }
    
    public void onMessage(View v)
    {
    	startActivity (new Intent(getApplicationContext(), MessagesActivity.class));
    }

    public void onHome (View v)
    {
    	return2Home(this);
    }

}

/***************************************
 * 
 * Android Bluetooth Dual Joystick
 * yus - projectproto.blogspot.com
 * October 2012
 *  
 ***************************************/

package org.projectproto.btjoystick;

import android.preference.PreferenceActivity;
import android.os.Bundle;

public class OptionsActivity extends PreferenceActivity {

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.layout.preferences);
	}
	
}

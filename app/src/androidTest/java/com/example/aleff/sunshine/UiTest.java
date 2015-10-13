package com.example.aleff.sunshine;

import android.content.Context;
import android.support.test.filters.SdkSuppress;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiDevice;

import org.junit.runner.RunWith;

/**
 * Created by Aleff on 28/09/2015.
 */
@RunWith(AndroidJUnit4.class)
@SdkSuppress(minSdkVersion = 18)
public class UiTest {

    private Context mContext;
    private UiDevice mUIDevice;

    public void TestUiTotal() throws Exception{

        // mUIDevice.findObject(
        //  new UiSelector().className("android.widget.LinearLayout")).clickAndWaitForNewWindow(LAUNCH_TIMEOUT);
        mUIDevice.pressMenu();

    }


}

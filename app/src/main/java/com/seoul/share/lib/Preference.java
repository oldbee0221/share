package com.seoul.share.lib;

import android.content.Context;
import android.content.SharedPreferences;

public class Preference
{

/*    MODE_PRIVATE
    MODE_WORLD_READABLE
    MODE_WORLD_WRITEABLE */

    private Context mContext;
    private String mPrefName = "";
    private SharedPreferences mSharedPref;
    private static Preference mInatance = null;
    private static String PREF_NAME = "USER_PREFERENCE";

    public Preference(Context context, String name)
    {
        mContext       = context;
        mPrefName      = name;
        mSharedPref    = context.getSharedPreferences(name, Context.MODE_PRIVATE);
    }

    public Preference(Context context)
    {
        mContext       = context;
        mPrefName      = PREF_NAME;
        mSharedPref    = context.getSharedPreferences(mPrefName, Context.MODE_PRIVATE);
    }

    public static Preference get(Context context, String name)
    {
        synchronized (Preference.class )
        {
            if( mInatance == null )
                mInatance = new Preference(context, name);
        }

        return mInatance;
    }

    public static Preference get(Context context)
    {
        synchronized (Preference.class )
        {
            if( mInatance == null )
                mInatance = new Preference(context);
        }

        return mInatance;
    }

    public int getPreference(String key, int nDefault)
    {
        return mSharedPref.getInt(key, nDefault);
    }

    public boolean setPreference(String key, int nValue)
    {
        SharedPreferences.Editor edit = mSharedPref.edit();
        edit.putInt(key, nValue);
        return edit.commit();
    }

    public String getPreference(String key, String defValue)
    {
        return mSharedPref.getString(key, defValue);
    }

    public boolean setPreference(String key, String strValue)
    {
        SharedPreferences.Editor edit = mSharedPref.edit();
        edit.putString(key, strValue);
        return edit.commit();
    }

    public boolean getPreference(String key, boolean bDefault)
    {
        return mSharedPref.getBoolean(key, bDefault);
    }

    public boolean setPreference(String key, boolean bValue)
    {
        SharedPreferences.Editor edit = mSharedPref.edit();
        edit.putBoolean(key, bValue);
        return edit.commit();
    }

}

package sunil.project3.CardObjects;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.provider.CalendarContract;
import android.util.Log;
import android.widget.Toast;

import java.util.Calendar;

/**
 * Created by owlslubic on 8/15/16.
 */
public class CalendarEventObject extends CardObject{
    String mEventTitle, mEventDate, mDetailUrl, mWeekDay;
    int mYear, mMonth, mDay, mHour, mMinute;

    public String getmEventTitle() {
        return mEventTitle;
    }

    public String getmEventDate() {

        if (mHour == 0 && mMinute == 0) {
            return mWeekDay + ", " + mMonth + "/" + mDay + "/" + mYear;
        }
        return mWeekDay + ", " + mMonth + "/" + mDay + "/" + mYear + " at " + mHour + ":" + mMinute;
    }

    public String getmDetailUrl() {
        return mDetailUrl;
    }


    public int getmYear() {
        return mYear;
    }

    public int getmMonth() {
        return mMonth;
    }

    public int getmDay() {
        return mDay;
    }

    public int getmHour() {
        return mHour;
    }

    public int getmMinute() {
        return mMinute;
    }

    public String getmWeekDay() {
        return mWeekDay;
    }


    public CalendarEventObject(String eventTitle, String weekDay, int year, int month, int day, int hour, int minute, String detailUrl) {
        mEventTitle = eventTitle;
        mWeekDay = weekDay;
        mYear = year;
        mMonth = month;
        mDay = day;
        mHour = hour;
        mMinute = minute;
        mDetailUrl = detailUrl;

    }


}

package com.lss.criminalintent.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.lss.criminalintent.Crime;

import java.util.Date;
import java.util.UUID;

/**
 * Created by shuai on 16-6-16.
 */
public class CrimeCursorWrapper extends CursorWrapper {

    public CrimeCursorWrapper(Cursor cursor) {
        super(cursor);
    }
    public Crime getCrime(){
        String uuidString = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.UUID));
        String title=getString(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.TITLE));
        long date=getLong(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.DATE));
        int isSolved=getInt(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.SOLVED));
        String suspect = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.SUSPECT));
        Crime crime = new Crime(UUID.fromString(uuidString));
        crime.setTitle(title);
        crime.setData(new Date(date));
        crime.setSolved(isSolved!=0);
        crime.setSuspect(suspect);
        return crime;
    }
}

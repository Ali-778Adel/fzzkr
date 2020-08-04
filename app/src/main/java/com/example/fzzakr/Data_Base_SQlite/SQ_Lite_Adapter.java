package com.example.fzzakr.Data_Base_SQlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQ_Lite_Adapter {
SQ_Helper sq_helper;
    public SQ_Lite_Adapter(Context context){
        sq_helper=new SQ_Helper(context);
    }
public long addentry (SQ_litedata_storage sq_litedata_storage){
    SQLiteDatabase db=sq_helper.getWritableDatabase();
    ContentValues contentValues=new ContentValues();
    contentValues.put(SQ_Helper.phoneColoumns,sq_litedata_storage.getPhoneNumber());
    contentValues.put(SQ_Helper.messageColoumns,sq_litedata_storage.getUserMessage());
  long x=  db.insert(SQ_Helper.tabelphoneandMessage,null,contentValues);
return x;
    }
    public SQ_litedata_storage getentry(){
        SQ_litedata_storage sq_litedata_storage=null;
        Cursor c;
        SQLiteDatabase db=sq_helper.getReadableDatabase();
        String[]coloumns={SQ_Helper.phoneColoumns,SQ_Helper.messageColoumns};
        c=db.query(SQ_Helper.tabelphoneandMessage,coloumns,null,null,null,null,null);
while (c.moveToNext()){
    sq_litedata_storage=new SQ_litedata_storage(c.getString(0),c.getString(1));
}
return sq_litedata_storage;
    }
    static  class SQ_Helper extends SQLiteOpenHelper{
        private static final int dataBaseVersion=1;
        private static final String dataBaseName="myFirstdataBase";
        private static final String phoneColoumns="phoneColoumns";
        private static final String messageColoumns="messageColoumns";
        private static final String tabelphoneandMessage="phonemessage";
        private static final String  coloumnsUid="id";
        private static final String createPhoneandMessageTabel="CREATE TABLE "+ tabelphoneandMessage +" ("+ coloumnsUid +
                "INTEGER PRIMARY KEY AUTOINCREMENT, "+ phoneColoumns + "TEXT," +messageColoumns +"TEXT);";
        public SQ_Helper( Context context) {
            super(context, dataBaseName, null, dataBaseVersion);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
db.execSQL(createPhoneandMessageTabel);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    }

}

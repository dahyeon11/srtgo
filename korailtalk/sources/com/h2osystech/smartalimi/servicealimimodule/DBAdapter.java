package com.h2osystech.smartalimi.servicealimimodule;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.h2osystech.smartalimi.aidllib.MSGVo;
import com.h2osystech.smartalimi.common.Const;
import com.h2osystech.smartalimi.common.LogFile;
import com.kakao.sdk.template.Constants;
import g5.e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class DBAdapter {
    private static final int DATABASE_VERSION = 2;
    private static String LOGINID = null;
    private static final String Table_NAME = "push.db";
    private String TAG = "DBAdapter";
    private Context context;
    private SQLiteDatabase mDb;
    public DatabaseHelper mDbHelper;

    public static class DatabaseHelper extends SQLiteOpenHelper {
        public static DatabaseHelper databaseHelper;
        String Table_USER_Create;

        public DatabaseHelper(Context context) {
            super(context, DBAdapter.Table_NAME, (SQLiteDatabase.CursorFactory) null, 2);
            this.Table_USER_Create = "tb_" + DBAdapter.LOGINID + " (uniseq text NOT NULL, seq text NOT NULL,timestamp text NOT NULL,datetime text, readYn text DEFAULT 'N',receiver text,sender text,title text DEFAULT '제목없음',msgType text DEFAULT 'T', content text, url text, attachfilecnt integer DEFAULT '0', attachfile text, downfilePath text, notiType text DEFAULT '0',taskName text DEFAULT '일반',receiveTime text, PRIMARY KEY (uniseq));";
            StringBuilder sb = new StringBuilder();
            sb.append("DatabaseHelper + ");
            sb.append(context.getDatabasePath(DBAdapter.Table_NAME));
            LogFile.log("DBHelper", 2, sb.toString());
        }

        public static DatabaseHelper getInstance(Context context) {
            if (databaseHelper == null) {
                databaseHelper = new DatabaseHelper(context);
            }
            return databaseHelper;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public SQLiteDatabase getReadableDatabase() {
            return super.getReadableDatabase();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public SQLiteDatabase getWritableDatabase() {
            return super.getWritableDatabase();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) throws SQLException {
            if (i9 <= i8 || i9 != 2) {
                return;
            }
            try {
                sQLiteDatabase.execSQL("ALTER TABLE tb_" + DBAdapter.LOGINID + " ADD COLUMN reserved1 text");
            } catch (SQLException unused) {
            }
        }
    }

    public DBAdapter(Context context) {
        this.context = context;
    }

    public static String getTable_NAME() {
        return "tb_" + LOGINID;
    }

    public void close() {
        this.mDbHelper.close();
    }

    public void createTableByID() throws SQLException {
        String str = "tb_" + LOGINID + " (uniseq text NOT NULL, seq text NOT NULL,timestamp text NOT NULL,datetime text, readYn text DEFAULT 'N',receiver text,sender text,title text DEFAULT '제목없음',msgType text DEFAULT 'T', content text, url text, attachfilecnt integer DEFAULT '0', attachfile text,downfilePath text,notiType text DEFAULT '0',taskName text DEFAULT '일반',receiveTime text, reserved1 text, PRIMARY KEY (uniseq));";
        LogFile.log(this.TAG, 4, "createTableByID =" + LOGINID);
        if (LOGINID != null) {
            this.mDb.execSQL("CREATE TABLE IF NOT EXISTS " + str);
        }
    }

    public int deleteAllMsg() throws SQLException {
        try {
            this.mDb.execSQL("delete from tb_" + LOGINID + "");
            return 1;
        } catch (SQLException unused) {
            LogFile.log(this.TAG, 1, "DB delete Error : deleteAllMSG");
            return -1;
        }
    }

    public List<MSGVo> getAllMsg() {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        Cursor cursorRawQuery = this.mDb.rawQuery("select * from " + getTable_NAME() + " order by timestamp desc, seq desc", null);
        if (cursorRawQuery.getCount() < 1) {
            cursorRawQuery.close();
            return null;
        }
        try {
            try {
                arrayList = new ArrayList();
            } finally {
                if (!cursorRawQuery.isClosed()) {
                    cursorRawQuery.close();
                }
            }
        } catch (Exception unused) {
        }
        try {
            if (cursorRawQuery.moveToFirst()) {
                do {
                    MSGVo mSGVo = new MSGVo();
                    mSGVo.setSender(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("sender")));
                    mSGVo.setReadYN(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("readYn")));
                    mSGVo.setTitle(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(Constants.TITLE)));
                    mSGVo.setContent(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(Constants.CONTENT)));
                    mSGVo.setTimeStamp(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("timestamp")));
                    mSGVo.setDate(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("datetime")));
                    mSGVo.setUniqSeq(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("uniseq")));
                    mSGVo.setParam(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("reserved1")));
                    arrayList.add(mSGVo);
                } while (cursorRawQuery.moveToNext());
            }
            return arrayList;
        } catch (Exception unused2) {
            arrayList2 = arrayList;
            LogFile.log(this.TAG, 1, "DB select Error : getAllMsg");
            if (cursorRawQuery.isClosed()) {
                return arrayList2;
            }
            cursorRawQuery.close();
            return arrayList2;
        }
    }

    public String getMsgRead(String str) {
        String string = "";
        Cursor cursorRawQuery = this.mDb.rawQuery("select readYn from tb_" + LOGINID + " where uniseq='" + str + "'", null);
        try {
            try {
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        string = cursorRawQuery.getString(0);
                    } while (cursorRawQuery.moveToNext());
                }
            } catch (Exception unused) {
                LogFile.log(this.TAG, 1, "DB Select Error : getMsgRead");
                if (!cursorRawQuery.isClosed()) {
                }
            }
            return string;
        } finally {
            if (!cursorRawQuery.isClosed()) {
                cursorRawQuery.close();
            }
        }
    }

    public String getSenderBySeq(String str) {
        Cursor cursorRawQuery = this.mDb.rawQuery("select sender from tb_" + LOGINID + " where uniseq='" + str + "'", null);
        String string = "";
        if (cursorRawQuery.getCount() >= 1 && cursorRawQuery.moveToFirst()) {
            do {
                try {
                    try {
                        string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("sender"));
                    } catch (SQLException e8) {
                        LogFile.log(this.TAG, 1, "DB Select Error : getSenderBySeq");
                        e8.getStackTrace();
                        if (!cursorRawQuery.isClosed()) {
                        }
                    }
                } finally {
                    if (!cursorRawQuery.isClosed()) {
                        cursorRawQuery.close();
                    }
                }
            } while (cursorRawQuery.moveToNext());
        }
        return string;
    }

    public DatabaseHelper getmDbHelper() {
        return this.mDbHelper;
    }

    public long insertMsg(MSGVo mSGVo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniseq", mSGVo.getUniqSeq());
        contentValues.put("seq", mSGVo.getSeq());
        if (mSGVo.getReadYN() == null || !mSGVo.getReadYN().equals("Y")) {
            contentValues.put("readYn", "N");
        } else {
            contentValues.put("readYn", mSGVo.getReadYN());
        }
        contentValues.put("timestamp", mSGVo.getTimeStamp());
        contentValues.put("sender", mSGVo.getSender());
        if (mSGVo.getMsgType() != null && mSGVo.getMsgType().equals("H")) {
            contentValues.put("msgType", mSGVo.getMsgType());
        }
        if (mSGVo.getTitle() != null && !mSGVo.getTitle().equals("")) {
            contentValues.put(Constants.TITLE, mSGVo.getTitle());
        }
        contentValues.put(Constants.CONTENT, mSGVo.getContent());
        if (mSGVo.getUrl() != null) {
            contentValues.put("url", mSGVo.getUrl());
        }
        if (mSGVo.getDate() != null) {
            contentValues.put("datetime", mSGVo.getDate());
        }
        if (mSGVo.getSender() != null) {
            contentValues.put("sender", mSGVo.getSender());
        }
        contentValues.put("attachfilecnt", Integer.valueOf(mSGVo.getAttachfileCnt()));
        if (mSGVo.getAttachfileCnt() > 0 && mSGVo.getAttachfile() != null) {
            contentValues.put("attachfile", mSGVo.getAttachfile());
        }
        if (mSGVo.getDownfilePath() != null) {
            contentValues.put("downfilePath", mSGVo.getDownfilePath());
        }
        if (mSGVo.getTaskName() == null) {
            mSGVo.setTaskName("일반");
        }
        contentValues.put("taskName", mSGVo.getTaskName());
        contentValues.put("receiveTime", mSGVo.getReceiveTime());
        contentValues.put("notitype", mSGVo.getNotiType());
        return this.mDb.insertOrThrow("tb_" + LOGINID, null, contentValues);
    }

    public long insertMsg2(MSGVo mSGVo) {
        if (mSGVo.getUniqSeq() == null) {
            return -1L;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniseq", mSGVo.getUniqSeq());
        contentValues.put("seq", mSGVo.getSeq());
        if (mSGVo.getReadYN() == null || !mSGVo.getReadYN().equals("Y")) {
            contentValues.put("readYn", "N");
        } else {
            contentValues.put("readYn", mSGVo.getReadYN());
        }
        contentValues.put("timestamp", mSGVo.getTimeStamp());
        contentValues.put("sender", mSGVo.getSender());
        if (mSGVo.getMsgType() != null && mSGVo.getMsgType().equals("H")) {
            contentValues.put("msgType", mSGVo.getMsgType());
        }
        if (mSGVo.getTitle() != null && !mSGVo.getTitle().equals("")) {
            contentValues.put(Constants.TITLE, mSGVo.getTitle());
        }
        contentValues.put(Constants.CONTENT, mSGVo.getContent());
        if (mSGVo.getUrl() != null) {
            contentValues.put("url", mSGVo.getUrl());
        }
        if (mSGVo.getDate() != null) {
            contentValues.put("datetime", mSGVo.getDate());
        }
        if (mSGVo.getSender() != null) {
            contentValues.put("sender", mSGVo.getSender());
        }
        contentValues.put("attachfilecnt", Integer.valueOf(mSGVo.getAttachfileCnt()));
        if (mSGVo.getAttachfileCnt() > 0 && mSGVo.getAttachfile() != null) {
            contentValues.put("attachfile", mSGVo.getAttachfile());
        }
        if (mSGVo.getDownfilePath() != null) {
            contentValues.put("downfilePath", mSGVo.getDownfilePath());
        }
        if (mSGVo.getTaskName() == null) {
            mSGVo.setTaskName("일반");
        }
        contentValues.put("taskName", mSGVo.getTaskName());
        contentValues.put("receiveTime", mSGVo.getReceiveTime());
        contentValues.put("notitype", mSGVo.getNotiType());
        contentValues.put("reserved1", mSGVo.getParam());
        return this.mDb.insertOrThrow("tb_" + LOGINID, null, contentValues);
    }

    public DBAdapter open() {
        if (Const.getUserID() == null || Const.getUserID().equals("")) {
            Const.setUserID(SharedData.getSharedData(this.context, "UserInfo", "UserID"));
            LogFile.log(this.TAG, 2, "open userid NULL");
        }
        String strTrim = Const.getUserID().trim();
        LOGINID = strTrim;
        if (strTrim.contains(e.STATE_NAME_NONE)) {
            LOGINID = LOGINID.replaceAll(e.STATE_NAME_NONE, "__0x01");
        }
        if (LOGINID.contains(".")) {
            LOGINID = LOGINID.replaceAll("\\.", "__0x02");
        }
        DatabaseHelper databaseHelper = DatabaseHelper.getInstance(this.context);
        this.mDbHelper = databaseHelper;
        SQLiteDatabase writableDatabase = databaseHelper.getWritableDatabase();
        this.mDb = writableDatabase;
        this.mDbHelper.onCreate(writableDatabase);
        createTableByID();
        return null;
    }

    public void removeForSeqItem(String str) {
        this.mDb.execSQL("delete from tb_" + LOGINID + " where uniseq='" + str + "'");
    }

    public void removeSenderListItem(String str) {
        this.mDb.execSQL("delete from tb_" + LOGINID + " where sender='" + str + "'");
    }

    public void removeTaskListItem(String str) {
        this.mDb.execSQL("delete from tb_" + LOGINID + " where taskName='" + str + "'");
    }

    public List<MSGVo> selectAllReadCheck() {
        ArrayList arrayList = null;
        Cursor cursorRawQuery = this.mDb.rawQuery("select * from tb_" + LOGINID + " where readYn != 'Y'", null);
        ArrayList arrayList2 = new ArrayList();
        if (cursorRawQuery.getCount() < 1) {
            cursorRawQuery.close();
            return arrayList2;
        }
        try {
            try {
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        MSGVo mSGVo = new MSGVo();
                        String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("uniseq"));
                        String string2 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("datetime"));
                        String string3 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("seq"));
                        mSGVo.setUniqSeq(string);
                        mSGVo.setDate(string2);
                        mSGVo.setSeq(string3);
                        arrayList2.add(mSGVo);
                    } while (cursorRawQuery.moveToNext());
                }
                if (!cursorRawQuery.isClosed()) {
                    cursorRawQuery.close();
                }
                arrayList = arrayList2;
            } catch (Exception e8) {
                LogFile.log(this.TAG, 1, "DB select Error : selectSenderId" + e8.getMessage());
                e8.printStackTrace();
                if (!cursorRawQuery.isClosed()) {
                    cursorRawQuery.close();
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (!cursorRawQuery.isClosed()) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public MSGVo selectCurrentPush() {
        MSGVo mSGVo;
        MSGVo mSGVo2 = null;
        Cursor cursorRawQuery = this.mDb.rawQuery("select uniseq,title,content,sender,timestamp,receiveTime, msgType from (select * from tb_" + LOGINID + " where readYn='N') as ai where ai.timestamp=(select max(timestamp) from tb_" + LOGINID + " where readYn='N')  order by uniseq desc", null);
        if (cursorRawQuery.getCount() < 1) {
            return null;
        }
        try {
            try {
                mSGVo = new MSGVo();
            } finally {
                if (!cursorRawQuery.isClosed()) {
                    cursorRawQuery.close();
                }
            }
        } catch (Exception unused) {
        }
        try {
            if (cursorRawQuery.moveToFirst()) {
                do {
                    mSGVo.setUniqSeq(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("uniseq")));
                    mSGVo.setSender(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("sender")));
                    mSGVo.setTitle(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(Constants.TITLE)));
                    String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex(Constants.CONTENT));
                    mSGVo.setMsgType(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("msgType")));
                    mSGVo.setContent(string);
                    mSGVo.setTimeStamp(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("timestamp")));
                    mSGVo.setReceiveTime(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("receiveTime")));
                } while (cursorRawQuery.moveToNext());
            }
            return mSGVo;
        } catch (Exception unused2) {
            mSGVo2 = mSGVo;
            LogFile.log(this.TAG, 1, "DB select Error : selectCurrentPush");
            if (cursorRawQuery.isClosed()) {
                return mSGVo2;
            }
            cursorRawQuery.close();
            return mSGVo2;
        }
    }

    public int selectNewMsgCount() {
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = this.mDb.rawQuery("select count(*) as newMsg from tb_" + LOGINID + " where readYn='N'", null);
        } catch (NullPointerException unused) {
        }
        if (cursorRawQuery == null) {
            return 0;
        }
        try {
            if (cursorRawQuery.getCount() >= 1) {
                try {
                    i = cursorRawQuery.moveToFirst() ? cursorRawQuery.getInt(0) : 0;
                } catch (SQLException unused2) {
                    LogFile.log(this.TAG, 1, "DB select Error : selectNewMsgCount");
                    if (!cursorRawQuery.isClosed()) {
                    }
                }
            }
            return i;
        } finally {
            if (!cursorRawQuery.isClosed()) {
                cursorRawQuery.close();
            }
        }
    }

    public ArrayList<MSGVo> selectSearchItems(String str) {
        Cursor cursorRawQuery = this.mDb.rawQuery("select * from tb_" + LOGINID + " where sender like '%" + str + "%' or content like '%" + str + "%' or title like '%" + str + "%' order by timestamp desc,seq desc", null);
        ArrayList<MSGVo> arrayList = new ArrayList<>();
        if (cursorRawQuery.getCount() >= 1 && cursorRawQuery.moveToFirst()) {
            do {
                try {
                    try {
                        MSGVo mSGVo = new MSGVo();
                        mSGVo.setTitle(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(Constants.TITLE)));
                        mSGVo.setSender(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("sender")));
                        mSGVo.setReadYN(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("readYn")));
                        mSGVo.setContent(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(Constants.CONTENT)));
                        mSGVo.setTimeStamp(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("timestamp")));
                        mSGVo.setDate(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("datetime")));
                        mSGVo.setUniqSeq(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("uniseq")));
                        mSGVo.setTaskName(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("taskName")));
                        arrayList.add(mSGVo);
                    } catch (SQLException unused) {
                        LogFile.log(this.TAG, 1, "DB SelectError : selectSearchItems");
                        if (!cursorRawQuery.isClosed()) {
                        }
                    }
                } finally {
                    if (!cursorRawQuery.isClosed()) {
                        cursorRawQuery.close();
                    }
                }
            } while (cursorRawQuery.moveToNext());
        }
        return arrayList;
    }

    public int selectSearchValuesCount(String str) {
        Cursor cursorRawQuery = this.mDb.rawQuery("select Count(Distinct uniseq) as count from tb_" + LOGINID + " where sender like '%" + str + "%' or content like '%" + str + "%' or title like '%" + str + "%' ", null);
        int i8 = -1;
        if (cursorRawQuery.getCount() >= 1 && cursorRawQuery.moveToFirst()) {
            do {
                try {
                    try {
                        i8 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("count"));
                    } catch (SQLException e8) {
                        LogFile.log(this.TAG, 1, "DB Select Error : selectSearchValuesCount");
                        e8.getStackTrace();
                        if (!cursorRawQuery.isClosed()) {
                        }
                    }
                } finally {
                    if (!cursorRawQuery.isClosed()) {
                        cursorRawQuery.close();
                    }
                }
            } while (cursorRawQuery.moveToNext());
        }
        return i8;
    }

    public ArrayList<MSGVo> selectSenderGroupCurruntMsg() {
        ArrayList<MSGVo> arrayList;
        ArrayList<MSGVo> arrayList2 = null;
        Cursor cursorRawQuery = this.mDb.rawQuery("select seq, uniseq, (select count(*) as newMsg from tb_" + LOGINID + " where readYn='N' and sender = ia.sender) as newMsg,timestamp, sender, url, datetime, content,taskName, title from tb_" + LOGINID + " ia group by sender order by timestamp desc,seq desc;", null);
        try {
            if (cursorRawQuery.getCount() < 1) {
                cursorRawQuery.close();
                return null;
            }
            try {
                arrayList = new ArrayList<>();
            } catch (Exception unused) {
            }
            try {
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        MSGVo mSGVo = new MSGVo();
                        mSGVo.setSender(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("sender")));
                        mSGVo.setNewMsgCnt(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("newMsg")));
                        mSGVo.setContent(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(Constants.CONTENT)));
                        mSGVo.setTimeStamp(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("timestamp")));
                        mSGVo.setDate(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("datetime")));
                        mSGVo.setUniqSeq(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("uniseq")));
                        mSGVo.setTaskName(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("taskName")));
                        mSGVo.setTitle(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(Constants.TITLE)));
                        arrayList.add(mSGVo);
                    } while (cursorRawQuery.moveToNext());
                }
                return arrayList;
            } catch (Exception unused2) {
                arrayList2 = arrayList;
                LogFile.log(this.TAG, 1, "DB Select Error : selectSenderGroupCurruntMsg");
                if (cursorRawQuery.isClosed()) {
                    return arrayList2;
                }
                cursorRawQuery.close();
                return arrayList2;
            }
        } finally {
            if (!cursorRawQuery.isClosed()) {
                cursorRawQuery.close();
            }
        }
    }

    public List<MSGVo> selectSenderId(String str) {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        Cursor cursorRawQuery = this.mDb.rawQuery("select seq, uniseq, readYn,timestamp, sender, url, datetime, content, title from (select * from tb_" + LOGINID + " where sender = '" + str + "') as temp order by timestamp desc,seq desc", null);
        try {
            if (cursorRawQuery.getCount() < 1) {
                cursorRawQuery.close();
                return null;
            }
            try {
                arrayList = new ArrayList();
            } catch (Exception unused) {
            }
            try {
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        MSGVo mSGVo = new MSGVo();
                        mSGVo.setUniqSeq(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("uniseq")));
                        mSGVo.setSender(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("sender")));
                        mSGVo.setReadYN(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("readYn")));
                        mSGVo.setTitle(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(Constants.TITLE)));
                        mSGVo.setContent(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(Constants.CONTENT)));
                        mSGVo.setTimeStamp(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("timestamp")));
                        mSGVo.setDate(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("datetime")));
                        arrayList.add(mSGVo);
                    } while (cursorRawQuery.moveToNext());
                }
                return arrayList;
            } catch (Exception unused2) {
                arrayList2 = arrayList;
                LogFile.log(this.TAG, 1, "DB select Error : selectSenderId");
                if (cursorRawQuery.isClosed()) {
                    return arrayList2;
                }
                cursorRawQuery.close();
                return arrayList2;
            }
        } finally {
            if (!cursorRawQuery.isClosed()) {
                cursorRawQuery.close();
            }
        }
    }

    public ArrayList<MSGVo> selectTaskGroupCurruntMsg() {
        Cursor cursorRawQuery;
        ArrayList<MSGVo> arrayList;
        ArrayList<MSGVo> arrayList2 = null;
        try {
            cursorRawQuery = this.mDb.rawQuery("select seq, uniseq, (select count(*) as newMsg from tb_" + LOGINID + " where readYn='N' and taskName = ia.taskName) as newMsg,timestamp, sender, url, datetime, content,taskName, title from tb_" + LOGINID + " ia group by taskName order by timestamp desc,seq desc;", null);
        } catch (NullPointerException e8) {
            LogFile.log(this.TAG, 0, "selectTaskGroupCurruntMsg: " + e8.getMessage());
            cursorRawQuery = null;
        }
        if (cursorRawQuery == null) {
            return null;
        }
        try {
            if (cursorRawQuery.getCount() < 1) {
                cursorRawQuery.close();
                return null;
            }
            try {
                arrayList = new ArrayList<>();
            } catch (Exception unused) {
            }
            try {
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        MSGVo mSGVo = new MSGVo();
                        mSGVo.setSender(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("sender")));
                        mSGVo.setNewMsgCnt(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("newMsg")));
                        mSGVo.setContent(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(Constants.CONTENT)));
                        mSGVo.setTimeStamp(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("timestamp")));
                        mSGVo.setDate(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("datetime")));
                        mSGVo.setUniqSeq(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("uniseq")));
                        mSGVo.setTaskName(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("taskName")));
                        mSGVo.setTitle(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(Constants.TITLE)));
                        arrayList.add(mSGVo);
                    } while (cursorRawQuery.moveToNext());
                }
                return arrayList;
            } catch (Exception unused2) {
                arrayList2 = arrayList;
                LogFile.log(this.TAG, 1, "DB select Error : selectTaskGroupCurruntMsg");
                if (cursorRawQuery.isClosed()) {
                    return arrayList2;
                }
                cursorRawQuery.close();
                return arrayList2;
            }
        } finally {
            if (!cursorRawQuery.isClosed()) {
                cursorRawQuery.close();
            }
        }
    }

    public List selectTaskId(String str) {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        Cursor cursorRawQuery = this.mDb.rawQuery("select seq, uniseq, readYn,timestamp, sender, url, datetime, content, title from (select * from tb_" + LOGINID + " where taskName = '" + str + "') as temp order by timestamp desc,seq desc", null);
        try {
            if (cursorRawQuery.getCount() < 1) {
                cursorRawQuery.close();
                return null;
            }
            try {
                arrayList = new ArrayList();
            } catch (Exception unused) {
            }
            try {
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        MSGVo mSGVo = new MSGVo();
                        mSGVo.setSender(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("sender")));
                        mSGVo.setReadYN(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("readYn")));
                        mSGVo.setTitle(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(Constants.TITLE)));
                        mSGVo.setContent(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(Constants.CONTENT)));
                        mSGVo.setTimeStamp(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("timestamp")));
                        mSGVo.setDate(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("datetime")));
                        mSGVo.setUniqSeq(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("uniseq")));
                        arrayList.add(mSGVo);
                    } while (cursorRawQuery.moveToNext());
                }
                return arrayList;
            } catch (Exception unused2) {
                arrayList2 = arrayList;
                LogFile.log(this.TAG, 1, "DB select Error : selectTaskId");
                if (cursorRawQuery.isClosed()) {
                    return arrayList2;
                }
                cursorRawQuery.close();
                return arrayList2;
            }
        } finally {
            if (!cursorRawQuery.isClosed()) {
                cursorRawQuery.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0108 A[DONT_GENERATE, PHI: r1
  0x0108: PHI (r1v5 com.h2osystech.smartalimi.aidllib.MSGVo) = (r1v6 com.h2osystech.smartalimi.aidllib.MSGVo), (r1v7 com.h2osystech.smartalimi.aidllib.MSGVo) binds: [B:17:0x0117, B:13:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.h2osystech.smartalimi.aidllib.MSGVo selectUnicseq(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.h2osystech.smartalimi.servicealimimodule.DBAdapter.selectUnicseq(java.lang.String):com.h2osystech.smartalimi.aidllib.MSGVo");
    }

    public long updateMsg2(MSGVo mSGVo) {
        ContentValues contentValues = new ContentValues();
        String[] strArr = {mSGVo.getUniqSeq()};
        if (mSGVo.getMsgType() != null && mSGVo.getMsgType().equals("H")) {
            contentValues.put("msgType", mSGVo.getMsgType());
        }
        if (mSGVo.getTitle() != null && !mSGVo.getTitle().equals("")) {
            contentValues.put(Constants.TITLE, mSGVo.getTitle());
        }
        contentValues.put(Constants.CONTENT, mSGVo.getContent());
        if (mSGVo.getUrl() != null) {
            contentValues.put("url", mSGVo.getUrl());
        }
        if (mSGVo.getSender() != null) {
            contentValues.put("sender", mSGVo.getSender());
        }
        contentValues.put("attachfilecnt", Integer.valueOf(mSGVo.getAttachfileCnt()));
        if (mSGVo.getAttachfileCnt() > 0 && mSGVo.getAttachfile() != null) {
            contentValues.put("attachfile", mSGVo.getAttachfile());
        }
        if (mSGVo.getDownfilePath() != null) {
            contentValues.put("downfilePath", mSGVo.getDownfilePath());
        }
        if (mSGVo.getTaskName() == null) {
            mSGVo.setTaskName("일반");
        }
        contentValues.put("taskName", mSGVo.getTaskName());
        contentValues.put("receiveTime", mSGVo.getReceiveTime());
        contentValues.put("notitype", mSGVo.getNotiType());
        contentValues.put("reserved1", mSGVo.getParam());
        SQLiteDatabase sQLiteDatabase = this.mDb;
        return sQLiteDatabase.update("tb_" + LOGINID, contentValues, "uniseq=?", strArr);
    }

    public void updateMsgReading(String str) {
        try {
            this.mDb.execSQL("update tb_" + LOGINID + " set readYn = 'Y' where uniseq='" + str + "'");
        } catch (Exception unused) {
            LogFile.log(this.TAG, 1, "DB UpdateError : updateMsgReading");
        }
    }
}

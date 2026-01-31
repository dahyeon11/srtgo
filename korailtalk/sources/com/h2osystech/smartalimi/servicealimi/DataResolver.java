package com.h2osystech.smartalimi.servicealimi;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import com.h2osystech.smartalimi.aidllib.MSGVo;
import com.h2osystech.smartalimi.common.LogFile;
import com.kakao.sdk.template.Constants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class DataResolver {
    public static String authoritis = "";
    private ContentResolver resolver;
    final String TAG = "DataResolver";
    public Uri CONTENT_URI = Uri.parse("content://" + authoritis);

    public DataResolver(ContentResolver contentResolver) {
        this.resolver = contentResolver;
    }

    public List getAllMsg(String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = this.resolver.query(this.CONTENT_URI, new String[]{"*"}, "tb_" + str, null, "timestamp desc, seq desc");
        try {
            try {
                if (cursorQuery.getCount() >= 1 && cursorQuery.moveToFirst()) {
                    do {
                        MSGVo mSGVo = new MSGVo();
                        mSGVo.setTitle(cursorQuery.getString(cursorQuery.getColumnIndex(Constants.TITLE)));
                        mSGVo.setSender(cursorQuery.getString(cursorQuery.getColumnIndex("sender")));
                        mSGVo.setReadYN(cursorQuery.getString(cursorQuery.getColumnIndex("readYn")));
                        mSGVo.setContent(cursorQuery.getString(cursorQuery.getColumnIndex(Constants.CONTENT)));
                        mSGVo.setTimeStamp(cursorQuery.getString(cursorQuery.getColumnIndex("timestamp")));
                        mSGVo.setDate(cursorQuery.getString(cursorQuery.getColumnIndex("datetime")));
                        mSGVo.setUniqSeq(cursorQuery.getString(cursorQuery.getColumnIndex("uniseq")));
                        mSGVo.setTaskName(cursorQuery.getString(cursorQuery.getColumnIndex("taskName")));
                        arrayList.add(mSGVo);
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLException e8) {
                LogFile.log("DataResolver", 1, "getAllMsg SQLException\n[" + e8.getMessage() + "]");
                if (cursorQuery != null && !cursorQuery.isClosed()) {
                }
            } catch (Exception unused) {
                if (cursorQuery == null || cursorQuery.isClosed()) {
                    return null;
                }
                cursorQuery.close();
                return null;
            }
            if (!cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public List<MSGVo> getCurrentMsg(String str) {
        Cursor cursorQuery = this.resolver.query(this.CONTENT_URI, new String[]{"seq", "uniseq", "(select count(*) as newMsg from tb_" + str + " where readYn='N' and sender = ia.sender) as newMsg", "timestamp", "sender", "url", "datetime", Constants.CONTENT, "taskName", Constants.TITLE}, "tb_" + str + " ia GROUP BY sender", null, "timestamp desc,seq desc");
        ArrayList arrayList = null;
        try {
            if (cursorQuery.getCount() >= 1) {
                ArrayList arrayList2 = new ArrayList();
                if (cursorQuery.moveToFirst()) {
                    do {
                        MSGVo mSGVo = new MSGVo();
                        mSGVo.setSender(cursorQuery.getString(cursorQuery.getColumnIndex("sender")));
                        mSGVo.setNewMsgCnt(cursorQuery.getString(cursorQuery.getColumnIndex("newMsg")));
                        mSGVo.setContent(cursorQuery.getString(cursorQuery.getColumnIndex(Constants.CONTENT)));
                        mSGVo.setTimeStamp(cursorQuery.getString(cursorQuery.getColumnIndex("timestamp")));
                        mSGVo.setDate(cursorQuery.getString(cursorQuery.getColumnIndex("datetime")));
                        mSGVo.setUniqSeq(cursorQuery.getString(cursorQuery.getColumnIndex("uniseq")));
                        mSGVo.setTaskName(cursorQuery.getString(cursorQuery.getColumnIndex("taskName")));
                        mSGVo.setTitle(cursorQuery.getString(cursorQuery.getColumnIndex(Constants.TITLE)));
                        arrayList2.add(mSGVo);
                    } while (cursorQuery.moveToNext());
                }
                arrayList = arrayList2;
            }
            if (!cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (Exception unused) {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th) {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public List<MSGVo> getCurrentMsgTask(String str) {
        Cursor cursorQuery = this.resolver.query(this.CONTENT_URI, new String[]{"seq", "uniseq", "(select count(*) as newMsg from tb_" + str + " where readYn='N' and taskName = ia.taskName) as newMsg", "timestamp", "sender", "url", "datetime", Constants.CONTENT, "taskName", Constants.TITLE}, "tb_" + str + " ia GROUP BY taskName", null, "timestamp desc,seq desc");
        ArrayList arrayList = null;
        try {
            if (cursorQuery.getCount() >= 1) {
                ArrayList arrayList2 = new ArrayList();
                if (cursorQuery.moveToFirst()) {
                    do {
                        MSGVo mSGVo = new MSGVo();
                        mSGVo.setSender(cursorQuery.getString(cursorQuery.getColumnIndex("sender")));
                        mSGVo.setNewMsgCnt(cursorQuery.getString(cursorQuery.getColumnIndex("newMsg")));
                        mSGVo.setContent(cursorQuery.getString(cursorQuery.getColumnIndex(Constants.CONTENT)));
                        mSGVo.setTimeStamp(cursorQuery.getString(cursorQuery.getColumnIndex("timestamp")));
                        mSGVo.setDate(cursorQuery.getString(cursorQuery.getColumnIndex("datetime")));
                        mSGVo.setUniqSeq(cursorQuery.getString(cursorQuery.getColumnIndex("uniseq")));
                        mSGVo.setTaskName(cursorQuery.getString(cursorQuery.getColumnIndex("taskName")));
                        mSGVo.setTitle(cursorQuery.getString(cursorQuery.getColumnIndex(Constants.TITLE)));
                        arrayList2.add(mSGVo);
                    } while (cursorQuery.moveToNext());
                }
                arrayList = arrayList2;
            }
            if (!cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (Exception unused) {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th) {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public String getReadYN(String str, String str2) {
        String string;
        Cursor cursorQuery = this.resolver.query(this.CONTENT_URI, new String[]{"readYn"}, "tb_" + str + " where uniseq=?", new String[]{str2}, null);
        String str3 = null;
        try {
            if (cursorQuery.getCount() >= 1 && cursorQuery.moveToFirst()) {
                do {
                    string = cursorQuery.getString(cursorQuery.getColumnIndex("readYn"));
                } while (cursorQuery.moveToNext());
                str3 = string;
            }
            if (!cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            return str3;
        } catch (Exception unused) {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th) {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public String getSenderByUniseq(String str, String str2) {
        String string;
        Cursor cursorQuery = this.resolver.query(this.CONTENT_URI, new String[]{"sender"}, "tb_" + str + " where uniseq=?", new String[]{str2}, null);
        String str3 = null;
        try {
            if (cursorQuery.getCount() >= 1 && cursorQuery.moveToFirst()) {
                do {
                    string = cursorQuery.getString(cursorQuery.getColumnIndex("sender"));
                } while (cursorQuery.moveToNext());
                str3 = string;
            }
            if (!cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            return str3;
        } catch (Exception unused) {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th) {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public List<MSGVo> getSenderMsg(String str, String str2) {
        Cursor cursorQuery = this.resolver.query(this.CONTENT_URI, new String[]{"seq", "uniseq", "readYn", "timestamp", "sender", "url", "datetime", Constants.CONTENT, Constants.TITLE}, "(select * from tb_" + str + " where sender = '" + str2 + "') as temp", null, "timestamp desc,seq desc");
        ArrayList arrayList = null;
        try {
            if (cursorQuery.getCount() >= 1) {
                ArrayList arrayList2 = new ArrayList();
                if (cursorQuery.moveToFirst()) {
                    do {
                        MSGVo mSGVo = new MSGVo();
                        mSGVo.setUniqSeq(cursorQuery.getString(cursorQuery.getColumnIndex("uniseq")));
                        mSGVo.setSender(cursorQuery.getString(cursorQuery.getColumnIndex("sender")));
                        mSGVo.setReadYN(cursorQuery.getString(cursorQuery.getColumnIndex("readYn")));
                        mSGVo.setTitle(cursorQuery.getString(cursorQuery.getColumnIndex(Constants.TITLE)));
                        mSGVo.setContent(cursorQuery.getString(cursorQuery.getColumnIndex(Constants.CONTENT)));
                        mSGVo.setTimeStamp(cursorQuery.getString(cursorQuery.getColumnIndex("timestamp")));
                        mSGVo.setDate(cursorQuery.getString(cursorQuery.getColumnIndex("datetime")));
                        arrayList2.add(mSGVo);
                    } while (cursorQuery.moveToNext());
                }
                arrayList = arrayList2;
            }
            if (!cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (Exception unused) {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th) {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public List<MSGVo> getTaskNameMsg(String str, String str2) {
        Cursor cursorQuery = this.resolver.query(this.CONTENT_URI, new String[]{"seq", "uniseq", "readYn", "timestamp", "sender", "url", "datetime", Constants.CONTENT, Constants.TITLE}, "(select * from tb_" + str + " where taskName = '" + str2 + "') as temp", null, "timestamp desc,seq desc");
        ArrayList arrayList = null;
        try {
            if (cursorQuery.getCount() >= 1) {
                ArrayList arrayList2 = new ArrayList();
                if (cursorQuery.moveToFirst()) {
                    do {
                        MSGVo mSGVo = new MSGVo();
                        mSGVo.setUniqSeq(cursorQuery.getString(cursorQuery.getColumnIndex("uniseq")));
                        mSGVo.setSender(cursorQuery.getString(cursorQuery.getColumnIndex("sender")));
                        mSGVo.setReadYN(cursorQuery.getString(cursorQuery.getColumnIndex("readYn")));
                        mSGVo.setTitle(cursorQuery.getString(cursorQuery.getColumnIndex(Constants.TITLE)));
                        mSGVo.setContent(cursorQuery.getString(cursorQuery.getColumnIndex(Constants.CONTENT)));
                        mSGVo.setTimeStamp(cursorQuery.getString(cursorQuery.getColumnIndex("timestamp")));
                        mSGVo.setDate(cursorQuery.getString(cursorQuery.getColumnIndex("datetime")));
                        arrayList2.add(mSGVo);
                    } while (cursorQuery.moveToNext());
                }
                arrayList = arrayList2;
            }
            if (!cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (Exception unused) {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th) {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public MSGVo getUniseqMsg(String str, String str2) {
        Cursor cursorQuery = this.resolver.query(this.CONTENT_URI, new String[]{"*"}, "tb_" + str + " where uniseq = ?", new String[]{str2}, null);
        MSGVo mSGVo = null;
        try {
            if (cursorQuery.getCount() >= 1 && cursorQuery.moveToFirst()) {
                MSGVo mSGVo2 = new MSGVo();
                mSGVo2.setUniqSeq(cursorQuery.getString(cursorQuery.getColumnIndex("uniseq")));
                mSGVo2.setSeq(cursorQuery.getString(cursorQuery.getColumnIndex("seq")));
                mSGVo2.setReadYN(cursorQuery.getString(cursorQuery.getColumnIndex("readYn")));
                mSGVo2.setTimeStamp(cursorQuery.getString(cursorQuery.getColumnIndex("timestamp")));
                mSGVo2.setMsgType(cursorQuery.getString(cursorQuery.getColumnIndex("msgType")));
                mSGVo2.setContent(cursorQuery.getString(cursorQuery.getColumnIndex(Constants.CONTENT)));
                mSGVo2.setTitle(cursorQuery.getString(cursorQuery.getColumnIndex(Constants.TITLE)));
                mSGVo2.setUrl(cursorQuery.getString(cursorQuery.getColumnIndex("url")));
                mSGVo2.setDate(cursorQuery.getString(cursorQuery.getColumnIndex("datetime")));
                mSGVo2.setSender(cursorQuery.getString(cursorQuery.getColumnIndex("sender")));
                mSGVo2.setAttachfileCnt(cursorQuery.getInt(cursorQuery.getColumnIndex("attachfilecnt")));
                mSGVo2.setAttachfile(cursorQuery.getString(cursorQuery.getColumnIndex("attachfile")));
                mSGVo2.setDownfilePath(cursorQuery.getString(cursorQuery.getColumnIndex("downfilePath")));
                mSGVo2.setTaskName(cursorQuery.getString(cursorQuery.getColumnIndex("taskName")));
                mSGVo2.setNotiType(cursorQuery.getString(cursorQuery.getColumnIndex("notiType")));
                mSGVo = mSGVo2;
            }
            if (!cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            return mSGVo;
        } catch (Exception unused) {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th) {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public int removeAllMsg(String str) {
        return this.resolver.delete(this.CONTENT_URI, null, null);
    }

    public int removeSenderGroupID(String str, String str2) {
        return this.resolver.delete(this.CONTENT_URI, "sender=?", new String[]{str2});
    }

    public int removeTaskGroupID(String str, String str2) {
        return this.resolver.delete(this.CONTENT_URI, "taskName=?", new String[]{str2});
    }

    public int removeToUniqSeqItem(String str, String str2) {
        return this.resolver.delete(this.CONTENT_URI, "uniseq=?", new String[]{str2});
    }

    public int selectSearchValuesCount(String str, String str2) {
        int i8;
        Cursor cursorQuery = this.resolver.query(this.CONTENT_URI, new String[]{"Count(Distinct uniseq) as count"}, "tb_" + str + " where  sender like '%" + str2 + "%' or content like '%" + str2 + "%' or title like '%" + str2 + "%'", null, null);
        int i9 = 0;
        try {
            if (cursorQuery.getCount() >= 1 && cursorQuery.moveToFirst()) {
                do {
                    i8 = cursorQuery.getInt(cursorQuery.getColumnIndex("count"));
                } while (cursorQuery.moveToNext());
                i9 = i8;
            }
            if (!cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            return i9;
        } catch (Exception unused) {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            return 0;
        } catch (Throwable th) {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public List selectSearchValuesList(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = this.resolver.query(this.CONTENT_URI, new String[]{"*"}, "tb_" + str + " where  sender like '%" + str2 + "%' or content like '%" + str2 + "%' or title like '%" + str2 + "%'", null, "timestamp desc, seq desc");
        if (cursorQuery == null) {
            return null;
        }
        try {
            try {
                if (cursorQuery.getCount() >= 1 && cursorQuery.moveToFirst()) {
                    do {
                        MSGVo mSGVo = new MSGVo();
                        mSGVo.setTitle(cursorQuery.getString(cursorQuery.getColumnIndex(Constants.TITLE)));
                        mSGVo.setSender(cursorQuery.getString(cursorQuery.getColumnIndex("sender")));
                        mSGVo.setReadYN(cursorQuery.getString(cursorQuery.getColumnIndex("readYn")));
                        mSGVo.setContent(cursorQuery.getString(cursorQuery.getColumnIndex(Constants.CONTENT)));
                        mSGVo.setTimeStamp(cursorQuery.getString(cursorQuery.getColumnIndex("timestamp")));
                        mSGVo.setDate(cursorQuery.getString(cursorQuery.getColumnIndex("datetime")));
                        mSGVo.setUniqSeq(cursorQuery.getString(cursorQuery.getColumnIndex("uniseq")));
                        mSGVo.setTaskName(cursorQuery.getString(cursorQuery.getColumnIndex("taskName")));
                        arrayList.add(mSGVo);
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLException e8) {
                LogFile.log("DataResolver", 1, "selectSearchValuesList \n[" + e8.getMessage() + "]");
                if (!cursorQuery.isClosed()) {
                }
            } catch (Exception unused) {
                if (!cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
                return null;
            }
            if (!cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (!cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public int updateReadYN(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("readYn", "Y");
        contentValues.put("TableName", "tb_" + str);
        return this.resolver.update(this.CONTENT_URI, contentValues, "uniseq=?", new String[]{str2});
    }
}

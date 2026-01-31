package com.h2osystech.smartalimi.common;

import Q7.X;
import android.content.Context;
import com.h2osystech.smartalimi.aidllib.MSGVo;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.kakao.sdk.auth.Constants;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class ConstructGetPacket {
    private static final String TAG = "ConstructGetPacket";

    public static HashMap<String, String> getLogin(byte[] bArr) {
        HashMap<String, String> map = new HashMap<>();
        try {
            map.put(Constants.CODE, new String(bArr, 0, 32, "UTF-8"));
            map.put("rtn_cd", new String(bArr, 32, 1, "UTF-8"));
            map.put("rtn_msg", new String(bArr, 33, 80, "UTF-8"));
            map.put(com.kakao.sdk.user.Constants.ID, new String(bArr, 113, 32, "UTF-8"));
            map.put("rtn_type", "1");
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return map;
    }

    public static HashMap<String, String> getMSGCNT(Context context, byte[] bArr) {
        HashMap<String, String> map = new HashMap<>();
        try {
            map.put(Constants.CODE, new String(bArr, 0, 32, "UTF-8"));
            map.put("rtn_cd", new String(bArr, 32, 1, "UTF-8"));
            map.put("rtn_msg", new String(bArr, 33, 80, "UTF-8"));
            map.put("cnt", new String(bArr, 113, 5, "UTF-8"));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return map;
    }

    public static ArrayList<MSGVo> getMsgData2(Context context, byte[] bArr) {
        ArrayList<MSGVo> arrayList = new ArrayList<>();
        try {
            LogFile.log(TAG, 4, "Total Len[" + bArr.length + "]");
            String str = new String(bArr, 113, 5, "UTF-8");
            int msg2 = 118;
            for (int i8 = 0; i8 < Integer.valueOf(str).intValue(); i8++) {
                MSGVo mSGVo = new MSGVo();
                msg2 = parseMSG2(context, bArr, mSGVo, msg2);
                arrayList.add(mSGVo);
            }
        } catch (Exception e8) {
            LogFile.log(TAG, 1, e8.getMessage() + "");
        }
        return arrayList;
    }

    public static ArrayList<MSGVo> getMsgDataAll(Context context, byte[] bArr) throws NumberFormatException {
        ArrayList<MSGVo> arrayList = new ArrayList<>();
        try {
            LogFile.log(TAG, 4, "GetMessageAll Total Len[" + bArr.length + "]");
            new String(bArr, 113, 3, "UTF-8");
            int i8 = Integer.parseInt(new String(bArr, 116, 5, "UTF-8"));
            int msg = 121;
            for (int i9 = 0; i9 < i8; i9++) {
                MSGVo mSGVo = new MSGVo();
                msg = parseMSG(context, bArr, mSGVo, msg);
                arrayList.add(mSGVo);
            }
        } catch (Exception e8) {
            LogFile.log(TAG, 1, e8.getMessage() + "");
        }
        return arrayList;
    }

    public static MSGVo getMsgVoData2(Context context, byte[] bArr) {
        MSGVo mSGVo = new MSGVo();
        try {
            parseMSG(context, bArr, mSGVo, 0);
        } catch (Exception e8) {
            LogFile.log(TAG, 4, e8.getMessage());
        }
        return mSGVo;
    }

    public static MSGVo getMsgVoData_EV(Context context, byte[] bArr) {
        MSGVo mSGVo = new MSGVo();
        try {
            parseMSG_EV(context, bArr, mSGVo, 0);
        } catch (Exception e8) {
            LogFile.log(TAG, 4, e8.getMessage());
        }
        return mSGVo;
    }

    public static HashMap<String, String> getPushOnOffReturnCode(byte[] bArr) {
        HashMap<String, String> map = new HashMap<>();
        try {
            map.put(Constants.CODE, new String(bArr, 0, 32, "UTF-8"));
            map.put("rtn_cd", new String(bArr, 32, 1, "UTF-8"));
            map.put("rtn_msg", new String(bArr, 33, 80, "UTF-8"));
            map.put("userid", new String(bArr, 113, 32, "UTF-8"));
            map.put("login_flag", new String(bArr, 145, 1, "UTF-8"));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return map;
    }

    public static int getReadCheckBuff(byte[] bArr) {
        try {
            try {
                String str = new String(bArr, 32, 1, "UTF-8");
                if (str.equals("")) {
                    return -1;
                }
                return Integer.valueOf(str).intValue();
            } catch (Exception e8) {
                LogFile.log(TAG, 2, e8.getMessage());
                return -1;
            }
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static HashMap<String, String> getRegistPush(byte[] bArr) {
        HashMap<String, String> map = new HashMap<>();
        try {
            map.put(Constants.CODE, new String(bArr, 0, 32, "UTF-8"));
            map.put("rtn_cd", new String(bArr, 32, 1, "UTF-8"));
            map.put("rtn_msg", new String(bArr, 33, 80, "UTF-8"));
            map.put("push_type", new String(bArr, 113, 1, "UTF-8"));
            map.put("log_level", new String(bArr, 114, 1, "UTF-8"));
            map.put("id_multiuse", new String(bArr, 115, 1, "UTF-8"));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return map;
    }

    public static HashMap<String, String> getTRBCallReturnCode(Context context, byte[] bArr) {
        HashMap<String, String> map = new HashMap<>();
        try {
            map.put(Constants.CODE, new String(bArr, 0, 32, "UTF-8"));
            map.put("rtn_cd", new String(bArr, 32, 1, "UTF-8"));
            map.put("rtn_msg", new String(bArr, 33, 80, "UTF-8"));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return map;
    }

    private static int parseMSG(Context context, byte[] bArr, MSGVo mSGVo, int i8) {
        String strTrim;
        String str;
        String str2;
        String strTrim2;
        String str3 = new String(bArr, i8, 8, "UTF-8");
        String str4 = new String(bArr, i8 + 8, 10, "UTF-8");
        String str5 = new String(bArr, i8 + 18, 10, "UTF-8");
        String str6 = new String(bArr, i8 + 28, 4, "UTF-8");
        LogFile.log(TAG, 5, "parseMSG: subseq<" + str5 + ">type<" + str6 + ">seq<" + str4 + SimpleComparison.GREATER_THAN_OPERATION);
        String strTrim3 = new String(bArr, i8 + 32, 32, Const.EUCENCODING).trim();
        String strTrim4 = new String(bArr, i8 + 64, 32, Const.EUCENCODING).trim();
        String strTrim5 = new String(bArr, i8 + 96, 20, "UTF-8").trim();
        String strTrim6 = new String(bArr, i8 + 116, 32, Const.EUCENCODING).trim();
        String strTrim7 = new String(bArr, i8 + 148, 100, Const.EUCENCODING).trim();
        String strTrim8 = new String(bArr, i8 + 248, 1, Const.EUCENCODING).trim();
        String str7 = new String(bArr, i8 + 249, 1, "UTF-8");
        int i9 = i8 + 250;
        LogFile.log(TAG, 5, "parseMSG: webLink<" + str7 + SimpleComparison.GREATER_THAN_OPERATION);
        if (str7.equals("Y")) {
            strTrim = new String(bArr, i9, 128, "UTF-8").trim();
            i9 = i8 + 378;
            LogFile.log(TAG, 5, "parseMSG: webLinkURL<" + str7 + SimpleComparison.GREATER_THAN_OPERATION);
        } else {
            strTrim = null;
        }
        String strTrim9 = new String(bArr, i9, 1, "UTF-8").trim();
        int i10 = i9 + 1;
        StringBuilder sb = new StringBuilder();
        String str8 = strTrim;
        sb.append("parseMSG: sCntFile<");
        sb.append(strTrim9);
        sb.append(SimpleComparison.GREATER_THAN_OPERATION);
        LogFile.log(TAG, 5, sb.toString());
        int i11 = strTrim9 == null ? 0 : Integer.parseInt(strTrim9);
        String strTrim10 = new String(bArr, i10, 4, "UTF-8").trim();
        int i12 = i9 + 5;
        int i13 = strTrim10 == null ? 0 : Integer.parseInt(strTrim10);
        LogFile.log(TAG, 5, "parseMSG: lenFld<" + i13 + SimpleComparison.GREATER_THAN_OPERATION);
        if (i13 > 0) {
            str = new String(bArr, i12, i13, Const.EUCENCODING);
            i12 += i13;
            LogFile.log(TAG, 5, "parseMSG: fileAttach<" + str + SimpleComparison.GREATER_THAN_OPERATION);
        } else {
            str = null;
        }
        String strTrim11 = new String(bArr, i12, 8, "UTF-8").trim();
        int i14 = i12 + 8;
        int i15 = strTrim11 == null ? 0 : Integer.parseInt(strTrim11);
        StringBuilder sb2 = new StringBuilder();
        String str9 = str;
        sb2.append("parseMSG: lenMsg<");
        sb2.append(i15);
        sb2.append(SimpleComparison.GREATER_THAN_OPERATION);
        LogFile.log(TAG, 5, sb2.toString());
        if (i15 > 0) {
            str2 = new String(bArr, i14, i15, Const.EUCENCODING);
            i14 += i15;
        } else {
            str2 = "";
        }
        String strTrim12 = new String(bArr, i14, 4, "UTF-8").trim();
        int i16 = i14 + 4;
        LogFile.log(TAG, 5, "parseMSG: param_len<" + strTrim12 + SimpleComparison.GREATER_THAN_OPERATION);
        int i17 = strTrim12 == null ? 0 : Integer.parseInt(strTrim12);
        if (i17 > 0) {
            strTrim2 = new String(bArr, i16, i17, "UTF-8").trim();
            i16 += i17;
            LogFile.log(TAG, 5, "parseMSG: nParam_len <" + strTrim12 + ">strParam<" + strTrim2 + SimpleComparison.GREATER_THAN_OPERATION);
        } else {
            strTrim2 = "";
        }
        mSGVo.setParam(strTrim2);
        mSGVo.setReceiver(strTrim3);
        mSGVo.setDate(str3);
        mSGVo.setSeq(str4);
        mSGVo.setTimeStamp(strTrim5);
        mSGVo.setContent(str2);
        mSGVo.setSender(strTrim4);
        mSGVo.setUniqSeq(str3.trim() + str4.trim() + strTrim5.trim());
        mSGVo.setAttachfileCnt(i11);
        if (str9 != null && i11 > 0) {
            mSGVo.setAttachfile(str9);
        }
        mSGVo.setDownfilePath(X.SPACE);
        if (str8 != null) {
            mSGVo.setUrl(str8);
        }
        mSGVo.setMsgType(str6.substring(0, 1));
        mSGVo.setTaskName(strTrim6);
        mSGVo.setReceiveTime(String.valueOf(System.currentTimeMillis()));
        mSGVo.setNotiType(strTrim8);
        if (strTrim7.length() != 0) {
            mSGVo.setTitle(strTrim7);
        } else if (mSGVo.getContent().length() > 10) {
            mSGVo.setTitle(mSGVo.getContent().substring(0, 9));
        } else {
            mSGVo.setTitle(mSGVo.getContent());
        }
        return i16;
    }

    private static int parseMSG2(Context context, byte[] bArr, MSGVo mSGVo, int i8) {
        String strTrim;
        int i9;
        String str;
        int i10;
        String str2;
        String strTrim2;
        LogFile.log(TAG, 5, "MSGRECV total LENG =" + bArr.length);
        String str3 = new String(bArr, i8, 8, "UTF-8");
        String str4 = new String(bArr, i8 + 8, 10, "UTF-8");
        String str5 = new String(bArr, i8 + 18, 4, "UTF-8");
        LogFile.log(TAG, 4, "parseMSG: subseq<" + new String(bArr, i8 + 22, 10, "UTF-8") + "> msgtype <" + str5 + ">seq<" + str4 + SimpleComparison.GREATER_THAN_OPERATION);
        String strTrim3 = new String(bArr, i8 + 32, 32, Const.EUCENCODING).trim();
        String strTrim4 = new String(bArr, i8 + 64, 32, Const.EUCENCODING).trim();
        String strTrim5 = new String(bArr, i8 + 96, 20, "UTF-8").trim();
        String strTrim6 = new String(bArr, i8 + 116, 32, Const.EUCENCODING).trim();
        String strTrim7 = new String(bArr, i8 + 148, 100, Const.EUCENCODING).trim();
        String strTrim8 = new String(bArr, i8 + 248, 1, Const.EUCENCODING).trim();
        int i11 = i8 + 250;
        if (new String(bArr, i8 + 249, 1, "UTF-8").equals("Y")) {
            strTrim = new String(bArr, i11, 128, "UTF-8").trim();
            i11 = i8 + 378;
        } else {
            strTrim = null;
        }
        String strTrim9 = new String(bArr, i11, 1, "UTF-8").trim();
        int i12 = i11 + 1;
        int i13 = strTrim9 == null ? 0 : Integer.parseInt(strTrim9);
        String str6 = strTrim;
        String strTrim10 = new String(bArr, i12, 4, "UTF-8").trim();
        int i14 = i11 + 5;
        LogFile.log(TAG, 4, "parseMSG: sLenFld<" + strTrim10 + SimpleComparison.GREATER_THAN_OPERATION);
        int i15 = strTrim10 == null ? 0 : Integer.parseInt(strTrim10);
        if (i15 > 0) {
            str = new String(bArr, i14, i15, Const.EUCENCODING);
            StringBuilder sb = new StringBuilder();
            i9 = i13;
            sb.append("parseMSG: fileAttach<");
            sb.append(str);
            sb.append(SimpleComparison.GREATER_THAN_OPERATION);
            LogFile.log(TAG, 4, sb.toString());
            i14 += i15;
        } else {
            i9 = i13;
            str = null;
        }
        String strTrim11 = new String(bArr, i14, 8, "UTF-8").trim();
        int i16 = i14 + 8;
        LogFile.log(TAG, 4, "parseMSG: MSGLen<" + strTrim11 + SimpleComparison.GREATER_THAN_OPERATION);
        int i17 = strTrim11 == null ? 0 : Integer.parseInt(strTrim11);
        if (i17 > 0) {
            str2 = new String(bArr, i16, i17, Const.EUCENCODING);
            i10 = 4;
            LogFile.log(TAG, 4, "parseMSG: tContent<" + str2 + SimpleComparison.GREATER_THAN_OPERATION);
            i16 += i17;
        } else {
            i10 = 4;
            str2 = null;
        }
        String strTrim12 = new String(bArr, i16, i10, "UTF-8").trim();
        int i18 = i16 + i10;
        LogFile.log(TAG, i10, "parseMSG2: paramLen = " + strTrim12);
        int i19 = strTrim12 == null ? 0 : Integer.parseInt(strTrim12);
        if (i19 > 0) {
            strTrim2 = new String(bArr, i18, i19, "UTF-8").trim();
            i18 += i19;
        } else {
            strTrim2 = "";
        }
        mSGVo.setParam(strTrim2);
        mSGVo.setDate(str3);
        mSGVo.setSeq(str4);
        mSGVo.setReceiver(strTrim3);
        mSGVo.setTimeStamp(strTrim5);
        mSGVo.setContent(str2);
        mSGVo.setSender(strTrim4);
        mSGVo.setUniqSeq(str3.trim() + str4.trim() + strTrim5.trim());
        int i20 = i9;
        mSGVo.setAttachfileCnt(i20);
        if (str != null && i20 > 0) {
            mSGVo.setAttachfile(str);
        }
        mSGVo.setDownfilePath(X.SPACE);
        if (str6 != null) {
            mSGVo.setUrl(str6);
        }
        mSGVo.setMsgType(str5.substring(0, 1));
        mSGVo.setTaskName(strTrim6);
        mSGVo.setReceiveTime(String.valueOf(System.currentTimeMillis()));
        mSGVo.setNotiType(strTrim8);
        if (strTrim7.length() != 0) {
            mSGVo.setTitle(strTrim7);
        } else if (mSGVo.getContent().length() > 10) {
            mSGVo.setTitle(mSGVo.getContent().substring(0, 9));
        } else {
            mSGVo.setTitle(mSGVo.getContent());
        }
        return i18;
    }

    private static int parseMSG_EV(Context context, byte[] bArr, MSGVo mSGVo, int i8) throws NumberFormatException {
        String str;
        String str2;
        String str3;
        String strTrim;
        String str4 = new String(bArr, i8, 32, Const.EUCENCODING);
        String str5 = new String(bArr, i8 + 32, 32, Const.EUCENCODING);
        String str6 = new String(bArr, i8 + 64, 20, "UTF-8");
        String str7 = new String(bArr, i8 + 84, 32, Const.EUCENCODING);
        String str8 = new String(bArr, i8 + 116, 100, Const.EUCENCODING);
        String str9 = new String(bArr, i8 + 216, 1, Const.EUCENCODING);
        LogFile.log(TAG, 5, "parseMSG: notiType<" + str8 + SimpleComparison.GREATER_THAN_OPERATION);
        String str10 = new String(bArr, i8 + 217, 1, "UTF-8");
        int i9 = i8 + 218;
        LogFile.log(TAG, 5, "parseMSG: webLink<" + str10 + SimpleComparison.GREATER_THAN_OPERATION);
        if (str10.equals("Y")) {
            str = new String(bArr, i9, 128, "UTF-8");
            i9 = i8 + 346;
            LogFile.log(TAG, 5, "parseMSG: webLinkURL<" + str10 + SimpleComparison.GREATER_THAN_OPERATION);
        } else {
            str = null;
        }
        String str11 = new String(bArr, i9, 1, "UTF-8");
        LogFile.log(TAG, 5, "parseMSG: sCntFile<" + str11 + SimpleComparison.GREATER_THAN_OPERATION);
        int i10 = Integer.parseInt(str11);
        String strTrim2 = new String(bArr, i9 + 1, 4, "UTF-8").trim();
        int i11 = i9 + 5;
        int i12 = strTrim2 == null ? 0 : Integer.parseInt(strTrim2);
        LogFile.log(TAG, 5, "parseMSG: lenFld<" + i12 + SimpleComparison.GREATER_THAN_OPERATION);
        if (i12 > 0) {
            str2 = new String(bArr, i11, i12, Const.EUCENCODING);
            i11 += i12;
            LogFile.log(TAG, 5, "parseMSG: fileAttach<" + str2 + SimpleComparison.GREATER_THAN_OPERATION);
        } else {
            str2 = null;
        }
        String str12 = new String(bArr, i11, 8, "UTF-8");
        int i13 = i11 + 8;
        int i14 = Integer.parseInt(str12);
        LogFile.log(TAG, 5, "parseMSG: lenMsg<" + i14 + SimpleComparison.GREATER_THAN_OPERATION);
        if (i14 > 0) {
            str3 = new String(bArr, i13, i14, Const.EUCENCODING);
            i13 += i14;
        } else {
            str3 = "";
        }
        String str13 = new String(bArr, i13, 4, "UTF-8");
        int i15 = i13 + 4;
        LogFile.log(TAG, 5, "parseMSG: param_len<" + str13 + SimpleComparison.GREATER_THAN_OPERATION);
        int i16 = Integer.parseInt(str13);
        if (i16 > 0) {
            strTrim = new String(bArr, i15, i16, "UTF-8").trim();
            i15 += i16;
            LogFile.log(TAG, 5, "parseMSG: nParam_len int<" + i16 + ">nParam_len<" + i16 + SimpleComparison.GREATER_THAN_OPERATION);
        } else {
            strTrim = "";
        }
        mSGVo.setParam(strTrim);
        mSGVo.setReceiver(str4);
        mSGVo.setDate(X.SPACE);
        mSGVo.setSeq(X.SPACE);
        mSGVo.setTimeStamp(str6);
        mSGVo.setContent(str3);
        mSGVo.setSender(str5);
        mSGVo.setUniqSeq(X.SPACE);
        mSGVo.setAttachfileCnt(i10);
        if (str2 != null && i10 > 0) {
            mSGVo.setAttachfile(str2);
        }
        mSGVo.setDownfilePath(X.SPACE);
        if (str != null) {
            mSGVo.setUrl(str);
        }
        mSGVo.setMsgType("N");
        mSGVo.setTaskName(str7);
        mSGVo.setReceiveTime(String.valueOf(System.currentTimeMillis()));
        mSGVo.setNotiType(str9);
        if (str8.length() != 0) {
            mSGVo.setTitle(str8);
        } else if (mSGVo.getContent().length() > 10) {
            mSGVo.setTitle(mSGVo.getContent().substring(0, 9));
        } else {
            mSGVo.setTitle(mSGVo.getContent());
        }
        return i15;
    }
}

package com.h2osystech.smartalimi.common;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.h2osystech.smartalimi.servicealimimodule.SharedData;
import com.kakao.sdk.user.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Const {
    public static final int CONTENT = 2;
    public static boolean CustomNotiFlag = false;
    public static final int ERB_ERROR = 0;
    public static final int ERB_FAILED = -1;
    public static final int ERB_SUCCESS = 1;
    public static final int ERB_TIMEOUT = -2;
    public static final String EUCENCODING = "EUC-KR";
    public static final int EVENT_KEY_LEN = 32;
    public static int FAIL = -1;
    public static int GCM_CALLBACK_INAVLID_NETWORK = -2;
    public static int GCM_CALLBACK_MESSAGE = 0;
    public static int GCM_CALLBACK_SAVEMODE = -1;
    public static int GCM_CALLBACK_TR_FAIL = -3;
    public static final int GUBUN_KEY_LEN = 24;
    public static boolean IS_LOG = false;
    public static String LOGINFLAG = "N";
    public static int LOGINFLAG_D = 2;
    public static int LOGINFLAG_N = 0;
    public static int LOGINFLAG_Y = 1;
    public static final String LOG_LEVEL_DISABLE = "0";
    public static final String LOG_LEVEL_FULL = "3";
    public static final String LOG_LEVEL_MINIMUM = "1";
    public static final String LOG_LEVEL_NOMAL = "2";
    public static final int NETWORK_AVAILABLE = 1;
    public static final int NETWORK_CONECTED = 1;
    public static final int NETWORK_DISABLE = -1;
    public static final int NETWORK_DISCONNECTED = -1;
    public static final int NONE_ALRAM = 3;
    public static final int NOTIFICATION_ID = 30645360;
    public static int NOTITYPE = 0;
    public static final int NOTI_DEFAULT = 0;
    public static int NOTI_DISABLE = 0;
    public static int NOTI_FLAG_DISABLE = 1;
    public static int NOTI_FLAG_ENABLE = 0;
    public static final int NOTI_NOTI = 1;
    public static final int NOTI_POPUP = 2;
    public static final int OS_ALARM_START = 2;
    public static final int OS_BOOT_COMPLETED = 0;
    public static final int PUSHTYPE_HYBRID = 2;
    public static final int PUSHTYPE_PRIVATE = 1;
    public static final int PUSHTYPE_PUBLIC = 0;
    public static final int SB_ERR_INIT = -1;
    public static final int SB_ERR_INVALID_DATA = -6;
    public static final int SB_ERR_INVALID_ID = -8;
    public static final int SB_ERR_INVALID_TOKEN = -7;
    public static final int SB_ERR_NOT_INIT_INFO = -5;
    public static final int SB_ERR_REGISTKEY = -4;
    public static final int SB_ERR_REGISTPUSH = -3;
    public static final int SB_ERR_TIMEOUT = -2;
    public static final int SB_EXIST_REGI_USER = 3;
    public static final int SB_INVALID_USER = 4;
    public static final int SB_LOGIN_FAIL = 5;
    public static final int SB_NOT_CERTIFY_USER = 6;
    public static final int SB_SUCCESS = 0;
    public static final int SENDERCONTENT = 1;
    public static final String SERVICE_START_INTENTNAME = "startStatus";
    public static final int SORT_ETC = 2;
    public static int SORT_GROUP_SENDER = 0;
    public static int SORT_GROUP_TASK = 1;
    public static final int SORT_SENDERID = 0;
    public static final int SORT_TASKCODE = 1;
    public static final int SOUND_ALRAM = 0;
    public static final int SOUND_AND_VIBERATE_ALRAM = 2;
    public static int SUCCESS = 1;
    public static final String TESTENCODING = "UTF-8";
    public static final int TITLE = 3;
    public static final int TITLECONTENT = 0;
    public static final String UTFENCODING = "UTF-8";
    public static final int VIBERATE_ALRAM = 1;
    public static String addEventKey = "";
    public static String addGubunKey = "";
    public static final String authority = "com.h2osystech.smartalimi.ServiceAlimiData.skt";
    public static boolean bindFlag = false;
    public static String brokerAppType = "";
    public static String brokerGubun = "H2O Systech";
    public static String brokerIP = "";
    public static int brokerInitTimeout = 5;
    public static int brokerPort = 0;
    public static int brokerPushType = 0;
    public static int brokerTimeout = 10;
    public static final int dupMessage = 128;
    public static final byte evMessage = 4;
    public static String gcmRegID = "";
    public static boolean isOnebyOne = false;
    public static int logLevel = 0;
    public static final byte message = 32;
    public static final String notiIntentPackage = "";
    public static int notiTreadTime = 1000;
    public static int useGcmFlag = 1;
    public static String userID = "";
    public static String userPW = "";
    public static final String[] SORT_GUBUN = {"발신자", "업무별"};
    public static final String[] alramModes = {"소리", "진동", "소리+진동", "무음"};

    public static String DateTime() {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MM");
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("dd");
        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("HH");
        SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat("mm");
        SimpleDateFormat simpleDateFormat6 = new SimpleDateFormat("ss");
        SimpleDateFormat simpleDateFormat7 = new SimpleDateFormat("SSS");
        String str = simpleDateFormat.format(date);
        String str2 = simpleDateFormat2.format(date);
        String str3 = simpleDateFormat3.format(date);
        String str4 = simpleDateFormat4.format(date);
        String str5 = simpleDateFormat5.format(date);
        String str6 = simpleDateFormat6.format(date);
        simpleDateFormat7.format(date);
        return str + "" + str2 + "" + str3 + "" + str4 + "" + str5 + "" + str6;
    }

    public static String DateTimeTimeStamp() {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MM");
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("dd");
        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("HH");
        SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat("mm");
        SimpleDateFormat simpleDateFormat6 = new SimpleDateFormat("ss");
        return simpleDateFormat.format(date) + "" + simpleDateFormat2.format(date) + "" + simpleDateFormat3.format(date) + "" + simpleDateFormat4.format(date) + "" + simpleDateFormat5.format(date) + "" + simpleDateFormat6.format(date);
    }

    public static String accept_msg(Context context, String str, String str2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("msgSeq", str);
            jSONObject.put(Constants.ID, CommonUtil.getPref(context, Constants.ID));
            jSONObject.put("recvYn", "Y");
            jSONObject.put("quiscYn", str2);
            jSONObject.put("cpNo", getPhoneNum(context));
            jSONObject.put("msgCode", "C002");
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getBrokerIP() {
        return brokerIP;
    }

    public static int getBrokerPort() {
        return brokerPort;
    }

    public static String getDeviceId(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getGcmRegID() {
        return gcmRegID;
    }

    public static String getLOGINFLAG() {
        return LOGINFLAG;
    }

    public static int getNotiTreadTime() {
        return notiTreadTime;
    }

    public static int getNotiType() {
        return NOTITYPE;
    }

    public static int getNoti_Disable() {
        return NOTI_DISABLE;
    }

    public static String getPhoneNum(Context context) {
        String sharedData = SharedData.getSharedData(context, "UserInfo", "UserPhone");
        try {
            return !sharedData.equals("") ? sharedData : "010-1234-5678";
        } catch (Exception unused) {
            return "01012345678";
        }
    }

    public static String getUserID() {
        return userID;
    }

    public static String getUserPW() {
        return userPW;
    }

    public static boolean isCustomNotiFlag() {
        return CustomNotiFlag;
    }

    public static String login_msg(Context context) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.ID, CommonUtil.getPref(context, Constants.ID));
            jSONObject.put("passWd", CommonUtil.getPref(context, "pass"));
            jSONObject.put("msgCode", "C001");
            jSONObject.put("cpNo", getPhoneNum(context));
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String readAgentInfoConnectName(Context context) {
        try {
            return context.getPackageName() + ".MessageManager";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String readAgentRefreshNewMSGReceiver(Context context) {
        try {
            return context.getPackageName() + ".NewMsgReceiver";
        } catch (Exception unused) {
            return "";
        }
    }

    public static void readBrokerInfo(String str, String str2) {
        brokerIP = str;
        if (str2.equals("")) {
            return;
        }
        brokerPort = Integer.valueOf(str2).intValue();
    }

    public static String recv_msg(Context context, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.ID, CommonUtil.getPref(context, Constants.ID));
            jSONObject.put("msgSeq", str);
            jSONObject.put("msgCode", "C005");
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String remove_msg(Context context) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.ID, CommonUtil.getPref(context, Constants.ID));
            jSONObject.put("msgCode", "C004");
            jSONObject.put("cpNo", getPhoneNum(context));
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static void setCustomNotiFlag(boolean z8) {
        CustomNotiFlag = z8;
    }

    public static void setGcmRegID(String str) {
        gcmRegID = str;
        LogFile.log("SmartBrokerAdpater", 4, "set Token ID" + gcmRegID);
    }

    public static void setLOGINFLAG(String str) {
        LOGINFLAG = str;
    }

    public static void setNotiTreadTime(int i8) {
        notiTreadTime = i8;
    }

    public static void setNotiType(int i8) {
        NOTITYPE = i8;
    }

    public static void setNoti_Disable(int i8) {
        NOTI_DISABLE = i8;
    }

    public static void setUserID(String str) {
        userID = str;
    }

    public static void setUserPW(String str) {
        userPW = str;
    }

    public static String state_msg(Context context) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("msgCode", "C003");
            jSONObject.put(Constants.ID, CommonUtil.getPref(context, Constants.ID));
            jSONObject.put("cpNo", getPhoneNum(context));
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void updateBadgetCount(Context context, int i8) {
        if (Build.VERSION.SDK_INT >= 26) {
            i8 = 0;
        }
        String packageName = context.getPackageName();
        String sharedData = SharedData.getSharedData(context, "noticeEnv", "mainActivity");
        if (packageName.equals("")) {
            return;
        }
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i8);
        intent.putExtra("badge_count_package_name", packageName);
        intent.putExtra("badge_count_class_name", sharedData);
        context.sendBroadcast(intent);
    }

    public static boolean writeBrokerInfo(Context context, String str, int i8) throws IOException {
        AssetManager assets = context.getAssets();
        Properties properties = new Properties();
        if (str.split(".").length != 4 || i8 == 0) {
            return false;
        }
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = assets.open("networkinfo.ini");
            properties.load(inputStreamOpen);
            properties.setProperty("SmartBrokerIP", str);
            properties.setProperty("SmartBrokerPort", String.valueOf(i8));
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
            return true;
        } catch (Exception unused) {
            if (inputStreamOpen == null) {
                return false;
            }
            try {
                inputStreamOpen.close();
                return false;
            } catch (IOException e9) {
                e9.printStackTrace();
                return false;
            }
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
            throw th;
        }
    }
}

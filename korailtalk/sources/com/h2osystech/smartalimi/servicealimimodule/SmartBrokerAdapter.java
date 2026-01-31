package com.h2osystech.smartalimi.servicealimimodule;

import Q7.C0709m;
import android.content.Context;
import android.util.SparseArray;
import com.google.android.material.timepicker.c;
import com.h2osystech.smartalimi.aidllib.MSGVo;
import com.h2osystech.smartalimi.common.CommonUtil;
import com.h2osystech.smartalimi.common.Const;
import com.h2osystech.smartalimi.common.ConstructGetPacket;
import com.h2osystech.smartalimi.common.LogFile;
import com.h2osystech.smartalimi.servicealimi.NetworkStatusReceiver;
import com.h2osystech.smartbrokerapis.ERBAPIs;
import com.h2osystech.smartbrokerapis.EventData;
import com.h2osystech.smartbrokerapis.Flag;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes2.dex */
public class SmartBrokerAdapter implements Observer {
    private static ERBAPIs erbAPIs = new ERBAPIs();
    public static boolean erbBrokerInit = false;
    public static String lastDisconnectTime = "";
    public static String lastLoginTime = "";
    private final Context context;
    final String TAG = "SmartBrokerAdapter";
    private boolean erbBrokerIsIniting = false;
    private final int getMessageCntLimit = 50;
    private PushReceiver pushReceiver = null;
    int[] outLen = new int[1];
    byte[] outBuff = new byte[10240];
    Flag flags = new Flag();
    private SparseArray<Object> arrays = new SparseArray<>();

    public SmartBrokerAdapter(Context context) {
        this.context = context;
    }

    protected ArrayList<MSGVo> curruntRecv(int i8) {
        this.outLen[0] = this.outBuff.length;
        Flag flag = this.flags;
        flag.flag = 32L;
        flag.timeOut = Const.brokerTimeout;
        String str = new String(CommonUtil.strCharsetBytes(Const.getUserID(), 32, Charset.forName("UTF-8"))) + new String(CommonUtil.strCharsetBytes(Const.brokerAppType, 32, Charset.forName("UTF-8"))) + String.format("%05d", Integer.valueOf(i8));
        LogFile.log("SmartBrokerAdapter", 4, "GET_MSG_ALL : erbCall start" + str);
        byte[] bArrErbcall = erbAPIs.erbcall("GET_MSG_ALL2".getBytes(), str.getBytes(), str.getBytes().length, this.outLen, this.flags);
        if (this.outLen[0] <= 0) {
            return null;
        }
        try {
            LogFile.log("SmartBrokerAdapter", 2, "recvNewMsg +[" + bArrErbcall.length + "]");
            return ConstructGetPacket.getMsgDataAll(this.context, bArrErbcall);
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public void erbStop() {
        LogFile.log("SmartBrokerAdapter", 1, "erbStop");
        erbAPIs.erbrmregister();
        erbAPIs.deleteObservers();
        term();
    }

    public int erbaddregister() {
        if (Const.brokerPushType == 0) {
            return 0;
        }
        LogFile.log("SmartBrokerAdapter", 2, "erbStart");
        int sharedNoData = SharedData.getSharedNoData(this.context, "UserInfo", "PushKeyCount");
        String sharedData = SharedData.getSharedData(this.context, "UserInfo", "PushKeys");
        if (sharedNoData == 0 || sharedData.equals("")) {
            sharedData = SharedData.getSharedData(this.context, "UserInfo", "UserID");
            Const.userID = sharedData;
            sharedNoData = 1;
        }
        if (sharedData.equals("")) {
            LogFile.log("SmartBrokerAdapter", 4, "erbStart Failed : pushkeys Empty");
            return -6;
        }
        LogFile.log("SmartBrokerAdapter", 3, "Try Erbaddregister1 :" + sharedData);
        if (erbAPIs.erbaddregister(sharedData.getBytes(), sharedData.getBytes(), sharedNoData, 32) != 1) {
            return -4;
        }
        if (!Const.addEventKey.equals("") && !Const.addGubunKey.equals("") && erbaddregister(Const.addGubunKey, Const.addEventKey) != 0) {
            return -4;
        }
        LogFile.log("SmartBrokerAdapter", 4, "erbStart Success ");
        erbAPIs.addObserver(this);
        LogFile.log("SmartBrokerAdapter", 4, "addObserver");
        return 0;
    }

    public int erbdelregister(String str, String str2) {
        if (str2.length() > 32 || str.length() > 24) {
            LogFile.log("SmartBrokerAdapter", 1, "erbdelregister:  Fail rtn = gubun key = " + Const.addGubunKey + "evKey = " + Const.addEventKey);
            return -6;
        }
        if (erbAPIs.erbdelregister(str.getBytes(), str2.getBytes(), 1, 32) != 1) {
            LogFile.log("SmartBrokerAdapter", 4, "erbdelregister Fail ");
            return -4;
        }
        Const.addEventKey = "";
        Const.addGubunKey = "";
        LogFile.log("SmartBrokerAdapter", 4, "erbdelregister Success ");
        return 0;
    }

    public ArrayList<MSGVo> getBeforeMessage(int i8) {
        if (!isErbBrokerInit()) {
            return null;
        }
        ArrayList<MSGVo> arrayListCurruntRecv = i8 > 0 ? curruntRecv(i8) : null;
        if (Const.brokerPushType == 0) {
            erbStop();
        }
        return arrayListCurruntRecv;
    }

    public ArrayList<MSGVo> getNewMessage() throws NumberFormatException {
        LogFile.log("SmartBrokerAdapter", 1, "onStart getNewMessage Cnt ");
        int newMsgCount = getNewMsgCount();
        if (newMsgCount == -1) {
            init();
            newMsgCount = getNewMsgCount();
        }
        LogFile.log("SmartBrokerAdapter", 1, "End getNewMessage Cnt " + newMsgCount);
        if (newMsgCount <= 0) {
            if (newMsgCount == 0) {
                return new ArrayList<>();
            }
            return null;
        }
        LogFile.log("SmartBrokerAdapter", 1, "Start getNewMessage ");
        ArrayList<MSGVo> arrayListRecvNewMsg = recvNewMsg(newMsgCount);
        if (arrayListRecvNewMsg == null) {
            arrayListRecvNewMsg = recvNewMsg(newMsgCount);
        }
        LogFile.log("SmartBrokerAdapter", 1, "End getNewMessage ");
        return arrayListRecvNewMsg;
    }

    public ArrayList<MSGVo> getNewMessageLimit() throws NumberFormatException {
        LogFile.log("SmartBrokerAdapter", 1, "onStart getNewMessage Cnt ");
        int newMsgCount = getNewMsgCount();
        if (newMsgCount == -1) {
            init();
            newMsgCount = getNewMsgCount();
        }
        LogFile.log("SmartBrokerAdapter", 1, "End getNewMessage Cnt " + newMsgCount);
        if (newMsgCount > 50) {
            newMsgCount = 50;
        }
        if (newMsgCount <= 0) {
            if (newMsgCount == 0) {
                return new ArrayList<>();
            }
            return null;
        }
        LogFile.log("SmartBrokerAdapter", 1, "Start getNewMessage ");
        ArrayList<MSGVo> arrayListRecvNewMsg = recvNewMsg(newMsgCount);
        LogFile.log("SmartBrokerAdapter", 1, "End getNewMessage ");
        return arrayListRecvNewMsg;
    }

    protected int getNewMsgCount() throws NumberFormatException {
        int i8;
        this.outLen[0] = this.outBuff.length;
        Flag flag = this.flags;
        flag.flag = 32L;
        flag.timeOut = Const.brokerTimeout;
        if (Const.getGcmRegID().equals("") || Const.getGcmRegID() == null) {
            Const.setGcmRegID(SharedData.getSharedData(this.context, "UserInfo", "gcmToken"));
        }
        int i9 = -1;
        if (Const.getGcmRegID().equals("")) {
            return -1;
        }
        byte[] bArrStrCharsetBytes = CommonUtil.strCharsetBytes(Const.getUserID(), 32, Charset.forName("UTF-8"));
        byte[] bArrStrCharsetBytes2 = CommonUtil.strCharsetBytes(Const.getGcmRegID(), 256, Charset.forName("UTF-8"));
        String str = new String(bArrStrCharsetBytes) + new String(bArrStrCharsetBytes2);
        LogFile.log("SmartBrokerAdapter", 4, "getNewMsgCount erbCall Start");
        byte[] bArrErbcall = erbAPIs.erbcall("GET_NEW_MSG_CNT2".getBytes(), str.getBytes(), str.getBytes().length, this.outLen, this.flags);
        int i10 = this.outLen[0];
        if (i10 > 0) {
            try {
                byte[] bArr = new byte[i10];
                HashMap<String, String> msgcnt = ConstructGetPacket.getMSGCNT(this.context, bArrErbcall);
                String str2 = ((Object) msgcnt.get("rtn_cd")) + "";
                LogFile.log("SmartBrokerAdapter", 4, "GetNewMSG CNT  = " + str2);
                if (Integer.parseInt(str2) == 0) {
                    i8 = Integer.parseInt(((Object) msgcnt.get("cnt")) + "");
                } else {
                    i8 = -1;
                }
                LogFile.log("SmartBrokerAdapter", 3, "GET_NEW_MSG_CNT [" + i8 + "]");
                i9 = i8;
            } catch (Exception unused) {
            }
        }
        LogFile.log("SmartBrokerAdapter", 4, "getNewMsgCount erbCall END Count = " + i9);
        return i9;
    }

    protected int getNewMsgCount2() throws NumberFormatException {
        int i8 = 0;
        this.outLen[0] = this.outBuff.length;
        Flag flag = this.flags;
        flag.flag = 32L;
        flag.timeOut = Const.brokerTimeout;
        String str = new String(CommonUtil.strCharsetBytes(Const.getUserID(), 32, Charset.forName("UTF-8")));
        LogFile.log("SmartBrokerAdapter", 4, "getNewMsgCount erbCall Start");
        byte[] bArrErbcall = erbAPIs.erbcall("GET_NEW_MSG_CNT".getBytes(), str.getBytes(), str.getBytes().length, this.outLen, this.flags);
        LogFile.log("SmartBrokerAdapter", 4, "getNewMsgCount erbCall END len[" + bArrErbcall.length + "]");
        int i9 = this.outLen[0];
        if (i9 <= 0) {
            return 0;
        }
        try {
            byte[] bArr = new byte[i9];
            String str2 = ((Object) ConstructGetPacket.getMSGCNT(this.context, bArrErbcall).get("cnt")) + "";
            i8 = Integer.parseInt(str2);
            LogFile.log("SmartBrokerAdapter", 3, "GET_NEW_MSG_CNT [" + str2 + "]");
            return i8;
        } catch (Exception e8) {
            e8.printStackTrace();
            return i8;
        }
    }

    public String getPushOnOff(String str, String str2) {
        if (!isErbBrokerInit() && init() != 1) {
            return "";
        }
        if (str.equals("")) {
            str = SharedData.getSharedData(this.context, "UserInfo", "UserID");
        }
        this.outLen[0] = this.outBuff.length;
        Flag flag = this.flags;
        flag.flag = 32L;
        flag.timeOut = Const.brokerTimeout;
        String str3 = String.format("%-32s%-128s%1s%-256s%-32s", str, str2, "A", Const.getGcmRegID(), Const.brokerAppType);
        LogFile.log("SmartBrokerAdapter", 2, "GET_PUSH_ONOFF [][" + Const.getGcmRegID() + "]");
        byte[] bArrErbcall = erbAPIs.erbcall("GET_PUSH_ONOFF".getBytes(), str3.getBytes(), str3.getBytes().length, this.outLen, this.flags);
        if (this.outLen[0] <= 0) {
            return "";
        }
        HashMap<String, String> pushOnOffReturnCode = ConstructGetPacket.getPushOnOffReturnCode(bArrErbcall);
        String str4 = pushOnOffReturnCode.get("rtn_cd");
        if (!str4.equals("0")) {
            LogFile.log("SmartBrokerAdapter", 2, "getPushOnOff: " + pushOnOffReturnCode.get("rtn_msg"));
            return "";
        }
        String str5 = pushOnOffReturnCode.get("login_flag");
        LogFile.log("SmartBrokerAdapter", 3, "getPushOnOff: " + str5);
        if (str5.equals("N")) {
            return C0709m.OFF;
        }
        if (str5.equals("Y")) {
            return C0709m.ON;
        }
        LogFile.log("SmartBrokerAdapter", 3, "SB Service Error Result Code [" + str4 + "]");
        return "";
    }

    public int init(String str, int i8, String str2, int i9) {
        Const.brokerIP = str;
        Const.brokerPort = i8;
        Const.brokerGubun = str2;
        Const.brokerTimeout = i9;
        return init();
    }

    public boolean isErbBrokerInit() {
        return erbBrokerInit;
    }

    public int login(String str, String str2) throws NumberFormatException {
        int i8;
        String str3;
        int iInit;
        if (!isErbBrokerInit() && (iInit = init()) != 1) {
            return iInit;
        }
        String phoneNum = Const.getPhoneNum(this.context);
        int i9 = 0;
        this.outLen[0] = this.outBuff.length;
        Flag flag = this.flags;
        flag.flag = 32L;
        flag.timeOut = Const.brokerTimeout;
        String str4 = new String(CommonUtil.strCharsetBytes(Const.getGcmRegID(), 256, Charset.forName("UTF-8")));
        String str5 = String.format("%03d", Integer.valueOf(str.length())) + str + Const.DateTime() + "A" + str4 + new String(CommonUtil.strCharsetBytes(Const.brokerAppType, 32, Charset.forName("UTF-8")));
        LogFile.log("SmartBrokerAdapter", 3, "erblogin[" + str5 + "]");
        byte[] bArrErbcall = erbAPIs.erbcall("LOGIN".getBytes(), str5.getBytes(), str5.getBytes().length, this.outLen, this.flags);
        try {
            i8 = -1;
        } catch (Exception e8) {
            LogFile.log("SmartBrokerAdapter", 1, "Login Exception");
            e8.printStackTrace();
        }
        if (this.outLen[0] == 0) {
            LogFile.log("SmartBrokerAdapter", 3, "erblogin[ erbcall failed - 로그인 실패[" + phoneNum + "]");
            term();
            i9 = -1;
            if (Const.brokerPushType == 0) {
                term();
            }
            return i9;
        }
        HashMap<String, String> login = ConstructGetPacket.getLogin(bArrErbcall);
        String str6 = login.get("rtn_cd");
        String str7 = login.get("rtn_type");
        int i10 = Integer.parseInt(str6);
        if (i10 == 0) {
            str3 = "Login Suceess";
            i8 = 1;
        } else if (i10 == 6) {
            str3 = "인증되지 않은 기기 입니다. code(" + i10 + ") : " + login.get("rtn_msg");
        } else if (i10 == -5) {
            str3 = "서버 접속에 실패 하였습니다. code(" + i10 + ") : " + login.get("rtn_msg");
        } else if (i10 == -4) {
            str3 = "PUSH Key 등록에 실패 하였습니다. APP을 재실행해 주시기 바랍니다.(" + i10 + ") : " + login.get("rtn_msg");
        } else if (i10 == -2) {
            str3 = "PUSH Library 로그인 처리 실패. code(" + i10 + ") : " + login.get("rtn_msg");
        } else if (i10 < 0) {
            str3 = "서버 연결에 실패 하였습니다. code(" + i10 + ") : " + login.get("rtn_msg");
        } else {
            str3 = "서버에서 로그인 처리에 실패 하였습니다. code(" + i10 + ") : " + login.get("rtn_msg");
        }
        LogFile.log("SmartBrokerAdapter", 2, str3);
        int i11 = Integer.parseInt(str7);
        Const.brokerPushType = i11;
        if (i11 == 0) {
            term();
        }
        return i8;
    }

    public int pushOnOff(String str, String str2, String str3) {
        int iInit;
        if (!isErbBrokerInit() && (iInit = init()) != 1) {
            return iInit;
        }
        int i8 = -1;
        if (!str.equalsIgnoreCase(C0709m.OFF)) {
            int sharedNoData = SharedData.getSharedNoData(this.context, "UserInfo", "PushKeyCount");
            String sharedData = SharedData.getSharedData(this.context, "UserInfo", "PushKeys");
            if (sharedNoData == 0 || sharedData == null) {
                sharedData = SharedData.getSharedData(this.context, "UserInfo", "UserID");
                sharedNoData = 1;
            }
            if (erbAPIs.erbaddregister(sharedData.getBytes(), sharedData.getBytes(), sharedNoData, 32) != 1) {
                return -1;
            }
        }
        this.outLen[0] = this.outBuff.length;
        Flag flag = this.flags;
        flag.flag = 32L;
        flag.timeOut = Const.brokerTimeout;
        LogFile.log("SmartBrokerAdapter", 2, "PUSH_ONOFF [" + str2 + "]");
        String str4 = String.format("%-32s%-128s%-14s%1s%-256s%-32s%1s", str2, str3, Const.DateTime(), "A", Const.getGcmRegID(), Const.brokerAppType, str.equalsIgnoreCase(C0709m.OFF) ? "N" : "Y");
        byte[] bArrErbcall = erbAPIs.erbcall("PUSH_ONOFF".getBytes(), str4.getBytes(), str4.getBytes().length, this.outLen, this.flags);
        if (this.outLen[0] > 0 && ConstructGetPacket.getTRBCallReturnCode(this.context, bArrErbcall).get("rtn_cd").equals("0")) {
            i8 = 0;
        }
        if (Const.brokerPushType == 0 || str.equalsIgnoreCase(C0709m.OFF)) {
            term();
        }
        return i8;
    }

    public int readCheck2(String str, List<MSGVo> list, String str2) {
        int i8 = 0;
        int i9 = 1;
        if (str.equals("")) {
            return -1;
        }
        int size = list.size();
        byte[] bArrStrCharsetBytes = CommonUtil.strCharsetBytes(str, 32, Charset.forName("UTF-8"));
        byte[] bArrStrCharsetBytes2 = CommonUtil.strCharsetBytes(str2, 256, Charset.forName("UTF-8"));
        byte[] bArrStrCharsetBytes3 = CommonUtil.strCharsetBytes("A", 1, Charset.forName("UTF-8"));
        byte[] bArr = new byte[4096];
        int i10 = 0;
        int i11 = 0;
        while (size > 0) {
            int i12 = size <= 100 ? size : 100;
            LogFile.log("SmartBrokerAdapter", 3, "in while readcheck2 - send_count = [" + i12 + "]");
            System.arraycopy(bArrStrCharsetBytes, i8, bArr, i8, bArrStrCharsetBytes.length);
            int length = bArrStrCharsetBytes.length;
            System.arraycopy(bArrStrCharsetBytes3, i8, bArr, length, bArrStrCharsetBytes3.length);
            int length2 = length + bArrStrCharsetBytes3.length;
            System.arraycopy(bArrStrCharsetBytes2, i8, bArr, length2, bArrStrCharsetBytes2.length);
            int length3 = length2 + bArrStrCharsetBytes2.length;
            byte[] bArr2 = new byte[i9];
            bArr2[i8] = (byte) i12;
            System.arraycopy(bArr2, i8, bArr, length3, i9);
            int length4 = length3 + i9;
            int i13 = i8;
            while (i13 < i12) {
                byte[] bArrStrCharsetBytes4 = CommonUtil.strCharsetBytes(list.get(i10).getDate(), 8, Charset.forName("UTF-8"));
                System.arraycopy(bArrStrCharsetBytes4, 0, bArr, length4, bArrStrCharsetBytes4.length);
                int length5 = length4 + bArrStrCharsetBytes4.length;
                byte[] bArrStrCharsetBytes5 = CommonUtil.strCharsetBytes(list.get(i10).getSeq(), list.get(i10).getSeq().length(), Charset.forName("UTF-8"));
                System.arraycopy(bArrStrCharsetBytes5, 0, bArr, length5, bArrStrCharsetBytes5.length);
                length4 = length5 + bArrStrCharsetBytes5.length;
                i10++;
                i13++;
                i9 = 1;
                i8 = 0;
            }
            int i14 = i8;
            int iErbreadcheckex = erbAPIs.erbreadcheckex(bArr, length4, i9);
            LogFile.log("SmartBrokerAdapter", 3, "readcheck2 [" + iErbreadcheckex + "][" + i12 + "][" + size + "]");
            if (iErbreadcheckex != 1) {
                return iErbreadcheckex;
            }
            size -= i12;
            i11 = iErbreadcheckex;
            i9 = 1;
            i8 = i14;
        }
        return i11;
    }

    public int readCheck3(String str, List<MSGVo> list) {
        this.outLen[0] = this.outBuff.length;
        Flag flag = this.flags;
        flag.flag = 32L;
        flag.timeOut = Const.brokerTimeout;
        byte[] bArrStrCharsetBytes = CommonUtil.strCharsetBytes(str, 32, Charset.forName("UTF-8"));
        String str2 = new String(bArrStrCharsetBytes) + String.format(c.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(list.size()));
        LogFile.log("SmartBrokerAdapter", 4, "READCHECK3 : erbCall start id LEN" + bArrStrCharsetBytes.length);
        for (int i8 = 0; i8 < list.size(); i8++) {
            str2 = str2 + (new String(CommonUtil.strCharsetBytes(list.get(i8).getDate(), 8, Charset.forName("UTF-8"))) + new String(CommonUtil.strCharsetBytes(list.get(i8).getSeq(), 10, Charset.forName("UTF-8"))));
        }
        String str3 = (str2 + new String(CommonUtil.strCharsetBytes(Const.getGcmRegID(), 256, Charset.forName("UTF-8")))) + new String(CommonUtil.strCharsetBytes(Const.getUserID(), 24, Charset.forName("UTF-8")));
        LogFile.log("SmartBrokerAdapter", 4, "readCheck3 CallStart[" + str3.toString() + "]");
        byte[] bArrErbcall = erbAPIs.erbcall("READCHECK".getBytes(), str3.getBytes(), str3.getBytes().length, this.outLen, this.flags);
        int readCheckBuff = -1;
        if (this.outLen[0] <= 0) {
            return -1;
        }
        try {
            LogFile.log("SmartBrokerAdapter", 2, "readCheck3 +[" + bArrErbcall.length + "]");
            readCheckBuff = ConstructGetPacket.getReadCheckBuff(bArrErbcall);
            LogFile.log("SmartBrokerAdapter", 2, "readCheck3 Result +[" + readCheckBuff + "]");
            return readCheckBuff;
        } catch (Exception e8) {
            e8.printStackTrace();
            return readCheckBuff;
        }
    }

    public int readcheck(String str, String str2, String str3, String str4) {
        byte[] bArrStrCharsetBytes = CommonUtil.strCharsetBytes(str, 32, Charset.forName("UTF-8"));
        byte[] bArrStrCharsetBytes2 = CommonUtil.strCharsetBytes(str2, 8, Charset.forName("UTF-8"));
        String str5 = new String(bArrStrCharsetBytes) + "A" + new String(CommonUtil.strCharsetBytes(str4, 256, Charset.forName("UTF-8"))) + "" + new String(bArrStrCharsetBytes2) + "" + str3;
        int iErbreadcheck = erbAPIs.erbreadcheck(str5.getBytes(), str5.getBytes().length, 1);
        LogFile.log("SmartBrokerAdapter", 3, "READCHECK call[" + str3 + "]");
        return iErbreadcheck;
    }

    public int receipt(String str, String str2, String str3, String str4) {
        byte[] bArrStrCharsetBytes = CommonUtil.strCharsetBytes(str, 32, Charset.forName("UTF-8"));
        byte[] bArrStrCharsetBytes2 = CommonUtil.strCharsetBytes(str2, 8, Charset.forName("UTF-8"));
        String str5 = new String(bArrStrCharsetBytes) + "A" + new String(CommonUtil.strCharsetBytes(str4, 256, Charset.forName("UTF-8"))) + "" + new String(bArrStrCharsetBytes2) + "" + str3;
        LogFile.log("SmartBrokerAdapter", 4, "[ Receipt ] erbCall Start");
        int iErbreceipt = erbAPIs.erbreceipt(str5.getBytes(), str5.getBytes().length, 1);
        LogFile.log("SmartBrokerAdapter", 4, "[ Receipt ] erbCall End : result [ " + iErbreceipt + " ] ");
        return iErbreceipt;
    }

    public int receipt2(String str, List<MSGVo> list, String str2) {
        int size = list.size();
        byte[] bArrStrCharsetBytes = CommonUtil.strCharsetBytes(str, 32, Charset.forName("UTF-8"));
        byte[] bArrStrCharsetBytes2 = CommonUtil.strCharsetBytes(str2, 256, Charset.forName("UTF-8"));
        int i8 = 1;
        byte[] bArrStrCharsetBytes3 = CommonUtil.strCharsetBytes("A", 1, Charset.forName("UTF-8"));
        byte[] bArr = new byte[4096];
        int i9 = 2;
        LogFile.log("SmartBrokerAdapter", 2, "start receipt2 ");
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (size > 0) {
            int i13 = size <= 100 ? size : 100;
            LogFile.log("SmartBrokerAdapter", i9, "in while receipt2 - send_count = [" + i13 + "]");
            System.arraycopy(bArrStrCharsetBytes, i10, bArr, i10, bArrStrCharsetBytes.length);
            int length = bArrStrCharsetBytes.length;
            System.arraycopy(bArrStrCharsetBytes3, i10, bArr, length, bArrStrCharsetBytes3.length);
            int length2 = length + bArrStrCharsetBytes3.length;
            System.arraycopy(bArrStrCharsetBytes2, i10, bArr, length2, bArrStrCharsetBytes2.length);
            int length3 = length2 + bArrStrCharsetBytes2.length;
            byte[] bArr2 = new byte[i8];
            bArr2[i10] = (byte) i13;
            System.arraycopy(bArr2, i10, bArr, length3, i8);
            int length4 = length3 + i8;
            int i14 = i10;
            while (i14 < i13) {
                byte[] bArrStrCharsetBytes4 = CommonUtil.strCharsetBytes(list.get(i12).getDate(), 8, Charset.forName("UTF-8"));
                System.arraycopy(bArrStrCharsetBytes4, 0, bArr, length4, bArrStrCharsetBytes4.length);
                int length5 = length4 + bArrStrCharsetBytes4.length;
                byte[] bArrStrCharsetBytes5 = CommonUtil.strCharsetBytes(list.get(i12).getSeq(), list.get(i12).getSeq().length(), Charset.forName("UTF-8"));
                System.arraycopy(bArrStrCharsetBytes5, 0, bArr, length5, bArrStrCharsetBytes5.length);
                length4 = length5 + bArrStrCharsetBytes5.length;
                i8 = 1;
                i12++;
                i14++;
                i10 = 0;
            }
            int i15 = i10;
            int iErbreceiptex = erbAPIs.erbreceiptex(bArr, length4, i8);
            LogFile.log("SmartBrokerAdapter", 3, "receipt2 [" + iErbreceiptex + "][" + i13 + "][" + size + "]");
            size -= i13;
            i11 = iErbreceiptex;
            i10 = i15;
            i9 = 2;
        }
        return i11;
    }

    protected ArrayList<MSGVo> recvNewMsg(int i8) {
        this.outLen[0] = this.outBuff.length;
        Flag flag = this.flags;
        flag.flag = 32L;
        flag.timeOut = Const.brokerTimeout;
        String str = new String(CommonUtil.strCharsetBytes(Const.getUserID(), 32, Charset.forName("UTF-8"))) + new String(CommonUtil.strCharsetBytes(Const.getGcmRegID(), 256, Charset.forName("UTF-8"))) + String.format("%05d", Integer.valueOf(i8));
        LogFile.log("SmartBrokerAdapter", 4, "GET_NEW_MSG2 : erbCall start" + str);
        byte[] bArrErbcall = erbAPIs.erbcall("GET_NEW_MSG2".getBytes(), str.getBytes(), str.getBytes().length, this.outLen, this.flags);
        if (this.outLen[0] > 0) {
            try {
                LogFile.log("SmartBrokerAdapter", 4, "GET_NEW_MSG2 : erbCall end [outLen > 0] ");
                return ConstructGetPacket.getMsgData2(this.context, bArrErbcall);
            } catch (Exception e8) {
                LogFile.log("SmartBrokerAdapter", 1, "GET_NEW_MSG2 : Exception  " + e8.getMessage());
            }
        }
        LogFile.log("SmartBrokerAdapter", 4, "GET_NEW_MSG2 : erbCall end [outLen == 0] ");
        return null;
    }

    protected ArrayList<MSGVo> recvNewMsg2(int i8) {
        this.outLen[0] = this.outBuff.length;
        Flag flag = this.flags;
        flag.flag = 32L;
        flag.timeOut = Const.brokerTimeout;
        String str = new String(CommonUtil.strCharsetBytes(Const.getUserID(), 32, Charset.forName("UTF-8"))) + String.format("%05d", Integer.valueOf(i8));
        LogFile.log("SmartBrokerAdapter", 4, "recvNewMsg : erbCall start" + str);
        byte[] bArrErbcall = erbAPIs.erbcall("GET_NEW_MSG".getBytes(), str.getBytes(), str.getBytes().length, this.outLen, this.flags);
        LogFile.log("SmartBrokerAdapter", 4, "recvNewMsg : erbCall end" + str);
        if (this.outLen[0] <= 0) {
            return null;
        }
        try {
            return ConstructGetPacket.getMsgData2(this.context, bArrErbcall);
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public int registPush(String str, String str2) throws NumberFormatException {
        String string;
        if (!erbBrokerInit && init() != 1) {
            return -1;
        }
        String phoneNum = Const.getPhoneNum(this.context);
        this.outLen[0] = this.outBuff.length;
        Flag flag = this.flags;
        flag.flag = 32L;
        flag.timeOut = Const.brokerTimeout;
        String sharedData = str;
        if (sharedData.equals("") || str.isEmpty()) {
            sharedData = SharedData.getSharedData(this.context, "UserInfo", "UserID");
        }
        String str3 = sharedData;
        String str4 = str2;
        if (str4.equals("") || str2.trim() == null) {
            str4 = str3;
        }
        if (str3.equals("") || str3.isEmpty()) {
            term();
            return -6;
        }
        if (Const.getGcmRegID().equals("") || Const.getGcmRegID().isEmpty()) {
            Const.setGcmRegID(SharedData.getSharedData(this.context, "UserInfo", "gcmToken"));
            if (Const.getGcmRegID().equals("") || Const.getGcmRegID().isEmpty()) {
                term();
                return -6;
            }
        }
        String str5 = str4;
        String str6 = String.format("%-32s%-128s%-14s%1s%-256s%-32s%-20s%1s%02d%02d%-2s%-6s%-24s%-2s%-14s%-6s%-4s", str3, str5, Const.DateTime(), "A", Const.getGcmRegID(), Const.brokerAppType, phoneNum, Const.LOGINFLAG, 0, 0, Integer.valueOf(CommonUtil.getSDKVersion()), CommonUtil.getOSVersion(), CommonUtil.getModel(), CommonUtil.getLocaleRegion(this.context), CommonUtil.getBootTime(), CommonUtil.getAppVersion(this.context), CommonUtil.getConnectedNetwork(this.context));
        Const.setUserID(str3);
        LogFile.log("SmartBrokerAdapter", 2, "REGIST_PUSH [" + str6.length() + "]");
        byte[] bArrErbcall = erbAPIs.erbcall("REGIST_PUSH2".getBytes(), str6.getBytes(), str6.getBytes().length, this.outLen, this.flags);
        try {
        } catch (Exception unused) {
            LogFile.log("SmartBrokerAdapter", 1, "REGIST_PUSH Exception");
        }
        if (this.outLen[0] == 0) {
            LogFile.log("SmartBrokerAdapter", 1, "REGIST_PUSH [ erbcall failed - REGIST_PUSH 실패[" + phoneNum + "]");
            term();
            return -1;
        }
        Const.setUserID(str3);
        HashMap<String, String> registPush = ConstructGetPacket.getRegistPush(bArrErbcall);
        String str7 = registPush.get("rtn_cd");
        String str8 = registPush.get("push_type");
        String str9 = registPush.get("log_level");
        int i8 = Integer.parseInt(str7);
        LogFile.log("SmartBrokerAdapter", 2, "registPush: return Code  = " + str7 + "LogLevel" + str9 + "PushType" + str8);
        if (i8 == 0) {
            lastLoginTime = CommonUtil.getTime();
            string = "Login Suceess";
        } else if (i8 == 3) {
            string = "등록된 ID가 존재합니다. code(" + i8 + ") : " + registPush.get("rtn_msg");
        } else if (i8 == 4) {
            string = "만료된 사용자입니다. code(" + i8 + ") : " + registPush.get("rtn_msg");
        } else if (i8 == 5) {
            string = "로그인 실패 .(" + i8 + ") : " + registPush.get("rtn_msg");
        } else if (i8 == 6) {
            string = "인증되지 않은 기기입니다. code(" + i8 + ") : " + registPush.get("rtn_msg");
        } else if (i8 >= 0) {
            string = "로그인 처리에 실패 하였습니다. code(" + i8 + ") : " + registPush.get("rtn_msg");
        } else if (i8 == -2) {
            string = "시간초과 . code(-2) : " + registPush.get("rtn_msg");
            i8 = -2;
        } else if (i8 == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("서비스 실패 . code(");
            i8 = -3;
            sb.append(-3);
            sb.append(") : ");
            sb.append(registPush.get("rtn_msg"));
            string = sb.toString();
        } else {
            string = "로그인 처리에 실패 하였습니다. code(" + i8 + ") : " + registPush.get("rtn_msg");
        }
        LogFile.log("SmartBrokerAdapter", 1, string);
        if (i8 != 0) {
            term();
            return i8;
        }
        String strTrim = str8.trim();
        if (strTrim.equals("")) {
            Const.brokerPushType = 0;
        } else {
            Const.brokerPushType = Integer.parseInt(strTrim);
        }
        SharedData.setSharedNoData(this.context, "UserInfo", "PushType", Const.brokerPushType);
        String strTrim2 = str9.trim();
        if (strTrim2.equals("")) {
            Const.logLevel = 0;
        } else {
            Const.logLevel = Integer.parseInt(strTrim2);
        }
        if (Const.brokerPushType == 0) {
            term();
        }
        SharedData.setSharedData(this.context, "UserInfo", "UserID", str3);
        SharedData.setSharedData(this.context, "UserInfo", "UserPW", str5);
        SharedData.setSharedNoData(this.context, "noticeEnv", "logLevel", Const.logLevel);
        LogFile.log("SmartBrokerAdapter", 1, "REGIST_PUSH Success");
        return i8;
    }

    public int setLogout(String str) {
        int iInit;
        if (!isErbBrokerInit() && (iInit = init()) != 1) {
            return iInit;
        }
        if (str.equals("")) {
            str = SharedData.getSharedData(this.context, "UserInfo", "UserID");
        }
        String str2 = str;
        this.outLen[0] = this.outBuff.length;
        Flag flag = this.flags;
        flag.flag = 32L;
        flag.timeOut = Const.brokerTimeout;
        LogFile.log("SmartBrokerAdapter", 2, "LOGOUT [" + Const.getGcmRegID() + "]");
        String str3 = String.format("%-3s%-32s%-14s%1s%-256s%-32s", "032", str2, Const.DateTimeTimeStamp(), "A", Const.getGcmRegID(), Const.brokerAppType);
        byte[] bArrErbcall = erbAPIs.erbcall("LOGOUT".getBytes(), str3.getBytes(), str3.getBytes().length, this.outLen, this.flags);
        LogFile.log("SmartBrokerAdapter", 2, "LOGOUT End rtn " + this.outLen[0]);
        if (this.outLen[0] <= 0) {
            return -1;
        }
        HashMap<String, String> tRBCallReturnCode = ConstructGetPacket.getTRBCallReturnCode(this.context, bArrErbcall);
        String str4 = tRBCallReturnCode.get("rtn_cd");
        if (str4.equals("0")) {
            LogFile.log("SmartBrokerAdapter", 3, "logout : sucess ");
            return 0;
        }
        LogFile.log("SmartBrokerAdapter", 2, "setLogout Failed: " + tRBCallReturnCode.get("rtn_msg"));
        return Integer.valueOf(str4).intValue();
    }

    public void setPushReceiver(PushReceiver pushReceiver) {
        this.pushReceiver = pushReceiver;
    }

    public int term() {
        erbBrokerInit = false;
        LogFile.log("SmartBrokerAdapter", 2, "erbterm Start");
        int iErbterm = erbAPIs.erbterm();
        LogFile.log("SmartBrokerAdapter", 4, "erbterm End result [" + iErbterm + "]");
        return iErbterm;
    }

    public void termPush() {
        LogFile.log("SmartBrokerAdapter", 2, "termPush");
        erbStop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v15, types: [com.h2osystech.smartalimi.servicealimimodule.PushReceiver] */
    /* JADX WARN: Type inference failed for: r12v18, types: [com.h2osystech.smartalimi.servicealimimodule.PushReceiver] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.h2osystech.smartalimi.servicealimimodule.PushReceiver] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // java.util.Observer
    public void update(Observable observable, Object obj) throws Throwable {
        byte[] bArr;
        String str;
        String str2;
        boolean z8;
        ?? r12;
        String str3;
        boolean z9;
        boolean zEquals;
        String str4 = "update Token is diff";
        if (obj == null) {
            return;
        }
        if (!(obj instanceof SparseArray)) {
            LogFile.log("SmartBrokerAdapter", 2, "update() : Unknown instance type");
            return;
        }
        SparseArray<Object> sparseArray = (SparseArray) obj;
        this.arrays = sparseArray;
        int iKeyAt = sparseArray.keyAt(0);
        LogFile.log("SmartBrokerAdapter", 3, "key = " + iKeyAt);
        if (iKeyAt != 1) {
            if (iKeyAt != 16) {
                return;
            }
            LogFile.log("SmartBrokerAdapter", 1, "ERBAPIs.NETCLOSE");
            erbBrokerInit = false;
            term();
            lastDisconnectTime = CommonUtil.getTime();
            if (NetworkStatusReceiver.isOnline(this.context) == 1) {
                this.pushReceiver.OnReconnect();
                return;
            }
            return;
        }
        try {
            LogFile.log("SmartBrokerAdapter", 3, "ERBAPIs.EVENTMSG");
            EventData eventData = (EventData) this.arrays.get(iKeyAt);
            if (eventData == null || (bArr = eventData.flag) == null) {
                return;
            }
            byte b9 = bArr[0];
            LogFile.log("SmartBrokerAdapter", 2, "ERBAPIs.EVENTMSG.: Flag = " + ((int) b9));
            int i8 = b9 & 128;
            int i9 = b9 & 32;
            if ((b9 & 4) == 4) {
                LogFile.log("SmartBrokerAdapter", 1, "update: Evdata");
                this.pushReceiver.OnReceiveEvData(ConstructGetPacket.getMsgVoData_EV(this.context, eventData.data));
                return;
            }
            ?? r62 = 32;
            if (i9 == 32) {
                if (128 == i8) {
                    MSGVo msgVoData2 = ConstructGetPacket.getMsgVoData2(this.context, eventData.data);
                    PushReceiver pushReceiver = this.pushReceiver;
                    if (pushReceiver != null) {
                        pushReceiver.OnReceiveDup(msgVoData2);
                        return;
                    } else {
                        LogFile.log("SmartBrokerAdapter", 1, "ERBAPIs.EVENTMSG : OnReceiveDup is NULL");
                        return;
                    }
                }
                if (i9 == 32) {
                    MSGVo msgVoData22 = ConstructGetPacket.getMsgVoData2(this.context, eventData.data);
                    PushReceiver pushReceiver2 = this.pushReceiver;
                    if (pushReceiver2 != null) {
                        pushReceiver2.OnReceiveProc(msgVoData22);
                        return;
                    } else {
                        LogFile.log("SmartBrokerAdapter", 1, "ERBAPIs.EVENTMSG : pushReceiver is NULL");
                        return;
                    }
                }
                return;
            }
            ?? str5 = this.pushReceiver;
            if (str5 == 0) {
                LogFile.log("SmartBrokerAdapter", 1, "ERBAPIs.EVENTMSG.Error : pushReceiver is NULL");
                return;
            }
            try {
                LogFile.log("SmartBrokerAdapter", 1, "ERBAPIs.EVENTMSG.: pushReceiver");
                try {
                    str5 = new String(eventData.data, 0, 255, "UTF-8");
                } catch (Exception unused) {
                    str5 = "";
                    str = str5;
                } catch (Throwable th) {
                    th = th;
                    str5 = "";
                    r62 = str5;
                }
                try {
                    byte[] bArr2 = eventData.data;
                    str = new String(bArr2, 256, bArr2.length - 256, Const.EUCENCODING);
                } catch (Exception unused2) {
                    str = "";
                } catch (Throwable th2) {
                    th = th2;
                    r62 = "";
                    if (str5.equals("")) {
                        LogFile.log("SmartBrokerAdapter", 1, str4);
                    } else {
                        this.pushReceiver.OnDisConnected(r62);
                    }
                    throw th;
                }
                try {
                    zEquals = str5.equals(new String(CommonUtil.strCharsetBytes(Const.getGcmRegID(), 256, Charset.forName("UTF-8")), 0, 255, "UTF-8"));
                    z8 = str5;
                    str2 = str;
                } catch (Exception unused3) {
                    LogFile.log("SmartBrokerAdapter", 1, "DisconnError ");
                    boolean zEquals2 = str5.equals("");
                    z8 = str5;
                    str2 = str;
                    if (!zEquals2) {
                        z9 = str5;
                        str3 = str;
                        r12 = this.pushReceiver;
                        r12.OnDisConnected(str3);
                        str5 = z9;
                        r62 = str3;
                        str4 = r12;
                    }
                    LogFile.log("SmartBrokerAdapter", 1, "update Token is diff");
                    str5 = z8;
                    r62 = str2;
                    str4 = str4;
                }
                if (!zEquals) {
                    z9 = str5;
                    str3 = str;
                    r12 = this.pushReceiver;
                    r12.OnDisConnected(str3);
                    str5 = z9;
                    r62 = str3;
                    str4 = r12;
                }
                LogFile.log("SmartBrokerAdapter", 1, "update Token is diff");
                str5 = z8;
                r62 = str2;
                str4 = str4;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (NullPointerException e8) {
            LogFile.log("SmartBrokerAdapter", 1, "Null Error : \n" + e8.getMessage());
        }
    }

    public int wakeErbBroker() {
        LogFile.log("SmartBrokerAdapter", 3, "wakeErbBroker");
        return erbAPIs.erbSessionCheck();
    }

    public int init() {
        erbBrokerInit = false;
        if (Const.getUserID().equals("")) {
            Const.setUserID(SharedData.getSharedData(this.context, "UserInfo", "UserID"));
        }
        if (Const.brokerIP.equals("")) {
            Const.brokerIP = SharedData.getSharedData(this.context, "noticeEnv", "ipaddress");
        }
        if (Const.brokerPort == 0) {
            String sharedData = SharedData.getSharedData(this.context, "noticeEnv", "port");
            if (!sharedData.equals("")) {
                Const.brokerPort = Integer.valueOf(sharedData).intValue();
            }
        }
        if (Const.brokerAppType.equals("")) {
            Const.brokerAppType = SharedData.getSharedData(this.context, "noticeEnv", "AppType");
        }
        if (!Const.brokerIP.equals("") && Const.brokerPort != 0 && !Const.brokerAppType.equals("")) {
            LogFile.log("SmartBrokerAdapter", 3, "Before Init  Info [" + Const.brokerIP + "] [" + Const.brokerPort + "][" + Const.userID + "]");
            int iErbinit = erbAPIs.erbinit(Const.brokerIP.getBytes(), Const.brokerPort, Const.getUserID().getBytes(), Const.brokerInitTimeout);
            StringBuilder sb = new StringBuilder();
            sb.append("init END[");
            sb.append(iErbinit);
            sb.append("]");
            LogFile.log("SmartBrokerAdapter", 3, sb.toString());
            erbBrokerInit = true;
            if (iErbinit == 1 && NetworkStatusReceiver.isOnline(this.context) == 1) {
                if (wakeErbBroker() == 1) {
                    erbBrokerInit = true;
                } else {
                    term();
                    iErbinit = erbAPIs.erbinit(Const.brokerIP.getBytes(), Const.brokerPort, Const.getUserID().getBytes(), Const.brokerTimeout);
                    if (iErbinit == 1) {
                        erbBrokerInit = true;
                    } else {
                        erbBrokerInit = false;
                    }
                }
                return iErbinit;
            }
            term();
            return iErbinit;
        }
        LogFile.log("SmartBrokerAdapter", 2, " Init : Null Return" + Const.brokerIP + "//" + Const.brokerPort + "//" + Const.brokerAppType + "//");
        return -5;
    }

    public int erbaddregister(String str, String str2) {
        int iErbdelregister;
        if (str2.length() <= 32 && str.length() <= 24) {
            if (!Const.addEventKey.equals("") && !Const.addGubunKey.equals("") && (iErbdelregister = erbdelregister(Const.addGubunKey, Const.addEventKey)) != 0) {
                LogFile.log("SmartBrokerAdapter", 1, "erbaddregister:  before EventKey Delete Fail rtn = " + iErbdelregister + "gubun key = " + Const.addGubunKey + "evKey = " + Const.addEventKey);
                return -6;
            }
            Const.addEventKey = str2;
            Const.addGubunKey = str;
            if (erbAPIs.erbaddregister(str.getBytes(), str2.getBytes(), 1, 32) != 1) {
                LogFile.log("SmartBrokerAdapter", 1, "erbaddregister:  addRegi Fail rtn = gubun key = " + Const.addGubunKey + "evKey = " + Const.addEventKey);
                return -4;
            }
            LogFile.log("SmartBrokerAdapter", 1, "erbaddregister:  Add Success!!!");
            return 0;
        }
        LogFile.log("SmartBrokerAdapter", 1, "Addregist Fail Key Len or eventKey null");
        return -6;
    }
}

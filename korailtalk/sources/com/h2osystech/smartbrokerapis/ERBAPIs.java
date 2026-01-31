package com.h2osystech.smartbrokerapis;

import Q7.X;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import com.h2osystech.smartalimi.common.Const;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Observable;

/* loaded from: classes2.dex */
public class ERBAPIs extends Observable {
    public static final int EMPTY = 0;
    public static final int EVENTCLOSE = 4;
    public static final int EVENTDISCONNECT = 5;
    public static final int EVENTMSG = 1;
    public static final int FLAG_EVENT_COMPRESS = 1;
    public static final int FLAG_EVENT_ENCRYPT = 2;
    public static final int FLAG_EVENT_IDENTIFY = 8;
    public static final int FLAG_EVENT_LONG_PK = 16;
    public static final int FLAG_EVENT_RECEIPT = 32;
    public static final int NETCLOSE = 16;
    String msgnum;
    private SparseArray<Object> m_array = new SparseArray<>();
    private final int SERVICECODE_SIZE = 32;
    private final int MSGHEADER_SIZE = 42;
    private final int LOGIN_INDATA_SIZE = 321;
    private final int LOGOUT_INDATA_SIZE = 321;
    private final int MSGCHECK_INDATA_SIZE = 294;
    private final int OUTDATA_SIZE = 4096;
    private final int CNT_SIZE = 5;
    private final int MSGIDX_SIZE = 18;
    private final int TYPE_SIZE = 4;
    private final int MSG_LEN_SIZE = 10;
    private final int RTN_CD_SIZE = 1;
    private final int RTN_MSG_SIZE = 80;
    private final int ID_SIZE = 32;
    private final int PW_SIZE = 32;
    private final int OSTYPE_SIZE = 1;
    private final int REGID_SIZE = 256;
    private final int MSGCOUNT_SIZE = 5;
    private final int HDATE_SIZE = 8;
    private final int HSEQ_SIZE = 10;
    private final int HSUBSEQ_SIZE = 5;
    private final int HMSGLEN_SIZE = 10;
    private final int HTEMP_SIZE = 4;

    static {
        System.loadLibrary("erb");
    }

    private native int ERBAddRegister(byte[] bArr, byte[] bArr2, int i8, int i9);

    private native byte[] ERBCall(byte[] bArr, byte[] bArr2, int i8, int[] iArr, Flag flag);

    private native byte[] ERBCheck(byte[] bArr, int i8, byte[] bArr2, int[] iArr);

    private native int ERBDelRegister(byte[] bArr, byte[] bArr2, int i8, int i9);

    private native int ERBGetMsg(EventData eventData);

    private native int ERBInit(byte[] bArr, int i8, byte[] bArr2, int i9);

    private native int ERBReadcheck(byte[] bArr, int i8, int i9);

    private native int ERBReadcheckEx(byte[] bArr, int i8, int i9);

    private native int ERBReceipt(byte[] bArr, int i8, int i9);

    private native int ERBReceiptEx(byte[] bArr, int i8, int i9);

    private native int ERBRmRegister();

    private native int ERBSend(byte[] bArr, int i8, byte[] bArr2, int i9, byte[] bArr3, int i10, Flag flag);

    private native int ERBSessionCheck();

    private native int ERBSetChecktime(int i8);

    private native int ERBTerm();

    private int Login(String str, String str2, String str3, int i8) {
        Flag flag = new Flag();
        StringBuffer stringBuffer = new StringBuffer();
        byte[] bArr = new byte[1];
        byte[] bytes = "LOGIN".getBytes();
        stringBuffer.append(X.leftPad("" + str.getBytes().length, 3, "0"));
        stringBuffer.append(str);
        stringBuffer.append(X.leftPad("", 14, ""));
        stringBuffer.append("A");
        stringBuffer.append(X.rightPad(str2, 256, ""));
        stringBuffer.append(X.rightPad(str3, 32, ""));
        stringBuffer.append(X.rightPad("1.1.0", 6, ""));
        stringBuffer.append(X.rightPad(Build.VERSION.RELEASE, 6, ""));
        flag.timeOut = i8;
        flag.flag = 32L;
        byte[] bytes2 = stringBuffer.toString().getBytes();
        int[] iArr = {4096};
        byte[] bArrErbcall = erbcall(bytes, bytes2, bytes2.length, iArr, flag);
        if (iArr[0] <= 0 || bArrErbcall == null || bArrErbcall.length <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("erbcall Fail outLen = ");
            sb.append(iArr[0]);
            return -1;
        }
        try {
            System.arraycopy(bArrErbcall, 32, bArr, 0, 1);
            return Integer.parseInt(new String(bArr));
        } catch (Exception e8) {
            Log.e("ERBAPIs", "" + e8.toString());
            return -2;
        }
    }

    private int Logout(String str, String str2, String str3, int i8) {
        Flag flag = new Flag();
        StringBuffer stringBuffer = new StringBuffer();
        byte[] bArr = new byte[1];
        byte[] bytes = "LOGOUT".getBytes();
        stringBuffer.append(X.leftPad("" + str.getBytes().length, 3, "0"));
        stringBuffer.append(str);
        stringBuffer.append(X.leftPad("", 14, ""));
        stringBuffer.append("A");
        stringBuffer.append(X.rightPad(str2, 256, ""));
        stringBuffer.append(X.rightPad(str3, 32, ""));
        flag.timeOut = i8;
        flag.flag = 32L;
        byte[] bytes2 = stringBuffer.toString().getBytes();
        int[] iArr = {4096};
        byte[] bArrErbcall = erbcall(bytes, bytes2, bytes2.length, iArr, flag);
        if (iArr[0] <= 0 || bArrErbcall == null || bArrErbcall.length <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("erbcall Fail outLen = ");
            sb.append(iArr[0]);
            return -1;
        }
        try {
            System.arraycopy(bArrErbcall, 32, bArr, 0, 1);
            return Integer.parseInt(new String(bArr));
        } catch (Exception e8) {
            Log.e("ERBAPIs", "" + e8.toString());
            return -2;
        }
    }

    private byte[] MsgCheck(String str, String str2, String str3, Flag flag) {
        int[] iArr = {4096};
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(X.rightPad(str, 32, ""));
        stringBuffer.append(X.rightPad(str2, 32, ""));
        stringBuffer.append("A");
        stringBuffer.append(X.rightPad(str3, 256, ""));
        stringBuffer.append("00100");
        byte[] bArrErbcall = erbcall("MESSAGE".getBytes(), stringBuffer.toString().getBytes(), stringBuffer.toString().getBytes().length, iArr, flag);
        if (iArr[0] > 0 && bArrErbcall != null && bArrErbcall.length > 0) {
            return bArrErbcall;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("erbcall Fail outLen = ");
        sb.append(iArr[0]);
        return "MsgCheck Fail".getBytes();
    }

    private byte[] erbCheck(String str, int i8, String str2, String str3, String str4, int[] iArr) throws NumberFormatException {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("GET ");
        stringBuffer.append(str2);
        stringBuffer.append("?ID=");
        stringBuffer.append(str3);
        stringBuffer.append("&token=");
        stringBuffer.append(str4);
        stringBuffer.append(" HTTP/1.1\\x0d\\x0a");
        byte[] bArrERBCheck = ERBCheck(str.getBytes(), i8, stringBuffer.toString().getBytes(), iArr);
        String str5 = null;
        if (bArrERBCheck.length <= 0) {
            return null;
        }
        try {
            str5 = new String(bArrERBCheck, Const.EUCENCODING);
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
        }
        int iIndexOf = str5.indexOf("Content-Length:");
        int i9 = Integer.parseInt(new String(bArrERBCheck, iIndexOf + 16, 2).replaceAll("\\p{Space}", ""));
        byte[] bArr = new byte[i9];
        System.arraycopy(bArrERBCheck, iIndexOf + 21, bArr, 0, i9);
        iArr[0] = i9;
        return bArr;
    }

    private int erbgetmsg(EventData eventData) {
        return ERBGetMsg(eventData);
    }

    private int erbsend(byte[] bArr, int i8, byte[] bArr2, int i9, byte[] bArr3, int i10, Flag flag) {
        return ERBSend(bArr, i8, bArr2, i9, bArr3, i10, flag);
    }

    private void eventClose() {
        this.m_array.clear();
        this.m_array.put(4, null);
        setChanged();
        notifyObservers(this.m_array);
    }

    private void eventDisconnect(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("eventDisconnect() :");
        sb.append(str);
        this.m_array.clear();
        this.m_array.put(5, str);
        setChanged();
        notifyObservers(this.m_array);
    }

    private void getMessage() {
        EventData eventData = new EventData();
        while (erbgetmsg(eventData) > 0) {
            this.m_array.clear();
            this.m_array.put(1, eventData);
            setChanged();
            notifyObservers(this.m_array);
        }
    }

    private int getMsgCnt(String str, String str2, int i8) {
        Flag flag = new Flag();
        StringBuffer stringBuffer = new StringBuffer();
        flag.flag = 32L;
        flag.timeOut = i8;
        stringBuffer.append(X.rightPad(str, 32, ""));
        stringBuffer.append(X.rightPad(str2, 32, ""));
        try {
            int iIntValue = Integer.valueOf(new String(erbcall("GET_NEW_MSG_CNT".getBytes(), stringBuffer.toString().getBytes(), stringBuffer.toString().getBytes().length, new int[]{1024}, flag)).substring(113, 118)).intValue();
            if (iIntValue > 10) {
                return 10;
            }
            return iIntValue;
        } catch (Exception e8) {
            Log.e("ERBAPIs", "" + e8.toString());
            return 0;
        }
    }

    private int getNewMsg(String str, int i8, int i9, byte[] bArr) {
        Flag flag = new Flag();
        int[] iArr = {1024};
        StringBuffer stringBuffer = new StringBuffer();
        flag.flag = 32L;
        flag.timeOut = i9;
        stringBuffer.append(X.rightPad(str, 32, ""));
        stringBuffer.append(X.leftPad("" + i8, 5, "0"));
        byte[] bArrErbcall = erbcall("GET_NEW_MSG".getBytes(), stringBuffer.toString().getBytes(), stringBuffer.toString().getBytes().length, iArr, flag);
        int i10 = iArr[0];
        if (i10 <= 0) {
            return -1;
        }
        System.arraycopy(bArrErbcall, 0, new byte[i10], 0, i10);
        return 1;
    }

    private void netClose() {
        this.m_array.clear();
        this.m_array.put(16, null);
        setChanged();
        notifyObservers(this.m_array);
    }

    public int erbSessionCheck() {
        return ERBSessionCheck();
    }

    public int erbSetChecktime(int i8) {
        return ERBSetChecktime(i8);
    }

    public int erbaddregister(byte[] bArr, byte[] bArr2, int i8, int i9) {
        return ERBAddRegister(bArr, bArr2, i8, i9);
    }

    public byte[] erbcall(byte[] bArr, byte[] bArr2, int i8, int[] iArr, Flag flag) {
        byte[] bArrERBCall = ERBCall(bArr, bArr2, i8, iArr, flag);
        if (iArr[0] <= 0 || bArrERBCall == null || bArrERBCall.length <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("erbcall Fail outLen = ");
            sb.append(iArr[0]);
        }
        return bArrERBCall;
    }

    public int erbdelregister(byte[] bArr, byte[] bArr2, int i8, int i9) {
        return ERBDelRegister(bArr, bArr2, i8, i9);
    }

    public int erbinit(byte[] bArr, int i8, byte[] bArr2, int i9) {
        return ERBInit(bArr, i8, bArr2, i9);
    }

    public int erbreadcheck(byte[] bArr, int i8, int i9) {
        return ERBReadcheck(bArr, i8, i9);
    }

    public int erbreadcheckex(byte[] bArr, int i8, int i9) {
        return ERBReadcheckEx(bArr, i8, i9);
    }

    public int erbreceipt(byte[] bArr, int i8, int i9) {
        return ERBReceipt(bArr, i8, i9);
    }

    public int erbreceiptex(byte[] bArr, int i8, int i9) {
        return ERBReceiptEx(bArr, i8, i9);
    }

    public int erbrmregister() {
        return ERBRmRegister();
    }

    public int erbterm() {
        return ERBTerm();
    }

    public int pushGetMsg(String str, int i8, String str2, String str3, int i9, GetMsgData getMsgData) throws NumberFormatException {
        Flag flag = new Flag();
        int[] iArr = {1024};
        if (str == null || str2 == null) {
            return -1;
        }
        if (i8 <= 0) {
            return -2;
        }
        int iErbinit = erbinit(str.getBytes(), i8, str2.getBytes(), i9);
        if (iErbinit <= 0) {
            return -3;
        }
        StringBuffer stringBuffer = new StringBuffer();
        flag.flag = 32L;
        flag.timeOut = i9;
        stringBuffer.append(X.rightPad(str2, 32, ""));
        stringBuffer.append(X.leftPad("1", 5, "0"));
        stringBuffer.append(X.rightPad(str3, 32, ""));
        byte[] bArrErbcall = erbcall("GET_NEW_MSG".getBytes(), stringBuffer.toString().getBytes(), stringBuffer.toString().getBytes().length, iArr, flag);
        if (iArr[0] <= 0) {
            erbterm();
            return iErbinit;
        }
        byte[] bArr = new byte[1];
        System.arraycopy(bArrErbcall, 32, bArr, 0, 1);
        int i10 = Integer.parseInt(new String(bArr));
        if (i10 != 0) {
            getMsgData.rtnMsg = null;
            getMsgData.rtnLen = 0;
            erbterm();
            return i10;
        }
        byte[] bArr2 = new byte[18];
        byte[] bArr3 = new byte[10];
        System.arraycopy(bArrErbcall, 118, bArr2, 0, 18);
        System.arraycopy(bArrErbcall, 140, bArr3, 0, 10);
        int i11 = Integer.parseInt(new String(bArr3));
        byte[] bArr4 = new byte[i11];
        System.arraycopy(bArrErbcall, 150, bArr4, 0, i11);
        try {
            getMsgData.rtnMsg = new String(bArr4, "utf-8");
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
        }
        getMsgData.rtnLen = i11;
        getMsgData.rtnMsgIdx = new String(bArr2);
        erbterm();
        return 1;
    }

    public int pushReadCheck(String str, int i8, String str2, String str3, int i9) {
        if (str == null || str2 == null || str3 == null || i8 <= 0) {
            return -1;
        }
        if (erbinit(str.getBytes(), i8, str2.getBytes(), i9) <= 0) {
            return -2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(X.rightPad(str2, 32, ""));
        stringBuffer.append("A");
        stringBuffer.append(X.rightPad("", 256, ""));
        stringBuffer.append(str3);
        if (erbreadcheck(stringBuffer.toString().getBytes(), stringBuffer.toString().getBytes().length, 1) <= 0) {
            return -3;
        }
        erbterm();
        return 1;
    }

    public int pushReceipt(String str, int i8, String str2, String str3, int i9) {
        if (str == null || str2 == null || str3 == null || i8 <= 0) {
            return -1;
        }
        if (erbinit(str.getBytes(), i8, str2.getBytes(), i9) <= 0) {
            return -2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(X.rightPad(str2, 32, ""));
        stringBuffer.append("A");
        stringBuffer.append(X.rightPad("", 256, ""));
        stringBuffer.append(str3);
        if (erbreceipt(stringBuffer.toString().getBytes(), stringBuffer.toString().getBytes().length, 1) <= 0) {
            return -3;
        }
        erbterm();
        return 1;
    }

    public int pushRegist(String str, int i8, String str2, String str3, String str4, int i9) {
        if (str == null || str2 == null || str3 == null || i8 <= 0) {
            return -1;
        }
        if (erbinit(str.getBytes(), i8, str2.getBytes(), i9) <= 0) {
            return -2;
        }
        if (Login(str2, str3, str4, i9 + 10) < 0) {
            erbterm();
            return -3;
        }
        erbterm();
        return 1;
    }

    public int pushUnRegist(String str, int i8, String str2, String str3, String str4, int i9) {
        if (str == null || str2 == null || str3 == null || i8 <= 0) {
            return -1;
        }
        if (erbinit(str.getBytes(), i8, str2.getBytes(), i9) <= 0) {
            return -2;
        }
        if (Logout(str2, str3, str4, i9 + 10) < 0) {
            erbterm();
            return -3;
        }
        erbterm();
        return 1;
    }

    public int pushGetMsg(String str, int i8, String str2, String str3, String str4, int i9, GetMsgData getMsgData) throws NumberFormatException {
        Flag flag = new Flag();
        int[] iArr = {1024};
        if (str != null && str2 != null) {
            if (i8 <= 0 || str4.length() != 18) {
                return -2;
            }
            int iErbinit = erbinit(str.getBytes(), i8, str2.getBytes(), i9);
            if (iErbinit <= 0) {
                return -3;
            }
            StringBuffer stringBuffer = new StringBuffer();
            flag.flag = 32L;
            flag.timeOut = i9;
            stringBuffer.append(X.rightPad(str2, 32, ""));
            stringBuffer.append(X.leftPad("1", 5, "0"));
            stringBuffer.append(X.rightPad(str3, 32, ""));
            stringBuffer.append(str4);
            byte[] bArrErbcall = erbcall("GET_NEW_MSG_SEQ".getBytes(), stringBuffer.toString().getBytes(), stringBuffer.toString().getBytes().length, iArr, flag);
            if (iArr[0] <= 0) {
                erbterm();
                return iErbinit;
            }
            try {
                byte[] bArr = new byte[1];
                System.arraycopy(bArrErbcall, 32, bArr, 0, 1);
                int i10 = Integer.parseInt(new String(bArr));
                if (i10 == 0) {
                    byte[] bArr2 = new byte[18];
                    byte[] bArr3 = new byte[10];
                    System.arraycopy(bArrErbcall, 118, bArr2, 0, 18);
                    System.arraycopy(bArrErbcall, 140, bArr3, 0, 10);
                    int i11 = Integer.parseInt(new String(bArr3));
                    byte[] bArr4 = new byte[i11];
                    System.arraycopy(bArrErbcall, 150, bArr4, 0, i11);
                    try {
                        getMsgData.rtnMsg = new String(bArr4, "utf-8");
                    } catch (UnsupportedEncodingException e8) {
                        e8.printStackTrace();
                    }
                    getMsgData.rtnLen = i11;
                    getMsgData.rtnMsgIdx = new String(bArr2);
                    erbterm();
                    return 1;
                }
                getMsgData.rtnMsg = null;
                getMsgData.rtnLen = 0;
                erbterm();
                return i10;
            } catch (Exception unused) {
                erbterm();
            }
        }
        return -1;
    }

    public int pushGetMsg(String str, int i8, String str2, String str3, int i9, ArrayList<GetMsgData> arrayList) throws NumberFormatException {
        Flag flag = new Flag();
        int[] iArr = {1024};
        if (str == null || str2 == null) {
            return -1;
        }
        if (i8 <= 0) {
            return -2;
        }
        if (erbinit(str.getBytes(), i8, str2.getBytes(), i9) <= 0) {
            return -3;
        }
        int msgCnt = getMsgCnt(str2, str3, i9);
        if (msgCnt <= 0) {
            erbterm();
            return 0;
        }
        StringBuffer stringBuffer = new StringBuffer();
        flag.flag = 32L;
        flag.timeOut = i9;
        stringBuffer.append(X.rightPad(str2, 32, ""));
        stringBuffer.append(X.leftPad("" + msgCnt, 5, "0"));
        stringBuffer.append(X.rightPad(str3, 32, ""));
        byte[] bArrErbcall = erbcall("GET_NEW_MSG".getBytes(), stringBuffer.toString().getBytes(), stringBuffer.toString().getBytes().length, iArr, flag);
        if (iArr[0] <= 0) {
            erbterm();
            return msgCnt;
        }
        byte[] bArr = new byte[1];
        System.arraycopy(bArrErbcall, 32, bArr, 0, 1);
        if (Integer.parseInt(new String(bArr)) == 0) {
            int i10 = 18;
            byte[] bArr2 = new byte[18];
            byte[] bArr3 = new byte[10];
            byte[] bArr4 = new byte[5];
            System.arraycopy(bArrErbcall, 113, bArr4, 0, 5);
            int i11 = Integer.parseInt(new String(bArr4));
            int i12 = 118;
            int i13 = 0;
            int i14 = 0;
            while (i13 < i11) {
                GetMsgData getMsgData = new GetMsgData();
                System.arraycopy(bArrErbcall, i12, bArr2, 0, i10);
                System.arraycopy(bArrErbcall, i12 + 22, bArr3, 0, 10);
                int i15 = i12 + 32;
                int i16 = Integer.parseInt(new String(bArr3));
                byte[] bArr5 = new byte[i16];
                System.arraycopy(bArrErbcall, i15, bArr5, 0, i16);
                int i17 = i15 + i16;
                try {
                    getMsgData.rtnMsg = new String(bArr5, "utf-8");
                } catch (UnsupportedEncodingException e8) {
                    e8.printStackTrace();
                }
                getMsgData.rtnLen = i16;
                getMsgData.rtnMsgIdx = new String(bArr2);
                arrayList.add(getMsgData);
                i14++;
                i13++;
                i12 = i17;
                i10 = 18;
            }
            erbterm();
            return i14;
        }
        erbterm();
        return -5;
    }
}

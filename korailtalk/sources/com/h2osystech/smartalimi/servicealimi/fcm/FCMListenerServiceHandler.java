package com.h2osystech.smartalimi.servicealimi.fcm;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.z;
import com.h2osystech.smartalimi.aidllib.MSGVo;
import com.h2osystech.smartalimi.common.Const;
import com.h2osystech.smartalimi.common.LogFile;
import com.h2osystech.smartalimi.servicealimi.AlimiInterface;
import com.h2osystech.smartalimi.servicealimi.NetworkStatusReceiver;
import com.h2osystech.smartalimi.servicealimimodule.SharedData;
import java.util.Map;

/* loaded from: classes2.dex */
public class FCMListenerServiceHandler extends FirebaseMessagingService {
    private static AlimiInterface alimiInterface = null;
    private static String messageLock = "msgLock";
    private final String TAG = "FCMListenerServiceHandler";

    public MSGVo getParseFCMPayload(z zVar) {
        MSGVo mSGVo = new MSGVo();
        try {
            LogFile.log("FCMListenerServiceHandler", 5, "PayloadParse \n" + zVar.getData().toString());
            Map<String, String> data = zVar.getData();
            String str = data.get("Subject");
            String str2 = data.get("Content");
            String str3 = data.get("Date");
            String str4 = data.get("Seq");
            String str5 = data.get("TimeStamp");
            String str6 = data.get("SenderID");
            String str7 = data.get("Param");
            if (str != null && str4 != null && str3 != null && str5 != null) {
                mSGVo.setUniqSeq(str3.trim() + str4.trim() + str5.trim());
                mSGVo.setTitle(str);
                mSGVo.setContent(str2);
                mSGVo.setDate(str3);
                mSGVo.setSeq(str4);
                mSGVo.setTimeStamp(str5);
                mSGVo.setSender(str6);
                mSGVo.setParam(str7);
                mSGVo.setReceiveTime(String.valueOf(System.currentTimeMillis()));
                String str8 = data.get("MsgType");
                String str9 = data.get("BizName");
                mSGVo.setReceiver(str8);
                mSGVo.setTaskName(str9);
                return mSGVo;
            }
            LogFile.log("FCMListenerServiceHandler", 5, "Payload is Null \n");
            return null;
        } catch (Exception e8) {
            e8.getStackTrace();
            LogFile.log("FCMListenerServiceHandler", 5, "Payload is Null \n" + e8.getMessage());
            return null;
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(z zVar) throws NumberFormatException {
        LogFile.log("FCMListenerServiceHandler", 4, "onMessageReceived: IN Data");
        StringBuilder sb = new StringBuilder();
        sb.append("FCM payload 데이터 ");
        sb.append(zVar.getData().toString());
        zVar.getData();
        if (alimiInterface == null) {
            alimiInterface = new AlimiInterface(this);
        }
        if (alimiInterface.getSavedUserID().isEmpty()) {
            LogFile.log("FCMListenerServiceHandler", 0, "NO SAVED USER ID !!!");
            return;
        }
        int i8 = Integer.parseInt(zVar.getData().get("badge").trim());
        LogFile.log("FCMListenerServiceHandler", 4, "onMessageReceived: Lock Start");
        synchronized (messageLock) {
            try {
                if (NetworkStatusReceiver.isOnline(this) != 1) {
                    MSGVo parseFCMPayload = getParseFCMPayload(zVar);
                    if (parseFCMPayload != null) {
                        alimiInterface.messageInsertAndNoti(parseFCMPayload, i8);
                    }
                    LogFile.log("FCMListenerServiceHandler", 1, "onMessageReceived: Invalid Network !!");
                    super.onMessageReceived(zVar);
                    return;
                }
                if (alimiInterface.getNewMessageAndNoti(true, i8) == -1) {
                    LogFile.log("FCMListenerServiceHandler", 1, "onMessageReceived: case GETMESSAGE Fail 22");
                    MSGVo parseFCMPayload2 = getParseFCMPayload(zVar);
                    if (parseFCMPayload2 != null) {
                        alimiInterface.messageInsertAndNoti(parseFCMPayload2, i8);
                    }
                }
                LogFile.log("FCMListenerServiceHandler", 1, "onMessageReceived: END GetNewMessage !!!");
                super.onMessageReceived(zVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) throws NumberFormatException {
        if (alimiInterface == null) {
            alimiInterface = new AlimiInterface(this);
        }
        if (alimiInterface.getSavedUserID().isEmpty()) {
            LogFile.log("FCMListenerServiceHandler", 0, "NO SAVED USER ID !!!");
            return;
        }
        SharedData.setSharedData(this, "UserInfo", "gcmToken", str);
        Const.setGcmRegID(str);
        alimiInterface.registToken();
        super.onNewToken(str);
    }
}

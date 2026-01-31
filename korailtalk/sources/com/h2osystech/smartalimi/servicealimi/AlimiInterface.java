package com.h2osystech.smartalimi.servicealimi;

import Q7.C0709m;
import ai.maum.m2u.cdk.grpclib.constants.BaseConst;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.SQLException;
import android.database.sqlite.SQLiteConstraintException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.r;
import com.h2osystech.smartalimi.aidllib.MSGVo;
import com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface;
import com.h2osystech.smartalimi.common.CommonUtil;
import com.h2osystech.smartalimi.common.Const;
import com.h2osystech.smartalimi.common.LogFile;
import com.h2osystech.smartalimi.servicealimi.NetworkStatusReceiver;
import com.h2osystech.smartalimi.servicealimi.fcm.FCMAdapter;
import com.h2osystech.smartalimi.servicealimimodule.DBAdapter;
import com.h2osystech.smartalimi.servicealimimodule.PushReceiver;
import com.h2osystech.smartalimi.servicealimimodule.SharedData;
import com.h2osystech.smartalimi.servicealimimodule.SmartBrokerAdapter;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.korail.talk.network.dao.addService.HelpSrvCustDao;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public class AlimiInterface extends ServiceAlimiInterface.Stub {
    private static int cBadgeCount;
    public static int reconnStep;
    Context context;
    PushProcessor pushProcessor;
    final String TAG = "AlimiInterface";
    final String SYNC_NOTI = "SYNC_NOTI";
    int loginCheck = 0;
    FCMAdapter fcmAdapter = null;
    DBAdapter dbAdapter = null;
    SmartBrokerAdapter smartBrokerAdapter = null;
    private int totalCount = 0;
    private MSGVo notifyVo = null;
    public NetworkStatusReceiver m_NetworkMonitor = null;
    boolean notiRunFlag = false;
    NetworkStatusReceiver.OnChangeNetworkStatusListener NetworkChangedListener = new NetworkStatusReceiver.OnChangeNetworkStatusListener() { // from class: com.h2osystech.smartalimi.servicealimi.AlimiInterface.1
        @Override // com.h2osystech.smartalimi.servicealimi.NetworkStatusReceiver.OnChangeNetworkStatusListener
        public void OnChanged(int i8) {
            if (Const.brokerPushType != 0) {
                if (i8 == -1) {
                    LogFile.log("AlimiInterface", 4, "NetworkStatusReceiver:Network Disconnected");
                    if (SmartBrokerAdapter.erbBrokerInit) {
                        SmartBrokerAdapter.lastDisconnectTime = CommonUtil.getTime();
                    }
                    AlimiInterface.this.termSmartBroker();
                    return;
                }
                if (i8 != 1) {
                    return;
                }
                LogFile.log("AlimiInterface", 4, "NetworkStatusReceiver:Network Connected");
                try {
                    AlimiInterface.this.tryConnectErbBroker(2, 5);
                } catch (Exception unused) {
                    LogFile.log("AlimiInterface", 4, "NetworkStatusReceiver: InitSmartBroker Exption");
                }
            }
        }
    };
    private final Handler handler = new Handler(Looper.getMainLooper());

    public AlimiInterface(Context context) throws SQLException {
        this.pushProcessor = null;
        this.context = null;
        this.context = context;
        initAdapter();
        if (Const.brokerIP.isEmpty()) {
            onInitInform();
        }
        this.pushProcessor = new PushProcessor();
        if (Const.brokerPushType != 0) {
            registerRestartAlarm(true);
        }
    }

    static /* synthetic */ int access$008(AlimiInterface alimiInterface) {
        int i8 = alimiInterface.totalCount;
        alimiInterface.totalCount = i8 + 1;
        return i8;
    }

    private int initServerInfo() {
        String sharedData = SharedData.getSharedData(this.context, "noticeEnv", "ipaddress");
        String sharedData2 = SharedData.getSharedData(this.context, "noticeEnv", "port");
        String appType = getAppType();
        if (sharedData.equals("") || sharedData2.equals("") || appType.equals("")) {
            return -6;
        }
        Const.brokerIP = sharedData;
        Const.brokerPort = Integer.valueOf(sharedData2).intValue();
        Const.brokerAppType = appType;
        return 1;
    }

    public int SessionCheck() {
        int iWakeErbBroker = this.smartBrokerAdapter.wakeErbBroker();
        if (iWakeErbBroker != 1) {
            this.smartBrokerAdapter.term();
            SmartBrokerAdapter.lastDisconnectTime = CommonUtil.getTime();
        }
        return iWakeErbBroker;
    }

    protected void Update() {
        final int i8 = cBadgeCount;
        this.handler.post(new Runnable() { // from class: com.h2osystech.smartalimi.servicealimi.AlimiInterface.3
            @Override // java.lang.Runnable
            public void run() {
                MSGVo mSGVo = AlimiInterface.this.notifyVo;
                int i9 = AlimiInterface.this.totalCount;
                AlimiInterface.this.totalCount = 0;
                if (mSGVo != null) {
                    int i10 = i9 - 1;
                    if (i10 > 0) {
                        mSGVo.setNewMsgCnt(String.valueOf(i10));
                    }
                    AlimiInterface.this.notiPushData(mSGVo, i8);
                    AlimiInterface.this.notifyVo = null;
                }
            }
        });
    }

    public int autoLogin() throws NumberFormatException, SQLException {
        if (getPushOnOff().equalsIgnoreCase(C0709m.OFF)) {
            return 0;
        }
        int iInitServerInfo = initServerInfo();
        if (iInitServerInfo != 1 && iInitServerInfo != 1) {
            return -6;
        }
        if (Const.useGcmFlag == 1 && Const.getGcmRegID().equals("")) {
            Const.setGcmRegID(SharedData.getSharedData(this.context, "UserInfo", "gcmToken"));
            LogFile.log("AlimiInterface", 4, "GCM ID is Null");
        }
        if (this.smartBrokerAdapter.init() != 1) {
            return -1;
        }
        int iRegistPush = this.smartBrokerAdapter.registPush(Const.getUserID(), Const.getUserPW());
        if (iRegistPush != 0) {
            termAdapter();
            return iRegistPush;
        }
        if (Const.brokerPushType != 0) {
            this.smartBrokerAdapter.erbaddregister();
            registReceiver();
        }
        if (this.pushProcessor == null) {
            this.pushProcessor = new PushProcessor();
        }
        this.smartBrokerAdapter.setPushReceiver(this.pushProcessor);
        if (this.dbAdapter == null) {
            DBAdapter dBAdapter = new DBAdapter(this.context);
            this.dbAdapter = dBAdapter;
            dBAdapter.open();
        }
        getNewMessageAndNoti(true);
        return 0;
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public void enableLog(boolean z8) {
        Const.IS_LOG = z8;
        SharedData.setSharedBool(this.context, "noticeEnv", "EnableLog", z8);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int erbAddregist(String str, String str2) {
        return this.smartBrokerAdapter.erbaddregister(str, str2);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int erbDelregist(String str, String str2) {
        return this.smartBrokerAdapter.erbdelregister(str, str2);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int erbTerm() {
        return this.smartBrokerAdapter.term();
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public List getAllCurrentMsg() {
        int sortType = getSortType();
        ArrayList<MSGVo> arrayListSelectSenderGroupCurruntMsg = null;
        try {
        } catch (SQLException unused) {
            LogFile.log("AlimiInterface", 2, "getAllCrrentMSG:error" + this.dbAdapter.toString());
        }
        if (sortType == 0) {
            arrayListSelectSenderGroupCurruntMsg = this.dbAdapter.selectSenderGroupCurruntMsg();
        } else {
            if (sortType != 1) {
                if (sortType != 2) {
                    arrayListSelectSenderGroupCurruntMsg = this.dbAdapter.selectSenderGroupCurruntMsg();
                }
                return arrayListSelectSenderGroupCurruntMsg;
            }
            arrayListSelectSenderGroupCurruntMsg = this.dbAdapter.selectTaskGroupCurruntMsg();
        }
        return arrayListSelectSenderGroupCurruntMsg;
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public List getAllMsg() {
        return this.dbAdapter.getAllMsg();
    }

    public String getAppType() {
        return SharedData.getSharedData(this.context, "noticeEnv", "AppType");
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int getBeforeMsg(int i8) {
        ArrayList<MSGVo> beforeMessage = this.smartBrokerAdapter.getBeforeMessage(i8);
        if (beforeMessage == null || beforeMessage.size() == 0) {
            return -1;
        }
        int size = beforeMessage.size();
        String userID = Const.getUserID();
        String gcmRegID = Const.getGcmRegID();
        LogFile.log("AlimiInterface", 1, "getBeforeMessage receive");
        for (int i9 = 0; i9 < size; i9++) {
            MSGVo mSGVo = beforeMessage.get(i9);
            if (mSGVo != null) {
                try {
                    if (messageInsert(mSGVo) > 0) {
                        this.smartBrokerAdapter.receipt(userID, mSGVo.getDate(), mSGVo.getSeq(), gcmRegID);
                    }
                } catch (SQLiteConstraintException e8) {
                    if (e8.getMessage().contains("not unique")) {
                        this.smartBrokerAdapter.receipt(userID, mSGVo.getDate(), mSGVo.getSeq(), gcmRegID);
                    }
                    LogFile.log("AlimiInterface", 1, "getBeforeMessage receive Error[" + mSGVo.getUniqSeq() + "] : " + e8.getMessage());
                } catch (Exception e9) {
                    LogFile.log("AlimiInterface", 1, "getBeforeMessage Error[" + mSGVo.getUniqSeq() + "] : " + e9.getMessage());
                }
            }
        }
        return 1;
    }

    public long getNewMessageAndNoti(boolean z8, int i8) throws SQLException {
        long j8;
        if (NetworkStatusReceiver.isOnline(this.context) != 1) {
            return -1L;
        }
        if ((!SmartBrokerAdapter.erbBrokerInit ? this.smartBrokerAdapter.init() : 1) != 1) {
            return -1L;
        }
        ArrayList<MSGVo> newMessage = !z8 ? this.smartBrokerAdapter.getNewMessage() : this.smartBrokerAdapter.getNewMessageLimit();
        if (newMessage == null || newMessage.size() == 0) {
            if (Const.brokerPushType == 0) {
                this.smartBrokerAdapter.erbStop();
            }
            if (newMessage == null) {
                return -1L;
            }
            if (newMessage.size() == 0) {
                return 0L;
            }
        }
        int size = newMessage.size();
        String userID = Const.getUserID();
        String gcmRegID = Const.getGcmRegID();
        if (!this.smartBrokerAdapter.isErbBrokerInit()) {
            LogFile.log("AlimiInterface", 1, "getMessage Succes And Init Fail return ");
            return -1L;
        }
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < size; i9++) {
            MSGVo mSGVo = newMessage.get(i9);
            LogFile.log("AlimiInterface", 1, "getNewMessage Insert[" + mSGVo.getUniqSeq() + "] ");
            try {
                j8 = 0;
                if (messageInsert(mSGVo) > 0) {
                    try {
                        arrayList.add(mSGVo);
                        if (Const.isOnebyOne) {
                            LogFile.log("AlimiInterface", 5, "is OnebyOne Message Proc");
                            notiPushData(mSGVo, i8);
                        } else if (!this.notiRunFlag) {
                            this.totalCount++;
                            this.notifyVo = mSGVo;
                            notiStart(i8);
                        }
                    } catch (SQLiteConstraintException e8) {
                        e = e8;
                        if (e.getMessage().contains("UNIQUE") || e.getMessage().contains("unique")) {
                            arrayList.add(mSGVo);
                            messageUpdate(mSGVo);
                            this.smartBrokerAdapter.receipt(userID, mSGVo.getDate(), mSGVo.getSeq(), gcmRegID);
                        } else {
                            LogFile.log("AlimiInterface", 1, "getNewMessage Insert Error[" + mSGVo.getUniqSeq() + "] : " + e.getMessage());
                        }
                    } catch (Exception e9) {
                        e = e9;
                        LogFile.log("AlimiInterface", 1, "getNewMessage Insert Error[" + mSGVo.getUniqSeq() + "] : " + e.getMessage());
                    }
                }
            } catch (SQLiteConstraintException e10) {
                e = e10;
                j8 = 0;
            } catch (Exception e11) {
                e = e11;
                j8 = 0;
            }
        }
        this.smartBrokerAdapter.receipt2(userID, arrayList, gcmRegID);
        if (Const.brokerPushType == 0) {
            this.smartBrokerAdapter.erbStop();
        }
        return size;
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int getNotiDisable() {
        return SharedData.getSharedNoData(this.context, "noticeEnv", "SubNotiType");
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int getNotiThreadTime() {
        int sharedNoData = SharedData.getSharedNoData(this.context, "noticeEnv", "NoticeTreadTime");
        if (sharedNoData != 0) {
            return sharedNoData;
        }
        SharedData.setSharedNoData(this.context, "noticeEnv", "NoticeTreadTime", 1000);
        return 1000;
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int getNotiType() {
        return SharedData.getSharedNoData(this.context, "noticeEnv", "NotiType");
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public String getPushOnOff() {
        if (!CommonUtil.isUsingLogoutTR()) {
            String sharedData = SharedData.getSharedData(this.context, "noticeEnv", "NoticeOnOff");
            return (sharedData.equals("") || sharedData.equals("")) ? C0709m.ON : sharedData;
        }
        String pushOnOff = this.smartBrokerAdapter.getPushOnOff(SharedData.getSharedData(this.context, "UserInfo", "UserID"), SharedData.getSharedData(this.context, "UserInfo", "UserPW"));
        LogFile.log("AlimiInterface", 5, "getPushOnOff Result[" + pushOnOff + "]");
        return pushOnOff;
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public String getReadMsg(String str) {
        try {
            return this.dbAdapter.getMsgRead(str);
        } catch (Exception e8) {
            LogFile.log("AlimiInterface", 3, "getReadMSG:error");
            e8.getStackTrace();
            return "Y";
        }
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public String getSavedUserID() {
        return SharedData.getSharedData(this.context, "UserInfo", "UserID");
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public String getSenderBySeq(String str) {
        try {
            return this.dbAdapter.getSenderBySeq(str);
        } catch (Exception unused) {
            LogFile.log("AlimiInterface", 3, "getSenderBySeq:error");
            return "";
        }
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int getSortType() {
        return SharedData.getSharedNoData(this.context, "noticeEnv", "SortGubun");
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public MSGVo getUniqMsg(String str) {
        try {
            return this.dbAdapter.selectUnicseq(str);
        } catch (Exception unused) {
            LogFile.log("AlimiInterface", 3, "getUniqMsg:error");
            return null;
        }
    }

    public void initAdapter() throws SQLException {
        if (Const.useGcmFlag == 1) {
            this.fcmAdapter = new FCMAdapter();
        }
        if (this.smartBrokerAdapter == null) {
            this.smartBrokerAdapter = new SmartBrokerAdapter(this.context);
        }
        int notiThreadTime = getNotiThreadTime();
        int notiType = getNotiType();
        int notiDisable = getNotiDisable();
        String str = SharedData.getSharedNoData(this.context, "UserInfo", "multiLogin") != 1 ? HelpSrvCustDao.HelpSrvCustRequest.f27549D : "Y";
        if (!SharedData.getSharedData(this.context, "UserInfo", BaseConst.MapKeys.USER_ID).equals("")) {
            Const.setUserID(SharedData.getSharedData(this.context, "UserInfo", BaseConst.MapKeys.USER_ID));
            if (this.dbAdapter == null) {
                DBAdapter dBAdapter = new DBAdapter(this.context);
                this.dbAdapter = dBAdapter;
                dBAdapter.open();
                LogFile.log("AlimiInterface", 2, "messageInsert  dbadapter");
            }
        }
        try {
            Const.brokerPort = Integer.valueOf(SharedData.getSharedData(this.context, "noticeEnv", "port")).intValue();
        } catch (NumberFormatException unused) {
            Const.brokerPort = 0;
        }
        Const.setLOGINFLAG(str);
        Const.setNotiTreadTime(notiThreadTime);
        Const.setNotiType(notiType);
        Const.setNoti_Disable(notiDisable);
    }

    public boolean isMultiLoginErr() {
        return SharedData.getSharedBool(this.context, "UserInfo", "multiLoginFlag");
    }

    public boolean isTryConnectErbBroker() {
        return (Const.brokerPushType == 0 || getSavedUserID().equals("") || this.smartBrokerAdapter.isErbBrokerInit()) ? false : true;
    }

    public int loginProc(String str, String str2) throws NumberFormatException, SQLException {
        if (Const.useGcmFlag == 1) {
            String gcmRegID = Const.getGcmRegID();
            if (gcmRegID == null || gcmRegID.equals("")) {
                LogFile.log("AlimiInterface", 4, "GCM ID is Null");
                Const.setGcmRegID(this.fcmAdapter.getToken(this.context));
            } else {
                LogFile.log("AlimiInterface", 4, "GCM Token OK ");
            }
        }
        int iRegistPush = this.smartBrokerAdapter.registPush(str, str2);
        this.loginCheck = iRegistPush;
        if (iRegistPush != 0) {
            termAdapter();
            return this.loginCheck;
        }
        if (Const.brokerPushType != 0) {
            this.loginCheck = this.smartBrokerAdapter.erbaddregister();
            registReceiver();
        }
        setisMultiLogin(false);
        DBAdapter dBAdapter = new DBAdapter(this.context);
        this.dbAdapter = dBAdapter;
        dBAdapter.open();
        if (this.pushProcessor == null) {
            this.pushProcessor = new PushProcessor();
        }
        this.smartBrokerAdapter.setPushReceiver(this.pushProcessor);
        getNewMessageAndNoti(false);
        return this.loginCheck;
    }

    public long messageInsert(MSGVo mSGVo) throws SQLException {
        if (this.dbAdapter == null) {
            DBAdapter dBAdapter = new DBAdapter(this.context);
            this.dbAdapter = dBAdapter;
            dBAdapter.open();
            LogFile.log("AlimiInterface", 2, "messageInsert  dbadapter");
        }
        long jInsertMsg2 = this.dbAdapter.insertMsg2(mSGVo);
        LogFile.log("AlimiInterface", 2, "messageInsert  is result = " + jInsertMsg2);
        return jInsertMsg2;
    }

    public long messageInsertAndNoti(MSGVo mSGVo, int i8) throws SQLException {
        long jInsertMsg2;
        if (this.dbAdapter == null) {
            DBAdapter dBAdapter = new DBAdapter(this.context);
            this.dbAdapter = dBAdapter;
            dBAdapter.open();
            LogFile.log("AlimiInterface", 2, "messageInsert  dbadapter");
        }
        try {
            jInsertMsg2 = this.dbAdapter.insertMsg2(mSGVo);
        } catch (SQLiteConstraintException e8) {
            LogFile.log("AlimiInterface", 2, "messageInsert  Exception = " + e8.getMessage());
            jInsertMsg2 = -1;
        }
        LogFile.log("AlimiInterface", 2, "messageInsert  is result = " + jInsertMsg2);
        if (jInsertMsg2 > 0) {
            notiPushData(mSGVo, i8);
        }
        return jInsertMsg2;
    }

    public long messageUpdate(MSGVo mSGVo) throws SQLException {
        if (this.dbAdapter == null) {
            DBAdapter dBAdapter = new DBAdapter(this.context);
            this.dbAdapter = dBAdapter;
            dBAdapter.open();
            LogFile.log("AlimiInterface", 2, "messageUpdate  dbadapter");
        }
        long jUpdateMsg2 = this.dbAdapter.updateMsg2(mSGVo);
        LogFile.log("AlimiInterface", 2, "updateMsg2  is result = " + jUpdateMsg2);
        return jUpdateMsg2;
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int newMsgCount() {
        return this.dbAdapter.selectNewMsgCount();
    }

    public void notiPushData(MSGVo mSGVo, int i8) {
        NotiManager.notiPushData(this.context, mSGVo, i8);
    }

    public void notiStart() {
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() { // from class: com.h2osystech.smartalimi.servicealimi.AlimiInterface.2
            @Override // java.util.TimerTask
            public boolean cancel() {
                LogFile.log("AlimiInterface", 4, "Thread cancel");
                AlimiInterface.this.notiRunFlag = false;
                timer.cancel();
                return super.cancel();
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (AlimiInterface.this.notifyVo == null) {
                    cancel();
                    return;
                }
                AlimiInterface alimiInterface = AlimiInterface.this;
                alimiInterface.notiRunFlag = true;
                alimiInterface.Update();
            }
        }, 0L, Const.getNotiTreadTime());
    }

    public void onInitInform() {
        Const.brokerPushType = SharedData.getSharedNoData(this.context, "UserInfo", "PushType");
        Const.brokerIP = SharedData.getSharedData(this.context, "noticeEnv", "ipaddress");
        Const.brokerAppType = SharedData.getSharedData(this.context, "noticeEnv", "AppType");
        Const.userID = SharedData.getSharedData(this.context, "UserInfo", "UserID");
        Const.userPW = SharedData.getSharedData(this.context, "UserInfo", "UserPW");
        Const.IS_LOG = SharedData.getSharedBool(this.context, "noticeEnv", "EnableLog");
        Const.logLevel = SharedData.getSharedNoData(this.context, "noticeEnv", "logLevel");
        Const.gcmRegID = SharedData.getSharedData(this.context, "UserInfo", "gcmToken");
        Const.GCM_CALLBACK_MESSAGE = SharedData.getSharedNoData(this.context, "noticeEnv", "GCMCallbackMode");
        Const.isOnebyOne = SharedData.getSharedBool(this.context, "noticeEnv", "OnebyOne");
        StringBuilder sb = new StringBuilder();
        sb.append("onInitInform: ");
        sb.append(Const.userID);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int readCheck(String str, List list) throws SQLException {
        if (str.equals("") || list == null) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            arrayList.add(this.dbAdapter.selectUnicseq((String) list.get(i8)));
        }
        if (!this.smartBrokerAdapter.isErbBrokerInit() && Const.brokerPushType == 0) {
            this.smartBrokerAdapter.init();
        }
        int check3 = this.smartBrokerAdapter.readCheck3(str, arrayList);
        if (Const.brokerPushType == 0) {
            this.smartBrokerAdapter.term();
        }
        if (check3 != 0) {
            return Const.FAIL;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.dbAdapter.updateMsgReading((String) list.get(i9));
        }
        return Const.SUCCESS;
    }

    public void registReceiver() {
        if (this.m_NetworkMonitor == null) {
            NetworkStatusReceiver networkStatusReceiver = new NetworkStatusReceiver();
            this.m_NetworkMonitor = networkStatusReceiver;
            networkStatusReceiver.setOnChangeNetworkStatusListener(this.NetworkChangedListener);
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            this.context.registerReceiver(this.m_NetworkMonitor, intentFilter);
            if (Const.brokerPushType != 0) {
                registerRestartAlarm(true);
            }
        }
    }

    public int registToken() throws NumberFormatException {
        int iInitServerInfo = initServerInfo();
        if (iInitServerInfo != 1 && iInitServerInfo != 1) {
            return -6;
        }
        if (this.smartBrokerAdapter.init() != 1) {
            return -1;
        }
        int iRegistPush = this.smartBrokerAdapter.registPush(Const.getUserID(), Const.getUserPW());
        if (iRegistPush == 0) {
            return 0;
        }
        termAdapter();
        return iRegistPush;
    }

    public void registerRestartAlarm(boolean z8) {
        Intent intent = new Intent(this.context, (Class<?>) RestartReceiver.class);
        intent.setAction(RestartReceiver.ACTION_RESTART_SERVICE);
        AlarmManager alarmManager = (AlarmManager) this.context.getSystemService(r.CATEGORY_ALARM);
        if (!z8) {
            alarmManager.cancel(PendingIntent.getBroadcast(this.context, 0, intent, 268435456));
            return;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(this.context, 0, intent, 134217728);
        LogFile.log("AlimiInterface", 0, "Register Alram :setAlarm : bool = " + z8);
        alarmManager.setExactAndAllowWhileIdle(0, System.currentTimeMillis() + 180000, broadcast);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int removeAllMsg() {
        return this.dbAdapter.deleteAllMsg();
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int removeBySeq(String str) {
        try {
            this.dbAdapter.removeForSeqItem(str);
            return 1;
        } catch (Exception unused) {
            LogFile.log("AlimiInterface", 3, "removeToUniqSeqItem:error");
            return -1;
        }
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int removeListItem(String str) {
        try {
            int sortType = getSortType();
            if (sortType == 0) {
                this.dbAdapter.removeSenderListItem(str);
            } else if (sortType == 1) {
                this.dbAdapter.removeTaskListItem(str);
            }
            return 1;
        } catch (Exception unused) {
            LogFile.log("AlimiInterface", 2, "remove: senderID");
            return -1;
        }
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public List selectGroupID(String str) {
        List listSelectSenderId = null;
        try {
            int sortType = getSortType();
            if (sortType == 0) {
                listSelectSenderId = this.dbAdapter.selectSenderId(str);
            } else if (sortType == 1) {
                listSelectSenderId = this.dbAdapter.selectTaskId(str);
            }
        } catch (Exception unused) {
            LogFile.log("AlimiInterface", 3, "selectSanderId:error");
        }
        return listSelectSenderId;
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public List selectSearchItems(String str) {
        try {
            return this.dbAdapter.selectSearchItems(str);
        } catch (Exception unused) {
            LogFile.log("AlimiInterface", 3, "selectSearchItems:error");
            return null;
        }
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int selectSearchValuesCount(String str) {
        try {
            return this.dbAdapter.selectSearchValuesCount(str);
        } catch (Exception unused) {
            LogFile.log("AlimiInterface", 3, "selectSearchValuesCount:error");
            return -1;
        }
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setAllReadCheck() throws SQLException {
        List<MSGVo> listSelectAllReadCheck = this.dbAdapter.selectAllReadCheck();
        if (listSelectAllReadCheck == null || listSelectAllReadCheck.isEmpty()) {
            return -1;
        }
        int size = listSelectAllReadCheck.size();
        int i8 = 0;
        while (size > i8) {
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < 10 && size > i8; i9++) {
                MSGVo mSGVo = listSelectAllReadCheck.get(i8);
                if (mSGVo != null) {
                    this.dbAdapter.updateMsgReading(mSGVo.getUniqSeq());
                    arrayList.add(mSGVo);
                    LogFile.log("AlimiInterface", 2, "setAllReadCheck " + mSGVo.getUniqSeq());
                }
                i8++;
            }
        }
        if (!this.smartBrokerAdapter.isErbBrokerInit()) {
            this.smartBrokerAdapter.init();
        }
        this.smartBrokerAdapter.readCheck2(Const.getUserID(), listSelectAllReadCheck, Const.getGcmRegID());
        this.smartBrokerAdapter.term();
        return 1;
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setAppType(String str) {
        SharedData.setSharedData(this.context, "noticeEnv", "AppType", str);
        return 0;
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setBedgeCountPackage(String str) {
        String sharedData = SharedData.getSharedData(this.context, "noticeEnv", "mainActivity");
        if (!sharedData.equals("") && str.equals(sharedData)) {
            return 1;
        }
        SharedData.setSharedData(this.context, "noticeEnv", "mainActivity", str);
        return 1;
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setBroadcastOpt(boolean z8) {
        Const.isOnebyOne = z8;
        SharedData.setSharedBool(this.context, "noticeEnv", "OnebyOne", z8);
        return Const.SUCCESS;
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setGCMtoSaveMode(int i8) {
        Const.GCM_CALLBACK_MESSAGE = i8;
        SharedData.setSharedNoData(this.context, "noticeEnv", "GCMCallbackMode", i8);
        return 1;
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setLogin(String str, String str2, int i8) throws InterruptedException, NumberFormatException, SQLException {
        if (str.equals("") || str2.equals("")) {
            StringBuilder sb = new StringBuilder();
            sb.append("setLogin: user ID = ");
            sb.append(str);
            sb.append("pw = ");
            sb.append(str2);
            return -6;
        }
        if (Const.useGcmFlag == 1) {
            LogFile.log("AlimiInterface", 2, "setLogin Call, FCM ID = " + this.fcmAdapter.getToken(this.context));
        }
        if (initServerInfo() != 1) {
            return -5;
        }
        Const.setUserID(str);
        Const.setUserPW(str2);
        if (this.smartBrokerAdapter.init(Const.getBrokerIP(), Const.getBrokerPort(), str, Const.brokerTimeout) != 1) {
            Const.setUserID("");
            Const.setUserPW("");
            return -1;
        }
        setLoginInfo(str, str2, i8);
        int iLoginProc = loginProc(str, str2);
        LogFile.log("AlimiInterface", 4, "setLogin    after loginProc : " + iLoginProc);
        if (iLoginProc == 0) {
            SharedData.setSharedNoData(this.context, "UserInfo", "multiLogin", i8);
        }
        return iLoginProc;
    }

    public int setLoginInfo(String str, String str2, int i8) {
        if (str.equals("%callautologin%") || str.equals("")) {
            str = SharedData.getSharedData(this.context, "UserInfo", "UserID");
            str2 = SharedData.getSharedData(this.context, "UserInfo", "UserPW");
        }
        if (str.equals("")) {
            LogFile.log("AlimiInterface", 1, "setLoginInfo : Login ID is Null");
            return -6;
        }
        Const.setUserID(str);
        Const.setUserPW(str2);
        Const.setLOGINFLAG(i8 != 0 ? i8 != 1 ? HelpSrvCustDao.HelpSrvCustRequest.f27549D : "Y" : "N");
        SharedData.setSharedNoData(this.context, "UserInfo", "multiLogin", i8);
        return 1;
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public boolean setLogout() {
        int logout;
        SmartBrokerAdapter.lastDisconnectTime = CommonUtil.getTime();
        if (Const.userID.equals("")) {
            logout = -1;
        } else {
            logout = this.smartBrokerAdapter.setLogout(Const.userID);
            LogFile.log("AlimiInterface", 3, "Logout Call result [" + logout + "]");
        }
        if (logout != 0 && CommonUtil.isUsingLogoutTR()) {
            return false;
        }
        Const.setUserID("");
        Const.setUserPW("");
        SharedData.setSharedData(this.context, "UserInfo", "UserID", "");
        SharedData.setSharedData(this.context, "UserInfo", "UserPW", "");
        setisMultiLogin(true);
        termAdapter();
        return true;
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setNotiDisable(int i8) {
        if (i8 != 0 && i8 != 1) {
            return -1;
        }
        SharedData.setSharedNoData(this.context, "noticeEnv", "SubNotiType", i8);
        Const.setNoti_Disable(i8);
        return i8;
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setNotiThreadTime(int i8) {
        if (i8 < 300) {
            i8 = 300;
        }
        if (i8 > 180000) {
            i8 = 180000;
        }
        SharedData.setSharedNoData(this.context, "noticeEnv", "NoticeTreadTime", i8);
        Const.setNotiTreadTime(i8);
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000a A[PHI: r1
  0x000a: PHI (r1v2 int) = (r1v1 int), (r1v3 int) binds: [B:5:0x0004, B:7:0x0007] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int setNotiType(int r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto Lb
            r1 = 1
            if (r5 == r1) goto La
            r1 = 2
            if (r5 == r1) goto La
            goto Lb
        La:
            r0 = r1
        Lb:
            android.content.Context r1 = r4.context
            java.lang.String r2 = "noticeEnv"
            java.lang.String r3 = "NotiType"
            com.h2osystech.smartalimi.servicealimimodule.SharedData.setSharedNoData(r1, r2, r3, r0)
            com.h2osystech.smartalimi.common.Const.setNotiType(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.h2osystech.smartalimi.servicealimi.AlimiInterface.setNotiType(int):int");
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setPhoneNumber(String str) {
        if (str.equals("") || str.equals("") || str.length() > 15) {
            return -1;
        }
        SharedData.setSharedData(this.context, "UserInfo", "UserPhone", str);
        return 1;
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setPushOnOff(String str) throws NumberFormatException, SQLException {
        int iPushOnOff = this.smartBrokerAdapter.pushOnOff(str, SharedData.getSharedData(this.context, "UserInfo", "UserID"), SharedData.getSharedData(this.context, "UserInfo", "UserPW"));
        if (iPushOnOff == 0 && !str.equalsIgnoreCase(C0709m.OFF) && Const.brokerPushType != 0) {
            iPushOnOff = autoLogin();
        }
        if (iPushOnOff != 0) {
            return Const.FAIL;
        }
        SharedData.setSharedData(this.context, "noticeEnv", "NoticeOnOff", str);
        return Const.SUCCESS;
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setReadChk(String str, String str2) {
        int iInit;
        int i8 = -1;
        try {
            iInit = !this.smartBrokerAdapter.isErbBrokerInit() ? this.smartBrokerAdapter.init() : 1;
            LogFile.log("AlimiInterface", 3, "setReadChk: input ID = " + Const.getUserID() + "input regID = " + Const.getGcmRegID() + "\n param = " + str + " / " + str2);
        } catch (Exception e8) {
            LogFile.log("AlimiInterface", 3, "setReadMSG:error" + e8.getMessage());
        }
        if (iInit != 1) {
            LogFile.log("AlimiInterface", 3, "setReadChk: Init  Fail ");
            return iInit;
        }
        i8 = this.smartBrokerAdapter.readcheck(Const.getUserID(), str, str2, Const.getGcmRegID());
        if (Const.brokerPushType == 0) {
            this.smartBrokerAdapter.term();
        }
        return i8;
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setReadMsg(String str) {
        ArrayList arrayList;
        int iInit;
        int check2 = -1;
        try {
            if (this.dbAdapter == null) {
                DBAdapter dBAdapter = new DBAdapter(this.context);
                this.dbAdapter = dBAdapter;
                dBAdapter.open();
            }
            MSGVo mSGVoSelectUnicseq = this.dbAdapter.selectUnicseq(str);
            arrayList = new ArrayList();
            arrayList.add(mSGVoSelectUnicseq);
            iInit = !this.smartBrokerAdapter.isErbBrokerInit() ? this.smartBrokerAdapter.init() : 1;
        } catch (Exception e8) {
            LogFile.log("AlimiInterface", 3, "setReadMSG:error" + e8.getMessage());
        }
        if (iInit != 1) {
            return iInit;
        }
        check2 = this.smartBrokerAdapter.readCheck2(Const.getUserID(), arrayList, Const.getGcmRegID());
        if (check2 == 1) {
            this.dbAdapter.updateMsgReading(str);
        }
        if (Const.brokerPushType == 0) {
            this.smartBrokerAdapter.term();
        }
        return check2;
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setServerIPPort(String str, String str2) {
        if (str.equals("") || str2.equals("")) {
            return -1;
        }
        SharedData.setSharedData(this.context, "noticeEnv", "ipaddress", str);
        SharedData.setSharedData(this.context, "noticeEnv", "port", str2);
        int iInitServerInfo = initServerInfo();
        if (iInitServerInfo != 1) {
            return -1;
        }
        return iInitServerInfo;
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setSortType(int i8) {
        try {
            SharedData.setSharedNoData(this.context, "noticeEnv", "SortGubun", i8);
            return 1;
        } catch (Exception e8) {
            LogFile.log("AlimiInterface", 4, "setEtiquette Error :<" + i8 + SimpleComparison.GREATER_THAN_OPERATION);
            e8.getStackTrace();
            return -1;
        }
    }

    public void setisMultiLogin(boolean z8) {
        SharedData.setSharedBool(this.context, "UserInfo", "multiLoginFlag", z8);
    }

    public void termAdapter() {
        SmartBrokerAdapter smartBrokerAdapter = this.smartBrokerAdapter;
        if (smartBrokerAdapter != null) {
            smartBrokerAdapter.termPush();
            this.smartBrokerAdapter.term();
        }
    }

    public void termSmartBroker() {
        this.smartBrokerAdapter.erbStop();
    }

    public int tryConnectErbBroker() {
        LogFile.log("AlimiInterface", 4, "Try Connect EventBroker-Server");
        return autoLogin();
    }

    public void updateBadge() {
        try {
            Const.updateBadgetCount(this.context, this.dbAdapter.selectNewMsgCount());
        } catch (NullPointerException unused) {
        }
    }

    public void notiPushData(MSGVo mSGVo, String str, int i8) {
        NotiManager.notiPushData(this.context, mSGVo, str, i8);
    }

    public void notiPushData(MSGVo mSGVo) {
        NotiManager.notiPushData(this.context, mSGVo);
    }

    public int tryConnectErbBroker(int i8, int i9) throws InterruptedException {
        int iTryConnectErbBroker = -1;
        for (int i10 = 0; i10 < i8; i10++) {
            iTryConnectErbBroker = tryConnectErbBroker();
            if (iTryConnectErbBroker == 0) {
                break;
            }
            try {
                Thread.sleep(i9 * 1000);
            } catch (InterruptedException unused) {
                LogFile.log("AlimiInterface", 1, "tryConnectErbBroker Interupt Err");
            }
        }
        return iTryConnectErbBroker;
    }

    public void notiPushData(MSGVo mSGVo, String str) {
        NotiManager.notiPushData(this.context, mSGVo, str);
    }

    public void notiStart(int i8) {
        final Timer timer = new Timer();
        cBadgeCount = i8;
        timer.schedule(new TimerTask() { // from class: com.h2osystech.smartalimi.servicealimi.AlimiInterface.4
            @Override // java.util.TimerTask
            public boolean cancel() {
                LogFile.log("AlimiInterface", 4, "Thread cancel");
                AlimiInterface.this.notiRunFlag = false;
                timer.cancel();
                return super.cancel();
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (AlimiInterface.this.notifyVo == null) {
                    cancel();
                    return;
                }
                AlimiInterface alimiInterface = AlimiInterface.this;
                alimiInterface.notiRunFlag = true;
                alimiInterface.Update();
            }
        }, 0L, Const.getNotiTreadTime());
    }

    public long messageInsertAndNoti(MSGVo mSGVo) throws SQLException {
        long jInsertMsg2;
        if (this.dbAdapter == null) {
            DBAdapter dBAdapter = new DBAdapter(this.context);
            this.dbAdapter = dBAdapter;
            dBAdapter.open();
            LogFile.log("AlimiInterface", 2, "messageInsert  dbadapter");
        }
        try {
            jInsertMsg2 = this.dbAdapter.insertMsg2(mSGVo);
        } catch (SQLiteConstraintException e8) {
            LogFile.log("AlimiInterface", 2, "messageInsert  Exception = " + e8.getMessage());
            jInsertMsg2 = -1;
        }
        LogFile.log("AlimiInterface", 2, "messageInsert  is result = " + jInsertMsg2);
        if (jInsertMsg2 > 0) {
            notiPushData(mSGVo);
        }
        return jInsertMsg2;
    }

    public class PushProcessor implements PushReceiver {
        int cnt = 0;

        public PushProcessor() {
            LogFile.log("AlimiInterface", 4, "PushProcessor Construct");
        }

        @Override // com.h2osystech.smartalimi.servicealimimodule.PushReceiver
        public void OnDisConnected(String str) {
            LogFile.log("AlimiInterface", 2, "DisConn Start");
            NotiManager.notiPushData(AlimiInterface.this.context, str);
            try {
                AlimiInterface.this.setLogout();
                LogFile.log("AlimiInterface", 2, "Logout Success");
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }

        @Override // com.h2osystech.smartalimi.servicealimimodule.PushReceiver
        public void OnReceiveDup(MSGVo mSGVo) {
            try {
                LogFile.log("AlimiInterface", 4, "OnReceiveDup " + mSGVo.getUniqSeq());
                if (AlimiInterface.this.messageInsert(mSGVo) >= 0) {
                    AlimiInterface.this.smartBrokerAdapter.receipt(Const.getUserID(), mSGVo.getDate(), mSGVo.getSeq(), Const.getGcmRegID());
                    AlimiInterface alimiInterface = AlimiInterface.this;
                    if (!alimiInterface.notiRunFlag) {
                        AlimiInterface.access$008(alimiInterface);
                        AlimiInterface.this.notifyVo = mSGVo;
                        AlimiInterface.this.notiStart();
                    }
                } else {
                    AlimiInterface.this.smartBrokerAdapter.receipt(Const.getUserID(), mSGVo.getDate(), mSGVo.getSeq(), Const.getGcmRegID());
                    AlimiInterface.this.notiPushData(mSGVo);
                }
            } catch (SQLiteConstraintException e8) {
                if (e8.getMessage().contains("unique") || e8.getMessage().contains("UNIQUE")) {
                    AlimiInterface.this.smartBrokerAdapter.receipt(Const.getUserID(), mSGVo.getDate(), mSGVo.getSeq(), Const.getGcmRegID());
                    LogFile.log("AlimiInterface", 1, "InsertError [" + mSGVo.getUniqSeq() + "] : " + e8.getMessage());
                }
            } catch (Exception e9) {
                LogFile.log("AlimiInterface", 1, "PushProcessor Error [" + mSGVo.getUniqSeq() + "] : " + e9.getMessage());
            }
        }

        @Override // com.h2osystech.smartalimi.servicealimimodule.PushReceiver
        public void OnReceiveEvData(MSGVo mSGVo) {
            LogFile.log("AlimiInterface", 5, mSGVo.toString());
            AlimiInterface.this.notiPushData(mSGVo, "1");
        }

        @Override // com.h2osystech.smartalimi.servicealimimodule.PushReceiver
        public void OnReceiveGCM(Context context, Bundle bundle) {
            LogFile.log("AlimiInterface", 1, "OnReceiveGCM: Start ");
            if (NetworkStatusReceiver.isOnline(context) != 1) {
                LogFile.log("AlimiInterface", 1, "OnReceiveGCM: Invalid Network ");
                NotiManager.execute_GCMERROR_Receiver(context, bundle, Const.GCM_CALLBACK_INAVLID_NETWORK);
                return;
            }
            Const.isOnebyOne = SharedData.getSharedBool(context, "noticeEnv", "OnebyOne");
            long newMessageAndNoti = AlimiInterface.this.getNewMessageAndNoti(true);
            if (newMessageAndNoti <= 0) {
                if (newMessageAndNoti == -1) {
                    LogFile.log("AlimiInterface", 1, "OnReceiveGCM: case GETMESSAGE Fail ");
                    NotiManager.execute_GCMERROR_Receiver(context, bundle, Const.GCM_CALLBACK_TR_FAIL);
                    return;
                }
                return;
            }
            if (SharedData.getSharedNoData(context, "UserInfo", "PushType") != 0) {
                AlimiInterface alimiInterface = AlimiInterface.this;
                if (alimiInterface.pushProcessor == null) {
                    alimiInterface.pushProcessor = alimiInterface.new PushProcessor();
                }
                AlimiInterface alimiInterface2 = AlimiInterface.this;
                alimiInterface2.smartBrokerAdapter.setPushReceiver(alimiInterface2.pushProcessor);
                AlimiInterface.this.smartBrokerAdapter.erbaddregister();
                AlimiInterface.this.registReceiver();
            }
        }

        @Override // com.h2osystech.smartalimi.servicealimimodule.PushReceiver
        public void OnReceiveProc(MSGVo mSGVo) {
            try {
                LogFile.log("AlimiInterface", 4, "OnReceiveProc " + mSGVo.getUniqSeq());
                if (AlimiInterface.this.messageInsert(mSGVo) >= 0) {
                    AlimiInterface.this.smartBrokerAdapter.receipt(Const.getUserID(), mSGVo.getDate(), mSGVo.getSeq(), Const.getGcmRegID());
                    AlimiInterface alimiInterface = AlimiInterface.this;
                    if (alimiInterface.notiRunFlag) {
                        return;
                    }
                    AlimiInterface.access$008(alimiInterface);
                    AlimiInterface.this.notifyVo = mSGVo;
                    AlimiInterface.this.notiStart();
                }
            } catch (SQLiteConstraintException e8) {
                if (e8.getMessage().contains("unique")) {
                    AlimiInterface.this.smartBrokerAdapter.receipt(Const.getUserID(), mSGVo.getDate(), mSGVo.getSeq(), Const.getGcmRegID());
                }
                LogFile.log("AlimiInterface", 1, "InsertError [" + mSGVo.getUniqSeq() + "] : " + e8.getMessage());
            } catch (Exception e9) {
                LogFile.log("AlimiInterface", 1, "PushProcessor Error [" + mSGVo.getUniqSeq() + "] : " + e9.getMessage());
            }
        }

        @Override // com.h2osystech.smartalimi.servicealimimodule.PushReceiver
        public int OnReconnect() {
            LogFile.log("AlimiInterface", 3, "OnReconnect: ");
            return AlimiInterface.this.autoLogin();
        }

        @Override // com.h2osystech.smartalimi.servicealimimodule.PushReceiver
        public void OnReceiveProc() {
            if (NetworkStatusReceiver.isOnline(AlimiInterface.this.context) != 1 || AlimiInterface.this.getNewMessageAndNoti(true) <= 0 || Const.brokerPushType == 0) {
                return;
            }
            AlimiInterface.this.smartBrokerAdapter.erbaddregister();
            AlimiInterface.this.registReceiver();
            AlimiInterface alimiInterface = AlimiInterface.this;
            if (alimiInterface.pushProcessor == null) {
                alimiInterface.pushProcessor = alimiInterface.new PushProcessor();
            }
            AlimiInterface alimiInterface2 = AlimiInterface.this;
            alimiInterface2.smartBrokerAdapter.setPushReceiver(alimiInterface2.pushProcessor);
        }
    }

    public long getNewMessageAndNoti(boolean z8) {
        ArrayList<MSGVo> newMessageLimit;
        if (NetworkStatusReceiver.isOnline(this.context) != 1) {
            return -1L;
        }
        if ((!SmartBrokerAdapter.erbBrokerInit ? this.smartBrokerAdapter.init() : 1) != 1) {
            return -1L;
        }
        if (!z8) {
            newMessageLimit = this.smartBrokerAdapter.getNewMessage();
        } else {
            newMessageLimit = this.smartBrokerAdapter.getNewMessageLimit();
        }
        ArrayList<MSGVo> arrayList = newMessageLimit;
        long j8 = 0;
        if (arrayList == null || arrayList.size() == 0) {
            if (Const.brokerPushType == 0) {
                this.smartBrokerAdapter.erbStop();
            }
            if (arrayList == null) {
                return -1L;
            }
            if (arrayList.size() == 0) {
                return 0L;
            }
        }
        int size = arrayList.size();
        String userID = Const.getUserID();
        String gcmRegID = Const.getGcmRegID();
        if (!this.smartBrokerAdapter.isErbBrokerInit()) {
            LogFile.log("AlimiInterface", 1, "getMessage Succes And Init Fail return ");
            return -1L;
        }
        ArrayList arrayList2 = new ArrayList();
        int i8 = 0;
        while (i8 < size) {
            MSGVo mSGVo = arrayList.get(i8);
            LogFile.log("AlimiInterface", 1, "getNewMessage Insert[" + mSGVo.getUniqSeq() + "] ");
            try {
                if (messageInsert(mSGVo) > j8) {
                    arrayList2.add(mSGVo);
                    if (Const.isOnebyOne) {
                        LogFile.log("AlimiInterface", 5, "is OnebyOne Message Proc");
                        notiPushData(mSGVo);
                    } else if (!this.notiRunFlag) {
                        this.totalCount++;
                        this.notifyVo = mSGVo;
                        notiStart();
                    }
                }
            } catch (SQLiteConstraintException e8) {
                if (!e8.getMessage().contains("UNIQUE") && !e8.getMessage().contains("unique")) {
                    LogFile.log("AlimiInterface", 1, "getNewMessage Insert Error[" + mSGVo.getUniqSeq() + "] : " + e8.getMessage());
                } else {
                    arrayList2.add(mSGVo);
                    messageUpdate(mSGVo);
                    this.smartBrokerAdapter.receipt(userID, mSGVo.getDate(), mSGVo.getSeq(), gcmRegID);
                }
            } catch (Exception e9) {
                LogFile.log("AlimiInterface", 1, "getNewMessage Insert Error[" + mSGVo.getUniqSeq() + "] : " + e9.getMessage());
            }
            i8++;
            j8 = 0;
        }
        this.smartBrokerAdapter.receipt2(userID, arrayList2, gcmRegID);
        if (Const.brokerPushType == 0) {
            this.smartBrokerAdapter.erbStop();
        }
        return size;
    }
}

package com.h2osystech.smartalimi.servicealimi;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import com.h2osystech.smartalimi.common.Const;
import com.h2osystech.smartalimi.common.LogFile;
import com.h2osystech.smartalimi.servicealimimodule.SharedData;

/* loaded from: classes2.dex */
public class MessageManager extends Service {
    static boolean bRetryStart = false;
    static int nRetryCount = 0;
    static int nRetryDelayCount = 1;
    final String TAG = "MessageManager";
    AlimiInterface alimiInterface = null;
    final int RETRY_TIMER = 10;

    public class WakeLockManager {
        PowerManager.WakeLock wakeLock = null;
        WifiManager.WifiLock wifiLock = null;

        public WakeLockManager() {
        }

        public void onWakeLockStart(Context context) {
            if (this.wakeLock != null) {
                return;
            }
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "MyWakeLock");
            this.wakeLock = wakeLockNewWakeLock;
            if (wakeLockNewWakeLock.isHeld()) {
                return;
            }
            this.wakeLock.acquire();
        }

        public void onWakeLockStop() {
            PowerManager.WakeLock wakeLock = this.wakeLock;
            if (wakeLock == null || !wakeLock.isHeld()) {
                return;
            }
            this.wakeLock.release();
            this.wakeLock = null;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (this.alimiInterface == null) {
            this.alimiInterface = new AlimiInterface(getApplicationContext());
        }
        return this.alimiInterface;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        LogFile.log("MessageManager", 5, "MessageManager onCreate ");
        Context applicationContext = getApplicationContext();
        Const.brokerPushType = SharedData.getSharedNoData(applicationContext, "UserInfo", "PushType");
        Const.brokerIP = SharedData.getSharedData(applicationContext, "noticeEnv", "ipaddress");
        Const.brokerAppType = SharedData.getSharedData(applicationContext, "noticeEnv", "AppType");
        Const.userID = SharedData.getSharedData(applicationContext, "UserInfo", "UserID");
        Const.userPW = SharedData.getSharedData(applicationContext, "UserInfo", "UserPW");
        Const.IS_LOG = SharedData.getSharedBool(applicationContext, "noticeEnv", "EnableLog");
        Const.logLevel = SharedData.getSharedNoData(applicationContext, "noticeEnv", "logLevel");
        Const.gcmRegID = SharedData.getSharedData(applicationContext, "UserInfo", "gcmToken");
        Const.GCM_CALLBACK_MESSAGE = SharedData.getSharedNoData(applicationContext, "noticeEnv", "GCMCallbackMode");
        Const.isOnebyOne = SharedData.getSharedBool(applicationContext, "noticeEnv", "OnebyOne");
        if (this.alimiInterface == null) {
            this.alimiInterface = new AlimiInterface(getApplicationContext());
        }
        if (Const.brokerPushType != 0) {
            Intent intent = new Intent(applicationContext, (Class<?>) MessageManager.class);
            intent.setType(BuildConfig.FLAVOR + Const.SERVICE_START_INTENTNAME);
            intent.putExtra(Const.SERVICE_START_INTENTNAME, 0);
            if (Build.VERSION.SDK_INT < 26) {
                applicationContext.startService(intent);
                return;
            }
            AlimiInterface alimiInterface = this.alimiInterface;
            if (alimiInterface == null || Const.bindFlag) {
                return;
            }
            alimiInterface.autoLogin();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        AlimiInterface alimiInterface = this.alimiInterface;
        if (alimiInterface != null) {
            alimiInterface.termSmartBroker();
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i8, int i9) {
        LogFile.log("MessageManager", 5, "OnStart Command");
        WakeLockManager wakeLockManager = null;
        if (intent != null) {
            try {
                try {
                } catch (Exception e8) {
                    e = e8;
                }
            } catch (NullPointerException e9) {
                LogFile.log("MessageManager", 1, "MessageManager Intent Null OnStartCommand " + e9.getMessage());
            }
            if (!this.alimiInterface.getSavedUserID().equals("")) {
                if (!intent.getType().equals("korailstartStatus")) {
                    LogFile.log("MessageManager", 5, "OnCommand Intent Type not Matched");
                    return super.onStartCommand(intent, 1, 1);
                }
                int intExtra = intent.getIntExtra(Const.SERVICE_START_INTENTNAME, -1);
                if (intExtra == 0) {
                    LogFile.log("MessageManager", 2, "onStartCommand:  bootcompleted");
                    AlimiInterface alimiInterface = this.alimiInterface;
                    if (alimiInterface != null && !Const.bindFlag) {
                        alimiInterface.autoLogin();
                    }
                    return super.onStartCommand(intent, 1, 1);
                }
                if (intExtra == 99) {
                    LogFile.log("MessageManager", 2, "onStartCommand:  getnewmessage ");
                    if (this.alimiInterface == null) {
                        this.alimiInterface = new AlimiInterface(getApplicationContext());
                    }
                    if (Const.brokerPushType == 0) {
                        this.alimiInterface.getNewMessageAndNoti(true);
                    }
                } else if (intExtra == 2) {
                    LogFile.log("MessageManager", 5, "MessageManager OnStartCommand + alram start");
                    if (this.alimiInterface != null && Const.brokerPushType != 0) {
                        WakeLockManager wakeLockManager2 = new WakeLockManager();
                        try {
                            LogFile.log("MessageManager", 5, "wakeLock Lock !!!");
                            wakeLockManager2.onWakeLockStart(getApplicationContext());
                            if (!this.alimiInterface.isTryConnectErbBroker()) {
                                AlimiInterface.reconnStep = 0;
                                if (NetworkStatusReceiver.isOnline(getApplicationContext()) != 1) {
                                    this.alimiInterface.erbTerm();
                                }
                                if (this.alimiInterface.SessionCheck() != 1) {
                                    this.alimiInterface.tryConnectErbBroker();
                                }
                                nRetryCount = 0;
                                bRetryStart = false;
                            } else if (NetworkStatusReceiver.isOnline(getApplicationContext()) == 1) {
                                LogFile.log("MessageManager", 4, "line:120 >> 초기 retry룰 true!");
                                if (bRetryStart) {
                                    int i10 = nRetryCount + 1;
                                    nRetryCount = i10;
                                    if (i10 >= nRetryDelayCount) {
                                        AlimiInterface.reconnStep = 2;
                                        if (this.alimiInterface.tryConnectErbBroker() == 0) {
                                            bRetryStart = false;
                                            nRetryDelayCount = 0;
                                            AlimiInterface.reconnStep = 0;
                                        } else {
                                            nRetryDelayCount++;
                                        }
                                        if (nRetryDelayCount >= 10) {
                                            AlimiInterface.reconnStep = 3;
                                            LogFile.log("MessageManager", 4, "line:135 >> 10분당 retry 분당카운트 초기화!");
                                            nRetryDelayCount = 10;
                                            nRetryCount = 0;
                                        }
                                    }
                                } else {
                                    AlimiInterface.reconnStep = 1;
                                    if (this.alimiInterface.tryConnectErbBroker(3, 5) != 0) {
                                        bRetryStart = true;
                                        nRetryDelayCount = 1;
                                        nRetryCount = 0;
                                    } else {
                                        AlimiInterface.reconnStep = 0;
                                    }
                                }
                            } else {
                                LogFile.log("MessageManager", 1, "can't use to Network");
                            }
                            wakeLockManager2.onWakeLockStop();
                            LogFile.log("MessageManager", 5, "wakeLock release !!!");
                            this.alimiInterface.registerRestartAlarm(true);
                        } catch (Exception e10) {
                            e = e10;
                            wakeLockManager = wakeLockManager2;
                            LogFile.log("MessageManager", 1, "MessageManager OnStartCommand Exception " + e.getMessage());
                            if (wakeLockManager != null) {
                                wakeLockManager.onWakeLockStop();
                            }
                            return super.onStartCommand(intent, 1, 1);
                        }
                    }
                }
                return super.onStartCommand(intent, 1, 1);
            }
        }
        LogFile.log("MessageManager", 5, "OnCommand SaveID is NULL");
        return super.onStartCommand(intent, 1, 1);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}

package com.h2osystech.smartalimi.servicealimi.fcm;

import I2.AbstractC0608l;
import I2.InterfaceC0602f;
import android.content.Context;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import com.h2osystech.smartalimi.common.Const;
import com.h2osystech.smartalimi.common.LogFile;
import com.h2osystech.smartalimi.servicealimimodule.SharedData;

/* loaded from: classes2.dex */
public class FCMAdapter {
    private static final String TAG = "FCMAdapter";
    private static String strToken = "";
    private static final int waitTime = 8;

    /* renamed from: com.h2osystech.smartalimi.servicealimi.fcm.FCMAdapter$1 */
    class AnonymousClass1 implements InterfaceC0602f {
        AnonymousClass1() {
        }

        @Override // I2.InterfaceC0602f
        public void onComplete(AbstractC0608l abstractC0608l) {
            if (!abstractC0608l.isSuccessful()) {
                Log.w(FCMAdapter.TAG, "Fetching FCM registration token failed", abstractC0608l.getException());
                return;
            }
            String unused = FCMAdapter.strToken = (String) abstractC0608l.getResult();
            LogFile.log(FCMAdapter.TAG, 5, "get Token Success" + FCMAdapter.strToken);
        }
    }

    private void getToken() {
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new InterfaceC0602f() { // from class: com.h2osystech.smartalimi.servicealimi.fcm.FCMAdapter.1
            AnonymousClass1() {
            }

            @Override // I2.InterfaceC0602f
            public void onComplete(AbstractC0608l abstractC0608l) {
                if (!abstractC0608l.isSuccessful()) {
                    Log.w(FCMAdapter.TAG, "Fetching FCM registration token failed", abstractC0608l.getException());
                    return;
                }
                String unused = FCMAdapter.strToken = (String) abstractC0608l.getResult();
                LogFile.log(FCMAdapter.TAG, 5, "get Token Success" + FCMAdapter.strToken);
            }
        });
    }

    public String getToken(Context context) throws InterruptedException {
        getToken();
        int i8 = 0;
        while (true) {
            if (i8 >= 8) {
                break;
            }
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e8) {
                e8.printStackTrace();
            }
            if (!strToken.isEmpty()) {
                SharedData.setSharedData(context, "UserInfo", "gcmToken", strToken);
                Const.setGcmRegID(strToken);
                LogFile.log(TAG, 3, "getToken Success " + strToken);
                break;
            }
            LogFile.log(TAG, 0, "wait generate token " + i8);
            i8++;
        }
        return strToken;
    }
}

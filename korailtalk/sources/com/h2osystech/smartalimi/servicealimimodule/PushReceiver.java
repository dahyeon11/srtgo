package com.h2osystech.smartalimi.servicealimimodule;

import android.content.Context;
import android.os.Bundle;
import com.h2osystech.smartalimi.aidllib.MSGVo;

/* loaded from: classes2.dex */
public interface PushReceiver {
    void OnDisConnected(String str);

    void OnReceiveDup(MSGVo mSGVo);

    void OnReceiveEvData(MSGVo mSGVo);

    void OnReceiveGCM(Context context, Bundle bundle);

    void OnReceiveProc();

    void OnReceiveProc(MSGVo mSGVo);

    int OnReconnect();
}

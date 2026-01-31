package com.nhn.android.naverlogin;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public abstract class OAuthLoginHandler extends Handler {
    public OAuthLoginHandler() {
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        run(message.what == 1);
    }

    public abstract void run(boolean z8);

    public OAuthLoginHandler(Looper looper) {
        super(looper);
    }
}

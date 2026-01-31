package com.korail.talk.network;

import y4.C6536a;

/* loaded from: classes.dex */
public interface IBase {
    void executeDao(IBaseDao iBaseDao);

    void executeRetryDao();

    boolean isFinishing();

    void onCancelDao();

    void onReceive(IBaseDao iBaseDao);

    void onReceiveError(IBaseDao iBaseDao, C6536a c6536a);
}

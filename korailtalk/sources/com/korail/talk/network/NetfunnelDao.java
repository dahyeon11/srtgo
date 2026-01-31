package com.korail.talk.network;

import A6.g;
import android.os.Handler;
import p4.C6054a;
import u4.c;
import u4.e;

/* loaded from: classes.dex */
public class NetfunnelDao {
    private c mCLoadingDialog;
    private Handler mHandler;
    private e mNetfunnelDialog;
    private Runnable mRunner;

    public NetfunnelDao(c cVar, e eVar, Runnable runnable, Handler handler) {
        this.mCLoadingDialog = cVar;
        this.mNetfunnelDialog = eVar;
        this.mRunner = runnable;
        this.mHandler = handler;
    }

    public void runRunner() {
        this.mHandler.post(new Runnable() { // from class: com.korail.talk.network.NetfunnelDao.1
            @Override // java.lang.Runnable
            public void run() {
                if (NetfunnelDao.this.mNetfunnelDialog != null) {
                    NetfunnelDao.this.mNetfunnelDialog.dismissDialog();
                    NetfunnelDao.this.mNetfunnelDialog.finished();
                }
                if (NetfunnelDao.this.mCLoadingDialog != null) {
                    try {
                        NetfunnelDao.this.mCLoadingDialog.dismiss();
                    } catch (Exception e8) {
                        if (C6054a.IS_DEBUG_LOG) {
                            e8.printStackTrace();
                        }
                    }
                }
                g.END();
                if (NetfunnelDao.this.mRunner != null) {
                    NetfunnelDao.this.mRunner.run();
                }
            }
        });
    }
}

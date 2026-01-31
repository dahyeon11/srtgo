package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import f2.C5392b;
import i2.AbstractC5670c;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class IT implements AbstractC5670c.a, AbstractC5670c.b {

    /* renamed from: a */
    protected final C1203Bt f13466a = new C1203Bt();

    /* renamed from: b */
    protected final Object f13467b = new Object();

    /* renamed from: c */
    protected boolean f13468c = false;

    /* renamed from: d */
    protected boolean f13469d = false;

    /* renamed from: e */
    protected C2519cr f13470e;

    /* renamed from: f */
    protected C5027yq f13471f;

    static void b(Context context, com.google.common.util.concurrent.C c9, Executor executor) {
        if (((Boolean) AbstractC3189ii.zzj.zze()).booleanValue() || ((Boolean) AbstractC3189ii.zzh.zze()).booleanValue()) {
            AbstractC1483In0.zzr(c9, new GT(context), executor);
        }
    }

    protected final void a() {
        synchronized (this.f13467b) {
            try {
                this.f13469d = true;
                if (this.f13471f.isConnected() || this.f13471f.isConnecting()) {
                    this.f13471f.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i2.AbstractC5670c.a
    public abstract /* synthetic */ void onConnected(Bundle bundle);

    public void onConnectionFailed(C5392b c5392b) {
        L1.n.zze("Disconnected from remote ad request service.");
        this.f13466a.zzd(new YT(1));
    }

    @Override // i2.AbstractC5670c.a
    public final void onConnectionSuspended(int i8) {
        L1.n.zze("Cannot connect to remote service, fallback to local instance.");
    }
}

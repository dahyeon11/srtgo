package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
final class FW extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AlertDialog f13034a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Timer f13035b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ J1.u f13036c;

    FW(GW gw, AlertDialog alertDialog, Timer timer, J1.u uVar) {
        this.f13034a = alertDialog;
        this.f13035b = timer;
        this.f13036c = uVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f13034a.dismiss();
        this.f13035b.cancel();
        J1.u uVar = this.f13036c;
        if (uVar != null) {
            uVar.zzb();
        }
    }
}

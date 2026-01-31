package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import f2.C5392b;
import f2.C5397g;
import g2.AbstractC5544f;
import h2.C5588e;
import h2.InterfaceC5589f;
import i2.AbstractC5683p;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class s0 extends w0 {

    /* renamed from: f, reason: collision with root package name */
    private final SparseArray f12092f;

    private s0(InterfaceC5589f interfaceC5589f) {
        super(interfaceC5589f, C5397g.getInstance());
        this.f12092f = new SparseArray();
        this.f11930a.addCallback("AutoManageHelper", this);
    }

    private final r0 i(int i8) {
        if (this.f12092f.size() <= i8) {
            return null;
        }
        SparseArray sparseArray = this.f12092f;
        return (r0) sparseArray.get(sparseArray.keyAt(i8));
    }

    public static s0 zaa(C5588e c5588e) {
        InterfaceC5589f interfaceC5589fA = LifecycleCallback.a(c5588e);
        s0 s0Var = (s0) interfaceC5589fA.getCallbackOrNull("AutoManageHelper", s0.class);
        return s0Var != null ? s0Var : new s0(interfaceC5589fA);
    }

    @Override // com.google.android.gms.common.api.internal.w0
    protected final void c(C5392b c5392b, int i8) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i8 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        r0 r0Var = (r0) this.f12092f.get(i8);
        if (r0Var != null) {
            zae(i8);
            AbstractC5544f.c cVar = r0Var.zac;
            if (cVar != null) {
                cVar.onConnectionFailed(c5392b);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.w0
    protected final void d() {
        for (int i8 = 0; i8 < this.f12092f.size(); i8++) {
            r0 r0VarI = i(i8);
            if (r0VarI != null) {
                r0VarI.zab.connect();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i8 = 0; i8 < this.f12092f.size(); i8++) {
            r0 r0VarI = i(i8);
            if (r0VarI != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(r0VarI.zaa);
                printWriter.println(":");
                r0VarI.zab.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.w0, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        boolean z8 = this.f12107b;
        String strValueOf = String.valueOf(this.f12092f);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 14);
        sb.append("onStart ");
        sb.append(z8);
        sb.append(Q7.X.SPACE);
        sb.append(strValueOf);
        if (this.f12108c.get() == null) {
            for (int i8 = 0; i8 < this.f12092f.size(); i8++) {
                r0 r0VarI = i(i8);
                if (r0VarI != null) {
                    r0VarI.zab.connect();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.w0, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        for (int i8 = 0; i8 < this.f12092f.size(); i8++) {
            r0 r0VarI = i(i8);
            if (r0VarI != null) {
                r0VarI.zab.disconnect();
            }
        }
    }

    public final void zad(int i8, AbstractC5544f abstractC5544f, AbstractC5544f.c cVar) {
        AbstractC5683p.checkNotNull(abstractC5544f, "GoogleApiClient instance cannot be null");
        boolean z8 = this.f12092f.indexOfKey(i8) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i8);
        AbstractC5683p.checkState(z8, sb.toString());
        t0 t0Var = (t0) this.f12108c.get();
        boolean z9 = this.f12107b;
        String strValueOf = String.valueOf(t0Var);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i8);
        sb2.append(Q7.X.SPACE);
        sb2.append(z9);
        sb2.append(Q7.X.SPACE);
        sb2.append(strValueOf);
        r0 r0Var = new r0(this, i8, abstractC5544f, cVar);
        abstractC5544f.registerConnectionFailedListener(r0Var);
        this.f12092f.put(i8, r0Var);
        if (this.f12107b && t0Var == null) {
            "connecting ".concat(abstractC5544f.toString());
            abstractC5544f.connect();
        }
    }

    public final void zae(int i8) {
        r0 r0Var = (r0) this.f12092f.get(i8);
        this.f12092f.remove(i8);
        if (r0Var != null) {
            r0Var.zab.unregisterConnectionFailedListener(r0Var);
            r0Var.zab.disconnect();
        }
    }
}

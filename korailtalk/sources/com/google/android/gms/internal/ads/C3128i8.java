package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.i8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3128i8 {
    public static final boolean zza = C3241j8.zzb;

    /* renamed from: a, reason: collision with root package name */
    private final List f19891a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private boolean f19892b = false;

    C3128i8() {
    }

    protected final void finalize() {
        if (this.f19892b) {
            return;
        }
        zzb("Request on the loose");
        C3241j8.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j8) {
        if (this.f19892b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f19891a.add(new C3013h8(str, j8, SystemClock.elapsedRealtime()));
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    public final synchronized void zzb(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 1
            r8.f19892b = r0     // Catch: java.lang.Throwable -> L75
            java.util.List r0 = r8.f19891a     // Catch: java.lang.Throwable -> L75
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L75
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L11
            r6 = r2
            goto L2c
        L11:
            java.util.List r0 = r8.f19891a     // Catch: java.lang.Throwable -> L75
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.internal.ads.h8 r0 = (com.google.android.gms.internal.ads.C3013h8) r0     // Catch: java.lang.Throwable -> L75
            long r4 = r0.zzc     // Catch: java.lang.Throwable -> L75
            java.util.List r0 = r8.f19891a     // Catch: java.lang.Throwable -> L75
            int r6 = r0.size()     // Catch: java.lang.Throwable -> L75
            int r6 = r6 + (-1)
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.internal.ads.h8 r0 = (com.google.android.gms.internal.ads.C3013h8) r0     // Catch: java.lang.Throwable -> L75
            long r6 = r0.zzc     // Catch: java.lang.Throwable -> L75
            long r6 = r6 - r4
        L2c:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L31
            goto L77
        L31:
            java.util.List r0 = r8.f19891a     // Catch: java.lang.Throwable -> L75
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.internal.ads.h8 r0 = (com.google.android.gms.internal.ads.C3013h8) r0     // Catch: java.lang.Throwable -> L75
            long r0 = r0.zzc     // Catch: java.lang.Throwable -> L75
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L75
            java.lang.Object[] r9 = new java.lang.Object[]{r2, r9}     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = "(%-4d ms) %s"
            com.google.android.gms.internal.ads.C3241j8.zza(r2, r9)     // Catch: java.lang.Throwable -> L75
            java.util.List r9 = r8.f19891a     // Catch: java.lang.Throwable -> L75
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L75
        L4e:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L75
            if (r2 == 0) goto L77
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.internal.ads.h8 r2 = (com.google.android.gms.internal.ads.C3013h8) r2     // Catch: java.lang.Throwable -> L75
            long r3 = r2.zzc     // Catch: java.lang.Throwable -> L75
            long r0 = r3 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L75
            long r5 = r2.zzb     // Catch: java.lang.Throwable -> L75
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = r2.zza     // Catch: java.lang.Throwable -> L75
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = "(+%-4d) [%2d] %s"
            com.google.android.gms.internal.ads.C3241j8.zza(r1, r0)     // Catch: java.lang.Throwable -> L75
            r0 = r3
            goto L4e
        L75:
            r9 = move-exception
            goto L79
        L77:
            monitor-exit(r8)
            return
        L79:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L75
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3128i8.zzb(java.lang.String):void");
    }
}

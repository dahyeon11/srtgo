package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import K1.C0638g0;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Qm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1807Qm implements InterfaceC2278al {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC5019ym f16018a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C0638g0 f16019b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2740en f16020c;

    C1807Qm(C2740en c2740en, C2487cb c2487cb, InterfaceC5019ym interfaceC5019ym, C0638g0 c0638g0) {
        this.f16018a = interfaceC5019ym;
        this.f16019b = c0638g0;
        this.f16020c = c2740en;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.al, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        AbstractC0667v0.zza("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        synchronized (this.f16020c.f18817a) {
            try {
                AbstractC0667v0.zza("loadJavascriptEngine > /requestReload handler: Lock acquired");
                L1.n.zzi("JS Engine is requesting an update");
                if (this.f16020c.f18825i == 0) {
                    L1.n.zzi("Starting reload.");
                    this.f16020c.f18825i = 2;
                    this.f16020c.c(null);
                }
                this.f16018a.zzr("/requestReload", this.f16019b.zza());
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0667v0.zza("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}

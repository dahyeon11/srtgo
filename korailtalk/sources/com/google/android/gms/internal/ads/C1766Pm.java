package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Pm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1766Pm implements InterfaceC2278al {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f15406a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2626dn f15407b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC5019ym f15408c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2740en f15409d;

    C1766Pm(C2740en c2740en, long j8, C2626dn c2626dn, InterfaceC5019ym interfaceC5019ym) {
        this.f15406a = j8;
        this.f15407b = c2626dn;
        this.f15408c = interfaceC5019ym;
        this.f15409d = c2740en;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        AbstractC0667v0.zza("onGmsg /jsLoaded. JsLoaded latency is " + (G1.u.zzB().currentTimeMillis() - this.f15406a) + " ms.");
        AbstractC0667v0.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        synchronized (this.f15409d.f18817a) {
            AbstractC0667v0.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (this.f15407b.zze() != -1 && this.f15407b.zze() != 1) {
                this.f15409d.f18825i = 0;
                InterfaceC5019ym interfaceC5019ym = this.f15408c;
                interfaceC5019ym.zzq("/log", AbstractC2172Zk.zzg);
                interfaceC5019ym.zzq("/result", AbstractC2172Zk.zzo);
                this.f15407b.zzi(this.f15408c);
                this.f15409d.f18824h = this.f15407b;
                AbstractC0667v0.zza("Successfully loaded JS Engine.");
                AbstractC0667v0.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            AbstractC0667v0.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}

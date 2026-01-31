package com.google.android.gms.internal.ads;

import H1.C0591z;
import K1.AbstractC0667v0;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Gm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1398Gm implements InterfaceC5019ym, InterfaceC4791wm {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2065Wv f13196a;

    /* JADX WARN: Multi-variable type inference failed */
    public C1398Gm(Context context, L1.a aVar, C2487cb c2487cb, G1.a aVar2) throws C3444kw {
        G1.u.zzz();
        InterfaceC2065Wv interfaceC2065WvZza = C3558lw.zza(context, C1943Tw.zza(), "", false, false, null, null, aVar, null, null, null, C4775we.zza(), null, null, null, null);
        this.f13196a = interfaceC2065WvZza;
        ((View) interfaceC2065WvZza).setWillNotDraw(true);
    }

    private static final void e(Runnable runnable) {
        C0591z.zzb();
        if (L1.g.zzv()) {
            AbstractC0667v0.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            AbstractC0667v0.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (K1.K0.zza.post(runnable)) {
                return;
            }
            L1.n.zzj("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    final /* synthetic */ void a(String str) {
        this.f13196a.zza(str);
    }

    final /* synthetic */ void b(String str) {
        this.f13196a.loadData(str, "text/html", "UTF-8");
    }

    final /* synthetic */ void c(String str) {
        this.f13196a.loadUrl(str);
    }

    final /* synthetic */ void d(String str) {
        this.f13196a.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5019ym, com.google.android.gms.internal.ads.InterfaceC2855fn, com.google.android.gms.internal.ads.InterfaceC1439Hm, com.google.android.gms.internal.ads.InterfaceC4791wm
    public final void zza(final String str) {
        AbstractC0667v0.zza("invokeJavascript on adWebView from js");
        e(new Runnable() { // from class: com.google.android.gms.internal.ads.Cm
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.a(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5019ym, com.google.android.gms.internal.ads.InterfaceC2855fn, com.google.android.gms.internal.ads.InterfaceC1439Hm, com.google.android.gms.internal.ads.InterfaceC4791wm
    public final /* synthetic */ void zzb(String str, String str2) {
        AbstractC4677vm.zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5019ym
    public final void zzc() {
        this.f13196a.destroy();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5019ym, com.google.android.gms.internal.ads.InterfaceC2855fn, com.google.android.gms.internal.ads.InterfaceC4563um, com.google.android.gms.internal.ads.InterfaceC4791wm
    public final /* synthetic */ void zzd(String str, Map map) {
        AbstractC4677vm.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5019ym, com.google.android.gms.internal.ads.InterfaceC2855fn, com.google.android.gms.internal.ads.InterfaceC4563um, com.google.android.gms.internal.ads.InterfaceC4791wm
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        AbstractC4677vm.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5019ym
    public final void zzf(final String str) {
        AbstractC0667v0.zza("loadHtml on adWebView from html");
        e(new Runnable() { // from class: com.google.android.gms.internal.ads.Dm
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.b(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5019ym
    public final void zzg(final String str) {
        AbstractC0667v0.zza("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        e(new Runnable() { // from class: com.google.android.gms.internal.ads.Am
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.c(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5019ym
    public final void zzh(String str) {
        AbstractC0667v0.zza("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String str2 = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        e(new Runnable() { // from class: com.google.android.gms.internal.ads.Em
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.d(str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5019ym
    public final boolean zzi() {
        return this.f13196a.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5019ym
    public final C2970gn zzj() {
        return new C2970gn(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5019ym
    public final void zzk(final C1684Nm c1684Nm) {
        InterfaceC1861Rw interfaceC1861RwZzN = this.f13196a.zzN();
        Objects.requireNonNull(c1684Nm);
        interfaceC1861RwZzN.zzH(new InterfaceC1820Qw() { // from class: com.google.android.gms.internal.ads.Bm
            @Override // com.google.android.gms.internal.ads.InterfaceC1820Qw
            public final void zza() {
                long jCurrentTimeMillis = G1.u.zzB().currentTimeMillis();
                C1684Nm c1684Nm2 = c1684Nm;
                final long j8 = c1684Nm2.zzc;
                final ArrayList arrayList = c1684Nm2.zzb;
                arrayList.add(Long.valueOf(jCurrentTimeMillis - j8));
                AbstractC0667v0.zza("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                HandlerC1634Mh0 handlerC1634Mh0 = K1.K0.zza;
                final C2740en c2740en = c1684Nm2.zza;
                final C2626dn c2626dn = c1684Nm2.zzd;
                final InterfaceC5019ym interfaceC5019ym = c1684Nm2.zze;
                handlerC1634Mh0.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.Im
                    @Override // java.lang.Runnable
                    public final void run() {
                        c2740en.h(c2626dn, interfaceC5019ym, arrayList, j8);
                    }
                }, ((Integer) H1.C.zzc().zza(AbstractC4439th.zzc)).intValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5019ym, com.google.android.gms.internal.ads.InterfaceC2855fn, com.google.android.gms.internal.ads.InterfaceC1439Hm, com.google.android.gms.internal.ads.InterfaceC4791wm
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        AbstractC4677vm.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5019ym, com.google.android.gms.internal.ads.InterfaceC2855fn
    public final void zzq(String str, InterfaceC2278al interfaceC2278al) {
        this.f13196a.zzag(str, new C1357Fm(this, interfaceC2278al));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5019ym, com.google.android.gms.internal.ads.InterfaceC2855fn
    public final void zzr(String str, final InterfaceC2278al interfaceC2278al) {
        this.f13196a.zzaA(str, new o2.o() { // from class: com.google.android.gms.internal.ads.zm
            @Override // o2.o
            public final boolean apply(Object obj) {
                InterfaceC2278al interfaceC2278al2 = (InterfaceC2278al) obj;
                if (interfaceC2278al2 instanceof C1357Fm) {
                    return ((C1357Fm) interfaceC2278al2).f13063a.equals(interfaceC2278al);
                }
                return false;
            }
        });
    }
}

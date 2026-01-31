package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.uV, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4534uV extends AbstractBinderC1732Oq {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23054a;

    /* renamed from: b, reason: collision with root package name */
    private final E60 f23055b;

    /* renamed from: c, reason: collision with root package name */
    private final C60 f23056c;

    /* renamed from: d, reason: collision with root package name */
    private final CV f23057d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f23058e;

    /* renamed from: f, reason: collision with root package name */
    private final C5104zV f23059f;

    /* renamed from: g, reason: collision with root package name */
    private final C3662mr f23060g;

    BinderC4534uV(Context context, E60 e60, C60 c60, C5104zV c5104zV, CV cv, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, C3662mr c3662mr) {
        this.f23054a = context;
        this.f23055b = e60;
        this.f23056c = c60;
        this.f23059f = c5104zV;
        this.f23057d = cv;
        this.f23058e = interfaceExecutorServiceC1974Un0;
        this.f23060g = c3662mr;
    }

    private final void b(com.google.common.util.concurrent.C c9, InterfaceC1896Sq interfaceC1896Sq) {
        AbstractC1483In0.zzr(AbstractC1483In0.zzn(AbstractC5136zn0.zzu(c9), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.qV
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return AbstractC1483In0.zzh(AbstractC4428tb0.zza((InputStream) obj));
            }
        }, AbstractC4805wt.zza), new C4306sV(this, interfaceC1896Sq), AbstractC4805wt.zzf);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.util.concurrent.C zzb(com.google.android.gms.internal.ads.C1405Gq r9, int r10) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.wV r7 = new com.google.android.gms.internal.ads.wV
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            android.os.Bundle r0 = r9.zzc
            if (r0 == 0) goto L29
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = r0.getString(r2)
            if (r4 == 0) goto L13
            r3.put(r2, r4)
            goto L13
        L29:
            int r2 = r9.zzb
            java.lang.String r1 = r9.zza
            byte[] r4 = r9.zzd
            boolean r6 = r9.zze
            java.lang.String r5 = ""
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.google.android.gms.internal.ads.C60 r0 = r8.f23056c
            com.google.android.gms.internal.ads.n70 r1 = new com.google.android.gms.internal.ads.n70
            r1.<init>(r9)
            r0.zza(r1)
            boolean r1 = r7.zzf
            com.google.android.gms.internal.ads.D60 r0 = r0.zzb()
            if (r1 == 0) goto Laa
            java.lang.String r9 = r9.zza
            com.google.android.gms.internal.ads.ai r1 = com.google.android.gms.internal.ads.AbstractC4897xi.zzb
            java.lang.Object r1 = r1.zze()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L5a
            goto Laa
        L5a:
            android.net.Uri r9 = android.net.Uri.parse(r9)
            java.lang.String r9 = r9.getHost()
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 != 0) goto Laa
            r2 = 59
            com.google.android.gms.internal.ads.lj0 r2 = com.google.android.gms.internal.ads.AbstractC3533lj0.zzc(r2)
            com.google.android.gms.internal.ads.Oj0 r2 = com.google.android.gms.internal.ads.C1720Oj0.zzc(r2)
            java.lang.Iterable r1 = r2.zzd(r1)
            java.util.Iterator r1 = r1.iterator()
        L7a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Laa
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r9.endsWith(r2)
            if (r2 == 0) goto L7a
            com.google.android.gms.internal.ads.Q50 r9 = r0.zza()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            com.google.common.util.concurrent.C r9 = r9.zza(r1, r2)
            com.google.android.gms.internal.ads.lV r1 = new com.google.android.gms.internal.ads.lV
            r1.<init>()
            com.google.android.gms.internal.ads.Un0 r2 = r8.f23058e
            com.google.common.util.concurrent.C r9 = com.google.android.gms.internal.ads.AbstractC1483In0.zzm(r9, r1, r2)
            goto Lae
        Laa:
            com.google.common.util.concurrent.C r9 = com.google.android.gms.internal.ads.AbstractC1483In0.zzh(r7)
        Lae:
            com.google.android.gms.internal.ads.ad0 r0 = r0.zzb()
            android.content.Context r1 = r8.f23054a
            com.google.android.gms.internal.ads.mr r2 = r8.f23060g
            com.google.android.gms.internal.ads.yV r3 = new com.google.android.gms.internal.ads.yV
            java.lang.String r4 = ""
            r3.<init>(r1, r4, r2, r10)
            com.google.android.gms.internal.ads.Uc0 r10 = com.google.android.gms.internal.ads.EnumC1952Uc0.HTTP
            com.google.android.gms.internal.ads.Rc0 r9 = r0.zzb(r10, r9)
            com.google.android.gms.internal.ads.Rc0 r9 = r9.zze(r3)
            com.google.android.gms.internal.ads.Ec0 r9 = r9.zza()
            com.google.android.gms.internal.ads.mV r10 = new com.google.android.gms.internal.ads.mV
            r10.<init>()
            com.google.android.gms.internal.ads.Un0 r0 = r8.f23058e
            com.google.common.util.concurrent.C r9 = com.google.android.gms.internal.ads.AbstractC1483In0.zzn(r9, r10, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC4534uV.zzb(com.google.android.gms.internal.ads.Gq, int):com.google.common.util.concurrent.C");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1732Oq, com.google.android.gms.internal.ads.InterfaceC1773Pq
    public final void zze(C1405Gq c1405Gq, InterfaceC1896Sq interfaceC1896Sq) {
        b(zzb(c1405Gq, Binder.getCallingUid()), interfaceC1896Sq);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1732Oq, com.google.android.gms.internal.ads.InterfaceC1773Pq
    public final void zzf(C1241Cq c1241Cq, InterfaceC1896Sq interfaceC1896Sq) {
        C4377t60 c4377t60 = new C4377t60(c1241Cq, Binder.getCallingUid());
        E60 e60 = this.f23055b;
        e60.zza(c4377t60);
        final F60 f60Zzb = e60.zzb();
        C2263ad0 c2263ad0Zzb = f60Zzb.zzb();
        C1297Ec0 c1297Ec0Zza = c2263ad0Zzb.zzb(EnumC1952Uc0.GMS_SIGNALS, AbstractC1483In0.zzi()).zzf(new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.pV
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return f60Zzb.zza().zza(new JSONObject(), new Bundle());
            }
        }).zze(new InterfaceC1215Cc0() { // from class: com.google.android.gms.internal.ads.oV
            @Override // com.google.android.gms.internal.ads.InterfaceC1215Cc0
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                AbstractC0667v0.zza("GMS AdRequest Signals: ");
                AbstractC0667v0.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zzf(new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.nV
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return AbstractC1483In0.zzh(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).zza();
        b(c1297Ec0Zza, interfaceC1896Sq);
        if (((Boolean) AbstractC4100qi.zzf.zze()).booleanValue()) {
            final CV cv = this.f23057d;
            Objects.requireNonNull(cv);
            c1297Ec0Zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.rV
                @Override // java.lang.Runnable
                public final void run() {
                    cv.zzb();
                }
            }, this.f23058e);
        }
    }
}

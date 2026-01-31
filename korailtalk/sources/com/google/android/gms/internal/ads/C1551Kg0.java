package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.korail.talk.network.dao.research.CmtrInfoDao;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Kg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1551Kg0 implements InterfaceC1999Vf0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f13850a;

    /* renamed from: b, reason: collision with root package name */
    private final C1592Lg0 f13851b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2083Xg0 f13852c;

    /* renamed from: d, reason: collision with root package name */
    private final C1876Sf0 f13853d;

    C1551Kg0(Object obj, C1592Lg0 c1592Lg0, InterfaceC2083Xg0 interfaceC2083Xg0, C1876Sf0 c1876Sf0) {
        this.f13850a = obj;
        this.f13851b = c1592Lg0;
        this.f13852c = interfaceC2083Xg0;
        this.f13853d = c1876Sf0;
    }

    private static String c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        C3059ha c3059haZza = C3174ia.zza();
        c3059haZza.zzb(V9.DG);
        c3059haZza.zza(AbstractC3677my0.zzv(bArr, 0, bArr.length));
        return Base64.encodeToString(((C3174ia) c3059haZza.zzbr()).zzaV(), 11);
    }

    private final synchronized byte[] d(Map map, Map map2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e8) {
            this.f13853d.zzc(2007, System.currentTimeMillis() - jCurrentTimeMillis, e8);
            return null;
        }
        return (byte[]) this.f13850a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f13850a, null, map2);
    }

    final C1592Lg0 a() {
        return this.f13851b;
    }

    final synchronized boolean b() {
        try {
        } catch (Exception e8) {
            throw new C2001Vg0(2001, e8);
        }
        return ((Boolean) this.f13850a.getClass().getDeclaredMethod("init", null).invoke(this.f13850a, null)).booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1999Vf0
    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map mapZza;
        mapZza = this.f13852c.zza();
        mapZza.put("f", CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_C);
        mapZza.put("ctx", context);
        mapZza.put("cs", str2);
        mapZza.put("aid", null);
        mapZza.put("view", view);
        mapZza.put("act", activity);
        return c(d(null, mapZza));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1999Vf0
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map mapZzc;
        mapZzc = this.f13852c.zzc();
        mapZzc.put("f", "v");
        mapZzc.put("ctx", context);
        mapZzc.put("aid", null);
        mapZzc.put("view", view);
        mapZzc.put("act", activity);
        return c(d(null, mapZzc));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1999Vf0
    public final synchronized String zzc(Context context, String str) {
        Map mapZzb;
        mapZzb = this.f13852c.zzb();
        mapZzb.put("f", "q");
        mapZzb.put("ctx", context);
        mapZzb.put("aid", null);
        return c(d(null, mapZzb));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1999Vf0
    public final synchronized void zzd(String str, MotionEvent motionEvent) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("t", new Throwable());
            map.put("aid", null);
            map.put("evt", motionEvent);
            this.f13850a.getClass().getDeclaredMethod("he", Map.class).invoke(this.f13850a, map);
            this.f13853d.zzd(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e8) {
            throw new C2001Vg0(2005, e8);
        }
    }

    public final synchronized int zze() {
        try {
        } catch (Exception e8) {
            throw new C2001Vg0(2006, e8);
        }
        return ((Integer) this.f13850a.getClass().getDeclaredMethod("lcs", null).invoke(this.f13850a, null)).intValue();
    }

    public final synchronized void zzg() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f13850a.getClass().getDeclaredMethod("close", null).invoke(this.f13850a, null);
            this.f13853d.zzd(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e8) {
            throw new C2001Vg0(2003, e8);
        }
    }
}

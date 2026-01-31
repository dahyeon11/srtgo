package com.google.android.gms.internal.ads;

import H1.BinderC0569r1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import java.util.Collections;
import java.util.List;
import r2.InterfaceC6172a;

/* loaded from: classes2.dex */
public final class SL {

    /* renamed from: a */
    private int f16245a;

    /* renamed from: b */
    private H1.V0 f16246b;

    /* renamed from: c */
    private InterfaceC2004Vi f16247c;

    /* renamed from: d */
    private View f16248d;

    /* renamed from: e */
    private List f16249e;

    /* renamed from: g */
    private BinderC0569r1 f16251g;

    /* renamed from: h */
    private Bundle f16252h;

    /* renamed from: i */
    private InterfaceC2065Wv f16253i;

    /* renamed from: j */
    private InterfaceC2065Wv f16254j;

    /* renamed from: k */
    private InterfaceC2065Wv f16255k;

    /* renamed from: l */
    private C2597dX f16256l;

    /* renamed from: m */
    private com.google.common.util.concurrent.C f16257m;

    /* renamed from: n */
    private C1203Bt f16258n;

    /* renamed from: o */
    private View f16259o;

    /* renamed from: p */
    private View f16260p;

    /* renamed from: q */
    private InterfaceC6172a f16261q;

    /* renamed from: r */
    private double f16262r;

    /* renamed from: s */
    private InterfaceC2503cj f16263s;

    /* renamed from: t */
    private InterfaceC2503cj f16264t;

    /* renamed from: u */
    private String f16265u;

    /* renamed from: x */
    private float f16268x;

    /* renamed from: y */
    private String f16269y;

    /* renamed from: v */
    private final O.h f16266v = new O.h();

    /* renamed from: w */
    private final O.h f16267w = new O.h();

    /* renamed from: f */
    private List f16250f = Collections.emptyList();

    private static RL a(H1.V0 v02, InterfaceC3087ho interfaceC3087ho) {
        if (v02 == null) {
            return null;
        }
        return new RL(v02, interfaceC3087ho);
    }

    private static SL b(H1.V0 v02, InterfaceC2004Vi interfaceC2004Vi, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, InterfaceC6172a interfaceC6172a, String str4, String str5, double d9, InterfaceC2503cj interfaceC2503cj, String str6, float f8) {
        SL sl = new SL();
        sl.f16245a = 6;
        sl.f16246b = v02;
        sl.f16247c = interfaceC2004Vi;
        sl.f16248d = view;
        sl.zzZ("headline", str);
        sl.f16249e = list;
        sl.zzZ("body", str2);
        sl.f16252h = bundle;
        sl.zzZ("call_to_action", str3);
        sl.f16259o = view2;
        sl.f16261q = interfaceC6172a;
        sl.zzZ("store", str4);
        sl.zzZ("price", str5);
        sl.f16262r = d9;
        sl.f16263s = interfaceC2503cj;
        sl.zzZ("advertiser", str6);
        sl.zzR(f8);
        return sl;
    }

    private static Object c(InterfaceC6172a interfaceC6172a) {
        if (interfaceC6172a == null) {
            return null;
        }
        return r2.b.unwrap(interfaceC6172a);
    }

    public static SL zzag(C2513co c2513co) {
        try {
            RL rlA = a(c2513co.zzg(), null);
            InterfaceC2004Vi interfaceC2004ViZzh = c2513co.zzh();
            View view = (View) c(c2513co.zzj());
            String strZzo = c2513co.zzo();
            List listZzr = c2513co.zzr();
            String strZzm = c2513co.zzm();
            Bundle bundleZzf = c2513co.zzf();
            String strZzn = c2513co.zzn();
            View view2 = (View) c(c2513co.zzk());
            InterfaceC6172a interfaceC6172aZzl = c2513co.zzl();
            String strZzq = c2513co.zzq();
            String strZzp = c2513co.zzp();
            double dZze = c2513co.zze();
            InterfaceC2503cj interfaceC2503cjZzi = c2513co.zzi();
            SL sl = new SL();
            sl.f16245a = 2;
            sl.f16246b = rlA;
            sl.f16247c = interfaceC2004ViZzh;
            sl.f16248d = view;
            sl.zzZ("headline", strZzo);
            sl.f16249e = listZzr;
            sl.zzZ("body", strZzm);
            sl.f16252h = bundleZzf;
            sl.zzZ("call_to_action", strZzn);
            sl.f16259o = view2;
            sl.f16261q = interfaceC6172aZzl;
            sl.zzZ("store", strZzq);
            sl.zzZ("price", strZzp);
            sl.f16262r = dZze;
            sl.f16263s = interfaceC2503cjZzi;
            return sl;
        } catch (RemoteException e8) {
            L1.n.zzk("Failed to get native ad from app install ad mapper", e8);
            return null;
        }
    }

    public static SL zzah(C2742eo c2742eo) {
        try {
            RL rlA = a(c2742eo.zzf(), null);
            InterfaceC2004Vi interfaceC2004ViZzg = c2742eo.zzg();
            View view = (View) c(c2742eo.zzi());
            String strZzo = c2742eo.zzo();
            List listZzp = c2742eo.zzp();
            String strZzm = c2742eo.zzm();
            Bundle bundleZze = c2742eo.zze();
            String strZzn = c2742eo.zzn();
            View view2 = (View) c(c2742eo.zzj());
            InterfaceC6172a interfaceC6172aZzk = c2742eo.zzk();
            String strZzl = c2742eo.zzl();
            InterfaceC2503cj interfaceC2503cjZzh = c2742eo.zzh();
            SL sl = new SL();
            sl.f16245a = 1;
            sl.f16246b = rlA;
            sl.f16247c = interfaceC2004ViZzg;
            sl.f16248d = view;
            sl.zzZ("headline", strZzo);
            sl.f16249e = listZzp;
            sl.zzZ("body", strZzm);
            sl.f16252h = bundleZze;
            sl.zzZ("call_to_action", strZzn);
            sl.f16259o = view2;
            sl.f16261q = interfaceC6172aZzk;
            sl.zzZ("advertiser", strZzl);
            sl.f16264t = interfaceC2503cjZzh;
            return sl;
        } catch (RemoteException e8) {
            L1.n.zzk("Failed to get native ad from content ad mapper", e8);
            return null;
        }
    }

    public static SL zzai(C2513co c2513co) {
        try {
            return b(a(c2513co.zzg(), null), c2513co.zzh(), (View) c(c2513co.zzj()), c2513co.zzo(), c2513co.zzr(), c2513co.zzm(), c2513co.zzf(), c2513co.zzn(), (View) c(c2513co.zzk()), c2513co.zzl(), c2513co.zzq(), c2513co.zzp(), c2513co.zze(), c2513co.zzi(), null, 0.0f);
        } catch (RemoteException e8) {
            L1.n.zzk("Failed to get native ad assets from app install ad mapper", e8);
            return null;
        }
    }

    public static SL zzaj(C2742eo c2742eo) {
        try {
            return b(a(c2742eo.zzf(), null), c2742eo.zzg(), (View) c(c2742eo.zzi()), c2742eo.zzo(), c2742eo.zzp(), c2742eo.zzm(), c2742eo.zze(), c2742eo.zzn(), (View) c(c2742eo.zzj()), c2742eo.zzk(), null, null, -1.0d, c2742eo.zzh(), c2742eo.zzl(), 0.0f);
        } catch (RemoteException e8) {
            L1.n.zzk("Failed to get native ad assets from content ad mapper", e8);
            return null;
        }
    }

    public static SL zzt(InterfaceC3087ho interfaceC3087ho) {
        try {
            return b(a(interfaceC3087ho.zzj(), interfaceC3087ho), interfaceC3087ho.zzk(), (View) c(interfaceC3087ho.zzm()), interfaceC3087ho.zzs(), interfaceC3087ho.zzv(), interfaceC3087ho.zzq(), interfaceC3087ho.zzi(), interfaceC3087ho.zzr(), (View) c(interfaceC3087ho.zzn()), interfaceC3087ho.zzo(), interfaceC3087ho.zzu(), interfaceC3087ho.zzt(), interfaceC3087ho.zze(), interfaceC3087ho.zzl(), interfaceC3087ho.zzp(), interfaceC3087ho.zzf());
        } catch (RemoteException e8) {
            L1.n.zzk("Failed to get native ad assets from unified ad mapper", e8);
            return null;
        }
    }

    public final synchronized String zzA() {
        return this.f16265u;
    }

    public final synchronized String zzB() {
        return zzF("headline");
    }

    public final synchronized String zzC() {
        return this.f16269y;
    }

    public final synchronized String zzD() {
        return zzF("price");
    }

    public final synchronized String zzE() {
        return zzF("store");
    }

    public final synchronized String zzF(String str) {
        return (String) this.f16267w.get(str);
    }

    public final synchronized List zzG() {
        return this.f16249e;
    }

    public final synchronized List zzH() {
        return this.f16250f;
    }

    public final synchronized void zzI() {
        try {
            InterfaceC2065Wv interfaceC2065Wv = this.f16253i;
            if (interfaceC2065Wv != null) {
                interfaceC2065Wv.destroy();
                this.f16253i = null;
            }
            InterfaceC2065Wv interfaceC2065Wv2 = this.f16254j;
            if (interfaceC2065Wv2 != null) {
                interfaceC2065Wv2.destroy();
                this.f16254j = null;
            }
            InterfaceC2065Wv interfaceC2065Wv3 = this.f16255k;
            if (interfaceC2065Wv3 != null) {
                interfaceC2065Wv3.destroy();
                this.f16255k = null;
            }
            com.google.common.util.concurrent.C c9 = this.f16257m;
            if (c9 != null) {
                c9.cancel(false);
                this.f16257m = null;
            }
            C1203Bt c1203Bt = this.f16258n;
            if (c1203Bt != null) {
                c1203Bt.cancel(false);
                this.f16258n = null;
            }
            this.f16256l = null;
            this.f16266v.clear();
            this.f16267w.clear();
            this.f16246b = null;
            this.f16247c = null;
            this.f16248d = null;
            this.f16249e = null;
            this.f16252h = null;
            this.f16259o = null;
            this.f16260p = null;
            this.f16261q = null;
            this.f16263s = null;
            this.f16264t = null;
            this.f16265u = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzJ(InterfaceC2004Vi interfaceC2004Vi) {
        this.f16247c = interfaceC2004Vi;
    }

    public final synchronized void zzK(String str) {
        this.f16265u = str;
    }

    public final synchronized void zzL(BinderC0569r1 binderC0569r1) {
        this.f16251g = binderC0569r1;
    }

    public final synchronized void zzM(InterfaceC2503cj interfaceC2503cj) {
        this.f16263s = interfaceC2503cj;
    }

    public final synchronized void zzN(String str, BinderC1758Pi binderC1758Pi) {
        if (binderC1758Pi == null) {
            this.f16266v.remove(str);
        } else {
            this.f16266v.put(str, binderC1758Pi);
        }
    }

    public final synchronized void zzO(InterfaceC2065Wv interfaceC2065Wv) {
        this.f16254j = interfaceC2065Wv;
    }

    public final synchronized void zzP(List list) {
        this.f16249e = list;
    }

    public final synchronized void zzQ(InterfaceC2503cj interfaceC2503cj) {
        this.f16264t = interfaceC2503cj;
    }

    public final synchronized void zzR(float f8) {
        this.f16268x = f8;
    }

    public final synchronized void zzS(List list) {
        this.f16250f = list;
    }

    public final synchronized void zzT(InterfaceC2065Wv interfaceC2065Wv) {
        this.f16255k = interfaceC2065Wv;
    }

    public final synchronized void zzU(com.google.common.util.concurrent.C c9) {
        this.f16257m = c9;
    }

    public final synchronized void zzV(String str) {
        this.f16269y = str;
    }

    public final synchronized void zzW(C2597dX c2597dX) {
        this.f16256l = c2597dX;
    }

    public final synchronized void zzX(C1203Bt c1203Bt) {
        this.f16258n = c1203Bt;
    }

    public final synchronized void zzY(double d9) {
        this.f16262r = d9;
    }

    public final synchronized void zzZ(String str, String str2) {
        if (str2 == null) {
            this.f16267w.remove(str);
        } else {
            this.f16267w.put(str, str2);
        }
    }

    public final synchronized double zza() {
        return this.f16262r;
    }

    public final synchronized void zzaa(int i8) {
        this.f16245a = i8;
    }

    public final synchronized void zzab(H1.V0 v02) {
        this.f16246b = v02;
    }

    public final synchronized void zzac(View view) {
        this.f16259o = view;
    }

    public final synchronized void zzad(InterfaceC2065Wv interfaceC2065Wv) {
        this.f16253i = interfaceC2065Wv;
    }

    public final synchronized void zzae(View view) {
        this.f16260p = view;
    }

    public final synchronized boolean zzaf() {
        return this.f16254j != null;
    }

    public final synchronized float zzb() {
        return this.f16268x;
    }

    public final synchronized int zzc() {
        return this.f16245a;
    }

    public final synchronized Bundle zzd() {
        try {
            if (this.f16252h == null) {
                this.f16252h = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f16252h;
    }

    public final synchronized View zze() {
        return this.f16248d;
    }

    public final synchronized View zzf() {
        return this.f16259o;
    }

    public final synchronized View zzg() {
        return this.f16260p;
    }

    public final synchronized O.h zzh() {
        return this.f16266v;
    }

    public final synchronized O.h zzi() {
        return this.f16267w;
    }

    public final synchronized H1.V0 zzj() {
        return this.f16246b;
    }

    public final synchronized BinderC0569r1 zzk() {
        return this.f16251g;
    }

    public final synchronized InterfaceC2004Vi zzl() {
        return this.f16247c;
    }

    public final InterfaceC2503cj zzm() {
        List list = this.f16249e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.f16249e.get(0);
        if (obj instanceof IBinder) {
            return AbstractBinderC2389bj.zzg((IBinder) obj);
        }
        return null;
    }

    public final synchronized InterfaceC2503cj zzn() {
        return this.f16263s;
    }

    public final synchronized InterfaceC2503cj zzo() {
        return this.f16264t;
    }

    public final synchronized C1203Bt zzp() {
        return this.f16258n;
    }

    public final synchronized InterfaceC2065Wv zzq() {
        return this.f16254j;
    }

    public final synchronized InterfaceC2065Wv zzr() {
        return this.f16255k;
    }

    public final synchronized InterfaceC2065Wv zzs() {
        return this.f16253i;
    }

    public final synchronized C2597dX zzu() {
        return this.f16256l;
    }

    public final synchronized InterfaceC6172a zzv() {
        return this.f16261q;
    }

    public final synchronized com.google.common.util.concurrent.C zzw() {
        return this.f16257m;
    }

    public final synchronized String zzx() {
        return zzF("advertiser");
    }

    public final synchronized String zzy() {
        return zzF("body");
    }

    public final synchronized String zzz() {
        return zzF("call_to_action");
    }
}

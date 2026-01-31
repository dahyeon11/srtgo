package com.google.android.gms.internal.ads;

import K1.InterfaceC0671x0;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.qt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4122qt implements InterfaceC3976pd {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0671x0 f22028b;

    /* renamed from: d, reason: collision with root package name */
    final C3780nt f22030d;

    /* renamed from: a, reason: collision with root package name */
    private final Object f22027a = new Object();

    /* renamed from: e, reason: collision with root package name */
    final HashSet f22031e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    final HashSet f22032f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private boolean f22033g = false;

    /* renamed from: c, reason: collision with root package name */
    private final C4008pt f22029c = new C4008pt();

    public C4122qt(String str, InterfaceC0671x0 interfaceC0671x0) {
        this.f22030d = new C3780nt(str, interfaceC0671x0);
        this.f22028b = interfaceC0671x0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3976pd
    public final void zza(boolean z8) {
        long jCurrentTimeMillis = G1.u.zzB().currentTimeMillis();
        if (!z8) {
            this.f22028b.zzu(jCurrentTimeMillis);
            this.f22028b.zzL(this.f22030d.f21361d);
            return;
        }
        if (jCurrentTimeMillis - this.f22028b.zzd() > ((Long) H1.C.zzc().zza(AbstractC4439th.zzaU)).longValue()) {
            this.f22030d.f21361d = -1;
        } else {
            this.f22030d.f21361d = this.f22028b.zzc();
        }
        this.f22033g = true;
    }

    public final int zzb() {
        int iZza;
        synchronized (this.f22027a) {
            iZza = this.f22030d.zza();
        }
        return iZza;
    }

    public final C2752et zzc(o2.f fVar, String str) {
        return new C2752et(fVar, this, this.f22029c.zza(), str);
    }

    public final String zzd() {
        return this.f22029c.zzb();
    }

    public final void zze(C2752et c2752et) {
        synchronized (this.f22027a) {
            this.f22031e.add(c2752et);
        }
    }

    public final void zzf() {
        synchronized (this.f22027a) {
            this.f22030d.zzc();
        }
    }

    public final void zzg() {
        synchronized (this.f22027a) {
            this.f22030d.zzd();
        }
    }

    public final void zzh() {
        synchronized (this.f22027a) {
            this.f22030d.zze();
        }
    }

    public final void zzi() {
        synchronized (this.f22027a) {
            this.f22030d.zzf();
        }
    }

    public final void zzj(H1.Y1 y12, long j8) {
        synchronized (this.f22027a) {
            this.f22030d.zzg(y12, j8);
        }
    }

    public final void zzk() {
        synchronized (this.f22027a) {
            this.f22030d.zzh();
        }
    }

    public final void zzl(HashSet hashSet) {
        synchronized (this.f22027a) {
            this.f22031e.addAll(hashSet);
        }
    }

    public final boolean zzm() {
        return this.f22033g;
    }

    public final Bundle zzn(Context context, C1131Ab0 c1131Ab0) {
        HashSet hashSet = new HashSet();
        synchronized (this.f22027a) {
            hashSet.addAll(this.f22031e);
            this.f22031e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f22030d.zzb(context, this.f22029c.zzb()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.f22032f.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.f.a(it.next());
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C2752et) it2.next()).zza());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        c1131Ab0.zzc(hashSet);
        return bundle;
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.et, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2752et {

    /* renamed from: a, reason: collision with root package name */
    private final o2.f f18839a;

    /* renamed from: b, reason: collision with root package name */
    private final C4122qt f18840b;

    /* renamed from: e, reason: collision with root package name */
    private final String f18843e;

    /* renamed from: f, reason: collision with root package name */
    private final String f18844f;

    /* renamed from: d, reason: collision with root package name */
    private final Object f18842d = new Object();

    /* renamed from: g, reason: collision with root package name */
    private long f18845g = -1;

    /* renamed from: h, reason: collision with root package name */
    private long f18846h = -1;

    /* renamed from: i, reason: collision with root package name */
    private long f18847i = 0;

    /* renamed from: j, reason: collision with root package name */
    private long f18848j = -1;

    /* renamed from: k, reason: collision with root package name */
    private long f18849k = -1;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedList f18841c = new LinkedList();

    C2752et(o2.f fVar, C4122qt c4122qt, String str, String str2) {
        this.f18839a = fVar;
        this.f18840b = c4122qt;
        this.f18843e = str;
        this.f18844f = str2;
    }

    public final Bundle zza() {
        Bundle bundle;
        synchronized (this.f18842d) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.f18843e);
                bundle.putString("slotid", this.f18844f);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.f18848j);
                bundle.putLong("tresponse", this.f18849k);
                bundle.putLong("timp", this.f18845g);
                bundle.putLong("tload", this.f18846h);
                bundle.putLong("pcc", this.f18847i);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = this.f18841c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C2637dt) it.next()).zzb());
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final String zzc() {
        return this.f18843e;
    }

    public final void zzd() {
        synchronized (this.f18842d) {
            try {
                if (this.f18849k != -1) {
                    C2637dt c2637dt = new C2637dt(this);
                    c2637dt.zzd();
                    this.f18841c.add(c2637dt);
                    this.f18847i++;
                    this.f18840b.zzf();
                    this.f18840b.zze(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zze() {
        synchronized (this.f18842d) {
            try {
                if (this.f18849k != -1 && !this.f18841c.isEmpty()) {
                    C2637dt c2637dt = (C2637dt) this.f18841c.getLast();
                    if (c2637dt.zza() == -1) {
                        c2637dt.zzc();
                        this.f18840b.zze(this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzf() {
        synchronized (this.f18842d) {
            try {
                if (this.f18849k != -1 && this.f18845g == -1) {
                    this.f18845g = this.f18839a.elapsedRealtime();
                    this.f18840b.zze(this);
                }
                this.f18840b.zzg();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzg() {
        synchronized (this.f18842d) {
            this.f18840b.zzh();
        }
    }

    public final void zzh(boolean z8) {
        synchronized (this.f18842d) {
            try {
                if (this.f18849k != -1) {
                    this.f18846h = this.f18839a.elapsedRealtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzi() {
        synchronized (this.f18842d) {
            this.f18840b.zzi();
        }
    }

    public final void zzj(H1.Y1 y12) {
        synchronized (this.f18842d) {
            long jElapsedRealtime = this.f18839a.elapsedRealtime();
            this.f18848j = jElapsedRealtime;
            this.f18840b.zzj(y12, jElapsedRealtime);
        }
    }

    public final void zzk(long j8) {
        synchronized (this.f18842d) {
            try {
                this.f18849k = j8;
                if (j8 != -1) {
                    this.f18840b.zze(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

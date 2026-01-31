package com.google.android.gms.internal.ads;

import android.content.Context;
import g2.InterfaceC5549k;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.gv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2986gv implements InterfaceC5549k {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f19445a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f19446b;

    /* renamed from: c, reason: collision with root package name */
    protected final WeakReference f19447c;

    public AbstractC2986gv(InterfaceC4579uu interfaceC4579uu) {
        Context context = interfaceC4579uu.getContext();
        this.f19445a = context;
        this.f19446b = G1.u.zzp().zzc(context, interfaceC4579uu.zzn().afmaVersion);
        this.f19447c = new WeakReference(interfaceC4579uu);
    }

    static /* bridge */ /* synthetic */ void a(AbstractC2986gv abstractC2986gv, String str, Map map) {
        InterfaceC4579uu interfaceC4579uu = (InterfaceC4579uu) abstractC2986gv.f19447c.get();
        if (interfaceC4579uu != null) {
            interfaceC4579uu.zzd("onPrecacheEvent", map);
        }
    }

    protected final void b(String str, String str2, int i8) {
        L1.g.zza.post(new RunnableC2641dv(this, str, str2, i8));
    }

    @Override // g2.InterfaceC5549k
    public void release() {
    }

    public abstract void zzf();

    public final void zzg(String str, String str2, String str3, String str4) {
        L1.g.zza.post(new RunnableC2871fv(this, str, str2, str3, str4));
    }

    public final void zzj(String str, String str2, long j8) {
        L1.g.zza.post(new RunnableC2756ev(this, str, str2, j8));
    }

    public final void zzn(String str, String str2, int i8, int i9, long j8, long j9, boolean z8, int i10, int i11) {
        L1.g.zza.post(new RunnableC2527cv(this, str, str2, i8, i9, j8, j9, z8, i10, i11));
    }

    public final void zzo(String str, String str2, long j8, long j9, boolean z8, long j10, long j11, long j12, int i8, int i9) {
        L1.g.zza.post(new RunnableC2413bv(this, str, str2, j8, j9, j10, j11, j12, z8, i8, i9));
    }

    protected void zzp(int i8) {
    }

    protected void zzq(int i8) {
    }

    protected void zzr(int i8) {
    }

    protected void zzs(int i8) {
    }

    public abstract boolean zzt(String str);

    public boolean zzu(String str, String[] strArr) {
        return zzt(str);
    }

    public boolean zzw(String str, String[] strArr, C2146Yu c2146Yu) {
        return zzt(str);
    }
}

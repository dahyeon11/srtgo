package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.Za, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2152Za implements InterfaceC2070Xa {

    /* renamed from: u, reason: collision with root package name */
    protected static volatile C1294Eb f17589u;

    /* renamed from: a, reason: collision with root package name */
    protected MotionEvent f17590a;

    /* renamed from: j, reason: collision with root package name */
    protected double f17599j;

    /* renamed from: k, reason: collision with root package name */
    private double f17600k;

    /* renamed from: l, reason: collision with root package name */
    private double f17601l;

    /* renamed from: m, reason: collision with root package name */
    protected float f17602m;

    /* renamed from: n, reason: collision with root package name */
    protected float f17603n;

    /* renamed from: o, reason: collision with root package name */
    protected float f17604o;

    /* renamed from: p, reason: collision with root package name */
    protected float f17605p;

    /* renamed from: s, reason: collision with root package name */
    protected DisplayMetrics f17608s;

    /* renamed from: t, reason: collision with root package name */
    protected C4655vb f17609t;

    /* renamed from: b, reason: collision with root package name */
    protected final LinkedList f17591b = new LinkedList();

    /* renamed from: c, reason: collision with root package name */
    protected long f17592c = 0;

    /* renamed from: d, reason: collision with root package name */
    protected long f17593d = 0;

    /* renamed from: e, reason: collision with root package name */
    protected long f17594e = 0;

    /* renamed from: f, reason: collision with root package name */
    protected long f17595f = 0;

    /* renamed from: g, reason: collision with root package name */
    protected long f17596g = 0;

    /* renamed from: h, reason: collision with root package name */
    protected long f17597h = 0;

    /* renamed from: i, reason: collision with root package name */
    protected long f17598i = 0;

    /* renamed from: q, reason: collision with root package name */
    private boolean f17606q = false;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f17607r = false;

    protected AbstractC2152Za(Context context) {
        try {
            AbstractC3970pa.e();
            this.f17608s = context.getResources().getDisplayMetrics();
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcH)).booleanValue()) {
                this.f17609t = new C4655vb();
            }
        } catch (Throwable unused) {
        }
    }

    private final void f() {
        this.f17596g = 0L;
        this.f17592c = 0L;
        this.f17593d = 0L;
        this.f17594e = 0L;
        this.f17595f = 0L;
        this.f17597h = 0L;
        this.f17598i = 0L;
        if (this.f17591b.isEmpty()) {
            MotionEvent motionEvent = this.f17590a;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = this.f17591b.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f17591b.clear();
        }
        this.f17590a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[PHI: r1 r8
  0x007c: PHI (r1v10 int) = (r1v2 int), (r1v2 int), (r1v11 int), (r1v12 int) binds: [B:34:0x007e, B:35:0x0080, B:32:0x007b, B:25:0x006e] A[DONT_GENERATE, DONT_INLINE]
  0x007c: PHI (r8v6 com.google.android.gms.internal.ads.k9) = 
  (r8v3 com.google.android.gms.internal.ads.k9)
  (r8v3 com.google.android.gms.internal.ads.k9)
  (r8v8 com.google.android.gms.internal.ads.k9)
  (r8v8 com.google.android.gms.internal.ads.k9)
 binds: [B:34:0x007e, B:35:0x0080, B:32:0x007b, B:25:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ed A[Catch: Exception -> 0x00e9, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e9, blocks: (B:45:0x00a8, B:48:0x00b5, B:57:0x00d9, B:60:0x00ed), top: B:74:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String g(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC2152Za.g(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    protected abstract long a(StackTraceElement[] stackTraceElementArr);

    protected abstract C3357k9 b(Context context, View view, Activity activity);

    protected abstract C3357k9 c(Context context, C2327b9 c2327b9);

    protected abstract C3357k9 d(Context context, View view, Activity activity);

    protected abstract C1376Gb e(MotionEvent motionEvent);

    @Override // com.google.android.gms.internal.ads.InterfaceC2070Xa
    public final String zze(Context context, String str, View view) {
        return g(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2070Xa
    public final String zzf(Context context, String str, View view, Activity activity) {
        return g(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2070Xa
    public final String zzg(Context context) {
        if (AbstractC1417Hb.zzc()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return g(context, null, 1, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2070Xa
    public final String zzh(Context context, View view, Activity activity) {
        return g(context, null, 2, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2070Xa
    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l8;
        try {
            if (this.f17606q) {
                f();
                this.f17606q = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f17599j = 0.0d;
                this.f17600k = motionEvent.getRawX();
                this.f17601l = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d9 = rawX - this.f17600k;
                double d10 = rawY - this.f17601l;
                this.f17599j += Math.sqrt((d9 * d9) + (d10 * d10));
                this.f17600k = rawX;
                this.f17601l = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.f17590a = motionEventObtain;
                        this.f17591b.add(motionEventObtain);
                        if (this.f17591b.size() > 6) {
                            ((MotionEvent) this.f17591b.remove()).recycle();
                        }
                        this.f17594e++;
                        this.f17596g = a(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.f17593d += motionEvent.getHistorySize() + 1;
                        C1376Gb c1376GbE = e(motionEvent);
                        Long l9 = c1376GbE.zzd;
                        if (l9 != null && c1376GbE.zzg != null) {
                            this.f17597h += l9.longValue() + c1376GbE.zzg.longValue();
                        }
                        if (this.f17608s != null && (l8 = c1376GbE.zze) != null && c1376GbE.zzh != null) {
                            this.f17598i += l8.longValue() + c1376GbE.zzh.longValue();
                        }
                    } else if (action2 == 3) {
                        this.f17595f++;
                    }
                } catch (C4427tb unused) {
                }
            } else {
                this.f17602m = motionEvent.getX();
                this.f17603n = motionEvent.getY();
                this.f17604o = motionEvent.getRawX();
                this.f17605p = motionEvent.getRawY();
                this.f17592c++;
            }
            this.f17607r = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2070Xa
    public final synchronized void zzl(int i8, int i9, int i10) {
        try {
            if (this.f17590a != null) {
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcx)).booleanValue()) {
                    f();
                } else {
                    this.f17590a.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.f17608s;
            if (displayMetrics != null) {
                float f8 = displayMetrics.density;
                this.f17590a = MotionEvent.obtain(0L, i10, 1, i8 * f8, i9 * f8, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f17590a = null;
            }
            this.f17607r = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2070Xa
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        C4655vb c4655vb;
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcH)).booleanValue() || (c4655vb = this.f17609t) == null) {
            return;
        }
        c4655vb.zzb(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2070Xa
    public void zzo(View view) {
    }
}

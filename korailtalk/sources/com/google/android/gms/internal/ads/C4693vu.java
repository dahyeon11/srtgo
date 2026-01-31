package com.google.android.gms.internal.ads;

import H1.C0591z;
import K1.AbstractC0667v0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.vu */
/* loaded from: classes2.dex */
public final class C4693vu {

    /* renamed from: r */
    private static final boolean f23334r;

    /* renamed from: a */
    private final Context f23335a;

    /* renamed from: b */
    private final String f23336b;

    /* renamed from: c */
    private final L1.a f23337c;

    /* renamed from: d */
    private final C1388Gh f23338d;

    /* renamed from: e */
    private final C1511Jh f23339e;

    /* renamed from: f */
    private final K1.J f23340f;

    /* renamed from: g */
    private final long[] f23341g;

    /* renamed from: h */
    private final String[] f23342h;

    /* renamed from: i */
    private boolean f23343i;

    /* renamed from: j */
    private boolean f23344j;

    /* renamed from: k */
    private boolean f23345k;

    /* renamed from: l */
    private boolean f23346l;

    /* renamed from: m */
    private boolean f23347m;

    /* renamed from: n */
    private AbstractC2296au f23348n;

    /* renamed from: o */
    private boolean f23349o;

    /* renamed from: p */
    private boolean f23350p;

    /* renamed from: q */
    private long f23351q;

    static {
        f23334r = C0591z.zze().nextInt(100) < ((Integer) H1.C.zzc().zza(AbstractC4439th.zzmF)).intValue();
    }

    public C4693vu(Context context, L1.a aVar, String str, C1511Jh c1511Jh, C1388Gh c1388Gh) {
        K1.H h8 = new K1.H();
        h8.zza("min_1", Double.MIN_VALUE, 1.0d);
        h8.zza("1_5", 1.0d, 5.0d);
        h8.zza("5_10", 5.0d, 10.0d);
        h8.zza("10_20", 10.0d, 20.0d);
        h8.zza("20_30", 20.0d, 30.0d);
        h8.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.f23340f = h8.zzb();
        this.f23343i = false;
        this.f23344j = false;
        this.f23345k = false;
        this.f23346l = false;
        this.f23351q = -1L;
        this.f23335a = context;
        this.f23337c = aVar;
        this.f23336b = str;
        this.f23339e = c1511Jh;
        this.f23338d = c1388Gh;
        String str2 = (String) H1.C.zzc().zza(AbstractC4439th.zzA);
        if (str2 == null) {
            this.f23342h = new String[0];
            this.f23341g = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.f23342h = new String[length];
        this.f23341g = new long[length];
        for (int i8 = 0; i8 < strArrSplit.length; i8++) {
            try {
                this.f23341g[i8] = Long.parseLong(strArrSplit[i8]);
            } catch (NumberFormatException e8) {
                L1.n.zzk("Unable to parse frame hash target time number.", e8);
                this.f23341g[i8] = -1;
            }
        }
    }

    public final void zza(AbstractC2296au abstractC2296au) {
        AbstractC1142Ah.zza(this.f23339e, this.f23338d, "vpc2");
        this.f23343i = true;
        this.f23339e.zzd("vpn", abstractC2296au.zzj());
        this.f23348n = abstractC2296au;
    }

    public final void zzb() {
        if (!this.f23343i || this.f23344j) {
            return;
        }
        AbstractC1142Ah.zza(this.f23339e, this.f23338d, "vfr2");
        this.f23344j = true;
    }

    public final void zzc() {
        this.f23347m = true;
        if (!this.f23344j || this.f23345k) {
            return;
        }
        AbstractC1142Ah.zza(this.f23339e, this.f23338d, "vfp2");
        this.f23345k = true;
    }

    public final void zzd() {
        if (!f23334r || this.f23349o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.f23336b);
        bundle.putString("player", this.f23348n.zzj());
        for (K1.G g8 : this.f23340f.zza()) {
            String strValueOf = String.valueOf(g8.zza);
            bundle.putString("fps_c_".concat(strValueOf), Integer.toString(g8.zze));
            String strValueOf2 = String.valueOf(g8.zza);
            bundle.putString("fps_p_".concat(strValueOf2), Double.toString(g8.zzd));
        }
        int i8 = 0;
        while (true) {
            long[] jArr = this.f23341g;
            if (i8 >= jArr.length) {
                G1.u.zzp().zzh(this.f23335a, this.f23337c.afmaVersion, "gmob-apps", bundle, true);
                this.f23349o = true;
                return;
            }
            String str = this.f23342h[i8];
            if (str != null) {
                bundle.putString("fh_".concat(Long.valueOf(jArr[i8]).toString()), str);
            }
            i8++;
        }
    }

    public final void zze() {
        this.f23347m = false;
    }

    public final void zzf(AbstractC2296au abstractC2296au) {
        if (this.f23345k && !this.f23346l) {
            if (AbstractC0667v0.zzc() && !this.f23346l) {
                AbstractC0667v0.zza("VideoMetricsMixin first frame");
            }
            AbstractC1142Ah.zza(this.f23339e, this.f23338d, "vff2");
            this.f23346l = true;
        }
        long jNanoTime = G1.u.zzB().nanoTime();
        if (this.f23347m && this.f23350p && this.f23351q != -1) {
            this.f23340f.zzb(TimeUnit.SECONDS.toNanos(1L) / (jNanoTime - this.f23351q));
        }
        this.f23350p = this.f23347m;
        this.f23351q = jNanoTime;
        long jLongValue = ((Long) H1.C.zzc().zza(AbstractC4439th.zzB)).longValue();
        long jZza = abstractC2296au.zza();
        int i8 = 0;
        while (true) {
            String[] strArr = this.f23342h;
            if (i8 >= strArr.length) {
                return;
            }
            if (strArr[i8] == null && jLongValue > Math.abs(jZza - this.f23341g[i8])) {
                String[] strArr2 = this.f23342h;
                int i9 = 8;
                Bitmap bitmap = abstractC2296au.getBitmap(8, 8);
                long j8 = 63;
                long j9 = 0;
                int i10 = 0;
                while (i10 < i9) {
                    int i11 = 0;
                    while (i11 < i9) {
                        int pixel = bitmap.getPixel(i11, i10);
                        j9 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j8);
                        j8--;
                        i11++;
                        i9 = 8;
                    }
                    i10++;
                    i9 = 8;
                }
                strArr2[i8] = String.format("%016X", Long.valueOf(j9));
                return;
            }
            i8++;
        }
    }
}

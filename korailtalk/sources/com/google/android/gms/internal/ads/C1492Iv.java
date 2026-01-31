package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Iv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1492Iv extends AbstractC3554lu implements InterfaceC4279sE0, SG0 {
    public static final /* synthetic */ int zza = 0;

    /* renamed from: c, reason: collision with root package name */
    private final Context f13520c;

    /* renamed from: d, reason: collision with root package name */
    private final C4467tv f13521d;

    /* renamed from: e, reason: collision with root package name */
    private final NO0 f13522e;

    /* renamed from: f, reason: collision with root package name */
    private final C4465tu f13523f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference f13524g;

    /* renamed from: h, reason: collision with root package name */
    private final C4525uN0 f13525h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC2913gF0 f13526i;

    /* renamed from: j, reason: collision with root package name */
    private ByteBuffer f13527j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13528k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC3440ku f13529l;

    /* renamed from: m, reason: collision with root package name */
    private int f13530m;

    /* renamed from: n, reason: collision with root package name */
    private int f13531n;

    /* renamed from: o, reason: collision with root package name */
    private long f13532o;

    /* renamed from: p, reason: collision with root package name */
    private final String f13533p;

    /* renamed from: q, reason: collision with root package name */
    private final int f13534q;

    /* renamed from: s, reason: collision with root package name */
    private Integer f13536s;

    /* renamed from: t, reason: collision with root package name */
    private final ArrayList f13537t;

    /* renamed from: u, reason: collision with root package name */
    private volatile C4695vv f13538u;

    /* renamed from: r, reason: collision with root package name */
    private final Object f13535r = new Object();

    /* renamed from: v, reason: collision with root package name */
    private final Set f13539v = new HashSet();

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1492Iv(android.content.Context r4, com.google.android.gms.internal.ads.C4465tu r5, com.google.android.gms.internal.ads.InterfaceC4579uu r6, java.lang.Integer r7) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1492Iv.<init>(android.content.Context, com.google.android.gms.internal.ads.tu, com.google.android.gms.internal.ads.uu, java.lang.Integer):void");
    }

    private final boolean j() {
        return this.f13538u != null && this.f13538u.zzq();
    }

    final /* synthetic */ Ky0 c(String str, boolean z8) {
        C1492Iv c1492Iv = true != z8 ? null : this;
        C4465tu c4465tu = this.f13523f;
        return new C1614Lv(str, c1492Iv, c4465tu.zzd, c4465tu.zzf, c4465tu.zzn, c4465tu.zzo);
    }

    final /* synthetic */ Ky0 d(String str, boolean z8) {
        C1492Iv c1492Iv = true != z8 ? null : this;
        C4465tu c4465tu = this.f13523f;
        C4353sv c4353sv = new C4353sv(str, c1492Iv, c4465tu.zzd, c4465tu.zzf, c4465tu.zzi);
        this.f13539v.add(new WeakReference(c4353sv));
        return c4353sv;
    }

    final /* synthetic */ Ky0 e(String str, boolean z8) {
        C4050qD0 c4050qD0 = new C4050qD0();
        c4050qD0.zzf(str);
        c4050qD0.zze(true != z8 ? null : this);
        c4050qD0.zzc(this.f13523f.zzd);
        c4050qD0.zzd(this.f13523f.zzf);
        c4050qD0.zzb(true);
        return c4050qD0.zza();
    }

    final /* synthetic */ Ky0 f(InterfaceC3335jy0 interfaceC3335jy0) {
        Ky0 ky0Zza = interfaceC3335jy0.zza();
        C1410Gv c1410Gv = new C1410Gv(this);
        return new C4695vv(this.f13520c, ky0Zza, this.f13533p, this.f13534q, this, c1410Gv);
    }

    public final void finalize() {
        AbstractC3554lu.a().decrementAndGet();
        if (AbstractC0667v0.zzc()) {
            AbstractC0667v0.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    final PM0 g(Uri uri) {
        C4881xa c4881xa = new C4881xa();
        c4881xa.zzb(uri);
        C3658mp c3658mpZzc = c4881xa.zzc();
        C4525uN0 c4525uN0 = this.f13525h;
        c4525uN0.zza(this.f13523f.zzg);
        return c4525uN0.zzb(c3658mpZzc);
    }

    final /* synthetic */ void h(boolean z8, long j8) {
        InterfaceC3440ku interfaceC3440ku = this.f13529l;
        if (interfaceC3440ku != null) {
            interfaceC3440ku.zzi(z8, j8);
        }
    }

    final /* synthetic */ EG0[] i(Handler handler, InterfaceC3909p0 interfaceC3909p0, SJ0 sj0, VN0 vn0, InterfaceC3612mM0 interfaceC3612mM0) {
        RL0 rl0 = RL0.zza;
        Context context = this.f13520c;
        TK0 tk0 = new TK0(context, new C4863xL0(context), rl0, false, handler, sj0, new C4519uK0(context).zzd());
        Context context2 = this.f13520c;
        return new EG0[]{tk0, new N(context2, new C4863xL0(context2), rl0, 0L, false, handler, interfaceC3909p0, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final long zzA() {
        if (j()) {
            return 0L;
        }
        return this.f13530m;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final long zzB() {
        if (j()) {
            return this.f13538u.zzl();
        }
        synchronized (this.f13535r) {
            while (!this.f13537t.isEmpty()) {
                long j8 = this.f13532o;
                Map mapZze = ((InterfaceC3596mE0) this.f13537t.remove(0)).zze();
                long j9 = 0;
                if (mapZze != null) {
                    Iterator it = mapZze.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && AbstractC2963gj0.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j9 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.f13532o = j8 + j9;
            }
        }
        return this.f13532o;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final Integer zzC() {
        return this.f13536s;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final void zzF(Uri[] uriArr, String str) {
        zzG(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z8) {
        PM0 c2814fN0;
        if (this.f13526i != null) {
            this.f13527j = byteBuffer;
            this.f13528k = z8;
            int length = uriArr.length;
            if (length == 1) {
                c2814fN0 = g(uriArr[0]);
            } else {
                PM0[] pm0Arr = new PM0[length];
                for (int i8 = 0; i8 < uriArr.length; i8++) {
                    pm0Arr[i8] = g(uriArr[i8]);
                }
                c2814fN0 = new C2814fN0(false, false, new C4865xM0(), pm0Arr);
            }
            this.f13526i.zzB(c2814fN0);
            this.f13526i.zzp();
            AbstractC3554lu.b().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final void zzH() {
        InterfaceC2913gF0 interfaceC2913gF0 = this.f13526i;
        if (interfaceC2913gF0 != null) {
            interfaceC2913gF0.zzA(this);
            this.f13526i.zzq();
            this.f13526i = null;
            AbstractC3554lu.b().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final void zzI(long j8) {
        AbstractC4056qG0 abstractC4056qG0 = (AbstractC4056qG0) this.f13526i;
        abstractC4056qG0.zza(abstractC4056qG0.zzd(), j8, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final void zzJ(int i8) {
        this.f13521d.zzk(i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final void zzK(int i8) {
        this.f13521d.zzl(i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final void zzL(InterfaceC3440ku interfaceC3440ku) {
        this.f13529l = interfaceC3440ku;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final void zzM(int i8) {
        this.f13521d.zzm(i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final void zzN(int i8) {
        this.f13521d.zzn(i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final void zzO(boolean z8) {
        this.f13526i.zzr(z8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final void zzP(Integer num) {
        this.f13536s = num;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final void zzQ(boolean z8) {
        if (this.f13526i == null) {
            return;
        }
        int i8 = 0;
        while (true) {
            this.f13526i.zzy();
            if (i8 >= 2) {
                return;
            }
            NO0 no0 = this.f13522e;
            C4185rO0 c4185rO0Zzc = no0.zzf().zzc();
            c4185rO0Zzc.zzp(i8, !z8);
            no0.zzl(c4185rO0Zzc);
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final void zzR(int i8) throws SocketException {
        Iterator it = this.f13539v.iterator();
        while (it.hasNext()) {
            C4353sv c4353sv = (C4353sv) ((WeakReference) it.next()).get();
            if (c4353sv != null) {
                c4353sv.f(i8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final void zzS(Surface surface, boolean z8) {
        InterfaceC2913gF0 interfaceC2913gF0 = this.f13526i;
        if (interfaceC2913gF0 != null) {
            interfaceC2913gF0.zzs(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final void zzT(float f8, boolean z8) {
        InterfaceC2913gF0 interfaceC2913gF0 = this.f13526i;
        if (interfaceC2913gF0 != null) {
            interfaceC2913gF0.zzt(f8);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final void zzU() {
        this.f13526i.zzu();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final boolean zzV() {
        return this.f13526i != null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279sE0
    public final void zza(Ky0 ky0, NB0 nb0, boolean z8, int i8) {
        this.f13530m += i8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279sE0
    public final void zzb(Ky0 ky0, NB0 nb0, boolean z8) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279sE0
    public final void zzc(Ky0 ky0, NB0 nb0, boolean z8) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279sE0
    public final void zzd(Ky0 ky0, NB0 nb0, boolean z8) {
        if (ky0 instanceof InterfaceC3596mE0) {
            synchronized (this.f13535r) {
                this.f13537t.add((InterfaceC3596mE0) ky0);
            }
        } else if (ky0 instanceof C4695vv) {
            this.f13538u = (C4695vv) ky0;
            final InterfaceC4579uu interfaceC4579uu = (InterfaceC4579uu) this.f13524g.get();
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbR)).booleanValue() && interfaceC4579uu != null && this.f13538u.zzn()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.f13538u.zzp()));
                map.put("gcacheDownloaded", String.valueOf(this.f13538u.zzo()));
                K1.K0.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Ev
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i8 = C1492Iv.zza;
                        interfaceC4579uu.zzd("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final void zze(PG0 pg0, Q5 q52, ME0 me0) {
        InterfaceC4579uu interfaceC4579uu = (InterfaceC4579uu) this.f13524g.get();
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbR)).booleanValue() || interfaceC4579uu == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = q52.zzm;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = q52.zzn;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = q52.zzk;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        interfaceC4579uu.zzd("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final /* synthetic */ void zzf(PG0 pg0, int i8, long j8, long j9) {
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final /* synthetic */ void zzg(PG0 pg0, JM0 jm0) {
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final void zzh(PG0 pg0, int i8, long j8) {
        this.f13531n += i8;
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final /* synthetic */ void zzi(InterfaceC3021hC interfaceC3021hC, QG0 qg0) {
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final void zzj(PG0 pg0, EM0 em0, JM0 jm0, IOException iOException, boolean z8) {
        InterfaceC3440ku interfaceC3440ku = this.f13529l;
        if (interfaceC3440ku != null) {
            if (this.f13523f.zzk) {
                interfaceC3440ku.zzl("onLoadException", iOException);
            } else {
                interfaceC3440ku.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final void zzk(PG0 pg0, int i8) {
        InterfaceC3440ku interfaceC3440ku = this.f13529l;
        if (interfaceC3440ku != null) {
            interfaceC3440ku.zzm(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final void zzl(PG0 pg0, AbstractC2066Ww abstractC2066Ww) {
        InterfaceC3440ku interfaceC3440ku = this.f13529l;
        if (interfaceC3440ku != null) {
            interfaceC3440ku.zzk("onPlayerError", abstractC2066Ww);
        }
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final /* synthetic */ void zzm(PG0 pg0, GB gb, GB gb2, int i8) {
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final void zzn(PG0 pg0, Object obj, long j8) {
        InterfaceC3440ku interfaceC3440ku = this.f13529l;
        if (interfaceC3440ku != null) {
            interfaceC3440ku.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final /* synthetic */ void zzo(PG0 pg0, LE0 le0) {
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final void zzp(PG0 pg0, Q5 q52, ME0 me0) {
        InterfaceC4579uu interfaceC4579uu = (InterfaceC4579uu) this.f13524g.get();
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbR)).booleanValue() || interfaceC4579uu == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(q52.zzu));
        map.put("bitRate", String.valueOf(q52.zzj));
        map.put("resolution", q52.zzs + "x" + q52.zzt);
        String str = q52.zzm;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = q52.zzn;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = q52.zzk;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        interfaceC4579uu.zzd("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final void zzq(PG0 pg0, IQ iq) {
        InterfaceC3440ku interfaceC3440ku = this.f13529l;
        if (interfaceC3440ku != null) {
            interfaceC3440ku.zzD(iq.zzc, iq.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final int zzr() {
        return this.f13531n;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final int zzt() {
        return this.f13526i.zzf();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final long zzv() {
        return this.f13526i.zzi();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final long zzw() {
        return this.f13530m;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final long zzx() {
        if (j() && this.f13538u.zzp()) {
            return Math.min(this.f13530m, this.f13538u.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final long zzy() {
        return this.f13526i.zzk();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3554lu
    public final long zzz() {
        return this.f13526i.zzl();
    }
}

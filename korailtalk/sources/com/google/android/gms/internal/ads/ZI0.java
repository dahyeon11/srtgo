package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class ZI0 implements SG0, InterfaceC2233aJ0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17534a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2348bJ0 f17535b;

    /* renamed from: c, reason: collision with root package name */
    private final PlaybackSession f17536c;

    /* renamed from: i, reason: collision with root package name */
    private String f17542i;

    /* renamed from: j, reason: collision with root package name */
    private PlaybackMetrics.Builder f17543j;

    /* renamed from: k, reason: collision with root package name */
    private int f17544k;

    /* renamed from: n, reason: collision with root package name */
    private AbstractC2066Ww f17547n;

    /* renamed from: o, reason: collision with root package name */
    private YH0 f17548o;

    /* renamed from: p, reason: collision with root package name */
    private YH0 f17549p;

    /* renamed from: q, reason: collision with root package name */
    private YH0 f17550q;

    /* renamed from: r, reason: collision with root package name */
    private Q5 f17551r;

    /* renamed from: s, reason: collision with root package name */
    private Q5 f17552s;

    /* renamed from: t, reason: collision with root package name */
    private Q5 f17553t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f17554u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f17555v;

    /* renamed from: w, reason: collision with root package name */
    private int f17556w;

    /* renamed from: x, reason: collision with root package name */
    private int f17557x;

    /* renamed from: y, reason: collision with root package name */
    private int f17558y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f17559z;

    /* renamed from: e, reason: collision with root package name */
    private final C4055qG f17538e = new C4055qG();

    /* renamed from: f, reason: collision with root package name */
    private final C3711nF f17539f = new C3711nF();

    /* renamed from: h, reason: collision with root package name */
    private final HashMap f17541h = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f17540g = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final long f17537d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    private int f17545l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f17546m = 0;

    private ZI0(Context context, PlaybackSession playbackSession) {
        this.f17534a = context.getApplicationContext();
        this.f17536c = playbackSession;
        XH0 xh0 = new XH0(XH0.zza);
        this.f17535b = xh0;
        xh0.zzh(this);
    }

    private static int a(int i8) {
        switch (AbstractC2281am0.zzj(i8)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void b() {
        PlaybackMetrics.Builder builder = this.f17543j;
        if (builder != null && this.f17559z) {
            builder.setAudioUnderrunCount(this.f17558y);
            this.f17543j.setVideoFramesDropped(this.f17556w);
            this.f17543j.setVideoFramesPlayed(this.f17557x);
            Long l8 = (Long) this.f17540g.get(this.f17542i);
            this.f17543j.setNetworkTransferDurationMillis(l8 == null ? 0L : l8.longValue());
            Long l9 = (Long) this.f17541h.get(this.f17542i);
            this.f17543j.setNetworkBytesRead(l9 == null ? 0L : l9.longValue());
            this.f17543j.setStreamSource((l9 == null || l9.longValue() <= 0) ? 0 : 1);
            this.f17536c.reportPlaybackMetrics(this.f17543j.build());
        }
        this.f17543j = null;
        this.f17542i = null;
        this.f17558y = 0;
        this.f17556w = 0;
        this.f17557x = 0;
        this.f17551r = null;
        this.f17552s = null;
        this.f17553t = null;
        this.f17559z = false;
    }

    private final void c(long j8, Q5 q52, int i8) {
        if (AbstractC2281am0.zzG(this.f17552s, q52)) {
            return;
        }
        int i9 = this.f17552s == null ? 1 : 0;
        this.f17552s = q52;
        g(0, j8, q52, i9);
    }

    private final void d(long j8, Q5 q52, int i8) {
        if (AbstractC2281am0.zzG(this.f17553t, q52)) {
            return;
        }
        int i9 = this.f17553t == null ? 1 : 0;
        this.f17553t = q52;
        g(2, j8, q52, i9);
    }

    private final void e(RG rg, NM0 nm0) {
        int iZza;
        PlaybackMetrics.Builder builder = this.f17543j;
        if (nm0 == null || (iZza = rg.zza(nm0.zza)) == -1) {
            return;
        }
        int i8 = 0;
        rg.zzd(iZza, this.f17539f, false);
        rg.zze(this.f17539f.zzd, this.f17538e, 0L);
        C1478Il c1478Il = this.f17538e.zze.zzd;
        if (c1478Il != null) {
            int iZzn = AbstractC2281am0.zzn(c1478Il.zzb);
            i8 = iZzn != 0 ? iZzn != 1 ? iZzn != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i8);
        C4055qG c4055qG = this.f17538e;
        if (c4055qG.zzo != -9223372036854775807L && !c4055qG.zzm && !c4055qG.zzj && !c4055qG.zzb()) {
            builder.setMediaDurationMillis(AbstractC2281am0.zzu(this.f17538e.zzo));
        }
        builder.setPlaybackType(true != this.f17538e.zzb() ? 1 : 2);
        this.f17559z = true;
    }

    private final void f(long j8, Q5 q52, int i8) {
        if (AbstractC2281am0.zzG(this.f17551r, q52)) {
            return;
        }
        int i9 = this.f17551r == null ? 1 : 0;
        this.f17551r = q52;
        g(1, j8, q52, i9);
    }

    private final void g(int i8, long j8, Q5 q52, int i9) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = TI0.a(i8).setTimeSinceCreatedMillis(j8 - this.f17537d);
        if (q52 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i9 != 1 ? 1 : 2);
            String str = q52.zzm;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = q52.zzn;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = q52.zzk;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i10 = q52.zzj;
            if (i10 != -1) {
                timeSinceCreatedMillis.setBitrate(i10);
            }
            int i11 = q52.zzs;
            if (i11 != -1) {
                timeSinceCreatedMillis.setWidth(i11);
            }
            int i12 = q52.zzt;
            if (i12 != -1) {
                timeSinceCreatedMillis.setHeight(i12);
            }
            int i13 = q52.zzA;
            if (i13 != -1) {
                timeSinceCreatedMillis.setChannelCount(i13);
            }
            int i14 = q52.zzB;
            if (i14 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i14);
            }
            String str4 = q52.zze;
            if (str4 != null) {
                int i15 = AbstractC2281am0.zza;
                String[] strArrSplit = str4.split(g5.e.STATE_NAME_NONE, -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f8 = q52.zzu;
            if (f8 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f8);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f17559z = true;
        this.f17536c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private final boolean h(YH0 yh0) {
        if (yh0 != null) {
            return yh0.zzc.equals(this.f17535b.zze());
        }
        return false;
    }

    public static ZI0 zzb(Context context) {
        MediaMetricsManager mediaMetricsManagerA = ZH0.a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerA == null) {
            return null;
        }
        return new ZI0(context, mediaMetricsManagerA.createPlaybackSession());
    }

    public final LogSessionId zza() {
        return this.f17536c.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2233aJ0
    public final void zzc(PG0 pg0, String str) {
        NM0 nm0 = pg0.zzd;
        if (nm0 == null || !nm0.zzb()) {
            b();
            this.f17542i = str;
            this.f17543j = OI0.a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.4.0-alpha01");
            e(pg0.zzb, pg0.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2233aJ0
    public final void zzd(PG0 pg0, String str, boolean z8) {
        NM0 nm0 = pg0.zzd;
        if ((nm0 == null || !nm0.zzb()) && str.equals(this.f17542i)) {
            b();
        }
        this.f17540g.remove(str);
        this.f17541h.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final /* synthetic */ void zze(PG0 pg0, Q5 q52, ME0 me0) {
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final void zzf(PG0 pg0, int i8, long j8, long j9) {
        NM0 nm0 = pg0.zzd;
        if (nm0 != null) {
            InterfaceC2348bJ0 interfaceC2348bJ0 = this.f17535b;
            RG rg = pg0.zzb;
            HashMap map = this.f17541h;
            String strZzf = interfaceC2348bJ0.zzf(rg, nm0);
            Long l8 = (Long) map.get(strZzf);
            Long l9 = (Long) this.f17540g.get(strZzf);
            this.f17541h.put(strZzf, Long.valueOf((l8 == null ? 0L : l8.longValue()) + j8));
            this.f17540g.put(strZzf, Long.valueOf((l9 != null ? l9.longValue() : 0L) + i8));
        }
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final void zzg(PG0 pg0, JM0 jm0) {
        NM0 nm0 = pg0.zzd;
        if (nm0 == null) {
            return;
        }
        Q5 q52 = jm0.zzb;
        q52.getClass();
        YH0 yh0 = new YH0(q52, 0, this.f17535b.zzf(pg0.zzb, nm0));
        int i8 = jm0.zza;
        if (i8 != 0) {
            if (i8 == 1) {
                this.f17549p = yh0;
                return;
            } else if (i8 != 2) {
                if (i8 != 3) {
                    return;
                }
                this.f17550q = yh0;
                return;
            }
        }
        this.f17548o = yh0;
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final /* synthetic */ void zzh(PG0 pg0, int i8, long j8) {
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0295  */
    @Override // com.google.android.gms.internal.ads.SG0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(com.google.android.gms.internal.ads.InterfaceC3021hC r19, com.google.android.gms.internal.ads.QG0 r20) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 980
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ZI0.zzi(com.google.android.gms.internal.ads.hC, com.google.android.gms.internal.ads.QG0):void");
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final void zzj(PG0 pg0, EM0 em0, JM0 jm0, IOException iOException, boolean z8) {
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final /* synthetic */ void zzk(PG0 pg0, int i8) {
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final void zzl(PG0 pg0, AbstractC2066Ww abstractC2066Ww) {
        this.f17547n = abstractC2066Ww;
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final void zzm(PG0 pg0, GB gb, GB gb2, int i8) {
        if (i8 == 1) {
            this.f17554u = true;
            i8 = 1;
        }
        this.f17544k = i8;
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final /* synthetic */ void zzn(PG0 pg0, Object obj, long j8) {
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final void zzo(PG0 pg0, LE0 le0) {
        this.f17556w += le0.zzg;
        this.f17557x += le0.zze;
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final /* synthetic */ void zzp(PG0 pg0, Q5 q52, ME0 me0) {
    }

    @Override // com.google.android.gms.internal.ads.SG0
    public final void zzq(PG0 pg0, IQ iq) {
        YH0 yh0 = this.f17548o;
        if (yh0 != null) {
            Q5 q52 = yh0.zza;
            if (q52.zzt == -1) {
                O4 o4Zzb = q52.zzb();
                o4Zzb.zzac(iq.zzc);
                o4Zzb.zzI(iq.zzd);
                this.f17548o = new YH0(o4Zzb.zzad(), 0, yh0.zzc);
            }
        }
    }
}

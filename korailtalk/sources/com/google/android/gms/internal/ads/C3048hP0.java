package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3048hP0 implements InterfaceC2589dP0, InterfaceC4279sE0 {

    /* renamed from: m, reason: collision with root package name */
    private static C3048hP0 f19798m;
    public static final AbstractC2394bl0 zza = AbstractC2394bl0.zzq(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final AbstractC2394bl0 zzb = AbstractC2394bl0.zzq(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final AbstractC2394bl0 zzc = AbstractC2394bl0.zzq(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final AbstractC2394bl0 zzd = AbstractC2394bl0.zzq(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final AbstractC2394bl0 zze = AbstractC2394bl0.zzq(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final AbstractC2394bl0 zzf = AbstractC2394bl0.zzq(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2737el0 f19799a;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3002h20 f19801c;

    /* renamed from: e, reason: collision with root package name */
    private int f19803e;

    /* renamed from: f, reason: collision with root package name */
    private long f19804f;

    /* renamed from: g, reason: collision with root package name */
    private long f19805g;

    /* renamed from: h, reason: collision with root package name */
    private long f19806h;

    /* renamed from: i, reason: collision with root package name */
    private long f19807i;

    /* renamed from: j, reason: collision with root package name */
    private long f19808j;

    /* renamed from: k, reason: collision with root package name */
    private long f19809k;

    /* renamed from: l, reason: collision with root package name */
    private int f19810l;

    /* renamed from: b, reason: collision with root package name */
    private final C2360bP0 f19800b = new C2360bP0();

    /* renamed from: d, reason: collision with root package name */
    private final C3908p f19802d = new C3908p(Z1.b.CREDENTIAL_PICKER_REQUEST_CODE);

    /* synthetic */ C3048hP0(Context context, Map map, int i8, InterfaceC3002h20 interfaceC3002h20, boolean z8, AbstractC2933gP0 abstractC2933gP0) {
        this.f19799a = AbstractC2737el0.zzc(map);
        this.f19801c = interfaceC3002h20;
        if (context == null) {
            this.f19810l = 0;
            this.f19808j = a(0);
            return;
        }
        C3869og0 c3869og0Zzb = C3869og0.zzb(context);
        int iZza = c3869og0Zzb.zza();
        this.f19810l = iZza;
        this.f19808j = a(iZza);
        c3869og0Zzb.zzd(new C2818fP0(this));
    }

    private final long a(int i8) {
        Long l8 = (Long) this.f19799a.get(Integer.valueOf(i8));
        if (l8 == null) {
            l8 = (Long) this.f19799a.get(0);
        }
        if (l8 == null) {
            l8 = 1000000L;
        }
        return l8.longValue();
    }

    private final void b(int i8, long j8, long j9) {
        int i9;
        long j10;
        if (i8 == 0) {
            if (j8 != 0) {
                j10 = j8;
            } else if (j9 == this.f19809k) {
                return;
            } else {
                j10 = 0;
            }
            i9 = 0;
        } else {
            i9 = i8;
            j10 = j8;
        }
        this.f19809k = j9;
        this.f19800b.zzb(i9, j10, j9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void c(int i8) {
        try {
            if (this.f19810l != i8) {
                this.f19810l = i8;
                if (i8 != 1 && i8 != 0 && i8 != 8) {
                    this.f19808j = a(i8);
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    b(this.f19803e > 0 ? (int) (jElapsedRealtime - this.f19804f) : 0, this.f19805g, this.f19808j);
                    this.f19804f = jElapsedRealtime;
                    this.f19805g = 0L;
                    this.f19807i = 0L;
                    this.f19806h = 0L;
                    this.f19802d.zzc();
                }
            }
        } finally {
        }
    }

    private static boolean d(NB0 nb0, boolean z8) {
        return z8 && !nb0.zzb(8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0145, code lost:
    
        if (r3.equals("YE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x015d, code lost:
    
        if (r3.equals("WS") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0167, code lost:
    
        if (r3.equals("WF") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0171, code lost:
    
        if (r3.equals("VU") != false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01a5, code lost:
    
        if (r3.equals("VE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01af, code lost:
    
        if (r3.equals("VC") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01b9, code lost:
    
        if (r3.equals("VA") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01fb, code lost:
    
        if (r3.equals("UA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0221, code lost:
    
        if (r3.equals("TV") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0239, code lost:
    
        if (r3.equals("TR") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x025f, code lost:
    
        if (r3.equals("TM") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0269, code lost:
    
        if (r3.equals("TL") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0273, code lost:
    
        if (r3.equals("TJ") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x027d, code lost:
    
        if (r3.equals("TH") != false) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0295, code lost:
    
        if (r3.equals("TD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x02ad, code lost:
    
        if (r3.equals("SZ") != false) goto L866;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x02b7, code lost:
    
        if (r3.equals("SY") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x02c1, code lost:
    
        if (r3.equals("SX") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x02e7, code lost:
    
        if (r3.equals("SS") != false) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x031b, code lost:
    
        if (r3.equals("SM") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0325, code lost:
    
        if (r3.equals("SL") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x033d, code lost:
    
        if (r3.equals("SJ") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0347, code lost:
    
        if (r3.equals("SI") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0351, code lost:
    
        if (r3.equals("SH") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0369, code lost:
    
        if (r3.equals("SE") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0373, code lost:
    
        if (r3.equals("SD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x037d, code lost:
    
        if (r3.equals("SC") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r3.equals("CI") != false) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0387, code lost:
    
        if (r3.equals("SB") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x038e, code lost:
    
        return new int[]{4, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x03f7, code lost:
    
        if (r3.equals("PY") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x040f, code lost:
    
        if (r3.equals("PT") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0435, code lost:
    
        if (r3.equals("PM") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0469, code lost:
    
        if (r3.equals(y1.x.MAX_AD_CONTENT_RATING_PG) != false) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        if (r3.equals("CG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x048f, code lost:
    
        if (r3.equals("PA") != false) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x04b5, code lost:
    
        if (r3.equals("NU") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x04bf, code lost:
    
        if (r3.equals("NR") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x04f3, code lost:
    
        if (r3.equals("NI") != false) goto L788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x050b, code lost:
    
        if (r3.equals("NF") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0515, code lost:
    
        if (r3.equals("NE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x051f, code lost:
    
        if (r3.equals("NC") != false) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0526, code lost:
    
        return new int[]{2, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x053b, code lost:
    
        if (r3.equals("MZ") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0542, code lost:
    
        return new int[]{3, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x058f, code lost:
    
        if (r3.equals("MT") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0599, code lost:
    
        if (r3.equals("MS") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x05a3, code lost:
    
        if (r3.equals("MR") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x05bb, code lost:
    
        if (r3.equals("MP") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x05c2, code lost:
    
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x05e5, code lost:
    
        if (r3.equals("MM") != false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x05ef, code lost:
    
        if (r3.equals("ML") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0607, code lost:
    
        if (r3.equals("MH") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x060e, code lost:
    
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0615, code lost:
    
        if (r3.equals("MG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0649, code lost:
    
        if (r3.equals("MC") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0661, code lost:
    
        if (r3.equals("LY") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x066b, code lost:
    
        if (r3.equals("LV") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0691, code lost:
    
        if (r3.equals("LS") != false) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0698, code lost:
    
        return new int[]{4, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x069f, code lost:
    
        if (r3.equals("LR") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x06a9, code lost:
    
        if (r3.equals("LK") != false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x06b0, code lost:
    
        return new int[]{3, 2, 3, 3, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x06b7, code lost:
    
        if (r3.equals("LI") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x06f9, code lost:
    
        if (r3.equals("KY") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0703, code lost:
    
        if (r3.equals("KW") != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0099, code lost:
    
        if (r3.equals("BQ") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x071b, code lost:
    
        if (r3.equals("KN") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0725, code lost:
    
        if (r3.equals("KM") != false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x072c, code lost:
    
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0733, code lost:
    
        if (r3.equals("KI") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0775, code lost:
    
        if (r3.equals("JO") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x078d, code lost:
    
        if (r3.equals("JE") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x07a5, code lost:
    
        if (r3.equals("IS") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x07e7, code lost:
    
        if (r3.equals("IM") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x081b, code lost:
    
        if (r3.equals("HU") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0825, code lost:
    
        if (r3.equals("HT") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x082f, code lost:
    
        if (r3.equals("HR") != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x0836, code lost:
    
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0891, code lost:
    
        if (r3.equals("GQ") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x08b7, code lost:
    
        if (r3.equals("GM") != false) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x08be, code lost:
    
        return new int[]{4, 3, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x08c5, code lost:
    
        if (r3.equals("GL") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x08cc, code lost:
    
        return new int[]{1, 2, 2, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x08d3, code lost:
    
        if (r3.equals("GI") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x08da, code lost:
    
        return new int[]{0, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cd, code lost:
    
        if (r3.equals("BL") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x096d, code lost:
    
        if (r3.equals("FK") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x0974, code lost:
    
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x09b3, code lost:
    
        if (r3.equals("ER") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x09ba, code lost:
    
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x09c1, code lost:
    
        if (r3.equals("EG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x09c8, code lost:
    
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x09cf, code lost:
    
        if (r3.equals("EE") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x09d6, code lost:
    
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x09eb, code lost:
    
        if (r3.equals("DZ") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x09f2, code lost:
    
        return new int[]{3, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x09f9, code lost:
    
        if (r3.equals("DO") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x0a00, code lost:
    
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e5, code lost:
    
        if (r3.equals("AT") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x0a07, code lost:
    
        if (r3.equals("DM") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x0a1f, code lost:
    
        if (r3.equals("DJ") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x0a53, code lost:
    
        if (r3.equals("CX") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x0a5d, code lost:
    
        if (r3.equals("CW") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x0a75, code lost:
    
        if (r3.equals("CU") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x0a7c, code lost:
    
        return new int[]{4, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:787:0x0a83, code lost:
    
        if (r3.equals("CR") != false) goto L788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x0a8a, code lost:
    
        return new int[]{2, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x0aad, code lost:
    
        if (r3.equals("CM") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x0ab4, code lost:
    
        return new int[]{4, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x0abb, code lost:
    
        if (r3.equals("CL") != false) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x0ac2, code lost:
    
        return new int[]{0, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x0ac9, code lost:
    
        if (r3.equals("CK") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x0ad3, code lost:
    
        if (r3.equals("CD") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x0ada, code lost:
    
        return new int[]{3, 3, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x0ae1, code lost:
    
        if (r3.equals("CA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x0ae8, code lost:
    
        return new int[]{0, 2, 1, 2, 3, 3};
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x0b0b, code lost:
    
        if (r3.equals("BI") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x0b12, code lost:
    
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x0b27, code lost:
    
        if (r3.equals("BG") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x0b2e, code lost:
    
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x0b35, code lost:
    
        if (r3.equals("BF") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x0b3c, code lost:
    
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x0b5f, code lost:
    
        if (r3.equals("AZ") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:852:0x0b66, code lost:
    
        return new int[]{4, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:858:0x0b7b, code lost:
    
        if (r3.equals("AI") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x010b, code lost:
    
        if (r3.equals("AQ") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:861:0x0b84, code lost:
    
        if (r3.equals("AG") != false) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:863:0x0b8b, code lost:
    
        return new int[]{2, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x0b92, code lost:
    
        if (r3.equals("AF") != false) goto L866;
     */
    /* JADX WARN: Code restructure failed: missing block: B:867:0x0b99, code lost:
    
        return new int[]{4, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:873:0x0bae, code lost:
    
        if (r3.equals(com.korail.talk.network.BaseRequest.ANDROID) != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:876:0x0bb7, code lost:
    
        if (r3.equals("BZ") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:878:0x0bbe, code lost:
    
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:884:0x0bd3, code lost:
    
        if (r3.equals("BB") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:886:0x0bda, code lost:
    
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:888:0x0be1, code lost:
    
        if (r3.equals("BA") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0115, code lost:
    
        if (r3.equals("ZW") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:890:0x0be8, code lost:
    
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:892:0x0bef, code lost:
    
        if (r3.equals("AX") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:894:0x0bf6, code lost:
    
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:900:0x0c0b, code lost:
    
        if (r3.equals("AM") != false) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:902:0x0c12, code lost:
    
        return new int[]{2, 3, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x013b, code lost:
    
        if (r3.equals("YT") != false) goto L390;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int[] e(java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 6672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3048hP0.e(java.lang.String):int[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0031 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x0003, B:10:0x0011, B:12:0x0015, B:14:0x001f, B:16:0x0029, B:20:0x003d, B:19:0x0031, B:9:0x000c, B:21:0x00e4), top: B:26:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized com.google.android.gms.internal.ads.C3048hP0 zzg(android.content.Context r10) {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.hP0> r0 = com.google.android.gms.internal.ads.C3048hP0.class
            monitor-enter(r0)
            com.google.android.gms.internal.ads.hP0 r1 = com.google.android.gms.internal.ads.C3048hP0.f19798m     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto Le4
            if (r10 != 0) goto Lc
            r1 = 0
        La:
            r3 = r1
            goto L11
        Lc:
            android.content.Context r1 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> L2e
            goto La
        L11:
            int r1 = com.google.android.gms.internal.ads.AbstractC2281am0.zza     // Catch: java.lang.Throwable -> L2e
            if (r10 == 0) goto L31
            java.lang.String r1 = "phone"
            java.lang.Object r10 = r10.getSystemService(r1)     // Catch: java.lang.Throwable -> L2e
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10     // Catch: java.lang.Throwable -> L2e
            if (r10 == 0) goto L31
            java.lang.String r10 = r10.getNetworkCountryIso()     // Catch: java.lang.Throwable -> L2e
            boolean r1 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L31
            java.lang.String r10 = com.google.android.gms.internal.ads.AbstractC2963gj0.zzb(r10)     // Catch: java.lang.Throwable -> L2e
            goto L3d
        L2e:
            r10 = move-exception
            goto Le8
        L31:
            java.util.Locale r10 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = r10.getCountry()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = com.google.android.gms.internal.ads.AbstractC2963gj0.zzb(r10)     // Catch: java.lang.Throwable -> L2e
        L3d:
            int[] r10 = e(r10)     // Catch: java.lang.Throwable -> L2e
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L2e
            r1 = 8
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L2e
            r5 = 1000000(0xf4240, double:4.940656E-318)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L2e
            r4.put(r2, r5)     // Catch: java.lang.Throwable -> L2e
            r2 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.bl0 r6 = com.google.android.gms.internal.ads.C3048hP0.zza     // Catch: java.lang.Throwable -> L2e
            r7 = r10[r1]     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r7 = r6.get(r7)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r7 = (java.lang.Long) r7     // Catch: java.lang.Throwable -> L2e
            r4.put(r5, r7)     // Catch: java.lang.Throwable -> L2e
            r5 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.bl0 r8 = com.google.android.gms.internal.ads.C3048hP0.zzb     // Catch: java.lang.Throwable -> L2e
            r9 = 1
            r9 = r10[r9]     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r8 = r8.get(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> L2e
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> L2e
            r7 = 4
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.bl0 r9 = com.google.android.gms.internal.ads.C3048hP0.zzc     // Catch: java.lang.Throwable -> L2e
            r2 = r10[r2]     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r2 = r9.get(r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L2e
            r4.put(r8, r2)     // Catch: java.lang.Throwable -> L2e
            r2 = 5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.bl0 r9 = com.google.android.gms.internal.ads.C3048hP0.zzd     // Catch: java.lang.Throwable -> L2e
            r5 = r10[r5]     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r5 = r9.get(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.Throwable -> L2e
            r4.put(r8, r5)     // Catch: java.lang.Throwable -> L2e
            r5 = 10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.bl0 r8 = com.google.android.gms.internal.ads.C3048hP0.zze     // Catch: java.lang.Throwable -> L2e
            r7 = r10[r7]     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r7 = r8.get(r7)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r7 = (java.lang.Long) r7     // Catch: java.lang.Throwable -> L2e
            r4.put(r5, r7)     // Catch: java.lang.Throwable -> L2e
            r5 = 9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.bl0 r7 = com.google.android.gms.internal.ads.C3048hP0.zzf     // Catch: java.lang.Throwable -> L2e
            r2 = r10[r2]     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r2 = r7.get(r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L2e
            r4.put(r5, r2)     // Catch: java.lang.Throwable -> L2e
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L2e
            r10 = r10[r1]     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r10 = r6.get(r10)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r10 = (java.lang.Long) r10     // Catch: java.lang.Throwable -> L2e
            r4.put(r2, r10)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.h20 r6 = com.google.android.gms.internal.ads.InterfaceC3002h20.zza     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.hP0 r10 = new com.google.android.gms.internal.ads.hP0     // Catch: java.lang.Throwable -> L2e
            r7 = 1
            r8 = 0
            r5 = 2000(0x7d0, float:2.803E-42)
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.C3048hP0.f19798m = r10     // Catch: java.lang.Throwable -> L2e
        Le4:
            com.google.android.gms.internal.ads.hP0 r10 = com.google.android.gms.internal.ads.C3048hP0.f19798m     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)
            return r10
        Le8:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3048hP0.zzg(android.content.Context):com.google.android.gms.internal.ads.hP0");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279sE0
    public final synchronized void zza(Ky0 ky0, NB0 nb0, boolean z8, int i8) {
        if (d(nb0, z8)) {
            this.f19805g += i8;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279sE0
    public final synchronized void zzb(Ky0 ky0, NB0 nb0, boolean z8) {
        try {
            if (d(nb0, z8)) {
                F10.zzf(this.f19803e > 0);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                int i8 = (int) (jElapsedRealtime - this.f19804f);
                this.f19806h += i8;
                long j8 = this.f19807i;
                long j9 = this.f19805g;
                this.f19807i = j8 + j9;
                if (i8 > 0) {
                    this.f19802d.zzb((int) Math.sqrt(j9), (j9 * 8000.0f) / i8);
                    if (this.f19806h >= 2000 || this.f19807i >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                        this.f19808j = (long) this.f19802d.zza(0.5f);
                    }
                    b(i8, this.f19805g, this.f19808j);
                    this.f19804f = jElapsedRealtime;
                    this.f19805g = 0L;
                }
                this.f19803e--;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279sE0
    public final void zzc(Ky0 ky0, NB0 nb0, boolean z8) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279sE0
    public final synchronized void zzd(Ky0 ky0, NB0 nb0, boolean z8) {
        try {
            if (d(nb0, z8)) {
                if (this.f19803e == 0) {
                    this.f19804f = SystemClock.elapsedRealtime();
                }
                this.f19803e++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2589dP0
    public final void zze(Handler handler, InterfaceC2474cP0 interfaceC2474cP0) {
        interfaceC2474cP0.getClass();
        this.f19800b.zza(handler, interfaceC2474cP0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2589dP0
    public final void zzf(InterfaceC2474cP0 interfaceC2474cP0) {
        this.f19800b.zzc(interfaceC2474cP0);
    }
}

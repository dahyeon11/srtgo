package com.google.android.gms.internal.ads;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.mN0 */
/* loaded from: classes2.dex */
final class C3614mN0 implements InterfaceC2881g, CM0 {

    /* renamed from: b */
    private final Uri f20887b;

    /* renamed from: c */
    private final C4165rE0 f20888c;

    /* renamed from: d */
    private final InterfaceC2929gN0 f20889d;

    /* renamed from: e */
    private final InterfaceC2769f1 f20890e;

    /* renamed from: f */
    private final K30 f20891f;

    /* renamed from: h */
    private volatile boolean f20893h;

    /* renamed from: j */
    private long f20895j;

    /* renamed from: l */
    private K1 f20897l;

    /* renamed from: m */
    private boolean f20898m;

    /* renamed from: n */
    final /* synthetic */ C4183rN0 f20899n;

    /* renamed from: g */
    private final C5050z1 f20892g = new C5050z1();

    /* renamed from: i */
    private boolean f20894i = true;

    /* renamed from: a */
    private final long f20886a = EM0.zza();

    /* renamed from: k */
    private NB0 f20896k = f(0);

    public C3614mN0(C4183rN0 c4183rN0, Uri uri, Ky0 ky0, InterfaceC2929gN0 interfaceC2929gN0, InterfaceC2769f1 interfaceC2769f1, K30 k30) {
        this.f20899n = c4183rN0;
        this.f20887b = uri;
        this.f20888c = new C4165rE0(ky0);
        this.f20889d = interfaceC2929gN0;
        this.f20890e = interfaceC2769f1;
        this.f20891f = k30;
    }

    static /* bridge */ /* synthetic */ void e(C3614mN0 c3614mN0, long j8, long j9) {
        c3614mN0.f20892g.zza = j8;
        c3614mN0.f20895j = j9;
        c3614mN0.f20894i = true;
        c3614mN0.f20898m = false;
    }

    private final NB0 f(long j8) {
        LA0 la0 = new LA0();
        la0.zzd(this.f20887b);
        la0.zzc(j8);
        la0.zza(6);
        la0.zzb(C4183rN0.f22413M);
        return la0.zze();
    }

    @Override // com.google.android.gms.internal.ads.CM0
    public final void zza(C4099qh0 c4099qh0) {
        long jMax = !this.f20898m ? this.f20895j : Math.max(C4183rN0.w(this.f20899n, true), this.f20895j);
        int iZzb = c4099qh0.zzb();
        K1 k12 = this.f20897l;
        k12.getClass();
        H1.zzb(k12, c4099qh0, iZzb);
        k12.zzs(jMax, 1, iZzb, 0, null);
        this.f20898m = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2881g
    public final void zzg() {
        this.f20893h = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x00a2 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:150:0x000b, B:160:0x003c, B:164:0x0047, B:167:0x005c, B:168:0x0062, B:176:0x0097, B:178:0x00a2, B:180:0x00ae, B:182:0x00b8, B:184:0x00c4, B:186:0x00ce, B:188:0x00da, B:190:0x00e4, B:192:0x00f6, B:194:0x0100, B:195:0x0106, B:203:0x0135, B:204:0x013c, B:206:0x0149, B:208:0x0151, B:210:0x016e, B:198:0x0110, B:201:0x0126, B:172:0x006e, B:175:0x0087), top: B:271:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00b8 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:150:0x000b, B:160:0x003c, B:164:0x0047, B:167:0x005c, B:168:0x0062, B:176:0x0097, B:178:0x00a2, B:180:0x00ae, B:182:0x00b8, B:184:0x00c4, B:186:0x00ce, B:188:0x00da, B:190:0x00e4, B:192:0x00f6, B:194:0x0100, B:195:0x0106, B:203:0x0135, B:204:0x013c, B:206:0x0149, B:208:0x0151, B:210:0x016e, B:198:0x0110, B:201:0x0126, B:172:0x006e, B:175:0x0087), top: B:271:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00ce A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:150:0x000b, B:160:0x003c, B:164:0x0047, B:167:0x005c, B:168:0x0062, B:176:0x0097, B:178:0x00a2, B:180:0x00ae, B:182:0x00b8, B:184:0x00c4, B:186:0x00ce, B:188:0x00da, B:190:0x00e4, B:192:0x00f6, B:194:0x0100, B:195:0x0106, B:203:0x0135, B:204:0x013c, B:206:0x0149, B:208:0x0151, B:210:0x016e, B:198:0x0110, B:201:0x0126, B:172:0x006e, B:175:0x0087), top: B:271:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00e4 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:150:0x000b, B:160:0x003c, B:164:0x0047, B:167:0x005c, B:168:0x0062, B:176:0x0097, B:178:0x00a2, B:180:0x00ae, B:182:0x00b8, B:184:0x00c4, B:186:0x00ce, B:188:0x00da, B:190:0x00e4, B:192:0x00f6, B:194:0x0100, B:195:0x0106, B:203:0x0135, B:204:0x013c, B:206:0x0149, B:208:0x0151, B:210:0x016e, B:198:0x0110, B:201:0x0126, B:172:0x006e, B:175:0x0087), top: B:271:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0100 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #6 {all -> 0x0043, blocks: (B:150:0x000b, B:160:0x003c, B:164:0x0047, B:167:0x005c, B:168:0x0062, B:176:0x0097, B:178:0x00a2, B:180:0x00ae, B:182:0x00b8, B:184:0x00c4, B:186:0x00ce, B:188:0x00da, B:190:0x00e4, B:192:0x00f6, B:194:0x0100, B:195:0x0106, B:203:0x0135, B:204:0x013c, B:206:0x0149, B:208:0x0151, B:210:0x016e, B:198:0x0110, B:201:0x0126, B:172:0x006e, B:175:0x0087), top: B:271:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0135 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:150:0x000b, B:160:0x003c, B:164:0x0047, B:167:0x005c, B:168:0x0062, B:176:0x0097, B:178:0x00a2, B:180:0x00ae, B:182:0x00b8, B:184:0x00c4, B:186:0x00ce, B:188:0x00da, B:190:0x00e4, B:192:0x00f6, B:194:0x0100, B:195:0x0106, B:203:0x0135, B:204:0x013c, B:206:0x0149, B:208:0x0151, B:210:0x016e, B:198:0x0110, B:201:0x0126, B:172:0x006e, B:175:0x0087), top: B:271:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0149 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:150:0x000b, B:160:0x003c, B:164:0x0047, B:167:0x005c, B:168:0x0062, B:176:0x0097, B:178:0x00a2, B:180:0x00ae, B:182:0x00b8, B:184:0x00c4, B:186:0x00ce, B:188:0x00da, B:190:0x00e4, B:192:0x00f6, B:194:0x0100, B:195:0x0106, B:203:0x0135, B:204:0x013c, B:206:0x0149, B:208:0x0151, B:210:0x016e, B:198:0x0110, B:201:0x0126, B:172:0x006e, B:175:0x0087), top: B:271:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0189 A[Catch: all -> 0x018f, TryCatch #8 {all -> 0x018f, blocks: (B:212:0x017e, B:214:0x0189, B:217:0x0193, B:219:0x0197), top: B:275:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0197 A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #8 {all -> 0x018f, blocks: (B:212:0x017e, B:214:0x0189, B:217:0x0193, B:219:0x0197), top: B:275:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:? A[LOOP:0: B:147:0x0004->B:280:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x01ec A[EDGE_INSN: B:281:0x01ec->B:239:0x01ec BREAK  A[LOOP:1: B:226:0x01a9->B:284:0x01a9], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2881g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3614mN0.zzh():void");
    }
}

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.mv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3670mv extends AbstractC2986gv implements InterfaceC4279sE0 {

    /* renamed from: d, reason: collision with root package name */
    private String f21031d;

    /* renamed from: e, reason: collision with root package name */
    private final C4465tu f21032e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f21033f;

    /* renamed from: g, reason: collision with root package name */
    private final C3556lv f21034g;

    /* renamed from: h, reason: collision with root package name */
    private final C1859Ru f21035h;

    /* renamed from: i, reason: collision with root package name */
    private ByteBuffer f21036i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f21037j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f21038k;

    /* renamed from: l, reason: collision with root package name */
    private final String f21039l;

    /* renamed from: m, reason: collision with root package name */
    private final int f21040m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21041n;

    public C3670mv(InterfaceC4579uu interfaceC4579uu, C4465tu c4465tu) {
        super(interfaceC4579uu);
        this.f21032e = c4465tu;
        this.f21034g = new C3556lv();
        this.f21035h = new C1859Ru();
        this.f21038k = new Object();
        this.f21039l = (String) AbstractC4786wj0.zzd(interfaceC4579uu != null ? interfaceC4579uu.zzr() : null).zzb("");
        this.f21040m = interfaceC4579uu != null ? interfaceC4579uu.zzf() : 0;
    }

    protected static final String c(String str) {
        return "cache:".concat(String.valueOf(L1.g.zzf(str)));
    }

    private final void zzv() {
        int iA = (int) this.f21034g.a();
        int iZza = (int) this.f21035h.zza(this.f21036i);
        int iPosition = this.f21036i.position();
        int iRound = Math.round(iZza * (iPosition / iA));
        int iZzs = AbstractC3554lu.zzs();
        int iZzu = AbstractC3554lu.zzu();
        String str = this.f21031d;
        zzn(str, c(str), iPosition, iA, iRound, iZza, iRound > 0, iZzs, iZzu);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279sE0
    public final void zza(Ky0 ky0, NB0 nb0, boolean z8, int i8) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279sE0
    public final void zzb(Ky0 ky0, NB0 nb0, boolean z8) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279sE0
    public final void zzc(Ky0 ky0, NB0 nb0, boolean z8) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279sE0
    public final void zzd(Ky0 ky0, NB0 nb0, boolean z8) {
        if (ky0 instanceof C2567dE0) {
            this.f21034g.b((C2567dE0) ky0);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2986gv
    public final void zzf() {
        this.f21033f = true;
    }

    public final String zzi() {
        return this.f21031d;
    }

    public final ByteBuffer zzk() {
        synchronized (this.f21038k) {
            try {
                ByteBuffer byteBuffer = this.f21036i;
                if (byteBuffer != null && !this.f21037j) {
                    byteBuffer.flip();
                    this.f21037j = true;
                }
                this.f21033f = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f21036i;
    }

    public final boolean zzl() {
        return this.f21041n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b4, code lost:
    
        r21.f21041n = true;
        zzj(r22, r4, (int) r21.f21035h.zza(r21.f21036i));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ed, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:? -> B:23:0x00d6). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.AbstractC2986gv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzt(java.lang.String r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3670mv.zzt(java.lang.String):boolean");
    }
}

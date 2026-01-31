package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.mD0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3594mD0 implements L8 {

    /* renamed from: j, reason: collision with root package name */
    private static final AbstractC4961yD0 f20863j = AbstractC4961yD0.zzb(AbstractC3594mD0.class);

    /* renamed from: a, reason: collision with root package name */
    protected final String f20864a;

    /* renamed from: b, reason: collision with root package name */
    private M8 f20865b;

    /* renamed from: e, reason: collision with root package name */
    private ByteBuffer f20868e;

    /* renamed from: f, reason: collision with root package name */
    long f20869f;

    /* renamed from: h, reason: collision with root package name */
    InterfaceC4277sD0 f20871h;

    /* renamed from: g, reason: collision with root package name */
    long f20870g = -1;

    /* renamed from: i, reason: collision with root package name */
    private ByteBuffer f20872i = null;

    /* renamed from: d, reason: collision with root package name */
    boolean f20867d = true;

    /* renamed from: c, reason: collision with root package name */
    boolean f20866c = true;

    protected AbstractC3594mD0(String str) {
        this.f20864a = str;
    }

    private final synchronized void a() {
        try {
            if (this.f20867d) {
                return;
            }
            try {
                AbstractC4961yD0 abstractC4961yD0 = f20863j;
                String str = this.f20864a;
                abstractC4961yD0.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.f20868e = this.f20871h.zzd(this.f20869f, this.f20870g);
                this.f20867d = true;
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.L8
    public final String zza() {
        return this.f20864a;
    }

    @Override // com.google.android.gms.internal.ads.L8
    public final void zzb(InterfaceC4277sD0 interfaceC4277sD0, ByteBuffer byteBuffer, long j8, I8 i8) {
        this.f20869f = interfaceC4277sD0.zzb();
        byteBuffer.remaining();
        this.f20870g = j8;
        this.f20871h = interfaceC4277sD0;
        interfaceC4277sD0.zze(interfaceC4277sD0.zzb() + j8);
        this.f20867d = false;
        this.f20866c = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.L8
    public final void zzc(M8 m8) {
        this.f20865b = m8;
    }

    protected abstract void zzf(ByteBuffer byteBuffer);

    public final synchronized void zzg() {
        try {
            a();
            AbstractC4961yD0 abstractC4961yD0 = f20863j;
            String str = this.f20864a;
            abstractC4961yD0.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.f20868e;
            if (byteBuffer != null) {
                this.f20866c = true;
                byteBuffer.rewind();
                zzf(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    this.f20872i = byteBuffer.slice();
                }
                this.f20868e = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

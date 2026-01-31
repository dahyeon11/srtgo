package com.google.android.gms.internal.ads;

import D1.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.Yb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2113Yb extends AbstractCallableC4657vc {
    public C2113Yb(C1294Eb c1294Eb, String str, String str2, C3357k9 c3357k9, int i8, int i9) {
        super(c1294Eb, "FLgp79R6LGLnWDio6G1XBjsjORgKSjLkdakyn5bigQludVyQtVZMhDAlppvakfKf", "oPDFFWKd1EuWWR8iem/Fb2LK/5grpy+LhaDBlMcgIHs=", c3357k9, i8, 24);
    }

    private final void b() throws ExecutionException, InterruptedException, TimeoutException {
        D1.a aVarZzh = this.f23262b.zzh();
        if (aVarZzh == null) {
            return;
        }
        try {
            a.C0017a info = aVarZzh.getInfo();
            String id = info.getId();
            int i8 = AbstractC1417Hb.zza;
            if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID uuidFromString = UUID.fromString(id);
                byte[] bArr = new byte[16];
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                id = AbstractC3514la.zza(bArr, true);
            }
            if (id != null) {
                synchronized (this.f23265e) {
                    this.f23265e.zzt(id);
                    this.f23265e.zzs(info.isLimitAdTrackingEnabled());
                    this.f23265e.zzu(EnumC4268s9.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4657vc
    protected final void a() throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f23262b.zzq()) {
            b();
            return;
        }
        synchronized (this.f23265e) {
            this.f23265e.zzt((String) this.f23266f.invoke(null, this.f23262b.zzb()));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4657vc, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzl();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4657vc
    public final Void zzl() throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f23262b.zzr()) {
            super.zzl();
            return null;
        }
        if (this.f23262b.zzq()) {
            b();
        }
        return null;
    }
}

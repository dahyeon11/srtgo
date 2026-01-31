package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.oD0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3822oD0 extends AbstractC3594mD0 implements L8 {

    /* renamed from: k, reason: collision with root package name */
    private int f21438k;

    protected AbstractC3822oD0(String str) {
        super("mvhd");
    }

    protected final long b(ByteBuffer byteBuffer) {
        this.f21438k = K8.zzc(byteBuffer.get());
        K8.zzd(byteBuffer);
        byteBuffer.get();
        return 4L;
    }

    public final int zzh() {
        if (!this.f20866c) {
            zzg();
        }
        return this.f21438k;
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.y7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4948y7 implements InterfaceC4834x7 {

    /* renamed from: a, reason: collision with root package name */
    private final FileChannel f23847a;

    /* renamed from: b, reason: collision with root package name */
    private final long f23848b;

    /* renamed from: c, reason: collision with root package name */
    private final long f23849c;

    public C4948y7(FileChannel fileChannel, long j8, long j9) {
        this.f23847a = fileChannel;
        this.f23848b = j8;
        this.f23849c = j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4834x7
    public final long zza() {
        return this.f23849c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4834x7
    public final void zzb(MessageDigest[] messageDigestArr, long j8, int i8) throws IOException {
        MappedByteBuffer map = this.f23847a.map(FileChannel.MapMode.READ_ONLY, this.f23848b + j8, i8);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}

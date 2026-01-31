package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.lu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3554lu {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f20785a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicInteger f20786b = new AtomicInteger(0);

    protected static AtomicInteger a() {
        return f20785a;
    }

    protected static AtomicInteger b() {
        return f20786b;
    }

    public static int zzs() {
        return f20785a.get();
    }

    public static int zzu() {
        return f20786b.get();
    }

    public abstract long zzA();

    public abstract long zzB();

    public abstract Integer zzC();

    public abstract void zzF(Uri[] uriArr, String str);

    public abstract void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z8);

    public abstract void zzH();

    public abstract void zzI(long j8);

    public abstract void zzJ(int i8);

    public abstract void zzK(int i8);

    public abstract void zzL(InterfaceC3440ku interfaceC3440ku);

    public abstract void zzM(int i8);

    public abstract void zzN(int i8);

    public abstract void zzO(boolean z8);

    public abstract void zzP(Integer num);

    public abstract void zzQ(boolean z8);

    public abstract void zzR(int i8);

    public abstract void zzS(Surface surface, boolean z8);

    public abstract void zzT(float f8, boolean z8);

    public abstract void zzU();

    public abstract boolean zzV();

    public abstract int zzr();

    public abstract int zzt();

    public abstract long zzv();

    public abstract long zzw();

    public abstract long zzx();

    public abstract long zzy();

    public abstract long zzz();
}

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class Qx0 implements Pz0 {
    protected int zzq = 0;

    protected static void d(Iterable iterable, List list) {
        Px0.e(iterable, list);
    }

    private String f(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    int a() {
        throw new UnsupportedOperationException();
    }

    int b(InterfaceC3360kA0 interfaceC3360kA0) {
        return a();
    }

    AA0 c() {
        return new AA0(this);
    }

    void e(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.Pz0
    public AbstractC3677my0 zzaN() {
        try {
            int iZzaY = zzaY();
            AbstractC3677my0 abstractC3677my0 = AbstractC3677my0.zzb;
            byte[] bArr = new byte[iZzaY];
            Dy0 dy0ZzF = Dy0.zzF(bArr, 0, iZzaY);
            zzda(dy0ZzF);
            dy0ZzF.zzG();
            return new C2993gy0(bArr);
        } catch (IOException e8) {
            throw new RuntimeException(f("ByteString"), e8);
        }
    }

    public Uz0 zzaO() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public void zzaT(OutputStream outputStream) {
        int iZzaY = zzaY();
        By0 by0 = new By0(outputStream, Dy0.b(Dy0.zzD(iZzaY) + iZzaY));
        by0.zzu(iZzaY);
        zzda(by0);
        by0.zzL();
    }

    public void zzaU(OutputStream outputStream) {
        By0 by0 = new By0(outputStream, Dy0.b(zzaY()));
        zzda(by0);
        by0.zzL();
    }

    public byte[] zzaV() {
        try {
            int iZzaY = zzaY();
            byte[] bArr = new byte[iZzaY];
            Dy0 dy0ZzF = Dy0.zzF(bArr, 0, iZzaY);
            zzda(dy0ZzF);
            dy0ZzF.zzG();
            return bArr;
        } catch (IOException e8) {
            throw new RuntimeException(f("byte array"), e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.Pz0
    public abstract /* synthetic */ int zzaY();

    @Override // com.google.android.gms.internal.ads.Pz0, com.google.android.gms.internal.ads.Qz0
    public abstract /* synthetic */ Pz0 zzbt();

    @Override // com.google.android.gms.internal.ads.Pz0, com.google.android.gms.internal.ads.Qz0
    public abstract /* synthetic */ boolean zzbw();

    @Override // com.google.android.gms.internal.ads.Pz0
    public abstract /* synthetic */ Oz0 zzcY();

    @Override // com.google.android.gms.internal.ads.Pz0
    public abstract /* synthetic */ Oz0 zzcZ();

    @Override // com.google.android.gms.internal.ads.Pz0
    public abstract /* synthetic */ void zzda(Dy0 dy0);
}

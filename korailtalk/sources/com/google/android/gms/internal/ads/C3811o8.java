package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.o8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3811o8 {

    /* renamed from: d, reason: collision with root package name */
    protected static final Comparator f21423d = new C3697n8();

    /* renamed from: a, reason: collision with root package name */
    private final List f21424a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f21425b = new ArrayList(64);

    /* renamed from: c, reason: collision with root package name */
    private int f21426c = 0;

    public C3811o8(int i8) {
    }

    private final synchronized void a() {
        while (this.f21426c > 4096) {
            byte[] bArr = (byte[]) this.f21424a.remove(0);
            this.f21425b.remove(bArr);
            this.f21426c -= bArr.length;
        }
    }

    public final synchronized void zza(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.f21424a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f21425b, bArr, f21423d);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f21425b.add(iBinarySearch, bArr);
                this.f21426c += length;
                a();
            }
        }
    }

    public final synchronized byte[] zzb(int i8) {
        for (int i9 = 0; i9 < this.f21425b.size(); i9++) {
            byte[] bArr = (byte[]) this.f21425b.get(i9);
            int length = bArr.length;
            if (length >= i8) {
                this.f21426c -= length;
                this.f21425b.remove(i9);
                this.f21424a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i8];
    }
}

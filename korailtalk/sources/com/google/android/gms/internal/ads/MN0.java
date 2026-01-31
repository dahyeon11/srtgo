package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes2.dex */
final class MN0 {

    /* renamed from: a, reason: collision with root package name */
    private int f14630a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f14631b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3462l40 f14632c;

    public MN0() {
        this(new InterfaceC3462l40() { // from class: com.google.android.gms.internal.ads.LN0
            @Override // com.google.android.gms.internal.ads.InterfaceC3462l40
            public final void zza(Object obj) {
            }
        });
    }

    public final Object zza(int i8) {
        if (this.f14630a == -1) {
            this.f14630a = 0;
        }
        while (true) {
            int i9 = this.f14630a;
            if (i9 <= 0 || i8 >= this.f14631b.keyAt(i9)) {
                break;
            }
            this.f14630a--;
        }
        while (this.f14630a < this.f14631b.size() - 1 && i8 >= this.f14631b.keyAt(this.f14630a + 1)) {
            this.f14630a++;
        }
        return this.f14631b.valueAt(this.f14630a);
    }

    public final Object zzb() {
        return this.f14631b.valueAt(this.f14631b.size() - 1);
    }

    public final void zzc(int i8, Object obj) {
        if (this.f14630a == -1) {
            F10.zzf(this.f14631b.size() == 0);
            this.f14630a = 0;
        }
        if (this.f14631b.size() > 0) {
            int iKeyAt = this.f14631b.keyAt(r0.size() - 1);
            F10.zzd(i8 >= iKeyAt);
            if (iKeyAt == i8) {
                this.f14632c.zza(this.f14631b.valueAt(r1.size() - 1));
            }
        }
        this.f14631b.append(i8, obj);
    }

    public final void zzd() {
        for (int i8 = 0; i8 < this.f14631b.size(); i8++) {
            this.f14632c.zza(this.f14631b.valueAt(i8));
        }
        this.f14630a = -1;
        this.f14631b.clear();
    }

    public final void zze(int i8) {
        int i9 = 0;
        while (i9 < this.f14631b.size() - 1) {
            int i10 = i9 + 1;
            if (i8 < this.f14631b.keyAt(i10)) {
                return;
            }
            this.f14632c.zza(this.f14631b.valueAt(i9));
            this.f14631b.removeAt(i9);
            int i11 = this.f14630a;
            if (i11 > 0) {
                this.f14630a = i11 - 1;
            }
            i9 = i10;
        }
    }

    public final boolean zzf() {
        return this.f14631b.size() == 0;
    }

    public MN0(InterfaceC3462l40 interfaceC3462l40) {
        this.f14631b = new SparseArray();
        this.f14632c = interfaceC3462l40;
        this.f14630a = -1;
    }
}

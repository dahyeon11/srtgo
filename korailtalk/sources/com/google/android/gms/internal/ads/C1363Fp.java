package com.google.android.gms.internal.ads;

import H1.C0581v1;
import Q1.c;
import Q1.f;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Fp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1363Fp implements Q1.f {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4899xj f13072a;

    /* renamed from: b, reason: collision with root package name */
    private f.a f13073b;

    public C1363Fp(InterfaceC4899xj interfaceC4899xj) {
        this.f13072a = interfaceC4899xj;
    }

    @Override // Q1.f
    public final void destroy() {
        try {
            this.f13072a.zzl();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // Q1.f
    public final List<String> getAvailableAssetNames() {
        try {
            return this.f13072a.zzk();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return null;
        }
    }

    @Override // Q1.f
    public final String getCustomFormatId() {
        try {
            return this.f13072a.zzi();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return null;
        }
    }

    @Override // Q1.f
    public final f.a getDisplayOpenMeasurement() {
        try {
            if (this.f13073b == null && this.f13072a.zzq()) {
                this.f13073b = new C5139zp(this.f13072a);
            }
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
        return this.f13073b;
    }

    @Override // Q1.f
    public final c.b getImage(String str) {
        try {
            InterfaceC2503cj interfaceC2503cjZzg = this.f13072a.zzg(str);
            if (interfaceC2503cjZzg != null) {
                return new C1158Ap(interfaceC2503cjZzg);
            }
            return null;
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return null;
        }
    }

    @Override // Q1.f
    public final y1.o getMediaContent() {
        try {
            if (this.f13072a.zzf() != null) {
                return new C0581v1(this.f13072a.zzf(), this.f13072a);
            }
            return null;
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return null;
        }
    }

    @Override // Q1.f
    public final CharSequence getText(String str) {
        try {
            return this.f13072a.zzj(str);
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return null;
        }
    }

    @Override // Q1.f
    public final void performClick(String str) {
        try {
            this.f13072a.zzn(str);
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // Q1.f
    public final void recordImpression() {
        try {
            this.f13072a.zzo();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }
}

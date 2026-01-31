package com.google.android.gms.internal.ads;

import H1.AbstractBinderC0592z0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import r2.InterfaceC6172a;
import y1.C6514A;

/* renamed from: com.google.android.gms.internal.ads.ck, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2505ck extends B1.h {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2391bk f18339a;

    /* renamed from: c, reason: collision with root package name */
    private final C2618dj f18341c;

    /* renamed from: e, reason: collision with root package name */
    private final B1.c f18343e;

    /* renamed from: b, reason: collision with root package name */
    private final List f18340b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final C6514A f18342d = new C6514A();

    /* renamed from: f, reason: collision with root package name */
    private final List f18344f = new ArrayList();

    public C2505ck(InterfaceC2391bk interfaceC2391bk) {
        InterfaceC2503cj interfaceC2503cjZzk;
        InterfaceC2503cj c2274aj;
        IBinder iBinder;
        this.f18339a = interfaceC2391bk;
        C2045Wi c2045Wi = null;
        try {
            List listZzu = interfaceC2391bk.zzu();
            if (listZzu != null) {
                for (Object obj : listZzu) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        c2274aj = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        c2274aj = iInterfaceQueryLocalInterface instanceof InterfaceC2503cj ? (InterfaceC2503cj) iInterfaceQueryLocalInterface : new C2274aj(iBinder);
                    }
                    if (c2274aj != null) {
                        this.f18340b.add(new C2618dj(c2274aj));
                    }
                }
            }
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
        try {
            List listZzv = this.f18339a.zzv();
            if (listZzv != null) {
                for (Object obj2 : listZzv) {
                    H1.A0 a0Zzb = obj2 instanceof IBinder ? AbstractBinderC0592z0.zzb((IBinder) obj2) : null;
                    if (a0Zzb != null) {
                        this.f18344f.add(new H1.B0(a0Zzb));
                    }
                }
            }
        } catch (RemoteException e9) {
            L1.n.zzh("", e9);
        }
        try {
            interfaceC2503cjZzk = this.f18339a.zzk();
        } catch (RemoteException e10) {
            L1.n.zzh("", e10);
        }
        C2618dj c2618dj = interfaceC2503cjZzk != null ? new C2618dj(interfaceC2503cjZzk) : null;
        this.f18341c = c2618dj;
        try {
            if (this.f18339a.zzi() != null) {
                c2045Wi = new C2045Wi(this.f18339a.zzi());
            }
        } catch (RemoteException e11) {
            L1.n.zzh("", e11);
        }
        this.f18343e = c2045Wi;
    }

    @Override // B1.h
    public final void performClick(Bundle bundle) {
        try {
            this.f18339a.zzz(bundle);
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // B1.h
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f18339a.zzI(bundle);
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return false;
        }
    }

    @Override // B1.h
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f18339a.zzB(bundle);
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // B1.h
    public final C6514A zza() {
        try {
            if (this.f18339a.zzh() != null) {
                this.f18342d.zzb(this.f18339a.zzh());
            }
        } catch (RemoteException e8) {
            L1.n.zzh("Exception occurred while getting video controller", e8);
        }
        return this.f18342d;
    }

    @Override // B1.h
    public final B1.d zzb() {
        return this.f18341c;
    }

    @Override // B1.h
    public final Double zzc() {
        try {
            double dZze = this.f18339a.zze();
            if (dZze == -1.0d) {
                return null;
            }
            return Double.valueOf(dZze);
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return null;
        }
    }

    @Override // B1.h
    public final Object zzd() {
        try {
            InterfaceC6172a interfaceC6172aZzl = this.f18339a.zzl();
            if (interfaceC6172aZzl != null) {
                return r2.b.unwrap(interfaceC6172aZzl);
            }
            return null;
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return null;
        }
    }

    @Override // B1.h
    public final String zze() {
        try {
            return this.f18339a.zzn();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return null;
        }
    }

    @Override // B1.h
    public final String zzf() {
        try {
            return this.f18339a.zzo();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return null;
        }
    }

    @Override // B1.h
    public final String zzg() {
        try {
            return this.f18339a.zzp();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return null;
        }
    }

    @Override // B1.h
    public final String zzh() {
        try {
            return this.f18339a.zzq();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return null;
        }
    }

    @Override // B1.h
    public final String zzi() {
        try {
            return this.f18339a.zzs();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return null;
        }
    }

    @Override // B1.h
    public final String zzj() {
        try {
            return this.f18339a.zzt();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return null;
        }
    }

    @Override // B1.h
    public final List zzk() {
        return this.f18340b;
    }
}

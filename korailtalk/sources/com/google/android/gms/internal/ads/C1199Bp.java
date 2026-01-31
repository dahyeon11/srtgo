package com.google.android.gms.internal.ads;

import H1.AbstractBinderC0592z0;
import H1.BinderC0586x0;
import H1.C0581v1;
import Q1.c;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Bp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1199Bp extends Q1.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2391bk f12306a;

    /* renamed from: c, reason: collision with root package name */
    private final C1158Ap f12308c;

    /* renamed from: d, reason: collision with root package name */
    private final c.a f12309d;

    /* renamed from: b, reason: collision with root package name */
    private final List f12307b = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final List f12310e = new ArrayList();

    public C1199Bp(InterfaceC2391bk interfaceC2391bk) {
        InterfaceC2503cj interfaceC2503cjZzk;
        this.f12306a = interfaceC2391bk;
        C5025yp c5025yp = null;
        try {
            List listZzu = interfaceC2391bk.zzu();
            if (listZzu != null) {
                for (Object obj : listZzu) {
                    InterfaceC2503cj interfaceC2503cjZzg = obj instanceof IBinder ? AbstractBinderC2389bj.zzg((IBinder) obj) : null;
                    if (interfaceC2503cjZzg != null) {
                        this.f12307b.add(new C1158Ap(interfaceC2503cjZzg));
                    }
                }
            }
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
        try {
            List listZzv = this.f12306a.zzv();
            if (listZzv != null) {
                for (Object obj2 : listZzv) {
                    H1.A0 a0Zzb = obj2 instanceof IBinder ? AbstractBinderC0592z0.zzb((IBinder) obj2) : null;
                    if (a0Zzb != null) {
                        this.f12310e.add(new H1.B0(a0Zzb));
                    }
                }
            }
        } catch (RemoteException e9) {
            L1.n.zzh("", e9);
        }
        try {
            interfaceC2503cjZzk = this.f12306a.zzk();
        } catch (RemoteException e10) {
            L1.n.zzh("", e10);
        }
        C1158Ap c1158Ap = interfaceC2503cjZzk != null ? new C1158Ap(interfaceC2503cjZzk) : null;
        this.f12308c = c1158Ap;
        try {
            if (this.f12306a.zzi() != null) {
                c5025yp = new C5025yp(this.f12306a.zzi());
            }
        } catch (RemoteException e11) {
            L1.n.zzh("", e11);
        }
        this.f12309d = c5025yp;
    }

    @Override // Q1.c
    protected final /* bridge */ /* synthetic */ Object a() {
        try {
            return this.f12306a.zzm();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return null;
        }
    }

    @Override // Q1.c
    public final void cancelUnconfirmedClick() {
        try {
            this.f12306a.zzw();
        } catch (RemoteException e8) {
            L1.n.zzh("Failed to cancelUnconfirmedClick", e8);
        }
    }

    @Override // Q1.c
    public final void destroy() {
        try {
            this.f12306a.zzx();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // Q1.c
    public final void enableCustomClickGesture() {
        try {
            this.f12306a.zzC();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // Q1.c
    public final c.a getAdChoicesInfo() {
        return this.f12309d;
    }

    @Override // Q1.c
    public final String getAdvertiser() {
        try {
            return this.f12306a.zzn();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return null;
        }
    }

    @Override // Q1.c
    public final String getBody() {
        try {
            return this.f12306a.zzo();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return null;
        }
    }

    @Override // Q1.c
    public final String getCallToAction() {
        try {
            return this.f12306a.zzp();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return null;
        }
    }

    @Override // Q1.c
    public final Bundle getExtras() {
        try {
            Bundle bundleZzf = this.f12306a.zzf();
            if (bundleZzf != null) {
                return bundleZzf;
            }
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
        return new Bundle();
    }

    @Override // Q1.c
    public final String getHeadline() {
        try {
            return this.f12306a.zzq();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return null;
        }
    }

    @Override // Q1.c
    public final c.b getIcon() {
        return this.f12308c;
    }

    @Override // Q1.c
    public final List<c.b> getImages() {
        return this.f12307b;
    }

    @Override // Q1.c
    public final y1.o getMediaContent() {
        try {
            if (this.f12306a.zzj() != null) {
                return new C0581v1(this.f12306a.zzj(), null);
            }
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
        return null;
    }

    @Override // Q1.c
    public final List<y1.q> getMuteThisAdReasons() {
        return this.f12310e;
    }

    @Override // Q1.c
    public final String getPrice() {
        try {
            return this.f12306a.zzs();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return null;
        }
    }

    @Override // Q1.c
    public final y1.y getResponseInfo() {
        H1.S0 s0Zzg;
        try {
            s0Zzg = this.f12306a.zzg();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            s0Zzg = null;
        }
        return y1.y.zza(s0Zzg);
    }

    @Override // Q1.c
    public final Double getStarRating() {
        try {
            double dZze = this.f12306a.zze();
            if (dZze == -1.0d) {
                return null;
            }
            return Double.valueOf(dZze);
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return null;
        }
    }

    @Override // Q1.c
    public final String getStore() {
        try {
            return this.f12306a.zzt();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return null;
        }
    }

    @Override // Q1.c
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.f12306a.zzG();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return false;
        }
    }

    @Override // Q1.c
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.f12306a.zzH();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return false;
        }
    }

    @Override // Q1.c
    public final void muteThisAd(y1.q qVar) {
        try {
            try {
                if (this.f12306a.zzH()) {
                    if (qVar == null) {
                        this.f12306a.zzy(null);
                        return;
                    } else if (qVar instanceof H1.B0) {
                        this.f12306a.zzy(((H1.B0) qVar).zza());
                        return;
                    } else {
                        L1.n.zzg("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (RemoteException e8) {
                L1.n.zzh("", e8);
            }
            L1.n.zzg("Ad is not custom mute enabled");
        } catch (RemoteException e9) {
            L1.n.zzh("", e9);
        }
    }

    @Override // Q1.c
    public final void performClick(Bundle bundle) {
        try {
            this.f12306a.zzz(bundle);
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // Q1.c
    public final void recordCustomClickGesture() {
        try {
            this.f12306a.zzA();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // Q1.c
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f12306a.zzI(bundle);
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return false;
        }
    }

    @Override // Q1.c
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f12306a.zzB(bundle);
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // Q1.c
    public final void setMuteThisAdListener(y1.p pVar) {
        try {
            this.f12306a.zzD(new BinderC0586x0(pVar));
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // Q1.c
    public final void setOnPaidEventListener(y1.s sVar) {
        try {
            this.f12306a.zzE(new H1.L1(sVar));
        } catch (RemoteException e8) {
            L1.n.zzh("Failed to setOnPaidEventListener", e8);
        }
    }

    @Override // Q1.c
    public final void setUnconfirmedClickListener(c.d dVar) {
        try {
            this.f12306a.zzF(new BinderC1445Hp(dVar));
        } catch (RemoteException e8) {
            L1.n.zzh("Failed to setUnconfirmedClickListener", e8);
        }
    }
}

package y1;

import H1.A1;
import H1.C0525c1;
import H1.C0591z;
import H1.P;
import H1.R1;
import H1.T;
import H1.T1;
import H1.c2;
import H1.d2;
import Q1.c;
import Q1.f;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC3872oi;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.BinderC1404Gp;
import com.google.android.gms.internal.ads.BinderC1686Nn;
import com.google.android.gms.internal.ads.BinderC3648mk;
import com.google.android.gms.internal.ads.BinderC3762nk;
import com.google.android.gms.internal.ads.C1322Ep;
import com.google.android.gms.internal.ads.C1840Ri;
import com.google.android.gms.internal.ads.C3420kk;
import i2.AbstractC5683p;
import z1.AbstractC6615a;

/* renamed from: y1.g */
/* loaded from: classes.dex */
public class C6526g {

    /* renamed from: a */
    private final c2 f37572a;

    /* renamed from: b */
    private final Context f37573b;

    /* renamed from: c */
    private final P f37574c;

    /* renamed from: y1.g$a */
    public static class a {

        /* renamed from: a */
        private final Context f37575a;

        /* renamed from: b */
        private final T f37576b;

        public a(Context context, String str) {
            Context context2 = (Context) AbstractC5683p.checkNotNull(context, "context cannot be null");
            T tZzc = C0591z.zza().zzc(context, str, new BinderC1686Nn());
            this.f37575a = context2;
            this.f37576b = tZzc;
        }

        public C6526g build() {
            try {
                return new C6526g(this.f37575a, this.f37576b.zze(), c2.zza);
            } catch (RemoteException e8) {
                L1.n.zzh("Failed to build AdLoader.", e8);
                return new C6526g(this.f37575a, new A1().zzc(), c2.zza);
            }
        }

        public a forAdManagerAdView(B1.f fVar, C6528i... c6528iArr) {
            if (c6528iArr == null || c6528iArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.f37576b.zzj(new BinderC3648mk(fVar), new d2(this.f37575a, c6528iArr));
            } catch (RemoteException e8) {
                L1.n.zzk("Failed to add Google Ad Manager banner ad listener", e8);
            }
            return this;
        }

        public a forCustomFormatAd(String str, f.c cVar, f.b bVar) {
            C1322Ep c1322Ep = new C1322Ep(cVar, bVar);
            try {
                this.f37576b.zzh(str, c1322Ep.zzb(), c1322Ep.zza());
            } catch (RemoteException e8) {
                L1.n.zzk("Failed to add custom format ad listener", e8);
            }
            return this;
        }

        public a forNativeAd(c.InterfaceC0068c interfaceC0068c) {
            try {
                this.f37576b.zzk(new BinderC1404Gp(interfaceC0068c));
            } catch (RemoteException e8) {
                L1.n.zzk("Failed to add google native ad listener", e8);
            }
            return this;
        }

        public a withAdListener(AbstractC6524e abstractC6524e) {
            try {
                this.f37576b.zzl(new T1(abstractC6524e));
            } catch (RemoteException e8) {
                L1.n.zzk("Failed to set AdListener.", e8);
            }
            return this;
        }

        public a withAdManagerAdViewOptions(B1.a aVar) {
            try {
                this.f37576b.zzm(aVar);
            } catch (RemoteException e8) {
                L1.n.zzk("Failed to specify Ad Manager banner ad options", e8);
            }
            return this;
        }

        public a withNativeAdOptions(Q1.d dVar) {
            try {
                this.f37576b.zzo(new C1840Ri(4, dVar.shouldReturnUrlsForImageAssets(), -1, dVar.shouldRequestMultipleImages(), dVar.getAdChoicesPlacement(), dVar.getVideoOptions() != null ? new R1(dVar.getVideoOptions()) : null, dVar.zzc(), dVar.getMediaAspectRatio(), dVar.zza(), dVar.zzb(), dVar.zzd() - 1));
            } catch (RemoteException e8) {
                L1.n.zzk("Failed to specify native ad options", e8);
            }
            return this;
        }

        @Deprecated
        public final a zza(String str, B1.n nVar, B1.m mVar) {
            C3420kk c3420kk = new C3420kk(nVar, mVar);
            try {
                this.f37576b.zzh(str, c3420kk.zzd(), c3420kk.zzc());
            } catch (RemoteException e8) {
                L1.n.zzk("Failed to add custom template ad listener", e8);
            }
            return this;
        }

        @Deprecated
        public final a zzb(B1.p pVar) {
            try {
                this.f37576b.zzk(new BinderC3762nk(pVar));
            } catch (RemoteException e8) {
                L1.n.zzk("Failed to add google native ad listener", e8);
            }
            return this;
        }

        @Deprecated
        public final a zzc(B1.e eVar) {
            try {
                this.f37576b.zzo(new C1840Ri(eVar));
            } catch (RemoteException e8) {
                L1.n.zzk("Failed to specify native ad options", e8);
            }
            return this;
        }
    }

    C6526g(Context context, P p8, c2 c2Var) {
        this.f37573b = context;
        this.f37574c = p8;
        this.f37572a = c2Var;
    }

    private final void b(final C0525c1 c0525c1) {
        AbstractC4439th.zza(this.f37573b);
        if (((Boolean) AbstractC3872oi.zzc.zze()).booleanValue()) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlg)).booleanValue()) {
                L1.c.zzb.execute(new Runnable() { // from class: y1.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.a(c0525c1);
                    }
                });
                return;
            }
        }
        try {
            this.f37574c.zzg(this.f37572a.zza(this.f37573b, c0525c1));
        } catch (RemoteException e8) {
            L1.n.zzh("Failed to load ad.", e8);
        }
    }

    final /* synthetic */ void a(C0525c1 c0525c1) {
        try {
            this.f37574c.zzg(this.f37572a.zza(this.f37573b, c0525c1));
        } catch (RemoteException e8) {
            L1.n.zzh("Failed to load ad.", e8);
        }
    }

    public boolean isLoading() {
        try {
            return this.f37574c.zzi();
        } catch (RemoteException e8) {
            L1.n.zzk("Failed to check if ad is loading.", e8);
            return false;
        }
    }

    public void loadAd(C6527h c6527h) {
        b(c6527h.f37577a);
    }

    public void loadAds(C6527h c6527h, int i8) {
        try {
            this.f37574c.zzh(this.f37572a.zza(this.f37573b, c6527h.f37577a), i8);
        } catch (RemoteException e8) {
            L1.n.zzh("Failed to load ads.", e8);
        }
    }

    public void loadAd(AbstractC6615a abstractC6615a) {
        throw null;
    }
}

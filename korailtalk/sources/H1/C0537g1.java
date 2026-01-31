package H1;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.BinderC1686Nn;
import com.google.android.gms.internal.ads.BinderC3406kd;
import java.util.concurrent.atomic.AtomicBoolean;
import r2.InterfaceC6172a;
import y1.AbstractC6517D;
import y1.AbstractC6524e;
import y1.C6514A;
import y1.C6515B;
import y1.C6528i;

/* renamed from: H1.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0537g1 {

    /* renamed from: a, reason: collision with root package name */
    private final BinderC1686Nn f1683a;

    /* renamed from: b, reason: collision with root package name */
    private final c2 f1684b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f1685c;

    /* renamed from: d, reason: collision with root package name */
    private final C6514A f1686d;

    /* renamed from: e, reason: collision with root package name */
    final A f1687e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC0517a f1688f;

    /* renamed from: g, reason: collision with root package name */
    private AbstractC6524e f1689g;

    /* renamed from: h, reason: collision with root package name */
    private C6528i[] f1690h;

    /* renamed from: i, reason: collision with root package name */
    private z1.e f1691i;

    /* renamed from: j, reason: collision with root package name */
    private X f1692j;

    /* renamed from: k, reason: collision with root package name */
    private C6515B f1693k;

    /* renamed from: l, reason: collision with root package name */
    private String f1694l;

    /* renamed from: m, reason: collision with root package name */
    private final ViewGroup f1695m;

    /* renamed from: n, reason: collision with root package name */
    private int f1696n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f1697o;

    public C0537g1(ViewGroup viewGroup) {
        this(viewGroup, null, false, c2.zza, null, 0);
    }

    private static d2 a(Context context, C6528i[] c6528iArr, int i8) {
        for (C6528i c6528i : c6528iArr) {
            if (c6528i.equals(C6528i.INVALID)) {
                return d2.zze();
            }
        }
        d2 d2Var = new d2(context, c6528iArr);
        d2Var.zzj = b(i8);
        return d2Var;
    }

    private static boolean b(int i8) {
        return i8 == 1;
    }

    final /* synthetic */ void d(InterfaceC6172a interfaceC6172a) {
        this.f1695m.addView((View) r2.b.unwrap(interfaceC6172a));
    }

    public final boolean zzA() {
        try {
            X x8 = this.f1692j;
            if (x8 != null) {
                return x8.zzY();
            }
            return false;
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
            return false;
        }
    }

    public final boolean zzB() {
        try {
            X x8 = this.f1692j;
            if (x8 != null) {
                return x8.zzZ();
            }
            return false;
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
            return false;
        }
    }

    public final C6528i[] zzC() {
        return this.f1690h;
    }

    public final AbstractC6524e zza() {
        return this.f1689g;
    }

    public final C6528i zzb() {
        d2 d2VarZzg;
        try {
            X x8 = this.f1692j;
            if (x8 != null && (d2VarZzg = x8.zzg()) != null) {
                return AbstractC6517D.zzc(d2VarZzg.zze, d2VarZzg.zzb, d2VarZzg.zza);
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
        C6528i[] c6528iArr = this.f1690h;
        if (c6528iArr != null) {
            return c6528iArr[0];
        }
        return null;
    }

    public final y1.s zzc() {
        return null;
    }

    public final y1.y zzd() {
        S0 s0Zzk = null;
        try {
            X x8 = this.f1692j;
            if (x8 != null) {
                s0Zzk = x8.zzk();
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
        return y1.y.zza(s0Zzk);
    }

    public final C6514A zzf() {
        return this.f1686d;
    }

    public final C6515B zzg() {
        return this.f1693k;
    }

    public final z1.e zzh() {
        return this.f1691i;
    }

    public final V0 zzi() {
        X x8 = this.f1692j;
        if (x8 != null) {
            try {
                return x8.zzl();
            } catch (RemoteException e8) {
                L1.n.zzl("#007 Could not call remote method.", e8);
            }
        }
        return null;
    }

    public final String zzj() {
        X x8;
        if (this.f1694l == null && (x8 = this.f1692j) != null) {
            try {
                this.f1694l = x8.zzr();
            } catch (RemoteException e8) {
                L1.n.zzl("#007 Could not call remote method.", e8);
            }
        }
        return this.f1694l;
    }

    public final void zzk() {
        try {
            X x8 = this.f1692j;
            if (x8 != null) {
                x8.zzx();
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3 A[Catch: RemoteException -> 0x00d1, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00d1, blocks: (B:27:0x00a0, B:29:0x00a6, B:31:0x00b4, B:33:0x00c6, B:36:0x00d3), top: B:49:0x00a0, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzm(H1.C0525c1 r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.C0537g1.zzm(H1.c1):void");
    }

    public final void zzn() {
        try {
            X x8 = this.f1692j;
            if (x8 != null) {
                x8.zzz();
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final void zzo() {
        if (this.f1685c.getAndSet(true)) {
            return;
        }
        try {
            X x8 = this.f1692j;
            if (x8 != null) {
                x8.zzA();
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final void zzp() {
        try {
            X x8 = this.f1692j;
            if (x8 != null) {
                x8.zzB();
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final void zzq(InterfaceC0517a interfaceC0517a) {
        try {
            this.f1688f = interfaceC0517a;
            X x8 = this.f1692j;
            if (x8 != null) {
                x8.zzC(interfaceC0517a != null ? new B(interfaceC0517a) : null);
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final void zzr(AbstractC6524e abstractC6524e) {
        this.f1689g = abstractC6524e;
        this.f1687e.zza(abstractC6524e);
    }

    public final void zzs(C6528i... c6528iArr) {
        if (this.f1690h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        zzt(c6528iArr);
    }

    public final void zzt(C6528i... c6528iArr) {
        this.f1690h = c6528iArr;
        try {
            X x8 = this.f1692j;
            if (x8 != null) {
                x8.zzF(a(this.f1695m.getContext(), this.f1690h, this.f1696n));
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
        this.f1695m.requestLayout();
    }

    public final void zzu(String str) {
        if (this.f1694l != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f1694l = str;
    }

    public final void zzv(z1.e eVar) {
        try {
            this.f1691i = eVar;
            X x8 = this.f1692j;
            if (x8 != null) {
                x8.zzG(eVar != null ? new BinderC3406kd(eVar) : null);
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final void zzw(boolean z8) {
        this.f1697o = z8;
        try {
            X x8 = this.f1692j;
            if (x8 != null) {
                x8.zzN(z8);
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final void zzx(y1.s sVar) {
        try {
            X x8 = this.f1692j;
            if (x8 != null) {
                x8.zzP(new L1(sVar));
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final void zzy(C6515B c6515b) {
        this.f1693k = c6515b;
        try {
            X x8 = this.f1692j;
            if (x8 != null) {
                x8.zzU(c6515b == null ? null : new R1(c6515b));
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final boolean zzz(X x8) {
        try {
            InterfaceC6172a interfaceC6172aZzn = x8.zzn();
            if (interfaceC6172aZzn == null || ((View) r2.b.unwrap(interfaceC6172aZzn)).getParent() != null) {
                return false;
            }
            this.f1695m.addView((View) r2.b.unwrap(interfaceC6172aZzn));
            this.f1692j = x8;
            return true;
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
            return false;
        }
    }

    public C0537g1(ViewGroup viewGroup, int i8) {
        this(viewGroup, null, false, c2.zza, null, i8);
    }

    public C0537g1(ViewGroup viewGroup, AttributeSet attributeSet, boolean z8) {
        this(viewGroup, attributeSet, z8, c2.zza, null, 0);
    }

    public C0537g1(ViewGroup viewGroup, AttributeSet attributeSet, boolean z8, int i8) {
        this(viewGroup, attributeSet, z8, c2.zza, null, i8);
    }

    C0537g1(ViewGroup viewGroup, AttributeSet attributeSet, boolean z8, c2 c2Var, X x8, int i8) {
        d2 d2VarZze;
        this.f1683a = new BinderC1686Nn();
        this.f1686d = new C6514A();
        this.f1687e = new C0531e1(this);
        this.f1695m = viewGroup;
        this.f1684b = c2Var;
        this.f1692j = null;
        this.f1685c = new AtomicBoolean(false);
        this.f1696n = i8;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                l2 l2Var = new l2(context, attributeSet);
                this.f1690h = l2Var.zzb(z8);
                this.f1694l = l2Var.zza();
                if (viewGroup.isInEditMode()) {
                    L1.g gVarZzb = C0591z.zzb();
                    C6528i c6528i = this.f1690h[0];
                    int i9 = this.f1696n;
                    if (c6528i.equals(C6528i.INVALID)) {
                        d2VarZze = d2.zze();
                    } else {
                        d2 d2Var = new d2(context, c6528i);
                        d2Var.zzj = b(i9);
                        d2VarZze = d2Var;
                    }
                    gVarZzb.zzn(viewGroup, d2VarZze, "Ads by Google");
                }
            } catch (IllegalArgumentException e8) {
                C0591z.zzb().zzm(viewGroup, new d2(context, C6528i.BANNER), e8.getMessage(), e8.getMessage());
            }
        }
    }
}

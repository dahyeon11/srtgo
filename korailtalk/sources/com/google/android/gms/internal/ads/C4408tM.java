package com.google.android.gms.internal.ads;

import K1.AbstractC0630c0;
import K1.AbstractC0667v0;
import K1.InterfaceC0671x0;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.tM */
/* loaded from: classes2.dex */
public final class C4408tM {

    /* renamed from: k */
    static final ImageView.ScaleType f22819k = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: a */
    private final InterfaceC0671x0 f22820a;

    /* renamed from: b */
    private final C1825Ra0 f22821b;

    /* renamed from: c */
    private final XL f22822c;

    /* renamed from: d */
    private final SL f22823d;

    /* renamed from: e */
    private final GM f22824e;

    /* renamed from: f */
    private final OM f22825f;

    /* renamed from: g */
    private final Executor f22826g;

    /* renamed from: h */
    private final Executor f22827h;

    /* renamed from: i */
    private final C1840Ri f22828i;

    /* renamed from: j */
    private final PL f22829j;

    public C4408tM(InterfaceC0671x0 interfaceC0671x0, C1825Ra0 c1825Ra0, XL xl, SL sl, GM gm, OM om, Executor executor, Executor executor2, PL pl) {
        this.f22820a = interfaceC0671x0;
        this.f22821b = c1825Ra0;
        this.f22828i = c1825Ra0.zzi;
        this.f22822c = xl;
        this.f22823d = sl;
        this.f22824e = gm;
        this.f22825f = om;
        this.f22826g = executor;
        this.f22827h = executor2;
        this.f22829j = pl;
    }

    private static void c(RelativeLayout.LayoutParams layoutParams, int i8) {
        if (i8 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i8 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i8 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean d(ViewGroup viewGroup, boolean z8) {
        View viewZzf = z8 ? this.f22823d.zzf() : this.f22823d.zzg();
        if (viewZzf == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewZzf.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewZzf.getParent()).removeView(viewZzf);
        }
        viewGroup.addView(viewZzf, ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdQ)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    final /* synthetic */ void a(ViewGroup viewGroup) {
        SL sl = this.f22823d;
        if (sl.zzf() != null) {
            boolean z8 = viewGroup != null;
            if (sl.zzc() == 2 || sl.zzc() == 1) {
                this.f22820a.zzK(this.f22821b.zzf, String.valueOf(sl.zzc()), z8);
            } else if (sl.zzc() == 6) {
                this.f22820a.zzK(this.f22821b.zzf, "2", z8);
                this.f22820a.zzK(this.f22821b.zzf, "1", z8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ void b(com.google.android.gms.internal.ads.QM r10) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4408tM.b(com.google.android.gms.internal.ads.QM):void");
    }

    public final void zzc(QM qm) {
        if (qm == null || this.f22824e == null || qm.zzh() == null || !this.f22822c.zzg()) {
            return;
        }
        try {
            qm.zzh().addView(this.f22824e.zza());
        } catch (C3444kw e8) {
            AbstractC0667v0.zzb("web view can not be obtained", e8);
        }
    }

    public final void zzd(QM qm) {
        if (qm == null) {
            return;
        }
        Context context = qm.zzf().getContext();
        if (AbstractC0630c0.zzh(context, this.f22822c.f17237a)) {
            if (!(context instanceof Activity)) {
                L1.n.zze("Activity context is needed for policy validator.");
                return;
            }
            if (this.f22825f == null || qm.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.f22825f.zza(qm.zzh(), windowManager), AbstractC0630c0.zzb());
            } catch (C3444kw e8) {
                AbstractC0667v0.zzb("web view can not be obtained", e8);
            }
        }
    }

    public final void zze(final QM qm) {
        this.f22826g.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.rM
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.b(qm);
            }
        });
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return d(viewGroup, false);
    }

    public final boolean zzg(ViewGroup viewGroup) {
        return d(viewGroup, true);
    }
}

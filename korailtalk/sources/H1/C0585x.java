package H1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.C1772Pp;
import com.google.android.gms.internal.ads.C2061Wr;
import com.google.android.gms.internal.ads.C2620dk;
import com.google.android.gms.internal.ads.C2734ek;
import com.google.android.gms.internal.ads.InterfaceC1232Cl;
import com.google.android.gms.internal.ads.InterfaceC1568Kp;
import com.google.android.gms.internal.ads.InterfaceC1570Kr;
import com.google.android.gms.internal.ads.InterfaceC1850Rn;
import com.google.android.gms.internal.ads.InterfaceC1895Sp;
import com.google.android.gms.internal.ads.InterfaceC1939Ts;
import com.google.android.gms.internal.ads.InterfaceC2962gj;
import com.google.android.gms.internal.ads.InterfaceC3760nj;
import com.google.android.gms.internal.ads.InterfaceC4343sq;
import java.util.HashMap;

/* renamed from: H1.x */
/* loaded from: classes.dex */
public final class C0585x {

    /* renamed from: a */
    private final X1 f1761a;

    /* renamed from: b */
    private final V1 f1762b;

    /* renamed from: c */
    private final C0584w1 f1763c;

    /* renamed from: d */
    private final C2620dk f1764d;

    /* renamed from: e */
    private final C2061Wr f1765e;

    /* renamed from: f */
    private final C1772Pp f1766f;

    /* renamed from: g */
    private final C2734ek f1767g;

    /* renamed from: h */
    private InterfaceC4343sq f1768h;

    public C0585x(X1 x12, V1 v12, C0584w1 c0584w1, C2620dk c2620dk, C2061Wr c2061Wr, C1772Pp c1772Pp, C2734ek c2734ek) {
        this.f1761a = x12;
        this.f1762b = v12;
        this.f1763c = c0584w1;
        this.f1764d = c2620dk;
        this.f1765e = c2061Wr;
        this.f1766f = c1772Pp;
        this.f1767g = c2734ek;
    }

    static /* bridge */ /* synthetic */ void i(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        C0591z.zzb().zzo(context, C0591z.zzc().afmaVersion, "gmob-apps", bundle, true);
    }

    public final T zzc(Context context, String str, InterfaceC1850Rn interfaceC1850Rn) {
        return (T) new C0562p(this, context, str, interfaceC1850Rn).zzd(context, false);
    }

    public final X zzd(Context context, d2 d2Var, String str, InterfaceC1850Rn interfaceC1850Rn) {
        return (X) new C0550l(this, context, d2Var, str, interfaceC1850Rn).zzd(context, false);
    }

    public final X zze(Context context, d2 d2Var, String str, InterfaceC1850Rn interfaceC1850Rn) {
        return (X) new C0556n(this, context, d2Var, str, interfaceC1850Rn).zzd(context, false);
    }

    public final O0 zzf(Context context, InterfaceC1850Rn interfaceC1850Rn) {
        return (O0) new C0526d(this, context, interfaceC1850Rn).zzd(context, false);
    }

    public final InterfaceC2962gj zzh(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (InterfaceC2962gj) new C0573t(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final InterfaceC3760nj zzi(View view, HashMap map, HashMap map2) {
        return (InterfaceC3760nj) new C0579v(this, view, map, map2).zzd(view.getContext(), false);
    }

    public final InterfaceC1232Cl zzl(Context context, InterfaceC1850Rn interfaceC1850Rn, C1.a aVar) {
        return (InterfaceC1232Cl) new C0544j(this, context, interfaceC1850Rn, aVar).zzd(context, false);
    }

    public final InterfaceC1568Kp zzm(Context context, InterfaceC1850Rn interfaceC1850Rn) {
        return (InterfaceC1568Kp) new C0538h(this, context, interfaceC1850Rn).zzd(context, false);
    }

    public final InterfaceC1895Sp zzo(Activity activity) {
        C0520b c0520b = new C0520b(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            L1.n.zzg("useClientJar flag not found in activity intent extras.");
        }
        return (InterfaceC1895Sp) c0520b.zzd(activity, booleanExtra);
    }

    public final InterfaceC1570Kr zzq(Context context, String str, InterfaceC1850Rn interfaceC1850Rn) {
        return (InterfaceC1570Kr) new C0582w(this, context, str, interfaceC1850Rn).zzd(context, false);
    }

    public final InterfaceC1939Ts zzr(Context context, InterfaceC1850Rn interfaceC1850Rn) {
        return (InterfaceC1939Ts) new C0532f(this, context, interfaceC1850Rn).zzd(context, false);
    }
}

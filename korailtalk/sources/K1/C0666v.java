package K1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.AbstractC4805wt;
import com.google.android.gms.internal.ads.C3734nS;
import com.google.android.gms.internal.ads.EnumC3166iS;
import com.google.android.gms.internal.ads.InterfaceExecutorServiceC1974Un0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: K1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0666v {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2837a;

    /* renamed from: b, reason: collision with root package name */
    private final C3734nS f2838b;

    /* renamed from: c, reason: collision with root package name */
    private String f2839c;

    /* renamed from: d, reason: collision with root package name */
    private String f2840d;

    /* renamed from: e, reason: collision with root package name */
    private String f2841e;

    /* renamed from: f, reason: collision with root package name */
    private String f2842f;

    /* renamed from: g, reason: collision with root package name */
    private int f2843g;

    /* renamed from: h, reason: collision with root package name */
    private int f2844h;

    /* renamed from: i, reason: collision with root package name */
    private PointF f2845i;

    /* renamed from: j, reason: collision with root package name */
    private PointF f2846j;

    /* renamed from: k, reason: collision with root package name */
    private Handler f2847k;

    /* renamed from: l, reason: collision with root package name */
    private Runnable f2848l;

    public C0666v(Context context) {
        this.f2843g = 0;
        this.f2848l = new Runnable() { // from class: K1.i
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.g();
            }
        };
        this.f2837a = context;
        this.f2844h = ViewConfiguration.get(context).getScaledTouchSlop();
        G1.u.zzt().zzb();
        this.f2847k = G1.u.zzt().zza();
        this.f2838b = G1.u.zzs().zza();
    }

    private final void m(Context context) {
        ArrayList arrayList = new ArrayList();
        int iO = o(arrayList, "None", true);
        final int iO2 = o(arrayList, "Shake", true);
        final int iO3 = o(arrayList, "Flick", true);
        EnumC3166iS enumC3166iS = EnumC3166iS.NONE;
        int iOrdinal = this.f2838b.zza().ordinal();
        final int i8 = iOrdinal != 1 ? iOrdinal != 2 ? iO : iO3 : iO2;
        G1.u.zzp();
        AlertDialog.Builder builderZzK = K0.zzK(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i8);
        builderZzK.setTitle("Setup gesture");
        builderZzK.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i8, new DialogInterface.OnClickListener() { // from class: K1.q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                atomicInteger.set(i9);
            }
        });
        builderZzK.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: K1.r
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                this.zza.zzr();
            }
        });
        builderZzK.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: K1.s
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                this.zza.h(atomicInteger, i8, iO2, iO3, dialogInterface, i9);
            }
        });
        builderZzK.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: K1.t
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.zza.zzr();
            }
        });
        builderZzK.create().show();
    }

    private final boolean n(float f8, float f9, float f10, float f11) {
        return Math.abs(this.f2845i.x - f8) < ((float) this.f2844h) && Math.abs(this.f2845i.y - f9) < ((float) this.f2844h) && Math.abs(this.f2846j.x - f10) < ((float) this.f2844h) && Math.abs(this.f2846j.y - f11) < ((float) this.f2844h);
    }

    private static final int o(List list, String str, boolean z8) {
        if (!z8) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    final /* synthetic */ void a() {
        m(this.f2837a);
    }

    final /* synthetic */ void b() {
        m(this.f2837a);
    }

    final /* synthetic */ void c(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0) {
        if (G1.u.zzs().zzj(this.f2837a, this.f2840d, this.f2841e)) {
            interfaceExecutorServiceC1974Un0.execute(new Runnable() { // from class: K1.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.b();
                }
            });
        } else {
            G1.u.zzs().zzd(this.f2837a, this.f2840d, this.f2841e);
        }
    }

    final /* synthetic */ void d(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0) {
        if (G1.u.zzs().zzj(this.f2837a, this.f2840d, this.f2841e)) {
            interfaceExecutorServiceC1974Un0.execute(new Runnable() { // from class: K1.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.f();
                }
            });
        } else {
            G1.u.zzs().zzd(this.f2837a, this.f2840d, this.f2841e);
        }
    }

    final /* synthetic */ void e() {
        G1.u.zzs().zzc(this.f2837a);
    }

    final /* synthetic */ void f() {
        G1.u.zzs().zzc(this.f2837a);
    }

    final /* synthetic */ void g() {
        this.f2843g = 4;
        zzr();
    }

    final /* synthetic */ void h(AtomicInteger atomicInteger, int i8, int i9, int i10, DialogInterface dialogInterface, int i11) {
        if (atomicInteger.get() != i8) {
            if (atomicInteger.get() == i9) {
                this.f2838b.zzm(EnumC3166iS.SHAKE);
            } else if (atomicInteger.get() == i10) {
                this.f2838b.zzm(EnumC3166iS.FLICK);
            } else {
                this.f2838b.zzm(EnumC3166iS.NONE);
            }
        }
        zzr();
    }

    final /* synthetic */ void i(String str, DialogInterface dialogInterface, int i8) {
        G1.u.zzp();
        K0.zzT(this.f2837a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    final /* synthetic */ void j(int i8, int i9, int i10, int i11, int i12, DialogInterface dialogInterface, int i13) {
        if (i13 != i8) {
            if (i13 == i9) {
                L1.n.zze("Debug mode [Creative Preview] selected.");
                AbstractC4805wt.zza.execute(new Runnable() { // from class: K1.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.l();
                    }
                });
                return;
            }
            if (i13 == i10) {
                L1.n.zze("Debug mode [Troubleshooting] selected.");
                AbstractC4805wt.zza.execute(new Runnable() { // from class: K1.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.k();
                    }
                });
                return;
            }
            if (i13 == i11) {
                C3734nS c3734nS = this.f2838b;
                final InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zze;
                InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un02 = AbstractC4805wt.zza;
                if (c3734nS.zzq()) {
                    interfaceExecutorServiceC1974Un0.execute(new Runnable() { // from class: K1.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.e();
                        }
                    });
                    return;
                } else {
                    interfaceExecutorServiceC1974Un02.execute(new Runnable() { // from class: K1.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.d(interfaceExecutorServiceC1974Un0);
                        }
                    });
                    return;
                }
            }
            if (i13 == i12) {
                C3734nS c3734nS2 = this.f2838b;
                final InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un03 = AbstractC4805wt.zze;
                InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un04 = AbstractC4805wt.zza;
                if (c3734nS2.zzq()) {
                    interfaceExecutorServiceC1974Un03.execute(new Runnable() { // from class: K1.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.a();
                        }
                    });
                    return;
                } else {
                    interfaceExecutorServiceC1974Un04.execute(new Runnable() { // from class: K1.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.c(interfaceExecutorServiceC1974Un03);
                        }
                    });
                    return;
                }
            }
            return;
        }
        if (!(this.f2837a instanceof Activity)) {
            L1.n.zzi("Can not create dialog without Activity Context");
            return;
        }
        String str = this.f2839c;
        final String str2 = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri uriBuild = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb = new StringBuilder();
            G1.u.zzp();
            Map mapZzP = K0.zzP(uriBuild);
            for (String str3 : mapZzP.keySet()) {
                sb.append(str3);
                sb.append(" = ");
                sb.append((String) mapZzP.get(str3));
                sb.append("\n\n");
            }
            String strTrim = sb.toString().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                str2 = strTrim;
            }
        }
        G1.u.zzp();
        AlertDialog.Builder builderZzK = K0.zzK(this.f2837a);
        builderZzK.setMessage(str2);
        builderZzK.setTitle("Ad Information");
        builderZzK.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: K1.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i14) {
                this.zza.i(str2, dialogInterface2, i14);
            }
        });
        builderZzK.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: K1.l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i14) {
            }
        });
        builderZzK.create().show();
    }

    final /* synthetic */ void k() {
        C0674z c0674zZzs = G1.u.zzs();
        String str = this.f2840d;
        String str2 = this.f2841e;
        String str3 = this.f2842f;
        boolean zZzm = c0674zZzs.zzm();
        Context context = this.f2837a;
        c0674zZzs.zzh(c0674zZzs.zzj(context, str, str2));
        if (!c0674zZzs.zzm()) {
            c0674zZzs.zzd(context, str, str2);
            return;
        }
        if (!zZzm && !TextUtils.isEmpty(str3)) {
            c0674zZzs.zze(context, str2, str3, str);
        }
        L1.n.zze("Device is linked for debug signals.");
        c0674zZzs.a(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    final /* synthetic */ void l() {
        C0674z c0674zZzs = G1.u.zzs();
        Context context = this.f2837a;
        String str = this.f2840d;
        String str2 = this.f2841e;
        if (!c0674zZzs.b(context, str, str2)) {
            c0674zZzs.a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(c0674zZzs.f2861f)) {
            L1.n.zze("Creative is not pushed for this device.");
            c0674zZzs.a(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(c0674zZzs.f2861f)) {
            L1.n.zze("The app is not linked for creative preview.");
            c0674zZzs.zzd(context, str, str2);
        } else if ("0".equals(c0674zZzs.f2861f)) {
            L1.n.zze("Device is linked for in app preview.");
            c0674zZzs.a(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f2839c);
        sb.append(",DebugSignal: ");
        sb.append(this.f2842f);
        sb.append(",AFMA Version: ");
        sb.append(this.f2841e);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f2840d);
        sb.append("}");
        return sb.toString();
    }

    public final void zzm(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f2843g = 0;
            this.f2845i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i8 = this.f2843g;
        if (i8 == -1) {
            return;
        }
        if (i8 == 0) {
            if (actionMasked == 5) {
                this.f2843g = 5;
                this.f2846j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.f2847k.postDelayed(this.f2848l, ((Long) H1.C.zzc().zza(AbstractC4439th.zzeG)).longValue());
                return;
            }
            return;
        }
        if (i8 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z8 = false;
                for (int i9 = 0; i9 < historySize; i9++) {
                    z8 |= !n(motionEvent.getHistoricalX(0, i9), motionEvent.getHistoricalY(0, i9), motionEvent.getHistoricalX(1, i9), motionEvent.getHistoricalY(1, i9));
                }
                if (n(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z8) {
                    return;
                }
            }
            this.f2843g = -1;
            this.f2847k.removeCallbacks(this.f2848l);
        }
    }

    public final void zzn(String str) {
        this.f2840d = str;
    }

    public final void zzo(String str) {
        this.f2841e = str;
    }

    public final void zzp(String str) {
        this.f2839c = str;
    }

    public final void zzq(String str) {
        this.f2842f = str;
    }

    public final void zzr() {
        try {
            if (!(this.f2837a instanceof Activity)) {
                L1.n.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(G1.u.zzs().zzb())) {
                str = "Creative preview";
            }
            String str2 = true != G1.u.zzs().zzm() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iO = o(arrayList, "Ad information", true);
            final int iO2 = o(arrayList, str, true);
            final int iO3 = o(arrayList, str2, true);
            boolean zBooleanValue = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjj)).booleanValue();
            final int iO4 = o(arrayList, "Open ad inspector", zBooleanValue);
            final int iO5 = o(arrayList, "Ad inspector settings", zBooleanValue);
            G1.u.zzp();
            AlertDialog.Builder builderZzK = K0.zzK(this.f2837a);
            builderZzK.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: K1.p
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.zza.j(iO, iO2, iO3, iO4, iO5, dialogInterface, i8);
                }
            });
            builderZzK.create().show();
        } catch (WindowManager.BadTokenException e8) {
            AbstractC0667v0.zzb("", e8);
        }
    }

    public C0666v(Context context, String str) {
        this(context);
        this.f2839c = str;
    }
}

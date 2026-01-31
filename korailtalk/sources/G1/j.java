package G1;

import H1.C;
import H1.C0591z;
import K1.K0;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.AbstractC4805wt;
import com.google.android.gms.internal.ads.AbstractC5122zg0;
import com.google.android.gms.internal.ads.C1876Sf0;
import com.google.android.gms.internal.ads.C1947Ua;
import com.google.android.gms.internal.ads.C1960Ug0;
import com.google.android.gms.internal.ads.C2373bb;
import com.google.android.gms.internal.ads.InterfaceC2070Xa;
import java.io.IOException;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class j implements Runnable, InterfaceC2070Xa {

    /* renamed from: d, reason: collision with root package name */
    protected boolean f1401d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f1402e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f1403f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f1404g;

    /* renamed from: h, reason: collision with root package name */
    private final C1876Sf0 f1405h;

    /* renamed from: i, reason: collision with root package name */
    private Context f1406i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f1407j;

    /* renamed from: k, reason: collision with root package name */
    private L1.a f1408k;

    /* renamed from: l, reason: collision with root package name */
    private final L1.a f1409l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f1410m;

    /* renamed from: o, reason: collision with root package name */
    private int f1412o;

    /* renamed from: a, reason: collision with root package name */
    private final List f1398a = new Vector();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f1399b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f1400c = new AtomicReference();

    /* renamed from: n, reason: collision with root package name */
    final CountDownLatch f1411n = new CountDownLatch(1);

    public j(Context context, L1.a aVar) {
        this.f1406i = context;
        this.f1407j = context;
        this.f1408k = aVar;
        this.f1409l = aVar;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.f1404g = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) C.zzc().zza(AbstractC4439th.zzcr)).booleanValue();
        this.f1410m = zBooleanValue;
        this.f1405h = C1876Sf0.zza(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.f1402e = ((Boolean) C.zzc().zza(AbstractC4439th.zzcn)).booleanValue();
        this.f1403f = ((Boolean) C.zzc().zza(AbstractC4439th.zzcs)).booleanValue();
        if (((Boolean) C.zzc().zza(AbstractC4439th.zzcq)).booleanValue()) {
            this.f1412o = 2;
        } else {
            this.f1412o = 1;
        }
        if (!((Boolean) C.zzc().zza(AbstractC4439th.zzdu)).booleanValue()) {
            this.f1401d = c();
        }
        if (((Boolean) C.zzc().zza(AbstractC4439th.zzdn)).booleanValue()) {
            AbstractC4805wt.zza.execute(this);
            return;
        }
        C0591z.zzb();
        if (L1.g.zzv()) {
            AbstractC4805wt.zza.execute(this);
        } else {
            run();
        }
    }

    private final InterfaceC2070Xa e() {
        return d() == 2 ? (InterfaceC2070Xa) this.f1400c.get() : (InterfaceC2070Xa) this.f1399b.get();
    }

    private final void f() {
        List list = this.f1398a;
        InterfaceC2070Xa interfaceC2070XaE = e();
        if (list.isEmpty() || interfaceC2070XaE == null) {
            return;
        }
        for (Object[] objArr : this.f1398a) {
            int length = objArr.length;
            if (length == 1) {
                interfaceC2070XaE.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                interfaceC2070XaE.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.f1398a.clear();
    }

    private final void g(boolean z8) {
        this.f1399b.set(C2373bb.zzu(this.f1408k.afmaVersion, h(this.f1406i), z8, this.f1412o));
    }

    private static final Context h(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    final /* synthetic */ void b(boolean z8) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            C1947Ua.zza(this.f1409l.afmaVersion, h(this.f1407j), z8, this.f1410m).zzp();
        } catch (NullPointerException e8) {
            this.f1405h.zzc(2027, System.currentTimeMillis() - jCurrentTimeMillis, e8);
        }
    }

    protected final boolean c() throws IOException {
        Context context = this.f1406i;
        i iVar = new i(this);
        C1876Sf0 c1876Sf0 = this.f1405h;
        return new C1960Ug0(this.f1406i, AbstractC5122zg0.zzb(context, c1876Sf0), iVar, ((Boolean) C.zzc().zza(AbstractC4439th.zzco)).booleanValue()).zzd(1);
    }

    protected final int d() {
        if (!this.f1402e || this.f1401d) {
            return this.f1412o;
        }
        return 1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) C.zzc().zza(AbstractC4439th.zzdu)).booleanValue()) {
                this.f1401d = c();
            }
            boolean z8 = this.f1408k.isClientJar;
            final boolean z9 = false;
            if (!((Boolean) C.zzc().zza(AbstractC4439th.zzaX)).booleanValue() && z8) {
                z9 = true;
            }
            if (d() == 1) {
                g(z9);
                if (this.f1412o == 2) {
                    this.f1404g.execute(new Runnable() { // from class: G1.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.b(z9);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    C1947Ua c1947UaZza = C1947Ua.zza(this.f1408k.afmaVersion, h(this.f1406i), z9, this.f1410m);
                    this.f1400c.set(c1947UaZza);
                    if (this.f1403f && !c1947UaZza.zzr()) {
                        this.f1412o = 1;
                        g(z9);
                    }
                } catch (NullPointerException e8) {
                    this.f1412o = 1;
                    g(z9);
                    this.f1405h.zzc(2031, System.currentTimeMillis() - jCurrentTimeMillis, e8);
                }
            }
            this.f1411n.countDown();
            this.f1406i = null;
            this.f1408k = null;
        } catch (Throwable th) {
            this.f1411n.countDown();
            this.f1406i = null;
            this.f1408k = null;
            throw th;
        }
    }

    public final boolean zzd() throws InterruptedException {
        try {
            this.f1411n.await();
            return true;
        } catch (InterruptedException e8) {
            L1.n.zzk("Interrupted during GADSignals creation.", e8);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2070Xa
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2070Xa
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (!zzd()) {
            return "";
        }
        InterfaceC2070Xa interfaceC2070XaE = e();
        if (((Boolean) C.zzc().zza(AbstractC4439th.zzkH)).booleanValue()) {
            u.zzp();
            K0.zzJ(view, 4, null);
        }
        if (interfaceC2070XaE == null) {
            return "";
        }
        f();
        return interfaceC2070XaE.zzf(h(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2070Xa
    public final String zzg(Context context) {
        InterfaceC2070Xa interfaceC2070XaE;
        if (!zzd() || (interfaceC2070XaE = e()) == null) {
            return "";
        }
        f();
        return interfaceC2070XaE.zzg(h(context));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2070Xa
    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) C.zzc().zza(AbstractC4439th.zzkG)).booleanValue()) {
            InterfaceC2070Xa interfaceC2070XaE = e();
            if (((Boolean) C.zzc().zza(AbstractC4439th.zzkH)).booleanValue()) {
                u.zzp();
                K0.zzJ(view, 2, null);
            }
            return interfaceC2070XaE != null ? interfaceC2070XaE.zzh(context, view, activity) : "";
        }
        if (!zzd()) {
            return "";
        }
        InterfaceC2070Xa interfaceC2070XaE2 = e();
        if (((Boolean) C.zzc().zza(AbstractC4439th.zzkH)).booleanValue()) {
            u.zzp();
            K0.zzJ(view, 2, null);
        }
        return interfaceC2070XaE2 != null ? interfaceC2070XaE2.zzh(context, view, activity) : "";
    }

    public final int zzj() {
        return this.f1412o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2070Xa
    public final void zzk(MotionEvent motionEvent) {
        InterfaceC2070Xa interfaceC2070XaE = e();
        if (interfaceC2070XaE == null) {
            this.f1398a.add(new Object[]{motionEvent});
        } else {
            f();
            interfaceC2070XaE.zzk(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2070Xa
    public final void zzl(int i8, int i9, int i10) {
        InterfaceC2070Xa interfaceC2070XaE = e();
        if (interfaceC2070XaE == null) {
            this.f1398a.add(new Object[]{Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10)});
        } else {
            f();
            interfaceC2070XaE.zzl(i8, i9, i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2070Xa
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        InterfaceC2070Xa interfaceC2070XaE;
        if (!zzd() || (interfaceC2070XaE = e()) == null) {
            return;
        }
        interfaceC2070XaE.zzn(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2070Xa
    public final void zzo(View view) {
        InterfaceC2070Xa interfaceC2070XaE = e();
        if (interfaceC2070XaE != null) {
            interfaceC2070XaE.zzo(view);
        }
    }
}

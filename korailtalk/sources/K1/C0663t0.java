package K1;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.C1531Jt;

/* renamed from: K1.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0663t0 {

    /* renamed from: a, reason: collision with root package name */
    private final View f2831a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f2832b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2833c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2834d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2835e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f2836f;

    public C0663t0(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f2832b = activity;
        this.f2831a = view;
        this.f2836f = onGlobalLayoutListener;
    }

    private static ViewTreeObserver a(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    private final void b() {
        if (this.f2833c) {
            return;
        }
        Activity activity = this.f2832b;
        if (activity != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f2836f;
            ViewTreeObserver viewTreeObserverA = a(activity);
            if (viewTreeObserverA != null) {
                viewTreeObserverA.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        View view = this.f2831a;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.f2836f;
        G1.u.zzx();
        C1531Jt.zza(view, onGlobalLayoutListener2);
        this.f2833c = true;
    }

    private final void c() {
        Activity activity = this.f2832b;
        if (activity != null && this.f2833c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f2836f;
            ViewTreeObserver viewTreeObserverA = a(activity);
            if (viewTreeObserverA != null) {
                viewTreeObserverA.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f2833c = false;
        }
    }

    public final void zza() {
        this.f2835e = false;
        c();
    }

    public final void zzb() {
        this.f2835e = true;
        if (this.f2834d) {
            b();
        }
    }

    public final void zzc() {
        this.f2834d = true;
        if (this.f2835e) {
            b();
        }
    }

    public final void zzd() {
        this.f2834d = false;
        c();
    }

    public final void zze(Activity activity) {
        this.f2832b = activity;
    }
}

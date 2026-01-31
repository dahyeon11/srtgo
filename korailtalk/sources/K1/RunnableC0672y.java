package K1;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: K1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC0672y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f2852a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f2853b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f2854c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f2855d;

    RunnableC0672y(C0674z c0674z, Context context, String str, boolean z8, boolean z9) {
        this.f2852a = context;
        this.f2853b = str;
        this.f2854c = z8;
        this.f2855d = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        G1.u.zzp();
        AlertDialog.Builder builderZzK = K0.zzK(this.f2852a);
        builderZzK.setMessage(this.f2853b);
        if (this.f2854c) {
            builderZzK.setTitle("Error");
        } else {
            builderZzK.setTitle("Info");
        }
        if (this.f2855d) {
            builderZzK.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderZzK.setPositiveButton("Learn More", new DialogInterfaceOnClickListenerC0670x(this));
            builderZzK.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderZzK.create().show();
    }
}

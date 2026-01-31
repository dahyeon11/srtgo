package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* renamed from: com.google.android.gms.internal.ads.nP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3731nP {

    /* renamed from: a, reason: collision with root package name */
    private Context f21262a;

    /* renamed from: b, reason: collision with root package name */
    private PopupWindow f21263b;

    public final void zza(Context context, View view) {
        PopupWindow popupWindow;
        if (!o2.n.isAtLeastKitKat() || o2.n.isAtLeastLollipop()) {
            return;
        }
        Window window = context instanceof Activity ? ((Activity) context).getWindow() : null;
        if (window == null || window.getDecorView() == null || ((Activity) context).isDestroyed()) {
            popupWindow = null;
        } else {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.addView(view, -1, -1);
            popupWindow = new PopupWindow((View) frameLayout, 1, 1, false);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setClippingEnabled(false);
            L1.n.zze("Displaying the 1x1 popup off the screen.");
            try {
                popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
            } catch (Exception unused) {
            }
        }
        this.f21263b = popupWindow;
        if (popupWindow == null) {
            context = null;
        }
        this.f21262a = context;
    }

    public final void zzb() {
        Context context = this.f21262a;
        if (context == null || this.f21263b == null) {
            return;
        }
        if ((!(context instanceof Activity) || !((Activity) context).isDestroyed()) && this.f21263b.isShowing()) {
            this.f21263b.dismiss();
        }
        this.f21262a = null;
        this.f21263b = null;
    }
}

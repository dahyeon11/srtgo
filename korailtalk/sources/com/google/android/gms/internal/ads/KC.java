package com.google.android.gms.internal.ads;

import H1.C0591z;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class KC extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final Context f13760a;

    /* renamed from: b */
    private View f13761b;

    private KC(Context context) {
        super(context);
        this.f13760a = context;
    }

    private final int a(double d9) {
        C0591z.zzb();
        return L1.g.zzy(this.f13760a, (int) d9);
    }

    private final void b(JSONObject jSONObject, RelativeLayout relativeLayout, int i8) {
        TextView textView = new TextView(this.f13760a);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iA = a(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, iA, 0, iA);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, a(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i8);
        relativeLayout.addView(textView, layoutParams);
    }

    public static KC zza(Context context, View view, C4654va0 c4654va0) {
        Resources resources;
        DisplayMetrics displayMetrics;
        KC kc = new KC(context);
        if (!c4654va0.zzv.isEmpty() && (resources = kc.f13760a.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f8 = ((C4768wa0) c4654va0.zzv.get(0)).zza;
            float f9 = displayMetrics.density;
            kc.setLayoutParams(new FrameLayout.LayoutParams((int) (f8 * f9), (int) (r1.zzb * f9)));
        }
        kc.f13761b = view;
        kc.addView(view);
        G1.u.zzx();
        C1531Jt.zzb(kc, kc);
        G1.u.zzx();
        C1531Jt.zza(kc, kc);
        JSONObject jSONObject = c4654va0.zzai;
        RelativeLayout relativeLayout = new RelativeLayout(kc.f13760a);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            kc.b(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            kc.b(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        kc.addView(relativeLayout);
        return kc;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.f13761b.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.f13761b.setY(-r0[1]);
    }
}

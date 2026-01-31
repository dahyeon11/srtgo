package com.google.android.gms.internal.ads;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import y1.C6529j;

/* loaded from: classes2.dex */
public final class LS {
    LS() {
    }

    private static TextView a(Context context, String str, String str2) {
        return c(context, str, R.style.TextAppearance.Small, -9210245, 0.0f, str2);
    }

    private static TextView b(Context context, String str, String str2) {
        return c(context, str, R.style.TextAppearance.Medium, -16777216, 12.0f, str2);
    }

    private static TextView c(Context context, String str, int i8, int i9, float f8, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        d(textView, -2, -2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f8, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i8);
        textView.setTextColor(i9);
        textView.setText(str);
        return textView;
    }

    private static void d(View view, int i8, int i9) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i8;
        layoutParams2.width = i9;
        view.setLayoutParams(layoutParams2);
    }

    public static final void zza(Context context, ViewGroup viewGroup, C6529j c6529j) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout");
        d(linearLayout, -1, -1);
        linearLayout.setGravity(17);
        linearLayout.addView(c6529j);
        c6529j.setTag("ad_view");
        viewGroup.addView(linearLayout);
    }

    public static final void zzb(Context context, ViewGroup viewGroup, Q1.c cVar) {
        Q1.e eVar = new Q1.e(context);
        eVar.setTag("ad_view_tag");
        d(eVar, -1, -1);
        viewGroup.addView(eVar);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout_tag");
        linearLayout.setOrientation(1);
        d(linearLayout, -1, -1);
        linearLayout.setBackgroundColor(-1);
        eVar.addView(linearLayout);
        Resources resourcesZze = G1.u.zzo().zze();
        linearLayout.addView(a(context, resourcesZze == null ? "Headline" : resourcesZze.getString(E1.d.native_headline), "headline_header_tag"));
        View viewB = b(context, AbstractC1802Qj0.zzc(cVar.getHeadline()), "headline_tag");
        eVar.setHeadlineView(viewB);
        linearLayout.addView(viewB);
        linearLayout.addView(a(context, resourcesZze == null ? "Body" : resourcesZze.getString(E1.d.native_body), "body_header_tag"));
        View viewB2 = b(context, AbstractC1802Qj0.zzc(cVar.getBody()), "body_tag");
        eVar.setBodyView(viewB2);
        linearLayout.addView(viewB2);
        linearLayout.addView(a(context, resourcesZze == null ? "Media View" : resourcesZze.getString(E1.d.native_media_view), "media_view_header_tag"));
        Q1.b bVar = new Q1.b(context);
        bVar.setTag("media_view_tag");
        eVar.setMediaView(bVar);
        linearLayout.addView(bVar);
        eVar.setNativeAd(cVar);
    }
}

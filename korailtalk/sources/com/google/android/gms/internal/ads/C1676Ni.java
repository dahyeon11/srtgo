package com.google.android.gms.internal.ads;

import H1.C0591z;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import i2.AbstractC5683p;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ni, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1676Ni extends RelativeLayout {

    /* renamed from: b, reason: collision with root package name */
    private static final float[] f14942b = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: a, reason: collision with root package name */
    private AnimationDrawable f14943a;

    public C1676Ni(Context context, BinderC1635Mi binderC1635Mi, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        AbstractC5683p.checkNotNull(binderC1635Mi);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f14942b, null, null));
        shapeDrawable.getPaint().setColor(binderC1635Mi.zzd());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(binderC1635Mi.zzg())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(binderC1635Mi.zzg());
            textView.setTextColor(binderC1635Mi.zze());
            textView.setTextSize(binderC1635Mi.zzf());
            C0591z.zzb();
            int iZzy = L1.g.zzy(context, 4);
            C0591z.zzb();
            textView.setPadding(iZzy, 0, L1.g.zzy(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List listZzi = binderC1635Mi.zzi();
        if (listZzi != null && listZzi.size() > 1) {
            this.f14943a = new AnimationDrawable();
            Iterator it = listZzi.iterator();
            while (it.hasNext()) {
                try {
                    this.f14943a.addFrame((Drawable) r2.b.unwrap(((BinderC1758Pi) it.next()).zzf()), binderC1635Mi.zzb());
                } catch (Exception e8) {
                    L1.n.zzh("Error while getting drawable.", e8);
                }
            }
            imageView.setBackground(this.f14943a);
        } else if (listZzi.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) r2.b.unwrap(((BinderC1758Pi) listZzi.get(0)).zzf()));
            } catch (Exception e9) {
                L1.n.zzh("Error while getting drawable.", e9);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f14943a;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}

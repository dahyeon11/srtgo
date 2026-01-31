package com.google.android.gms.internal.ads;

import K1.C0666v;
import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.mP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3617mP extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final C0666v f20918a;

    public C3617mP(Context context, View view, C0666v c0666v) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f20918a = c0666v;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f20918a.zzm(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            KeyEvent.Callback childAt = getChildAt(i8);
            if (childAt != null && (childAt instanceof InterfaceC2065Wv)) {
                arrayList.add((InterfaceC2065Wv) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((InterfaceC2065Wv) arrayList.get(i9)).destroy();
        }
    }
}

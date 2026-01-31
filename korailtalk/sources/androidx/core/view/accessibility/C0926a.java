package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: androidx.core.view.accessibility.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0926a extends ClickableSpan {
    public static final String SPAN_ID = "ACCESSIBILITY_CLICKABLE_SPAN_ID";

    /* renamed from: a, reason: collision with root package name */
    private final int f9169a;

    /* renamed from: b, reason: collision with root package name */
    private final H f9170b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9171c;

    public C0926a(int i8, H h8, int i9) {
        this.f9169a = i8;
        this.f9170b = h8;
        this.f9171c = i9;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(SPAN_ID, this.f9169a);
        this.f9170b.performAction(this.f9171c, bundle);
    }
}

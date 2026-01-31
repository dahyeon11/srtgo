package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.s;

/* loaded from: classes.dex */
final class C extends AbstractC5293a {
    C(s sVar, B b9, w wVar, int i8, int i9, Drawable drawable, String str, Object obj, int i10) {
        super(sVar, b9, wVar, i8, i9, i10, drawable, str, obj, false);
    }

    @Override // com.squareup.picasso.AbstractC5293a
    void complete(Bitmap bitmap, s.e eVar) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        android.support.v4.media.session.f.a(i());
    }

    @Override // com.squareup.picasso.AbstractC5293a
    void error(Exception exc) {
        android.support.v4.media.session.f.a(i());
    }
}

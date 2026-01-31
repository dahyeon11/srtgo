package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.s;

/* loaded from: classes.dex */
class k extends AbstractC5293a {
    k(s sVar, ImageView imageView, w wVar, int i8, int i9, int i10, Drawable drawable, String str, Object obj, F6.b bVar, boolean z8) {
        super(sVar, imageView, wVar, i8, i9, i10, drawable, str, obj, z8);
    }

    @Override // com.squareup.picasso.AbstractC5293a
    void a() {
        super.a();
    }

    @Override // com.squareup.picasso.AbstractC5293a
    public void complete(Bitmap bitmap, s.e eVar) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        ImageView imageView = (ImageView) this.f29743c.get();
        if (imageView == null) {
            return;
        }
        s sVar = this.f29741a;
        t.c(imageView, sVar.f29842e, bitmap, eVar, this.f29744d, sVar.f29850m);
    }

    @Override // com.squareup.picasso.AbstractC5293a
    public void error(Exception exc) {
        ImageView imageView = (ImageView) this.f29743c.get();
        if (imageView == null) {
            return;
        }
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        int i8 = this.f29747g;
        if (i8 != 0) {
            imageView.setImageResource(i8);
            return;
        }
        Drawable drawable2 = this.f29748h;
        if (drawable2 != null) {
            imageView.setImageDrawable(drawable2);
        }
    }
}

package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.picasso.s;
import com.squareup.picasso.y;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
class z extends y {

    /* renamed from: a, reason: collision with root package name */
    private final Context f29926a;

    z(Context context) {
        this.f29926a = context;
    }

    private static Bitmap h(Resources resources, int i8, w wVar) {
        BitmapFactory.Options optionsC = y.c(wVar);
        if (y.e(optionsC)) {
            BitmapFactory.decodeResource(resources, i8, optionsC);
            y.b(wVar.targetWidth, wVar.targetHeight, optionsC, wVar);
        }
        return BitmapFactory.decodeResource(resources, i8, optionsC);
    }

    @Override // com.squareup.picasso.y
    public boolean canHandleRequest(w wVar) {
        if (wVar.resourceId != 0) {
            return true;
        }
        return "android.resource".equals(wVar.uri.getScheme());
    }

    @Override // com.squareup.picasso.y
    public y.a load(w wVar, int i8) throws FileNotFoundException {
        Resources resourcesN = D.n(this.f29926a, wVar);
        return new y.a(h(resourcesN, D.m(resourcesN, wVar), wVar), s.e.DISK);
    }
}

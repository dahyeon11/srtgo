package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.squareup.picasso.s;
import com.squareup.picasso.y;
import e0.C5339a;

/* loaded from: classes.dex */
class i extends e {
    i(Context context) {
        super(context);
    }

    static int i(Uri uri) {
        return new C5339a(uri.getPath()).getAttributeInt(C5339a.TAG_ORIENTATION, 1);
    }

    @Override // com.squareup.picasso.e, com.squareup.picasso.y
    public boolean canHandleRequest(w wVar) {
        return "file".equals(wVar.uri.getScheme());
    }

    @Override // com.squareup.picasso.e, com.squareup.picasso.y
    public y.a load(w wVar, int i8) {
        return new y.a(null, P7.n.source(h(wVar)), s.e.DISK, i(wVar.uri));
    }
}

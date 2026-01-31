package com.squareup.picasso;

import android.content.Context;
import com.kakao.sdk.template.Constants;
import com.squareup.picasso.s;
import com.squareup.picasso.y;
import java.io.InputStream;

/* loaded from: classes.dex */
class e extends y {

    /* renamed from: a, reason: collision with root package name */
    final Context f29784a;

    e(Context context) {
        this.f29784a = context;
    }

    @Override // com.squareup.picasso.y
    public boolean canHandleRequest(w wVar) {
        return Constants.CONTENT.equals(wVar.uri.getScheme());
    }

    InputStream h(w wVar) {
        return this.f29784a.getContentResolver().openInputStream(wVar.uri);
    }

    @Override // com.squareup.picasso.y
    public y.a load(w wVar, int i8) {
        return new y.a(P7.n.source(h(wVar)), s.e.DISK);
    }
}

package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.s;
import com.squareup.picasso.y;

/* renamed from: com.squareup.picasso.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5294b extends y {

    /* renamed from: d, reason: collision with root package name */
    private static final int f29754d = 22;

    /* renamed from: a, reason: collision with root package name */
    private final Context f29755a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f29756b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private AssetManager f29757c;

    C5294b(Context context) {
        this.f29755a = context;
    }

    static String h(w wVar) {
        return wVar.uri.toString().substring(f29754d);
    }

    @Override // com.squareup.picasso.y
    public boolean canHandleRequest(w wVar) {
        Uri uri = wVar.uri;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // com.squareup.picasso.y
    public y.a load(w wVar, int i8) {
        if (this.f29757c == null) {
            synchronized (this.f29756b) {
                try {
                    if (this.f29757c == null) {
                        this.f29757c = this.f29755a.getAssets();
                    }
                } finally {
                }
            }
        }
        return new y.a(P7.n.source(this.f29757c.open(h(wVar))), s.e.DISK);
    }
}

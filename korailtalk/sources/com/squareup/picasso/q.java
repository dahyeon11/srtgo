package com.squareup.picasso;

import C7.C0471e;
import C7.H;
import C7.J;
import C7.K;
import android.net.NetworkInfo;
import com.kakao.sdk.common.Constants;
import com.squareup.picasso.s;
import com.squareup.picasso.y;
import java.io.IOException;

/* loaded from: classes.dex */
class q extends y {

    /* renamed from: a, reason: collision with root package name */
    private final F6.c f29829a;

    /* renamed from: b, reason: collision with root package name */
    private final A f29830b;

    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    static final class b extends IOException {

        /* renamed from: a, reason: collision with root package name */
        final int f29831a;

        /* renamed from: b, reason: collision with root package name */
        final int f29832b;

        b(int i8, int i9) {
            super("HTTP " + i8);
            this.f29831a = i8;
            this.f29832b = i9;
        }
    }

    q(F6.c cVar, A a9) {
        this.f29829a = cVar;
        this.f29830b = a9;
    }

    private static H h(w wVar, int i8) {
        C0471e c0471eBuild;
        if (i8 == 0) {
            c0471eBuild = null;
        } else if (p.isOfflineOnly(i8)) {
            c0471eBuild = C0471e.FORCE_CACHE;
        } else {
            C0471e.a aVar = new C0471e.a();
            if (!p.shouldReadFromDiskCache(i8)) {
                aVar.noCache();
            }
            if (!p.shouldWriteToDiskCache(i8)) {
                aVar.noStore();
            }
            c0471eBuild = aVar.build();
        }
        H.a aVarUrl = new H.a().url(wVar.uri.toString());
        if (c0471eBuild != null) {
            aVarUrl.cacheControl(c0471eBuild);
        }
        return aVarUrl.build();
    }

    @Override // com.squareup.picasso.y
    public boolean canHandleRequest(w wVar) {
        String scheme = wVar.uri.getScheme();
        return "http".equals(scheme) || Constants.SCHEME.equals(scheme);
    }

    @Override // com.squareup.picasso.y
    int d() {
        return 2;
    }

    @Override // com.squareup.picasso.y
    boolean f(boolean z8, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // com.squareup.picasso.y
    boolean g() {
        return true;
    }

    @Override // com.squareup.picasso.y
    public y.a load(w wVar, int i8) throws IOException {
        J jLoad = this.f29829a.load(h(wVar, i8));
        K kBody = jLoad.body();
        if (!jLoad.isSuccessful()) {
            kBody.close();
            throw new b(jLoad.code(), wVar.f29891c);
        }
        s.e eVar = jLoad.cacheResponse() == null ? s.e.NETWORK : s.e.DISK;
        if (eVar == s.e.DISK && kBody.contentLength() == 0) {
            kBody.close();
            throw new a("Received response with 0 content-length header.");
        }
        if (eVar == s.e.NETWORK && kBody.contentLength() > 0) {
            this.f29830b.f(kBody.contentLength());
        }
        return new y.a(kBody.source(), eVar);
    }
}

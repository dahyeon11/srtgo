package com.squareup.picasso;

import C7.C0470d;
import C7.E;
import C7.H;
import C7.InterfaceC0472f;
import C7.J;
import android.content.Context;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public final class r implements F6.c {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC0472f.a f29833a;

    /* renamed from: b, reason: collision with root package name */
    private final C0470d f29834b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29835c;

    public r(Context context) {
        this(D.f(context));
    }

    @Override // F6.c
    public J load(H h8) {
        return this.f29833a.newCall(h8).execute();
    }

    @Override // F6.c
    public void shutdown() {
        C0470d c0470d;
        if (this.f29835c || (c0470d = this.f29834b) == null) {
            return;
        }
        try {
            c0470d.close();
        } catch (IOException unused) {
        }
    }

    public r(File file) {
        this(file, D.a(file));
    }

    public r(Context context, long j8) {
        this(D.f(context), j8);
    }

    public r(File file, long j8) {
        this(new E.b().cache(new C0470d(file, j8)).build());
        this.f29835c = false;
    }

    public r(E e8) {
        this.f29835c = true;
        this.f29833a = e8;
        this.f29834b = e8.cache();
    }

    public r(InterfaceC0472f.a aVar) {
        this.f29835c = true;
        this.f29833a = aVar;
        this.f29834b = null;
    }
}

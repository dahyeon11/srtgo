package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;

/* loaded from: classes.dex */
public final class l implements F6.a {

    /* renamed from: a, reason: collision with root package name */
    final LruCache f29809a;

    class a extends LruCache {
        a(int i8) {
            super(i8);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, b bVar) {
            return bVar.f29812b;
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Bitmap f29811a;

        /* renamed from: b, reason: collision with root package name */
        final int f29812b;

        b(Bitmap bitmap, int i8) {
            this.f29811a = bitmap;
            this.f29812b = i8;
        }
    }

    public l(Context context) {
        this(D.b(context));
    }

    @Override // F6.a
    public void clear() {
        this.f29809a.evictAll();
    }

    @Override // F6.a
    public void clearKeyUri(String str) {
        for (String str2 : this.f29809a.snapshot().keySet()) {
            if (str2.startsWith(str) && str2.length() > str.length() && str2.charAt(str.length()) == '\n') {
                this.f29809a.remove(str2);
            }
        }
    }

    public int evictionCount() {
        return this.f29809a.evictionCount();
    }

    @Override // F6.a
    public Bitmap get(String str) {
        b bVar = (b) this.f29809a.get(str);
        if (bVar != null) {
            return bVar.f29811a;
        }
        return null;
    }

    public int hitCount() {
        return this.f29809a.hitCount();
    }

    @Override // F6.a
    public int maxSize() {
        return this.f29809a.maxSize();
    }

    public int missCount() {
        return this.f29809a.missCount();
    }

    public int putCount() {
        return this.f29809a.putCount();
    }

    @Override // F6.a
    public void set(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        int iJ = D.j(bitmap);
        if (iJ > maxSize()) {
            this.f29809a.remove(str);
        } else {
            this.f29809a.put(str, new b(bitmap, iJ));
        }
    }

    @Override // F6.a
    public int size() {
        return this.f29809a.size();
    }

    public l(int i8) {
        this.f29809a = new a(i8);
    }
}

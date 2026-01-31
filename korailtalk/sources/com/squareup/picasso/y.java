package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.s;

/* loaded from: classes.dex */
public abstract class y {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final s.e f29922a;

        /* renamed from: b, reason: collision with root package name */
        private final Bitmap f29923b;

        /* renamed from: c, reason: collision with root package name */
        private final P7.w f29924c;

        /* renamed from: d, reason: collision with root package name */
        private final int f29925d;

        public a(Bitmap bitmap, s.e eVar) {
            this((Bitmap) D.e(bitmap, "bitmap == null"), null, eVar, 0);
        }

        int a() {
            return this.f29925d;
        }

        public Bitmap getBitmap() {
            return this.f29923b;
        }

        public s.e getLoadedFrom() {
            return this.f29922a;
        }

        public P7.w getSource() {
            return this.f29924c;
        }

        public a(P7.w wVar, s.e eVar) {
            this(null, (P7.w) D.e(wVar, "source == null"), eVar, 0);
        }

        a(Bitmap bitmap, P7.w wVar, s.e eVar, int i8) {
            if ((bitmap != null) != (wVar != null)) {
                this.f29923b = bitmap;
                this.f29924c = wVar;
                this.f29922a = (s.e) D.e(eVar, "loadedFrom == null");
                this.f29925d = i8;
                return;
            }
            throw new AssertionError();
        }
    }

    static void a(int i8, int i9, int i10, int i11, BitmapFactory.Options options, w wVar) {
        int iMax;
        double dFloor;
        if (i11 > i9 || i10 > i8) {
            if (i9 == 0) {
                dFloor = Math.floor(i10 / i8);
            } else if (i8 == 0) {
                dFloor = Math.floor(i11 / i9);
            } else {
                int iFloor = (int) Math.floor(i11 / i9);
                int iFloor2 = (int) Math.floor(i10 / i8);
                iMax = wVar.centerInside ? Math.max(iFloor, iFloor2) : Math.min(iFloor, iFloor2);
            }
            iMax = (int) dFloor;
        } else {
            iMax = 1;
        }
        options.inSampleSize = iMax;
        options.inJustDecodeBounds = false;
    }

    static void b(int i8, int i9, BitmapFactory.Options options, w wVar) {
        a(i8, i9, options.outWidth, options.outHeight, options, wVar);
    }

    static BitmapFactory.Options c(w wVar) {
        boolean zHasSize = wVar.hasSize();
        boolean z8 = wVar.config != null;
        if (!zHasSize && !z8 && !wVar.purgeable) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = zHasSize;
        boolean z9 = wVar.purgeable;
        options.inInputShareable = z9;
        options.inPurgeable = z9;
        if (z8) {
            options.inPreferredConfig = wVar.config;
        }
        return options;
    }

    static boolean e(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    public abstract boolean canHandleRequest(w wVar);

    int d() {
        return 0;
    }

    boolean f(boolean z8, NetworkInfo networkInfo) {
        return false;
    }

    boolean g() {
        return false;
    }

    public abstract a load(w wVar, int i8);
}

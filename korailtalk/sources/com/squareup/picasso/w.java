package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: d */
    private static final long f29888d = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a */
    int f29889a;

    /* renamed from: b */
    long f29890b;

    /* renamed from: c */
    int f29891c;
    public final boolean centerCrop;
    public final int centerCropGravity;
    public final boolean centerInside;
    public final Bitmap.Config config;
    public final boolean hasRotationPivot;
    public final boolean onlyScaleDown;
    public final s.f priority;
    public final boolean purgeable;
    public final int resourceId;
    public final float rotationDegrees;
    public final float rotationPivotX;
    public final float rotationPivotY;
    public final String stableKey;
    public final int targetHeight;
    public final int targetWidth;
    public final List<F6.e> transformations;
    public final Uri uri;

    public static final class b {

        /* renamed from: a */
        private Uri f29892a;

        /* renamed from: b */
        private int f29893b;

        /* renamed from: c */
        private String f29894c;

        /* renamed from: d */
        private int f29895d;

        /* renamed from: e */
        private int f29896e;

        /* renamed from: f */
        private boolean f29897f;

        /* renamed from: g */
        private int f29898g;

        /* renamed from: h */
        private boolean f29899h;

        /* renamed from: i */
        private boolean f29900i;

        /* renamed from: j */
        private float f29901j;

        /* renamed from: k */
        private float f29902k;

        /* renamed from: l */
        private float f29903l;

        /* renamed from: m */
        private boolean f29904m;

        /* renamed from: n */
        private boolean f29905n;

        /* renamed from: o */
        private List f29906o;

        /* renamed from: p */
        private Bitmap.Config f29907p;

        /* renamed from: q */
        private s.f f29908q;

        /* synthetic */ b(w wVar, a aVar) {
            this(wVar);
        }

        boolean a() {
            return (this.f29892a == null && this.f29893b == 0) ? false : true;
        }

        boolean b() {
            return this.f29908q != null;
        }

        public w build() {
            boolean z8 = this.f29899h;
            if (z8 && this.f29897f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.f29897f && this.f29895d == 0 && this.f29896e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z8 && this.f29895d == 0 && this.f29896e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.f29908q == null) {
                this.f29908q = s.f.NORMAL;
            }
            return new w(this.f29892a, this.f29893b, this.f29894c, this.f29906o, this.f29895d, this.f29896e, this.f29897f, this.f29899h, this.f29898g, this.f29900i, this.f29901j, this.f29902k, this.f29903l, this.f29904m, this.f29905n, this.f29907p, this.f29908q);
        }

        boolean c() {
            return (this.f29895d == 0 && this.f29896e == 0) ? false : true;
        }

        public b centerCrop() {
            return centerCrop(17);
        }

        public b centerInside() {
            if (this.f29897f) {
                throw new IllegalStateException("Center inside can not be used after calling centerCrop");
            }
            this.f29899h = true;
            return this;
        }

        public b clearCenterCrop() {
            this.f29897f = false;
            this.f29898g = 17;
            return this;
        }

        public b clearCenterInside() {
            this.f29899h = false;
            return this;
        }

        public b clearOnlyScaleDown() {
            this.f29900i = false;
            return this;
        }

        public b clearResize() {
            this.f29895d = 0;
            this.f29896e = 0;
            this.f29897f = false;
            this.f29899h = false;
            return this;
        }

        public b clearRotation() {
            this.f29901j = 0.0f;
            this.f29902k = 0.0f;
            this.f29903l = 0.0f;
            this.f29904m = false;
            return this;
        }

        public b config(Bitmap.Config config) {
            if (config == null) {
                throw new IllegalArgumentException("config == null");
            }
            this.f29907p = config;
            return this;
        }

        public b onlyScaleDown() {
            if (this.f29896e == 0 && this.f29895d == 0) {
                throw new IllegalStateException("onlyScaleDown can not be applied without resize");
            }
            this.f29900i = true;
            return this;
        }

        public b priority(s.f fVar) {
            if (fVar == null) {
                throw new IllegalArgumentException("Priority invalid.");
            }
            if (this.f29908q != null) {
                throw new IllegalStateException("Priority already set.");
            }
            this.f29908q = fVar;
            return this;
        }

        public b purgeable() {
            this.f29905n = true;
            return this;
        }

        public b resize(int i8, int i9) {
            if (i8 < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            }
            if (i9 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            if (i9 == 0 && i8 == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            }
            this.f29895d = i8;
            this.f29896e = i9;
            return this;
        }

        public b rotate(float f8) {
            this.f29901j = f8;
            return this;
        }

        public b setResourceId(int i8) {
            if (i8 == 0) {
                throw new IllegalArgumentException("Image resource ID may not be 0.");
            }
            this.f29893b = i8;
            this.f29892a = null;
            return this;
        }

        public b setUri(Uri uri) {
            if (uri == null) {
                throw new IllegalArgumentException("Image URI may not be null.");
            }
            this.f29892a = uri;
            this.f29893b = 0;
            return this;
        }

        public b stableKey(String str) {
            this.f29894c = str;
            return this;
        }

        public b transform(F6.e eVar) {
            if (eVar == null) {
                throw new IllegalArgumentException("Transformation must not be null.");
            }
            if (eVar.a() == null) {
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
            if (this.f29906o == null) {
                this.f29906o = new ArrayList(2);
            }
            this.f29906o.add(eVar);
            return this;
        }

        public b(Uri uri) {
            setUri(uri);
        }

        public b centerCrop(int i8) {
            if (this.f29899h) {
                throw new IllegalStateException("Center crop can not be used after calling centerInside");
            }
            this.f29897f = true;
            this.f29898g = i8;
            return this;
        }

        public b rotate(float f8, float f9, float f10) {
            this.f29901j = f8;
            this.f29902k = f9;
            this.f29903l = f10;
            this.f29904m = true;
            return this;
        }

        public b(int i8) {
            setResourceId(i8);
        }

        b(Uri uri, int i8, Bitmap.Config config) {
            this.f29892a = uri;
            this.f29893b = i8;
            this.f29907p = config;
        }

        public b transform(List<? extends F6.e> list) {
            if (list != null) {
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    android.support.v4.media.session.f.a(list.get(i8));
                    transform((F6.e) null);
                }
                return this;
            }
            throw new IllegalArgumentException("Transformation list must not be null.");
        }

        private b(w wVar) {
            this.f29892a = wVar.uri;
            this.f29893b = wVar.resourceId;
            this.f29894c = wVar.stableKey;
            this.f29895d = wVar.targetWidth;
            this.f29896e = wVar.targetHeight;
            this.f29897f = wVar.centerCrop;
            this.f29899h = wVar.centerInside;
            this.f29898g = wVar.centerCropGravity;
            this.f29901j = wVar.rotationDegrees;
            this.f29902k = wVar.rotationPivotX;
            this.f29903l = wVar.rotationPivotY;
            this.f29904m = wVar.hasRotationPivot;
            this.f29905n = wVar.purgeable;
            this.f29900i = wVar.onlyScaleDown;
            if (wVar.transformations != null) {
                this.f29906o = new ArrayList(wVar.transformations);
            }
            this.f29907p = wVar.config;
            this.f29908q = wVar.priority;
        }
    }

    /* synthetic */ w(Uri uri, int i8, String str, List list, int i9, int i10, boolean z8, boolean z9, int i11, boolean z10, float f8, float f9, float f10, boolean z11, boolean z12, Bitmap.Config config, s.f fVar, a aVar) {
        this(uri, i8, str, list, i9, i10, z8, z9, i11, z10, f8, f9, f10, z11, z12, config, fVar);
    }

    String a() {
        Uri uri = this.uri;
        return uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(this.resourceId);
    }

    boolean b() {
        return this.transformations != null;
    }

    public b buildUpon() {
        return new b();
    }

    String c() {
        long jNanoTime = System.nanoTime() - this.f29890b;
        if (jNanoTime > f29888d) {
            return f() + '+' + TimeUnit.NANOSECONDS.toSeconds(jNanoTime) + 's';
        }
        return f() + '+' + TimeUnit.NANOSECONDS.toMillis(jNanoTime) + "ms";
    }

    boolean d() {
        return hasSize() || this.rotationDegrees != 0.0f;
    }

    boolean e() {
        return d() || b();
    }

    String f() {
        return "[R" + this.f29889a + ']';
    }

    public boolean hasSize() {
        return (this.targetWidth == 0 && this.targetHeight == 0) ? false : true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i8 = this.resourceId;
        if (i8 > 0) {
            sb.append(i8);
        } else {
            sb.append(this.uri);
        }
        List<F6.e> list = this.transformations;
        if (list != null && !list.isEmpty()) {
            Iterator<F6.e> it = this.transformations.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.f.a(it.next());
                sb.append(' ');
                throw null;
            }
        }
        if (this.stableKey != null) {
            sb.append(" stableKey(");
            sb.append(this.stableKey);
            sb.append(')');
        }
        if (this.targetWidth > 0) {
            sb.append(" resize(");
            sb.append(this.targetWidth);
            sb.append(',');
            sb.append(this.targetHeight);
            sb.append(')');
        }
        if (this.centerCrop) {
            sb.append(" centerCrop");
        }
        if (this.centerInside) {
            sb.append(" centerInside");
        }
        if (this.rotationDegrees != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.rotationDegrees);
            if (this.hasRotationPivot) {
                sb.append(" @ ");
                sb.append(this.rotationPivotX);
                sb.append(',');
                sb.append(this.rotationPivotY);
            }
            sb.append(')');
        }
        if (this.purgeable) {
            sb.append(" purgeable");
        }
        if (this.config != null) {
            sb.append(' ');
            sb.append(this.config);
        }
        sb.append('}');
        return sb.toString();
    }

    private w(Uri uri, int i8, String str, List list, int i9, int i10, boolean z8, boolean z9, int i11, boolean z10, float f8, float f9, float f10, boolean z11, boolean z12, Bitmap.Config config, s.f fVar) {
        this.uri = uri;
        this.resourceId = i8;
        this.stableKey = str;
        if (list == null) {
            this.transformations = null;
        } else {
            this.transformations = Collections.unmodifiableList(list);
        }
        this.targetWidth = i9;
        this.targetHeight = i10;
        this.centerCrop = z8;
        this.centerInside = z9;
        this.centerCropGravity = i11;
        this.onlyScaleDown = z10;
        this.rotationDegrees = f8;
        this.rotationPivotX = f9;
        this.rotationPivotY = f10;
        this.hasRotationPivot = z11;
        this.purgeable = z12;
        this.config = config;
        this.priority = fVar;
    }
}

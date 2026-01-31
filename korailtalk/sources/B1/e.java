package B1;

import y1.C6515B;

/* loaded from: classes.dex */
public final class e {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_ANY = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_LANDSCAPE = 2;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_PORTRAIT = 3;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_SQUARE = 4;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_UNKNOWN = 0;

    @Deprecated
    public static final int ORIENTATION_ANY = 0;

    @Deprecated
    public static final int ORIENTATION_LANDSCAPE = 2;

    @Deprecated
    public static final int ORIENTATION_PORTRAIT = 1;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f194a;

    /* renamed from: b, reason: collision with root package name */
    private final int f195b;

    /* renamed from: c, reason: collision with root package name */
    private final int f196c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f197d;

    /* renamed from: e, reason: collision with root package name */
    private final int f198e;

    /* renamed from: f, reason: collision with root package name */
    private final C6515B f199f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f200g;

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        private C6515B f205e;

        /* renamed from: a, reason: collision with root package name */
        private boolean f201a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f202b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f203c = 0;

        /* renamed from: d, reason: collision with root package name */
        private boolean f204d = false;

        /* renamed from: f, reason: collision with root package name */
        private int f206f = 1;

        /* renamed from: g, reason: collision with root package name */
        private boolean f207g = false;

        public e build() {
            return new e(this, null);
        }

        public a setAdChoicesPlacement(int i8) {
            this.f206f = i8;
            return this;
        }

        @Deprecated
        public a setImageOrientation(int i8) {
            this.f202b = i8;
            return this;
        }

        public a setMediaAspectRatio(int i8) {
            this.f203c = i8;
            return this;
        }

        public a setRequestCustomMuteThisAd(boolean z8) {
            this.f207g = z8;
            return this;
        }

        public a setRequestMultipleImages(boolean z8) {
            this.f204d = z8;
            return this;
        }

        public a setReturnUrlsForImageAssets(boolean z8) {
            this.f201a = z8;
            return this;
        }

        public a setVideoOptions(C6515B c6515b) {
            this.f205e = c6515b;
            return this;
        }
    }

    /* synthetic */ e(a aVar, k kVar) {
        this.f194a = aVar.f201a;
        this.f195b = aVar.f202b;
        this.f196c = aVar.f203c;
        this.f197d = aVar.f204d;
        this.f198e = aVar.f206f;
        this.f199f = aVar.f205e;
        this.f200g = aVar.f207g;
    }

    public int getAdChoicesPlacement() {
        return this.f198e;
    }

    @Deprecated
    public int getImageOrientation() {
        return this.f195b;
    }

    public int getMediaAspectRatio() {
        return this.f196c;
    }

    public C6515B getVideoOptions() {
        return this.f199f;
    }

    public boolean shouldRequestMultipleImages() {
        return this.f197d;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.f194a;
    }

    public final boolean zza() {
        return this.f200g;
    }
}

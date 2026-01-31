package Q1;

import y1.C6515B;

/* loaded from: classes.dex */
public final class d {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_ANY = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_LANDSCAPE = 2;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_PORTRAIT = 3;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_SQUARE = 4;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_UNKNOWN = 0;
    public static final int SWIPE_GESTURE_DIRECTION_DOWN = 8;
    public static final int SWIPE_GESTURE_DIRECTION_LEFT = 2;
    public static final int SWIPE_GESTURE_DIRECTION_RIGHT = 1;
    public static final int SWIPE_GESTURE_DIRECTION_UP = 4;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f3997a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3998b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f3999c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4000d;

    /* renamed from: e, reason: collision with root package name */
    private final C6515B f4001e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f4002f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f4003g;

    /* renamed from: h, reason: collision with root package name */
    private final int f4004h;

    /* renamed from: i, reason: collision with root package name */
    private final int f4005i;

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private C6515B f4009d;

        /* renamed from: a, reason: collision with root package name */
        private boolean f4006a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f4007b = 0;

        /* renamed from: c, reason: collision with root package name */
        private boolean f4008c = false;

        /* renamed from: e, reason: collision with root package name */
        private int f4010e = 1;

        /* renamed from: f, reason: collision with root package name */
        private boolean f4011f = false;

        /* renamed from: g, reason: collision with root package name */
        private boolean f4012g = false;

        /* renamed from: h, reason: collision with root package name */
        private int f4013h = 0;

        /* renamed from: i, reason: collision with root package name */
        private int f4014i = 1;

        public d build() {
            return new d(this, null);
        }

        public a enableCustomClickGestureDirection(int i8, boolean z8) {
            this.f4012g = z8;
            this.f4013h = i8;
            return this;
        }

        public a setAdChoicesPlacement(int i8) {
            this.f4010e = i8;
            return this;
        }

        public a setMediaAspectRatio(int i8) {
            this.f4007b = i8;
            return this;
        }

        public a setRequestCustomMuteThisAd(boolean z8) {
            this.f4011f = z8;
            return this;
        }

        public a setRequestMultipleImages(boolean z8) {
            this.f4008c = z8;
            return this;
        }

        public a setReturnUrlsForImageAssets(boolean z8) {
            this.f4006a = z8;
            return this;
        }

        public a setVideoOptions(C6515B c6515b) {
            this.f4009d = c6515b;
            return this;
        }

        public final a zzi(int i8) {
            this.f4014i = i8;
            return this;
        }
    }

    /* synthetic */ d(a aVar, g gVar) {
        this.f3997a = aVar.f4006a;
        this.f3998b = aVar.f4007b;
        this.f3999c = aVar.f4008c;
        this.f4000d = aVar.f4010e;
        this.f4001e = aVar.f4009d;
        this.f4002f = aVar.f4011f;
        this.f4003g = aVar.f4012g;
        this.f4004h = aVar.f4013h;
        this.f4005i = aVar.f4014i;
    }

    public int getAdChoicesPlacement() {
        return this.f4000d;
    }

    public int getMediaAspectRatio() {
        return this.f3998b;
    }

    public C6515B getVideoOptions() {
        return this.f4001e;
    }

    public boolean shouldRequestMultipleImages() {
        return this.f3999c;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.f3997a;
    }

    public final int zza() {
        return this.f4004h;
    }

    public final boolean zzb() {
        return this.f4003g;
    }

    public final boolean zzc() {
        return this.f4002f;
    }

    public final int zzd() {
        return this.f4005i;
    }
}

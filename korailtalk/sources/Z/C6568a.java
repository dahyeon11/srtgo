package z;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6568a extends AbstractC6584i {

    /* renamed from: a, reason: collision with root package name */
    private final int f37786a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37787b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37788c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37789d;

    /* renamed from: e, reason: collision with root package name */
    private final int f37790e;

    /* renamed from: f, reason: collision with root package name */
    private final int f37791f;

    /* renamed from: g, reason: collision with root package name */
    private final int f37792g;

    /* renamed from: h, reason: collision with root package name */
    private final int f37793h;

    /* renamed from: i, reason: collision with root package name */
    private final int f37794i;

    /* renamed from: j, reason: collision with root package name */
    private final int f37795j;

    /* renamed from: k, reason: collision with root package name */
    private final int f37796k;

    /* renamed from: l, reason: collision with root package name */
    private final int f37797l;

    C6568a(int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f37786a = i8;
        this.f37787b = i9;
        this.f37788c = i10;
        this.f37789d = i11;
        this.f37790e = i12;
        this.f37791f = i13;
        this.f37792g = i14;
        this.f37793h = i15;
        this.f37794i = i16;
        this.f37795j = i17;
        this.f37796k = i18;
        this.f37797l = i19;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6584i)) {
            return false;
        }
        AbstractC6584i abstractC6584i = (AbstractC6584i) obj;
        return this.f37786a == abstractC6584i.getDuration() && this.f37787b == abstractC6584i.getQuality() && this.f37788c == abstractC6584i.getFileFormat() && this.f37789d == abstractC6584i.getVideoCodec() && this.f37790e == abstractC6584i.getVideoBitRate() && this.f37791f == abstractC6584i.getVideoFrameRate() && this.f37792g == abstractC6584i.getVideoFrameWidth() && this.f37793h == abstractC6584i.getVideoFrameHeight() && this.f37794i == abstractC6584i.getAudioCodec() && this.f37795j == abstractC6584i.getAudioBitRate() && this.f37796k == abstractC6584i.getAudioSampleRate() && this.f37797l == abstractC6584i.getAudioChannels();
    }

    @Override // z.AbstractC6584i
    public int getAudioBitRate() {
        return this.f37795j;
    }

    @Override // z.AbstractC6584i
    public int getAudioChannels() {
        return this.f37797l;
    }

    @Override // z.AbstractC6584i
    public int getAudioCodec() {
        return this.f37794i;
    }

    @Override // z.AbstractC6584i
    public int getAudioSampleRate() {
        return this.f37796k;
    }

    @Override // z.AbstractC6584i
    public int getDuration() {
        return this.f37786a;
    }

    @Override // z.AbstractC6584i
    public int getFileFormat() {
        return this.f37788c;
    }

    @Override // z.AbstractC6584i
    public int getQuality() {
        return this.f37787b;
    }

    @Override // z.AbstractC6584i
    public int getVideoBitRate() {
        return this.f37790e;
    }

    @Override // z.AbstractC6584i
    public int getVideoCodec() {
        return this.f37789d;
    }

    @Override // z.AbstractC6584i
    public int getVideoFrameHeight() {
        return this.f37793h;
    }

    @Override // z.AbstractC6584i
    public int getVideoFrameRate() {
        return this.f37791f;
    }

    @Override // z.AbstractC6584i
    public int getVideoFrameWidth() {
        return this.f37792g;
    }

    public int hashCode() {
        return ((((((((((((((((((((((this.f37786a ^ 1000003) * 1000003) ^ this.f37787b) * 1000003) ^ this.f37788c) * 1000003) ^ this.f37789d) * 1000003) ^ this.f37790e) * 1000003) ^ this.f37791f) * 1000003) ^ this.f37792g) * 1000003) ^ this.f37793h) * 1000003) ^ this.f37794i) * 1000003) ^ this.f37795j) * 1000003) ^ this.f37796k) * 1000003) ^ this.f37797l;
    }

    public String toString() {
        return "CamcorderProfileProxy{duration=" + this.f37786a + ", quality=" + this.f37787b + ", fileFormat=" + this.f37788c + ", videoCodec=" + this.f37789d + ", videoBitRate=" + this.f37790e + ", videoFrameRate=" + this.f37791f + ", videoFrameWidth=" + this.f37792g + ", videoFrameHeight=" + this.f37793h + ", audioCodec=" + this.f37794i + ", audioBitRate=" + this.f37795j + ", audioSampleRate=" + this.f37796k + ", audioChannels=" + this.f37797l + "}";
    }
}

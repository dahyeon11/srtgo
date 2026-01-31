package androidx.media;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    int f10093a;

    /* renamed from: b, reason: collision with root package name */
    int f10094b;

    /* renamed from: c, reason: collision with root package name */
    int f10095c;

    /* renamed from: d, reason: collision with root package name */
    int f10096d;

    AudioAttributesImplBase() {
        this.f10093a = 0;
        this.f10094b = 0;
        this.f10095c = 0;
        this.f10096d = -1;
    }

    public static AudioAttributesImpl fromBundle(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new AudioAttributesImplBase(bundle.getInt("androidx.media.audio_attrs.CONTENT_TYPE", 0), bundle.getInt("androidx.media.audio_attrs.FLAGS", 0), bundle.getInt("androidx.media.audio_attrs.USAGE", 0), bundle.getInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", -1));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f10094b == audioAttributesImplBase.getContentType() && this.f10095c == audioAttributesImplBase.getFlags() && this.f10093a == audioAttributesImplBase.getUsage() && this.f10096d == audioAttributesImplBase.f10096d;
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object getAudioAttributes() {
        return null;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return this.f10094b;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
        int i8 = this.f10095c;
        int legacyStreamType = getLegacyStreamType();
        if (legacyStreamType == 6) {
            i8 |= 4;
        } else if (legacyStreamType == 7) {
            i8 |= 1;
        }
        return i8 & 273;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getLegacyStreamType() {
        int i8 = this.f10096d;
        return i8 != -1 ? i8 : AudioAttributesCompat.a(false, this.f10095c, this.f10093a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getRawLegacyStreamType() {
        return this.f10096d;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getUsage() {
        return this.f10093a;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getVolumeControlStream() {
        return AudioAttributesCompat.a(true, this.f10095c, this.f10093a);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10094b), Integer.valueOf(this.f10095c), Integer.valueOf(this.f10093a), Integer.valueOf(this.f10096d)});
    }

    @Override // androidx.media.AudioAttributesImpl
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt("androidx.media.audio_attrs.USAGE", this.f10093a);
        bundle.putInt("androidx.media.audio_attrs.CONTENT_TYPE", this.f10094b);
        bundle.putInt("androidx.media.audio_attrs.FLAGS", this.f10095c);
        int i8 = this.f10096d;
        if (i8 != -1) {
            bundle.putInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", i8);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f10096d != -1) {
            sb.append(" stream=");
            sb.append(this.f10096d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.b(this.f10093a));
        sb.append(" content=");
        sb.append(this.f10094b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f10095c).toUpperCase());
        return sb.toString();
    }

    AudioAttributesImplBase(int i8, int i9, int i10, int i11) {
        this.f10094b = i8;
        this.f10095c = i9;
        this.f10093a = i10;
        this.f10096d = i11;
    }
}

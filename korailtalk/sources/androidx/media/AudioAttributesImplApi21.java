package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: c, reason: collision with root package name */
    static Method f10090c;

    /* renamed from: a, reason: collision with root package name */
    AudioAttributes f10091a;

    /* renamed from: b, reason: collision with root package name */
    int f10092b;

    AudioAttributesImplApi21() {
        this.f10092b = -1;
    }

    static Method a() {
        try {
            if (f10090c == null) {
                f10090c = AudioAttributes.class.getMethod("toLegacyStreamType", AudioAttributes.class);
            }
            return f10090c;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static AudioAttributesImpl fromBundle(Bundle bundle) {
        AudioAttributes audioAttributes;
        if (bundle == null || (audioAttributes = (AudioAttributes) bundle.getParcelable("androidx.media.audio_attrs.FRAMEWORKS")) == null) {
            return null;
        }
        return new AudioAttributesImplApi21(audioAttributes, bundle.getInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", -1));
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f10091a.equals(((AudioAttributesImplApi21) obj).f10091a);
        }
        return false;
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object getAudioAttributes() {
        return this.f10091a;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return this.f10091a.getContentType();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
        return this.f10091a.getFlags();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getLegacyStreamType() {
        int i8 = this.f10092b;
        if (i8 != -1) {
            return i8;
        }
        Method methodA = a();
        if (methodA == null) {
            Log.w("AudioAttributesCompat21", "No AudioAttributes#toLegacyStreamType() on API: " + Build.VERSION.SDK_INT);
            return -1;
        }
        try {
            return ((Integer) methodA.invoke(null, this.f10091a)).intValue();
        } catch (IllegalAccessException | InvocationTargetException e8) {
            Log.w("AudioAttributesCompat21", "getLegacyStreamType() failed on API: " + Build.VERSION.SDK_INT, e8);
            return -1;
        }
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getRawLegacyStreamType() {
        return this.f10092b;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getUsage() {
        return this.f10091a.getUsage();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getVolumeControlStream() {
        return Build.VERSION.SDK_INT >= 26 ? this.f10091a.getVolumeControlStream() : AudioAttributesCompat.a(true, getFlags(), getUsage());
    }

    public int hashCode() {
        return this.f10091a.hashCode();
    }

    @Override // androidx.media.AudioAttributesImpl
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("androidx.media.audio_attrs.FRAMEWORKS", this.f10091a);
        int i8 = this.f10092b;
        if (i8 != -1) {
            bundle.putInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", i8);
        }
        return bundle;
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f10091a;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i8) {
        this.f10091a = audioAttributes;
        this.f10092b = i8;
    }
}

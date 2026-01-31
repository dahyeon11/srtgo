package androidx.media;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(androidx.versionedparcelable.a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f10089a = (AudioAttributesImpl) aVar.readVersionedParcelable(audioAttributesCompat.f10089a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, androidx.versionedparcelable.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        aVar.setSerializationFlags(false, false);
        aVar.writeVersionedParcelable(audioAttributesCompat.f10089a, 1);
    }
}

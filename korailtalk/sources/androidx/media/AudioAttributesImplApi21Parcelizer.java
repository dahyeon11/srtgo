package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(androidx.versionedparcelable.a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f10091a = (AudioAttributes) aVar.readParcelable(audioAttributesImplApi21.f10091a, 1);
        audioAttributesImplApi21.f10092b = aVar.readInt(audioAttributesImplApi21.f10092b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, androidx.versionedparcelable.a aVar) {
        aVar.setSerializationFlags(false, false);
        aVar.writeParcelable(audioAttributesImplApi21.f10091a, 1);
        aVar.writeInt(audioAttributesImplApi21.f10092b, 2);
    }
}

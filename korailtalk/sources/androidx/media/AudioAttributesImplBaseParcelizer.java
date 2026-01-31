package androidx.media;

/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(androidx.versionedparcelable.a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f10093a = aVar.readInt(audioAttributesImplBase.f10093a, 1);
        audioAttributesImplBase.f10094b = aVar.readInt(audioAttributesImplBase.f10094b, 2);
        audioAttributesImplBase.f10095c = aVar.readInt(audioAttributesImplBase.f10095c, 3);
        audioAttributesImplBase.f10096d = aVar.readInt(audioAttributesImplBase.f10096d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, androidx.versionedparcelable.a aVar) {
        aVar.setSerializationFlags(false, false);
        aVar.writeInt(audioAttributesImplBase.f10093a, 1);
        aVar.writeInt(audioAttributesImplBase.f10094b, 2);
        aVar.writeInt(audioAttributesImplBase.f10095c, 3);
        aVar.writeInt(audioAttributesImplBase.f10096d, 4);
    }
}

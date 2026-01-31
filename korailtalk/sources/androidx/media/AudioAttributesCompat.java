package androidx.media;

import android.media.AudioAttributes;
import android.os.Bundle;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements E0.a {
    public static final int CONTENT_TYPE_MOVIE = 3;
    public static final int CONTENT_TYPE_MUSIC = 2;
    public static final int CONTENT_TYPE_SONIFICATION = 4;
    public static final int CONTENT_TYPE_SPEECH = 1;
    public static final int CONTENT_TYPE_UNKNOWN = 0;
    public static final int FLAG_AUDIBILITY_ENFORCED = 1;
    public static final int FLAG_HW_AV_SYNC = 16;
    public static final int USAGE_ALARM = 4;
    public static final int USAGE_ASSISTANCE_ACCESSIBILITY = 11;
    public static final int USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;
    public static final int USAGE_ASSISTANCE_SONIFICATION = 13;
    public static final int USAGE_ASSISTANT = 16;
    public static final int USAGE_GAME = 14;
    public static final int USAGE_MEDIA = 1;
    public static final int USAGE_NOTIFICATION = 5;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;
    public static final int USAGE_NOTIFICATION_EVENT = 10;
    public static final int USAGE_NOTIFICATION_RINGTONE = 6;
    public static final int USAGE_UNKNOWN = 0;
    public static final int USAGE_VOICE_COMMUNICATION = 2;
    public static final int USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;

    /* renamed from: b, reason: collision with root package name */
    private static final SparseIntArray f10086b;

    /* renamed from: c, reason: collision with root package name */
    static boolean f10087c;

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f10088d;

    /* renamed from: a, reason: collision with root package name */
    AudioAttributesImpl f10089a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10086b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        f10088d = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    AudioAttributesCompat() {
    }

    static int a(boolean z8, int i8, int i9) {
        if ((i8 & 1) == 1) {
            return z8 ? 1 : 7;
        }
        if ((i8 & 4) == 4) {
            return z8 ? 0 : 6;
        }
        switch (i9) {
            case 0:
                return z8 ? Integer.MIN_VALUE : 3;
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z8 ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                if (!z8) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i9 + " in audio attributes");
        }
    }

    static String b(int i8) {
        switch (i8) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i8;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    public static AudioAttributesCompat fromBundle(Bundle bundle) {
        AudioAttributesImpl audioAttributesImplFromBundle = AudioAttributesImplApi21.fromBundle(bundle);
        if (audioAttributesImplFromBundle == null) {
            return null;
        }
        return new AudioAttributesCompat(audioAttributesImplFromBundle);
    }

    public static void setForceLegacyBehavior(boolean z8) {
        f10087c = z8;
    }

    public static AudioAttributesCompat wrap(Object obj) {
        if (f10087c) {
            return null;
        }
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21((AudioAttributes) obj);
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f10089a = audioAttributesImplApi21;
        return audioAttributesCompat;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f10089a;
        return audioAttributesImpl == null ? audioAttributesCompat.f10089a == null : audioAttributesImpl.equals(audioAttributesCompat.f10089a);
    }

    public int getContentType() {
        return this.f10089a.getContentType();
    }

    public int getFlags() {
        return this.f10089a.getFlags();
    }

    public int getLegacyStreamType() {
        return this.f10089a.getLegacyStreamType();
    }

    public int getUsage() {
        return this.f10089a.getUsage();
    }

    public int getVolumeControlStream() {
        return this.f10089a.getVolumeControlStream();
    }

    public int hashCode() {
        return this.f10089a.hashCode();
    }

    public Bundle toBundle() {
        return this.f10089a.toBundle();
    }

    public String toString() {
        return this.f10089a.toString();
    }

    public Object unwrap() {
        return this.f10089a.getAudioAttributes();
    }

    AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f10089a = audioAttributesImpl;
    }
}

package androidx.media;

import android.os.Bundle;

/* loaded from: classes.dex */
interface AudioAttributesImpl extends E0.a {
    Object getAudioAttributes();

    int getContentType();

    int getFlags();

    int getLegacyStreamType();

    int getRawLegacyStreamType();

    int getUsage();

    int getVolumeControlStream();

    Bundle toBundle();
}

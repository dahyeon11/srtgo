package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.mIcon = (IconCompat) aVar.readVersionedParcelable(remoteActionCompat.mIcon, 1);
        remoteActionCompat.mTitle = aVar.readCharSequence(remoteActionCompat.mTitle, 2);
        remoteActionCompat.mContentDescription = aVar.readCharSequence(remoteActionCompat.mContentDescription, 3);
        remoteActionCompat.mActionIntent = (PendingIntent) aVar.readParcelable(remoteActionCompat.mActionIntent, 4);
        remoteActionCompat.mEnabled = aVar.readBoolean(remoteActionCompat.mEnabled, 5);
        remoteActionCompat.mShouldShowIcon = aVar.readBoolean(remoteActionCompat.mShouldShowIcon, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        aVar.setSerializationFlags(false, false);
        aVar.writeVersionedParcelable(remoteActionCompat.mIcon, 1);
        aVar.writeCharSequence(remoteActionCompat.mTitle, 2);
        aVar.writeCharSequence(remoteActionCompat.mContentDescription, 3);
        aVar.writeParcelable(remoteActionCompat.mActionIntent, 4);
        aVar.writeBoolean(remoteActionCompat.mEnabled, 5);
        aVar.writeBoolean(remoteActionCompat.mShouldShowIcon, 6);
    }
}

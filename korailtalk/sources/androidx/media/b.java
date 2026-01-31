package androidx.media;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;

/* loaded from: classes.dex */
public abstract class b {
    public static boolean areSameOptions(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        return bundle == null ? bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1 : bundle2 == null ? bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1 : bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
    }

    public static boolean hasDuplicatedItems(Bundle bundle, Bundle bundle2) {
        int i8;
        int i9;
        int i10;
        int i11 = bundle == null ? -1 : bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
        int i12 = bundle2 == null ? -1 : bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
        int i13 = bundle == null ? -1 : bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        int i14 = bundle2 == null ? -1 : bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        int i15 = Integer.MAX_VALUE;
        if (i11 == -1 || i13 == -1) {
            i8 = Integer.MAX_VALUE;
            i9 = 0;
        } else {
            i9 = i11 * i13;
            i8 = (i13 + i9) - 1;
        }
        if (i12 == -1 || i14 == -1) {
            i10 = 0;
        } else {
            i10 = i12 * i14;
            i15 = (i14 + i10) - 1;
        }
        return i8 >= i10 && i15 >= i9;
    }
}

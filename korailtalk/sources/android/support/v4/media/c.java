package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.a;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

/* loaded from: classes.dex */
abstract class c {

    interface a extends a.d {
        @Override // android.support.v4.media.a.d
        /* synthetic */ void onChildrenLoaded(String str, List list);

        void onChildrenLoaded(String str, List<?> list, Bundle bundle);

        @Override // android.support.v4.media.a.d
        /* synthetic */ void onError(String str);

        void onError(String str, Bundle bundle);
    }

    static class b extends a.e {
        b(a aVar) {
            super(aVar);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            ((a) this.f6088a).onChildrenLoaded(str, list, bundle);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onError(String str, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            ((a) this.f6088a).onError(str, bundle);
        }
    }

    static Object a(a aVar) {
        return new b(aVar);
    }

    public static void subscribe(Object obj, String str, Bundle bundle, Object obj2) {
        ((MediaBrowser) obj).subscribe(str, bundle, (MediaBrowser.SubscriptionCallback) obj2);
    }

    public static void unsubscribe(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).unsubscribe(str, (MediaBrowser.SubscriptionCallback) obj2);
    }
}

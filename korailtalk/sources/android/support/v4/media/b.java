package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Parcel;

/* loaded from: classes.dex */
abstract class b {

    interface a {
        void onError(String str);

        void onItemLoaded(Parcel parcel);
    }

    /* renamed from: android.support.v4.media.b$b, reason: collision with other inner class name */
    static class C0102b extends MediaBrowser.ItemCallback {

        /* renamed from: a, reason: collision with root package name */
        protected final a f6089a;

        public C0102b(a aVar) {
            this.f6089a = aVar;
        }

        @Override // android.media.browse.MediaBrowser.ItemCallback
        public void onError(String str) {
            this.f6089a.onError(str);
        }

        @Override // android.media.browse.MediaBrowser.ItemCallback
        public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
            if (mediaItem == null) {
                this.f6089a.onItemLoaded(null);
                return;
            }
            Parcel parcelObtain = Parcel.obtain();
            mediaItem.writeToParcel(parcelObtain, 0);
            this.f6089a.onItemLoaded(parcelObtain);
        }
    }

    public static Object createItemCallback(a aVar) {
        return new C0102b(aVar);
    }

    public static void getItem(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).getItem(str, (MediaBrowser.ItemCallback) obj2);
    }
}

package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.a;
import android.support.v4.media.b;
import android.support.v4.media.c;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import d.C5298b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class MediaBrowserCompat {
    public static final String CUSTOM_ACTION_DOWNLOAD = "android.support.v4.media.action.DOWNLOAD";
    public static final String CUSTOM_ACTION_REMOVE_DOWNLOADED_FILE = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";
    public static final String EXTRA_DOWNLOAD_PROGRESS = "android.media.browse.extra.DOWNLOAD_PROGRESS";
    public static final String EXTRA_MEDIA_ID = "android.media.browse.extra.MEDIA_ID";
    public static final String EXTRA_PAGE = "android.media.browse.extra.PAGE";
    public static final String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";

    /* renamed from: b, reason: collision with root package name */
    static final boolean f5997b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a, reason: collision with root package name */
    private final e f5998a;

    private static class CustomActionResultReceiver extends C5298b {

        /* renamed from: d, reason: collision with root package name */
        private final String f5999d;

        /* renamed from: e, reason: collision with root package name */
        private final Bundle f6000e;

        /* renamed from: f, reason: collision with root package name */
        private final c f6001f;

        CustomActionResultReceiver(String str, Bundle bundle, c cVar, Handler handler) {
            super(handler);
            this.f5999d = str;
            this.f6000e = bundle;
            this.f6001f = cVar;
        }

        @Override // d.C5298b
        protected void b(int i8, Bundle bundle) {
            if (this.f6001f == null) {
                return;
            }
            MediaSessionCompat.ensureClassLoader(bundle);
            if (i8 == -1) {
                this.f6001f.onError(this.f5999d, this.f6000e, bundle);
                return;
            }
            if (i8 == 0) {
                this.f6001f.onResult(this.f5999d, this.f6000e, bundle);
                return;
            }
            if (i8 == 1) {
                this.f6001f.onProgressUpdate(this.f5999d, this.f6000e, bundle);
                return;
            }
            Log.w("MediaBrowserCompat", "Unknown result code: " + i8 + " (extras=" + this.f6000e + ", resultData=" + bundle + ")");
        }
    }

    private static class ItemReceiver extends C5298b {

        /* renamed from: d, reason: collision with root package name */
        private final String f6002d;

        /* renamed from: e, reason: collision with root package name */
        private final d f6003e;

        ItemReceiver(String str, d dVar, Handler handler) {
            super(handler);
            this.f6002d = str;
            this.f6003e = dVar;
        }

        @Override // d.C5298b
        protected void b(int i8, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            if (i8 != 0 || bundle == null || !bundle.containsKey("media_item")) {
                this.f6003e.onError(this.f6002d);
                return;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.f6003e.onItemLoaded((MediaItem) parcelable);
            } else {
                this.f6003e.onError(this.f6002d);
            }
        }
    }

    private static class SearchResultReceiver extends C5298b {

        /* renamed from: d, reason: collision with root package name */
        private final String f6006d;

        /* renamed from: e, reason: collision with root package name */
        private final Bundle f6007e;

        /* renamed from: f, reason: collision with root package name */
        private final j f6008f;

        SearchResultReceiver(String str, Bundle bundle, j jVar, Handler handler) {
            super(handler);
            this.f6006d = str;
            this.f6007e = bundle;
            this.f6008f = jVar;
        }

        @Override // d.C5298b
        protected void b(int i8, Bundle bundle) {
            ArrayList arrayList;
            MediaSessionCompat.ensureClassLoader(bundle);
            if (i8 != 0 || bundle == null || !bundle.containsKey("search_results")) {
                this.f6008f.onError(this.f6006d, this.f6007e);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            if (parcelableArray != null) {
                arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            } else {
                arrayList = null;
            }
            this.f6008f.onSearchResult(this.f6006d, this.f6007e, arrayList);
        }
    }

    private static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f6009a;

        /* renamed from: b, reason: collision with root package name */
        private WeakReference f6010b;

        a(i iVar) {
            this.f6009a = new WeakReference(iVar);
        }

        void a(Messenger messenger) {
            this.f6010b = new WeakReference(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference weakReference = this.f6010b;
            if (weakReference == null || weakReference.get() == null || this.f6009a.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.ensureClassLoader(data);
            i iVar = (i) this.f6009a.get();
            Messenger messenger = (Messenger) this.f6010b.get();
            try {
                int i8 = message.what;
                if (i8 == 1) {
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.ensureClassLoader(bundle);
                    iVar.onServiceConnected(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                } else if (i8 == 2) {
                    iVar.onConnectionFailed(messenger);
                } else if (i8 != 3) {
                    Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                } else {
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.ensureClassLoader(bundle2);
                    Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                    MediaSessionCompat.ensureClassLoader(bundle3);
                    iVar.onLoadChildren(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                if (message.what == 1) {
                    iVar.onConnectionFailed(messenger);
                }
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final Object f6011a = android.support.v4.media.a.createConnectionCallback(new C0099b());

        /* renamed from: b, reason: collision with root package name */
        a f6012b;

        interface a {
            void onConnected();

            void onConnectionFailed();

            void onConnectionSuspended();
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b, reason: collision with other inner class name */
        private class C0099b implements a.InterfaceC0101a {
            C0099b() {
            }

            @Override // android.support.v4.media.a.InterfaceC0101a
            public void onConnected() {
                a aVar = b.this.f6012b;
                if (aVar != null) {
                    aVar.onConnected();
                }
                b.this.onConnected();
            }

            @Override // android.support.v4.media.a.InterfaceC0101a
            public void onConnectionFailed() {
                a aVar = b.this.f6012b;
                if (aVar != null) {
                    aVar.onConnectionFailed();
                }
                b.this.onConnectionFailed();
            }

            @Override // android.support.v4.media.a.InterfaceC0101a
            public void onConnectionSuspended() {
                a aVar = b.this.f6012b;
                if (aVar != null) {
                    aVar.onConnectionSuspended();
                }
                b.this.onConnectionSuspended();
            }
        }

        void a(a aVar) {
            this.f6012b = aVar;
        }

        public void onConnected() {
        }

        public void onConnectionFailed() {
        }

        public void onConnectionSuspended() {
        }
    }

    public static abstract class c {
        public void onError(String str, Bundle bundle, Bundle bundle2) {
        }

        public void onProgressUpdate(String str, Bundle bundle, Bundle bundle2) {
        }

        public void onResult(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        final Object f6014a = android.support.v4.media.b.createItemCallback(new a());

        private class a implements b.a {
            a() {
            }

            @Override // android.support.v4.media.b.a
            public void onError(String str) {
                d.this.onError(str);
            }

            @Override // android.support.v4.media.b.a
            public void onItemLoaded(Parcel parcel) {
                if (parcel == null) {
                    d.this.onItemLoaded(null);
                    return;
                }
                parcel.setDataPosition(0);
                MediaItem mediaItemCreateFromParcel = MediaItem.CREATOR.createFromParcel(parcel);
                parcel.recycle();
                d.this.onItemLoaded(mediaItemCreateFromParcel);
            }
        }

        public void onError(String str) {
        }

        public void onItemLoaded(MediaItem mediaItem) {
        }
    }

    interface e {
        void connect();

        void disconnect();

        Bundle getExtras();

        void getItem(String str, d dVar);

        Bundle getNotifyChildrenChangedOptions();

        String getRoot();

        ComponentName getServiceComponent();

        MediaSessionCompat.Token getSessionToken();

        boolean isConnected();

        void search(String str, Bundle bundle, j jVar);

        void sendCustomAction(String str, Bundle bundle, c cVar);

        void subscribe(String str, Bundle bundle, m mVar);

        void unsubscribe(String str, m mVar);
    }

    static class f implements e, i, b.a {

        /* renamed from: a, reason: collision with root package name */
        final Context f6016a;

        /* renamed from: b, reason: collision with root package name */
        protected final Object f6017b;

        /* renamed from: c, reason: collision with root package name */
        protected final Bundle f6018c;

        /* renamed from: d, reason: collision with root package name */
        protected final a f6019d = new a(this);

        /* renamed from: e, reason: collision with root package name */
        private final O.a f6020e = new O.a();

        /* renamed from: f, reason: collision with root package name */
        protected int f6021f;

        /* renamed from: g, reason: collision with root package name */
        protected k f6022g;

        /* renamed from: h, reason: collision with root package name */
        protected Messenger f6023h;

        /* renamed from: i, reason: collision with root package name */
        private MediaSessionCompat.Token f6024i;

        /* renamed from: j, reason: collision with root package name */
        private Bundle f6025j;

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f6026a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f6027b;

            a(d dVar, String str) {
                this.f6026a = dVar;
                this.f6027b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f6026a.onError(this.f6027b);
            }
        }

        class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f6029a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f6030b;

            b(d dVar, String str) {
                this.f6029a = dVar;
                this.f6030b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f6029a.onError(this.f6030b);
            }
        }

        class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f6032a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f6033b;

            c(d dVar, String str) {
                this.f6032a = dVar;
                this.f6033b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f6032a.onError(this.f6033b);
            }
        }

        class d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f6035a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f6036b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f6037c;

            d(j jVar, String str, Bundle bundle) {
                this.f6035a = jVar;
                this.f6036b = str;
                this.f6037c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f6035a.onError(this.f6036b, this.f6037c);
            }
        }

        class e implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f6039a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f6040b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f6041c;

            e(j jVar, String str, Bundle bundle) {
                this.f6039a = jVar;
                this.f6040b = str;
                this.f6041c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f6039a.onError(this.f6040b, this.f6041c);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$f, reason: collision with other inner class name */
        class RunnableC0100f implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f6043a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f6044b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f6045c;

            RunnableC0100f(c cVar, String str, Bundle bundle) {
                this.f6043a = cVar;
                this.f6044b = str;
                this.f6045c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f6043a.onError(this.f6044b, this.f6045c, null);
            }
        }

        class g implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f6047a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f6048b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f6049c;

            g(c cVar, String str, Bundle bundle) {
                this.f6047a = cVar;
                this.f6048b = str;
                this.f6049c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f6047a.onError(this.f6048b, this.f6049c, null);
            }
        }

        f(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            this.f6016a = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.f6018c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bVar.a(this);
            this.f6017b = android.support.v4.media.a.createBrowser(context, componentName, bVar.f6011a, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void connect() {
            android.support.v4.media.a.connect(this.f6017b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void disconnect() {
            Messenger messenger;
            k kVar = this.f6022g;
            if (kVar != null && (messenger = this.f6023h) != null) {
                try {
                    kVar.h(messenger);
                } catch (RemoteException unused) {
                }
            }
            android.support.v4.media.a.disconnect(this.f6017b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public Bundle getExtras() {
            return android.support.v4.media.a.getExtras(this.f6017b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void getItem(String str, d dVar) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            }
            if (dVar == null) {
                throw new IllegalArgumentException("cb is null");
            }
            if (!android.support.v4.media.a.isConnected(this.f6017b)) {
                this.f6019d.post(new a(dVar, str));
                return;
            }
            if (this.f6022g == null) {
                this.f6019d.post(new b(dVar, str));
                return;
            }
            try {
                this.f6022g.b(str, new ItemReceiver(str, dVar, this.f6019d), this.f6023h);
            } catch (RemoteException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Remote error getting media item: ");
                sb.append(str);
                this.f6019d.post(new c(dVar, str));
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public Bundle getNotifyChildrenChangedOptions() {
            return this.f6025j;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public String getRoot() {
            return android.support.v4.media.a.getRoot(this.f6017b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public ComponentName getServiceComponent() {
            return android.support.v4.media.a.getServiceComponent(this.f6017b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public MediaSessionCompat.Token getSessionToken() {
            if (this.f6024i == null) {
                this.f6024i = MediaSessionCompat.Token.fromToken(android.support.v4.media.a.getSessionToken(this.f6017b));
            }
            return this.f6024i;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public boolean isConnected() {
            return android.support.v4.media.a.isConnected(this.f6017b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.a
        public void onConnected() {
            Bundle extras = android.support.v4.media.a.getExtras(this.f6017b);
            if (extras == null) {
                return;
            }
            this.f6021f = extras.getInt("extra_service_version", 0);
            IBinder binder = androidx.core.app.h.getBinder(extras, "extra_messenger");
            if (binder != null) {
                this.f6022g = new k(binder, this.f6018c);
                Messenger messenger = new Messenger(this.f6019d);
                this.f6023h = messenger;
                this.f6019d.a(messenger);
                try {
                    this.f6022g.c(this.f6016a, this.f6023h);
                } catch (RemoteException unused) {
                }
            }
            android.support.v4.media.session.b bVarAsInterface = b.a.asInterface(androidx.core.app.h.getBinder(extras, "extra_session_binder"));
            if (bVarAsInterface != null) {
                this.f6024i = MediaSessionCompat.Token.fromToken(android.support.v4.media.a.getSessionToken(this.f6017b), bVarAsInterface);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.a
        public void onConnectionFailed() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.a
        public void onConnectionSuspended() {
            this.f6022g = null;
            this.f6023h = null;
            this.f6024i = null;
            this.f6019d.a(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.i
        public void onLoadChildren(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.f6023h != messenger) {
                return;
            }
            l lVar = (l) this.f6020e.get(str);
            if (lVar == null) {
                if (MediaBrowserCompat.f5997b) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onLoadChildren for id that isn't subscribed id=");
                    sb.append(str);
                    return;
                }
                return;
            }
            m callback = lVar.getCallback(bundle);
            if (callback != null) {
                if (bundle == null) {
                    if (list == null) {
                        callback.onError(str);
                        return;
                    }
                    this.f6025j = bundle2;
                    callback.onChildrenLoaded(str, list);
                    this.f6025j = null;
                    return;
                }
                if (list == null) {
                    callback.onError(str, bundle);
                    return;
                }
                this.f6025j = bundle2;
                callback.onChildrenLoaded(str, list, bundle);
                this.f6025j = null;
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.i
        public void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void search(String str, Bundle bundle, j jVar) {
            if (!isConnected()) {
                throw new IllegalStateException("search() called while not connected");
            }
            if (this.f6022g == null) {
                this.f6019d.post(new d(jVar, str, bundle));
                return;
            }
            try {
                this.f6022g.e(str, bundle, new SearchResultReceiver(str, bundle, jVar, this.f6019d), this.f6023h);
            } catch (RemoteException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Remote error searching items with query: ");
                sb.append(str);
                this.f6019d.post(new e(jVar, str, bundle));
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void sendCustomAction(String str, Bundle bundle, c cVar) {
            if (!isConnected()) {
                throw new IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");
            }
            if (this.f6022g == null && cVar != null) {
                this.f6019d.post(new RunnableC0100f(cVar, str, bundle));
            }
            try {
                this.f6022g.f(str, bundle, new CustomActionResultReceiver(str, bundle, cVar, this.f6019d), this.f6023h);
            } catch (RemoteException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Remote error sending a custom action: action=");
                sb.append(str);
                sb.append(", extras=");
                sb.append(bundle);
                if (cVar != null) {
                    this.f6019d.post(new g(cVar, str, bundle));
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void subscribe(String str, Bundle bundle, m mVar) {
            l lVar = (l) this.f6020e.get(str);
            if (lVar == null) {
                lVar = new l();
                this.f6020e.put(str, lVar);
            }
            mVar.a(lVar);
            Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
            lVar.putCallback(bundle2, mVar);
            k kVar = this.f6022g;
            if (kVar == null) {
                android.support.v4.media.a.subscribe(this.f6017b, str, mVar.f6055a);
                return;
            }
            try {
                kVar.a(str, mVar.f6056b, bundle2, this.f6023h);
            } catch (RemoteException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Remote error subscribing media item: ");
                sb.append(str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void unsubscribe(String str, m mVar) {
            l lVar = (l) this.f6020e.get(str);
            if (lVar == null) {
                return;
            }
            k kVar = this.f6022g;
            if (kVar != null) {
                try {
                    if (mVar == null) {
                        kVar.d(str, null, this.f6023h);
                    } else {
                        List<m> callbacks = lVar.getCallbacks();
                        List<Bundle> optionsList = lVar.getOptionsList();
                        for (int size = callbacks.size() - 1; size >= 0; size--) {
                            if (callbacks.get(size) == mVar) {
                                this.f6022g.d(str, mVar.f6056b, this.f6023h);
                                callbacks.remove(size);
                                optionsList.remove(size);
                            }
                        }
                    }
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("removeSubscription failed with RemoteException parentId=");
                    sb.append(str);
                }
            } else if (mVar == null) {
                android.support.v4.media.a.unsubscribe(this.f6017b, str);
            } else {
                List<m> callbacks2 = lVar.getCallbacks();
                List<Bundle> optionsList2 = lVar.getOptionsList();
                for (int size2 = callbacks2.size() - 1; size2 >= 0; size2--) {
                    if (callbacks2.get(size2) == mVar) {
                        callbacks2.remove(size2);
                        optionsList2.remove(size2);
                    }
                }
                if (callbacks2.size() == 0) {
                    android.support.v4.media.a.unsubscribe(this.f6017b, str);
                }
            }
            if (lVar.isEmpty() || mVar == null) {
                this.f6020e.remove(str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.i
        public void onConnectionFailed(Messenger messenger) {
        }
    }

    static class g extends f {
        g(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f, android.support.v4.media.MediaBrowserCompat.e
        public void getItem(String str, d dVar) {
            if (this.f6022g == null) {
                android.support.v4.media.b.getItem(this.f6017b, str, dVar.f6014a);
            } else {
                super.getItem(str, dVar);
            }
        }
    }

    static class h extends g {
        h(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f, android.support.v4.media.MediaBrowserCompat.e
        public void subscribe(String str, Bundle bundle, m mVar) {
            if (this.f6022g != null && this.f6021f >= 2) {
                super.subscribe(str, bundle, mVar);
            } else if (bundle == null) {
                android.support.v4.media.a.subscribe(this.f6017b, str, mVar.f6055a);
            } else {
                android.support.v4.media.c.subscribe(this.f6017b, str, bundle, mVar.f6055a);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f, android.support.v4.media.MediaBrowserCompat.e
        public void unsubscribe(String str, m mVar) {
            if (this.f6022g != null && this.f6021f >= 2) {
                super.unsubscribe(str, mVar);
            } else if (mVar == null) {
                android.support.v4.media.a.unsubscribe(this.f6017b, str);
            } else {
                android.support.v4.media.c.unsubscribe(this.f6017b, str, mVar.f6055a);
            }
        }
    }

    interface i {
        void onConnectionFailed(Messenger messenger);

        void onLoadChildren(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);

        void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    public static abstract class j {
        public void onError(String str, Bundle bundle) {
        }

        public void onSearchResult(String str, Bundle bundle, List<MediaItem> list) {
        }
    }

    private static class k {

        /* renamed from: a, reason: collision with root package name */
        private Messenger f6051a;

        /* renamed from: b, reason: collision with root package name */
        private Bundle f6052b;

        public k(IBinder iBinder, Bundle bundle) {
            this.f6051a = new Messenger(iBinder);
            this.f6052b = bundle;
        }

        private void g(int i8, Bundle bundle, Messenger messenger) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i8;
            messageObtain.arg1 = 1;
            messageObtain.setData(bundle);
            messageObtain.replyTo = messenger;
            this.f6051a.send(messageObtain);
        }

        void a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            androidx.core.app.h.putBinder(bundle2, "data_callback_token", iBinder);
            bundle2.putBundle("data_options", bundle);
            g(3, bundle2, messenger);
        }

        void b(String str, C5298b c5298b, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_media_item_id", str);
            bundle.putParcelable("data_result_receiver", c5298b);
            g(5, bundle, messenger);
        }

        void c(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putBundle("data_root_hints", this.f6052b);
            g(6, bundle, messenger);
        }

        void d(String str, IBinder iBinder, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_media_item_id", str);
            androidx.core.app.h.putBinder(bundle, "data_callback_token", iBinder);
            g(4, bundle, messenger);
        }

        void e(String str, Bundle bundle, C5298b c5298b, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_search_query", str);
            bundle2.putBundle("data_search_extras", bundle);
            bundle2.putParcelable("data_result_receiver", c5298b);
            g(8, bundle2, messenger);
        }

        void f(String str, Bundle bundle, C5298b c5298b, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_custom_action", str);
            bundle2.putBundle("data_custom_action_extras", bundle);
            bundle2.putParcelable("data_result_receiver", c5298b);
            g(9, bundle2, messenger);
        }

        void h(Messenger messenger) throws RemoteException {
            g(7, null, messenger);
        }
    }

    private static class l {

        /* renamed from: a, reason: collision with root package name */
        private final List f6053a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final List f6054b = new ArrayList();

        public m getCallback(Bundle bundle) {
            for (int i8 = 0; i8 < this.f6054b.size(); i8++) {
                if (androidx.media.b.areSameOptions((Bundle) this.f6054b.get(i8), bundle)) {
                    return (m) this.f6053a.get(i8);
                }
            }
            return null;
        }

        public List<m> getCallbacks() {
            return this.f6053a;
        }

        public List<Bundle> getOptionsList() {
            return this.f6054b;
        }

        public boolean isEmpty() {
            return this.f6053a.isEmpty();
        }

        public void putCallback(Bundle bundle, m mVar) {
            for (int i8 = 0; i8 < this.f6054b.size(); i8++) {
                if (androidx.media.b.areSameOptions((Bundle) this.f6054b.get(i8), bundle)) {
                    this.f6053a.set(i8, mVar);
                    return;
                }
            }
            this.f6053a.add(mVar);
            this.f6054b.add(bundle);
        }
    }

    public static abstract class m {

        /* renamed from: a, reason: collision with root package name */
        final Object f6055a;

        /* renamed from: b, reason: collision with root package name */
        final IBinder f6056b = new Binder();

        /* renamed from: c, reason: collision with root package name */
        WeakReference f6057c;

        private class a implements a.d {
            a() {
            }

            List a(List list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i8 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
                int i9 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
                if (i8 == -1 && i9 == -1) {
                    return list;
                }
                int i10 = i9 * i8;
                int size = i10 + i9;
                if (i8 < 0 || i9 < 1 || i10 >= list.size()) {
                    return Collections.emptyList();
                }
                if (size > list.size()) {
                    size = list.size();
                }
                return list.subList(i10, size);
            }

            @Override // android.support.v4.media.a.d
            public void onChildrenLoaded(String str, List<?> list) {
                WeakReference weakReference = m.this.f6057c;
                l lVar = weakReference == null ? null : (l) weakReference.get();
                if (lVar == null) {
                    m.this.onChildrenLoaded(str, MediaItem.fromMediaItemList(list));
                    return;
                }
                List<MediaItem> listFromMediaItemList = MediaItem.fromMediaItemList(list);
                List<m> callbacks = lVar.getCallbacks();
                List<Bundle> optionsList = lVar.getOptionsList();
                for (int i8 = 0; i8 < callbacks.size(); i8++) {
                    Bundle bundle = optionsList.get(i8);
                    if (bundle == null) {
                        m.this.onChildrenLoaded(str, listFromMediaItemList);
                    } else {
                        m.this.onChildrenLoaded(str, a(listFromMediaItemList, bundle), bundle);
                    }
                }
            }

            @Override // android.support.v4.media.a.d
            public void onError(String str) {
                m.this.onError(str);
            }
        }

        private class b extends a implements c.a {
            b() {
                super();
            }

            @Override // android.support.v4.media.c.a
            public void onChildrenLoaded(String str, List<?> list, Bundle bundle) {
                m.this.onChildrenLoaded(str, MediaItem.fromMediaItemList(list), bundle);
            }

            @Override // android.support.v4.media.c.a
            public void onError(String str, Bundle bundle) {
                m.this.onError(str, bundle);
            }
        }

        public m() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f6055a = android.support.v4.media.c.a(new b());
            } else {
                this.f6055a = android.support.v4.media.a.createSubscriptionCallback(new a());
            }
        }

        void a(l lVar) {
            this.f6057c = new WeakReference(lVar);
        }

        public void onChildrenLoaded(String str, List<MediaItem> list) {
        }

        public void onError(String str) {
        }

        public void onChildrenLoaded(String str, List<MediaItem> list, Bundle bundle) {
        }

        public void onError(String str, Bundle bundle) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, b bVar, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f5998a = new h(context, componentName, bVar, bundle);
        } else {
            this.f5998a = new g(context, componentName, bVar, bundle);
        }
    }

    public void connect() {
        this.f5998a.connect();
    }

    public void disconnect() {
        this.f5998a.disconnect();
    }

    public Bundle getExtras() {
        return this.f5998a.getExtras();
    }

    public void getItem(String str, d dVar) {
        this.f5998a.getItem(str, dVar);
    }

    public Bundle getNotifyChildrenChangedOptions() {
        return this.f5998a.getNotifyChildrenChangedOptions();
    }

    public String getRoot() {
        return this.f5998a.getRoot();
    }

    public ComponentName getServiceComponent() {
        return this.f5998a.getServiceComponent();
    }

    public MediaSessionCompat.Token getSessionToken() {
        return this.f5998a.getSessionToken();
    }

    public boolean isConnected() {
        return this.f5998a.isConnected();
    }

    public void search(String str, Bundle bundle, j jVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("query cannot be empty");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("callback cannot be null");
        }
        this.f5998a.search(str, bundle, jVar);
    }

    public void sendCustomAction(String str, Bundle bundle, c cVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("action cannot be empty");
        }
        this.f5998a.sendCustomAction(str, bundle, cVar);
    }

    public void subscribe(String str, m mVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (mVar == null) {
            throw new IllegalArgumentException("callback is null");
        }
        this.f5998a.subscribe(str, null, mVar);
    }

    public void unsubscribe(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        this.f5998a.unsubscribe(str, null);
    }

    public void unsubscribe(String str, m mVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (mVar != null) {
            this.f5998a.unsubscribe(str, mVar);
            return;
        }
        throw new IllegalArgumentException("callback is null");
    }

    public void subscribe(String str, Bundle bundle, m mVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (mVar == null) {
            throw new IllegalArgumentException("callback is null");
        }
        if (bundle != null) {
            this.f5998a.subscribe(str, bundle, mVar);
            return;
        }
        throw new IllegalArgumentException("options are null");
    }

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();
        public static final int FLAG_BROWSABLE = 1;
        public static final int FLAG_PLAYABLE = 2;

        /* renamed from: a, reason: collision with root package name */
        private final int f6004a;

        /* renamed from: b, reason: collision with root package name */
        private final MediaDescriptionCompat f6005b;

        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public MediaItem[] newArray(int i8) {
                return new MediaItem[i8];
            }
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i8) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.getMediaId())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.f6004a = i8;
            this.f6005b = mediaDescriptionCompat;
        }

        public static MediaItem fromMediaItem(Object obj) {
            if (obj == null) {
                return null;
            }
            return new MediaItem(MediaDescriptionCompat.fromMediaDescription(a.c.getDescription(obj)), a.c.getFlags(obj));
        }

        public static List<MediaItem> fromMediaItemList(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(fromMediaItem(it.next()));
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public MediaDescriptionCompat getDescription() {
            return this.f6005b;
        }

        public int getFlags() {
            return this.f6004a;
        }

        public String getMediaId() {
            return this.f6005b.getMediaId();
        }

        public boolean isBrowsable() {
            return (this.f6004a & 1) != 0;
        }

        public boolean isPlayable() {
            return (this.f6004a & 2) != 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.f6004a + ", mDescription=" + this.f6005b + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            parcel.writeInt(this.f6004a);
            this.f6005b.writeToParcel(parcel, i8);
        }

        MediaItem(Parcel parcel) {
            this.f6004a = parcel.readInt();
            this.f6005b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}

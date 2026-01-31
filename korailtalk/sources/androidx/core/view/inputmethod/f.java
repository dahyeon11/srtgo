package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final c f9235a;

    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f9237a;

        /* renamed from: b, reason: collision with root package name */
        private final ClipDescription f9238b;

        /* renamed from: c, reason: collision with root package name */
        private final Uri f9239c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f9237a = uri;
            this.f9238b = clipDescription;
            this.f9239c = uri2;
        }

        @Override // androidx.core.view.inputmethod.f.c
        public Uri getContentUri() {
            return this.f9237a;
        }

        @Override // androidx.core.view.inputmethod.f.c
        public ClipDescription getDescription() {
            return this.f9238b;
        }

        @Override // androidx.core.view.inputmethod.f.c
        public Object getInputContentInfo() {
            return null;
        }

        @Override // androidx.core.view.inputmethod.f.c
        public Uri getLinkUri() {
            return this.f9239c;
        }

        @Override // androidx.core.view.inputmethod.f.c
        public void releasePermission() {
        }

        @Override // androidx.core.view.inputmethod.f.c
        public void requestPermission() {
        }
    }

    private interface c {
        Uri getContentUri();

        ClipDescription getDescription();

        Object getInputContentInfo();

        Uri getLinkUri();

        void releasePermission();

        void requestPermission();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f9235a = new a(uri, clipDescription, uri2);
        } else {
            this.f9235a = new b(uri, clipDescription, uri2);
        }
    }

    public static f wrap(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new f(new a(obj));
        }
        return null;
    }

    public Uri getContentUri() {
        return this.f9235a.getContentUri();
    }

    public ClipDescription getDescription() {
        return this.f9235a.getDescription();
    }

    public Uri getLinkUri() {
        return this.f9235a.getLinkUri();
    }

    public void releasePermission() {
        this.f9235a.releasePermission();
    }

    public void requestPermission() {
        this.f9235a.requestPermission();
    }

    public Object unwrap() {
        return this.f9235a.getInputContentInfo();
    }

    private static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final InputContentInfo f9236a;

        a(Object obj) {
            this.f9236a = (InputContentInfo) obj;
        }

        @Override // androidx.core.view.inputmethod.f.c
        public Uri getContentUri() {
            return this.f9236a.getContentUri();
        }

        @Override // androidx.core.view.inputmethod.f.c
        public ClipDescription getDescription() {
            return this.f9236a.getDescription();
        }

        @Override // androidx.core.view.inputmethod.f.c
        public Object getInputContentInfo() {
            return this.f9236a;
        }

        @Override // androidx.core.view.inputmethod.f.c
        public Uri getLinkUri() {
            return this.f9236a.getLinkUri();
        }

        @Override // androidx.core.view.inputmethod.f.c
        public void releasePermission() {
            this.f9236a.releasePermission();
        }

        @Override // androidx.core.view.inputmethod.f.c
        public void requestPermission() {
            this.f9236a.requestPermission();
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f9236a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private f(c cVar) {
        this.f9235a = cVar;
    }
}

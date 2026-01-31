package androidx.core.view.inputmethod;

import Z.h;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.appcompat.widget.AbstractC0859t;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0951e;

/* loaded from: classes.dex */
public final class e {
    public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;

    class a extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ d f9233a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z8, d dVar) {
            super(inputConnection, z8);
            this.f9233a = dVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i8, Bundle bundle) {
            if (this.f9233a.onCommitContent(f.wrap(inputContentInfo), i8, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i8, bundle);
        }
    }

    class b extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ d f9234a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InputConnection inputConnection, boolean z8, d dVar) {
            super(inputConnection, z8);
            this.f9234a = dVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (e.c(str, bundle, this.f9234a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    static class c {
        static boolean a(InputConnection inputConnection, InputContentInfo inputContentInfo, int i8, Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i8, bundle);
        }
    }

    public interface d {
        boolean onCommitContent(f fVar, int i8, Bundle bundle);
    }

    @Deprecated
    public e() {
    }

    private static d b(final View view) {
        h.checkNotNull(view);
        return new d() { // from class: androidx.core.view.inputmethod.d
            @Override // androidx.core.view.inputmethod.e.d
            public final boolean onCommitContent(f fVar, int i8, Bundle bundle) {
                return e.d(view, fVar, i8, bundle);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    static boolean c(String str, Bundle bundle, d dVar) throws Throwable {
        boolean z8;
        ResultReceiver resultReceiver;
        ResultReceiver resultReceiver2;
        ?? OnCommitContent = 0;
        OnCommitContent = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z8 = false;
        } else {
            if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                return false;
            }
            z8 = true;
        }
        try {
            resultReceiver2 = (ResultReceiver) bundle.getParcelable(z8 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
        } catch (Throwable th) {
            th = th;
            resultReceiver = null;
        }
        try {
            Uri uri = (Uri) bundle.getParcelable(z8 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
            ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z8 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
            Uri uri2 = (Uri) bundle.getParcelable(z8 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
            int i8 = bundle.getInt(z8 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
            Bundle bundle2 = (Bundle) bundle.getParcelable(z8 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
            if (uri != null && clipDescription != null) {
                OnCommitContent = dVar.onCommitContent(new f(uri, clipDescription, uri2), i8, bundle2);
            }
            if (resultReceiver2 != 0) {
                resultReceiver2.send(OnCommitContent, null);
            }
            return OnCommitContent;
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = resultReceiver2;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            }
            throw th;
        }
    }

    public static boolean commitContent(InputConnection inputConnection, EditorInfo editorInfo, f fVar, int i8, Bundle bundle) {
        boolean z8;
        if (Build.VERSION.SDK_INT >= 25) {
            return c.a(inputConnection, AbstractC0859t.a(fVar.unwrap()), i8, bundle);
        }
        int iA = androidx.core.view.inputmethod.c.a(editorInfo);
        if (iA != 2) {
            z8 = false;
            if (iA != 3 && iA != 4) {
                return false;
            }
        } else {
            z8 = true;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(z8 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI", fVar.getContentUri());
        bundle2.putParcelable(z8 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION", fVar.getDescription());
        bundle2.putParcelable(z8 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI", fVar.getLinkUri());
        bundle2.putInt(z8 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS", i8);
        bundle2.putParcelable(z8 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS", bundle);
        return inputConnection.performPrivateCommand(z8 ? "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT" : "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", bundle2);
    }

    @Deprecated
    public static InputConnection createWrapper(InputConnection inputConnection, EditorInfo editorInfo, d dVar) {
        Z.c.requireNonNull(inputConnection, "inputConnection must be non-null");
        Z.c.requireNonNull(editorInfo, "editorInfo must be non-null");
        Z.c.requireNonNull(dVar, "onCommitContentListener must be non-null");
        return Build.VERSION.SDK_INT >= 25 ? new a(inputConnection, false, dVar) : androidx.core.view.inputmethod.c.getContentMimeTypes(editorInfo).length == 0 ? inputConnection : new b(inputConnection, false, dVar);
    }

    public static /* synthetic */ boolean d(View view, f fVar, int i8, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i8 & 1) != 0) {
            try {
                fVar.requestPermission();
                Parcelable parcelable = (Parcelable) fVar.unwrap();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e8) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e8);
                return false;
            }
        }
        return AbstractC0985p0.performReceiveContent(view, new C0951e.b(new ClipData(fVar.getDescription(), new ClipData.Item(fVar.getContentUri())), 2).setLinkUri(fVar.getLinkUri()).setExtras(bundle).build()) == null;
    }

    public static InputConnection createWrapper(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return createWrapper(inputConnection, editorInfo, b(view));
    }
}

package androidx.core.view.contentcapture;

import a0.C0823b;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.B0;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Object f9178a;

    /* renamed from: b, reason: collision with root package name */
    private final View f9179b;

    private static class a {
        static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    /* renamed from: androidx.core.view.contentcapture.b$b, reason: collision with other inner class name */
    private static class C0145b {
        static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j8) {
            return contentCaptureSession.newAutofillId(autofillId, j8);
        }

        static ViewStructure b(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        static ViewStructure c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j8) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j8);
        }

        static void d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }

        public static void notifyViewTextChanged(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }
    }

    private static class c {
        static void a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    private b(ContentCaptureSession contentCaptureSession, View view) {
        this.f9178a = contentCaptureSession;
        this.f9179b = view;
    }

    public static b toContentCaptureSessionCompat(ContentCaptureSession contentCaptureSession, View view) {
        return new b(contentCaptureSession, view);
    }

    public AutofillId newAutofillId(long j8) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionA = androidx.core.view.contentcapture.a.a(this.f9178a);
        C0823b autofillId = AbstractC0985p0.getAutofillId(this.f9179b);
        Objects.requireNonNull(autofillId);
        return C0145b.a(contentCaptureSessionA, autofillId.toAutofillId(), j8);
    }

    public B0 newVirtualViewStructure(AutofillId autofillId, long j8) {
        if (Build.VERSION.SDK_INT >= 29) {
            return B0.toViewStructureCompat(C0145b.c(androidx.core.view.contentcapture.a.a(this.f9178a), autofillId, j8));
        }
        return null;
    }

    public void notifyViewTextChanged(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            C0145b.notifyViewTextChanged(androidx.core.view.contentcapture.a.a(this.f9178a), autofillId, charSequence);
        }
    }

    public void notifyViewsAppeared(List<ViewStructure> list) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 34) {
            c.a(androidx.core.view.contentcapture.a.a(this.f9178a), list);
            return;
        }
        if (i8 >= 29) {
            ViewStructure viewStructureB = C0145b.b(androidx.core.view.contentcapture.a.a(this.f9178a), this.f9179b);
            a.a(viewStructureB).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            C0145b.d(androidx.core.view.contentcapture.a.a(this.f9178a), viewStructureB);
            for (int i9 = 0; i9 < list.size(); i9++) {
                C0145b.d(androidx.core.view.contentcapture.a.a(this.f9178a), list.get(i9));
            }
            ViewStructure viewStructureB2 = C0145b.b(androidx.core.view.contentcapture.a.a(this.f9178a), this.f9179b);
            a.a(viewStructureB2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            C0145b.d(androidx.core.view.contentcapture.a.a(this.f9178a), viewStructureB2);
        }
    }

    public void notifyViewsDisappeared(long[] jArr) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 34) {
            ContentCaptureSession contentCaptureSessionA = androidx.core.view.contentcapture.a.a(this.f9178a);
            C0823b autofillId = AbstractC0985p0.getAutofillId(this.f9179b);
            Objects.requireNonNull(autofillId);
            C0145b.e(contentCaptureSessionA, autofillId.toAutofillId(), jArr);
            return;
        }
        if (i8 >= 29) {
            ViewStructure viewStructureB = C0145b.b(androidx.core.view.contentcapture.a.a(this.f9178a), this.f9179b);
            a.a(viewStructureB).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            C0145b.d(androidx.core.view.contentcapture.a.a(this.f9178a), viewStructureB);
            ContentCaptureSession contentCaptureSessionA2 = androidx.core.view.contentcapture.a.a(this.f9178a);
            C0823b autofillId2 = AbstractC0985p0.getAutofillId(this.f9179b);
            Objects.requireNonNull(autofillId2);
            C0145b.e(contentCaptureSessionA2, autofillId2.toAutofillId(), jArr);
            ViewStructure viewStructureB2 = C0145b.b(androidx.core.view.contentcapture.a.a(this.f9178a), this.f9179b);
            a.a(viewStructureB2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            C0145b.d(androidx.core.view.contentcapture.a.a(this.f9178a), viewStructureB2);
        }
    }

    public ContentCaptureSession toContentCaptureSession() {
        return androidx.core.view.contentcapture.a.a(this.f9178a);
    }
}

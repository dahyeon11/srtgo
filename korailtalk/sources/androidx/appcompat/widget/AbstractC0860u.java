package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.TextView;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0951e;
import androidx.core.view.inputmethod.e;

/* renamed from: androidx.appcompat.widget.u */
/* loaded from: classes.dex */
abstract class AbstractC0860u {

    /* renamed from: androidx.appcompat.widget.u$a */
    class a implements e.d {

        /* renamed from: a */
        final /* synthetic */ View f7253a;

        a(View view) {
            this.f7253a = view;
        }

        @Override // androidx.core.view.inputmethod.e.d
        public boolean onCommitContent(androidx.core.view.inputmethod.f fVar, int i8, Bundle bundle) {
            if (Build.VERSION.SDK_INT >= 25 && (i8 & 1) != 0) {
                try {
                    fVar.requestPermission();
                    InputContentInfo inputContentInfoA = AbstractC0859t.a(fVar.unwrap());
                    bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                    bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfoA);
                } catch (Exception e8) {
                    Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e8);
                    return false;
                }
            }
            return AbstractC0985p0.performReceiveContent(this.f7253a, new C0951e.b(new ClipData(fVar.getDescription(), new ClipData.Item(fVar.getContentUri())), 2).setLinkUri(fVar.getLinkUri()).setExtras(bundle).build()) == null;
        }
    }

    /* renamed from: androidx.appcompat.widget.u$b */
    private static final class b {
        static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                AbstractC0985p0.performReceiveContent(textView, new C0951e.b(dragEvent.getClipData(), 3).build());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        static boolean b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            AbstractC0985p0.performReceiveContent(view, new C0951e.b(dragEvent.getClipData(), 3).build());
            return true;
        }
    }

    static e.d a(View view) {
        return new a(view);
    }

    static boolean b(View view, DragEvent dragEvent) {
        if (dragEvent.getLocalState() == null && AbstractC0985p0.getOnReceiveContentMimeTypes(view) != null) {
            Activity activityD = d(view);
            if (activityD == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't handle drop: no activity: view=");
                sb.append(view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? b.a(dragEvent, (TextView) view, activityD) : b.b(dragEvent, view, activityD);
            }
        }
        return false;
    }

    static boolean c(TextView textView, int i8) {
        if ((i8 != 16908322 && i8 != 16908337) || AbstractC0985p0.getOnReceiveContentMimeTypes(textView) == null) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            AbstractC0985p0.performReceiveContent(textView, new C0951e.b(primaryClip, 1).setFlags(i8 != 16908322 ? 1 : 0).build());
        }
        return true;
    }

    static Activity d(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}

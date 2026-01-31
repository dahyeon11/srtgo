package z4;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0923a;
import androidx.core.view.accessibility.H;

/* renamed from: z4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6627a {

    /* renamed from: z4.a$a, reason: collision with other inner class name */
    class C0438a extends C0923a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f37881d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f37882e;

        C0438a(String str, String str2) {
            this.f37881d = str;
            this.f37882e = str2;
        }

        @Override // androidx.core.view.C0923a
        public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.H h8) {
            super.onInitializeAccessibilityNodeInfo(view, h8);
            h8.setContentDescription(this.f37881d);
            h8.setRoleDescription(this.f37882e);
        }
    }

    /* renamed from: z4.a$b */
    class b extends C0923a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f37883d;

        b(String str) {
            this.f37883d = str;
        }

        @Override // androidx.core.view.C0923a
        public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.H h8) {
            super.onInitializeAccessibilityNodeInfo(view, h8);
            h8.setRoleDescription(this.f37883d);
        }
    }

    /* renamed from: z4.a$c */
    class c extends C0923a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f37884d;

        c(String str) {
            this.f37884d = str;
        }

        @Override // androidx.core.view.C0923a
        public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.H h8) {
            super.onInitializeAccessibilityNodeInfo(view, h8);
            h8.addAction(new H.a(16, this.f37884d));
        }
    }

    /* renamed from: z4.a$d */
    class d extends C0923a {
        d() {
        }

        @Override // androidx.core.view.C0923a
        public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.H h8) {
            super.onInitializeAccessibilityNodeInfo(view, h8);
            h8.removeAction(new H.a(16, ""));
        }
    }

    public static void accessibilityTraversalBefore(Context context, View view, int i8) {
        if (isAccessibilityEnabled(context)) {
            view.setAccessibilityTraversalBefore(i8);
        }
    }

    public static void actionAccessibilityFocus(View view) {
        AbstractC0985p0.performAccessibilityAction(view, 64, null);
    }

    public static void addClickEvent(View view, String str) {
        AbstractC0985p0.setAccessibilityDelegate(view, new c(str));
    }

    public static boolean isAccessibilityEnabled(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public static void removeClickEvent(View view) {
        AbstractC0985p0.setAccessibilityDelegate(view, new d());
    }

    public static void setAccessibilityTraversalAfter(Context context, View view, int i8) {
        if (isAccessibilityEnabled(context)) {
            view.setAccessibilityTraversalAfter(i8);
        }
    }

    public static void setDescription(View view, String str, String str2) {
        AbstractC0985p0.setAccessibilityDelegate(view, new C0438a(str, str2));
    }

    public static void setEditTextDescription(Context context, EditText editText) {
        setEditTextDescription(context, editText, "");
    }

    public static void setRoleDescription(View view, String str) {
        AbstractC0985p0.setAccessibilityDelegate(view, new b(str));
    }

    public static void setEditTextDescription(Context context, EditText editText, String str) {
        if (isAccessibilityEnabled(context)) {
            editText.setHint("");
            if (str.isEmpty()) {
                return;
            }
            editText.setContentDescription(str);
        }
    }
}

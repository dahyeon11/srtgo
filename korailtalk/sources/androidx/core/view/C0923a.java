package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.C0926a;
import androidx.core.view.accessibility.H;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.core.view.a */
/* loaded from: classes.dex */
public class C0923a {

    /* renamed from: c */
    private static final View.AccessibilityDelegate f9148c = new View.AccessibilityDelegate();

    /* renamed from: a */
    private final View.AccessibilityDelegate f9149a;

    /* renamed from: b */
    private final View.AccessibilityDelegate f9150b;

    /* renamed from: androidx.core.view.a$a */
    static final class C0142a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final C0923a f9151a;

        C0142a(C0923a c0923a) {
            this.f9151a = c0923a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f9151a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            androidx.core.view.accessibility.M accessibilityNodeProvider = this.f9151a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.getProvider();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f9151a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            androidx.core.view.accessibility.H hWrap = androidx.core.view.accessibility.H.wrap(accessibilityNodeInfo);
            hWrap.setScreenReaderFocusable(AbstractC0985p0.isScreenReaderFocusable(view));
            hWrap.setHeading(AbstractC0985p0.isAccessibilityHeading(view));
            hWrap.setPaneTitle(AbstractC0985p0.getAccessibilityPaneTitle(view));
            hWrap.setStateDescription(AbstractC0985p0.getStateDescription(view));
            this.f9151a.onInitializeAccessibilityNodeInfo(view, hWrap);
            hWrap.addSpansToExtras(accessibilityNodeInfo.getText(), view);
            List listA = C0923a.a(view);
            for (int i8 = 0; i8 < listA.size(); i8++) {
                hWrap.addAction((H.a) listA.get(i8));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f9151a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f9151a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i8, Bundle bundle) {
            return this.f9151a.performAccessibilityAction(view, i8, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i8) {
            this.f9151a.sendAccessibilityEvent(view, i8);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f9151a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public C0923a() {
        this(f9148c);
    }

    static List a(View view) {
        List list = (List) view.getTag(U.e.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean c(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpans = androidx.core.view.accessibility.H.getClickableSpans(view.createAccessibilityNodeInfo().getText());
            for (int i8 = 0; clickableSpans != null && i8 < clickableSpans.length; i8++) {
                if (clickableSpan.equals(clickableSpans[i8])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean d(int i8, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(U.e.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i8)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!c(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    View.AccessibilityDelegate b() {
        return this.f9150b;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f9149a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public androidx.core.view.accessibility.M getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f9149a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new androidx.core.view.accessibility.M(accessibilityNodeProvider);
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f9149a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.H h8) {
        this.f9149a.onInitializeAccessibilityNodeInfo(view, h8.unwrap());
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f9149a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f9149a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i8, Bundle bundle) {
        List listA = a(view);
        boolean zPerformAccessibilityAction = false;
        int i9 = 0;
        while (true) {
            if (i9 >= listA.size()) {
                break;
            }
            H.a aVar = (H.a) listA.get(i9);
            if (aVar.getId() == i8) {
                zPerformAccessibilityAction = aVar.perform(view, bundle);
                break;
            }
            i9++;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f9149a.performAccessibilityAction(view, i8, bundle);
        }
        return (zPerformAccessibilityAction || i8 != U.e.accessibility_action_clickable_span || bundle == null) ? zPerformAccessibilityAction : d(bundle.getInt(C0926a.SPAN_ID, -1), view);
    }

    public void sendAccessibilityEvent(View view, int i8) {
        this.f9149a.sendAccessibilityEvent(view, i8);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f9149a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0923a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f9149a = accessibilityDelegate;
        this.f9150b = new C0142a(this);
    }
}

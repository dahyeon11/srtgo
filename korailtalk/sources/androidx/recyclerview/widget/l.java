package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0923a;
import androidx.core.view.accessibility.H;
import androidx.core.view.accessibility.M;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class l extends C0923a {

    /* renamed from: d, reason: collision with root package name */
    final RecyclerView f10616d;

    /* renamed from: e, reason: collision with root package name */
    private final a f10617e;

    public static class a extends C0923a {

        /* renamed from: d, reason: collision with root package name */
        final l f10618d;

        /* renamed from: e, reason: collision with root package name */
        private Map f10619e = new WeakHashMap();

        public a(l lVar) {
            this.f10618d = lVar;
        }

        @Override // androidx.core.view.C0923a
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C0923a c0923a = (C0923a) this.f10619e.get(view);
            return c0923a != null ? c0923a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        C0923a e(View view) {
            return (C0923a) this.f10619e.remove(view);
        }

        void f(View view) {
            C0923a accessibilityDelegate = AbstractC0985p0.getAccessibilityDelegate(view);
            if (accessibilityDelegate == null || accessibilityDelegate == this) {
                return;
            }
            this.f10619e.put(view, accessibilityDelegate);
        }

        @Override // androidx.core.view.C0923a
        public M getAccessibilityNodeProvider(View view) {
            C0923a c0923a = (C0923a) this.f10619e.get(view);
            return c0923a != null ? c0923a.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        @Override // androidx.core.view.C0923a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C0923a c0923a = (C0923a) this.f10619e.get(view);
            if (c0923a != null) {
                c0923a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0923a
        public void onInitializeAccessibilityNodeInfo(View view, H h8) {
            if (this.f10618d.e() || this.f10618d.f10616d.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, h8);
                return;
            }
            this.f10618d.f10616d.getLayoutManager().j(view, h8);
            C0923a c0923a = (C0923a) this.f10619e.get(view);
            if (c0923a != null) {
                c0923a.onInitializeAccessibilityNodeInfo(view, h8);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, h8);
            }
        }

        @Override // androidx.core.view.C0923a
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C0923a c0923a = (C0923a) this.f10619e.get(view);
            if (c0923a != null) {
                c0923a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0923a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0923a c0923a = (C0923a) this.f10619e.get(viewGroup);
            return c0923a != null ? c0923a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C0923a
        public boolean performAccessibilityAction(View view, int i8, Bundle bundle) {
            if (this.f10618d.e() || this.f10618d.f10616d.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i8, bundle);
            }
            C0923a c0923a = (C0923a) this.f10619e.get(view);
            if (c0923a != null) {
                if (c0923a.performAccessibilityAction(view, i8, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i8, bundle)) {
                return true;
            }
            return this.f10618d.f10616d.getLayoutManager().m(view, i8, bundle);
        }

        @Override // androidx.core.view.C0923a
        public void sendAccessibilityEvent(View view, int i8) {
            C0923a c0923a = (C0923a) this.f10619e.get(view);
            if (c0923a != null) {
                c0923a.sendAccessibilityEvent(view, i8);
            } else {
                super.sendAccessibilityEvent(view, i8);
            }
        }

        @Override // androidx.core.view.C0923a
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            C0923a c0923a = (C0923a) this.f10619e.get(view);
            if (c0923a != null) {
                c0923a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public l(RecyclerView recyclerView) {
        this.f10616d = recyclerView;
        C0923a itemDelegate = getItemDelegate();
        if (itemDelegate == null || !(itemDelegate instanceof a)) {
            this.f10617e = new a(this);
        } else {
            this.f10617e = (a) itemDelegate;
        }
    }

    boolean e() {
        return this.f10616d.hasPendingAdapterUpdates();
    }

    public C0923a getItemDelegate() {
        return this.f10617e;
    }

    @Override // androidx.core.view.C0923a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || e()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C0923a
    public void onInitializeAccessibilityNodeInfo(View view, H h8) {
        super.onInitializeAccessibilityNodeInfo(view, h8);
        if (e() || this.f10616d.getLayoutManager() == null) {
            return;
        }
        this.f10616d.getLayoutManager().i(h8);
    }

    @Override // androidx.core.view.C0923a
    public boolean performAccessibilityAction(View view, int i8, Bundle bundle) {
        if (super.performAccessibilityAction(view, i8, bundle)) {
            return true;
        }
        if (e() || this.f10616d.getLayoutManager() == null) {
            return false;
        }
        return this.f10616d.getLayoutManager().l(i8, bundle);
    }
}

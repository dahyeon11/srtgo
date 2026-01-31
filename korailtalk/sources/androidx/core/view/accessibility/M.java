package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class M {
    public static final int HOST_VIEW_ID = -1;

    /* renamed from: a, reason: collision with root package name */
    private final Object f9164a;

    static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        final M f9165a;

        a(M m8) {
            this.f9165a = m8;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i8) {
            H hCreateAccessibilityNodeInfo = this.f9165a.createAccessibilityNodeInfo(i8);
            if (hCreateAccessibilityNodeInfo == null) {
                return null;
            }
            return hCreateAccessibilityNodeInfo.unwrap();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i8) {
            List<H> listFindAccessibilityNodeInfosByText = this.f9165a.findAccessibilityNodeInfosByText(str, i8);
            if (listFindAccessibilityNodeInfosByText == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listFindAccessibilityNodeInfosByText.size();
            for (int i9 = 0; i9 < size; i9++) {
                arrayList.add(listFindAccessibilityNodeInfosByText.get(i9).unwrap());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i8) {
            H hFindFocus = this.f9165a.findFocus(i8);
            if (hFindFocus == null) {
                return null;
            }
            return hFindFocus.unwrap();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i8, int i9, Bundle bundle) {
            return this.f9165a.performAction(i8, i9, bundle);
        }
    }

    static class b extends a {
        b(M m8) {
            super(m8);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i8, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f9165a.addExtraDataToAccessibilityNodeInfo(i8, H.wrap(accessibilityNodeInfo), str, bundle);
        }
    }

    public M() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f9164a = new b(this);
        } else {
            this.f9164a = new a(this);
        }
    }

    public void addExtraDataToAccessibilityNodeInfo(int i8, H h8, String str, Bundle bundle) {
    }

    public H createAccessibilityNodeInfo(int i8) {
        return null;
    }

    public List<H> findAccessibilityNodeInfosByText(String str, int i8) {
        return null;
    }

    public H findFocus(int i8) {
        return null;
    }

    public Object getProvider() {
        return this.f9164a;
    }

    public boolean performAction(int i8, int i9, Bundle bundle) {
        return false;
    }

    public M(Object obj) {
        this.f9164a = obj;
    }
}

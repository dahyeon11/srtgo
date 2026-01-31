package androidx.core.view.accessibility;

import android.R;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.O;
import java.lang.ref.WeakReference;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class H {
    public static final int ACTION_ACCESSIBILITY_FOCUS = 64;
    public static final String ACTION_ARGUMENT_COLUMN_INT = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
    public static final String ACTION_ARGUMENT_DIRECTION_INT = "androidx.core.view.accessibility.action.ARGUMENT_DIRECTION_INT";
    public static final String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final String ACTION_ARGUMENT_HTML_ELEMENT_STRING = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final String ACTION_ARGUMENT_MOVE_WINDOW_X = "ACTION_ARGUMENT_MOVE_WINDOW_X";
    public static final String ACTION_ARGUMENT_MOVE_WINDOW_Y = "ACTION_ARGUMENT_MOVE_WINDOW_Y";
    public static final String ACTION_ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";
    public static final String ACTION_ARGUMENT_PROGRESS_VALUE = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
    public static final String ACTION_ARGUMENT_ROW_INT = "android.view.accessibility.action.ARGUMENT_ROW_INT";
    public static final String ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT = "androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT";
    public static final String ACTION_ARGUMENT_SELECTION_END_INT = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final String ACTION_ARGUMENT_SELECTION_START_INT = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final String ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    public static final int ACTION_CLEAR_ACCESSIBILITY_FOCUS = 128;
    public static final int ACTION_CLEAR_FOCUS = 2;
    public static final int ACTION_CLEAR_SELECTION = 8;
    public static final int ACTION_CLICK = 16;
    public static final int ACTION_COLLAPSE = 524288;
    public static final int ACTION_COPY = 16384;
    public static final int ACTION_CUT = 65536;
    public static final int ACTION_DISMISS = 1048576;
    public static final int ACTION_EXPAND = 262144;
    public static final int ACTION_FOCUS = 1;
    public static final int ACTION_LONG_CLICK = 32;
    public static final int ACTION_NEXT_AT_MOVEMENT_GRANULARITY = 256;
    public static final int ACTION_NEXT_HTML_ELEMENT = 1024;
    public static final int ACTION_PASTE = 32768;
    public static final int ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = 512;
    public static final int ACTION_PREVIOUS_HTML_ELEMENT = 2048;
    public static final int ACTION_SCROLL_BACKWARD = 8192;
    public static final int ACTION_SCROLL_FORWARD = 4096;
    public static final int ACTION_SELECT = 4;
    public static final int ACTION_SET_SELECTION = 131072;
    public static final int ACTION_SET_TEXT = 2097152;
    public static final String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";
    public static final int EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH = 20000;
    public static final String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";
    public static final String EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";
    public static final int FLAG_PREFETCH_ANCESTORS = 1;
    public static final int FLAG_PREFETCH_DESCENDANTS_BREADTH_FIRST = 16;
    public static final int FLAG_PREFETCH_DESCENDANTS_DEPTH_FIRST = 8;
    public static final int FLAG_PREFETCH_DESCENDANTS_HYBRID = 4;
    public static final int FLAG_PREFETCH_SIBLINGS = 2;
    public static final int FLAG_PREFETCH_UNINTERRUPTIBLE = 32;
    public static final int FOCUS_ACCESSIBILITY = 2;
    public static final int FOCUS_INPUT = 1;
    public static final int MAX_NUMBER_OF_PREFETCHED_NODES = 50;
    public static final int MOVEMENT_GRANULARITY_CHARACTER = 1;
    public static final int MOVEMENT_GRANULARITY_LINE = 4;
    public static final int MOVEMENT_GRANULARITY_PAGE = 16;
    public static final int MOVEMENT_GRANULARITY_PARAGRAPH = 8;
    public static final int MOVEMENT_GRANULARITY_WORD = 2;

    /* renamed from: c */
    private static int f9153c;

    /* renamed from: a */
    private final AccessibilityNodeInfo f9154a;
    public int mParentVirtualDescendantId = -1;

    /* renamed from: b */
    private int f9155b = -1;

    public static class a {
        public static final a ACTION_CONTEXT_CLICK;
        public static final a ACTION_DRAG_CANCEL;
        public static final a ACTION_DRAG_DROP;
        public static final a ACTION_DRAG_START;
        public static final a ACTION_HIDE_TOOLTIP;
        public static final a ACTION_IME_ENTER;
        public static final a ACTION_MOVE_WINDOW;
        public static final a ACTION_PAGE_DOWN;
        public static final a ACTION_PAGE_LEFT;
        public static final a ACTION_PAGE_RIGHT;
        public static final a ACTION_PAGE_UP;
        public static final a ACTION_PRESS_AND_HOLD;
        public static final a ACTION_SCROLL_DOWN;
        public static final a ACTION_SCROLL_IN_DIRECTION;
        public static final a ACTION_SCROLL_LEFT;
        public static final a ACTION_SCROLL_RIGHT;
        public static final a ACTION_SCROLL_TO_POSITION;
        public static final a ACTION_SCROLL_UP;
        public static final a ACTION_SET_PROGRESS;
        public static final a ACTION_SHOW_ON_SCREEN;
        public static final a ACTION_SHOW_TEXT_SUGGESTIONS;
        public static final a ACTION_SHOW_TOOLTIP;

        /* renamed from: a */
        final Object f9156a;

        /* renamed from: b */
        private final int f9157b;

        /* renamed from: c */
        private final Class f9158c;

        /* renamed from: d */
        protected final O f9159d;
        public static final a ACTION_FOCUS = new a(1, null);
        public static final a ACTION_CLEAR_FOCUS = new a(2, null);
        public static final a ACTION_SELECT = new a(4, null);
        public static final a ACTION_CLEAR_SELECTION = new a(8, null);
        public static final a ACTION_CLICK = new a(16, null);
        public static final a ACTION_LONG_CLICK = new a(32, null);
        public static final a ACTION_ACCESSIBILITY_FOCUS = new a(64, null);
        public static final a ACTION_CLEAR_ACCESSIBILITY_FOCUS = new a(128, null);
        public static final a ACTION_NEXT_AT_MOVEMENT_GRANULARITY = new a(256, (CharSequence) null, O.b.class);
        public static final a ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = new a(512, (CharSequence) null, O.b.class);
        public static final a ACTION_NEXT_HTML_ELEMENT = new a(1024, (CharSequence) null, O.c.class);
        public static final a ACTION_PREVIOUS_HTML_ELEMENT = new a(2048, (CharSequence) null, O.c.class);
        public static final a ACTION_SCROLL_FORWARD = new a(4096, null);
        public static final a ACTION_SCROLL_BACKWARD = new a(8192, null);
        public static final a ACTION_COPY = new a(16384, null);
        public static final a ACTION_PASTE = new a(32768, null);
        public static final a ACTION_CUT = new a(65536, null);
        public static final a ACTION_SET_SELECTION = new a(131072, (CharSequence) null, O.g.class);
        public static final a ACTION_EXPAND = new a(262144, null);
        public static final a ACTION_COLLAPSE = new a(524288, null);
        public static final a ACTION_DISMISS = new a(1048576, null);
        public static final a ACTION_SET_TEXT = new a(2097152, (CharSequence) null, O.h.class);

        static {
            int i8 = Build.VERSION.SDK_INT;
            ACTION_SHOW_ON_SCREEN = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            ACTION_SCROLL_TO_POSITION = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, O.e.class);
            ACTION_SCROLL_UP = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            ACTION_SCROLL_LEFT = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            ACTION_SCROLL_DOWN = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            ACTION_SCROLL_RIGHT = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            ACTION_PAGE_UP = new a(i8 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            ACTION_PAGE_DOWN = new a(i8 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            ACTION_PAGE_LEFT = new a(i8 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            ACTION_PAGE_RIGHT = new a(i8 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            ACTION_CONTEXT_CLICK = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            ACTION_SET_PROGRESS = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, O.f.class);
            ACTION_MOVE_WINDOW = new a(i8 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, O.d.class);
            ACTION_SHOW_TOOLTIP = new a(i8 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            ACTION_HIDE_TOOLTIP = new a(i8 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            ACTION_PRESS_AND_HOLD = new a(i8 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            ACTION_IME_ENTER = new a(i8 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            ACTION_DRAG_START = new a(i8 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            ACTION_DRAG_DROP = new a(i8 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            ACTION_DRAG_CANCEL = new a(i8 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            ACTION_SHOW_TEXT_SUGGESTIONS = new a(i8 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            ACTION_SCROLL_IN_DIRECTION = new a(i8 >= 34 ? d.getActionScrollInDirection() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i8, CharSequence charSequence) {
            this(null, i8, charSequence, null, null);
        }

        public a createReplacementAction(CharSequence charSequence, O o8) {
            return new a(null, this.f9157b, charSequence, o8, this.f9158c);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f9156a;
            return obj2 == null ? aVar.f9156a == null : obj2.equals(aVar.f9156a);
        }

        public int getId() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f9156a).getId();
        }

        public CharSequence getLabel() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f9156a).getLabel();
        }

        public int hashCode() {
            Object obj = this.f9156a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean perform(View view, Bundle bundle) {
            if (this.f9159d == null) {
                return false;
            }
            Class cls = this.f9158c;
            O.a aVar = null;
            if (cls != null) {
                try {
                    O.a aVar2 = (O.a) cls.getDeclaredConstructor(null).newInstance(null);
                    try {
                        aVar2.setBundle(bundle);
                        aVar = aVar2;
                    } catch (Exception e8) {
                        e = e8;
                        aVar = aVar2;
                        Class cls2 = this.f9158c;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                        return this.f9159d.perform(view, aVar);
                    }
                } catch (Exception e9) {
                    e = e9;
                }
            }
            return this.f9159d.perform(view, aVar);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String strD = H.d(this.f9157b);
            if (strD.equals("ACTION_UNKNOWN") && getLabel() != null) {
                strD = getLabel().toString();
            }
            sb.append(strD);
            return sb.toString();
        }

        public a(int i8, CharSequence charSequence, O o8) {
            this(null, i8, charSequence, o8, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i8, CharSequence charSequence, Class cls) {
            this(null, i8, charSequence, null, cls);
        }

        a(Object obj, int i8, CharSequence charSequence, O o8, Class cls) {
            this.f9157b = i8;
            this.f9159d = o8;
            if (obj == null) {
                this.f9156a = new AccessibilityNodeInfo.AccessibilityAction(i8, charSequence);
            } else {
                this.f9156a = obj;
            }
            this.f9158c = cls;
        }
    }

    private static class b {
        public static Object createRangeInfo(int i8, float f8, float f9, float f10) {
            return new AccessibilityNodeInfo.RangeInfo(i8, f8, f9, f10);
        }

        public static CharSequence getStateDescription(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void setStateDescription(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    private static class c {
        public static f buildCollectionItemInfoCompat(boolean z8, int i8, int i9, int i10, int i11, boolean z9, String str, String str2) {
            return new f(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z8).setColumnIndex(i8).setRowIndex(i9).setColumnSpan(i10).setRowSpan(i11).setSelected(z9).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static H getChild(AccessibilityNodeInfo accessibilityNodeInfo, int i8, int i9) {
            return H.l(accessibilityNodeInfo.getChild(i8, i9));
        }

        public static String getCollectionItemColumnTitle(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String getCollectionItemRowTitle(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static H getParent(AccessibilityNodeInfo accessibilityNodeInfo, int i8) {
            return H.l(accessibilityNodeInfo.getParent(i8));
        }

        public static String getUniqueId(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean isTextSelectable(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void setTextSelectable(AccessibilityNodeInfo accessibilityNodeInfo, boolean z8) {
            accessibilityNodeInfo.setTextSelectable(z8);
        }

        public static void setUniqueId(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    private static class d {
        public static AccessibilityNodeInfo.AccessibilityAction getActionScrollInDirection() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void getBoundsInWindow(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence getContainerTitle(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long getMinDurationBetweenContentChangeMillis(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        public static boolean hasRequestInitialAccessibilityFocus(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean isAccessibilityDataSensitive(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void setAccessibilityDataSensitive(AccessibilityNodeInfo accessibilityNodeInfo, boolean z8) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z8);
        }

        public static void setBoundsInWindow(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void setContainerTitle(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void setMinDurationBetweenContentChangeMillis(AccessibilityNodeInfo accessibilityNodeInfo, long j8) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j8));
        }

        public static void setQueryFromAppProcessEnabled(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z8) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z8);
        }

        public static void setRequestInitialAccessibilityFocus(AccessibilityNodeInfo accessibilityNodeInfo, boolean z8) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z8);
        }
    }

    public static class e {
        public static final int SELECTION_MODE_MULTIPLE = 2;
        public static final int SELECTION_MODE_NONE = 0;
        public static final int SELECTION_MODE_SINGLE = 1;

        /* renamed from: a */
        final Object f9160a;

        e(Object obj) {
            this.f9160a = obj;
        }

        public static e obtain(int i8, int i9, boolean z8, int i10) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i8, i9, z8, i10));
        }

        public int getColumnCount() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f9160a).getColumnCount();
        }

        public int getRowCount() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f9160a).getRowCount();
        }

        public int getSelectionMode() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f9160a).getSelectionMode();
        }

        public boolean isHierarchical() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f9160a).isHierarchical();
        }

        public static e obtain(int i8, int i9, boolean z8) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i8, i9, z8));
        }
    }

    public static class f {

        /* renamed from: a */
        final Object f9161a;

        f(Object obj) {
            this.f9161a = obj;
        }

        public static f obtain(int i8, int i9, int i10, int i11, boolean z8, boolean z9) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i8, i9, i10, i11, z8, z9));
        }

        public int getColumnIndex() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f9161a).getColumnIndex();
        }

        public int getColumnSpan() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f9161a).getColumnSpan();
        }

        public String getColumnTitle() {
            if (Build.VERSION.SDK_INT >= 33) {
                return c.getCollectionItemColumnTitle(this.f9161a);
            }
            return null;
        }

        public int getRowIndex() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f9161a).getRowIndex();
        }

        public int getRowSpan() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f9161a).getRowSpan();
        }

        public String getRowTitle() {
            if (Build.VERSION.SDK_INT >= 33) {
                return c.getCollectionItemRowTitle(this.f9161a);
            }
            return null;
        }

        @Deprecated
        public boolean isHeading() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f9161a).isHeading();
        }

        public boolean isSelected() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f9161a).isSelected();
        }

        public static f obtain(int i8, int i9, int i10, int i11, boolean z8) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i8, i9, i10, i11, z8));
        }
    }

    @Deprecated
    public H(Object obj) {
        this.f9154a = (AccessibilityNodeInfo) obj;
    }

    private void a(ClickableSpan clickableSpan, Spanned spanned, int i8) {
        c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i8));
    }

    private void b() {
        this.f9154a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f9154a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f9154a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f9154a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List c(String str) {
        ArrayList<Integer> integerArrayList = this.f9154a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f9154a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String d(int i8) {
        if (i8 == 1) {
            return "ACTION_FOCUS";
        }
        if (i8 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i8) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i8) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i8) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i8) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean e(int i8) {
        Bundle extras = getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i8) == i8;
    }

    private SparseArray f(View view) {
        SparseArray sparseArrayG = g(view);
        if (sparseArrayG != null) {
            return sparseArrayG;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(U.e.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    private SparseArray g(View view) {
        return (SparseArray) view.getTag(U.e.tag_accessibility_clickable_spans);
    }

    public static ClickableSpan[] getClickableSpans(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private boolean h() {
        return !c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int i(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i8 = 0; i8 < sparseArray.size(); i8++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i8)).get())) {
                    return sparseArray.keyAt(i8);
                }
            }
        }
        int i9 = f9153c;
        f9153c = i9 + 1;
        return i9;
    }

    private void j(View view) {
        SparseArray sparseArrayG = g(view);
        if (sparseArrayG != null) {
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < sparseArrayG.size(); i8++) {
                if (((WeakReference) sparseArrayG.valueAt(i8)).get() == null) {
                    arrayList.add(Integer.valueOf(i8));
                }
            }
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                sparseArrayG.remove(((Integer) arrayList.get(i9)).intValue());
            }
        }
    }

    private void k(int i8, boolean z8) {
        Bundle extras = getExtras();
        if (extras != null) {
            int i9 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i8);
            if (!z8) {
                i8 = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i8 | i9);
        }
    }

    static H l(Object obj) {
        if (obj != null) {
            return new H(obj);
        }
        return null;
    }

    public static H obtain(View view) {
        return wrap(AccessibilityNodeInfo.obtain(view));
    }

    public static H wrap(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new H(accessibilityNodeInfo);
    }

    public void addAction(int i8) {
        this.f9154a.addAction(i8);
    }

    public void addChild(View view) {
        this.f9154a.addChild(view);
    }

    public void addSpansToExtras(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            b();
            j(view);
            ClickableSpan[] clickableSpans = getClickableSpans(charSequence);
            if (clickableSpans == null || clickableSpans.length <= 0) {
                return;
            }
            getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", U.e.accessibility_action_clickable_span);
            SparseArray sparseArrayF = f(view);
            for (int i8 = 0; i8 < clickableSpans.length; i8++) {
                int i9 = i(clickableSpans[i8], sparseArrayF);
                sparseArrayF.put(i9, new WeakReference(clickableSpans[i8]));
                a(clickableSpans[i8], (Spanned) charSequence, i9);
            }
        }
    }

    public boolean canOpenPopup() {
        return this.f9154a.canOpenPopup();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof H)) {
            return false;
        }
        H h8 = (H) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f9154a;
        if (accessibilityNodeInfo == null) {
            if (h8.f9154a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(h8.f9154a)) {
            return false;
        }
        return this.f9155b == h8.f9155b && this.mParentVirtualDescendantId == h8.mParentVirtualDescendantId;
    }

    public List<H> findAccessibilityNodeInfosByText(String str) {
        ArrayList arrayList = new ArrayList();
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByText = this.f9154a.findAccessibilityNodeInfosByText(str);
        int size = listFindAccessibilityNodeInfosByText.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(wrap(listFindAccessibilityNodeInfosByText.get(i8)));
        }
        return arrayList;
    }

    public List<H> findAccessibilityNodeInfosByViewId(String str) {
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId = this.f9154a.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        Iterator<AccessibilityNodeInfo> it = listFindAccessibilityNodeInfosByViewId.iterator();
        while (it.hasNext()) {
            arrayList.add(wrap(it.next()));
        }
        return arrayList;
    }

    public H findFocus(int i8) {
        return l(this.f9154a.findFocus(i8));
    }

    public H focusSearch(int i8) {
        return l(this.f9154a.focusSearch(i8));
    }

    public List<a> getActionList() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f9154a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(new a(actionList.get(i8)));
        }
        return arrayList;
    }

    @Deprecated
    public int getActions() {
        return this.f9154a.getActions();
    }

    public List<String> getAvailableExtraData() {
        return Build.VERSION.SDK_INT >= 26 ? this.f9154a.getAvailableExtraData() : Collections.emptyList();
    }

    @Deprecated
    public void getBoundsInParent(Rect rect) {
        this.f9154a.getBoundsInParent(rect);
    }

    public void getBoundsInScreen(Rect rect) {
        this.f9154a.getBoundsInScreen(rect);
    }

    public void getBoundsInWindow(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.getBoundsInWindow(this.f9154a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f9154a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public H getChild(int i8) {
        return l(this.f9154a.getChild(i8));
    }

    public int getChildCount() {
        return this.f9154a.getChildCount();
    }

    public CharSequence getClassName() {
        return this.f9154a.getClassName();
    }

    public e getCollectionInfo() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f9154a.getCollectionInfo();
        if (collectionInfo != null) {
            return new e(collectionInfo);
        }
        return null;
    }

    public f getCollectionItemInfo() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.f9154a.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new f(collectionItemInfo);
        }
        return null;
    }

    public CharSequence getContainerTitle() {
        return Build.VERSION.SDK_INT >= 34 ? d.getContainerTitle(this.f9154a) : this.f9154a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public CharSequence getContentDescription() {
        return this.f9154a.getContentDescription();
    }

    public int getDrawingOrder() {
        return this.f9154a.getDrawingOrder();
    }

    public CharSequence getError() {
        return this.f9154a.getError();
    }

    public AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo() {
        if (Build.VERSION.SDK_INT >= 33) {
            return c.getExtraRenderingInfo(this.f9154a);
        }
        return null;
    }

    public Bundle getExtras() {
        return this.f9154a.getExtras();
    }

    public CharSequence getHintText() {
        return Build.VERSION.SDK_INT >= 26 ? this.f9154a.getHintText() : this.f9154a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
    }

    @Deprecated
    public Object getInfo() {
        return this.f9154a;
    }

    public int getInputType() {
        return this.f9154a.getInputType();
    }

    public H getLabelFor() {
        return l(this.f9154a.getLabelFor());
    }

    public H getLabeledBy() {
        return l(this.f9154a.getLabeledBy());
    }

    public int getLiveRegion() {
        return this.f9154a.getLiveRegion();
    }

    public int getMaxTextLength() {
        return this.f9154a.getMaxTextLength();
    }

    public long getMinDurationBetweenContentChangesMillis() {
        return Build.VERSION.SDK_INT >= 34 ? d.getMinDurationBetweenContentChangeMillis(this.f9154a) : this.f9154a.getExtras().getLong("androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY");
    }

    public int getMovementGranularities() {
        return this.f9154a.getMovementGranularities();
    }

    public CharSequence getPackageName() {
        return this.f9154a.getPackageName();
    }

    public CharSequence getPaneTitle() {
        return Build.VERSION.SDK_INT >= 28 ? this.f9154a.getPaneTitle() : this.f9154a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY");
    }

    public H getParent() {
        return l(this.f9154a.getParent());
    }

    public g getRangeInfo() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f9154a.getRangeInfo();
        if (rangeInfo != null) {
            return new g(rangeInfo);
        }
        return null;
    }

    public CharSequence getRoleDescription() {
        return this.f9154a.getExtras().getCharSequence("AccessibilityNodeInfo.roleDescription");
    }

    public CharSequence getStateDescription() {
        return Build.VERSION.SDK_INT >= 30 ? b.getStateDescription(this.f9154a) : this.f9154a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public CharSequence getText() {
        if (!h()) {
            return this.f9154a.getText();
        }
        List listC = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List listC2 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List listC3 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List listC4 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f9154a.getText(), 0, this.f9154a.getText().length()));
        for (int i8 = 0; i8 < listC.size(); i8++) {
            spannableString.setSpan(new C0926a(((Integer) listC4.get(i8)).intValue(), this, getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listC.get(i8)).intValue(), ((Integer) listC2.get(i8)).intValue(), ((Integer) listC3.get(i8)).intValue());
        }
        return spannableString;
    }

    public int getTextSelectionEnd() {
        return this.f9154a.getTextSelectionEnd();
    }

    public int getTextSelectionStart() {
        return this.f9154a.getTextSelectionStart();
    }

    public CharSequence getTooltipText() {
        return Build.VERSION.SDK_INT >= 28 ? this.f9154a.getTooltipText() : this.f9154a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public h getTouchDelegateInfo() {
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo;
        if (Build.VERSION.SDK_INT < 29 || (touchDelegateInfo = this.f9154a.getTouchDelegateInfo()) == null) {
            return null;
        }
        return new h(touchDelegateInfo);
    }

    public H getTraversalAfter() {
        return l(this.f9154a.getTraversalAfter());
    }

    public H getTraversalBefore() {
        return l(this.f9154a.getTraversalBefore());
    }

    public String getUniqueId() {
        return Build.VERSION.SDK_INT >= 33 ? c.getUniqueId(this.f9154a) : this.f9154a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public String getViewIdResourceName() {
        return this.f9154a.getViewIdResourceName();
    }

    public P getWindow() {
        return P.b(this.f9154a.getWindow());
    }

    public int getWindowId() {
        return this.f9154a.getWindowId();
    }

    public boolean hasRequestInitialAccessibilityFocus() {
        return Build.VERSION.SDK_INT >= 34 ? d.hasRequestInitialAccessibilityFocus(this.f9154a) : e(32);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f9154a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean isAccessibilityDataSensitive() {
        return Build.VERSION.SDK_INT >= 34 ? d.isAccessibilityDataSensitive(this.f9154a) : e(64);
    }

    public boolean isAccessibilityFocused() {
        return this.f9154a.isAccessibilityFocused();
    }

    public boolean isCheckable() {
        return this.f9154a.isCheckable();
    }

    public boolean isChecked() {
        return this.f9154a.isChecked();
    }

    public boolean isClickable() {
        return this.f9154a.isClickable();
    }

    public boolean isContentInvalid() {
        return this.f9154a.isContentInvalid();
    }

    public boolean isContextClickable() {
        return this.f9154a.isContextClickable();
    }

    public boolean isDismissable() {
        return this.f9154a.isDismissable();
    }

    public boolean isEditable() {
        return this.f9154a.isEditable();
    }

    public boolean isEnabled() {
        return this.f9154a.isEnabled();
    }

    public boolean isFocusable() {
        return this.f9154a.isFocusable();
    }

    public boolean isFocused() {
        return this.f9154a.isFocused();
    }

    public boolean isGranularScrollingSupported() {
        return e(AbstractC0927b.TYPE_VIEW_TARGETED_BY_SCROLL);
    }

    public boolean isHeading() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f9154a.isHeading();
        }
        if (e(2)) {
            return true;
        }
        f collectionItemInfo = getCollectionItemInfo();
        return collectionItemInfo != null && collectionItemInfo.isHeading();
    }

    public boolean isImportantForAccessibility() {
        return this.f9154a.isImportantForAccessibility();
    }

    public boolean isLongClickable() {
        return this.f9154a.isLongClickable();
    }

    public boolean isMultiLine() {
        return this.f9154a.isMultiLine();
    }

    public boolean isPassword() {
        return this.f9154a.isPassword();
    }

    public boolean isScreenReaderFocusable() {
        return Build.VERSION.SDK_INT >= 28 ? this.f9154a.isScreenReaderFocusable() : e(1);
    }

    public boolean isScrollable() {
        return this.f9154a.isScrollable();
    }

    public boolean isSelected() {
        return this.f9154a.isSelected();
    }

    public boolean isShowingHintText() {
        return Build.VERSION.SDK_INT >= 26 ? this.f9154a.isShowingHintText() : e(4);
    }

    public boolean isTextEntryKey() {
        return Build.VERSION.SDK_INT >= 29 ? this.f9154a.isTextEntryKey() : e(8);
    }

    public boolean isTextSelectable() {
        return Build.VERSION.SDK_INT >= 33 ? c.isTextSelectable(this.f9154a) : e(8388608);
    }

    public boolean isVisibleToUser() {
        return this.f9154a.isVisibleToUser();
    }

    public boolean performAction(int i8) {
        return this.f9154a.performAction(i8);
    }

    @Deprecated
    public void recycle() {
    }

    public boolean refresh() {
        return this.f9154a.refresh();
    }

    public boolean removeAction(a aVar) {
        return this.f9154a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f9156a);
    }

    public boolean removeChild(View view) {
        return this.f9154a.removeChild(view);
    }

    public void setAccessibilityDataSensitive(boolean z8) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.setAccessibilityDataSensitive(this.f9154a, z8);
        } else {
            k(64, z8);
        }
    }

    public void setAccessibilityFocused(boolean z8) {
        this.f9154a.setAccessibilityFocused(z8);
    }

    public void setAvailableExtraData(List<String> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f9154a.setAvailableExtraData(list);
        }
    }

    @Deprecated
    public void setBoundsInParent(Rect rect) {
        this.f9154a.setBoundsInParent(rect);
    }

    public void setBoundsInScreen(Rect rect) {
        this.f9154a.setBoundsInScreen(rect);
    }

    public void setBoundsInWindow(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.setBoundsInWindow(this.f9154a, rect);
        } else {
            this.f9154a.getExtras().putParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY", rect);
        }
    }

    public void setCanOpenPopup(boolean z8) {
        this.f9154a.setCanOpenPopup(z8);
    }

    public void setCheckable(boolean z8) {
        this.f9154a.setCheckable(z8);
    }

    public void setChecked(boolean z8) {
        this.f9154a.setChecked(z8);
    }

    public void setClassName(CharSequence charSequence) {
        this.f9154a.setClassName(charSequence);
    }

    public void setClickable(boolean z8) {
        this.f9154a.setClickable(z8);
    }

    public void setCollectionInfo(Object obj) {
        this.f9154a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).f9160a);
    }

    public void setCollectionItemInfo(Object obj) {
        this.f9154a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).f9161a);
    }

    public void setContainerTitle(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.setContainerTitle(this.f9154a, charSequence);
        } else {
            this.f9154a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY", charSequence);
        }
    }

    public void setContentDescription(CharSequence charSequence) {
        this.f9154a.setContentDescription(charSequence);
    }

    public void setContentInvalid(boolean z8) {
        this.f9154a.setContentInvalid(z8);
    }

    public void setContextClickable(boolean z8) {
        this.f9154a.setContextClickable(z8);
    }

    public void setDismissable(boolean z8) {
        this.f9154a.setDismissable(z8);
    }

    public void setDrawingOrder(int i8) {
        this.f9154a.setDrawingOrder(i8);
    }

    public void setEditable(boolean z8) {
        this.f9154a.setEditable(z8);
    }

    public void setEnabled(boolean z8) {
        this.f9154a.setEnabled(z8);
    }

    public void setError(CharSequence charSequence) {
        this.f9154a.setError(charSequence);
    }

    public void setFocusable(boolean z8) {
        this.f9154a.setFocusable(z8);
    }

    public void setFocused(boolean z8) {
        this.f9154a.setFocused(z8);
    }

    public void setGranularScrollingSupported(boolean z8) {
        k(AbstractC0927b.TYPE_VIEW_TARGETED_BY_SCROLL, z8);
    }

    public void setHeading(boolean z8) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f9154a.setHeading(z8);
        } else {
            k(2, z8);
        }
    }

    public void setHintText(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f9154a.setHintText(charSequence);
        } else {
            this.f9154a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void setImportantForAccessibility(boolean z8) {
        this.f9154a.setImportantForAccessibility(z8);
    }

    public void setInputType(int i8) {
        this.f9154a.setInputType(i8);
    }

    public void setLabelFor(View view) {
        this.f9154a.setLabelFor(view);
    }

    public void setLabeledBy(View view) {
        this.f9154a.setLabeledBy(view);
    }

    public void setLiveRegion(int i8) {
        this.f9154a.setLiveRegion(i8);
    }

    public void setLongClickable(boolean z8) {
        this.f9154a.setLongClickable(z8);
    }

    public void setMaxTextLength(int i8) {
        this.f9154a.setMaxTextLength(i8);
    }

    public void setMinDurationBetweenContentChangesMillis(long j8) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.setMinDurationBetweenContentChangeMillis(this.f9154a, j8);
        } else {
            this.f9154a.getExtras().putLong("androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY", j8);
        }
    }

    public void setMovementGranularities(int i8) {
        this.f9154a.setMovementGranularities(i8);
    }

    public void setMultiLine(boolean z8) {
        this.f9154a.setMultiLine(z8);
    }

    public void setPackageName(CharSequence charSequence) {
        this.f9154a.setPackageName(charSequence);
    }

    public void setPaneTitle(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f9154a.setPaneTitle(charSequence);
        } else {
            this.f9154a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void setParent(View view) {
        this.mParentVirtualDescendantId = -1;
        this.f9154a.setParent(view);
    }

    public void setPassword(boolean z8) {
        this.f9154a.setPassword(z8);
    }

    public void setQueryFromAppProcessEnabled(View view, boolean z8) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.setQueryFromAppProcessEnabled(this.f9154a, view, z8);
        }
    }

    public void setRangeInfo(g gVar) {
        this.f9154a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) gVar.f9162a);
    }

    public void setRequestInitialAccessibilityFocus(boolean z8) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.setRequestInitialAccessibilityFocus(this.f9154a, z8);
        } else {
            k(32, z8);
        }
    }

    public void setRoleDescription(CharSequence charSequence) {
        this.f9154a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public void setScreenReaderFocusable(boolean z8) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f9154a.setScreenReaderFocusable(z8);
        } else {
            k(1, z8);
        }
    }

    public void setScrollable(boolean z8) {
        this.f9154a.setScrollable(z8);
    }

    public void setSelected(boolean z8) {
        this.f9154a.setSelected(z8);
    }

    public void setShowingHintText(boolean z8) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f9154a.setShowingHintText(z8);
        } else {
            k(4, z8);
        }
    }

    public void setSource(View view) {
        this.f9155b = -1;
        this.f9154a.setSource(view);
    }

    public void setStateDescription(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.setStateDescription(this.f9154a, charSequence);
        } else {
            this.f9154a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f9154a.setText(charSequence);
    }

    public void setTextEntryKey(boolean z8) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f9154a.setTextEntryKey(z8);
        } else {
            k(8, z8);
        }
    }

    public void setTextSelectable(boolean z8) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.setTextSelectable(this.f9154a, z8);
        } else {
            k(8388608, z8);
        }
    }

    public void setTextSelection(int i8, int i9) {
        this.f9154a.setTextSelection(i8, i9);
    }

    public void setTooltipText(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f9154a.setTooltipText(charSequence);
        } else {
            this.f9154a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence);
        }
    }

    public void setTouchDelegateInfo(h hVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f9154a.setTouchDelegateInfo(hVar.f9163a);
        }
    }

    public void setTraversalAfter(View view) {
        this.f9154a.setTraversalAfter(view);
    }

    public void setTraversalBefore(View view) {
        this.f9154a.setTraversalBefore(view);
    }

    public void setUniqueId(String str) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.setUniqueId(this.f9154a, str);
        } else {
            this.f9154a.getExtras().putString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY", str);
        }
    }

    public void setViewIdResourceName(String str) {
        this.f9154a.setViewIdResourceName(str);
    }

    public void setVisibleToUser(boolean z8) {
        this.f9154a.setVisibleToUser(z8);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        getBoundsInWindow(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(getPackageName());
        sb.append("; className: ");
        sb.append(getClassName());
        sb.append("; text: ");
        sb.append(getText());
        sb.append("; error: ");
        sb.append(getError());
        sb.append("; maxTextLength: ");
        sb.append(getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(getStateDescription());
        sb.append("; contentDescription: ");
        sb.append(getContentDescription());
        sb.append("; tooltipText: ");
        sb.append(getTooltipText());
        sb.append("; viewIdResName: ");
        sb.append(getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(getUniqueId());
        sb.append("; checkable: ");
        sb.append(isCheckable());
        sb.append("; checked: ");
        sb.append(isChecked());
        sb.append("; focusable: ");
        sb.append(isFocusable());
        sb.append("; focused: ");
        sb.append(isFocused());
        sb.append("; selected: ");
        sb.append(isSelected());
        sb.append("; clickable: ");
        sb.append(isClickable());
        sb.append("; longClickable: ");
        sb.append(isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(isContextClickable());
        sb.append("; enabled: ");
        sb.append(isEnabled());
        sb.append("; password: ");
        sb.append(isPassword());
        sb.append("; scrollable: " + isScrollable());
        sb.append("; containerTitle: ");
        sb.append(getContainerTitle());
        sb.append("; granularScrollingSupported: ");
        sb.append(isGranularScrollingSupported());
        sb.append("; importantForAccessibility: ");
        sb.append(isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(isTextSelectable());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(isAccessibilityDataSensitive());
        sb.append("; [");
        List<a> actionList = getActionList();
        for (int i8 = 0; i8 < actionList.size(); i8++) {
            a aVar = actionList.get(i8);
            String strD = d(aVar.getId());
            if (strD.equals("ACTION_UNKNOWN") && aVar.getLabel() != null) {
                strD = aVar.getLabel().toString();
            }
            sb.append(strD);
            if (i8 != actionList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public AccessibilityNodeInfo unwrap() {
        return this.f9154a;
    }

    public static class g {
        public static final int RANGE_TYPE_FLOAT = 1;
        public static final int RANGE_TYPE_INT = 0;
        public static final int RANGE_TYPE_PERCENT = 2;

        /* renamed from: a */
        final Object f9162a;

        g(Object obj) {
            this.f9162a = obj;
        }

        public static g obtain(int i8, float f8, float f9, float f10) {
            return new g(AccessibilityNodeInfo.RangeInfo.obtain(i8, f8, f9, f10));
        }

        public float getCurrent() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f9162a).getCurrent();
        }

        public float getMax() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f9162a).getMax();
        }

        public float getMin() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f9162a).getMin();
        }

        public int getType() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f9162a).getType();
        }

        public g(int i8, float f8, float f9, float f10) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f9162a = b.createRangeInfo(i8, f8, f9, f10);
            } else {
                this.f9162a = AccessibilityNodeInfo.RangeInfo.obtain(i8, f8, f9, f10);
            }
        }
    }

    public static H obtain(View view, int i8) {
        return l(AccessibilityNodeInfo.obtain(view, i8));
    }

    public void addAction(a aVar) {
        this.f9154a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f9156a);
    }

    public void addChild(View view, int i8) {
        this.f9154a.addChild(view, i8);
    }

    public H getChild(int i8, int i9) {
        return Build.VERSION.SDK_INT >= 33 ? c.getChild(this.f9154a, i8, i9) : getChild(i8);
    }

    public H getParent(int i8) {
        return Build.VERSION.SDK_INT >= 33 ? c.getParent(this.f9154a, i8) : getParent();
    }

    public boolean performAction(int i8, Bundle bundle) {
        return this.f9154a.performAction(i8, bundle);
    }

    public boolean removeChild(View view, int i8) {
        return this.f9154a.removeChild(view, i8);
    }

    public void setLabelFor(View view, int i8) {
        this.f9154a.setLabelFor(view, i8);
    }

    public void setLabeledBy(View view, int i8) {
        this.f9154a.setLabeledBy(view, i8);
    }

    public void setTraversalAfter(View view, int i8) {
        this.f9154a.setTraversalAfter(view, i8);
    }

    public void setTraversalBefore(View view, int i8) {
        this.f9154a.setTraversalBefore(view, i8);
    }

    public void setParent(View view, int i8) {
        this.mParentVirtualDescendantId = i8;
        this.f9154a.setParent(view, i8);
    }

    public void setSource(View view, int i8) {
        this.f9155b = i8;
        this.f9154a.setSource(view, i8);
    }

    public static final class h {

        /* renamed from: a */
        final AccessibilityNodeInfo.TouchDelegateInfo f9163a;

        public h(Map<Region, View> map) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f9163a = L.a(map);
            } else {
                this.f9163a = null;
            }
        }

        public Region getRegionAt(int i8) {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f9163a.getRegionAt(i8);
            }
            return null;
        }

        public int getRegionCount() {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f9163a.getRegionCount();
            }
            return 0;
        }

        public H getTargetForRegion(Region region) {
            AccessibilityNodeInfo targetForRegion;
            if (Build.VERSION.SDK_INT < 29 || (targetForRegion = this.f9163a.getTargetForRegion(region)) == null) {
                return null;
            }
            return H.wrap(targetForRegion);
        }

        h(AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo) {
            this.f9163a = touchDelegateInfo;
        }
    }

    public static H obtain() {
        return wrap(AccessibilityNodeInfo.obtain());
    }

    private H(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f9154a = accessibilityNodeInfo;
    }

    public static H obtain(H h8) {
        return wrap(AccessibilityNodeInfo.obtain(h8.f9154a));
    }
}

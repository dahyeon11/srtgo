package androidx.activity;

import R6.AbstractC0756j;
import R6.InterfaceC0755i;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC1019h;
import androidx.lifecycle.InterfaceC1023l;
import androidx.lifecycle.InterfaceC1025n;
import f7.InterfaceC5519a;
import java.lang.reflect.Field;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements InterfaceC1023l {
    public static final c Companion = new c(null);

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC0755i f6191b = AbstractC0756j.lazy(b.INSTANCE);

    /* renamed from: a, reason: collision with root package name */
    private final Activity f6192a;

    public static abstract class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract boolean clearNextServedView(InputMethodManager inputMethodManager);

        public abstract Object getLock(InputMethodManager inputMethodManager);

        public abstract View getServedView(InputMethodManager inputMethodManager);

        private a() {
        }
    }

    static final class b extends Lambda implements InterfaceC5519a {
        public static final b INSTANCE = new b();

        b() {
            super(0);
        }

        @Override // f7.InterfaceC5519a
        public final a invoke() throws NoSuchFieldException, SecurityException {
            try {
                Field servedViewField = InputMethodManager.class.getDeclaredField("mServedView");
                servedViewField.setAccessible(true);
                Field nextServedViewField = InputMethodManager.class.getDeclaredField("mNextServedView");
                nextServedViewField.setAccessible(true);
                Field hField = InputMethodManager.class.getDeclaredField("mH");
                hField.setAccessible(true);
                Intrinsics.checkNotNullExpressionValue(hField, "hField");
                Intrinsics.checkNotNullExpressionValue(servedViewField, "servedViewField");
                Intrinsics.checkNotNullExpressionValue(nextServedViewField, "nextServedViewField");
                return new e(hField, servedViewField, nextServedViewField);
            } catch (NoSuchFieldException unused) {
                return d.INSTANCE;
            }
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a getCleaner() {
            return (a) ImmLeaksCleaner.f6191b.getValue();
        }

        private c() {
        }
    }

    public static final class d extends a {
        public static final d INSTANCE = new d();

        private d() {
            super(null);
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public boolean clearNextServedView(InputMethodManager inputMethodManager) {
            Intrinsics.checkNotNullParameter(inputMethodManager, "<this>");
            return false;
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public Object getLock(InputMethodManager inputMethodManager) {
            Intrinsics.checkNotNullParameter(inputMethodManager, "<this>");
            return null;
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public View getServedView(InputMethodManager inputMethodManager) {
            Intrinsics.checkNotNullParameter(inputMethodManager, "<this>");
            return null;
        }
    }

    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        private final Field f6193a;

        /* renamed from: b, reason: collision with root package name */
        private final Field f6194b;

        /* renamed from: c, reason: collision with root package name */
        private final Field f6195c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Field hField, Field servedViewField, Field nextServedViewField) {
            super(null);
            Intrinsics.checkNotNullParameter(hField, "hField");
            Intrinsics.checkNotNullParameter(servedViewField, "servedViewField");
            Intrinsics.checkNotNullParameter(nextServedViewField, "nextServedViewField");
            this.f6193a = hField;
            this.f6194b = servedViewField;
            this.f6195c = nextServedViewField;
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public boolean clearNextServedView(InputMethodManager inputMethodManager) throws IllegalAccessException, IllegalArgumentException {
            Intrinsics.checkNotNullParameter(inputMethodManager, "<this>");
            try {
                this.f6195c.set(inputMethodManager, null);
                return true;
            } catch (IllegalAccessException unused) {
                return false;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public Object getLock(InputMethodManager inputMethodManager) {
            Intrinsics.checkNotNullParameter(inputMethodManager, "<this>");
            try {
                return this.f6193a.get(inputMethodManager);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public View getServedView(InputMethodManager inputMethodManager) {
            Intrinsics.checkNotNullParameter(inputMethodManager, "<this>");
            try {
                return (View) this.f6194b.get(inputMethodManager);
            } catch (ClassCastException | IllegalAccessException unused) {
                return null;
            }
        }
    }

    public ImmLeaksCleaner(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f6192a = activity;
    }

    @Override // androidx.lifecycle.InterfaceC1023l
    public void onStateChanged(InterfaceC1025n source, AbstractC1019h.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != AbstractC1019h.a.ON_DESTROY) {
            return;
        }
        Object systemService = this.f6192a.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        a cleaner = Companion.getCleaner();
        Object lock = cleaner.getLock(inputMethodManager);
        if (lock == null) {
            return;
        }
        synchronized (lock) {
            View servedView = cleaner.getServedView(inputMethodManager);
            if (servedView == null) {
                return;
            }
            if (servedView.isAttachedToWindow()) {
                return;
            }
            boolean zClearNextServedView = cleaner.clearNextServedView(inputMethodManager);
            if (zClearNextServedView) {
                inputMethodManager.isActive();
            }
        }
    }
}

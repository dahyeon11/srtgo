package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.AbstractC0985p0;
import b0.AbstractC1060a;
import c0.AbstractC1087a;
import h.AbstractC5563a;
import h.AbstractC5566d;
import h.AbstractC5568f;
import h.AbstractC5569g;
import h.AbstractC5570h;
import h.AbstractC5572j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.InterfaceC5877c;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements InterfaceC5877c {

    /* renamed from: n0, reason: collision with root package name */
    static final n f6854n0;

    /* renamed from: A, reason: collision with root package name */
    private Rect f6855A;

    /* renamed from: B, reason: collision with root package name */
    private int[] f6856B;

    /* renamed from: C, reason: collision with root package name */
    private int[] f6857C;

    /* renamed from: D, reason: collision with root package name */
    private final ImageView f6858D;

    /* renamed from: E, reason: collision with root package name */
    private final Drawable f6859E;

    /* renamed from: F, reason: collision with root package name */
    private final int f6860F;

    /* renamed from: G, reason: collision with root package name */
    private final int f6861G;

    /* renamed from: H, reason: collision with root package name */
    private final Intent f6862H;

    /* renamed from: I, reason: collision with root package name */
    private final Intent f6863I;

    /* renamed from: J, reason: collision with root package name */
    private final CharSequence f6864J;

    /* renamed from: K, reason: collision with root package name */
    View.OnFocusChangeListener f6865K;

    /* renamed from: L, reason: collision with root package name */
    private View.OnClickListener f6866L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f6867M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f6868N;

    /* renamed from: O, reason: collision with root package name */
    AbstractC1060a f6869O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f6870P;

    /* renamed from: Q, reason: collision with root package name */
    private CharSequence f6871Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f6872R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f6873S;

    /* renamed from: T, reason: collision with root package name */
    private int f6874T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f6875U;

    /* renamed from: V, reason: collision with root package name */
    private CharSequence f6876V;

    /* renamed from: W, reason: collision with root package name */
    private CharSequence f6877W;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f6878a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f6879b0;

    /* renamed from: c0, reason: collision with root package name */
    SearchableInfo f6880c0;

    /* renamed from: d0, reason: collision with root package name */
    private Bundle f6881d0;

    /* renamed from: e0, reason: collision with root package name */
    private final Runnable f6882e0;

    /* renamed from: f0, reason: collision with root package name */
    private Runnable f6883f0;

    /* renamed from: g0, reason: collision with root package name */
    private final WeakHashMap f6884g0;

    /* renamed from: h0, reason: collision with root package name */
    private final View.OnClickListener f6885h0;

    /* renamed from: i0, reason: collision with root package name */
    View.OnKeyListener f6886i0;

    /* renamed from: j0, reason: collision with root package name */
    private final TextView.OnEditorActionListener f6887j0;

    /* renamed from: k0, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f6888k0;

    /* renamed from: l0, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f6889l0;

    /* renamed from: m0, reason: collision with root package name */
    private TextWatcher f6890m0;

    /* renamed from: p, reason: collision with root package name */
    final SearchAutoComplete f6891p;

    /* renamed from: q, reason: collision with root package name */
    private final View f6892q;

    /* renamed from: r, reason: collision with root package name */
    private final View f6893r;

    /* renamed from: s, reason: collision with root package name */
    private final View f6894s;

    /* renamed from: t, reason: collision with root package name */
    final ImageView f6895t;

    /* renamed from: u, reason: collision with root package name */
    final ImageView f6896u;

    /* renamed from: v, reason: collision with root package name */
    final ImageView f6897v;

    /* renamed from: w, reason: collision with root package name */
    final ImageView f6898w;

    /* renamed from: x, reason: collision with root package name */
    private final View f6899x;

    /* renamed from: y, reason: collision with root package name */
    private p f6900y;

    /* renamed from: z, reason: collision with root package name */
    private Rect f6901z;

    public static class SearchAutoComplete extends C0844d {

        /* renamed from: d, reason: collision with root package name */
        private int f6902d;

        /* renamed from: e, reason: collision with root package name */
        private SearchView f6903e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f6904f;

        /* renamed from: g, reason: collision with root package name */
        final Runnable f6905g;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i8 = configuration.screenWidthDp;
            int i9 = configuration.screenHeightDp;
            if (i8 >= 960 && i9 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i8 < 600) {
                return (i8 < 640 || i9 < 480) ? 160 : 192;
            }
            return 192;
        }

        void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f6854n0.c(this);
                return;
            }
            setInputMethodMode(1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void c() {
            if (this.f6904f) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f6904f = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f6902d <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C0844d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f6904f) {
                removeCallbacks(this.f6905g);
                post(this.f6905g);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z8, int i8, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onFocusChanged(z8, i8, rect);
            this.f6903e.R();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i8, KeyEvent keyEvent) {
            if (i8 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f6903e.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i8, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onWindowFocusChanged(z8);
            if (z8 && this.f6903e.hasFocus() && getVisibility() == 0) {
                this.f6904f = true;
                if (SearchView.E(getContext())) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z8) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z8) {
                this.f6904f = false;
                removeCallbacks(this.f6905g);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f6904f = true;
                    return;
                }
                this.f6904f = false;
                removeCallbacks(this.f6905g);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f6903e = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i8) {
            super.setThreshold(i8);
            this.f6902d = i8;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, AbstractC5563a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i8) {
            super(context, attributeSet, i8);
            this.f6905g = new a();
            this.f6902d = getThreshold();
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            SearchView.this.Q(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.W();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1060a abstractC1060a = SearchView.this.f6869O;
            if (abstractC1060a instanceof m0) {
                abstractC1060a.changeCursor(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z8) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f6865K;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z8);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            SearchView.this.u();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            SearchView searchView = SearchView.this;
            if (view == searchView.f6895t) {
                searchView.N();
                return;
            }
            if (view == searchView.f6897v) {
                searchView.J();
                return;
            }
            if (view == searchView.f6896u) {
                searchView.O();
            } else if (view == searchView.f6898w) {
                searchView.S();
            } else if (view == searchView.f6891p) {
                searchView.A();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i8, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f6880c0 == null) {
                return false;
            }
            if (searchView.f6891p.isPopupShowing() && SearchView.this.f6891p.getListSelection() != -1) {
                return SearchView.this.P(view, i8, keyEvent);
            }
            if (SearchView.this.f6891p.b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i8 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.H(0, null, searchView2.f6891p.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
            SearchView.this.O();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i8, long j8) {
            SearchView.this.K(i8, 0, null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i8, long j8) {
            SearchView.this.L(i8);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public interface k {
    }

    public interface l {
    }

    public interface m {
    }

    private static class n {

        /* renamed from: a, reason: collision with root package name */
        private Method f6917a;

        /* renamed from: b, reason: collision with root package name */
        private Method f6918b;

        /* renamed from: c, reason: collision with root package name */
        private Method f6919c;

        n() throws NoSuchMethodException, SecurityException {
            this.f6917a = null;
            this.f6918b = null;
            this.f6919c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f6917a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f6918b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f6919c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f6918b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f6917a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f6919c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    static class o extends AbstractC1087a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        boolean f6920b;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public o[] newArray(int i8) {
                return new o[i8];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }
        }

        o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f6920b + "}";
        }

        @Override // c0.AbstractC1087a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeValue(Boolean.valueOf(this.f6920b));
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6920b = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    private static class p extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        private final View f6921a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f6922b;

        /* renamed from: c, reason: collision with root package name */
        private final Rect f6923c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f6924d;

        /* renamed from: e, reason: collision with root package name */
        private final int f6925e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f6926f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f6925e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f6922b = new Rect();
            this.f6924d = new Rect();
            this.f6923c = new Rect();
            setBounds(rect, rect2);
            this.f6921a = view;
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z8;
            boolean z9;
            int x8 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z10 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z9 = this.f6926f;
                    if (z9 && !this.f6924d.contains(x8, y8)) {
                        z10 = z9;
                        z8 = false;
                    }
                } else {
                    if (action == 3) {
                        z9 = this.f6926f;
                        this.f6926f = false;
                    }
                    z8 = true;
                    z10 = false;
                }
                z10 = z9;
                z8 = true;
            } else if (this.f6922b.contains(x8, y8)) {
                this.f6926f = true;
                z8 = true;
            } else {
                z8 = true;
                z10 = false;
            }
            if (!z10) {
                return false;
            }
            if (!z8 || this.f6923c.contains(x8, y8)) {
                Rect rect = this.f6923c;
                motionEvent.setLocation(x8 - rect.left, y8 - rect.top);
            } else {
                motionEvent.setLocation(this.f6921a.getWidth() / 2, this.f6921a.getHeight() / 2);
            }
            return this.f6921a.dispatchTouchEvent(motionEvent);
        }

        public void setBounds(Rect rect, Rect rect2) {
            this.f6922b.set(rect);
            this.f6924d.set(rect);
            Rect rect3 = this.f6924d;
            int i8 = this.f6925e;
            rect3.inset(-i8, -i8);
            this.f6923c.set(rect2);
        }
    }

    static {
        f6854n0 = Build.VERSION.SDK_INT < 29 ? new n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private void B(View view, Rect rect) {
        view.getLocationInWindow(this.f6856B);
        getLocationInWindow(this.f6857C);
        int[] iArr = this.f6856B;
        int i8 = iArr[1];
        int[] iArr2 = this.f6857C;
        int i9 = i8 - iArr2[1];
        int i10 = iArr[0] - iArr2[0];
        rect.set(i10, i9, view.getWidth() + i10, view.getHeight() + i9);
    }

    private CharSequence C(CharSequence charSequence) {
        if (!this.f6867M || this.f6859E == null) {
            return charSequence;
        }
        int textSize = (int) (this.f6891p.getTextSize() * 1.25d);
        this.f6859E.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f6859E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean D() {
        SearchableInfo searchableInfo = this.f6880c0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.f6880c0.getVoiceSearchLaunchWebSearch() ? this.f6862H : this.f6880c0.getVoiceSearchLaunchRecognizer() ? this.f6863I : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean E(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean F() {
        return (this.f6870P || this.f6875U) && !isIconified();
    }

    private void G(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e8) {
            Log.e("SearchView", "Failed launch activity: " + intent, e8);
        }
    }

    private boolean I(int i8, int i9, String str) {
        Cursor cursor = this.f6869O.getCursor();
        if (cursor == null || !cursor.moveToPosition(i8)) {
            return false;
        }
        G(w(cursor, i9, str));
        return true;
    }

    private void T() {
        post(this.f6882e0);
    }

    private void U(int i8) {
        Editable text = this.f6891p.getText();
        Cursor cursor = this.f6869O.getCursor();
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i8)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceConvertToString = this.f6869O.convertToString(cursor);
        if (charSequenceConvertToString != null) {
            setQuery(charSequenceConvertToString);
        } else {
            setQuery(text);
        }
    }

    private void V() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f6891p.getText());
        this.f6897v.setVisibility(!zIsEmpty || (this.f6867M && !this.f6878a0) ? 0 : 8);
        Drawable drawable = this.f6897v.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void X() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f6891p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(C(queryHint));
    }

    private void Y() {
        this.f6891p.setThreshold(this.f6880c0.getSuggestThreshold());
        this.f6891p.setImeOptions(this.f6880c0.getImeOptions());
        int inputType = this.f6880c0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f6880c0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f6891p.setInputType(inputType);
        AbstractC1060a abstractC1060a = this.f6869O;
        if (abstractC1060a != null) {
            abstractC1060a.changeCursor(null);
        }
        if (this.f6880c0.getSuggestAuthority() != null) {
            m0 m0Var = new m0(getContext(), this, this.f6880c0, this.f6884g0);
            this.f6869O = m0Var;
            this.f6891p.setAdapter(m0Var);
            ((m0) this.f6869O).setQueryRefinement(this.f6872R ? 2 : 1);
        }
    }

    private void Z() {
        this.f6894s.setVisibility((F() && (this.f6896u.getVisibility() == 0 || this.f6898w.getVisibility() == 0)) ? 0 : 8);
    }

    private void a0(boolean z8) {
        this.f6896u.setVisibility((this.f6870P && F() && hasFocus() && (z8 || !this.f6875U)) ? 0 : 8);
    }

    private void b0(boolean z8) {
        this.f6868N = z8;
        int i8 = 8;
        int i9 = z8 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f6891p.getText());
        this.f6895t.setVisibility(i9);
        a0(!zIsEmpty);
        this.f6892q.setVisibility(z8 ? 8 : 0);
        if (this.f6858D.getDrawable() != null && !this.f6867M) {
            i8 = 0;
        }
        this.f6858D.setVisibility(i8);
        V();
        c0(zIsEmpty);
        Z();
    }

    private void c0(boolean z8) {
        int i8 = 8;
        if (this.f6875U && !isIconified() && z8) {
            this.f6896u.setVisibility(8);
            i8 = 0;
        }
        this.f6898w.setVisibility(i8);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(AbstractC5566d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(AbstractC5566d.abc_search_view_preferred_width);
    }

    private Intent v(String str, Uri uri, String str2, String str3, int i8, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f6877W);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f6881d0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i8 != 0) {
            intent.putExtra("action_key", i8);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f6880c0.getSearchActivity());
        return intent;
    }

    private Intent w(Cursor cursor, int i8, String str) {
        int position;
        String columnString;
        try {
            String columnString2 = m0.getColumnString(cursor, "suggest_intent_action");
            if (columnString2 == null) {
                columnString2 = this.f6880c0.getSuggestIntentAction();
            }
            if (columnString2 == null) {
                columnString2 = "android.intent.action.SEARCH";
            }
            String str2 = columnString2;
            String columnString3 = m0.getColumnString(cursor, "suggest_intent_data");
            if (columnString3 == null) {
                columnString3 = this.f6880c0.getSuggestIntentData();
            }
            if (columnString3 != null && (columnString = m0.getColumnString(cursor, "suggest_intent_data_id")) != null) {
                columnString3 = columnString3 + "/" + Uri.encode(columnString);
            }
            return v(str2, columnString3 == null ? null : Uri.parse(columnString3), m0.getColumnString(cursor, "suggest_intent_extra_data"), m0.getColumnString(cursor, "suggest_intent_query"), i8, str);
        } catch (RuntimeException e8) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e8);
            return null;
        }
    }

    private Intent x(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f6881d0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent y(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void z() {
        this.f6891p.dismissDropDown();
    }

    void A() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f6891p.refreshAutoCompleteResults();
            return;
        }
        n nVar = f6854n0;
        nVar.b(this.f6891p);
        nVar.a(this.f6891p);
    }

    void H(int i8, String str, String str2) {
        getContext().startActivity(v("android.intent.action.SEARCH", null, null, str2, i8, str));
    }

    void J() {
        if (!TextUtils.isEmpty(this.f6891p.getText())) {
            this.f6891p.setText("");
            this.f6891p.requestFocus();
            this.f6891p.setImeVisibility(true);
        } else if (this.f6867M) {
            clearFocus();
            b0(true);
        }
    }

    boolean K(int i8, int i9, String str) {
        I(i8, 0, null);
        this.f6891p.setImeVisibility(false);
        z();
        return true;
    }

    boolean L(int i8) {
        U(i8);
        return true;
    }

    void M(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void N() {
        b0(false);
        this.f6891p.requestFocus();
        this.f6891p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f6866L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void O() {
        Editable text = this.f6891p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f6880c0 != null) {
            H(0, null, text.toString());
        }
        this.f6891p.setImeVisibility(false);
        z();
    }

    boolean P(View view, int i8, KeyEvent keyEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f6880c0 != null && this.f6869O != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i8 == 66 || i8 == 84 || i8 == 61) {
                return K(this.f6891p.getListSelection(), 0, null);
            }
            if (i8 == 21 || i8 == 22) {
                this.f6891p.setSelection(i8 == 21 ? 0 : this.f6891p.length());
                this.f6891p.setListSelection(0);
                this.f6891p.clearListSelection();
                this.f6891p.a();
                return true;
            }
            if (i8 == 19) {
                this.f6891p.getListSelection();
                return false;
            }
        }
        return false;
    }

    void Q(CharSequence charSequence) {
        Editable text = this.f6891p.getText();
        this.f6877W = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        a0(!zIsEmpty);
        c0(zIsEmpty);
        V();
        Z();
        this.f6876V = charSequence.toString();
    }

    void R() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        b0(isIconified());
        T();
        if (this.f6891p.hasFocus()) {
            A();
        }
    }

    void S() {
        SearchableInfo searchableInfo = this.f6880c0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(y(this.f6862H, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(x(this.f6863I, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    void W() {
        int[] iArr = this.f6891p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f6893r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f6894s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f6873S = true;
        super.clearFocus();
        this.f6891p.clearFocus();
        this.f6891p.setImeVisibility(false);
        this.f6873S = false;
    }

    public int getImeOptions() {
        return this.f6891p.getImeOptions();
    }

    public int getInputType() {
        return this.f6891p.getInputType();
    }

    public int getMaxWidth() {
        return this.f6874T;
    }

    public CharSequence getQuery() {
        return this.f6891p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f6871Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f6880c0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f6864J : getContext().getText(this.f6880c0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.f6861G;
    }

    int getSuggestionRowLayout() {
        return this.f6860F;
    }

    public AbstractC1060a getSuggestionsAdapter() {
        return this.f6869O;
    }

    public boolean isIconfiedByDefault() {
        return this.f6867M;
    }

    public boolean isIconified() {
        return this.f6868N;
    }

    public boolean isQueryRefinementEnabled() {
        return this.f6872R;
    }

    public boolean isSubmitButtonEnabled() {
        return this.f6870P;
    }

    @Override // l.InterfaceC5877c
    public void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        b0(true);
        this.f6891p.setImeOptions(this.f6879b0);
        this.f6878a0 = false;
    }

    @Override // l.InterfaceC5877c
    public void onActionViewExpanded() {
        if (this.f6878a0) {
            return;
        }
        this.f6878a0 = true;
        int imeOptions = this.f6891p.getImeOptions();
        this.f6879b0 = imeOptions;
        this.f6891p.setImeOptions(imeOptions | 33554432);
        this.f6891p.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f6882e0);
        post(this.f6883f0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        if (z8) {
            B(this.f6891p, this.f6901z);
            Rect rect = this.f6855A;
            Rect rect2 = this.f6901z;
            rect.set(rect2.left, 0, rect2.right, i11 - i9);
            p pVar = this.f6900y;
            if (pVar != null) {
                pVar.setBounds(this.f6855A, this.f6901z);
                return;
            }
            p pVar2 = new p(this.f6855A, this.f6901z, this.f6891p);
            this.f6900y = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i8, int i9) {
        int i10;
        if (isIconified()) {
            super.onMeasure(i8, i9);
            return;
        }
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        if (mode == Integer.MIN_VALUE) {
            int i11 = this.f6874T;
            size = i11 > 0 ? Math.min(i11, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f6874T;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i10 = this.f6874T) > 0) {
            size = Math.min(i10, size);
        }
        int mode2 = View.MeasureSpec.getMode(i9);
        int size2 = View.MeasureSpec.getSize(i9);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.getSuperState());
        b0(oVar.f6920b);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f6920b = isIconified();
        return oVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        T();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i8, Rect rect) {
        if (this.f6873S || !isFocusable()) {
            return false;
        }
        if (isIconified()) {
            return super.requestFocus(i8, rect);
        }
        boolean zRequestFocus = this.f6891p.requestFocus(i8, rect);
        if (zRequestFocus) {
            b0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f6881d0 = bundle;
    }

    public void setIconified(boolean z8) {
        if (z8) {
            J();
        } else {
            N();
        }
    }

    public void setIconifiedByDefault(boolean z8) {
        if (this.f6867M == z8) {
            return;
        }
        this.f6867M = z8;
        b0(z8);
        X();
    }

    public void setImeOptions(int i8) {
        this.f6891p.setImeOptions(i8);
    }

    public void setInputType(int i8) {
        this.f6891p.setInputType(i8);
    }

    public void setMaxWidth(int i8) {
        this.f6874T = i8;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f6865K = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f6866L = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
    }

    public void setQuery(CharSequence charSequence, boolean z8) {
        this.f6891p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f6891p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f6877W = charSequence;
        }
        if (!z8 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        O();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f6871Q = charSequence;
        X();
    }

    public void setQueryRefinementEnabled(boolean z8) {
        this.f6872R = z8;
        AbstractC1060a abstractC1060a = this.f6869O;
        if (abstractC1060a instanceof m0) {
            ((m0) abstractC1060a).setQueryRefinement(z8 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f6880c0 = searchableInfo;
        if (searchableInfo != null) {
            Y();
            X();
        }
        boolean zD = D();
        this.f6875U = zD;
        if (zD) {
            this.f6891p.setPrivateImeOptions("nm");
        }
        b0(isIconified());
    }

    public void setSubmitButtonEnabled(boolean z8) {
        this.f6870P = z8;
        b0(isIconified());
    }

    public void setSuggestionsAdapter(AbstractC1060a abstractC1060a) {
        this.f6869O = abstractC1060a;
        this.f6891p.setAdapter(abstractC1060a);
    }

    void u() {
        if (this.f6899x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f6893r.getPaddingLeft();
            Rect rect = new Rect();
            boolean zIsLayoutRtl = y0.isLayoutRtl(this);
            int dimensionPixelSize = this.f6867M ? resources.getDimensionPixelSize(AbstractC5566d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(AbstractC5566d.abc_dropdownitem_text_padding_left) : 0;
            this.f6891p.getDropDownBackground().getPadding(rect);
            this.f6891p.setDropDownHorizontalOffset(zIsLayoutRtl ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f6891p.setDropDownWidth((((this.f6899x.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5563a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f6901z = new Rect();
        this.f6855A = new Rect();
        this.f6856B = new int[2];
        this.f6857C = new int[2];
        this.f6882e0 = new b();
        this.f6883f0 = new c();
        this.f6884g0 = new WeakHashMap();
        f fVar = new f();
        this.f6885h0 = fVar;
        this.f6886i0 = new g();
        h hVar = new h();
        this.f6887j0 = hVar;
        i iVar = new i();
        this.f6888k0 = iVar;
        j jVar = new j();
        this.f6889l0 = jVar;
        this.f6890m0 = new a();
        r0 r0VarObtainStyledAttributes = r0.obtainStyledAttributes(context, attributeSet, AbstractC5572j.SearchView, i8, 0);
        LayoutInflater.from(context).inflate(r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.SearchView_layout, AbstractC5569g.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(AbstractC5568f.search_src_text);
        this.f6891p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f6892q = findViewById(AbstractC5568f.search_edit_frame);
        View viewFindViewById = findViewById(AbstractC5568f.search_plate);
        this.f6893r = viewFindViewById;
        View viewFindViewById2 = findViewById(AbstractC5568f.submit_area);
        this.f6894s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(AbstractC5568f.search_button);
        this.f6895t = imageView;
        ImageView imageView2 = (ImageView) findViewById(AbstractC5568f.search_go_btn);
        this.f6896u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(AbstractC5568f.search_close_btn);
        this.f6897v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(AbstractC5568f.search_voice_btn);
        this.f6898w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(AbstractC5568f.search_mag_icon);
        this.f6858D = imageView5;
        AbstractC0985p0.setBackground(viewFindViewById, r0VarObtainStyledAttributes.getDrawable(AbstractC5572j.SearchView_queryBackground));
        AbstractC0985p0.setBackground(viewFindViewById2, r0VarObtainStyledAttributes.getDrawable(AbstractC5572j.SearchView_submitBackground));
        imageView.setImageDrawable(r0VarObtainStyledAttributes.getDrawable(AbstractC5572j.SearchView_searchIcon));
        imageView2.setImageDrawable(r0VarObtainStyledAttributes.getDrawable(AbstractC5572j.SearchView_goIcon));
        imageView3.setImageDrawable(r0VarObtainStyledAttributes.getDrawable(AbstractC5572j.SearchView_closeIcon));
        imageView4.setImageDrawable(r0VarObtainStyledAttributes.getDrawable(AbstractC5572j.SearchView_voiceIcon));
        imageView5.setImageDrawable(r0VarObtainStyledAttributes.getDrawable(AbstractC5572j.SearchView_searchIcon));
        this.f6859E = r0VarObtainStyledAttributes.getDrawable(AbstractC5572j.SearchView_searchHintIcon);
        u0.setTooltipText(imageView, getResources().getString(AbstractC5570h.abc_searchview_description_search));
        this.f6860F = r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.SearchView_suggestionRowLayout, AbstractC5569g.abc_search_dropdown_item_icons_2line);
        this.f6861G = r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.SearchView_commitIcon, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f6890m0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f6886i0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(r0VarObtainStyledAttributes.getBoolean(AbstractC5572j.SearchView_iconifiedByDefault, true));
        int dimensionPixelSize = r0VarObtainStyledAttributes.getDimensionPixelSize(AbstractC5572j.SearchView_android_maxWidth, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f6864J = r0VarObtainStyledAttributes.getText(AbstractC5572j.SearchView_defaultQueryHint);
        this.f6871Q = r0VarObtainStyledAttributes.getText(AbstractC5572j.SearchView_queryHint);
        int i9 = r0VarObtainStyledAttributes.getInt(AbstractC5572j.SearchView_android_imeOptions, -1);
        if (i9 != -1) {
            setImeOptions(i9);
        }
        int i10 = r0VarObtainStyledAttributes.getInt(AbstractC5572j.SearchView_android_inputType, -1);
        if (i10 != -1) {
            setInputType(i10);
        }
        setFocusable(r0VarObtainStyledAttributes.getBoolean(AbstractC5572j.SearchView_android_focusable, true));
        r0VarObtainStyledAttributes.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f6862H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f6863I = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f6899x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        b0(this.f6867M);
        X();
    }

    private void setQuery(CharSequence charSequence) {
        this.f6891p.setText(charSequence);
        this.f6891p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }
}

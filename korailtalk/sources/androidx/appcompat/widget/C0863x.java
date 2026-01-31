package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.d;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.InterfaceC0973l0;
import h.AbstractC5563a;
import i.AbstractC5638a;

/* renamed from: androidx.appcompat.widget.x */
/* loaded from: classes.dex */
public class C0863x extends Spinner implements InterfaceC0973l0 {

    /* renamed from: i */
    private static final int[] f7281i = {R.attr.spinnerMode};

    /* renamed from: a */
    private final C0845e f7282a;

    /* renamed from: b */
    private final Context f7283b;

    /* renamed from: c */
    private Z f7284c;

    /* renamed from: d */
    private SpinnerAdapter f7285d;

    /* renamed from: e */
    private final boolean f7286e;

    /* renamed from: f */
    private g f7287f;

    /* renamed from: g */
    int f7288g;

    /* renamed from: h */
    final Rect f7289h;

    /* renamed from: androidx.appcompat.widget.x$a */
    class a extends Z {

        /* renamed from: j */
        final /* synthetic */ e f7290j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.f7290j = eVar;
        }

        @Override // androidx.appcompat.widget.Z
        public m.e getPopup() {
            return this.f7290j;
        }

        @Override // androidx.appcompat.widget.Z
        public boolean onForwardingStarted() {
            if (C0863x.this.getInternalPopup().isShowing()) {
                return true;
            }
            C0863x.this.b();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.x$b */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!C0863x.this.getInternalPopup().isShowing()) {
                C0863x.this.b();
            }
            ViewTreeObserver viewTreeObserver = C0863x.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.x$c */
    class c implements g, DialogInterface.OnClickListener {

        /* renamed from: a */
        androidx.appcompat.app.d f7293a;

        /* renamed from: b */
        private ListAdapter f7294b;

        /* renamed from: c */
        private CharSequence f7295c;

        c() {
        }

        @Override // androidx.appcompat.widget.C0863x.g
        public void dismiss() {
            androidx.appcompat.app.d dVar = this.f7293a;
            if (dVar != null) {
                dVar.dismiss();
                this.f7293a = null;
            }
        }

        @Override // androidx.appcompat.widget.C0863x.g
        public Drawable getBackground() {
            return null;
        }

        @Override // androidx.appcompat.widget.C0863x.g
        public CharSequence getHintText() {
            return this.f7295c;
        }

        @Override // androidx.appcompat.widget.C0863x.g
        public int getHorizontalOffset() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C0863x.g
        public int getHorizontalOriginalOffset() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C0863x.g
        public int getVerticalOffset() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C0863x.g
        public boolean isShowing() {
            androidx.appcompat.app.d dVar = this.f7293a;
            if (dVar != null) {
                return dVar.isShowing();
            }
            return false;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i8) {
            C0863x.this.setSelection(i8);
            if (C0863x.this.getOnItemClickListener() != null) {
                C0863x.this.performItemClick(null, i8, this.f7294b.getItemId(i8));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.C0863x.g
        public void setAdapter(ListAdapter listAdapter) {
            this.f7294b = listAdapter;
        }

        @Override // androidx.appcompat.widget.C0863x.g
        public void setBackgroundDrawable(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0863x.g
        public void setHorizontalOffset(int i8) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0863x.g
        public void setHorizontalOriginalOffset(int i8) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0863x.g
        public void setPromptText(CharSequence charSequence) {
            this.f7295c = charSequence;
        }

        @Override // androidx.appcompat.widget.C0863x.g
        public void setVerticalOffset(int i8) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0863x.g
        public void show(int i8, int i9) {
            if (this.f7294b == null) {
                return;
            }
            d.a aVar = new d.a(C0863x.this.getPopupContext());
            CharSequence charSequence = this.f7295c;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            androidx.appcompat.app.d dVarCreate = aVar.setSingleChoiceItems(this.f7294b, C0863x.this.getSelectedItemPosition(), this).create();
            this.f7293a = dVarCreate;
            ListView listView = dVarCreate.getListView();
            listView.setTextDirection(i8);
            listView.setTextAlignment(i9);
            this.f7293a.show();
        }
    }

    /* renamed from: androidx.appcompat.widget.x$d */
    private static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        private SpinnerAdapter f7297a;

        /* renamed from: b */
        private ListAdapter f7298b;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f7297a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f7298b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                return;
            }
            ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f7298b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f7297a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i8, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f7297a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i8, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i8) {
            SpinnerAdapter spinnerAdapter = this.f7297a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i8);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            SpinnerAdapter spinnerAdapter = this.f7297a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i8);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i8) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) {
            return getDropDownView(i8, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f7297a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i8) {
            ListAdapter listAdapter = this.f7298b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i8);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f7297a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f7297a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.x$e */
    class e extends c0 implements g {

        /* renamed from: I */
        private CharSequence f7299I;

        /* renamed from: J */
        ListAdapter f7300J;

        /* renamed from: K */
        private final Rect f7301K;

        /* renamed from: L */
        private int f7302L;

        /* renamed from: androidx.appcompat.widget.x$e$a */
        class a implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ C0863x f7304a;

            a(C0863x c0863x) {
                this.f7304a = c0863x;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i8, long j8) {
                C0863x.this.setSelection(i8);
                if (C0863x.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    C0863x.this.performItemClick(view, i8, eVar.f7300J.getItemId(i8));
                }
                e.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.x$e$b */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.i(C0863x.this)) {
                    e.this.dismiss();
                } else {
                    e.this.h();
                    e.super.show();
                }
            }
        }

        /* renamed from: androidx.appcompat.widget.x$e$c */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f7307a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f7307a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0863x.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f7307a);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i8) {
            super(context, attributeSet, i8);
            this.f7301K = new Rect();
            setAnchorView(C0863x.this);
            setModal(true);
            setPromptPosition(0);
            setOnItemClickListener(new a(C0863x.this));
        }

        @Override // androidx.appcompat.widget.C0863x.g
        public CharSequence getHintText() {
            return this.f7299I;
        }

        @Override // androidx.appcompat.widget.C0863x.g
        public int getHorizontalOriginalOffset() {
            return this.f7302L;
        }

        void h() {
            int i8;
            Drawable background = getBackground();
            if (background != null) {
                background.getPadding(C0863x.this.f7289h);
                i8 = y0.isLayoutRtl(C0863x.this) ? C0863x.this.f7289h.right : -C0863x.this.f7289h.left;
            } else {
                Rect rect = C0863x.this.f7289h;
                rect.right = 0;
                rect.left = 0;
                i8 = 0;
            }
            int paddingLeft = C0863x.this.getPaddingLeft();
            int paddingRight = C0863x.this.getPaddingRight();
            int width = C0863x.this.getWidth();
            C0863x c0863x = C0863x.this;
            int i9 = c0863x.f7288g;
            if (i9 == -2) {
                int iA = c0863x.a((SpinnerAdapter) this.f7300J, getBackground());
                int i10 = C0863x.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = C0863x.this.f7289h;
                int i11 = (i10 - rect2.left) - rect2.right;
                if (iA > i11) {
                    iA = i11;
                }
                setContentWidth(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i9 == -1) {
                setContentWidth((width - paddingLeft) - paddingRight);
            } else {
                setContentWidth(i9);
            }
            setHorizontalOffset(y0.isLayoutRtl(C0863x.this) ? i8 + (((width - paddingRight) - getWidth()) - getHorizontalOriginalOffset()) : i8 + paddingLeft + getHorizontalOriginalOffset());
        }

        boolean i(View view) {
            return AbstractC0985p0.isAttachedToWindow(view) && view.getGlobalVisibleRect(this.f7301K);
        }

        @Override // androidx.appcompat.widget.c0, androidx.appcompat.widget.C0863x.g
        public void setAdapter(ListAdapter listAdapter) {
            super.setAdapter(listAdapter);
            this.f7300J = listAdapter;
        }

        @Override // androidx.appcompat.widget.C0863x.g
        public void setHorizontalOriginalOffset(int i8) {
            this.f7302L = i8;
        }

        @Override // androidx.appcompat.widget.C0863x.g
        public void setPromptText(CharSequence charSequence) {
            this.f7299I = charSequence;
        }

        @Override // androidx.appcompat.widget.C0863x.g
        public void show(int i8, int i9) {
            ViewTreeObserver viewTreeObserver;
            boolean zIsShowing = isShowing();
            h();
            setInputMethodMode(2);
            super.show();
            ListView listView = getListView();
            listView.setChoiceMode(1);
            listView.setTextDirection(i8);
            listView.setTextAlignment(i9);
            setSelection(C0863x.this.getSelectedItemPosition());
            if (zIsShowing || (viewTreeObserver = C0863x.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            setOnDismissListener(new c(bVar));
        }
    }

    /* renamed from: androidx.appcompat.widget.x$f */
    static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: a */
        boolean f7309a;

        /* renamed from: androidx.appcompat.widget.x$f$a */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public f[] newArray(int i8) {
                return new f[i8];
            }
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeByte(this.f7309a ? (byte) 1 : (byte) 0);
        }

        f(Parcel parcel) {
            super(parcel);
            this.f7309a = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.x$g */
    interface g {
        void dismiss();

        Drawable getBackground();

        CharSequence getHintText();

        int getHorizontalOffset();

        int getHorizontalOriginalOffset();

        int getVerticalOffset();

        boolean isShowing();

        void setAdapter(ListAdapter listAdapter);

        void setBackgroundDrawable(Drawable drawable);

        void setHorizontalOffset(int i8);

        void setHorizontalOriginalOffset(int i8);

        void setPromptText(CharSequence charSequence);

        void setVerticalOffset(int i8);

        void show(int i8, int i9);
    }

    public C0863x(Context context) {
        this(context, (AttributeSet) null);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i8 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f7289h);
        Rect rect = this.f7289h;
        return iMax2 + rect.left + rect.right;
    }

    void b() {
        this.f7287f.show(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0845e c0845e = this.f7282a;
        if (c0845e != null) {
            c0845e.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.f7287f;
        return gVar != null ? gVar.getHorizontalOffset() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.f7287f;
        return gVar != null ? gVar.getVerticalOffset() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f7287f != null ? this.f7288g : super.getDropDownWidth();
    }

    final g getInternalPopup() {
        return this.f7287f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.f7287f;
        return gVar != null ? gVar.getBackground() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f7283b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.f7287f;
        return gVar != null ? gVar.getHintText() : super.getPrompt();
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public ColorStateList getSupportBackgroundTintList() {
        C0845e c0845e = this.f7282a;
        if (c0845e != null) {
            return c0845e.c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0845e c0845e = this.f7282a;
        if (c0845e != null) {
            return c0845e.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f7287f;
        if (gVar == null || !gVar.isShowing()) {
            return;
        }
        this.f7287f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        if (this.f7287f == null || View.MeasureSpec.getMode(i8) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i8)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (!fVar.f7309a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f7287f;
        fVar.f7309a = gVar != null && gVar.isShowing();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Z z8 = this.f7284c;
        if (z8 == null || !z8.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.f7287f;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.isShowing()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0845e c0845e = this.f7282a;
        if (c0845e != null) {
            c0845e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C0845e c0845e = this.f7282a;
        if (c0845e != null) {
            c0845e.g(i8);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i8) {
        g gVar = this.f7287f;
        if (gVar == null) {
            super.setDropDownHorizontalOffset(i8);
        } else {
            gVar.setHorizontalOriginalOffset(i8);
            this.f7287f.setHorizontalOffset(i8);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i8) {
        g gVar = this.f7287f;
        if (gVar != null) {
            gVar.setVerticalOffset(i8);
        } else {
            super.setDropDownVerticalOffset(i8);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i8) {
        if (this.f7287f != null) {
            this.f7288g = i8;
        } else {
            super.setDropDownWidth(i8);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f7287f;
        if (gVar != null) {
            gVar.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i8) {
        setPopupBackgroundDrawable(AbstractC5638a.getDrawable(getPopupContext(), i8));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f7287f;
        if (gVar != null) {
            gVar.setPromptText(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0845e c0845e = this.f7282a;
        if (c0845e != null) {
            c0845e.i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0845e c0845e = this.f7282a;
        if (c0845e != null) {
            c0845e.j(mode);
        }
    }

    public C0863x(Context context, int i8) {
        this(context, null, AbstractC5563a.spinnerStyle, i8);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f7286e) {
            this.f7285d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f7287f != null) {
            Context context = this.f7283b;
            if (context == null) {
                context = getContext();
            }
            this.f7287f.setAdapter(new d(spinnerAdapter, context.getTheme()));
        }
    }

    public C0863x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5563a.spinnerStyle);
    }

    public C0863x(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, -1);
    }

    public C0863x(Context context, AttributeSet attributeSet, int i8, int i9) {
        this(context, attributeSet, i8, i9, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0863x(android.content.Context r6, android.util.AttributeSet r7, int r8, int r9, android.content.res.Resources.Theme r10) throws java.lang.Throwable {
        /*
            r5 = this;
            r5.<init>(r6, r7, r8)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.f7289h = r0
            android.content.Context r0 = r5.getContext()
            androidx.appcompat.widget.n0.checkAppCompatTheme(r5, r0)
            int[] r0 = h.AbstractC5572j.Spinner
            r1 = 0
            androidx.appcompat.widget.r0 r0 = androidx.appcompat.widget.r0.obtainStyledAttributes(r6, r7, r0, r8, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r5)
            r5.f7282a = r2
            if (r10 == 0) goto L29
            l.d r2 = new l.d
            r2.<init>(r6, r10)
            r5.f7283b = r2
            goto L3b
        L29:
            int r10 = h.AbstractC5572j.Spinner_popupTheme
            int r10 = r0.getResourceId(r10, r1)
            if (r10 == 0) goto L39
            l.d r2 = new l.d
            r2.<init>(r6, r10)
            r5.f7283b = r2
            goto L3b
        L39:
            r5.f7283b = r6
        L3b:
            r10 = -1
            r2 = 0
            if (r9 != r10) goto L64
            int[] r10 = androidx.appcompat.widget.C0863x.f7281i     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            android.content.res.TypedArray r10 = r6.obtainStyledAttributes(r7, r10, r8, r1)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            boolean r3 = r10.hasValue(r1)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L61
            if (r3 == 0) goto L53
            int r9 = r10.getInt(r1, r1)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L61
            goto L53
        L50:
            r6 = move-exception
            r2 = r10
            goto L5b
        L53:
            r10.recycle()
            goto L64
        L57:
            r6 = move-exception
            goto L5b
        L59:
            r10 = r2
            goto L61
        L5b:
            if (r2 == 0) goto L60
            r2.recycle()
        L60:
            throw r6
        L61:
            if (r10 == 0) goto L64
            goto L53
        L64:
            r10 = 1
            if (r9 == 0) goto La1
            if (r9 == r10) goto L6a
            goto Lb1
        L6a:
            androidx.appcompat.widget.x$e r9 = new androidx.appcompat.widget.x$e
            android.content.Context r3 = r5.f7283b
            r9.<init>(r3, r7, r8)
            android.content.Context r3 = r5.f7283b
            int[] r4 = h.AbstractC5572j.Spinner
            androidx.appcompat.widget.r0 r1 = androidx.appcompat.widget.r0.obtainStyledAttributes(r3, r7, r4, r8, r1)
            int r3 = h.AbstractC5572j.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.getLayoutDimension(r3, r4)
            r5.f7288g = r3
            int r3 = h.AbstractC5572j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r3)
            r9.setBackgroundDrawable(r3)
            int r3 = h.AbstractC5572j.Spinner_android_prompt
            java.lang.String r3 = r0.getString(r3)
            r9.setPromptText(r3)
            r1.recycle()
            r5.f7287f = r9
            androidx.appcompat.widget.x$a r1 = new androidx.appcompat.widget.x$a
            r1.<init>(r5, r9)
            r5.f7284c = r1
            goto Lb1
        La1:
            androidx.appcompat.widget.x$c r9 = new androidx.appcompat.widget.x$c
            r9.<init>()
            r5.f7287f = r9
            int r1 = h.AbstractC5572j.Spinner_android_prompt
            java.lang.String r1 = r0.getString(r1)
            r9.setPromptText(r1)
        Lb1:
            int r9 = h.AbstractC5572j.Spinner_android_entries
            java.lang.CharSequence[] r9 = r0.getTextArray(r9)
            if (r9 == 0) goto Lc9
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r6, r3, r9)
            int r6 = h.AbstractC5569g.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r6)
            r5.setAdapter(r1)
        Lc9:
            r0.recycle()
            r5.f7286e = r10
            android.widget.SpinnerAdapter r6 = r5.f7285d
            if (r6 == 0) goto Ld7
            r5.setAdapter(r6)
            r5.f7285d = r2
        Ld7:
            androidx.appcompat.widget.e r6 = r5.f7282a
            r6.e(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0863x.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}

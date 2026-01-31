package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.AbstractC0985p0;
import androidx.core.widget.NestedScrollView;
import h.AbstractC5563a;
import h.AbstractC5568f;
import h.AbstractC5572j;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class AlertController {

    /* renamed from: A, reason: collision with root package name */
    NestedScrollView f6253A;

    /* renamed from: C, reason: collision with root package name */
    private Drawable f6255C;

    /* renamed from: D, reason: collision with root package name */
    private ImageView f6256D;

    /* renamed from: E, reason: collision with root package name */
    private TextView f6257E;

    /* renamed from: F, reason: collision with root package name */
    private TextView f6258F;

    /* renamed from: G, reason: collision with root package name */
    private View f6259G;

    /* renamed from: H, reason: collision with root package name */
    ListAdapter f6260H;

    /* renamed from: J, reason: collision with root package name */
    private int f6262J;

    /* renamed from: K, reason: collision with root package name */
    private int f6263K;

    /* renamed from: L, reason: collision with root package name */
    int f6264L;

    /* renamed from: M, reason: collision with root package name */
    int f6265M;

    /* renamed from: N, reason: collision with root package name */
    int f6266N;

    /* renamed from: O, reason: collision with root package name */
    int f6267O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f6268P;

    /* renamed from: R, reason: collision with root package name */
    Handler f6270R;

    /* renamed from: a, reason: collision with root package name */
    private final Context f6272a;

    /* renamed from: b, reason: collision with root package name */
    final k f6273b;

    /* renamed from: c, reason: collision with root package name */
    private final Window f6274c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6275d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f6276e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f6277f;

    /* renamed from: g, reason: collision with root package name */
    ListView f6278g;

    /* renamed from: h, reason: collision with root package name */
    private View f6279h;

    /* renamed from: i, reason: collision with root package name */
    private int f6280i;

    /* renamed from: j, reason: collision with root package name */
    private int f6281j;

    /* renamed from: k, reason: collision with root package name */
    private int f6282k;

    /* renamed from: l, reason: collision with root package name */
    private int f6283l;

    /* renamed from: m, reason: collision with root package name */
    private int f6284m;

    /* renamed from: o, reason: collision with root package name */
    Button f6286o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f6287p;

    /* renamed from: q, reason: collision with root package name */
    Message f6288q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f6289r;

    /* renamed from: s, reason: collision with root package name */
    Button f6290s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f6291t;

    /* renamed from: u, reason: collision with root package name */
    Message f6292u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f6293v;

    /* renamed from: w, reason: collision with root package name */
    Button f6294w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f6295x;

    /* renamed from: y, reason: collision with root package name */
    Message f6296y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f6297z;

    /* renamed from: n, reason: collision with root package name */
    private boolean f6285n = false;

    /* renamed from: B, reason: collision with root package name */
    private int f6254B = 0;

    /* renamed from: I, reason: collision with root package name */
    int f6261I = -1;

    /* renamed from: Q, reason: collision with root package name */
    private int f6269Q = 0;

    /* renamed from: S, reason: collision with root package name */
    private final View.OnClickListener f6271S = new a();

    public static class RecycleListView extends ListView {

        /* renamed from: a, reason: collision with root package name */
        private final int f6298a;

        /* renamed from: b, reason: collision with root package name */
        private final int f6299b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public void setHasDecor(boolean z8, boolean z9) {
            if (z9 && z8) {
                return;
            }
            setPadding(getPaddingLeft(), z8 ? getPaddingTop() : this.f6298a, getPaddingRight(), z9 ? getPaddingBottom() : this.f6299b);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5572j.RecycleListView);
            this.f6299b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC5572j.RecycleListView_paddingBottomNoButtons, -1);
            this.f6298a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC5572j.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message messageObtain = (view != alertController.f6286o || (message3 = alertController.f6288q) == null) ? (view != alertController.f6290s || (message2 = alertController.f6292u) == null) ? (view != alertController.f6294w || (message = alertController.f6296y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f6270R.obtainMessage(1, alertController2.f6273b).sendToTarget();
        }
    }

    public static class b {
        public ListAdapter mAdapter;
        public boolean[] mCheckedItems;
        public final Context mContext;
        public Cursor mCursor;
        public View mCustomTitleView;
        public boolean mForceInverseBackground;
        public Drawable mIcon;
        public final LayoutInflater mInflater;
        public String mIsCheckedColumn;
        public boolean mIsMultiChoice;
        public boolean mIsSingleChoice;
        public CharSequence[] mItems;
        public String mLabelColumn;
        public CharSequence mMessage;
        public Drawable mNegativeButtonIcon;
        public DialogInterface.OnClickListener mNegativeButtonListener;
        public CharSequence mNegativeButtonText;
        public Drawable mNeutralButtonIcon;
        public DialogInterface.OnClickListener mNeutralButtonListener;
        public CharSequence mNeutralButtonText;
        public DialogInterface.OnCancelListener mOnCancelListener;
        public DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;
        public DialogInterface.OnClickListener mOnClickListener;
        public DialogInterface.OnDismissListener mOnDismissListener;
        public AdapterView.OnItemSelectedListener mOnItemSelectedListener;
        public DialogInterface.OnKeyListener mOnKeyListener;
        public e mOnPrepareListViewListener;
        public Drawable mPositiveButtonIcon;
        public DialogInterface.OnClickListener mPositiveButtonListener;
        public CharSequence mPositiveButtonText;
        public CharSequence mTitle;
        public View mView;
        public int mViewLayoutResId;
        public int mViewSpacingBottom;
        public int mViewSpacingLeft;
        public int mViewSpacingRight;
        public int mViewSpacingTop;
        public int mIconId = 0;
        public int mIconAttrId = 0;
        public boolean mViewSpacingSpecified = false;
        public int mCheckedItem = -1;
        public boolean mRecycleOnMeasure = true;
        public boolean mCancelable = true;

        class a extends ArrayAdapter {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f6301a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i8, int i9, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i8, i9, charSequenceArr);
                this.f6301a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i8, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i8, view, viewGroup);
                boolean[] zArr = b.this.mCheckedItems;
                if (zArr != null && zArr[i8]) {
                    this.f6301a.setItemChecked(i8, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        class C0109b extends CursorAdapter {

            /* renamed from: a, reason: collision with root package name */
            private final int f6303a;

            /* renamed from: b, reason: collision with root package name */
            private final int f6304b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ RecycleListView f6305c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AlertController f6306d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0109b(Context context, Cursor cursor, boolean z8, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z8);
                this.f6305c = recycleListView;
                this.f6306d = alertController;
                Cursor cursor2 = getCursor();
                this.f6303a = cursor2.getColumnIndexOrThrow(b.this.mLabelColumn);
                this.f6304b = cursor2.getColumnIndexOrThrow(b.this.mIsCheckedColumn);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f6303a));
                this.f6305c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f6304b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.mInflater.inflate(this.f6306d.f6265M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AlertController f6308a;

            c(AlertController alertController) {
                this.f6308a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i8, long j8) {
                b.this.mOnClickListener.onClick(this.f6308a.f6273b, i8);
                if (b.this.mIsSingleChoice) {
                    return;
                }
                this.f6308a.f6273b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f6310a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AlertController f6311b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f6310a = recycleListView;
                this.f6311b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i8, long j8) {
                boolean[] zArr = b.this.mCheckedItems;
                if (zArr != null) {
                    zArr[i8] = this.f6310a.isItemChecked(i8);
                }
                b.this.mOnCheckboxClickListener.onClick(this.f6311b.f6273b, i8, this.f6310a.isItemChecked(i8));
            }
        }

        public interface e {
        }

        public b(Context context) {
            this.mContext = context;
            this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void a(AlertController alertController) {
            ListAdapter dVar;
            RecycleListView recycleListView = (RecycleListView) this.mInflater.inflate(alertController.f6264L, (ViewGroup) null);
            if (this.mIsMultiChoice) {
                dVar = this.mCursor == null ? new a(this.mContext, alertController.f6265M, R.id.text1, this.mItems, recycleListView) : new C0109b(this.mContext, this.mCursor, false, recycleListView, alertController);
            } else {
                int i8 = this.mIsSingleChoice ? alertController.f6266N : alertController.f6267O;
                if (this.mCursor != null) {
                    dVar = new SimpleCursorAdapter(this.mContext, i8, this.mCursor, new String[]{this.mLabelColumn}, new int[]{R.id.text1});
                } else {
                    dVar = this.mAdapter;
                    if (dVar == null) {
                        dVar = new d(this.mContext, i8, R.id.text1, this.mItems);
                    }
                }
            }
            alertController.f6260H = dVar;
            alertController.f6261I = this.mCheckedItem;
            if (this.mOnClickListener != null) {
                recycleListView.setOnItemClickListener(new c(alertController));
            } else if (this.mOnCheckboxClickListener != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.mOnItemSelectedListener;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.mIsSingleChoice) {
                recycleListView.setChoiceMode(1);
            } else if (this.mIsMultiChoice) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f6278g = recycleListView;
        }

        public void apply(AlertController alertController) {
            View view = this.mCustomTitleView;
            if (view != null) {
                alertController.setCustomTitle(view);
            } else {
                CharSequence charSequence = this.mTitle;
                if (charSequence != null) {
                    alertController.setTitle(charSequence);
                }
                Drawable drawable = this.mIcon;
                if (drawable != null) {
                    alertController.setIcon(drawable);
                }
                int i8 = this.mIconId;
                if (i8 != 0) {
                    alertController.setIcon(i8);
                }
                int i9 = this.mIconAttrId;
                if (i9 != 0) {
                    alertController.setIcon(alertController.getIconAttributeResId(i9));
                }
            }
            CharSequence charSequence2 = this.mMessage;
            if (charSequence2 != null) {
                alertController.setMessage(charSequence2);
            }
            CharSequence charSequence3 = this.mPositiveButtonText;
            if (charSequence3 != null || this.mPositiveButtonIcon != null) {
                alertController.setButton(-1, charSequence3, this.mPositiveButtonListener, null, this.mPositiveButtonIcon);
            }
            CharSequence charSequence4 = this.mNegativeButtonText;
            if (charSequence4 != null || this.mNegativeButtonIcon != null) {
                alertController.setButton(-2, charSequence4, this.mNegativeButtonListener, null, this.mNegativeButtonIcon);
            }
            CharSequence charSequence5 = this.mNeutralButtonText;
            if (charSequence5 != null || this.mNeutralButtonIcon != null) {
                alertController.setButton(-3, charSequence5, this.mNeutralButtonListener, null, this.mNeutralButtonIcon);
            }
            if (this.mItems != null || this.mCursor != null || this.mAdapter != null) {
                a(alertController);
            }
            View view2 = this.mView;
            if (view2 != null) {
                if (this.mViewSpacingSpecified) {
                    alertController.setView(view2, this.mViewSpacingLeft, this.mViewSpacingTop, this.mViewSpacingRight, this.mViewSpacingBottom);
                    return;
                } else {
                    alertController.setView(view2);
                    return;
                }
            }
            int i10 = this.mViewLayoutResId;
            if (i10 != 0) {
                alertController.setView(i10);
            }
        }
    }

    private static final class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference f6313a;

        public c(DialogInterface dialogInterface) {
            this.f6313a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == -3 || i8 == -2 || i8 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f6313a.get(), message.what);
            } else {
                if (i8 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class d extends ArrayAdapter {
        public d(Context context, int i8, int i9, CharSequence[] charSequenceArr) {
            super(context, i8, i9, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i8) {
            return i8;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, k kVar, Window window) {
        this.f6272a = context;
        this.f6273b = kVar;
        this.f6274c = window;
        this.f6270R = new c(kVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC5572j.AlertDialog, AbstractC5563a.alertDialogStyle, 0);
        this.f6262J = typedArrayObtainStyledAttributes.getResourceId(AbstractC5572j.AlertDialog_android_layout, 0);
        this.f6263K = typedArrayObtainStyledAttributes.getResourceId(AbstractC5572j.AlertDialog_buttonPanelSideLayout, 0);
        this.f6264L = typedArrayObtainStyledAttributes.getResourceId(AbstractC5572j.AlertDialog_listLayout, 0);
        this.f6265M = typedArrayObtainStyledAttributes.getResourceId(AbstractC5572j.AlertDialog_multiChoiceItemLayout, 0);
        this.f6266N = typedArrayObtainStyledAttributes.getResourceId(AbstractC5572j.AlertDialog_singleChoiceItemLayout, 0);
        this.f6267O = typedArrayObtainStyledAttributes.getResourceId(AbstractC5572j.AlertDialog_listItemLayout, 0);
        this.f6268P = typedArrayObtainStyledAttributes.getBoolean(AbstractC5572j.AlertDialog_showTitle, true);
        this.f6275d = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5572j.AlertDialog_buttonIconDimen, 0);
        typedArrayObtainStyledAttributes.recycle();
        kVar.supportRequestWindowFeature(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int d() {
        int i8 = this.f6263K;
        return i8 == 0 ? this.f6262J : this.f6269Q == 1 ? i8 : this.f6262J;
    }

    private void e(ViewGroup viewGroup, View view, int i8, int i9) {
        View viewFindViewById = this.f6274c.findViewById(AbstractC5568f.scrollIndicatorUp);
        View viewFindViewById2 = this.f6274c.findViewById(AbstractC5568f.scrollIndicatorDown);
        AbstractC0985p0.setScrollIndicators(view, i8, i9);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void f(ViewGroup viewGroup) {
        int i8;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f6286o = button;
        button.setOnClickListener(this.f6271S);
        if (TextUtils.isEmpty(this.f6287p) && this.f6289r == null) {
            this.f6286o.setVisibility(8);
            i8 = 0;
        } else {
            this.f6286o.setText(this.f6287p);
            Drawable drawable = this.f6289r;
            if (drawable != null) {
                int i9 = this.f6275d;
                drawable.setBounds(0, 0, i9, i9);
                this.f6286o.setCompoundDrawables(this.f6289r, null, null, null);
            }
            this.f6286o.setVisibility(0);
            i8 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f6290s = button2;
        button2.setOnClickListener(this.f6271S);
        if (TextUtils.isEmpty(this.f6291t) && this.f6293v == null) {
            this.f6290s.setVisibility(8);
        } else {
            this.f6290s.setText(this.f6291t);
            Drawable drawable2 = this.f6293v;
            if (drawable2 != null) {
                int i10 = this.f6275d;
                drawable2.setBounds(0, 0, i10, i10);
                this.f6290s.setCompoundDrawables(this.f6293v, null, null, null);
            }
            this.f6290s.setVisibility(0);
            i8 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f6294w = button3;
        button3.setOnClickListener(this.f6271S);
        if (TextUtils.isEmpty(this.f6295x) && this.f6297z == null) {
            this.f6294w.setVisibility(8);
        } else {
            this.f6294w.setText(this.f6295x);
            Drawable drawable3 = this.f6297z;
            if (drawable3 != null) {
                int i11 = this.f6275d;
                drawable3.setBounds(0, 0, i11, i11);
                this.f6294w.setCompoundDrawables(this.f6297z, null, null, null);
            }
            this.f6294w.setVisibility(0);
            i8 |= 4;
        }
        if (k(this.f6272a)) {
            if (i8 == 1) {
                b(this.f6286o);
            } else if (i8 == 2) {
                b(this.f6290s);
            } else if (i8 == 4) {
                b(this.f6294w);
            }
        }
        if (i8 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void g(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f6274c.findViewById(AbstractC5568f.scrollView);
        this.f6253A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f6253A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f6258F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f6277f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f6253A.removeView(this.f6258F);
        if (this.f6278g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f6253A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f6253A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f6278g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void h(ViewGroup viewGroup) {
        View viewInflate = this.f6279h;
        if (viewInflate == null) {
            viewInflate = this.f6280i != 0 ? LayoutInflater.from(this.f6272a).inflate(this.f6280i, viewGroup, false) : null;
        }
        boolean z8 = viewInflate != null;
        if (!z8 || !a(viewInflate)) {
            this.f6274c.setFlags(131072, 131072);
        }
        if (!z8) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f6274c.findViewById(AbstractC5568f.custom);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f6285n) {
            frameLayout.setPadding(this.f6281j, this.f6282k, this.f6283l, this.f6284m);
        }
        if (this.f6278g != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void i(ViewGroup viewGroup) {
        if (this.f6259G != null) {
            viewGroup.addView(this.f6259G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f6274c.findViewById(AbstractC5568f.title_template).setVisibility(8);
            return;
        }
        this.f6256D = (ImageView) this.f6274c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f6276e) || !this.f6268P) {
            this.f6274c.findViewById(AbstractC5568f.title_template).setVisibility(8);
            this.f6256D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f6274c.findViewById(AbstractC5568f.alertTitle);
        this.f6257E = textView;
        textView.setText(this.f6276e);
        int i8 = this.f6254B;
        if (i8 != 0) {
            this.f6256D.setImageResource(i8);
            return;
        }
        Drawable drawable = this.f6255C;
        if (drawable != null) {
            this.f6256D.setImageDrawable(drawable);
        } else {
            this.f6257E.setPadding(this.f6256D.getPaddingLeft(), this.f6256D.getPaddingTop(), this.f6256D.getPaddingRight(), this.f6256D.getPaddingBottom());
            this.f6256D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void j() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f6274c.findViewById(AbstractC5568f.parentPanel);
        View viewFindViewById4 = viewFindViewById3.findViewById(AbstractC5568f.topPanel);
        View viewFindViewById5 = viewFindViewById3.findViewById(AbstractC5568f.contentPanel);
        View viewFindViewById6 = viewFindViewById3.findViewById(AbstractC5568f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(AbstractC5568f.customPanel);
        h(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(AbstractC5568f.topPanel);
        View viewFindViewById8 = viewGroup.findViewById(AbstractC5568f.contentPanel);
        View viewFindViewById9 = viewGroup.findViewById(AbstractC5568f.buttonPanel);
        ViewGroup viewGroupC = c(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupC2 = c(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupC3 = c(viewFindViewById9, viewFindViewById6);
        g(viewGroupC2);
        f(viewGroupC3);
        i(viewGroupC);
        boolean z8 = viewGroup.getVisibility() != 8;
        boolean z9 = (viewGroupC == null || viewGroupC.getVisibility() == 8) ? 0 : 1;
        boolean z10 = (viewGroupC3 == null || viewGroupC3.getVisibility() == 8) ? false : true;
        if (!z10 && viewGroupC2 != null && (viewFindViewById2 = viewGroupC2.findViewById(AbstractC5568f.textSpacerNoButtons)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z9 != 0) {
            NestedScrollView nestedScrollView = this.f6253A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f6277f == null && this.f6278g == null) ? null : viewGroupC.findViewById(AbstractC5568f.titleDividerNoCustom);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupC2 != null && (viewFindViewById = viewGroupC2.findViewById(AbstractC5568f.textSpacerNoTitle)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f6278g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).setHasDecor(z9, z10);
        }
        if (!z8) {
            View view = this.f6278g;
            if (view == null) {
                view = this.f6253A;
            }
            if (view != null) {
                e(viewGroupC2, view, z9 | (z10 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f6278g;
        if (listView2 == null || (listAdapter = this.f6260H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i8 = this.f6261I;
        if (i8 > -1) {
            listView2.setItemChecked(i8, true);
            listView2.setSelection(i8);
        }
    }

    private static boolean k(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC5563a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    public Button getButton(int i8) {
        if (i8 == -3) {
            return this.f6294w;
        }
        if (i8 == -2) {
            return this.f6290s;
        }
        if (i8 != -1) {
            return null;
        }
        return this.f6286o;
    }

    public int getIconAttributeResId(int i8) {
        TypedValue typedValue = new TypedValue();
        this.f6272a.getTheme().resolveAttribute(i8, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView getListView() {
        return this.f6278g;
    }

    public void installContent() {
        this.f6273b.setContentView(d());
        j();
    }

    public boolean onKeyDown(int i8, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f6253A;
        return nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent);
    }

    public boolean onKeyUp(int i8, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f6253A;
        return nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent);
    }

    public void setButton(int i8, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f6270R.obtainMessage(i8, onClickListener);
        }
        if (i8 == -3) {
            this.f6295x = charSequence;
            this.f6296y = message;
            this.f6297z = drawable;
        } else if (i8 == -2) {
            this.f6291t = charSequence;
            this.f6292u = message;
            this.f6293v = drawable;
        } else {
            if (i8 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f6287p = charSequence;
            this.f6288q = message;
            this.f6289r = drawable;
        }
    }

    public void setButtonPanelLayoutHint(int i8) {
        this.f6269Q = i8;
    }

    public void setCustomTitle(View view) {
        this.f6259G = view;
    }

    public void setIcon(int i8) {
        this.f6255C = null;
        this.f6254B = i8;
        ImageView imageView = this.f6256D;
        if (imageView != null) {
            if (i8 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f6256D.setImageResource(this.f6254B);
            }
        }
    }

    public void setMessage(CharSequence charSequence) {
        this.f6277f = charSequence;
        TextView textView = this.f6258F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f6276e = charSequence;
        TextView textView = this.f6257E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setView(int i8) {
        this.f6279h = null;
        this.f6280i = i8;
        this.f6285n = false;
    }

    public void setView(View view) {
        this.f6279h = view;
        this.f6280i = 0;
        this.f6285n = false;
    }

    public void setIcon(Drawable drawable) {
        this.f6255C = drawable;
        this.f6254B = 0;
        ImageView imageView = this.f6256D;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.f6256D.setImageDrawable(drawable);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    public void setView(View view, int i8, int i9, int i10, int i11) {
        this.f6279h = view;
        this.f6280i = 0;
        this.f6285n = true;
        this.f6281j = i8;
        this.f6282k = i9;
        this.f6283l = i10;
        this.f6284m = i11;
    }
}

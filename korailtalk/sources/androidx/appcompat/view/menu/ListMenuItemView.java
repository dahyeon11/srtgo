package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.r0;
import androidx.core.view.AbstractC0985p0;
import h.AbstractC5563a;
import h.AbstractC5568f;
import h.AbstractC5569g;
import h.AbstractC5572j;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements l.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    private h f6525a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f6526b;

    /* renamed from: c, reason: collision with root package name */
    private RadioButton f6527c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f6528d;

    /* renamed from: e, reason: collision with root package name */
    private CheckBox f6529e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f6530f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f6531g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f6532h;

    /* renamed from: i, reason: collision with root package name */
    private LinearLayout f6533i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f6534j;

    /* renamed from: k, reason: collision with root package name */
    private int f6535k;

    /* renamed from: l, reason: collision with root package name */
    private Context f6536l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f6537m;

    /* renamed from: n, reason: collision with root package name */
    private Drawable f6538n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f6539o;

    /* renamed from: p, reason: collision with root package name */
    private LayoutInflater f6540p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f6541q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5563a.listMenuViewStyle);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i8) {
        LinearLayout linearLayout = this.f6533i;
        if (linearLayout != null) {
            linearLayout.addView(view, i8);
        } else {
            addView(view, i8);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(AbstractC5569g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f6529e = checkBox;
        a(checkBox);
    }

    private void d() {
        ImageView imageView = (ImageView) getInflater().inflate(AbstractC5569g.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f6526b = imageView;
        b(imageView, 0);
    }

    private void e() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(AbstractC5569g.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f6527c = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f6540p == null) {
            this.f6540p = LayoutInflater.from(getContext());
        }
        return this.f6540p;
    }

    private void setSubMenuArrowVisible(boolean z8) {
        ImageView imageView = this.f6531g;
        if (imageView != null) {
            imageView.setVisibility(z8 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f6532h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f6532h.getLayoutParams();
        rect.top += this.f6532h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.l.a
    public h getItemData() {
        return this.f6525a;
    }

    @Override // androidx.appcompat.view.menu.l.a
    public void initialize(h hVar, int i8) {
        this.f6525a = hVar;
        setVisibility(hVar.isVisible() ? 0 : 8);
        setTitle(hVar.e(this));
        setCheckable(hVar.isCheckable());
        setShortcut(hVar.i(), hVar.c());
        setIcon(hVar.getIcon());
        setEnabled(hVar.isEnabled());
        setSubMenuArrowVisible(hVar.hasSubMenu());
        setContentDescription(hVar.getContentDescription());
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        AbstractC0985p0.setBackground(this, this.f6534j);
        TextView textView = (TextView) findViewById(AbstractC5568f.title);
        this.f6528d = textView;
        int i8 = this.f6535k;
        if (i8 != -1) {
            textView.setTextAppearance(this.f6536l, i8);
        }
        this.f6530f = (TextView) findViewById(AbstractC5568f.shortcut);
        ImageView imageView = (ImageView) findViewById(AbstractC5568f.submenuarrow);
        this.f6531g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f6538n);
        }
        this.f6532h = (ImageView) findViewById(AbstractC5568f.group_divider);
        this.f6533i = (LinearLayout) findViewById(AbstractC5568f.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        if (this.f6526b != null && this.f6537m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f6526b.getLayoutParams();
            int i10 = layoutParams.height;
            if (i10 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i10;
            }
        }
        super.onMeasure(i8, i9);
    }

    @Override // androidx.appcompat.view.menu.l.a
    public boolean prefersCondensedTitle() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.l.a
    public void setCheckable(boolean z8) {
        CompoundButton compoundButton;
        View view;
        if (!z8 && this.f6527c == null && this.f6529e == null) {
            return;
        }
        if (this.f6525a.isExclusiveCheckable()) {
            if (this.f6527c == null) {
                e();
            }
            compoundButton = this.f6527c;
            view = this.f6529e;
        } else {
            if (this.f6529e == null) {
                c();
            }
            compoundButton = this.f6529e;
            view = this.f6527c;
        }
        if (z8) {
            compoundButton.setChecked(this.f6525a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f6529e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f6527c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.l.a
    public void setChecked(boolean z8) {
        CompoundButton compoundButton;
        if (this.f6525a.isExclusiveCheckable()) {
            if (this.f6527c == null) {
                e();
            }
            compoundButton = this.f6527c;
        } else {
            if (this.f6529e == null) {
                c();
            }
            compoundButton = this.f6529e;
        }
        compoundButton.setChecked(z8);
    }

    public void setForceShowIcon(boolean z8) {
        this.f6541q = z8;
        this.f6537m = z8;
    }

    public void setGroupDividerEnabled(boolean z8) {
        ImageView imageView = this.f6532h;
        if (imageView != null) {
            imageView.setVisibility((this.f6539o || !z8) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.l.a
    public void setIcon(Drawable drawable) {
        boolean z8 = this.f6525a.shouldShowIcon() || this.f6541q;
        if (z8 || this.f6537m) {
            ImageView imageView = this.f6526b;
            if (imageView == null && drawable == null && !this.f6537m) {
                return;
            }
            if (imageView == null) {
                d();
            }
            if (drawable == null && !this.f6537m) {
                this.f6526b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f6526b;
            if (!z8) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f6526b.getVisibility() != 0) {
                this.f6526b.setVisibility(0);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.l.a
    public void setShortcut(boolean z8, char c9) {
        int i8 = (z8 && this.f6525a.i()) ? 0 : 8;
        if (i8 == 0) {
            this.f6530f.setText(this.f6525a.d());
        }
        if (this.f6530f.getVisibility() != i8) {
            this.f6530f.setVisibility(i8);
        }
    }

    @Override // androidx.appcompat.view.menu.l.a
    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f6528d.getVisibility() != 8) {
                this.f6528d.setVisibility(8);
            }
        } else {
            this.f6528d.setText(charSequence);
            if (this.f6528d.getVisibility() != 0) {
                this.f6528d.setVisibility(0);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.l.a
    public boolean showsIcon() {
        return this.f6541q;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet);
        r0 r0VarObtainStyledAttributes = r0.obtainStyledAttributes(getContext(), attributeSet, AbstractC5572j.MenuView, i8, 0);
        this.f6534j = r0VarObtainStyledAttributes.getDrawable(AbstractC5572j.MenuView_android_itemBackground);
        this.f6535k = r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.MenuView_android_itemTextAppearance, -1);
        this.f6537m = r0VarObtainStyledAttributes.getBoolean(AbstractC5572j.MenuView_preserveIconSpacing, false);
        this.f6536l = context;
        this.f6538n = r0VarObtainStyledAttributes.getDrawable(AbstractC5572j.MenuView_subMenuArrow);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, AbstractC5563a.dropDownListViewStyle, 0);
        this.f6539o = typedArrayObtainStyledAttributes.hasValue(0);
        r0VarObtainStyledAttributes.recycle();
        typedArrayObtainStyledAttributes.recycle();
    }
}

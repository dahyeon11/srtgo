package com.korail.talk.viewGroup;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import n4.AbstractC5951b;
import n4.AbstractC5953d;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import v4.c;
import y6.C6542b;
import z4.C6630d;
import z4.N;
import z4.P;
import z4.t;

/* loaded from: classes.dex */
public class DropDownSelector extends C6542b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private int f29550a;

    /* renamed from: b, reason: collision with root package name */
    private int f29551b;

    /* renamed from: c, reason: collision with root package name */
    private int f29552c;

    /* renamed from: d, reason: collision with root package name */
    private int f29553d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f29554e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f29555f;

    /* renamed from: g, reason: collision with root package name */
    private b f29556g;

    /* renamed from: h, reason: collision with root package name */
    private View f29557h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f29558i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f29559j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f29560k;

    /* renamed from: l, reason: collision with root package name */
    private PopupWindow f29561l;

    public interface b {
        void onItemSelected(DropDownSelector dropDownSelector, int i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c extends BaseAdapter {

        private class a {

            /* renamed from: a, reason: collision with root package name */
            private TextView f29563a;

            /* renamed from: b, reason: collision with root package name */
            private TextView f29564b;

            private a() {
            }
        }

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(View view, int i8) {
            DropDownSelector.this.l();
            DropDownSelector.this.setDropDownIndex(i8);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return DropDownSelector.this.f29554e.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i8) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) {
            View viewInflate;
            a aVar;
            if (C6630d.isNull(view)) {
                aVar = new a();
                viewInflate = View.inflate(DropDownSelector.this.getContext(), AbstractC5957h.drop_down_selector_list_item_two_text, null);
                aVar.f29563a = (TextView) viewInflate.findViewById(AbstractC5955f.mainTitleTxt);
                aVar.f29564b = (TextView) viewInflate.findViewById(AbstractC5955f.subTitleTxt);
                viewInflate.setTag(aVar);
            } else {
                viewInflate = view;
                aVar = (a) view.getTag();
            }
            aVar.f29563a.setText((CharSequence) DropDownSelector.this.f29554e.get(i8));
            try {
                aVar.f29564b.setText(!DropDownSelector.this.f29555f.isEmpty() ? (CharSequence) DropDownSelector.this.f29555f.get(i8) : "");
            } catch (IndexOutOfBoundsException e8) {
                t.e(e8.getMessage());
                aVar.f29564b.setText("");
            }
            viewInflate.setOnClickListener(new v4.c(new c.a() { // from class: com.korail.talk.viewGroup.a
                @Override // v4.c.a
                public final void onCustomClick(View view2, int i9) {
                    this.f29595a.b(view2, i9);
                }
            }, i8));
            return viewInflate;
        }
    }

    public DropDownSelector(Context context) {
        super(context);
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        this.f29561l.dismiss();
    }

    private void m() {
        View.inflate(getContext(), AbstractC5957h.drop_down_selector, this);
        p();
        r();
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(View view) {
        if (view.getHeight() > this.f29551b) {
            view.getLayoutParams().height = this.f29551b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.f29560k.startAnimation(AnimationUtils.loadAnimation(getContext(), AbstractC5951b.rotation_to_left_180));
    }

    private void p() {
        this.f29551b = N.dpToPx(392.0f);
        this.f29554e = new ArrayList();
        this.f29555f = new ArrayList();
        this.f29552c = AbstractC5954e.bg_drop_down_selector_pop;
        this.f29553d = AbstractC5954e.ic_unfold_dropdown;
    }

    private void q() {
        setOnClickListener(this);
    }

    private void r() {
        this.f29557h = findViewById(AbstractC5955f.buttonView);
        this.f29558i = (TextView) findViewById(AbstractC5955f.mainTitleTxt);
        this.f29559j = (TextView) findViewById(AbstractC5955f.subTitleTxt);
        this.f29560k = (ImageView) findViewById(AbstractC5955f.toggleImg);
    }

    private void s() {
        final View viewInflate = View.inflate(getContext(), AbstractC5957h.drop_down_selector_pop, null);
        ((ListView) viewInflate.findViewById(AbstractC5955f.popList)).setAdapter((ListAdapter) new c());
        this.f29561l = new PopupWindow(viewInflate, this.f29557h.getWidth(), -2, true);
        viewInflate.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: y6.g
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f37638a.n(viewInflate);
            }
        });
        this.f29561l.setAnimationStyle(0);
        this.f29561l.setBackgroundDrawable(new ColorDrawable());
        this.f29561l.setOutsideTouchable(true);
        PopupWindow popupWindow = this.f29561l;
        View view = this.f29557h;
        popupWindow.showAsDropDown(view, 0, -view.getHeight());
        ImageView imageView = (ImageView) viewInflate.findViewById(AbstractC5955f.toggleImg);
        imageView.setImageResource(this.f29553d);
        ((ImageView) viewInflate.findViewById(AbstractC5955f.selector_pop_bg)).setBackgroundResource(this.f29552c);
        imageView.startAnimation(AnimationUtils.loadAnimation(getContext(), AbstractC5951b.rotation_to_right_180));
        this.f29561l.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: y6.h
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f37640a.o();
            }
        });
    }

    public void changeResourceId(int i8, int i9) {
        this.f29552c = i8;
        this.f29553d = i9;
        this.f29557h.setBackgroundResource(i8);
        this.f29560k.setImageResource(this.f29553d);
    }

    public int getItemSize() {
        return this.f29554e.size();
    }

    public int getSelectIndex() {
        return this.f29550a;
    }

    public String getSelectItem() {
        return getSelectItem(this.f29550a);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        P.hideIME(getContext(), view);
        if (view.getId() == getId()) {
            s();
        }
    }

    public void setDropDownIndex(int i8) {
        if (i8 < this.f29554e.size()) {
            this.f29550a = i8;
            this.f29558i.setText((CharSequence) this.f29554e.get(i8));
            if (C6630d.isNotNull(this.f29555f) && !this.f29555f.isEmpty()) {
                this.f29559j.setText((CharSequence) this.f29555f.get(i8));
            }
            if (C6630d.isNotNull(this.f29556g)) {
                this.f29556g.onItemSelected(this, this.f29550a);
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
        this.f29558i.setTextColor(androidx.core.content.a.getColor(getContext(), z8 ? AbstractC5953d.brownish_grey : AbstractC5953d.color_260c3c60));
        this.f29560k.setImageResource(z8 ? this.f29553d : AbstractC5954e.ic_unfold_dropdown_disable);
        this.f29557h.setBackgroundResource(z8 ? this.f29552c : AbstractC5954e.bg_drop_down_selector_pop_dark_disalbe);
    }

    public void setEntries(String[] strArr, String[] strArr2, int i8) {
        if (C6630d.isNotNull(strArr) && C6630d.isNotNull(strArr2) && strArr.length != strArr2.length) {
            return;
        }
        this.f29550a = i8;
        this.f29554e.clear();
        this.f29554e.addAll(Arrays.asList(strArr));
        this.f29558i.setText((CharSequence) this.f29554e.get(i8));
        if (C6630d.isNotNull(strArr2)) {
            this.f29555f.clear();
            this.f29555f.addAll(Arrays.asList(strArr2));
            this.f29559j.setText(strArr2[i8]);
        }
        this.f29559j.setVisibility(C6630d.isNotNull(strArr2) ? 0 : 8);
    }

    public void setOnSelectorItemClickListener(b bVar) {
        this.f29556g = bVar;
    }

    public void setmSelectIndex(int i8) {
        this.f29550a = i8;
        this.f29558i.setText((CharSequence) this.f29554e.get(i8));
    }

    public String getSelectItem(int i8) {
        if (!C6630d.isNotNull(this.f29554e) || this.f29554e.isEmpty() || i8 < 0) {
            return null;
        }
        return (String) this.f29554e.get(i8);
    }

    public DropDownSelector(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m();
    }

    public DropDownSelector(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        m();
    }

    public void setEntries(String str, String str2, int i8) {
        this.f29554e.remove(i8);
        this.f29554e.add(i8, str);
        this.f29555f.remove(i8);
        this.f29555f.add(i8, str2);
        this.f29558i.setText(str);
        this.f29559j.setText(str2);
    }
}

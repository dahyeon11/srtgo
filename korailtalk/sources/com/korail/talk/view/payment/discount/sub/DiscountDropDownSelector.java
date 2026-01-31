package com.korail.talk.view.payment.discount.sub;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.korail.talk.data.DiscountObjectData;
import java.util.ArrayList;
import java.util.List;
import n4.AbstractC5951b;
import n4.AbstractC5953d;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import v4.c;
import z4.C6630d;
import z4.P;

/* loaded from: classes.dex */
public class DiscountDropDownSelector extends LinearLayout implements View.OnClickListener {
    public static final int SHOW_HINT = -1;

    /* renamed from: a, reason: collision with root package name */
    private int f29429a;

    /* renamed from: b, reason: collision with root package name */
    private String f29430b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f29431c;

    /* renamed from: d, reason: collision with root package name */
    private b f29432d;

    /* renamed from: e, reason: collision with root package name */
    private View f29433e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f29434f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f29435g;

    /* renamed from: h, reason: collision with root package name */
    private PopupWindow f29436h;

    public interface b {
        void onItemSelected(DiscountDropDownSelector discountDropDownSelector, int i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c extends BaseAdapter {

        private class a {

            /* renamed from: a, reason: collision with root package name */
            private TextView f29438a;

            private a() {
            }
        }

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(View view, int i8) {
            DiscountDropDownSelector.this.e();
            if (C6630d.isNotNull(DiscountDropDownSelector.this.f29432d)) {
                DiscountDropDownSelector.this.f29432d.onItemSelected(DiscountDropDownSelector.this, i8);
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return DiscountDropDownSelector.this.f29431c.size();
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
                viewInflate = View.inflate(DiscountDropDownSelector.this.getContext(), AbstractC5957h.discount_drop_down_selector_list_item_two_text, null);
                aVar.f29438a = (TextView) viewInflate.findViewById(AbstractC5955f.mainTitleTxt);
                viewInflate.setTag(aVar);
            } else {
                viewInflate = view;
                aVar = (a) view.getTag();
            }
            aVar.f29438a.setText(((DiscountObjectData) DiscountDropDownSelector.this.f29431c.get(i8)).getTitle());
            viewInflate.setOnClickListener(new v4.c(new c.a() { // from class: com.korail.talk.view.payment.discount.sub.a
                @Override // v4.c.a
                public final void onCustomClick(View view2, int i9) {
                    this.f29473a.b(view2, i9);
                }
            }, i8));
            return viewInflate;
        }
    }

    public DiscountDropDownSelector(Context context) {
        super(context);
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.f29436h.dismiss();
    }

    private void f() {
        View.inflate(getContext(), AbstractC5957h.discount_drop_down_selector, this);
        h();
        j();
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.f29435g.startAnimation(AnimationUtils.loadAnimation(getContext(), AbstractC5951b.rotation_to_left_180));
    }

    private void h() {
        this.f29429a = -1;
        this.f29431c = new ArrayList();
    }

    private void i() {
        setOnClickListener(this);
    }

    private void j() {
        this.f29433e = findViewById(AbstractC5955f.buttonView);
        this.f29434f = (TextView) findViewById(AbstractC5955f.mainTitleTxt);
        this.f29435g = (ImageView) findViewById(AbstractC5955f.toggleImg);
    }

    private void k() {
        View viewInflate = View.inflate(getContext(), AbstractC5957h.drop_down_selector_pop, null);
        ((ListView) viewInflate.findViewById(AbstractC5955f.popList)).setAdapter((ListAdapter) new c());
        PopupWindow popupWindow = new PopupWindow(viewInflate, this.f29433e.getWidth(), -2, true);
        this.f29436h = popupWindow;
        popupWindow.setAnimationStyle(0);
        this.f29436h.setBackgroundDrawable(new ColorDrawable());
        this.f29436h.setOutsideTouchable(true);
        PopupWindow popupWindow2 = this.f29436h;
        View view = this.f29433e;
        popupWindow2.showAsDropDown(view, 0, -view.getHeight());
        ((ImageView) viewInflate.findViewById(AbstractC5955f.toggleImg)).startAnimation(AnimationUtils.loadAnimation(getContext(), AbstractC5951b.rotation_to_right_180));
        this.f29436h.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: v6.j
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f37299a.g();
            }
        });
    }

    public int getDropDownSize() {
        return this.f29431c.size();
    }

    public int getSelectIndex() {
        return this.f29429a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        P.hideIME(getContext(), view);
        if (view.getId() == getId()) {
            k();
        }
    }

    public void setDropDownData(String str, List<DiscountObjectData> list, int i8) {
        this.f29430b = str;
        this.f29429a = i8;
        setDropDownData(list);
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
        this.f29434f.setTextColor(androidx.core.content.a.getColor(getContext(), z8 ? AbstractC5953d.color_ff483270 : AbstractC5953d.color_66483270));
        this.f29435g.setImageResource(z8 ? AbstractC5954e.ic_unfold_dropdown : AbstractC5954e.ic_unfold_dropdown_disable);
    }

    public void setOnSelectorItemClickListener(b bVar) {
        this.f29432d = bVar;
    }

    public void setSelectIndex(int i8) {
        this.f29429a = i8;
        this.f29434f.setText(i8 == -1 ? this.f29430b : ((DiscountObjectData) this.f29431c.get(i8)).getTitle());
    }

    public DiscountDropDownSelector(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f();
    }

    public void setDropDownData(List<DiscountObjectData> list) {
        this.f29431c.clear();
        this.f29431c.addAll(list);
        TextView textView = this.f29434f;
        int i8 = this.f29429a;
        textView.setText(i8 == -1 ? this.f29430b : ((DiscountObjectData) this.f29431c.get(i8)).getTitle());
    }

    public DiscountDropDownSelector(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        f();
    }
}

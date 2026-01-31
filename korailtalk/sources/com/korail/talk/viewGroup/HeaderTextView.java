package com.korail.talk.viewGroup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;

/* loaded from: classes.dex */
public class HeaderTextView extends FrameLayout {
    public static final int COLLAPSE = 2;
    public static final int EXPAND = 1;

    /* renamed from: a, reason: collision with root package name */
    private ImageView f29566a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f29567b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f29568c;

    public HeaderTextView(Context context) {
        super(context);
        a();
    }

    private void a() {
        b();
        expand();
    }

    private void b() {
        addView(View.inflate(getContext(), AbstractC5957h.header_text_view, null));
        this.f29567b = (TextView) findViewById(AbstractC5955f.tv_header_title);
        this.f29568c = (TextView) findViewById(AbstractC5955f.tv_header_text);
        this.f29566a = (ImageView) findViewById(AbstractC5955f.iv_header_arrow);
    }

    public int autoExpand() {
        int iIntValue = ((Integer) this.f29566a.getTag()).intValue();
        return iIntValue != 1 ? iIntValue != 2 ? iIntValue : expand() : collapse();
    }

    public int collapse() {
        this.f29566a.setImageResource(AbstractC5954e.ic_unfold_s);
        this.f29566a.setTag(2);
        return 2;
    }

    public int expand() {
        this.f29566a.setImageResource(AbstractC5954e.ic_fold_s);
        this.f29566a.setTag(1);
        return 1;
    }

    public void setText(String str) {
        this.f29568c.setText(str);
    }

    public void setTitle(String str) {
        this.f29567b.setText(str);
    }

    public HeaderTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public HeaderTextView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        a();
    }
}

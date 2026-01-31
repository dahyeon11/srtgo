package com.korail.talk.viewGroup;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import g5.e;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import y6.C6541a;

/* loaded from: classes.dex */
public class ReserveButton extends C6541a {

    /* renamed from: a */
    private TextView f29582a;

    /* renamed from: b */
    private TextView f29583b;

    /* renamed from: c */
    private TextView f29584c;

    /* renamed from: d */
    private ImageView f29585d;

    public ReserveButton(Context context) {
        super(context);
    }

    public String getReserveContentDescription() {
        StringBuilder sb = new StringBuilder();
        if (this.f29582a.getVisibility() == 0) {
            sb.append(this.f29582a.getContentDescription());
        }
        if (this.f29584c.getVisibility() == 0) {
            sb.append(this.f29584c.getContentDescription());
        }
        return sb.toString();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        removeAllViews();
        View viewInflate = LayoutInflater.from(getContext()).inflate(AbstractC5957h.reserve_button, (ViewGroup) null);
        this.f29582a = (TextView) viewInflate.findViewById(AbstractC5955f.firstTextView);
        this.f29584c = (TextView) viewInflate.findViewById(AbstractC5955f.secondTextView);
        this.f29583b = (TextView) viewInflate.findViewById(AbstractC5955f.elevatorControlTextView);
        ImageView imageView = (ImageView) viewInflate.findViewById(AbstractC5955f.checkedLayout);
        this.f29585d = imageView;
        imageView.setVisibility(8);
        addView(viewInflate);
    }

    public void setButtonBackground(int i8) {
        if (i8 > 0) {
            setBackgroundResource(i8);
        }
    }

    public void setCheckState(boolean z8) {
        if (z8) {
            this.f29585d.setVisibility(0);
        } else {
            this.f29585d.setVisibility(8);
        }
    }

    public boolean setElevatorControlTextView(String str) {
        TextView textView = this.f29582a;
        if (textView == null) {
            return false;
        }
        if (textView.getText().toString().equals(e.STATE_NAME_NONE) || this.f29582a.getText().toString().isEmpty() || str.isEmpty()) {
            this.f29583b.setVisibility(8);
            return false;
        }
        this.f29583b.setText(str);
        this.f29583b.setVisibility(0);
        setButtonBackground(e.RES_ID_BACKGROUND_NORMAL);
        return true;
    }

    public void setFirstText(String str, int i8, int i9) {
        if (TextUtils.isEmpty(str)) {
            this.f29582a.setVisibility(8);
            return;
        }
        this.f29582a.setVisibility(0);
        this.f29582a.setText(str);
        this.f29582a.setTextColor(i8);
        TextView textView = this.f29582a;
        StringBuilder sb = new StringBuilder();
        sb.append(i9 == AbstractC5954e.ic_m ? "마일리지 " : "");
        sb.append(str);
        textView.setContentDescription(sb.toString());
        if (str.equals(e.STATE_NAME_DISCOUNT_MOM)) {
            return;
        }
        if (i9 > 0) {
            this.f29582a.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(i9), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            this.f29582a.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void setSecondText(String str, int i8, int i9) {
        if (TextUtils.isEmpty(str)) {
            this.f29584c.setVisibility(8);
            return;
        }
        this.f29584c.setVisibility(0);
        this.f29584c.setText(str);
        this.f29584c.setTextColor(i8);
        TextView textView = this.f29584c;
        StringBuilder sb = new StringBuilder();
        sb.append(i9 == AbstractC5954e.ic_m ? "마일리지 " : "");
        sb.append(str);
        textView.setContentDescription(sb.toString());
        if (i9 > 0) {
            this.f29584c.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(i9), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            this.f29584c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public ReserveButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ReserveButton(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}

package r6;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y6.C6541a;
import z4.N;

/* renamed from: r6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6180a extends C6541a {

    /* renamed from: a, reason: collision with root package name */
    private TextView f35789a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f35790b;

    public C6180a(Context context) {
        super(context);
        d();
    }

    private void d() {
        e();
    }

    private void e() {
        View.inflate(getContext(), AbstractC5957h.view_payment_product, this);
        this.f35789a = (TextView) findViewById(AbstractC5955f.tv_product_amount);
        this.f35790b = (TextView) findViewById(AbstractC5955f.tv_product_detail);
    }

    public void setAmount(Context context, int i8) {
        this.f35789a.setText(i8 > 0 ? b(AbstractC5959j.common_amount, N.getDecimalFormatString(i8)) : context.getString(AbstractC5959j.common_other_payment));
    }

    public void setProductDetail(String str) {
        this.f35790b.setText(str);
    }

    public C6180a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    public C6180a(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        d();
    }
}

package c6;

import F4.Q;
import a6.InterfaceC0837a;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import n4.AbstractC5955f;

/* renamed from: c6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1094a extends i {

    /* renamed from: b0, reason: collision with root package name */
    private final ViewGroup f11502b0;

    public C1094a(View view) {
        super(view);
        this.f11502b0 = (ViewGroup) view.findViewById(AbstractC5955f.ic_extra_product);
    }

    @Override // c6.i, c6.h
    protected void M(Bundle bundle) {
        super.M(bundle);
        TextView textView = (TextView) this.itemView.findViewById(AbstractC5955f.departureTxt);
        TextView textView2 = (TextView) this.itemView.findViewById(AbstractC5955f.arrivalTxt);
        TextView textView3 = (TextView) this.itemView.findViewById(AbstractC5955f.departureTimeTxt);
        TextView textView4 = (TextView) this.itemView.findViewById(AbstractC5955f.arrivalTimeTxt0);
        textView.setContentDescription("출발, " + ((Object) textView.getText()) + ", " + ((Object) textView3.getText()));
        textView2.setContentDescription("도착, " + ((Object) textView2.getText()) + ", " + ((Object) textView4.getText()));
    }

    @Override // c6.i, c6.h, b6.C1084a
    public void setItem(Context context, InterfaceC0837a interfaceC0837a, Bundle bundle) throws NumberFormatException {
        super.setItem(context, interfaceC0837a, bundle);
        Q.setExtraProduct(context, interfaceC0837a, bundle, this.f11502b0);
    }
}

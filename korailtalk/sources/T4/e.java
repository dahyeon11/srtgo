package T4;

import android.content.Context;
import android.os.Bundle;
import n4.AbstractC5953d;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class e extends d {
    public e(Context context, Bundle bundle) {
        super(context, bundle);
        setHeaderViewVisibility();
        setExpandViewVisibility();
        setExpandViewBackGroundResource();
    }

    public void setExpandViewBackGroundResource() {
        findViewById(AbstractC5955f.expandView).setBackgroundResource(AbstractC5953d.windowBackground);
    }

    public void setExpandViewVisibility() {
        findViewById(AbstractC5955f.expandView).setVisibility(0);
    }

    public void setHeaderViewVisibility() {
        findViewById(AbstractC5955f.headerView).setVisibility(8);
        findViewById(AbstractC5955f.passengerListDivider).setVisibility(8);
    }

    public void showNCardType() {
        setPassengerViewVisibility(1, 8);
        setPassengerViewVisibility(2, 8);
        setPassengerViewVisibility(3, 8);
        setPassengerViewVisibility(4, 8);
        setPassengerViewVisibility(5, 8);
        setPassengerViewVisibility(6, 8);
    }

    @Override // T4.d, T4.c
    protected void w() {
        super.w();
        this.f4881w = getTotalCount();
    }
}

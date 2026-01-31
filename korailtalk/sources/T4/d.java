package T4;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class d extends c {
    public d(Context context) {
        super(context);
    }

    private void E(Bundle bundle) {
        setData(bundle);
        v();
    }

    public void setData(Bundle bundle) {
        this.f4883y = bundle;
    }

    public void setPassengerViewText(int i8, String str) {
        ((TextView) this.f4862D[i8].findViewById(AbstractC5955f.titleTxt)).setText(str);
    }

    public void setPassengerViewVisibility(int i8, int i9) {
        this.f4862D[i8].setVisibility(i9);
    }

    @Override // T4.c
    protected void w() {
        this.f4882x = 0;
        this.f4881w = 9;
        this.f4865g = this.f4883y.getInt("ADULT_COUNT", 1);
        this.f4866h = this.f4883y.getInt("TEENAGER_COUNT");
        this.f4867i = this.f4883y.getInt("CHILD_COUNT");
        this.f4868j = this.f4883y.getInt("CHILD_ACCOMPANY_COUNT");
        this.f4869k = this.f4883y.getInt("SENIOR_COUNT");
        this.f4870l = this.f4883y.getInt("HIGH_DISABLE_COUNT");
        this.f4871m = this.f4883y.getInt("LOW_DISABLE_COUNT");
        this.f4872n = this.f4883y.getInt("GUIDE_DOG_COUNT");
    }

    public d(Context context, Bundle bundle) {
        super(context);
        E(bundle);
    }
}

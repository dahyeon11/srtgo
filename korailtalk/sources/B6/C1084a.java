package b6;

import a6.InterfaceC0837a;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import z4.I;

/* renamed from: b6.a */
/* loaded from: classes.dex */
public class C1084a extends RecyclerView.E {

    /* renamed from: t */
    private final Context f11436t;

    public C1084a(View view) {
        super(view);
        this.f11436t = view.getContext();
    }

    private void J(Bundle bundle) {
        int i8;
        switch (bundle.getInt("TICKET_TITLE_BG", 30)) {
            case 32:
                i8 = AbstractC5954e.bg_ticket_orange;
                break;
            case 33:
                i8 = AbstractC5954e.bg_ticket_violet;
                break;
            case 34:
                i8 = AbstractC5954e.bg_ticket_skyblue;
                break;
            case 35:
                i8 = AbstractC5954e.bg_ticket_green;
                break;
            case 36:
                i8 = AbstractC5954e.bg_ticket_purple;
                break;
            case 37:
                i8 = AbstractC5954e.bg_ticket_brown;
                break;
            default:
                i8 = AbstractC5954e.bg_ticket_blue;
                break;
        }
        this.itemView.findViewById(AbstractC5955f.ticketImg).setBackgroundResource(i8);
    }

    protected String G(int i8) {
        return I.getString(this.f11436t, i8);
    }

    protected String H(int i8, Object... objArr) {
        return I.getString(this.f11436t, i8, objArr);
    }

    protected int I(String str) {
        return I.getViewId(this.f11436t, str);
    }

    public void setItem(Context context, InterfaceC0837a interfaceC0837a, Bundle bundle) {
        J(bundle);
    }
}

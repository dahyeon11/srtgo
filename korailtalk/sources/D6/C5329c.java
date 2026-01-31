package d6;

import a6.InterfaceC0837a;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import n4.AbstractC5955f;

/* renamed from: d6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5329c extends g {

    /* renamed from: G, reason: collision with root package name */
    private final TextView f30070G;

    /* renamed from: H, reason: collision with root package name */
    private final TextView f30071H;

    public C5329c(View view) {
        super(view);
        this.f30070G = (TextView) view.findViewById(AbstractC5955f.tv_ticket_title_right);
        this.f30071H = (TextView) view.findViewById(AbstractC5955f.tv_ticket_title_left);
    }

    @Override // d6.g, b6.C1084a
    public void setItem(Context context, InterfaceC0837a interfaceC0837a, Bundle bundle) {
        super.setItem(context, interfaceC0837a, bundle);
        this.f30071H.setText(bundle.getString("DEPARTURE_DATE"));
        this.f30070G.setText(bundle.getString("TICKET_TITLE"));
    }
}

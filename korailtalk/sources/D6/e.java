package d6;

import Q7.X;
import a6.InterfaceC0837a;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import n4.AbstractC5955f;
import z4.C6630d;
import z4.C6634h;
import z4.N;

/* loaded from: classes.dex */
public class e extends g {

    /* renamed from: G, reason: collision with root package name */
    private final TextView f30077G;

    /* renamed from: H, reason: collision with root package name */
    private final TextView f30078H;

    /* renamed from: I, reason: collision with root package name */
    private final TextView f30079I;

    public e(View view) {
        super(view);
        this.f30077G = (TextView) view.findViewById(AbstractC5955f.tv_dpt_date);
        this.f30078H = (TextView) view.findViewById(AbstractC5955f.tv_arv_date);
        this.f30079I = (TextView) view.findViewById(AbstractC5955f.tv_ticket_companion);
    }

    @Override // d6.g, b6.C1084a
    public void setItem(Context context, InterfaceC0837a interfaceC0837a, Bundle bundle) {
        super.setItem(context, interfaceC0837a, bundle);
        if (bundle.containsKey("ARRIVAL_DATE")) {
            this.f30077G.setText(bundle.getString("DEPARTURE_DATE"));
            this.f30078H.setText("~ " + bundle.getString("ARRIVAL_DATE"));
        } else {
            this.f30077G.setVisibility(8);
            this.f30078H.setText(bundle.getString("DEPARTURE_DATE"));
            this.f30078H.setGravity(1);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("COMPANION_LIST_DATA");
        if (!C6630d.isNotNull(parcelableArrayList) || parcelableArrayList.isEmpty()) {
            this.f30079I.setVisibility(8);
            return;
        }
        for (int i8 = 0; i8 < parcelableArrayList.size(); i8++) {
            Bundle bundle2 = (Bundle) parcelableArrayList.get(i8);
            if (i8 == 0) {
                this.f30079I.setText(bundle2.getString("COMPANION_NAME"));
            } else {
                this.f30079I.append(bundle2.getString("COMPANION_NAME"));
            }
            this.f30079I.append("  ");
            this.f30079I.append(N.applySpannable(bundle2.getString("COMPANION_GENDER"), new ForegroundColorSpan(Color.parseColor("#cc191919")), new AbsoluteSizeSpan(N.dpToPx(13.0f))));
            this.f30079I.append(N.applySpannable(" | ", new ForegroundColorSpan(Color.parseColor("#CCCCCC")), new AbsoluteSizeSpan(N.dpToPx(13.0f))));
            this.f30079I.append(N.applySpannable(C6634h.convertFormat(bundle2.getString("COMPANION_BIRTH"), "yyyyMMdd", "yyyy.MM.dd"), new ForegroundColorSpan(Color.parseColor("#cc191919")), new AbsoluteSizeSpan(N.dpToPx(13.0f))));
            if (i8 < parcelableArrayList.size() - 1) {
                this.f30079I.append(X.LF);
            }
        }
        this.f30079I.setVisibility(0);
    }
}

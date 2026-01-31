package v5;

import java.util.ArrayList;
import k0.AbstractC5837a;
import n4.AbstractC5954e;
import u5.C6419a;
import z4.N;

/* loaded from: classes.dex */
public class f extends m {
    public static final String TAG = "JungBuInsideLineFragment";

    public static com.korail.talk.view.base.a newInstance() {
        return new f();
    }

    @Override // v5.m
    protected int E0() {
        return AbstractC5954e.circle_border_station_07;
    }

    @Override // v5.m
    protected String F0() {
        return "map_07.png";
    }

    @Override // v5.m
    protected int G0() {
        return AbstractC5954e.square_border_station_07;
    }

    @Override // v5.m
    protected ArrayList H0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C6419a("0529", "부발", false, N.dpToPx(143.0f), N.dpToPx(37.0f)));
        arrayList.add(new C6419a("0530", "가남", false, N.dpToPx(183.0f), N.dpToPx(75.0f)));
        arrayList.add(new C6419a("0532", "앙성온천", false, N.dpToPx(208.0f), N.dpToPx(112.0f)));
        arrayList.add(new C6419a("0531", "감곡장호원", false, N.dpToPx(78.0f), N.dpToPx(150.0f)));
        arrayList.add(new C6419a("0073", "충주", false, N.dpToPx(217.0f), N.dpToPx(160.0f)));
        arrayList.add(new C6419a("0536", "판교(경기)", false, N.dpToPx(53.0f), N.dpToPx(106.0f)));
        return arrayList;
    }

    @Override // v5.m, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }
}

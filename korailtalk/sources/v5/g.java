package v5;

import java.util.ArrayList;
import k0.AbstractC5837a;
import n4.AbstractC5954e;
import u5.C6419a;
import z4.N;

/* loaded from: classes.dex */
public class g extends m {
    public static final String TAG = "JungangLineFragment";

    public static com.korail.talk.view.base.a newInstance() {
        return new g();
    }

    @Override // v5.m
    protected int E0() {
        return AbstractC5954e.circle_border_station_06;
    }

    @Override // v5.m
    protected String F0() {
        return "map_06.png";
    }

    @Override // v5.m
    protected int G0() {
        return AbstractC5954e.square_border_station_06;
    }

    @Override // v5.m
    protected ArrayList H0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C6419a("0091", "양평", false, N.dpToPx(145.0f), N.dpToPx(20.0f)));
        arrayList.add(new C6419a("0090", "청량리", true, N.dpToPx(73.0f), N.dpToPx(37.0f)));
        arrayList.add(new C6419a("0092", "원주", false, N.dpToPx(190.0f), N.dpToPx(73.0f)));
        arrayList.add(new C6419a("0093", "제천", false, N.dpToPx(228.0f), N.dpToPx(112.0f)));
        arrayList.add(new C6419a("0524", "서원주", false, N.dpToPx(104.0f), N.dpToPx(122.0f)));
        arrayList.add(new C6419a("0098", "영주", false, N.dpToPx(265.0f), N.dpToPx(152.0f)));
        arrayList.add(new C6419a("0096", "단양", false, N.dpToPx(148.0f), N.dpToPx(160.0f)));
        arrayList.add(new C6419a("0097", "풍기", false, N.dpToPx(176.0f), N.dpToPx(200.0f)));
        arrayList.add(new C6419a("0100", "안동", false, N.dpToPx(264.0f), N.dpToPx(213.0f)));
        arrayList.add(new C6419a("0001", "서울", true, N.dpToPx(36.0f), N.dpToPx(100.0f)));
        return arrayList;
    }

    @Override // v5.m, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }
}

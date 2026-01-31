package v5;

import java.util.ArrayList;
import k0.AbstractC5837a;
import n4.AbstractC5954e;
import u5.C6419a;
import z4.N;

/* renamed from: v5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6433a extends m {
    public static final String TAG = "GangneungLineFragment";

    public static com.korail.talk.view.base.a newInstance() {
        return new C6433a();
    }

    @Override // v5.m
    protected int E0() {
        return AbstractC5954e.circle_border_station_05;
    }

    @Override // v5.m
    protected String F0() {
        return "map_05.png";
    }

    @Override // v5.m
    protected int G0() {
        return AbstractC5954e.square_border_station_05;
    }

    @Override // v5.m
    protected ArrayList H0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C6419a("0516", "횡성", false, N.dpToPx(135.0f), N.dpToPx(4.0f)));
        arrayList.add(new C6419a("0090", "청량리", true, N.dpToPx(38.0f), N.dpToPx(32.0f)));
        arrayList.add(new C6419a("0519", "진부(오대산)", true, N.dpToPx(198.0f), N.dpToPx(34.0f)));
        arrayList.add(new C6419a("0115", "강릉", true, N.dpToPx(278.0f), N.dpToPx(40.0f)));
        arrayList.add(new C6419a("0635", "상봉", false, N.dpToPx(110.0f), N.dpToPx(44.0f)));
        arrayList.add(new C6419a("0001", "서울", true, N.dpToPx(12.0f), N.dpToPx(110.0f)));
        arrayList.add(new C6419a("0262", "정동진", true, N.dpToPx(288.0f), N.dpToPx(80.0f)));
        arrayList.add(new C6419a("0091", "양평", false, N.dpToPx(91.0f), N.dpToPx(106.0f)));
        arrayList.add(new C6419a("0518", "평창", true, N.dpToPx(206.0f), N.dpToPx(114.0f)));
        arrayList.add(new C6419a("0113", "동해", true, N.dpToPx(288.0f), N.dpToPx(122.0f)));
        arrayList.add(new C6419a("0326", "만종", false, N.dpToPx(92.0f), N.dpToPx(184.0f)));
        arrayList.add(new C6419a("0114", "묵호", false, N.dpToPx(228.0f), N.dpToPx(156.0f)));
        arrayList.add(new C6419a("0517", "둔내", false, N.dpToPx(165.0f), N.dpToPx(186.0f)));
        arrayList.add(new C6419a("0524", "서원주", true, N.dpToPx(82.0f), N.dpToPx(145.0f)));
        arrayList.add(new C6419a("0390", "행신", true, N.dpToPx(12.0f), N.dpToPx(70.0f)));
        return arrayList;
    }

    @Override // v5.m, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }
}

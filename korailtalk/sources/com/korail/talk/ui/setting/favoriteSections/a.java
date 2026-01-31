package com.korail.talk.ui.setting.favoriteSections;

import V4.b;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.core.widget.NestedScrollView;
import com.kakao.sdk.user.Constants;
import com.korail.talk.data.StationNameData;
import com.korail.talk.database.model.FavoriteStation;
import com.korail.talk.ui.booking.option.station.StationSearch;
import g5.e;
import java.util.List;
import k0.AbstractC5837a;
import n4.AbstractC5951b;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import q4.C6111b;
import v4.g;
import y6.C6550j;
import z4.C6630d;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class a extends com.korail.talk.view.base.a implements g, b.a, StationSearch.e, View.OnClickListener {
    public static final String TAG = "FavoriteSectionEditFragment";

    /* renamed from: d0, reason: collision with root package name */
    private int f28783d0;

    /* renamed from: e0, reason: collision with root package name */
    private String f28784e0;

    /* renamed from: f0, reason: collision with root package name */
    private String f28785f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f28786g0;

    /* renamed from: h0, reason: collision with root package name */
    private NestedScrollView f28787h0;

    /* renamed from: i0, reason: collision with root package name */
    private ViewGroup f28788i0;

    /* renamed from: j0, reason: collision with root package name */
    private V4.b f28789j0;

    /* renamed from: k0, reason: collision with root package name */
    private StationSearch f28790k0;

    /* renamed from: l0, reason: collision with root package name */
    private c f28791l0;

    /* renamed from: com.korail.talk.ui.setting.favoriteSections.a$a, reason: collision with other inner class name */
    class AnimationAnimationListenerC0250a implements Animation.AnimationListener {
        AnimationAnimationListenerC0250a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            a.this.F0();
        }
    }

    class b implements Animation.AnimationListener {
        b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            a.this.f28790k0.setVisibility(8);
            a.this.f28786g0 = false;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            a.this.f28786g0 = true;
        }
    }

    public interface c {
        void callFavoriteSectionList();
    }

    private void B0() throws Resources.NotFoundException {
        if (this.f28790k0.getVisibility() == 8) {
            return;
        }
        this.f28789j0.unSelectStation();
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getApplicationContext(), AbstractC5951b.bottom_view_slide_down);
        animationLoadAnimation.setAnimationListener(new b());
        this.f28790k0.startAnimation(animationLoadAnimation);
        t0(this.f28790k0);
    }

    private boolean C0(String str, String str2) {
        List<FavoriteStation> favoriteStationList = C6111b.getInstance().getFavoriteStationList();
        for (int i8 = 0; i8 < favoriteStationList.size(); i8++) {
            FavoriteStation favoriteStation = favoriteStationList.get(i8);
            if (str.equals(favoriteStation.getStartStation()) && str2.equals(favoriteStation.getArrivalStation())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D0(DialogInterface dialogInterface, int i8) {
        this.f28791l0.callFavoriteSectionList();
        onBackFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E0() {
        this.f28787h0.scrollTo(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0() {
        this.f28787h0.post(new Runnable() { // from class: X5.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f5466a.E0();
            }
        });
    }

    private void G0() {
        this.f28783d0 = -1;
        this.f28784e0 = "";
        this.f28785f0 = "";
    }

    private void H0() {
        this.f28789j0.setOnReverseStationsListener(this);
        this.f28790k0.setOnChangeStationListener(this);
        this.f28790k0.setHideEventListener(this);
        p0(AbstractC5955f.saveBtn).setOnClickListener(this);
    }

    private void I0() {
        Bundle arguments = getArguments();
        if (C6630d.isNull(arguments)) {
            this.f28789j0.setStationInfo(getString(AbstractC5959j.favorite_route_station_name), getString(AbstractC5959j.favorite_route_station_name), 0, 8);
            return;
        }
        this.f28783d0 = arguments.getInt(Constants.ID);
        this.f28784e0 = arguments.getString(e.KEY_TRAIN_DEPARTURE);
        String string = arguments.getString(e.KEY_TRAIN_ARRIVAL);
        this.f28785f0 = string;
        this.f28789j0.setStationInfo(this.f28784e0, string, 0, 8);
    }

    private void J0() {
    }

    private void K0() {
        if (!C6630d.isNull(getActivity())) {
            getActivity().findViewById(AbstractC5955f.addBtn).setVisibility(4);
        }
        this.f28787h0 = (NestedScrollView) p0(AbstractC5955f.scrollView);
        this.f28788i0 = (ViewGroup) p0(AbstractC5955f.optionsContainer);
        V4.b bVar = new V4.b(getActivity());
        this.f28789j0 = bVar;
        this.f28788i0.addView(bVar);
        int childCount = this.f28788i0.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = this.f28788i0.getChildAt(i8);
            if (childAt instanceof C6550j) {
                ((C6550j) childAt).setHeaderClickListener(this);
            }
        }
        this.f28790k0 = (StationSearch) p0(AbstractC5955f.stationSearchView);
    }

    private void L0(StationSearch.c cVar) throws Resources.NotFoundException {
        this.f28790k0.initSearchEdit();
        this.f28790k0.setStartArrivalType(cVar);
        if (this.f28790k0.getVisibility() == 0) {
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getApplicationContext(), AbstractC5951b.bottom_view_slide_up);
        this.f28790k0.setVisibility(0);
        animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC0250a());
        this.f28790k0.startAnimation(animationLoadAnimation);
    }

    public static a newInstance() {
        return new a();
    }

    @Override // com.korail.talk.view.base.a, n6.j
    public boolean appBack() throws Resources.NotFoundException {
        StationSearch stationSearch = this.f28790k0;
        if (stationSearch == null || stationSearch.getVisibility() == 8 || this.f28786g0) {
            return true;
        }
        B0();
        return false;
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            G0();
            K0();
            J0();
            H0();
            I0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f28791l0 = (c) context;
    }

    @Override // com.korail.talk.ui.booking.option.station.StationSearch.e
    public void onChangeStation(StationNameData stationNameData) throws Resources.NotFoundException {
        if (!N.isNull(stationNameData.getDepartureStationName())) {
            this.f28784e0 = stationNameData.getDepartureStationName();
        }
        if (!N.isNull(stationNameData.getArrivalStationName())) {
            this.f28785f0 = stationNameData.getArrivalStationName();
        }
        if (N.isNull(this.f28784e0)) {
            this.f28789j0.setStationInfo(getString(AbstractC5959j.favorite_route_station_name), this.f28785f0, 0, 8);
        } else if (N.isNull(this.f28785f0)) {
            this.f28789j0.setStationInfo(this.f28784e0, getString(AbstractC5959j.favorite_route_station_name), 0, 8);
        } else {
            this.f28789j0.setStationInfo(this.f28784e0, this.f28785f0, 0, 8);
        }
        B0();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Resources.NotFoundException {
        String string;
        t0(view);
        int id = view.getId();
        if (AbstractC5955f.v_station_search == id) {
            B0();
            return;
        }
        if (AbstractC5955f.saveBtn == id) {
            String str = this.f28784e0;
            String str2 = this.f28785f0;
            if (str.length() == 0) {
                C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.favorite_route_select_departure_station)).showDialog();
                return;
            }
            if (str2.length() == 0) {
                C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.favorite_route_select_arrival_station)).showDialog();
                return;
            }
            if (str.equals(str2)) {
                C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.favorite_route_select_diff_station)).showDialog();
                return;
            }
            FavoriteStation favoriteStation = new FavoriteStation();
            favoriteStation.setStartStation(str);
            favoriteStation.setArrivalStation(str2);
            if (C0(str, str2)) {
                C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.favorite_route_already_saved_route)).showDialog();
                return;
            }
            int i8 = this.f28783d0;
            if (i8 > -1) {
                favoriteStation.setId(i8);
                C6111b.getInstance().updateFavoriteSection(favoriteStation);
                string = getString(AbstractC5959j.favorite_route_modified);
            } else {
                C6111b.getInstance().insertFavoriteSection(favoriteStation);
                string = String.format(getString(AbstractC5959j.favorite_route_saved_favorite), str, str2);
            }
            C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(string).setButtonListener(new DialogInterface.OnClickListener() { // from class: X5.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i9) {
                    this.f5465a.D0(dialogInterface, i9);
                }
            }).showDialog();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.favorite_section_edit_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (C6630d.isNull(getActivity())) {
            return;
        }
        getActivity().findViewById(AbstractC5955f.addBtn).setVisibility(0);
    }

    @Override // v4.g
    public void onOptionHeaderClick(C6550j c6550j, boolean z8) throws Resources.NotFoundException {
        if (c6550j != null && (c6550j instanceof V4.b)) {
            V4.b bVar = (V4.b) c6550j;
            if (bVar.isDepartureSelected()) {
                L0(StationSearch.c.START);
            } else if (bVar.isArrivalSelected()) {
                L0(StationSearch.c.ARRIVAL);
            }
        }
    }

    @Override // V4.b.a
    public void onReverseStation() {
        String str = this.f28784e0;
        String str2 = this.f28785f0;
        this.f28784e0 = str2;
        this.f28785f0 = str;
        if (N.isNull(str2) && N.isNull(this.f28785f0)) {
            return;
        }
        if (N.isNull(this.f28784e0)) {
            this.f28789j0.setStationInfo(getString(AbstractC5959j.favorite_route_station_name), this.f28785f0, 0, 8);
        } else if (N.isNull(this.f28785f0)) {
            this.f28789j0.setStationInfo(this.f28784e0, getString(AbstractC5959j.favorite_route_station_name), 0, 8);
        } else {
            this.f28789j0.setStationInfo(this.f28784e0, this.f28785f0, 0, 8);
        }
    }
}

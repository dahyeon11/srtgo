package com.korail.talk.ui.booking.option.station;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.korail.talk.data.DistanceStationData;
import com.korail.talk.data.StationNameData;
import com.korail.talk.database.model.FavoriteStation;
import com.korail.talk.database.model.StationData;
import com.korail.talk.database.model.ZRecentStation;
import com.korail.talk.view.indexbar.IndexBarRecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import n4.l;
import p6.C6059a;
import q4.C6111b;
import q6.InterfaceC6114a;
import v4.c;
import y6.C6543c;
import z4.C6625A;
import z4.C6630d;
import z4.L;
import z4.M;
import z4.N;
import z4.P;

/* loaded from: classes.dex */
public class StationSearch extends C6543c implements View.OnClickListener, TextWatcher, TextView.OnEditorActionListener {
    public final int MODE_BENEFIT_STATION;
    public final int MODE_FAVORITE_STATION;
    public final int MODE_ROUTE_STATION;

    /* renamed from: a, reason: collision with root package name */
    private c f27893a;

    /* renamed from: b, reason: collision with root package name */
    private int f27894b;

    /* renamed from: c, reason: collision with root package name */
    private I4.c f27895c;

    /* renamed from: d, reason: collision with root package name */
    private List f27896d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f27897e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f27898f;

    /* renamed from: g, reason: collision with root package name */
    private List f27899g;

    /* renamed from: h, reason: collision with root package name */
    private e f27900h;

    /* renamed from: i, reason: collision with root package name */
    private EditText f27901i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f27902j;

    /* renamed from: k, reason: collision with root package name */
    private IndexBarRecyclerView f27903k;

    /* renamed from: l, reason: collision with root package name */
    private f f27904l;

    class a extends GridLayoutManager.c {
        a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int getSpanSize(int i8) {
            if (N.getText(StationSearch.this.f27901i).length() > 0) {
                return 1;
            }
            g type = ((DistanceStationData) StationSearch.this.f27898f.get(i8)).getType();
            if (g.HEADER == type || g.ONE_COLUMN_STATION == type) {
                return 2;
            }
            g gVar = g.HEADER;
            return 1;
        }
    }

    class b extends RecyclerView.u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrollStateChanged(RecyclerView recyclerView, int i8) {
            super.onScrollStateChanged(recyclerView, i8);
            if (i8 == 1) {
                P.hideIME(StationSearch.this.getContext(), recyclerView);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            super.onScrolled(recyclerView, i8, i9);
        }
    }

    public enum c {
        START,
        ARRIVAL
    }

    private static class d implements Comparator {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // java.util.Comparator
        public int compare(DistanceStationData distanceStationData, DistanceStationData distanceStationData2) {
            return Double.compare(Double.parseDouble(distanceStationData.getMajor()), Double.parseDouble(distanceStationData2.getMajor()));
        }
    }

    public interface e {
        void onChangeStation(StationNameData stationNameData);
    }

    public class f extends RecyclerView.h implements InterfaceC6114a, c.a {

        /* renamed from: d, reason: collision with root package name */
        private LinkedHashMap f27908d;

        class a extends RecyclerView.E {

            /* renamed from: t, reason: collision with root package name */
            TextView f27910t;

            a(View view) {
                super(view);
                this.f27910t = (TextView) view.findViewById(AbstractC5955f.tv_search_header);
            }
        }

        class b extends RecyclerView.E {

            /* renamed from: t, reason: collision with root package name */
            TextView f27912t;

            b(View view) {
                super(view);
                this.f27912t = (TextView) view.findViewById(AbstractC5955f.stationNameTxt);
            }
        }

        public f() {
        }

        void b(LinkedHashMap linkedHashMap) {
            this.f27908d = linkedHashMap;
        }

        @Override // q6.InterfaceC6114a
        public LinkedHashMap<String, Integer> getIndexCharacterMap() {
            return this.f27908d;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return StationSearch.this.f27898f.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i8) {
            return g.HEADER == ((DistanceStationData) StationSearch.this.f27898f.get(i8)).getType() ? 0 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(RecyclerView.E e8, int i8) {
            DistanceStationData distanceStationData = (DistanceStationData) StationSearch.this.f27898f.get(i8);
            if (e8 instanceof a) {
                ((a) e8).f27910t.setText(distanceStationData.getStationName());
                return;
            }
            g type = distanceStationData.getType();
            b bVar = (b) e8;
            bVar.f27912t.setText(distanceStationData.getStationName());
            if (g.ONE_COLUMN_STATION == type) {
                bVar.f27912t.append(" - " + distanceStationData.getArrivalStationName());
            }
            bVar.f27912t.setOnClickListener(new v4.c(this, i8));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public RecyclerView.E onCreateViewHolder(ViewGroup viewGroup, int i8) {
            return i8 == 0 ? new a(View.inflate(StationSearch.this.getContext(), AbstractC5957h.station_list_item_header, null)) : new b(View.inflate(StationSearch.this.getContext(), AbstractC5957h.station_list_item_station, null));
        }

        @Override // v4.c.a
        public void onCustomClick(View view, int i8) {
            DistanceStationData distanceStationData = (DistanceStationData) StationSearch.this.f27898f.get(i8);
            StationNameData stationNameData = new StationNameData();
            if (g.ONE_COLUMN_STATION == distanceStationData.getType()) {
                stationNameData.setDepartureStationName(distanceStationData.getStationName());
                stationNameData.setArrivalStationName(distanceStationData.getArrivalStationName());
            } else if (c.START == StationSearch.this.f27893a) {
                stationNameData.setDepartureStationName(distanceStationData.getStationName());
            } else {
                stationNameData.setArrivalStationName(distanceStationData.getStationName());
            }
            if (C6630d.isNotNull(StationSearch.this.f27900h)) {
                StationSearch.this.f27900h.onChangeStation(stationNameData);
            }
        }
    }

    public enum g {
        HEADER,
        ONE_COLUMN_STATION,
        TWO_COLUMN_STATION
    }

    public StationSearch(Context context) throws Resources.NotFoundException {
        super(context);
        this.MODE_ROUTE_STATION = 0;
        this.MODE_BENEFIT_STATION = 1;
        this.MODE_FAVORITE_STATION = 2;
        h(null);
    }

    private List g(String str) {
        ArrayList arrayList = new ArrayList();
        List<StationData> dBStationList = getDBStationList();
        for (int i8 = 0; i8 < dBStationList.size(); i8++) {
            String group = dBStationList.get(i8).getGroup();
            if (C6630d.isNotNull(group) && group.equals(str)) {
                DistanceStationData distanceStationData = new DistanceStationData();
                distanceStationData.setIndex(i8);
                distanceStationData.setStationName(dBStationList.get(i8).getStnNm());
                distanceStationData.setType(g.TWO_COLUMN_STATION);
                arrayList.add(distanceStationData);
            }
        }
        return arrayList;
    }

    private List<StationData> getDBStationList() {
        if (C6630d.isNull(this.f27899g) || this.f27899g.size() == 0) {
            this.f27899g = C6111b.getInstance().getAllStationList();
        }
        return this.f27899g;
    }

    private List<DistanceStationData> getFavoriteStationList() {
        ArrayList arrayList = new ArrayList();
        List<FavoriteStation> favoriteStationList = C6111b.getInstance().getFavoriteStationList();
        Collections.reverse(favoriteStationList);
        for (int i8 = 0; i8 < favoriteStationList.size(); i8++) {
            DistanceStationData distanceStationData = new DistanceStationData();
            distanceStationData.setIndex(i8);
            distanceStationData.setStationName(favoriteStationList.get(i8).getStartStation());
            distanceStationData.setArrivalStationName(favoriteStationList.get(i8).getArrivalStation());
            distanceStationData.setType(g.ONE_COLUMN_STATION);
            arrayList.add(distanceStationData);
        }
        return arrayList;
    }

    private List<DistanceStationData> getMajorStationList() {
        ArrayList arrayList = new ArrayList();
        List<StationData> dBStationList = getDBStationList();
        for (int i8 = 0; i8 < dBStationList.size(); i8++) {
            if (dBStationList.get(i8).getMajor() != null) {
                DistanceStationData distanceStationData = new DistanceStationData();
                distanceStationData.setIndex(i8);
                distanceStationData.setStationName(dBStationList.get(i8).getStnNm());
                distanceStationData.setMajor(dBStationList.get(i8).getMajor());
                distanceStationData.setType(g.TWO_COLUMN_STATION);
                arrayList.add(distanceStationData);
            }
        }
        Collections.sort(arrayList, new d(null));
        return arrayList;
    }

    private List<DistanceStationData> getRecentStationList() {
        ArrayList arrayList = new ArrayList();
        List<ZRecentStation> recentStationList = C6111b.getInstance().getRecentStationList();
        for (int i8 = 0; i8 < recentStationList.size(); i8++) {
            DistanceStationData distanceStationData = new DistanceStationData();
            distanceStationData.setIndex(i8);
            distanceStationData.setStationName(recentStationList.get(i8).getStartStation());
            distanceStationData.setArrivalStationName(recentStationList.get(i8).getArrivalStation());
            distanceStationData.setType(g.ONE_COLUMN_STATION);
            arrayList.add(distanceStationData);
        }
        return arrayList;
    }

    private void h(AttributeSet attributeSet) throws Resources.NotFoundException {
        setData(attributeSet);
        l();
        i();
    }

    private void i() {
        this.f27901i.addTextChangedListener(this);
        this.f27901i.setOnEditorActionListener(this);
        this.f27902j.setOnClickListener(this);
        this.f27903k.addOnScrollListener(new b());
    }

    private LinkedHashMap j() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i8 = 0; i8 < this.f27897e.size(); i8++) {
            DistanceStationData distanceStationData = (DistanceStationData) this.f27897e.get(i8);
            if (g.HEADER == distanceStationData.getType()) {
                String upperCase = distanceStationData.getStationName().substring(0, 1).toUpperCase();
                if (!linkedHashMap.containsKey(upperCase)) {
                    linkedHashMap.put(upperCase, Integer.valueOf(i8));
                }
            }
        }
        return linkedHashMap;
    }

    private void k() throws Resources.NotFoundException {
        if (this.f27894b == 0) {
            if (this.f27895c.isProviderEnabledLastKnownLocation()) {
                List<DistanceStationData> nearStationList = M.getNearStationList(this.f27895c.getLastKnownLocation());
                if (C6630d.isNotNull(nearStationList) && !nearStationList.isEmpty()) {
                    DistanceStationData distanceStationData = new DistanceStationData();
                    distanceStationData.setStationName(getContext().getString(AbstractC5959j.booking_near_station));
                    distanceStationData.setType(g.HEADER);
                    this.f27897e.add(distanceStationData);
                    this.f27897e.addAll(nearStationList);
                }
            }
            List<DistanceStationData> recentStationList = getRecentStationList();
            if (C6630d.isNotNull(recentStationList) && !recentStationList.isEmpty()) {
                DistanceStationData distanceStationData2 = new DistanceStationData();
                distanceStationData2.setStationName(getContext().getString(AbstractC5959j.booking_recent_station));
                distanceStationData2.setType(g.HEADER);
                this.f27897e.add(distanceStationData2);
                this.f27897e.addAll(recentStationList);
            }
            List<DistanceStationData> favoriteStationList = getFavoriteStationList();
            if (C6630d.isNotNull(favoriteStationList) && !favoriteStationList.isEmpty()) {
                DistanceStationData distanceStationData3 = new DistanceStationData();
                distanceStationData3.setStationName(getContext().getString(AbstractC5959j.booking_favorite_station));
                distanceStationData3.setType(g.HEADER);
                this.f27897e.add(distanceStationData3);
                this.f27897e.addAll(favoriteStationList);
            }
        }
        List<DistanceStationData> majorStationList = getMajorStationList();
        if (C6630d.isNotNull(majorStationList) && !majorStationList.isEmpty()) {
            DistanceStationData distanceStationData4 = new DistanceStationData();
            distanceStationData4.setStationName(getContext().getString(AbstractC5959j.booking_major_station));
            distanceStationData4.setType(g.HEADER);
            this.f27897e.add(distanceStationData4);
            this.f27897e.addAll(majorStationList);
        }
        String[] stringArray = getResources().getStringArray(AbstractC5952c.korean_index_initial);
        int i8 = 0;
        while (i8 < stringArray.length) {
            int i9 = i8 + 1;
            List listG = g(String.valueOf(i9));
            if (listG.size() > 0) {
                DistanceStationData distanceStationData5 = new DistanceStationData();
                distanceStationData5.setStationName(stringArray[i8]);
                distanceStationData5.setType(g.HEADER);
                this.f27897e.add(distanceStationData5);
                this.f27897e.addAll(listG);
            }
            i8 = i9;
        }
        this.f27898f = C6625A.clone(this.f27897e);
    }

    private void l() {
        View.inflate(getContext(), AbstractC5957h.station_search, this).setClickable(true);
        this.f27901i = (EditText) findViewById(AbstractC5955f.stationNameEdit);
        this.f27902j = (ImageView) findViewById(AbstractC5955f.stationNameEditDelete);
        IndexBarRecyclerView indexBarRecyclerView = (IndexBarRecyclerView) findViewById(AbstractC5955f.stationList);
        this.f27903k = indexBarRecyclerView;
        indexBarRecyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.setSpanSizeLookup(new a());
        this.f27903k.setLayoutManager(gridLayoutManager);
        f fVar = new f();
        this.f27904l = fVar;
        fVar.b(j());
        this.f27903k.setAdapter(this.f27904l);
        this.f27903k.addItemDecoration(new C6059a(getContext()));
    }

    private void setData(AttributeSet attributeSet) throws Resources.NotFoundException {
        setLocationManager();
        this.f27896d = M.getAllNearStationList();
        this.f27897e = new ArrayList();
        this.f27898f = new ArrayList();
        this.f27894b = 0;
        if (C6630d.isNotNull(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, l.StationSearch);
            this.f27894b = typedArrayObtainStyledAttributes.getInt(l.StationSearch_searchMode, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f27894b == 2) {
            k();
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
    }

    public void initSearchEdit() {
        this.f27901i.setText("");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.stationNameEditDelete == view.getId()) {
            initSearchEdit();
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
        if (6 != i8) {
            return false;
        }
        P.hideIME(getContext(), getWindowToken());
        return false;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        boolean z8 = N.getText(charSequence.toString()).length() == 0;
        this.f27902j.setVisibility(z8 ? 8 : 0);
        if (z8) {
            this.f27898f = C6625A.clone(this.f27897e);
        } else {
            ArrayList arrayList = new ArrayList();
            List list = this.f27896d;
            for (int i11 = 0; i11 < list.size(); i11++) {
                String stationName = ((DistanceStationData) list.get(i11)).getStationName();
                if (N.isNotNull(stationName) && L.matchString(stationName, N.getText(charSequence.toString()))) {
                    arrayList.add((DistanceStationData) list.get(i11));
                }
            }
            this.f27898f.clear();
            this.f27898f.addAll(arrayList);
        }
        this.f27903k.initCharacter();
        this.f27904l.b(z8 ? j() : null);
        this.f27904l.notifyDataSetChanged();
    }

    public void refreshList() throws Resources.NotFoundException {
        if (this.f27894b == 0) {
            this.f27897e.clear();
            this.f27898f.clear();
            k();
            this.f27904l.b(j());
            this.f27904l.notifyDataSetChanged();
        }
    }

    public void setBenefitStationsData(List<DistanceStationData> list) {
        this.f27894b = 1;
        if (C6630d.isNotNull(list) && list.size() > 0) {
            this.f27896d.clear();
            this.f27897e.clear();
            DistanceStationData distanceStationData = new DistanceStationData();
            distanceStationData.setStationName(getContext().getString(AbstractC5959j.booking_major_station));
            distanceStationData.setType(g.HEADER);
            this.f27897e.add(distanceStationData);
            this.f27896d.addAll(list);
            this.f27897e.addAll(this.f27896d);
        }
        this.f27898f = C6625A.clone(this.f27897e);
    }

    public void setHideEventListener(View.OnClickListener onClickListener) {
        findViewById(AbstractC5955f.v_station_search).setOnClickListener(onClickListener);
    }

    public void setLocationManager() {
        I4.c cVar = new I4.c();
        this.f27895c = cVar;
        cVar.requestLocationUpdates(getContext());
    }

    public void setOnChangeStationListener(e eVar) {
        this.f27900h = eVar;
    }

    public void setStartArrivalType(c cVar) {
        this.f27893a = cVar;
    }

    public StationSearch(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.MODE_ROUTE_STATION = 0;
        this.MODE_BENEFIT_STATION = 1;
        this.MODE_FAVORITE_STATION = 2;
        h(attributeSet);
    }

    public StationSearch(Context context, AttributeSet attributeSet, int i8) throws Resources.NotFoundException {
        super(context, attributeSet, i8);
        this.MODE_ROUTE_STATION = 0;
        this.MODE_BENEFIT_STATION = 1;
        this.MODE_FAVORITE_STATION = 2;
        h(attributeSet);
    }
}

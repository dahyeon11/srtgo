package com.korail.talk.ui.booking.option.station;

import android.content.Context;
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
import com.korail.talk.network.dao.common.StationDataDao;
import com.korail.talk.ui.booking.option.station.StationSearch;
import com.korail.talk.view.indexbar.IndexBarRecyclerView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import n4.l;
import p6.C6059a;
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
public class MaasStationSearch extends C6543c implements View.OnClickListener, TextWatcher, TextView.OnEditorActionListener {
    public final int MODE_BENEFIT_STATION;
    public final int MODE_FAVORITE_STATION;
    public final int MODE_RENT_STATION;
    public final int MODE_ROUTE_STATION;

    /* renamed from: a, reason: collision with root package name */
    private int f27874a;

    /* renamed from: b, reason: collision with root package name */
    private List f27875b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f27876c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f27877d;

    /* renamed from: e, reason: collision with root package name */
    private List f27878e;

    /* renamed from: f, reason: collision with root package name */
    private c f27879f;

    /* renamed from: g, reason: collision with root package name */
    private EditText f27880g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f27881h;

    /* renamed from: i, reason: collision with root package name */
    private IndexBarRecyclerView f27882i;

    /* renamed from: j, reason: collision with root package name */
    private d f27883j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f27884k;

    class a extends GridLayoutManager.c {
        a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int getSpanSize(int i8) {
            if (N.getText(MaasStationSearch.this.f27880g).length() > 0) {
                return 1;
            }
            StationSearch.g type = ((DistanceStationData) MaasStationSearch.this.f27877d.get(i8)).getType();
            if (StationSearch.g.HEADER == type || StationSearch.g.ONE_COLUMN_STATION == type) {
                return 2;
            }
            StationSearch.g gVar = StationSearch.g.HEADER;
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
                P.hideIME(MaasStationSearch.this.getContext(), recyclerView);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            super.onScrolled(recyclerView, i8, i9);
        }
    }

    public interface c {
        void onChangeStation(StationNameData stationNameData);
    }

    public class d extends RecyclerView.h implements InterfaceC6114a, c.a {

        /* renamed from: d, reason: collision with root package name */
        private LinkedHashMap f27887d;

        class a extends RecyclerView.E {

            /* renamed from: t, reason: collision with root package name */
            TextView f27889t;

            a(View view) {
                super(view);
                this.f27889t = (TextView) view.findViewById(AbstractC5955f.tv_search_header);
            }
        }

        class b extends RecyclerView.E {

            /* renamed from: t, reason: collision with root package name */
            TextView f27891t;

            b(View view) {
                super(view);
                this.f27891t = (TextView) view.findViewById(AbstractC5955f.stationNameTxt);
            }
        }

        public d() {
        }

        void b(LinkedHashMap linkedHashMap) {
            this.f27887d = null;
        }

        @Override // q6.InterfaceC6114a
        public LinkedHashMap<String, Integer> getIndexCharacterMap() {
            return this.f27887d;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return MaasStationSearch.this.f27877d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i8) {
            return StationSearch.g.HEADER == ((DistanceStationData) MaasStationSearch.this.f27877d.get(i8)).getType() ? 0 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(RecyclerView.E e8, int i8) {
            DistanceStationData distanceStationData = (DistanceStationData) MaasStationSearch.this.f27877d.get(i8);
            if (e8 instanceof a) {
                ((a) e8).f27889t.setText(distanceStationData.getStationName());
                return;
            }
            StationSearch.g type = distanceStationData.getType();
            b bVar = (b) e8;
            bVar.f27891t.setText(distanceStationData.getStationName());
            if (StationSearch.g.ONE_COLUMN_STATION == type) {
                bVar.f27891t.append(" - " + distanceStationData.getArrivalStationName());
            }
            bVar.f27891t.setOnClickListener(new v4.c(this, i8));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public RecyclerView.E onCreateViewHolder(ViewGroup viewGroup, int i8) {
            return i8 == 0 ? new a(View.inflate(MaasStationSearch.this.getContext(), AbstractC5957h.station_list_item_header, null)) : new b(View.inflate(MaasStationSearch.this.getContext(), AbstractC5957h.station_list_item_station, null));
        }

        @Override // v4.c.a
        public void onCustomClick(View view, int i8) {
            DistanceStationData distanceStationData = (DistanceStationData) MaasStationSearch.this.f27877d.get(i8);
            StationNameData stationNameData = new StationNameData();
            distanceStationData.getType();
            stationNameData.setDepartureStationName(distanceStationData.getStationName());
            stationNameData.setArrivalStationName(distanceStationData.getArrivalStationName());
            if (C6630d.isNotNull(MaasStationSearch.this.f27879f)) {
                MaasStationSearch.this.f27879f.onChangeStation(stationNameData);
            }
        }
    }

    public MaasStationSearch(Context context) {
        super(context);
        this.MODE_ROUTE_STATION = 0;
        this.MODE_BENEFIT_STATION = 1;
        this.MODE_FAVORITE_STATION = 2;
        this.MODE_RENT_STATION = 3;
        this.f27884k = false;
        f(null);
    }

    private void f(AttributeSet attributeSet) {
        setData(attributeSet);
        j();
        g();
    }

    private void g() {
        this.f27880g.addTextChangedListener(this);
        this.f27880g.setOnEditorActionListener(this);
        this.f27881h.setOnClickListener(this);
        this.f27882i.addOnScrollListener(new b());
    }

    private List<DistanceStationData> getMaasStationList() {
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        if (this.f27884k) {
            while (i8 < this.f27878e.size()) {
                if (((StationDataDao.STNSetter) this.f27878e.get(i8)).getSetterType() > 0) {
                    DistanceStationData distanceStationData = new DistanceStationData();
                    distanceStationData.setStationName(getContext().getString(AbstractC5959j.common_type_all));
                    distanceStationData.setIndex(i8);
                    distanceStationData.setType(StationSearch.g.HEADER);
                    arrayList.add(distanceStationData);
                } else {
                    DistanceStationData distanceStationData2 = new DistanceStationData();
                    distanceStationData2.setIndex(i8);
                    distanceStationData2.setStationName(((StationDataDao.STN) this.f27878e.get(i8)).getStn_nm());
                    distanceStationData2.setMajor(((StationDataDao.STN) this.f27878e.get(i8)).getMajor());
                    distanceStationData2.setType(StationSearch.g.TWO_COLUMN_STATION);
                    arrayList.add(distanceStationData2);
                }
                i8++;
            }
        } else {
            while (i8 < this.f27878e.size()) {
                DistanceStationData distanceStationData3 = new DistanceStationData();
                distanceStationData3.setIndex(i8);
                distanceStationData3.setStationName(((StationDataDao.STN) this.f27878e.get(i8)).getStn_nm());
                distanceStationData3.setMajor(((StationDataDao.STN) this.f27878e.get(i8)).getMajor());
                distanceStationData3.setType(StationSearch.g.TWO_COLUMN_STATION);
                arrayList.add(distanceStationData3);
                i8++;
            }
        }
        return arrayList;
    }

    private LinkedHashMap h() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i8 = 0; i8 < this.f27876c.size(); i8++) {
            DistanceStationData distanceStationData = (DistanceStationData) this.f27876c.get(i8);
            if (StationSearch.g.HEADER == distanceStationData.getType()) {
                String upperCase = distanceStationData.getStationName().substring(0, 1).toUpperCase();
                if (!linkedHashMap.containsKey(upperCase)) {
                    linkedHashMap.put(upperCase, Integer.valueOf(i8));
                }
            }
        }
        return linkedHashMap;
    }

    private void i() {
        List<DistanceStationData> maasStationList = getMaasStationList();
        if (C6630d.isNotNull(maasStationList) && !maasStationList.isEmpty()) {
            DistanceStationData distanceStationData = new DistanceStationData();
            if (this.f27884k) {
                distanceStationData.setStationName(getContext().getString(AbstractC5959j.booking_major_station));
            } else {
                distanceStationData.setStationName(getContext().getString(AbstractC5959j.booking_maas_station));
            }
            distanceStationData.setType(StationSearch.g.HEADER);
            this.f27876c.add(distanceStationData);
            this.f27876c.addAll(maasStationList);
        }
        this.f27877d = C6625A.clone(this.f27876c);
    }

    private void j() {
        View.inflate(getContext(), AbstractC5957h.maas_station_search, this).setClickable(true);
        this.f27880g = (EditText) findViewById(AbstractC5955f.stationNameEdit);
        this.f27881h = (ImageView) findViewById(AbstractC5955f.stationNameEditDelete);
        IndexBarRecyclerView indexBarRecyclerView = (IndexBarRecyclerView) findViewById(AbstractC5955f.stationList);
        this.f27882i = indexBarRecyclerView;
        indexBarRecyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.setSpanSizeLookup(new a());
        this.f27882i.setLayoutManager(gridLayoutManager);
        d dVar = new d();
        this.f27883j = dVar;
        dVar.b(h());
        this.f27882i.setAdapter(this.f27883j);
        this.f27882i.addItemDecoration(new C6059a(getContext()));
    }

    private void setData(AttributeSet attributeSet) {
        this.f27875b = M.getAllNearStationList();
        this.f27876c = new ArrayList();
        this.f27877d = new ArrayList();
        this.f27874a = 0;
        if (C6630d.isNotNull(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, l.StationSearch);
            this.f27874a = typedArrayObtainStyledAttributes.getInt(l.StationSearch_searchMode, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f27874a == 2) {
            i();
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
    }

    public void initSearchEdit() {
        this.f27880g.setText("");
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
        this.f27881h.setVisibility(z8 ? 8 : 0);
        if (z8) {
            this.f27877d = C6625A.clone(this.f27876c);
        } else {
            ArrayList arrayList = new ArrayList();
            List list = this.f27875b;
            if (this.f27878e != null) {
                for (int i11 = 0; i11 < this.f27878e.size(); i11++) {
                    String stn_nm = ((StationDataDao.STN) this.f27878e.get(i11)).getStn_nm();
                    if (N.isNotNull(stn_nm) && L.matchString(stn_nm, N.getText(charSequence.toString()))) {
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            String stationName = ((DistanceStationData) list.get(i12)).getStationName();
                            if (N.isNotNull(stationName) && L.matchString(stationName, N.getText(((StationDataDao.STN) this.f27878e.get(i11)).getStn_nm())) && !arrayList.contains(list.get(i12))) {
                                arrayList.add((DistanceStationData) list.get(i12));
                            }
                        }
                    }
                }
            } else {
                for (int i13 = 0; i13 < list.size(); i13++) {
                    String stationName2 = ((DistanceStationData) list.get(i13)).getStationName();
                    if (N.isNotNull(stationName2) && L.matchString(stationName2, N.getText(charSequence.toString())) && !arrayList.contains(list.get(i13))) {
                        arrayList.add((DistanceStationData) list.get(i13));
                    }
                }
            }
            this.f27877d.clear();
            this.f27877d.addAll(arrayList);
        }
        this.f27882i.initCharacter();
        this.f27883j.b(z8 ? h() : null);
        this.f27883j.notifyDataSetChanged();
    }

    public void refreshList() {
        if (this.f27874a == 0) {
            this.f27876c.clear();
            this.f27877d.clear();
            i();
            this.f27883j.b(h());
            this.f27883j.notifyDataSetChanged();
        }
    }

    public void setCustomMode(boolean z8) {
        this.f27884k = z8;
    }

    public void setHideEventListener(View.OnClickListener onClickListener) {
        findViewById(AbstractC5955f.v_station_search).setOnClickListener(onClickListener);
    }

    public void setOnChangeStationListener(c cVar) {
        this.f27879f = cVar;
    }

    public void setStationList(List<StationDataDao.STN> list) {
        this.f27878e = list;
    }

    public MaasStationSearch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MODE_ROUTE_STATION = 0;
        this.MODE_BENEFIT_STATION = 1;
        this.MODE_FAVORITE_STATION = 2;
        this.MODE_RENT_STATION = 3;
        this.f27884k = false;
        f(attributeSet);
    }

    public MaasStationSearch(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.MODE_ROUTE_STATION = 0;
        this.MODE_BENEFIT_STATION = 1;
        this.MODE_FAVORITE_STATION = 2;
        this.MODE_RENT_STATION = 3;
        this.f27884k = false;
        f(attributeSet);
    }
}

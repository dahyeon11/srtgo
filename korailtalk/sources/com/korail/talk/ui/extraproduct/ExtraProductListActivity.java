package com.korail.talk.ui.extraproduct;

import Q7.X;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.addService.ExtraProductListDao;
import com.korail.talk.network.dao.addService.ExtraProductListDao.ExtraProductListRequest;
import com.korail.talk.network.dao.trainsInfo.Price2FareDao;
import com.korail.talk.network.data.addService.ExtraProductInfo;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.view.ExtraProductGrid;
import com.korail.talk.view.base.BaseViewActivity;
import com.squareup.picasso.s;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import q4.C6111b;
import z4.C6630d;
import z4.C6637k;
import z4.N;
import z4.t;
import z4.z;

/* loaded from: classes.dex */
public class ExtraProductListActivity extends BaseViewActivity implements ExpandableListView.OnGroupClickListener, AdapterView.OnItemClickListener {

    /* renamed from: l, reason: collision with root package name */
    private String f27990l;

    /* renamed from: m, reason: collision with root package name */
    private String f27991m;

    /* renamed from: o, reason: collision with root package name */
    private ArrayList f27993o;

    /* renamed from: p, reason: collision with root package name */
    private HashMap f27994p;

    /* renamed from: q, reason: collision with root package name */
    private ExpandableListView f27995q;

    /* renamed from: r, reason: collision with root package name */
    private b f27996r;

    /* renamed from: i, reason: collision with root package name */
    private final int f27987i = 0;

    /* renamed from: j, reason: collision with root package name */
    private final int f27988j = 1;

    /* renamed from: k, reason: collision with root package name */
    private final String f27989k = "/";

    /* renamed from: n, reason: collision with root package name */
    private boolean f27992n = false;

    class a implements DialogInterface.OnDismissListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    private class b extends BaseExpandableListAdapter {

        class a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f27999a;

            a(String str) {
                this.f27999a = str;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                t.d("매장 전화번호 - " + this.f27999a);
                if (N.isNull(this.f27999a)) {
                    t.t(ExtraProductListActivity.this, "전화번호가 존재하지 않습니다.");
                    return;
                }
                Intent intent = new Intent();
                intent.setAction("android.intent.action.DIAL");
                intent.setData(Uri.parse("tel:" + this.f27999a));
                ExtraProductListActivity.this.startActivity(intent);
            }
        }

        /* renamed from: com.korail.talk.ui.extraproduct.ExtraProductListActivity$b$b, reason: collision with other inner class name */
        class ViewOnClickListenerC0239b implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f28001a;

            ViewOnClickListenerC0239b(String str) {
                this.f28001a = str;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (N.isNull(this.f28001a)) {
                    t.t(ExtraProductListActivity.this, "지도 정보가 존재하지 않습니다.");
                } else {
                    ExtraProductListActivity.this.E0(this.f28001a);
                }
            }
        }

        private class c extends g {
            public ExtraProductGrid mGridView;
            public ImageView mIvStoreMap;
            public ImageView mIvStorePhone;
            public TextView mTvStoreTitle;

            private c() {
                super(b.this, null);
            }

            /* synthetic */ c(b bVar, a aVar) {
                this();
            }
        }

        private class d extends BaseAdapter {

            /* renamed from: a, reason: collision with root package name */
            private List f28004a;

            class a implements View.OnClickListener {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ExtraProductInfo.AddSrvInfo f28006a;

                a(ExtraProductInfo.AddSrvInfo addSrvInfo) {
                    this.f28006a = addSrvInfo;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Intent intent = new Intent(ExtraProductListActivity.this.getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
                    intent.putExtra("WEB_POST_URL", this.f28006a.getReservationUrl());
                    ExtraProductListActivity.this.startActivity(intent);
                }
            }

            private d() {
            }

            @Override // android.widget.Adapter
            public int getCount() {
                if (C6630d.isNull(this.f28004a)) {
                    return 0;
                }
                return this.f28004a.size();
            }

            @Override // android.widget.Adapter
            public long getItemId(int i8) {
                return 0L;
            }

            @Override // android.widget.Adapter
            public View getView(int i8, View view, ViewGroup viewGroup) throws NumberFormatException {
                View viewInflate;
                ExtraProductInfo.AddSrvInfo item = getItem(i8);
                t.d("addSrvInfo.getAddSrvNm() - " + item.getAddSrvNm());
                t.d("addSrvInfo.getAddSrvDvCd() - " + item.getAddSrvDvCd());
                t.d("addSrvInfo.getReservationUrl() - " + item.getReservationUrl());
                a aVar = null;
                if (N.isNull(item.getReservationUrl())) {
                    t.d("그 외 GridView");
                    e eVar = new e(b.this, aVar);
                    viewInflate = View.inflate(viewGroup.getContext(), AbstractC5957h.row_grid_extra_product, null);
                    eVar.mTvTitle = (TextView) viewInflate.findViewById(AbstractC5955f.tv_grid_extra_product_title);
                    eVar.mTvCount = (TextView) viewInflate.findViewById(AbstractC5955f.tv_grid_extra_product_count);
                    eVar.mTvDetail = (TextView) viewInflate.findViewById(AbstractC5955f.tv_grid_extra_product_detail);
                    eVar.mIvProductImage = (ImageView) viewInflate.findViewById(AbstractC5955f.iv_grid_extra_product_img);
                    eVar.mIvBadgeImage = (ImageView) viewInflate.findViewById(AbstractC5955f.iv_grid_extra_product_receipt);
                    viewInflate.setTag(eVar);
                    eVar.mTvTitle.setText(item.getAddSrvNm());
                    eVar.mTvDetail.setText(item.getLeadMsgCont1());
                    eVar.mTvCount.setText(ExtraProductListActivity.this.F0(item.getReqQnty()) + ExtraProductListActivity.this.getResources().getString(AbstractC5959j.extra_product_count_text));
                    viewInflate.findViewById(AbstractC5955f.btn_depth).setVisibility(0);
                    ImageView imageView = (ImageView) eVar.mIvProductImage.findViewById(AbstractC5955f.iv_grid_extra_product_img);
                    String str = z.getWebHost() + item.getImgPath();
                    t.d("상품이미지 경로 - " + str);
                    if (N.isNull(item.getImgPath())) {
                        t.t(ExtraProductListActivity.this, "추가 상품 이미지가 존재하지 않습니다.");
                    } else {
                        s.get().load(str).resize(imageView.getLayoutParams().width, imageView.getLayoutParams().height).into(imageView);
                    }
                    ExtraProductListActivity.this.B0(eVar.mIvBadgeImage, item.getAddSrvPrgSttCd());
                } else {
                    e eVar2 = new e(b.this, aVar);
                    viewInflate = View.inflate(viewGroup.getContext(), AbstractC5957h.row_grid_extra_product_deal_car, null);
                    eVar2.mTvTitle = (TextView) viewInflate.findViewById(AbstractC5955f.tv_grid_extra_product_title);
                    eVar2.mTvCount = (TextView) viewInflate.findViewById(AbstractC5955f.tv_grid_extra_product_count);
                    if (N.isNull(item.getReservationUrl())) {
                        viewInflate.findViewById(AbstractC5955f.tv_grid_extra_product_status).setVisibility(8);
                    } else {
                        eVar2.mTvStatus = (TextView) viewInflate.findViewById(AbstractC5955f.tv_grid_extra_product_status);
                    }
                    eVar2.mTvDetail = (TextView) viewInflate.findViewById(AbstractC5955f.tv_grid_extra_product_detail);
                    viewInflate.setTag(eVar2);
                    t.d("cgPsRefAtclCont(담당자참조사항내용) - " + item.getCgPsRefAtclCont());
                    StringTokenizer stringTokenizer = new StringTokenizer(item.getCgPsRefAtclCont(), "/");
                    String strNextToken = stringTokenizer.nextToken();
                    String str2 = "";
                    while (stringTokenizer.hasMoreTokens()) {
                        str2 = str2 + stringTokenizer.nextToken() + X.LF;
                    }
                    eVar2.mTvTitle.setText(strNextToken);
                    eVar2.mTvDetail.setText(str2);
                    if (!N.isNull(item.getReservationUrl())) {
                        eVar2.mTvStatus.setOnClickListener(new a(item));
                    }
                }
                return viewInflate;
            }

            public void setData(List<ExtraProductInfo.AddSrvInfo> list) {
                this.f28004a = list;
            }

            public void update() {
                notifyDataSetChanged();
            }

            /* synthetic */ d(b bVar, a aVar) {
                this();
            }

            @Override // android.widget.Adapter
            public ExtraProductInfo.AddSrvInfo getItem(int i8) {
                t.d("position - " + i8);
                return (ExtraProductInfo.AddSrvInfo) this.f28004a.get(i8);
            }
        }

        private class e extends g {
            private e() {
                super(b.this, null);
            }

            /* synthetic */ e(b bVar, a aVar) {
                this();
            }
        }

        private class f extends g {
            public ImageView mIvArrow;
            public TextView mTvTimeInfo;

            private f() {
                super(b.this, null);
            }

            /* synthetic */ f(b bVar, a aVar) {
                this();
            }
        }

        private class g {
            public ImageView mIvBadgeImage;
            public ImageView mIvProductImage;
            public TextView mTvCount;
            public TextView mTvDetail;
            public TextView mTvStatus;
            public TextView mTvTitle;

            private g() {
            }

            /* synthetic */ g(b bVar, a aVar) {
                this();
            }
        }

        private b() {
        }

        @Override // android.widget.ExpandableListAdapter
        public long getChildId(int i8, int i9) {
            return 0L;
        }

        @Override // android.widget.ExpandableListAdapter
        public View getChildView(int i8, int i9, boolean z8, View view, ViewGroup viewGroup) {
            t.d("getChildView()");
            a aVar = null;
            c cVar = new c(this, aVar);
            View viewInflate = View.inflate(viewGroup.getContext(), AbstractC5957h.row_child_extra_product, null);
            cVar.mGridView = (ExtraProductGrid) viewInflate.findViewById(AbstractC5955f.gv_child_discount_menu);
            cVar.mTvStoreTitle = (TextView) viewInflate.findViewById(AbstractC5955f.tv_store_title);
            cVar.mIvStorePhone = (ImageView) viewInflate.findViewById(AbstractC5955f.iv_store_call);
            cVar.mIvStoreMap = (ImageView) viewInflate.findViewById(AbstractC5955f.iv_store_map);
            cVar.mGridView.setAdapter((ListAdapter) new d(this, aVar));
            viewInflate.setTag(cVar);
            c child = getChild(i8, i9);
            if (N.isNull(child.getReservationUrl())) {
                List<ExtraProductInfo.AddSrvInfo> addSrvList = child.getExtraProductInfoList().get(0).getAddSrvList();
                String leadTeln = addSrvList.get(0).getLeadTeln();
                String shopMapImgPath = addSrvList.get(0).getShopMapImgPath();
                int iF0 = 0;
                for (int i10 = 0; i10 < addSrvList.size(); i10++) {
                    iF0 += ExtraProductListActivity.this.F0(addSrvList.get(i10).getReqQnty());
                }
                cVar.mTvStoreTitle.setText(child.getStoreName() + " (" + iF0 + ")");
                cVar.mIvStorePhone.setOnClickListener(new a(leadTeln));
                StringBuilder sb = new StringBuilder();
                sb.append("매장이미지 경로 - ");
                sb.append(shopMapImgPath);
                t.d(sb.toString());
                cVar.mIvStoreMap.setOnClickListener(new ViewOnClickListenerC0239b(shopMapImgPath));
            } else {
                cVar.mTvStoreTitle.setText(child.getStoreName());
                cVar.mGridView.setNumColumns(1);
                viewInflate.findViewById(AbstractC5955f.store_info_layout).setVisibility(8);
            }
            cVar.mGridView.setOnItemClickListener(ExtraProductListActivity.this);
            d dVar = (d) cVar.mGridView.getAdapter();
            dVar.setData(child.getExtraProductInfoList().get(0).getAddSrvList());
            dVar.update();
            return viewInflate;
        }

        @Override // android.widget.ExpandableListAdapter
        public int getChildrenCount(int i8) {
            String stationCode = ((d) ExtraProductListActivity.this.f27993o.get(i8)).getStationCode();
            if (ExtraProductListActivity.this.f27994p.get(stationCode) != null) {
                return ((ArrayList) ExtraProductListActivity.this.f27994p.get(stationCode)).size();
            }
            return 0;
        }

        @Override // android.widget.ExpandableListAdapter
        public int getGroupCount() {
            if (C6630d.isNull(ExtraProductListActivity.this.f27993o)) {
                return 0;
            }
            return ExtraProductListActivity.this.f27993o.size();
        }

        @Override // android.widget.ExpandableListAdapter
        public long getGroupId(int i8) {
            return 0L;
        }

        @Override // android.widget.ExpandableListAdapter
        public View getGroupView(int i8, boolean z8, View view, ViewGroup viewGroup) {
            f fVar = new f(this, null);
            View viewInflate = View.inflate(viewGroup.getContext(), AbstractC5957h.row_group_extra_product, null);
            fVar.mTvTitle = (TextView) viewInflate.findViewById(AbstractC5955f.tv_group_extra_product_title);
            fVar.mTvTimeInfo = (TextView) viewInflate.findViewById(AbstractC5955f.tv_group_time_info);
            fVar.mIvArrow = (ImageView) viewInflate.findViewById(AbstractC5955f.iv_group_discount_menu_arrow);
            t.d("setTag - " + fVar);
            viewInflate.setTag(fVar);
            t.d("groupPosition - " + i8 + ", mGroupData.getH_tot_cnt() - " + ((d) ExtraProductListActivity.this.f27993o.get(i8)).getTotalCount());
            fVar.mTvTitle.setText(((d) ExtraProductListActivity.this.f27993o.get(i8)).getStationName() + "역 (" + ((d) ExtraProductListActivity.this.f27993o.get(i8)).getTotalCount() + ")");
            fVar.mTvTimeInfo.setText(((d) ExtraProductListActivity.this.f27993o.get(i8)).getStationTime());
            fVar.mIvArrow.setVisibility(((d) ExtraProductListActivity.this.f27993o.get(i8)).getTotalCount() == 0 ? 4 : 0);
            if (fVar.mIvArrow.getVisibility() == 0) {
                fVar.mIvArrow.setBackgroundResource(z8 ? AbstractC5954e.up : AbstractC5954e.down);
            }
            t.d("convertView - " + viewInflate);
            return viewInflate;
        }

        @Override // android.widget.ExpandableListAdapter
        public boolean hasStableIds() {
            return false;
        }

        @Override // android.widget.ExpandableListAdapter
        public boolean isChildSelectable(int i8, int i9) {
            return false;
        }

        /* synthetic */ b(ExtraProductListActivity extraProductListActivity, a aVar) {
            this();
        }

        @Override // android.widget.ExpandableListAdapter
        public c getChild(int i8, int i9) {
            t.d("groupPosition - " + i8 + ", childPosition - " + i9);
            StringBuilder sb = new StringBuilder();
            sb.append("getChild's StationCode()) - ");
            sb.append(ExtraProductListActivity.this.f27994p.get(((d) ExtraProductListActivity.this.f27993o.get(i8)).getStationCode()));
            t.d(sb.toString());
            return (c) ((ArrayList) ExtraProductListActivity.this.f27994p.get(((d) ExtraProductListActivity.this.f27993o.get(i8)).getStationCode())).get(i9);
        }

        @Override // android.widget.ExpandableListAdapter
        public d getGroup(int i8) {
            if (C6630d.isNull(ExtraProductListActivity.this.f27993o)) {
                return null;
            }
            return (d) ExtraProductListActivity.this.f27993o.get(i8);
        }
    }

    public class c {

        /* renamed from: a, reason: collision with root package name */
        private String f28011a;

        /* renamed from: b, reason: collision with root package name */
        private String f28012b;

        /* renamed from: c, reason: collision with root package name */
        private String f28013c;

        /* renamed from: d, reason: collision with root package name */
        private String f28014d;

        /* renamed from: e, reason: collision with root package name */
        private String f28015e;

        /* renamed from: f, reason: collision with root package name */
        private String f28016f;

        /* renamed from: g, reason: collision with root package name */
        private ArrayList f28017g;

        public c() {
        }

        public String getAddSrvDvCd() {
            return this.f28016f;
        }

        public ArrayList<ExtraProductInfo> getExtraProductInfoList() {
            return this.f28017g;
        }

        public String getReservationUrl() {
            return this.f28015e;
        }

        public String getStationCode() {
            return this.f28011a;
        }

        public String getStoreId() {
            return this.f28012b;
        }

        public String getStoreImagePath() {
            return this.f28014d;
        }

        public String getStoreName() {
            return this.f28013c;
        }

        public void setAddSrvDvCd(String str) {
            this.f28016f = str;
        }

        public void setExtraProductInfoList(ArrayList<ExtraProductInfo> arrayList) {
            this.f28017g = arrayList;
        }

        public void setReservationUrl(String str) {
            this.f28015e = str;
        }

        public void setStationCode(String str) {
            this.f28011a = str;
        }

        public void setStoreId(String str) {
            this.f28012b = str;
        }

        public void setStoreImagePath(String str) {
            this.f28014d = str;
        }

        public void setStoreName(String str) {
            this.f28013c = str;
        }
    }

    public class d {

        /* renamed from: a, reason: collision with root package name */
        private String f28019a;

        /* renamed from: b, reason: collision with root package name */
        private String f28020b;

        /* renamed from: c, reason: collision with root package name */
        private String f28021c;

        /* renamed from: d, reason: collision with root package name */
        private int f28022d = 0;

        public d(String str, String str2, String str3) {
            this.f28019a = str;
            this.f28020b = str2;
            this.f28021c = str3;
        }

        public String getStationCode() {
            return this.f28019a;
        }

        public String getStationName() {
            return this.f28020b;
        }

        public String getStationTime() {
            return this.f28021c;
        }

        public int getTotalCount() {
            return this.f28022d;
        }

        public void setStationCode(String str) {
            this.f28019a = str;
        }

        public void setStationName(String str) {
            this.f28020b = str;
        }

        public void setStationTime(String str) {
            this.f28021c = str;
        }

        public void setTotalCount(int i8) {
            this.f28022d = i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0(DialogInterface dialogInterface, int i8) {
        setResult(-1);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0(ImageView imageView, String str) throws NumberFormatException {
        int i8;
        t.d("receiptType - " + str);
        try {
            i8 = Integer.parseInt(str);
        } catch (NumberFormatException e8) {
            t.e(e8.getMessage());
            i8 = -1;
        }
        int i9 = i8 != 5 ? i8 != 9 ? -1 : AbstractC5954e.ic_receipt_reject : AbstractC5954e.ic_receipt_complete;
        if (i9 != -1) {
            imageView.setImageResource(i9);
        }
        imageView.setVisibility(i9 == -1 ? 8 : 0);
    }

    private void C0() {
        t.d("mPnrNumber - " + this.f27990l);
        this.f27990l = getIntent().getStringExtra("TICKET_PNR_NUMBER");
        this.f27993o = new ArrayList();
        this.f27994p = new HashMap();
    }

    private void D0() {
        n0(false);
        setAppTitle(AbstractC5959j.title_extra_product_list);
        this.f27995q = (ExpandableListView) findViewById(AbstractC5955f.extraProduct_elv);
        b bVar = new b(this, null);
        this.f27996r = bVar;
        this.f27995q.setAdapter(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0(String str) {
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.setOnDismissListener(new a());
        ImageView imageView = new ImageView(this);
        s.get().load(z.getWebHost() + str).into(imageView);
        dialog.addContentView(imageView, new RelativeLayout.LayoutParams(-1, -1));
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int F0(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e8) {
            t.e(e8.getMessage());
            return 0;
        }
    }

    private String y0(String str, String str2, String str3) throws ParseException {
        Date date;
        try {
            date = new SimpleDateFormat(str2).parse(str);
        } catch (ParseException e8) {
            Date date2 = new Date();
            t.e(e8.getMessage());
            date = date2;
        }
        return new SimpleDateFormat(str3).format(date);
    }

    private void z0() {
        this.f27993o.clear();
        this.f27994p.clear();
        if (C6630d.isNotNull(this.f27996r)) {
            this.f27996r.notifyDataSetChanged();
        }
        ExtraProductListDao extraProductListDao = new ExtraProductListDao();
        ExtraProductListDao.ExtraProductListRequest extraProductListRequest = extraProductListDao.new ExtraProductListRequest();
        extraProductListRequest.setPnrNo(this.f27990l);
        extraProductListDao.setRequest(extraProductListRequest);
        executeDao(extraProductListDao);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i9 == -1) {
            this.f27992n = true;
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, com.korail.talk.view.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        t.d("mIsUpdated - " + this.f27992n);
        if (!this.f27992n) {
            super.onBackPressed();
        } else {
            setResult(-1);
            finish();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_extra_product_list);
        C0();
        D0();
    }

    @Override // android.widget.ExpandableListView.OnGroupClickListener
    public boolean onGroupClick(ExpandableListView expandableListView, View view, int i8, long j8) {
        t.d("onGroupClick - " + i8);
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i8, long j8) {
        t.d("onItemClick - " + i8);
        ExtraProductInfo.AddSrvInfo item = ((b.d) adapterView.getAdapter()).getItem(i8);
        if (!N.isNull(item.getReservationUrl())) {
            Intent intent = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
            intent.putExtra("WEB_POST_URL", item.getReservationUrl());
            startActivity(intent);
        } else {
            Intent intent2 = new Intent(getApplicationContext(), (Class<?>) ExtraProductDetailActivity.class);
            intent2.putExtra("EXTRA_PRODUCT_INFO", item);
            intent2.putExtra("TICKET_PNR_NUMBER", this.f27990l);
            intent2.putExtra(Price2FareDao.Price2Fare.jrnySqnoString, this.f27991m);
            startActivityForResult(intent2, 0);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) throws ParseException {
        ArrayList arrayList;
        ArrayList<ExtraProductInfo> extraProductInfoList;
        boolean z8;
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_extra_product_list == iBaseDao.getId()) {
            ExtraProductListDao.ExtraProductListResponse extraProductListResponse = (ExtraProductListDao.ExtraProductListResponse) iBaseDao.getResponse();
            if (extraProductListResponse == null || extraProductListResponse.getPnrList() == null || extraProductListResponse.getPnrList().size() <= 0) {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.title_extra_product_list) + "이 존재하지 않습니다").setButtonListener(new DialogInterface.OnClickListener() { // from class: e5.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        this.f30461a.A0(dialogInterface, i8);
                    }
                }).showDialog();
                return;
            }
            ExtraProductInfo extraProductInfo = extraProductListResponse.getPnrList().get(0);
            this.f27991m = extraProductInfo.getJrnySqno();
            t.d("[출발역] 코드 - " + extraProductInfo.getDptRsStnCd());
            t.d("[출발역] 역이름 - " + C6111b.getInstance().getStationNameByCode(extraProductInfo.getDptRsStnCd()));
            t.d("[출발역] 시간   - " + extraProductInfo.getDptDt() + ", " + extraProductInfo.getDptTm());
            StringBuilder sb = new StringBuilder();
            sb.append("[도착역] 코드 - ");
            sb.append(extraProductInfo.getArvRsStnCd());
            t.d(sb.toString());
            t.d("[도착역] 역이름 - " + C6111b.getInstance().getStationNameByCode(extraProductInfo.getArvRsStnCd()));
            t.d("[도착역] 시간   - " + extraProductInfo.getArvDt() + ", " + extraProductInfo.getArvTm());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("여정일련번호 - ");
            sb2.append(this.f27991m);
            t.d(sb2.toString());
            if (extraProductInfo.getAddSrvList() != null) {
                String dptRsStnCd = extraProductInfo.getDptRsStnCd();
                this.f27993o.add(new d(dptRsStnCd, C6111b.getInstance().getStationNameByCode(extraProductInfo.getDptRsStnCd()), y0(extraProductInfo.getDptDt() + extraProductInfo.getDptTm(), "yyyyMMddHHmmss", "yyyy년 MM월 dd일 (E) HH:mm")));
                String arvRsStnCd = extraProductInfo.getArvRsStnCd();
                this.f27993o.add(new d(arvRsStnCd, C6111b.getInstance().getStationNameByCode(extraProductInfo.getArvRsStnCd()), y0(extraProductInfo.getArvDt() + extraProductInfo.getArvTm(), "yyyyMMddHHmmss", "yyyy년 MM월 dd일 (E) HH:mm")));
                int size = 0;
                for (ExtraProductInfo.AddSrvInfo addSrvInfo : extraProductInfo.getAddSrvList()) {
                    String spvsRsStnCd = addSrvInfo.getSpvsRsStnCd();
                    t.d("productStationCode  -  " + spvsRsStnCd + ", departureStationCode - " + dptRsStnCd + ", arriveStationCode - " + arvRsStnCd);
                    if (this.f27994p.containsKey(spvsRsStnCd)) {
                        arrayList = (ArrayList) this.f27994p.get(spvsRsStnCd);
                        t.d("GroupData 역코드 존재 - " + spvsRsStnCd);
                        t.d("extraProductStoreInfoArrayList.size() - " + arrayList.size());
                        int i8 = 0;
                        while (true) {
                            if (i8 >= arrayList.size()) {
                                z8 = true;
                                break;
                            }
                            t.d("i - " + i8 + ", StoreId() - " + ((c) arrayList.get(i8)).getStoreId() + ", AddSrvMrkEntId() - " + addSrvInfo.getAddSrvMrkEntId());
                            if (arrayList.get(i8) != null && addSrvInfo.getAddSrvMrkEntId().equals(((c) arrayList.get(i8)).getStoreId())) {
                                t.d("매장정보 있음 - " + addSrvInfo.getAddSrvMrkEntNm() + ", storeIndex - " + size);
                                size = i8;
                                z8 = false;
                                break;
                            }
                            i8++;
                        }
                        if (z8) {
                            size = arrayList.size();
                            c cVar = new c();
                            cVar.setStoreId(addSrvInfo.getAddSrvMrkEntId());
                            cVar.setStoreName(addSrvInfo.getAddSrvMrkEntNm());
                            cVar.setAddSrvDvCd(addSrvInfo.getAddSrvDvCd());
                            cVar.setStoreImagePath(addSrvInfo.getShopMapImgPath());
                            cVar.setReservationUrl(addSrvInfo.getReservationUrl());
                            arrayList.add(cVar);
                            t.d("매장정보 없음. 매장 ID - " + addSrvInfo.getAddSrvMrkEntId() + ", 매장명 - " + addSrvInfo.getAddSrvMrkEntNm());
                            t.d("매장정보 추가 - " + addSrvInfo.getAddSrvMrkEntNm() + ", storeIndex - " + size);
                        }
                    } else {
                        t.d("GroupData 역코드 존재하지 않음. 매장명 - " + addSrvInfo.getAddSrvMrkEntNm());
                        arrayList = new ArrayList();
                        c cVar2 = new c();
                        cVar2.setStoreId(addSrvInfo.getAddSrvMrkEntId());
                        cVar2.setStoreName(addSrvInfo.getAddSrvMrkEntNm());
                        cVar2.setAddSrvDvCd(addSrvInfo.getAddSrvDvCd());
                        cVar2.setStoreImagePath(addSrvInfo.getShopMapImgPath());
                        cVar2.setReservationUrl(addSrvInfo.getReservationUrl());
                        arrayList.add(cVar2);
                        t.d("매장정보 추가 - " + addSrvInfo.getAddSrvMrkEntNm() + ", storeIndex - 0");
                        size = 0;
                    }
                    t.d("storeIndex - " + size);
                    if (((c) arrayList.get(size)).getExtraProductInfoList() == null) {
                        extraProductInfoList = new ArrayList<>();
                        extraProductInfoList.add(new ExtraProductInfo());
                    } else {
                        t.d("---상품정보 있음---");
                        extraProductInfoList = ((c) arrayList.get(size)).getExtraProductInfoList();
                        t.d("상품개수 - " + extraProductInfoList.get(0).getAddSrvList().size());
                    }
                    if (spvsRsStnCd.equals(dptRsStnCd)) {
                        extraProductInfoList.get(0).getAddSrvList().add(addSrvInfo);
                        ((c) arrayList.get(size)).setExtraProductInfoList(extraProductInfoList);
                        ((d) this.f27993o.get(0)).setTotalCount(((d) this.f27993o.get(0)).getTotalCount() + F0(addSrvInfo.getReqQnty()));
                    } else if (spvsRsStnCd.equals(arvRsStnCd)) {
                        extraProductInfoList.get(0).getAddSrvList().add(addSrvInfo);
                        ((c) arrayList.get(size)).setExtraProductInfoList(extraProductInfoList);
                        ((d) this.f27993o.get(1)).setTotalCount(((d) this.f27993o.get(1)).getTotalCount() + F0(addSrvInfo.getReqQnty()));
                    }
                    this.f27994p.put(spvsRsStnCd, arrayList);
                    t.d("ChildData 추가( 역코드 - " + spvsRsStnCd + ", 매장명 - " + addSrvInfo.getAddSrvMrkEntNm());
                }
            }
            this.f27996r.notifyDataSetChanged();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() {
        super.onResume();
        z0();
    }
}

package com.korail.talk.ui.menu.discountMenu;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.pass.TripMenuDao;
import com.korail.talk.ui.booking.discountBooking.pass.NewAPassBookingActivity;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.view.CButton;
import com.korail.talk.view.base.BaseViewActivity;
import com.squareup.picasso.s;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import v4.c;
import y1.x;
import z4.C6630d;
import z4.C6637k;
import z4.N;
import z4.t;
import z4.z;

/* loaded from: classes.dex */
public class NewTripMenuActivity extends BaseViewActivity {

    /* renamed from: i */
    private final int f28345i = 100;

    /* renamed from: j */
    private final String f28346j = "E";

    /* renamed from: k */
    private final String f28347k = x.MAX_AD_CONTENT_RATING_G;

    /* renamed from: l */
    private final String f28348l = "T";

    /* renamed from: m */
    private final String f28349m = "P";

    /* renamed from: n */
    private List f28350n;

    /* renamed from: o */
    private d f28351o;

    /* renamed from: p */
    private RecyclerView f28352p;

    public class b extends androidx.viewpager.widget.a implements c.a {

        /* renamed from: c */
        Context f28353c;

        /* renamed from: d */
        ViewPager f28354d;

        /* renamed from: e */
        List f28355e;

        public b(Context context, List<TripMenuDao.ContentInfo> list, ViewPager viewPager) {
            this.f28353c = context;
            this.f28354d = viewPager;
            this.f28355e = list;
        }

        @Override // androidx.viewpager.widget.a
        public void destroyItem(ViewGroup viewGroup, int i8, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return C6630d.isNotNull(this.f28355e) ? 100 : 0;
        }

        @Override // androidx.viewpager.widget.a
        public Object instantiateItem(ViewGroup viewGroup, int i8) {
            View viewInflate = ((LayoutInflater) this.f28353c.getSystemService("layout_inflater")).inflate(AbstractC5957h.trip_event_list_item_view_pager, viewGroup, false);
            int size = i8 % this.f28355e.size();
            ImageView imageView = (ImageView) viewInflate.findViewById(AbstractC5955f.iv_event_image);
            TextView textView = (TextView) viewInflate.findViewById(AbstractC5955f.tv_event_text);
            ImageView imageView2 = (ImageView) viewInflate.findViewById(AbstractC5955f.iv_btn_left);
            ImageView imageView3 = (ImageView) viewInflate.findViewById(AbstractC5955f.iv_btn_right);
            s.get().load(z.getWebHost() + ((TripMenuDao.ContentInfo) this.f28355e.get(size)).getContImage()).into(imageView);
            textView.setText(((TripMenuDao.ContentInfo) this.f28355e.get(size)).getContTitle());
            imageView.setContentDescription(((TripMenuDao.ContentInfo) this.f28355e.get(size)).getContDetail());
            imageView.setOnClickListener(new v4.c(this, size));
            imageView2.setOnClickListener(new v4.c(this, i8));
            imageView3.setOnClickListener(new v4.c(this, i8));
            viewGroup.addView(viewInflate);
            return viewInflate;
        }

        @Override // androidx.viewpager.widget.a
        public boolean isViewFromObject(View view, Object obj) {
            return view == ((View) obj);
        }

        @Override // v4.c.a
        public void onCustomClick(View view, int i8) {
            ViewPager viewPager;
            int id = view.getId();
            if (id == AbstractC5955f.iv_event_image) {
                NewTripMenuActivity.this.B0(((TripMenuDao.ContentInfo) this.f28355e.get(i8)).getContUrl());
                return;
            }
            if (id == AbstractC5955f.iv_btn_left) {
                ViewPager viewPager2 = this.f28354d;
                if (viewPager2 != null) {
                    viewPager2.setCurrentItem(i8 - 1);
                    return;
                }
                return;
            }
            if (id != AbstractC5955f.iv_btn_right || (viewPager = this.f28354d) == null) {
                return;
            }
            viewPager.setCurrentItem(i8 + 1);
        }
    }

    public class c extends androidx.viewpager.widget.a implements c.a {

        /* renamed from: c */
        Context f28357c;

        /* renamed from: d */
        ViewPager f28358d;

        /* renamed from: e */
        List f28359e;

        public c(Context context, List<TripMenuDao.ContentInfo> list, ViewPager viewPager) {
            this.f28357c = context;
            this.f28358d = viewPager;
            this.f28359e = list;
        }

        @Override // androidx.viewpager.widget.a
        public void destroyItem(ViewGroup viewGroup, int i8, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return C6630d.isNotNull(this.f28359e) ? 100 : 0;
        }

        @Override // androidx.viewpager.widget.a
        public Object instantiateItem(ViewGroup viewGroup, int i8) {
            View viewInflate = ((LayoutInflater) this.f28357c.getSystemService("layout_inflater")).inflate(AbstractC5957h.trip_tour_list_item_view_pager, viewGroup, false);
            int size = i8 % this.f28359e.size();
            ImageView imageView = (ImageView) viewInflate.findViewById(AbstractC5955f.iv_event_image);
            TextView textView = (TextView) viewInflate.findViewById(AbstractC5955f.tv_tour_title);
            TextView textView2 = (TextView) viewInflate.findViewById(AbstractC5955f.tv_tour_detail);
            ImageView imageView2 = (ImageView) viewInflate.findViewById(AbstractC5955f.iv_btn_left);
            ImageView imageView3 = (ImageView) viewInflate.findViewById(AbstractC5955f.iv_btn_right);
            s.get().load(z.getWebHost() + ((TripMenuDao.ContentInfo) this.f28359e.get(size)).getContImage()).into(imageView);
            imageView.setContentDescription(((TripMenuDao.ContentInfo) this.f28359e.get(size)).getContTitle());
            textView.setText(((TripMenuDao.ContentInfo) this.f28359e.get(size)).getContTitle());
            textView2.setText(((TripMenuDao.ContentInfo) this.f28359e.get(size)).getContDetail());
            imageView.setOnClickListener(new v4.c(this, size));
            imageView2.setOnClickListener(new v4.c(this, i8));
            imageView3.setOnClickListener(new v4.c(this, i8));
            viewGroup.addView(viewInflate);
            return viewInflate;
        }

        @Override // androidx.viewpager.widget.a
        public boolean isViewFromObject(View view, Object obj) {
            return view == ((View) obj);
        }

        @Override // v4.c.a
        public void onCustomClick(View view, int i8) {
            ViewPager viewPager;
            int id = view.getId();
            if (id == AbstractC5955f.iv_event_image) {
                NewTripMenuActivity.this.B0(((TripMenuDao.ContentInfo) this.f28359e.get(i8)).getContUrl());
                return;
            }
            if (id == AbstractC5955f.iv_btn_left) {
                ViewPager viewPager2 = this.f28358d;
                if (viewPager2 != null) {
                    viewPager2.setCurrentItem(i8 - 1);
                    return;
                }
                return;
            }
            if (id != AbstractC5955f.iv_btn_right || (viewPager = this.f28358d) == null) {
                return;
            }
            viewPager.setCurrentItem(i8 + 1);
        }
    }

    public void A0(TripMenuDao.ContentInfo contentInfo) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) NewAPassBookingActivity.class);
        intent.putExtra("TRIP_MENU_CONTENT_INFO", contentInfo);
        startActivity(intent);
    }

    public void B0(String str) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
        intent.putExtra("WEB_POST_URL", z.getWebHost() + str);
        startActivity(intent);
    }

    private void C0() {
    }

    private void D0() {
    }

    private void E0(List list) {
        if (list.isEmpty()) {
            t.e("할인,정기권 메뉴 못 받아옴");
        } else {
            this.f28350n = list;
            this.f28351o.notifyDataSetChanged();
        }
    }

    private void F0() {
        m0();
        RecyclerView recyclerView = (RecyclerView) findViewById(AbstractC5955f.list_trip_menu);
        this.f28352p = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        d dVar = new d();
        this.f28351o = dVar;
        this.f28352p.setAdapter(dVar);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_theme_menu);
    }

    private void y0(String str) {
        if (str != null) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(str).showDialog();
        }
    }

    private void z0() {
        TripMenuDao tripMenuDao = new TripMenuDao();
        tripMenuDao.setRequest(new BaseRequest());
        executeDao(tripMenuDao);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_trip_menu_new);
        if (C6630d.isNull(bundle)) {
            C0();
            F0();
            setText();
            D0();
            z0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.appcompat.app.e, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onDestroy() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onDestroy();
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_trip_menu == iBaseDao.getId()) {
            TripMenuDao.TripMenuResponse tripMenuResponse = (TripMenuDao.TripMenuResponse) iBaseDao.getResponse();
            E0(tripMenuResponse.getList());
            if (N.isNull(tripMenuResponse.getPoppMsg())) {
                return;
            }
            y0(tripMenuResponse.getPoppMsg());
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    private class d extends RecyclerView.h implements c.a {

        /* renamed from: d */
        final int f28361d;

        /* renamed from: e */
        final int f28362e;

        /* renamed from: f */
        final int f28363f;

        /* renamed from: g */
        final int f28364g;

        /* renamed from: h */
        final int f28365h;

        private class a extends RecyclerView.E {

            /* renamed from: t */
            private TextView f28367t;

            /* renamed from: u */
            private TextView f28368u;

            /* renamed from: v */
            private ViewPager f28369v;

            /* synthetic */ a(d dVar, View view, a aVar) {
                this(view);
            }

            private a(View view) {
                super(view);
                this.f28367t = (TextView) view.findViewById(AbstractC5955f.tv_header_title);
                this.f28368u = (TextView) view.findViewById(AbstractC5955f.tv_header_detail);
                this.f28369v = (ViewPager) view.findViewById(AbstractC5955f.view_pager_image);
            }
        }

        private class b extends RecyclerView.E {

            /* renamed from: t */
            private TextView f28371t;

            /* renamed from: u */
            private TextView f28372u;

            /* renamed from: v */
            private ImageView[] f28373v;

            public b(View view) {
                super(view);
                this.f28371t = (TextView) view.findViewById(AbstractC5955f.tv_header_title);
                this.f28372u = (TextView) view.findViewById(AbstractC5955f.tv_header_detail);
                ImageView[] imageViewArr = new ImageView[6];
                this.f28373v = imageViewArr;
                imageViewArr[0] = (ImageView) view.findViewById(AbstractC5955f.iv_item_1);
                this.f28373v[1] = (ImageView) view.findViewById(AbstractC5955f.iv_item_2);
                this.f28373v[2] = (ImageView) view.findViewById(AbstractC5955f.iv_item_3);
                this.f28373v[3] = (ImageView) view.findViewById(AbstractC5955f.iv_item_4);
                this.f28373v[4] = (ImageView) view.findViewById(AbstractC5955f.iv_item_5);
                this.f28373v[5] = (ImageView) view.findViewById(AbstractC5955f.iv_item_6);
            }
        }

        private class c extends RecyclerView.E {

            /* renamed from: A */
            private TextView f28375A;

            /* renamed from: B */
            private ImageView f28376B;

            /* renamed from: C */
            private CButton f28377C;

            /* renamed from: D */
            private View f28378D;

            /* renamed from: E */
            private TextView f28379E;

            /* renamed from: F */
            private TextView f28380F;

            /* renamed from: G */
            private ImageView f28381G;

            /* renamed from: H */
            private CButton f28382H;

            /* renamed from: t */
            private TextView f28384t;

            /* renamed from: u */
            private TextView f28385u;

            /* renamed from: v */
            private TextView f28386v;

            /* renamed from: w */
            private TextView f28387w;

            /* renamed from: x */
            private ImageView f28388x;

            /* renamed from: y */
            private CButton f28389y;

            /* renamed from: z */
            private TextView f28390z;

            /* synthetic */ c(d dVar, View view, a aVar) {
                this(view);
            }

            private c(View view) {
                super(view);
                this.f28384t = (TextView) view.findViewById(AbstractC5955f.tv_header_title);
                this.f28385u = (TextView) view.findViewById(AbstractC5955f.tv_header_detail);
                this.f28386v = (TextView) view.findViewById(AbstractC5955f.tv_item_title);
                this.f28387w = (TextView) view.findViewById(AbstractC5955f.tv_item_detail);
                this.f28388x = (ImageView) view.findViewById(AbstractC5955f.iv_item_information);
                this.f28389y = (CButton) view.findViewById(AbstractC5955f.btn_bottom);
                this.f28390z = (TextView) view.findViewById(AbstractC5955f.tv_item_title_1);
                this.f28375A = (TextView) view.findViewById(AbstractC5955f.tv_item_detail_1);
                this.f28376B = (ImageView) view.findViewById(AbstractC5955f.iv_item_information_1);
                this.f28377C = (CButton) view.findViewById(AbstractC5955f.btn_bottom_1);
                this.f28378D = view.findViewById(AbstractC5955f.layout_gpass);
                this.f28379E = (TextView) view.findViewById(AbstractC5955f.tv_item_title_2);
                this.f28380F = (TextView) view.findViewById(AbstractC5955f.tv_item_detail_2);
                this.f28381G = (ImageView) view.findViewById(AbstractC5955f.iv_item_information_2);
                this.f28382H = (CButton) view.findViewById(AbstractC5955f.btn_bottom_2);
            }
        }

        /* renamed from: com.korail.talk.ui.menu.discountMenu.NewTripMenuActivity$d$d */
        private class C0243d extends RecyclerView.E {

            /* renamed from: t */
            private TextView f28391t;

            /* renamed from: u */
            private TextView f28392u;

            /* renamed from: v */
            private ViewPager f28393v;

            /* renamed from: w */
            private TextView f28394w;

            /* synthetic */ C0243d(d dVar, View view, a aVar) {
                this(view);
            }

            private C0243d(View view) {
                super(view);
                this.f28391t = (TextView) view.findViewById(AbstractC5955f.tv_header_title);
                this.f28392u = (TextView) view.findViewById(AbstractC5955f.tv_header_detail);
                this.f28393v = (ViewPager) view.findViewById(AbstractC5955f.view_pager_image);
                this.f28394w = (TextView) view.findViewById(AbstractC5955f.tv_tour_package);
            }
        }

        private d() {
            this.f28361d = 6;
            this.f28362e = 1;
            this.f28363f = 2;
            this.f28364g = 3;
            this.f28365h = 4;
        }

        private TripMenuDao.TripMenu b(int i8) {
            return (TripMenuDao.TripMenu) NewTripMenuActivity.this.f28350n.get(i8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            if (C6630d.isNull(NewTripMenuActivity.this.f28350n)) {
                return 0;
            }
            return NewTripMenuActivity.this.f28350n.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i8) {
            String menuType = b(i8).getMenuType();
            if (N.isNotNull(menuType)) {
                if ("E".equals(menuType)) {
                    return 1;
                }
                if (x.MAX_AD_CONTENT_RATING_G.equals(menuType)) {
                    return 2;
                }
                if ("T".equals(menuType)) {
                    return 3;
                }
                if ("P".equals(menuType)) {
                    return 4;
                }
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(RecyclerView.E e8, int i8) throws Resources.NotFoundException {
            if (e8 instanceof a) {
                a aVar = (a) e8;
                TripMenuDao.TripMenu tripMenuB = b(i8);
                aVar.f28367t.setText(tripMenuB.getMenuTitle());
                aVar.f28368u.setText(tripMenuB.getMenuDetail());
                NewTripMenuActivity newTripMenuActivity = NewTripMenuActivity.this;
                aVar.f28369v.setAdapter(newTripMenuActivity.new b(newTripMenuActivity.getApplicationContext(), tripMenuB.getContList(), aVar.f28369v));
                if (tripMenuB.getContList() == null || tripMenuB.getContList().isEmpty()) {
                    return;
                }
                aVar.f28369v.setCurrentItem(50 - (50 % tripMenuB.getContList().size()));
                return;
            }
            int i9 = 0;
            if (e8 instanceof b) {
                b bVar = (b) e8;
                TripMenuDao.TripMenu tripMenuB2 = b(i8);
                bVar.f28371t.setText(tripMenuB2.getMenuTitle());
                bVar.f28372u.setText(tripMenuB2.getMenuDetail());
                for (TripMenuDao.ContentInfo contentInfo : tripMenuB2.getContList()) {
                    if (i9 == 6) {
                        return;
                    }
                    s.get().load(z.getWebHost() + contentInfo.getContImage()).into(bVar.f28373v[i9]);
                    bVar.f28373v[i9].setOnClickListener(new v4.c(this, i8));
                    i9++;
                }
                return;
            }
            if (e8 instanceof C0243d) {
                C0243d c0243d = (C0243d) e8;
                TripMenuDao.TripMenu tripMenuB3 = b(i8);
                c0243d.f28391t.setText(tripMenuB3.getMenuTitle());
                c0243d.f28392u.setText(tripMenuB3.getMenuDetail());
                NewTripMenuActivity newTripMenuActivity2 = NewTripMenuActivity.this;
                c0243d.f28393v.setAdapter(newTripMenuActivity2.new c(newTripMenuActivity2.getApplicationContext(), tripMenuB3.getContList(), c0243d.f28393v));
                c0243d.f28393v.setCurrentItem(50 - (50 % tripMenuB3.getContList().size()));
                c0243d.f28394w.setText(tripMenuB3.getMenuBtn());
                c0243d.f28394w.setOnClickListener(new v4.c(this, i8));
                return;
            }
            if (e8 instanceof c) {
                c cVar = (c) e8;
                TripMenuDao.TripMenu tripMenuB4 = b(i8);
                cVar.f28384t.setText(tripMenuB4.getMenuTitle());
                cVar.f28385u.setText(tripMenuB4.getMenuDetail());
                cVar.f28384t.setContentDescription(tripMenuB4.getMenuTitle());
                cVar.f28385u.setContentDescription(tripMenuB4.getMenuDetail());
                List<TripMenuDao.ContentInfo> contList = tripMenuB4.getContList();
                cVar.f28386v.setText(contList.get(0).getContTitle());
                cVar.f28387w.setText(contList.get(0).getContDetail());
                cVar.f28386v.setContentDescription(contList.get(0).getContTitle());
                cVar.f28387w.setContentDescription(contList.get(0).getContDetail());
                cVar.f28388x.setOnClickListener(new v4.c(this, i8));
                cVar.f28389y.setOnClickListener(new v4.c(this, i8));
                cVar.f28389y.setEnabled("Y".equals(contList.get(0).getPassActive()));
                cVar.f28390z.setText(contList.get(1).getContTitle());
                cVar.f28375A.setText(contList.get(1).getContDetail());
                cVar.f28390z.setContentDescription(contList.get(1).getContTitle());
                cVar.f28375A.setContentDescription(contList.get(1).getContDetail());
                cVar.f28376B.setOnClickListener(new v4.c(this, i8));
                cVar.f28377C.setOnClickListener(new v4.c(this, i8));
                cVar.f28377C.setEnabled("Y".equals(contList.get(1).getPassActive()));
                if (contList.size() <= 2) {
                    cVar.f28378D.setVisibility(8);
                    return;
                }
                cVar.f28379E.setText(contList.get(2).getContTitle());
                cVar.f28380F.setText(contList.get(2).getContDetail());
                cVar.f28379E.setContentDescription(contList.get(2).getContTitle());
                cVar.f28380F.setContentDescription(contList.get(2).getContDetail());
                cVar.f28381G.setOnClickListener(new v4.c(this, i8));
                cVar.f28382H.setOnClickListener(new v4.c(this, i8));
                cVar.f28382H.setEnabled("Y".equals(contList.get(2).getPassActive()));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public RecyclerView.E onCreateViewHolder(ViewGroup viewGroup, int i8) {
            RecyclerView.E aVar;
            if (i8 == 1) {
                aVar = new a(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.trip_event_list_item, viewGroup, false));
            } else {
                if (i8 == 2) {
                    return new b(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.trip_good_list_item, viewGroup, false));
                }
                if (i8 == 3) {
                    aVar = new C0243d(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.trip_tour_list_item, viewGroup, false));
                } else {
                    if (i8 != 4) {
                        return null;
                    }
                    aVar = new c(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.trip_pass_list_item, viewGroup, false));
                }
            }
            return aVar;
        }

        @Override // v4.c.a
        public void onCustomClick(View view, int i8) {
            int id = view.getId();
            if (AbstractC5955f.iv_item_1 == id) {
                NewTripMenuActivity.this.B0(b(i8).getContList().get(0).getContUrl());
                return;
            }
            if (AbstractC5955f.iv_item_2 == id) {
                NewTripMenuActivity.this.B0(b(i8).getContList().get(1).getContUrl());
                return;
            }
            if (AbstractC5955f.iv_item_3 == id) {
                NewTripMenuActivity.this.B0(b(i8).getContList().get(2).getContUrl());
                return;
            }
            if (AbstractC5955f.iv_item_4 == id) {
                NewTripMenuActivity.this.B0(b(i8).getContList().get(3).getContUrl());
                return;
            }
            if (AbstractC5955f.iv_item_5 == id) {
                NewTripMenuActivity.this.B0(b(i8).getContList().get(4).getContUrl());
                return;
            }
            if (AbstractC5955f.iv_item_6 == id) {
                NewTripMenuActivity.this.B0(b(i8).getContList().get(5).getContUrl());
                return;
            }
            if (AbstractC5955f.tv_tour_package == id) {
                NewTripMenuActivity.this.B0(b(i8).getMenuUrl());
                return;
            }
            if (AbstractC5955f.iv_item_information == id) {
                C6637k.getCDialog(NewTripMenuActivity.this.K(), 1001, 0, NewTripMenuActivity.this.getString(AbstractC5959j.dialog_title)).setContent(b(i8).getContList().get(0).getPassInfo()).showDialog();
                return;
            }
            if (AbstractC5955f.iv_item_information_1 == id) {
                C6637k.getCDialog(NewTripMenuActivity.this.K(), 1001, 0, NewTripMenuActivity.this.getString(AbstractC5959j.dialog_title)).setContent(b(i8).getContList().get(1).getPassInfo()).showDialog();
                return;
            }
            if (AbstractC5955f.iv_item_information_2 == id) {
                C6637k.getCDialog(NewTripMenuActivity.this.K(), 1001, 0, NewTripMenuActivity.this.getString(AbstractC5959j.dialog_title)).setContent(b(i8).getContList().get(2).getPassInfo()).showDialog();
                return;
            }
            if (AbstractC5955f.btn_bottom == id) {
                NewTripMenuActivity.this.A0(b(i8).getContList().get(0));
            } else if (AbstractC5955f.btn_bottom_1 == id) {
                NewTripMenuActivity.this.A0(b(i8).getContList().get(1));
            } else if (AbstractC5955f.btn_bottom_2 == id) {
                NewTripMenuActivity.this.A0(b(i8).getContList().get(2));
            }
        }

        /* synthetic */ d(NewTripMenuActivity newTripMenuActivity, a aVar) {
            this();
        }
    }
}

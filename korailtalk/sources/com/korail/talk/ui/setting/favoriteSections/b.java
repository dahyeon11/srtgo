package com.korail.talk.ui.setting.favoriteSections;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.kakao.sdk.user.Constants;
import com.korail.talk.database.model.FavoriteStation;
import g5.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k0.AbstractC5837a;
import n4.AbstractC5953d;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import q4.C6111b;
import v4.c;
import z4.C6630d;
import z4.C6637k;

/* loaded from: classes.dex */
public class b extends com.korail.talk.view.base.a implements View.OnClickListener, AdapterView.OnItemClickListener {
    public static final int ADD_MODE = 0;
    public static final int EDIT_MODE = 1;
    public static final String TAG = "FavoriteSectionListFragment";

    /* renamed from: d0, reason: collision with root package name */
    private int f28794d0;

    /* renamed from: e0, reason: collision with root package name */
    private ArrayList f28795e0;

    /* renamed from: f0, reason: collision with root package name */
    private InterfaceC0251b f28796f0;

    /* renamed from: g0, reason: collision with root package name */
    private ViewFlipper f28797g0;

    /* renamed from: h0, reason: collision with root package name */
    private TextView f28798h0;

    /* renamed from: i0, reason: collision with root package name */
    private TextView f28799i0;

    /* renamed from: j0, reason: collision with root package name */
    private Button f28800j0;

    /* renamed from: k0, reason: collision with root package name */
    private ListView f28801k0;

    /* renamed from: l0, reason: collision with root package name */
    private c f28802l0;

    /* renamed from: com.korail.talk.ui.setting.favoriteSections.b$b, reason: collision with other inner class name */
    public interface InterfaceC0251b {
        void callFavoriteSectionEdit(Bundle bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c extends BaseAdapter implements c.a {

        /* renamed from: a, reason: collision with root package name */
        private int f28803a;

        /* renamed from: b, reason: collision with root package name */
        private final LayoutInflater f28804b;

        private class a {

            /* renamed from: a, reason: collision with root package name */
            private TextView f28806a;

            /* renamed from: b, reason: collision with root package name */
            private ImageView f28807b;

            private a() {
            }
        }

        private Bundle e(int i8) {
            return (Bundle) b.this.f28795e0.get(i8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(Bundle bundle, DialogInterface dialogInterface, int i8) {
            if (102 == i8) {
                this.f28803a = 0;
                C6111b.getInstance().deleteFavoriteSection(bundle.getInt(Constants.ID));
                b.this.B0();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            b.this.E0();
            notifyDataSetChanged();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(int i8) {
            this.f28803a = i8;
            b.this.E0();
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (C6630d.isNull(b.this.f28795e0)) {
                return 0;
            }
            return b.this.f28795e0.size();
        }

        public Bundle getData() {
            return e(this.f28803a);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i8) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) {
            View viewInflate;
            a aVar;
            if (C6630d.isNull(view)) {
                aVar = new a();
                viewInflate = this.f28804b.inflate(AbstractC5957h.favorite_section_list_item, viewGroup, false);
                aVar.f28806a = (TextView) viewInflate.findViewById(AbstractC5955f.routeTxt);
                aVar.f28807b = (ImageView) viewInflate.findViewById(AbstractC5955f.deleteBtn);
                viewInflate.setTag(aVar);
            } else {
                viewInflate = view;
                aVar = (a) view.getTag();
            }
            Bundle bundleE = e(i8);
            aVar.f28806a.setText(bundleE.getString(e.KEY_TRAIN_DEPARTURE, "") + " - " + bundleE.getString(e.KEY_TRAIN_ARRIVAL, ""));
            if (this.f28803a == i8) {
                aVar.f28806a.setTextColor(androidx.core.content.a.getColor(b.this.getApplicationContext(), AbstractC5953d.ocean_blue));
            } else {
                aVar.f28806a.setTextColor(-15132391);
            }
            aVar.f28807b.setOnClickListener(new v4.c(this, i8));
            return viewInflate;
        }

        @Override // v4.c.a
        public void onCustomClick(View view, int i8) {
            final Bundle bundleE = e(i8);
            C6637k.getCDialog(b.this.getActivity(), 1002, 0, b.this.getString(AbstractC5959j.dialog_title)).setContent(b.this.getString(AbstractC5959j.favorite_section_delete_pop_message)).setButtonListener(new DialogInterface.OnClickListener() { // from class: com.korail.talk.ui.setting.favoriteSections.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i9) {
                    this.f28809a.f(bundleE, dialogInterface, i9);
                }
            }).showDialog();
        }

        private c() {
            this.f28803a = 0;
            this.f28804b = LayoutInflater.from(b.this.getApplicationContext());
        }
    }

    private void A0() {
        this.f28800j0.setOnClickListener(this);
        this.f28801k0.setOnItemClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0() {
        List<FavoriteStation> favoriteStationList = C6111b.getInstance().getFavoriteStationList();
        if (favoriteStationList.size() == 0) {
            this.f28797g0.setDisplayedChild(0);
        } else {
            C0(favoriteStationList);
        }
    }

    private void C0(List list) {
        this.f28795e0.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FavoriteStation favoriteStation = (FavoriteStation) it.next();
            Bundle bundle = new Bundle();
            bundle.putString(e.KEY_TRAIN_DEPARTURE, favoriteStation.getStartStation());
            bundle.putString(e.KEY_TRAIN_ARRIVAL, favoriteStation.getArrivalStation());
            bundle.putInt(Constants.ID, favoriteStation.getId());
            this.f28795e0.add(bundle);
        }
        int i8 = this.f28794d0;
        if (i8 == 0) {
            this.f28802l0.h(0);
        } else if (i8 == 1) {
            this.f28802l0.g();
        }
        this.f28797g0.setDisplayedChild(1);
    }

    private void D0() {
        this.f28797g0 = (ViewFlipper) p0(AbstractC5955f.flipper);
        this.f28798h0 = (TextView) p0(AbstractC5955f.departureTxt);
        this.f28799i0 = (TextView) p0(AbstractC5955f.arrivalTxt);
        Button button = (Button) p0(AbstractC5955f.editBtn);
        this.f28800j0 = button;
        button.setEnabled(false);
        this.f28801k0 = (ListView) p0(AbstractC5955f.list);
        c cVar = new c();
        this.f28802l0 = cVar;
        this.f28801k0.setAdapter((ListAdapter) cVar);
        p0(AbstractC5955f.sectionAddBtn).setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0() {
        Bundle data = this.f28802l0.getData();
        this.f28798h0.setText(data.getString(e.KEY_TRAIN_DEPARTURE));
        this.f28799i0.setText(data.getString(e.KEY_TRAIN_ARRIVAL));
        this.f28800j0.setEnabled(true);
    }

    public static b newInstance() {
        return new b();
    }

    private void z0() {
        this.f28794d0 = 0;
        this.f28795e0 = new ArrayList();
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            z0();
            D0();
            A0();
            B0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f28796f0 = (InterfaceC0251b) context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.sectionAddBtn == id) {
            setMode(0);
            this.f28796f0.callFavoriteSectionEdit(null);
        } else if (AbstractC5955f.editBtn == id) {
            setMode(1);
            this.f28796f0.callFavoriteSectionEdit(this.f28802l0.getData());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.favorite_section_list_fragment, viewGroup, false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i8, long j8) {
        if (C6630d.isNull(this.f28802l0) || this.f28802l0.f28803a == i8) {
            return;
        }
        this.f28802l0.h(i8);
    }

    public void setMode(int i8) {
        this.f28794d0 = i8;
    }

    public void updateListData() {
        B0();
    }
}

package com.korail.talk.ui.setting;

import I4.h;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.korail.talk.ui.setting.favoriteCards.FavoriteCardsSettingActivity;
import com.korail.talk.ui.setting.favoriteSections.FavoriteSectionsSettingActivity;
import com.korail.talk.ui.setting.tossAuto.TossAutoSettingActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import p4.C6054a;
import z4.C6630d;
import z4.H;

/* loaded from: classes.dex */
public class SettingActivity extends BaseViewActivity implements AdapterView.OnItemClickListener {

    /* renamed from: i, reason: collision with root package name */
    private ListView f28729i;

    /* renamed from: j, reason: collision with root package name */
    private final Class[] f28730j = {FavoriteSectionsSettingActivity.class, TossAutoSettingActivity.class, FavoriteCardsSettingActivity.class, VeteransNoSettingActivity.class, PushSettingActivity.class, MultiLanguageActivity.class, VersionActivity.class};

    private class b extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final String[] f28731a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28732b;

        /* renamed from: c, reason: collision with root package name */
        private final LayoutInflater f28733c;

        class a implements CompoundButton.OnCheckedChangeListener {
            a() {
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                H.putBoolean(SettingActivity.this.getApplicationContext(), "IS_TICKET_AUTO_REFRESH", z8);
            }
        }

        /* renamed from: com.korail.talk.ui.setting.SettingActivity$b$b, reason: collision with other inner class name */
        class C0246b implements CompoundButton.OnCheckedChangeListener {
            C0246b() {
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                H.putBoolean(SettingActivity.this.getApplicationContext(), "IS_DIALOG_AUTO_POPUP_CHATBOT", z8);
            }
        }

        private class c {

            /* renamed from: a, reason: collision with root package name */
            RelativeLayout f28737a;

            /* renamed from: b, reason: collision with root package name */
            TextView f28738b;

            /* renamed from: c, reason: collision with root package name */
            TextView f28739c;

            /* renamed from: d, reason: collision with root package name */
            CheckBox f28740d;

            private c() {
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f28731a.length;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i8) {
            return this.f28731a[i8];
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) {
            c cVar;
            int i9;
            if (C6630d.isNull(view)) {
                view = this.f28733c.inflate(AbstractC5957h.list_item_value, viewGroup, false);
                cVar = new c();
                cVar.f28738b = (TextView) view.findViewById(AbstractC5955f.nameTxt);
                cVar.f28739c = (TextView) view.findViewById(AbstractC5955f.valueTxt);
                cVar.f28740d = (CheckBox) view.findViewById(AbstractC5955f.statusSwitch);
                cVar.f28737a = (RelativeLayout) view.findViewById(AbstractC5955f.rootView);
                view.setTag(cVar);
            } else {
                cVar = (c) view.getTag();
            }
            cVar.f28738b.setText(String.valueOf(getItem(i8)));
            cVar.f28739c.setVisibility(i8 == getCount() - 1 ? 0 : 8);
            cVar.f28740d.setVisibility(8);
            if (i8 == getCount() - 1) {
                cVar.f28739c.setText("V " + this.f28732b);
            } else {
                cVar.f28739c.setText((CharSequence) null);
                int i10 = 5;
                if (C6054a.IS_AUTO_REFRESH_ACTIVE && h.getInstance().isPhysicalDisability()) {
                    i9 = 6;
                } else if (C6054a.IS_AUTO_REFRESH_ACTIVE) {
                    i9 = -1;
                } else {
                    i9 = 5;
                    i10 = -1;
                }
                if (i8 == i10) {
                    cVar.f28737a.setVisibility(0);
                    cVar.f28740d.setVisibility(0);
                    cVar.f28740d.setChecked(H.getBoolean(SettingActivity.this.getApplicationContext(), "IS_TICKET_AUTO_REFRESH", true));
                    cVar.f28740d.setOnCheckedChangeListener(new a());
                } else if (i8 == i9) {
                    cVar.f28737a.setVisibility(0);
                    cVar.f28740d.setVisibility(0);
                    cVar.f28740d.setChecked(H.getBoolean(SettingActivity.this.getApplicationContext(), "IS_DIALOG_AUTO_POPUP_CHATBOT", true));
                    cVar.f28740d.setOnCheckedChangeListener(new C0246b());
                }
            }
            return view;
        }

        private b(String[] strArr) {
            this.f28731a = strArr;
            this.f28732b = C6630d.getVersionName();
            this.f28733c = SettingActivity.this.getLayoutInflater();
        }
    }

    private void s0() {
        this.f28729i.setOnItemClickListener(this);
    }

    private void setText() {
        setAppTitle(getString(AbstractC5959j.title_setting));
    }

    private void t0() throws Resources.NotFoundException {
        m0();
        this.f28729i = (ListView) findViewById(AbstractC5955f.list);
        String[] stringArray = getResources().getStringArray(AbstractC5952c.setting);
        if (!C6054a.IS_AUTO_REFRESH_ACTIVE) {
            String[] strArr = new String[stringArray.length - 1];
            System.arraycopy(stringArray, 0, strArr, 0, 5);
            System.arraycopy(stringArray, 6, strArr, 5, stringArray.length - 6);
            stringArray = strArr;
        }
        if (!h.getInstance().isPhysicalDisability()) {
            int i8 = 0;
            while (true) {
                if (i8 >= stringArray.length) {
                    i8 = -1;
                    break;
                } else if (stringArray[i8].equals(getString(AbstractC5959j.dialog_title_setting_auto_chatbot))) {
                    break;
                } else {
                    i8++;
                }
            }
            String[] strArr2 = new String[stringArray.length - 1];
            System.arraycopy(stringArray, 0, strArr2, 0, i8);
            System.arraycopy(stringArray, i8 + 1, strArr2, i8, (stringArray.length - i8) - 1);
            stringArray = strArr2;
        }
        this.f28729i.setAdapter((ListAdapter) new b(stringArray));
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.setting_activity);
        if (C6630d.isNull(bundle)) {
            t0();
            setText();
            s0();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i8, long j8) {
        if (C6054a.IS_AUTO_REFRESH_ACTIVE && i8 >= 5) {
            i8--;
        }
        if (h.getInstance().isPhysicalDisability() && i8 >= 5) {
            i8--;
        }
        if (C6630d.isNotNull(this.f28730j[i8])) {
            Intent intent = new Intent(getApplicationContext(), (Class<?>) this.f28730j[i8]);
            if (C6630d.isNotNull(null)) {
                intent.putExtras((Bundle) null);
            }
            startActivity(intent);
        }
    }
}

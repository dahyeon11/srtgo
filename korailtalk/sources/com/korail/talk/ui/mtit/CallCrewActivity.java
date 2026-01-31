package com.korail.talk.ui.mtit;

import Q7.X;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.push.CallCrewDao;
import com.korail.talk.network.dao.push.CallCrewRequestListDao;
import com.korail.talk.network.dao.push.CallCrewRequestListDao.CallCrewDaoListRequest;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import v4.C6432b;
import z4.C6630d;
import z4.C6637k;

/* loaded from: classes.dex */
public class CallCrewActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private HashMap f28492i;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f28493j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f28494k;

    /* renamed from: l, reason: collision with root package name */
    private Button f28495l;

    /* renamed from: m, reason: collision with root package name */
    private ListView f28496m;

    /* renamed from: n, reason: collision with root package name */
    private b f28497n;

    /* renamed from: o, reason: collision with root package name */
    private EditText f28498o;

    /* renamed from: p, reason: collision with root package name */
    private EditText f28499p;

    /* renamed from: q, reason: collision with root package name */
    private LinearLayout f28500q;

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            CallCrewActivity.this.f28495l.setEnabled(CallCrewActivity.this.f28492i.size() > 0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    private class b extends BaseAdapter implements C6432b.a {

        /* renamed from: a, reason: collision with root package name */
        private LayoutInflater f28502a;

        private class a {
            public CheckBox mCheckBox;
            public TextView mTv;

            private a() {
            }

            /* synthetic */ a(b bVar, a aVar) {
                this();
            }
        }

        public b() {
            this.f28502a = CallCrewActivity.this.getLayoutInflater();
        }

        private CallCrewRequestListDao.PrsList a(int i8) {
            return (CallCrewRequestListDao.PrsList) CallCrewActivity.this.f28493j.get(i8);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (C6630d.isNull(CallCrewActivity.this.f28493j)) {
                return 0;
            }
            return CallCrewActivity.this.f28493j.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) {
            View viewInflate;
            a aVar;
            a aVar2 = null;
            if (C6630d.isNull(view)) {
                aVar = new a(this, aVar2);
                viewInflate = this.f28502a.inflate(AbstractC5957h.call_crew_list_item, viewGroup, false);
                aVar.mCheckBox = (CheckBox) viewInflate.findViewById(AbstractC5955f.cb_item);
                aVar.mTv = (TextView) viewInflate.findViewById(AbstractC5955f.tv_item);
                viewInflate.setTag(aVar);
            } else {
                viewInflate = view;
                aVar = (a) view.getTag();
            }
            aVar.mTv.setText(a(i8).getPrsCont());
            aVar.mCheckBox.setOnCheckedChangeListener(null);
            aVar.mCheckBox.setChecked(!C6630d.isNull(CallCrewActivity.this.f28492i.get(Integer.valueOf(i8))));
            aVar.mCheckBox.setOnCheckedChangeListener(new C6432b(this, i8));
            return viewInflate;
        }

        @Override // v4.C6432b.a
        public void onCustomCheckedChanged(CompoundButton compoundButton, boolean z8, int i8) {
            CallCrewActivity.this.f28492i.clear();
            if (z8) {
                CallCrewActivity.this.f28492i.put(Integer.valueOf(i8), getItem(i8));
            } else {
                CallCrewActivity.this.f28492i.remove(Integer.valueOf(i8));
            }
            notifyDataSetChanged();
            CallCrewActivity.this.f28498o.setEnabled(true);
            CallCrewActivity.this.f28495l.setEnabled(!CallCrewActivity.this.f28494k && CallCrewActivity.this.f28492i.size() > 0);
        }

        @Override // android.widget.Adapter
        public String getItem(int i8) {
            if (C6630d.isNull(a(i8))) {
                return null;
            }
            return a(i8).getIntgMsgCd();
        }
    }

    private void A0() {
        CallCrewRequestListDao callCrewRequestListDao = new CallCrewRequestListDao();
        callCrewRequestListDao.setRequest(callCrewRequestListDao.new CallCrewDaoListRequest());
        executeDao(callCrewRequestListDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0(DialogInterface dialogInterface, int i8) {
        onBackPressed();
    }

    private void C0() {
        this.f28492i = new HashMap();
        this.f28494k = getIntent().getBooleanExtra("IS_FREE_SEAT", false);
        y0();
    }

    private void D0() {
        this.f28495l.setOnClickListener(this);
        this.f28499p.addTextChangedListener(new a());
    }

    private void E0() {
        l0();
        Button button = (Button) findViewById(AbstractC5955f.btn_crew_call);
        this.f28495l = button;
        button.setEnabled(false);
        this.f28496m = (ListView) findViewById(AbstractC5955f.lv_crew);
        this.f28496m.addFooterView(getLayoutInflater().inflate(AbstractC5957h.call_crew_list_footer, (ViewGroup) null, false));
        this.f28498o = (EditText) findViewById(AbstractC5955f.et_etc);
        this.f28499p = (EditText) findViewById(AbstractC5955f.et_free_seat);
        LinearLayout linearLayout = (LinearLayout) findViewById(AbstractC5955f.ll_free_seat);
        this.f28500q = linearLayout;
        if (this.f28494k) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
        b bVar = new b();
        this.f28497n = bVar;
        this.f28496m.setAdapter((ListAdapter) bVar);
    }

    private void setText() {
        setAppTitle(getString(AbstractC5959j.title_call_crew) + X.SPACE + getString(AbstractC5959j.title_call_crew_title_en));
    }

    private void y0() {
        if (C6630d.isNull(this.f28493j)) {
            this.f28493j = new ArrayList();
        } else {
            this.f28493j.clear();
        }
    }

    private void z0() {
        IBaseDao callCrewDao = new CallCrewDao();
        CallCrewDao.CallCrewDaoRequest callCrewDaoRequest = (CallCrewDao.CallCrewDaoRequest) getIntent().getSerializableExtra("CALL_CREW");
        callCrewDaoRequest.setCoutMsgDvCd("C");
        Iterator it = this.f28492i.keySet().iterator();
        if (it.hasNext()) {
            Integer num = (Integer) it.next();
            num.intValue();
            callCrewDaoRequest.setIntgMsgCd1((String) this.f28492i.get(num));
        }
        callCrewDaoRequest.setIntgMsgCont(this.f28498o.getText().toString() + ", " + this.f28499p.getText().toString());
        callCrewDao.setRequest(callCrewDaoRequest);
        callCrewDao.setFinishView(true);
        executeDao(callCrewDao);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_crew_call == view.getId()) {
            z0();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.call_crew_activity);
        if (C6630d.isNull(bundle)) {
            C0();
            E0();
            setText();
            D0();
            A0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (iBaseDao.getId() == AbstractC5955f.dao_ticket_call_crew) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.title_call_crew)).setContent(getString(AbstractC5959j.call_crew_success_msg)).setButtonListener(new DialogInterface.OnClickListener() { // from class: C5.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f419a.B0(dialogInterface, i8);
                }
            }).showDialog();
        } else if (iBaseDao.getId() == AbstractC5955f.dao_ticket_call_crew_request_list) {
            this.f28493j.addAll(((CallCrewRequestListDao.CallCrewListResponse) iBaseDao.getResponse()).getPrsist());
            this.f28497n.notifyDataSetChanged();
        }
    }
}

package s4;

import Q7.X;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.view.accessibility.AbstractC0927b;
import com.korail.talk.database.model.StationData;
import com.korail.talk.network.BaseDaoHelper;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.IBase;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.IBaseResult;
import com.korail.talk.network.dao.trainsInfo.TrainSelectStationDao;
import com.korail.talk.network.dao.trainsInfo.TrainSelectStationDao.TrainSelectStationRequest;
import com.korail.talk.ui.booking.mainBooking.MainBookingActivity;
import com.korail.talk.view.CButton;
import com.korail.talk.view.CTextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import n4.AbstractC5960k;
import y4.C6536a;
import y4.C6537b;
import y4.C6538c;
import y4.C6539d;
import z4.C6630d;
import z4.C6637k;
import z4.H;
import z4.N;
import z4.O;

/* renamed from: s4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC6224h extends Dialog implements IBase, IBaseResult {

    /* renamed from: a, reason: collision with root package name */
    Context f36217a;

    /* renamed from: b, reason: collision with root package name */
    Runnable f36218b;

    /* renamed from: c, reason: collision with root package name */
    Runnable f36219c;

    /* renamed from: d, reason: collision with root package name */
    private BaseDaoHelper f36220d;

    /* renamed from: e, reason: collision with root package name */
    StationData f36221e;

    /* renamed from: f, reason: collision with root package name */
    StationData f36222f;

    /* renamed from: g, reason: collision with root package name */
    private ListView f36223g;

    /* renamed from: h, reason: collision with root package name */
    private ListView f36224h;

    /* renamed from: i, reason: collision with root package name */
    List f36225i;

    /* renamed from: j, reason: collision with root package name */
    private int f36226j;

    /* renamed from: s4.h$b */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogC6224h.this.dismiss();
            DialogC6224h.this.f36218b.run();
        }
    }

    /* renamed from: s4.h$c */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogC6224h.this.dismiss();
            DialogC6224h.this.f36219c.run();
        }
    }

    /* renamed from: s4.h$d */
    class d implements DialogInterface.OnClickListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i8) {
            dialogInterface.dismiss();
            Intent intent = new Intent(DialogC6224h.this.f36217a, (Class<?>) MainBookingActivity.class);
            intent.addFlags(AbstractC0927b.TYPE_VIEW_TARGETED_BY_SCROLL);
            DialogC6224h.this.f36217a.startActivity(intent);
            DialogC6224h.this.dismiss();
        }
    }

    /* renamed from: s4.h$f */
    public class f extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        private Context f36234a;

        /* renamed from: b, reason: collision with root package name */
        private List f36235b;

        /* renamed from: c, reason: collision with root package name */
        private int f36236c = -1;

        /* renamed from: s4.h$f$a */
        class a {

            /* renamed from: a, reason: collision with root package name */
            RadioButton f36238a;

            /* renamed from: b, reason: collision with root package name */
            TextView f36239b;

            a() {
            }
        }

        public f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(int i8, View view) {
            this.f36236c = i8;
            notifyDataSetChanged();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(int i8, View view) {
            this.f36236c = i8;
            notifyDataSetChanged();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(Context context, List list) {
            this.f36234a = context;
            this.f36235b = list;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f36235b.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i8) {
            return this.f36235b.get(i8);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            return i8;
        }

        public int getSelectedPosition() {
            return this.f36236c;
        }

        @Override // android.widget.Adapter
        public View getView(final int i8, View view, ViewGroup viewGroup) {
            a aVar;
            if (view == null) {
                view = LayoutInflater.from(this.f36234a).inflate(AbstractC5957h.row_radio_item, viewGroup, false);
                aVar = new a();
                aVar.f36238a = (RadioButton) view.findViewById(AbstractC5955f.radio_button);
                aVar.f36239b = (TextView) view.findViewById(AbstractC5955f.text_label);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            aVar.f36239b.setText((CharSequence) this.f36235b.get(i8));
            aVar.f36238a.setChecked(i8 == this.f36236c);
            view.setOnClickListener(new View.OnClickListener() { // from class: s4.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f36245a.e(i8, view2);
                }
            });
            aVar.f36238a.setOnClickListener(new View.OnClickListener() { // from class: s4.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f36247a.f(i8, view2);
                }
            });
            return view;
        }

        public void setSelectedPosition(int i8) {
            this.f36236c = i8;
            notifyDataSetChanged();
        }
    }

    /* renamed from: s4.h$g */
    public class g extends f {

        /* renamed from: e, reason: collision with root package name */
        private Context f36241e;

        /* renamed from: f, reason: collision with root package name */
        private List f36242f;

        /* renamed from: g, reason: collision with root package name */
        private int f36243g;

        public g() {
            super();
            this.f36243g = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(int i8, View view) {
            this.f36243g = i8;
            notifyDataSetChanged();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(int i8, View view) {
            this.f36243g = i8;
            notifyDataSetChanged();
        }

        void g(Context context, List list) {
            this.f36241e = context;
            this.f36242f = list;
        }

        @Override // s4.DialogC6224h.f, android.widget.Adapter
        public int getCount() {
            return this.f36242f.size();
        }

        @Override // s4.DialogC6224h.f, android.widget.Adapter
        public View getView(final int i8, View view, ViewGroup viewGroup) {
            f.a aVar;
            if (view == null) {
                view = LayoutInflater.from(this.f36241e).inflate(AbstractC5957h.row_radio_item, viewGroup, false);
                aVar = new f.a();
                aVar.f36238a = (RadioButton) view.findViewById(AbstractC5955f.radio_button);
                aVar.f36239b = (TextView) view.findViewById(AbstractC5955f.text_label);
                view.setTag(aVar);
            } else {
                aVar = (f.a) view.getTag();
            }
            aVar.f36239b.setText(((TrainSelectStationDao.TransferStationInfo) this.f36242f.get(i8)).getChtnRsStnNm());
            aVar.f36238a.setChecked(i8 == this.f36243g);
            view.setOnClickListener(new View.OnClickListener() { // from class: s4.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f36249a.e(i8, view2);
                }
            });
            aVar.f36238a.setOnClickListener(new View.OnClickListener() { // from class: s4.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f36251a.f(i8, view2);
                }
            });
            return view;
        }

        @Override // s4.DialogC6224h.f, android.widget.Adapter
        public TrainSelectStationDao.TransferStationInfo getItem(int i8) {
            return (TrainSelectStationDao.TransferStationInfo) this.f36242f.get(i8);
        }
    }

    public DialogC6224h(Context context) {
        super(context, AbstractC5960k.NewFullScreenDialog);
        this.f36226j = 0;
        this.f36217a = context;
        requestWindowFeature(1);
        setContentView(AbstractC5957h.dialog_full_popup);
    }

    private void a() {
        TrainSelectStationDao trainSelectStationDao = new TrainSelectStationDao();
        TrainSelectStationDao.TrainSelectStationRequest trainSelectStationRequest = trainSelectStationDao.new TrainSelectStationRequest();
        trainSelectStationRequest.setDptRsStnCd(this.f36221e.getStnCd());
        trainSelectStationRequest.setArvRsStnCd(this.f36222f.getStnCd());
        trainSelectStationDao.setRequest(trainSelectStationRequest);
        executeDao(trainSelectStationDao);
    }

    private void b(IBaseDao iBaseDao) {
        iBaseDao.getBase();
        if (iBaseDao.getId() == AbstractC5955f.dao_select_station) {
            TrainSelectStationDao.TrainSelectStationResponse trainSelectStationResponse = (TrainSelectStationDao.TrainSelectStationResponse) iBaseDao.getResponse();
            ArrayList arrayList = new ArrayList();
            this.f36225i = arrayList;
            arrayList.add(TrainSelectStationDao.getAllTransferStationInfo());
            this.f36225i.addAll(trainSelectStationResponse.getChtnList());
            g gVar = new g();
            gVar.g(this.f36217a, this.f36225i);
            this.f36223g.setAdapter((ListAdapter) gVar);
            gVar.setSelectedPosition(0);
            this.f36223g.setOnItemSelectedListener(new e(gVar));
        }
    }

    private void d() {
        List listAsList = Arrays.asList(O.getTrainGroupTransferFilterData());
        f fVar = new f();
        fVar.g(this.f36217a, listAsList);
        fVar.setSelectedPosition(0);
        this.f36224h.setAdapter((ListAdapter) fVar);
        this.f36224h.setOnItemSelectedListener(new a(fVar));
        this.f36220d = new BaseDaoHelper();
    }

    void e() {
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawableResource(R.color.transparent);
            window.setFlags(768, 768);
        }
        findViewById(AbstractC5955f.btn_dialog_neutral).setVisibility(8);
        CButton cButton = (CButton) findViewById(AbstractC5955f.btn_dialog_positive);
        cButton.setText(this.f36217a.getString(AbstractC5959j.common_confirm));
        cButton.setOnClickListener(new b());
        CButton cButton2 = (CButton) findViewById(AbstractC5955f.btn_dialog_negative);
        cButton2.setText(this.f36217a.getString(AbstractC5959j.common_cancel));
        cButton2.setOnClickListener(new c());
        ((CTextView) findViewById(AbstractC5955f.tv_dialog_title)).setText(this.f36217a.getString(AbstractC5959j.common_select_transfer));
        ListView listView = (ListView) findViewById(AbstractC5955f.fdlv_select_station_list);
        this.f36223g = listView;
        listView.setNestedScrollingEnabled(false);
        ListView listView2 = (ListView) findViewById(AbstractC5955f.fdlv_select_train_list);
        this.f36224h = listView2;
        listView2.setNestedScrollingEnabled(false);
    }

    @Override // com.korail.talk.network.IBase
    public void executeDao(IBaseDao iBaseDao) {
        iBaseDao.setBase(this);
        iBaseDao.setINetworkResult(this);
        this.f36220d.executeDao(iBaseDao);
    }

    public TrainSelectStationDao.TransferStationInfo getStationInfo() {
        g gVar = (g) this.f36223g.getAdapter();
        return gVar.getItem(gVar.f36243g);
    }

    public int getTrainTypeInfo() {
        return ((f) this.f36224h.getAdapter()).f36236c;
    }

    @Override // com.korail.talk.network.IBase
    public boolean isFinishing() {
        return false;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e();
        d();
    }

    @Override // com.korail.talk.network.IBaseResult
    public void onIntegrationResult(IBaseDao iBaseDao, C6536a c6536a) {
        C6536a c6536a2;
        IBase base = iBaseDao.getBase();
        String macroShowDialog = iBaseDao.getMacroShowDialog();
        if (C6630d.isNull(c6536a)) {
            BaseResponse response = iBaseDao.getResponse();
            String strResult = response.getStrResult();
            String str = response.gethMsgCd();
            if ((BaseResponse.FAIL.equals(strResult) && (AbstractC5955f.dao_check_service == iBaseDao.getId() || AbstractC5955f.dao_train_calendar == iBaseDao.getId())) || "SEMGTK".equals(response.gethMsgCd())) {
                c6536a2 = new C6537b(response.gethMsgTxt());
            } else if ("P058".equals(response.gethMsgCd())) {
                c6536a2 = H.getBoolean(this.f36217a, "KEY_AUTO_LOGIN") ? new C6539d(response.gethMsgTxt()) : new C6538c(response.gethMsgTxt());
            } else {
                if ("WRC000288".equals(str) || BaseResponse.FAIL.equals(strResult)) {
                    if (AbstractC5955f.dao_verify_maas_status == iBaseDao.getId() && "S198".equals(str)) {
                        base.onReceiveError(iBaseDao, null);
                        return;
                    } else {
                        String str2 = response.gethMsgTxt();
                        c6536a2 = new C6536a(N.isNull(str2) ? "알수없는 오류가 발생하였습니다." : str2.replaceAll("<br>", X.LF));
                    }
                }
                c6536a = null;
            }
            c6536a = c6536a2;
        } else if (macroShowDialog != null && !macroShowDialog.isEmpty()) {
            Context context = this.f36217a;
            C6637k.getCDialog(context, 1001, 0, context.getString(AbstractC5959j.dialog_title)).setContent(macroShowDialog).setButtonListener(new d()).showDialog();
            c6536a = null;
        }
        if (isFinishing()) {
            return;
        }
        if (C6630d.isNull(c6536a)) {
            b(iBaseDao);
            base.onReceive(iBaseDao);
            return;
        }
        c(iBaseDao, c6536a);
        if ((c6536a instanceof C6537b) || (c6536a instanceof C6539d) || (c6536a instanceof C6538c)) {
            return;
        }
        base.onReceiveError(iBaseDao, c6536a);
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        a();
    }

    public void setButtonListener(Runnable runnable, Runnable runnable2) {
        this.f36218b = runnable;
        this.f36219c = runnable2;
    }

    public void setStationData(StationData stationData, StationData stationData2) {
        this.f36221e = stationData;
        this.f36222f = stationData2;
    }

    public void setTrainTypePosition(int i8) {
        this.f36226j = i8;
    }

    @Override // com.korail.talk.network.IBase
    public void executeRetryDao() {
    }

    @Override // com.korail.talk.network.IBase
    public void onCancelDao() {
    }

    /* renamed from: s4.h$a */
    class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f36227a;

        a(f fVar) {
            this.f36227a = fVar;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i8, long j8) {
            this.f36227a.setSelectedPosition(i8);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: s4.h$e */
    class e implements AdapterView.OnItemSelectedListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f36232a;

        e(g gVar) {
            this.f36232a = gVar;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i8, long j8) {
            this.f36232a.setSelectedPosition(i8);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @Override // com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
    }

    private void c(IBaseDao iBaseDao, C6536a c6536a) {
    }

    @Override // com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
    }
}

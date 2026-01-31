package u4;

import A6.g;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import t4.C6364a;
import z4.C6630d;
import z4.t;

/* loaded from: classes.dex */
public class e extends C6364a implements g.e, View.OnClickListener {

    /* renamed from: l, reason: collision with root package name */
    private static e f37129l;

    /* renamed from: m, reason: collision with root package name */
    private static Context f37130m;

    /* renamed from: f, reason: collision with root package name */
    private g f37131f;

    /* renamed from: g, reason: collision with root package name */
    private LinearLayout f37132g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f37133h;

    /* renamed from: i, reason: collision with root package name */
    private ProgressBar f37134i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f37135j;

    /* renamed from: k, reason: collision with root package name */
    private Handler f37136k;

    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            g.d dVar = g.d.toEnum(message.what);
            g gVar = (g) message.obj;
            if (dVar.isContinue()) {
                A6.e continueData = gVar.getContinueData();
                int acountNotice = continueData.getAcountNotice();
                int currentWaitCount = continueData.getCurrentWaitCount();
                int currentNextCount = continueData.getCurrentNextCount();
                int updateAcount = continueData.getUpdateAcount();
                float currentTPS = continueData.getCurrentTPS();
                float currentWaitTimeSecond = continueData.getCurrentWaitTimeSecond();
                float currentWaitPercent = continueData.getCurrentWaitPercent();
                String str = ((((((((((((("waitcount = ") + currentWaitCount) + ", accountNotice = ") + acountNotice) + ", nextCount = ") + currentNextCount) + ", updateAcount = ") + updateAcount) + ", tps = ") + currentTPS) + ", waitTimeSecond = ") + currentWaitTimeSecond) + ", waitPercent = ") + currentWaitPercent;
                if (e.this.f37132g.getVisibility() == 4) {
                    e.this.f37132g.setVisibility(0);
                }
                if (dVar != g.d.ContinueInterval) {
                    e.this.f37134i.setProgress((int) currentWaitPercent);
                }
                t.d("netfunnel log testStr = " + str);
                e.this.f37133h.setText(e.this.q(acountNotice));
            }
        }
    }

    public e(Context context) {
        super(context);
        this.f37135j = true;
        this.f37136k = new a();
        this.f37135j = true;
    }

    public static void dismiss(e eVar) {
        t.e("");
        if (C6630d.isNotNull(eVar)) {
            eVar.dismissDialog();
        }
    }

    public static e getInstance(Context context) {
        if (f37130m != context) {
            t.e("mContext != context");
            dismiss(f37129l);
            f37129l = null;
        }
        if (C6630d.isNull(f37129l)) {
            t.e("mInstance == null");
            f37129l = new e(context);
            f37130m = context;
        }
        return f37129l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String q(int i8) {
        int i9 = i8 % 3;
        return i9 != 1 ? i9 != 2 ? "." : "..." : "..";
    }

    @Override // t4.C6364a
    protected void f() {
        g(AbstractC5957h.dialog_netfunnel);
    }

    public void finished() {
        this.f37135j = false;
    }

    public boolean getIsRunned() {
        return this.f37135j;
    }

    @Override // t4.C6364a
    protected void i() {
        a(AbstractC5955f.btn_netfunnel_stop).setOnClickListener(this);
    }

    @Override // t4.C6364a
    protected void k() {
        this.f37132g = (LinearLayout) a(AbstractC5955f.v_netfunnel_main);
        this.f37133h = (TextView) a(AbstractC5955f.tv_netfunnel_running_message);
        this.f37134i = (ProgressBar) a(AbstractC5955f.pb_netfunnel);
    }

    @Override // A6.g.e
    public void netfunnelMessage(g gVar, g.d dVar) {
        this.f37131f = gVar;
        Message messageObtainMessage = this.f37136k.obtainMessage();
        messageObtainMessage.what = dVar.value();
        messageObtainMessage.obj = gVar;
        this.f37136k.sendMessage(messageObtainMessage);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == AbstractC5955f.btn_netfunnel_stop) {
            this.f37131f.StopContinue();
        }
    }
}

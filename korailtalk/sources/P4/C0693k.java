package P4;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.korail.talk.network.dao.common.MaasMenuListDao;
import com.korail.talk.view.CTextView;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import z4.C6630d;

/* renamed from: P4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0693k extends BaseAdapter {
    public static final int MAX_MENU_COUNT = 5;

    /* renamed from: a, reason: collision with root package name */
    private List f3721a;

    /* renamed from: P4.k$a */
    public class a {
        public ImageView mIvIcon;
        public TextView mTvTitle;

        public a() {
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (C6630d.isNull(this.f3721a)) {
            return 0;
        }
        return this.f3721a.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i8) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i8, View view, ViewGroup viewGroup) {
        a aVar = new a();
        View viewInflate = View.inflate(viewGroup.getContext(), AbstractC5957h.list_item_maas_menu, null);
        aVar.mTvTitle = (CTextView) viewInflate.findViewById(AbstractC5955f.tv_maas_menu);
        aVar.mIvIcon = (ImageView) viewInflate.findViewById(AbstractC5955f.iv_maas_menu);
        aVar.mTvTitle.setText(((MaasMenuListDao.Menu) this.f3721a.get(i8)).getName());
        String login = ((MaasMenuListDao.Menu) this.f3721a.get(i8)).getLogin();
        String active = ((MaasMenuListDao.Menu) this.f3721a.get(i8)).getActive();
        boolean zIsLogin = I4.h.getInstance().isLogin();
        if ("Y".equals(login) && "Y".equals(active) && zIsLogin) {
            com.squareup.picasso.s.get().load(((MaasMenuListDao.Menu) this.f3721a.get(i8)).getIconOn()).resize(aVar.mIvIcon.getLayoutParams().width, aVar.mIvIcon.getLayoutParams().height).into(aVar.mIvIcon);
        } else if ("N".equals(login) && "Y".equals(active)) {
            com.squareup.picasso.s.get().load(((MaasMenuListDao.Menu) this.f3721a.get(i8)).getIconOn()).resize(aVar.mIvIcon.getLayoutParams().width, aVar.mIvIcon.getLayoutParams().height).into(aVar.mIvIcon);
        } else {
            com.squareup.picasso.s.get().load(((MaasMenuListDao.Menu) this.f3721a.get(i8)).getIconOff()).resize(aVar.mIvIcon.getLayoutParams().width, aVar.mIvIcon.getLayoutParams().height).into(aVar.mIvIcon);
        }
        viewInflate.setTag(aVar);
        return viewInflate;
    }

    public void setData(List<MaasMenuListDao.Menu> list) {
        this.f3721a = list;
    }

    @Override // android.widget.Adapter
    public MaasMenuListDao.Menu getItem(int i8) {
        z4.t.d("position - " + i8);
        return (MaasMenuListDao.Menu) this.f3721a.get(i8);
    }
}

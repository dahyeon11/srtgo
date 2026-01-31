package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.d;
import androidx.appcompat.view.menu.k;
import h.AbstractC5569g;

/* loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, k.a {

    /* renamed from: a, reason: collision with root package name */
    private e f6631a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.appcompat.app.d f6632b;

    /* renamed from: c, reason: collision with root package name */
    c f6633c;

    /* renamed from: d, reason: collision with root package name */
    private k.a f6634d;

    public f(e eVar) {
        this.f6631a = eVar;
    }

    public void dismiss() {
        androidx.appcompat.app.d dVar = this.f6632b;
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i8) {
        this.f6631a.performItemAction((h) this.f6633c.getAdapter().getItem(i8), 0);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void onCloseMenu(e eVar, boolean z8) {
        if (z8 || eVar == this.f6631a) {
            dismiss();
        }
        k.a aVar = this.f6634d;
        if (aVar != null) {
            aVar.onCloseMenu(eVar, z8);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f6633c.onCloseMenu(this.f6631a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i8, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i8 == 82 || i8 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f6632b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f6632b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f6631a.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f6631a.performShortcut(i8, keyEvent, 0);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean onOpenSubMenu(e eVar) {
        k.a aVar = this.f6634d;
        if (aVar != null) {
            return aVar.onOpenSubMenu(eVar);
        }
        return false;
    }

    public void setPresenterCallback(k.a aVar) {
        this.f6634d = aVar;
    }

    public void show(IBinder iBinder) {
        e eVar = this.f6631a;
        d.a aVar = new d.a(eVar.getContext());
        c cVar = new c(aVar.getContext(), AbstractC5569g.abc_list_menu_item_layout);
        this.f6633c = cVar;
        cVar.setCallback(this);
        this.f6631a.addMenuPresenter(this.f6633c);
        aVar.setAdapter(this.f6633c.getAdapter(), this);
        View headerView = eVar.getHeaderView();
        if (headerView != null) {
            aVar.setCustomTitle(headerView);
        } else {
            aVar.setIcon(eVar.getHeaderIcon()).setTitle(eVar.getHeaderTitle());
        }
        aVar.setOnKeyListener(this);
        androidx.appcompat.app.d dVarCreate = aVar.create();
        this.f6632b = dVarCreate;
        dVarCreate.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f6632b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f6632b.show();
    }
}

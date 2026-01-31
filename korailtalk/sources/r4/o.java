package r4;

import com.korail.talk.network.dao.pay.StbkAcntDao;
import o6.InterfaceC6042a;

/* loaded from: classes.dex */
public enum o implements InterfaceC6042a {
    GENERAL("일반실", "1"),
    SPECIAL("특실", "2"),
    ALL("전체", StbkAcntDao.DELETE_ACCOUNT);


    /* renamed from: a, reason: collision with root package name */
    private String f35755a;

    /* renamed from: b, reason: collision with root package name */
    private String f35756b;

    o(String str, String str2) {
        this.f35755a = str;
        this.f35756b = str2;
    }

    @Override // o6.InterfaceC6042a
    public String getCode() {
        return this.f35756b;
    }

    @Override // o6.InterfaceC6042a
    public String getName() {
        return this.f35755a;
    }
}

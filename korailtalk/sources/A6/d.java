package A6;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private h f81a;

    /* renamed from: b, reason: collision with root package name */
    private i f82b;

    public d() {
        this.f81a = null;
        this.f82b = new i();
    }

    public static B6.c makeURL(h hVar, i iVar) {
        return (iVar == null || hVar.isHostNotmodify() || iVar.getHost().length() <= 0 || iVar.getPort() <= 0) ? B6.c.make(hVar) : B6.c.make(hVar.getProtocol(), iVar.getHost(), iVar.getPort(), hVar.getQuery());
    }

    public void AliveNotice() throws b {
        i iVar = this.f82b;
        if (iVar == null || iVar.getKey().length() < 1) {
            return;
        }
        B6.c cVarMakeURL = makeURL(this.f81a, this.f82b);
        B6.a aVar = new B6.a();
        aVar.setTimeout(this.f81a.getTimeout());
        aVar.setURL(cVarMakeURL);
        aVar.addParam("opcode", "" + c.ALIVE_NOTICE.value());
        aVar.addParam("key", this.f82b.getKey());
        try {
            i iVarParser = i.Parser(aVar.execute());
            if (iVarParser == null) {
                throw new b(a.ErrorData);
            }
            this.f82b = iVarParser.m2clone();
        } catch (b e8) {
            throw e8;
        } catch (Exception e9) {
            throw new b(a.ErrorSock, e9.getMessage());
        }
    }

    public void CheckedEnter() throws b {
        i iVar = this.f82b;
        if (iVar == null || iVar.getKey().length() < 1) {
            return;
        }
        B6.c cVarMakeURL = makeURL(this.f81a, this.f82b);
        B6.a aVar = new B6.a();
        aVar.setTimeout(this.f81a.getTimeout());
        aVar.setURL(cVarMakeURL);
        aVar.addParam("opcode", "" + c.CHK_ENTER.value());
        aVar.addParam("key", this.f82b.getKey());
        try {
            i iVarParser = i.Parser(aVar.execute());
            if (iVarParser == null) {
                throw new b(a.ErrorData);
            }
            this.f82b = iVarParser.m2clone();
        } catch (b e8) {
            throw e8;
        } catch (Exception e9) {
            throw new b(a.ErrorSock, e9.getMessage());
        }
    }

    public void Complete() throws Throwable {
        i iVar = this.f82b;
        if (iVar == null || iVar.getKey().length() < 1) {
            return;
        }
        B6.c cVarMakeURL = makeURL(this.f81a, this.f82b);
        B6.a aVar = new B6.a();
        aVar.setTimeout(this.f81a.getTimeout());
        aVar.setURL(cVarMakeURL);
        aVar.addParam("opcode", "" + c.SET_COMPLETE.value());
        aVar.addParam("key", this.f82b.getKey());
        try {
            aVar.execute();
            this.f82b.clear();
        } catch (b e8) {
            throw e8;
        } catch (Exception e9) {
            throw new b(a.ErrorSock, e9.getMessage());
        }
    }

    public void GetTidCacekedEnter() throws b {
        if (this.f81a == null) {
            throw new b(a.ErrorParam);
        }
        this.f82b.clear();
        B6.c cVarMake = B6.c.make(this.f81a);
        B6.a aVar = new B6.a();
        aVar.setTimeout(this.f81a.getTimeout());
        aVar.setURL(cVarMake);
        aVar.addParam("opcode", "" + c.GET_TID_CHK_ENTER.value());
        aVar.addParam("sid", this.f81a.getServiceID());
        aVar.addParam("aid", this.f81a.getActionID());
        try {
            i iVarParser = i.Parser(aVar.execute());
            if (iVarParser == null) {
                throw new b(a.ErrorData);
            }
            this.f82b = iVarParser.m2clone();
        } catch (b e8) {
            throw e8;
        } catch (Exception e9) {
            throw new b(a.ErrorSock, e9.getMessage());
        }
    }

    public void Init() throws b {
        throw new b(a.ErrorNotSupport);
    }

    public void Stop() throws b {
        throw new b(a.ErrorNotSupport);
    }

    public i getResponse() {
        return this.f82b;
    }

    public void setProperty(h hVar) {
        this.f81a = hVar;
    }

    public d(h hVar) {
        this.f81a = null;
        this.f82b = new i();
        this.f81a = hVar;
    }
}

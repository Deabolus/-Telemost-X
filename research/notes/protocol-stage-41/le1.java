package defpackage;

import com.yandex.messaging.core.net.entities.SetPushTokenData;
import com.yandex.messaging.core.net.entities.SetPushTokenParams;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class le1 extends bff {
    public final /* synthetic */ int i = 1;
    public final /* synthetic */ String j;
    public final /* synthetic */ String k;
    public final /* synthetic */ pck l;
    public final /* synthetic */ String m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ tco r;
    public final /* synthetic */ qck s;
    public final /* synthetic */ Object t;

    public le1(qe1 qe1Var, String str, String str2, String str3, pck pckVar, String str4, boolean z, String str5, String str6, String str7, tco tcoVar) {
        this.s = qe1Var;
        this.j = str;
        this.k = str2;
        this.m = str3;
        this.l = pckVar;
        this.o = str4;
        this.n = z;
        this.p = str5;
        this.q = str6;
        this.t = str7;
        this.r = tcoVar;
    }

    public final boolean C(f7f f7fVar) {
        switch (this.i) {
            case 0:
                mqd.z(f7fVar, "error");
                this.r.l(f7fVar.a);
                break;
            default:
                mqd.z(f7fVar, "error");
                this.r.l(f7fVar.a);
                break;
        }
        return false;
    }

    public final void E(Object obj) {
        switch (this.i) {
            case 0:
                SetPushTokenData setPushTokenData = (SetPushTokenData) obj;
                mqd.z(setPushTokenData, "response");
                this.r.c0(setPushTokenData);
                break;
            default:
                SetPushTokenData setPushTokenData2 = (SetPushTokenData) obj;
                mqd.z(setPushTokenData2, "response");
                this.r.c0(setPushTokenData2);
                break;
        }
    }

    public final g5l I() {
        switch (this.i) {
            case 0:
                return ((qe1) this.s).b.a(new SetPushTokenParams(this.j, this.k, this.m, this.l.b.a, this.o, this.n, this.p, this.q, (String) this.t), "set_push_token");
            default:
                quc qucVar = ((ise) this.s).b;
                pck pckVar = this.l;
                g5l g5lVarA = qucVar.a(new SetPushTokenParams(this.j, this.k, pckVar.a, pckVar.b.a, this.m, this.n, this.o, this.p, this.q), "set_push_token");
                ((vc1) this.t).a(g5lVarA);
                return g5lVarA;
        }
    }

    public final znc s(ocl oclVar) {
        switch (this.i) {
            case 0:
                return fde.j(((qe1) this.s).b, "set_push_token", SetPushTokenData.class, oclVar);
            default:
                return fde.j(((ise) this.s).b, "set_push_token", SetPushTokenData.class, oclVar);
        }
    }

    public le1(ise iseVar, String str, String str2, pck pckVar, String str3, boolean z, String str4, String str5, String str6, vc1 vc1Var, tco tcoVar) {
        this.s = iseVar;
        this.j = str;
        this.k = str2;
        this.l = pckVar;
        this.m = str3;
        this.n = z;
        this.o = str4;
        this.p = str5;
        this.q = str6;
        this.t = vc1Var;
        this.r = tcoVar;
    }
}

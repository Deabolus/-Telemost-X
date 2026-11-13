package defpackage;

import android.os.Looper;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.techprofile.accounts.AuthUid;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final /* synthetic */ class p10 implements kib {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p10(dbk dbkVar, boolean z, wuk wukVar, wuk wukVar2) {
        this.a = 5;
        this.c = dbkVar;
        this.b = z;
        this.d = wukVar;
        this.e = wukVar2;
    }

    public final Object invoke() {
        s4k s4kVar;
        switch (this.a) {
            case 0:
                pib pibVar = (pib) this.c;
                d4a d4aVar = (d4a) this.d;
                a9h a9hVar = (a9h) this.e;
                boolean z = !this.b;
                a9hVar.setValue(Boolean.valueOf(z));
                if (pibVar != null) {
                    pibVar.invoke(d4aVar, Boolean.valueOf(z));
                }
                return fcq.a;
            case 1:
                cmc cmcVar = (cmc) this.c;
                bmc bmcVar = (bmc) this.d;
                String str = (String) this.e;
                ur0 ur0Var = cmcVar.g;
                gfg gfgVar = cmcVar.i;
                nb1 nb1Var = cmcVar.b;
                qhg qhgVar = bmcVar.a;
                ur0Var.getClass();
                Looper looper = ur0Var.b.a;
                Looper looperMyLooper = Looper.myLooper();
                if (!atl.u()) {
                    atl.s(looper, looperMyLooper, "Sockets work on logic");
                }
                if (nb1Var == null) {
                    s4kVar = null;
                } else {
                    i6h i6hVar = (i6h) ((y8k) ur0Var.a.a.g).get();
                    AuthUid authUidN = zkm.n(nb1Var);
                    i6hVar.getClass();
                    Looper looper2 = i6hVar.a.a;
                    Looper looperMyLooper2 = Looper.myLooper();
                    if (!atl.u()) {
                        atl.s(looper2, looperMyLooper2, "Unexpected thread");
                    }
                    x20 x20Var = i6hVar.g;
                    pj pjVar = i6hVar.d;
                    x20Var.j(Boolean.valueOf(pjVar.a(authUidN) != null), "tech_multi_socket_proxy_connection", "has_real_socket");
                    s4kVar = new s4k(i6hVar.i, authUidN, qhgVar, pjVar);
                }
                if (s4kVar != null) {
                    return s4kVar;
                }
                gmg gmgVar = (gmg) cmcVar.h.get();
                d4s d4sVar = cmcVar.c;
                String str2 = d4sVar.a;
                if (str2 != null) {
                    return gmgVar.a(str, str2, d4sVar.b, (l0d) ((lfg) ((y8q) gfgVar).b).d(gfgVar), (w3s) ((lfg) ((y8q) gfgVar).b).d(new lf1(22)), this.b, qhgVar);
                }
                throw new IllegalStateException("No connection created");
            case 2:
                ((zxo) ((zef) this.c).i.get()).c().b((jj6) this.d, (ryf) this.e, this.b);
                break;
            case 3:
                t6g t6gVar = (t6g) this.c;
                j6g j6gVar = (j6g) this.d;
                y2f y2fVar = (y2f) this.e;
                t6gVar.i.b(c7g.t, null);
                j6gVar.M(y2fVar, this.b);
                break;
            case 4:
                d7g d7gVar = ((t6g) this.c).i;
                j6g j6gVar2 = (j6g) this.d;
                ServerMessageRef serverMessageRef = (ServerMessageRef) this.e;
                if (this.b) {
                    d7gVar.b(c7g.E, null);
                    j6gVar2.J(serverMessageRef);
                } else {
                    d7gVar.b(c7g.D, null);
                    j6gVar2.i(serverMessageRef);
                }
                return fcq.a;
            case 5:
                dbk dbkVar = (dbk) this.c;
                wuk wukVar = (wuk) this.d;
                wuk wukVar2 = (wuk) this.e;
                boolean zB = dbkVar.b();
                ue6 ue6Var = dbkVar.a;
                jri jriVar = dbkVar.h;
                boolean z2 = this.b;
                if (zB != z2) {
                    dbkVar.d.setValue(Boolean.valueOf(z2));
                    dbkVar.f.l(0.0f);
                    lo7.z(ue6Var, (ie6) null, (ze6) null, new sg0(dbkVar, z2 ? jriVar.k() : 0.0f, (ic6) null, 4), 3);
                }
                dbkVar.g.l(wukVar.a);
                float f = wukVar2.a;
                if (jriVar.k() != f) {
                    jriVar.l(f);
                    if (dbkVar.b()) {
                        lo7.z(ue6Var, (ie6) null, (ze6) null, new sg0(dbkVar, f, (ic6) null, 4), 3);
                    }
                }
                return fcq.a;
            default:
                ((zxo) ((eqo) this.c).i.get()).c().b((jj6) this.d, (ryf) this.e, this.b);
                break;
        }
        return fcq.a;
    }

    public /* synthetic */ p10(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public /* synthetic */ p10(boolean z, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}

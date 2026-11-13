package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class d1j implements cw3, f1j {
    public final nb1 a;
    public final Handler b;
    public final Handler c;
    public xa1 d;
    public cw3 e;
    public ig5 f;
    public ig5 g;
    public final /* synthetic */ x71 h;

    public d1j(x71 x71Var, nb1 nb1Var, tc1 tc1Var, xa1 xa1Var) {
        mqd.z(nb1Var, "authUid");
        this.h = x71Var;
        this.a = nb1Var;
        Handler handler = new Handler((Looper) x71Var.a);
        this.b = handler;
        this.c = new Handler();
        this.d = xa1Var;
        ne6.c((ne6) x71Var.i);
        handler.post(new c1j(this, 1));
    }

    public static final void b(d1j d1jVar, String str) {
        x71 x71Var = d1jVar.h;
        ne6.b((ne6) x71Var.i);
        cw3 cw3Var = d1jVar.e;
        if (!atl.u() && cw3Var != null) {
            atl.y("Passport token request is already running");
        }
        ig5 ig5Var = d1jVar.f;
        if (!atl.u() && ig5Var != null) {
            atl.y("User request is already running");
        }
        ig5 ig5Var2 = d1jVar.g;
        if (!atl.u() && ig5Var2 != null) {
            atl.y("Experiments request is already running");
        }
        d1jVar.e = ((g1j) x71Var.b).d(d1jVar, d1jVar.a, str, (oxk) ((ike) x71Var.c).get());
    }

    @Override // defpackage.f1j
    public final void a(e1j e1jVar, boolean z) {
        x71 x71Var = this.h;
        ne6.b((ne6) x71Var.i);
        cw3 cw3Var = this.e;
        if (!atl.u() && cw3Var == null) {
            atl.y("Passport token request is missing");
        }
        ig5 ig5Var = this.f;
        if (!atl.u() && ig5Var != null) {
            atl.y("User request is already running");
        }
        this.e = null;
        this.f = ((kg5) ((ike) x71Var.d).get()).a(new be1(2, xc1.e(e1jVar.a, this.a.a), x71Var, this, e1jVar, z));
    }

    @Override // defpackage.cw3
    public final void cancel() {
        ne6.c((ne6) this.h.i);
        this.d = null;
        this.b.post(new c1j(this, 0));
    }
}

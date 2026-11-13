package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class ze1 extends wo7 {
    public final /* synthetic */ bf1 j;
    public final /* synthetic */ xc1 k;
    public final /* synthetic */ af1 l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze1(bf1 bf1Var, xc1 xc1Var, af1 af1Var, boolean z, bff bffVar) {
        super(bffVar);
        this.j = bf1Var;
        this.k = xc1Var;
        this.l = af1Var;
        this.m = z;
    }

    public final boolean C(f7f f7fVar) {
        mqd.z(f7fVar, "error");
        bf1 bf1Var = this.j;
        s91 s91Var = bf1Var.c;
        atl.s(bf1Var.a, Looper.myLooper(), null);
        af1 af1Var = this.l;
        bf1 bf1Var2 = af1Var.f;
        String str = f7fVar.b;
        mqd.y(str, "code");
        boolean zM = p0o.M(str, "user_does_not_exist", false);
        xc1 xc1Var = this.k;
        if (zM) {
            new Handler(Looper.getMainLooper()).post(new rl(bf1Var2, 14));
        } else if (!uuh.b(f7fVar) || this.m) {
            if (uuh.a(f7fVar)) {
                s91Var.b(xc1Var.b());
                bf1Var.e.a(25, true);
                return true;
            }
            atl.s(bf1Var2.a, Looper.myLooper(), null);
            if (!af1Var.b.C(f7fVar)) {
                return false;
            }
            r91 r91Var = af1Var.d;
            if (r91Var != null) {
                r91Var.close();
            }
            af1Var.d = null;
            return true;
        }
        s91Var.b(xc1Var.b());
        return true;
    }

    public final void E(Object obj) {
        af1 af1Var = this.l;
        atl.s(af1Var.f.a, Looper.myLooper(), null);
        r91 r91Var = af1Var.d;
        if (r91Var != null) {
            r91Var.close();
        }
        af1Var.d = null;
        af1Var.b.E(obj);
    }

    @Override // defpackage.wo7
    public final void F() {
        if (this.i.X()) {
            this.l.a();
        }
        super.F();
    }

    @Override // defpackage.wo7
    public final g5l I() {
        bf1 bf1Var = this.j;
        atl.s(bf1Var.a, Looper.myLooper(), null);
        g5l g5lVarI = this.i.I();
        mqd.y(g5lVarI, "makeRequest(...)");
        y9a y9aVar = bf1Var.f;
        i82 i82Var = tcg.q;
        mqd.y(i82Var, "WORKPLACES");
        if (y9aVar.a(i82Var)) {
            g5lVarI.d("X-Ya-Organization-Id", String.valueOf(((Number) bf1Var.g.g.getValue()).longValue()));
        }
        g5l g5lVarA = this.k.a(g5lVarI);
        mqd.y(g5lVarA, "apply(...)");
        return g5lVarA;
    }
}

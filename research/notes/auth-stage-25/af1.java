package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class af1 implements l7l, t91 {
    public final String a;
    public final bff b;
    public final taa c;
    public r91 d;
    public x1k e;
    public final /* synthetic */ bf1 f;

    public af1(bf1 bf1Var, String str, bff bffVar, taa taaVar) {
        mqd.z(str, "requestId");
        this.f = bf1Var;
        this.a = str;
        this.b = bffVar;
        this.c = taaVar;
        this.d = bf1Var.c.f(this);
    }

    public final void a() {
        atl.s(this.f.a, Looper.myLooper(), null);
        r91 r91Var = this.d;
        if (r91Var != null) {
            r91Var.close();
        }
        this.d = null;
        x1k x1kVar = this.e;
        if (x1kVar != null) {
            ((b5k) x1kVar.k.d).c(x1kVar);
            ig5 ig5Var = x1kVar.j;
            if (ig5Var != null) {
                ig5Var.d0();
                izc izcVar = ig5Var.m;
                if (izcVar != null) {
                    izcVar.c();
                }
            }
        }
    }

    @Override // defpackage.cw3
    public final void cancel() {
        atl.s(this.f.a, Looper.myLooper(), null);
        r91 r91Var = this.d;
        if (r91Var != null) {
            r91Var.close();
        }
        this.d = null;
        x1k x1kVar = this.e;
        if (x1kVar != null) {
            x1kVar.cancel();
        }
        this.e = null;
    }

    @Override // defpackage.t91
    public final void g(xc1 xc1Var, boolean z) {
        mqd.z(xc1Var, "header");
        x1k x1kVar = this.e;
        if (x1kVar != null) {
            x1kVar.cancel();
        }
        this.e = null;
        if (xc1Var.d()) {
            bf1 bf1Var = this.f;
            ulf ulfVar = bf1Var.b;
            ze1 ze1Var = new ze1(bf1Var, xc1Var, this, z, this.b);
            taa taaVar = this.c;
            if (taaVar == null) {
                taaVar = saa.c;
            }
            atl.s((Looper) ulfVar.b, Looper.myLooper(), null);
            this.e = new x1k(ulfVar, this.a, ze1Var, taaVar);
        }
    }
}

package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class x1k extends wo7 implements l7l, z4k {
    public ig5 j;
    public final /* synthetic */ ulf k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1k(ulf ulfVar, String str, ze1 ze1Var, taa taaVar) {
        super(ze1Var);
        this.k = ulfVar;
        kg5 kg5Var = (kg5) ulfVar.c;
        atl.s(kg5Var.a, Looper.myLooper(), null);
        this.j = new ig5(kg5Var, str, this, taaVar);
        ((b5k) ulfVar.d).a(this);
    }

    public final boolean C(f7f f7fVar) {
        if (!this.i.C(f7fVar)) {
            return false;
        }
        ((b5k) this.k.d).c(this);
        return true;
    }

    public final void E(Object obj) {
        ((b5k) this.k.d).c(this);
        this.i.E(obj);
    }

    @Override // defpackage.cw3
    public final void cancel() {
        ulf ulfVar = this.k;
        atl.s((Looper) ulfVar.b, Looper.myLooper(), null);
        ((b5k) ulfVar.d).c(this);
        ig5 ig5Var = this.j;
        if (ig5Var != null) {
            ig5Var.cancel();
            this.j = null;
        }
    }

    @Override // defpackage.z4k
    public final void e() {
        ig5 ig5Var = this.j;
        if (ig5Var != null) {
            ig5Var.cancel();
            this.j = null;
        }
    }
}

package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.UUID;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class zfg extends FutureTask implements gpq {
    public final m0d a;
    public r91 b;
    public r91 c;
    public final /* synthetic */ agg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfg(agg aggVar, m0d m0dVar) {
        super(new wwd(1));
        this.d = aggVar;
        this.a = m0dVar;
        ((Handler) aggVar.b.get()).post(new xfg(this, 0));
    }

    public static void a(zfg zfgVar, rs6 rs6Var, xc1 xc1Var) {
        atl.n(((Handler) zfgVar.d.b.get()).getLooper(), Looper.myLooper(), null);
        if (xc1Var.d()) {
            df1 df1Var = (df1) rs6Var.F0.get();
            m0d m0dVar = zfgVar.a;
            exc excVar = df1Var.b;
            excVar.getClass();
            l0d l0dVarF = m0dVar.f();
            l0dVarF.l("https");
            fsc fscVar = excVar.d;
            l0dVarF.g((String) fscVar.a.d(fscVar.c));
            g5l g5lVarB = excVar.b(l0dVarF.e());
            g5lVarB.g(nxp.class, nxp.FileDownload);
            g5lVarB.e("GET", (f6l) null);
            g5lVarB.a("X-Request-Id", UUID.randomUUID().toString());
            xc1Var.a(g5lVarB);
            zfgVar.set(df1Var.a.a(g5lVarB.b()));
            r91 r91Var = zfgVar.c;
            if (r91Var != null) {
                r91Var.close();
                zfgVar.c = null;
            }
            r91 r91Var2 = zfgVar.b;
            if (r91Var2 != null) {
                r91Var2.close();
                zfgVar.b = null;
            }
        }
    }

    @Override // defpackage.gpq
    public final void i(final rs6 rs6Var) {
        atl.n(((Handler) this.d.b.get()).getLooper(), Looper.myLooper(), null);
        this.c = ((s91) rs6Var.g.get()).f(new t91() { // from class: yfg
            @Override // defpackage.t91
            public final void g(xc1 xc1Var, boolean z) {
                zfg.a(this.a, rs6Var, xc1Var);
            }
        });
        if (isDone()) {
            r91 r91Var = this.c;
            if (r91Var != null) {
                r91Var.close();
                this.c = null;
            }
            r91 r91Var2 = this.b;
            if (r91Var2 != null) {
                r91Var2.close();
                this.b = null;
            }
        }
    }
}

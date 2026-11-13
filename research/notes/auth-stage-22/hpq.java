package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class hpq {
    public final gjd a;
    public final Handler b;
    public final ne6 c;
    public final b5k d;
    public final uyh e;
    public po1 f;
    public rs6 g;

    public hpq(gjd gjdVar, Handler handler, ne6 ne6Var, b5k b5kVar, mwk mwkVar) {
        po1 po1Var;
        mqd.z(gjdVar, "userComponentBuilder");
        mqd.z(handler, "logicHandler");
        mqd.z(ne6Var, "dispatchers");
        mqd.z(b5kVar, "profileRemovedDispatcher");
        mqd.z(mwkVar, "registrationController");
        this.a = gjdVar;
        this.b = handler;
        this.c = ne6Var;
        this.d = b5kVar;
        this.e = new uyh();
        synchronized (mwkVar) {
            try {
                hpq hpqVar = mwkVar.m;
                if (!atl.u() && hpqVar != null) {
                    atl.y("Credentials listener is already registered");
                }
                mwkVar.m = this;
                po1Var = mwkVar.n.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f = po1Var;
    }

    public static void a(rs6 rs6Var, po1 po1Var) {
        s91 s91Var = (s91) rs6Var.g.get();
        nb1 nb1Var = rs6Var.c.a;
        hqq hqqVar = rs6Var.a;
        nb1 nb1Var2 = (nb1) po1Var.c;
        boolean z = nb1Var2 == null;
        xc1 xc1Var = (xc1) po1Var.d;
        hqqVar.b = z;
        if (nb1Var2 == null) {
            if (!atl.u() && nb1Var != null) {
                atl.y("Credentials sent to wrong user");
            }
            wc1 wc1VarB = xc1Var.b();
            ryh ryhVar = s91Var.b;
            atl.s(s91Var.c, Looper.myLooper(), null);
            if (s91Var.i != null) {
                throw new IllegalArgumentException();
            }
            atl.r(s91Var.k, null);
            atl.o(null, s91Var.e.contains("oauth_token"));
            s91Var.j = wc1VarB;
            ryhVar.b();
            while (ryhVar.hasNext()) {
                ((t91) ryhVar.next()).g(wc1VarB, false);
            }
            return;
        }
        Objects.requireNonNull(nb1Var2);
        if (!atl.u()) {
            atl.n(nb1Var, nb1Var2, "Credentials sent to wrong user");
        }
        ryh ryhVar2 = s91Var.b;
        atl.s(s91Var.c, Looper.myLooper(), null);
        nb1 nb1Var3 = s91Var.i;
        if (nb1Var3 == null) {
            throw new IllegalArgumentException();
        }
        if (s91Var.j.d()) {
            return;
        }
        s91Var.j = xc1Var;
        if (!xc1Var.d()) {
            s91Var.k = ((g1j) s91Var.f.get()).c(s91Var, nb1Var3, s91Var.g);
            return;
        }
        SharedPreferences.Editor editorEdit = s91Var.e.edit();
        editorEdit.putString("oauth_token", xc1Var.b().g());
        editorEdit.apply();
        ryhVar2.b();
        while (ryhVar2.hasNext()) {
            ((t91) ryhVar2.next()).g(xc1Var, false);
        }
    }

    public final rs6 b(po1 po1Var) {
        ne6.b(this.c);
        hqq hqqVar = new hqq((String) po1Var.b);
        gjd gjdVar = this.a;
        gjdVar.getClass();
        rs6 rs6Var = new rs6((ks6) gjdVar.b, (bs6) gjdVar.c, hqqVar);
        a(rs6Var, po1Var);
        return rs6Var;
    }

    public final String c() {
        ne6.b(this.c);
        po1 po1Var = this.f;
        if (!atl.u() && po1Var == null) {
            atl.y("Illegal state");
        }
        po1 po1Var2 = this.f;
        mqd.u(po1Var2);
        return (String) po1Var2.b;
    }

    public final r91 d(gpq gpqVar) {
        mqd.z(gpqVar, "listener");
        ne6 ne6Var = this.c;
        ne6.b(ne6Var);
        if (this.d.d.get()) {
            return null;
        }
        ne6.b(ne6Var);
        rs6 rs6Var = this.g;
        if (rs6Var == null) {
            po1 po1Var = this.f;
            if (po1Var != null) {
                this.g = b(po1Var);
            }
            rs6Var = this.g;
        }
        if (rs6Var != null) {
            gpqVar.i(rs6Var);
            return null;
        }
        this.e.b(gpqVar);
        return new r91(14, this, gpqVar);
    }
}

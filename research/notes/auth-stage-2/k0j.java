package defpackage;

import android.content.Context;
import android.net.Uri;
import com.yandex.passport.api.exception.n;
import com.yandex.passport.api.t;
import com.yandex.passport.api.u;
import com.yandex.passport.internal.impl.o;
import io.sentry.config.a;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class k0j {
    public final Context a;
    public final o b;
    public final t c;

    public k0j(Context context) {
        this.a = context;
        o oVarL = a.l(context);
        this.b = oVarL;
        this.c = oVarL.f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object b(k0j k0jVar, kc6 kc6Var) {
        h0j h0jVar;
        if (kc6Var instanceof h0j) {
            h0jVar = (h0j) kc6Var;
            int i = h0jVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                h0jVar.f = i - Integer.MIN_VALUE;
            } else {
                h0jVar = new h0j(k0jVar, kc6Var);
            }
        } else {
            h0jVar = new h0j(k0jVar, kc6Var);
        }
        Object obj = h0jVar.d;
        xe6 xe6Var = xe6.a;
        int i2 = h0jVar.f;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nzn.U(obj);
            return ((mel) obj).a;
        }
        nzn.U(obj);
        o oVar = k0jVar.b;
        h0jVar.f = 1;
        Object objI = oVar.i(h0jVar);
        return objI == xe6Var ? xe6Var : objI;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.yandex.passport.api.exception.n */
    public final void a(nb1 nb1Var, Uri uri) throws h91, n {
        mqd.z(nb1Var, "currentUid");
        mqd.z(uri, "uri");
        Object obj = ((mel) lo7.K(fc9.a, new dqi(this, nb1Var, uri, null, 1))).a;
        if (!(obj instanceof jel)) {
            ((Boolean) obj).getClass();
            obj = fcq.a;
        }
        n nVarA = mel.a(obj);
        if (nVarA == null) {
            return;
        }
        if (!(nVarA instanceof n)) {
            throw nVarA;
        }
        throw xo7.T(nVarA);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.yandex.passport.api.exception.n */
    public final hb1 c(nb1 nb1Var) throws h91, n {
        mqd.z(nb1Var, "uid");
        Object obj = ((mel) lo7.K(fc9.a, new pwh(this, nb1Var, null, 13))).a;
        n nVarA = mel.a(obj);
        if (nVarA == null) {
            String str = ((u) obj).a;
            mqd.z(str, "$this$toAuthToken");
            return new hb1(str);
        }
        if (nVarA instanceof n) {
            throw xo7.T(nVarA);
        }
        throw nVarA;
    }
}

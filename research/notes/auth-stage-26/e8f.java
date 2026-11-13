package defpackage;

import com.yandex.messaging.core.net.entities.CreateLimitUserData;
import com.yandex.messaging.core.net.entities.RequestUserParams;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class e8f extends bff {
    public final /* synthetic */ zm7 i;
    public final /* synthetic */ d8f j;

    public e8f(zm7 zm7Var, d8f d8fVar) {
        this.i = zm7Var;
        this.j = d8fVar;
    }

    public final void E(Object obj) {
        CreateLimitUserData createLimitUserData = (CreateLimitUserData) obj;
        mqd.z(createLimitUserData, "response");
        String str = createLimitUserData.user.guid;
        mqd.y(str, "guid");
        String str2 = createLimitUserData.yambToken;
        mqd.y(str2, "yambToken");
        sse sseVar = (sse) this.j;
        ne6.b(sseVar.a.k);
        sseVar.c.post(new axd(sseVar, str, str2, 3));
    }

    public final g5l I() {
        zm7 zm7Var = this.i;
        g5l g5lVarA = ((quc) zm7Var.b).a(new RequestUserParams(), "request_user");
        ((hu7) zm7Var.c).b(g5lVarA);
        return g5lVarA;
    }

    public final znc s(ocl oclVar) {
        return fde.j((quc) this.i.b, "request_user", CreateLimitUserData.class, oclVar);
    }
}

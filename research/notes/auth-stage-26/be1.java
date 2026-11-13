package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.ChatData;
import com.yandex.messaging.core.net.entities.RequestUserData;
import com.yandex.messaging.core.net.entities.RequestUserParams;
import com.yandex.messaging.core.net.entities.TogglePushTokenData;
import com.yandex.messaging.core.net.entities.TogglePushTokenParams;
import com.yandex.messaging.core.net.entities.chatcreate.CreatePrivateChatData;
import com.yandex.messaging.core.net.entities.chatcreate.CreatePrivateChatParam;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class be1 extends bff {
    public final /* synthetic */ int i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ be1(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.i = i;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
        this.n = obj4;
        this.j = z;
    }

    public final boolean C(f7f f7fVar) {
        switch (this.i) {
            case 0:
                mqd.z(f7fVar, "error");
                boolean z = f7fVar.a == 403;
                if (this.j && z) {
                    ryj ryjVar = ((qe1) this.m).g;
                    atl.s(ryjVar.a.get(), Looper.myLooper(), null);
                    ryjVar.b.post(new xfg(ryjVar, 16));
                }
                ((pd1) this.k).j(z ? uh9.c : new rh9(f7fVar));
                return true;
            case 1:
                mqd.z(f7fVar, "error");
                return false;
            default:
                d1j d1jVar = (d1j) this.m;
                mqd.z(f7fVar, "error");
                x71 x71Var = (x71) this.l;
                ne6.b((ne6) x71Var.i);
                if (!uuh.b(f7fVar) || this.j) {
                    if (!uuh.a(f7fVar)) {
                        return false;
                    }
                    d1jVar.f = null;
                    ((zmq) x71Var.g).a(25, true);
                    return true;
                }
                d1jVar.f = null;
                String str = ((e1j) this.n).a;
                mqd.y(str, "token");
                d1j.b(d1jVar, str);
                return true;
        }
    }

    public final void E(Object obj) {
        switch (this.i) {
            case 0:
                CreatePrivateChatData createPrivateChatData = (CreatePrivateChatData) obj;
                mqd.z(createPrivateChatData, "response");
                pd1 pd1Var = (pd1) this.k;
                ChatData chatData = createPrivateChatData.chat;
                mqd.y(chatData, "chat");
                pd1Var.s(chatData, createPrivateChatData.user);
                break;
            case 1:
                TogglePushTokenData togglePushTokenData = (TogglePushTokenData) obj;
                mqd.z(togglePushTokenData, "response");
                ((pe9) this.n).c0(togglePushTokenData);
                break;
            default:
                RequestUserData requestUserData = (RequestUserData) obj;
                mqd.z(requestUserData, "response");
                ne6.b((ne6) ((x71) this.l).i);
                d1j d1jVar = (d1j) this.m;
                e1j e1jVar = (e1j) this.n;
                x71 x71Var = d1jVar.h;
                ne6.b((ne6) x71Var.i);
                ig5 ig5Var = d1jVar.f;
                if (!atl.u() && ig5Var == null) {
                    atl.y("User request is missing");
                }
                ig5 ig5Var2 = d1jVar.g;
                if (!atl.u() && ig5Var2 != null) {
                    atl.y("Experiments request is already running");
                }
                d1jVar.f = null;
                wc1 wc1VarE = xc1.e(e1jVar.a, d1jVar.a.a);
                d1jVar.g = ((kg5) ((ike) x71Var.d).get()).a(new pe1(wc1VarE, x71Var, d1jVar, requestUserData, e1jVar, this.j, 1));
                break;
        }
    }

    public final g5l I() {
        switch (this.i) {
            case 0:
                return ((qe1) this.m).b.a((CreatePrivateChatParam) this.n, "create_private_chat");
            case 1:
                g5l g5lVarA = ((ise) this.k).b.a(new TogglePushTokenParams((String) this.l, this.j), "toggle_push_token");
                ((vc1) this.m).a(g5lVarA);
                return g5lVarA;
            default:
                xc1 xc1Var = (xc1) this.k;
                x71 x71Var = (x71) this.l;
                g5l g5lVarA2 = xc1Var.a(((quc) ((ike) x71Var.e).get()).a(new RequestUserParams(), "request_user"));
                ((hu7) x71Var.f).b(g5lVarA2);
                mqd.y(g5lVarA2, "apply(...)");
                return g5lVarA2;
        }
    }

    public final znc s(ocl oclVar) {
        switch (this.i) {
            case 0:
                return fde.j(((qe1) this.m).b, "create_private_chat", CreatePrivateChatData.class, oclVar);
            case 1:
                return fde.j(((ise) this.k).b, "toggle_push_token", TogglePushTokenData.class, oclVar);
            default:
                Object obj = ((ike) ((x71) this.l).e).get();
                mqd.y(obj, "get(...)");
                return fde.j((quc) obj, "request_user", RequestUserData.class, oclVar);
        }
    }

    public wf z() {
        switch (this.i) {
            case 0:
                wf wfVarA = ((pd1) this.k).a();
                return wfVarA == null ? (wf) this.l : wfVarA;
            default:
                return super.z();
        }
    }

    public be1(ise iseVar, String str, boolean z, vc1 vc1Var, pe9 pe9Var) {
        this.i = 1;
        this.k = iseVar;
        this.l = str;
        this.j = z;
        this.m = vc1Var;
        this.n = pe9Var;
    }
}

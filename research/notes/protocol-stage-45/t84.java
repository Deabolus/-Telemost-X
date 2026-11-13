package defpackage;

import com.yandex.messaging.core.net.entities.proto.PostMessageResponse;
import com.yandex.messaging.core.net.entities.proto.message.ChatApproval;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class t84 extends vx6 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ t84(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    public final ClientMessage L() {
        switch (this.e) {
            case 0:
                ChatApproval chatApproval = new ChatApproval();
                chatApproval.chatId = ((u84) this.f).a.b;
                return new ClientMessage(null, null, null, null, null, null, null, null, null, null, null, null, null, null, chatApproval, null, null, null, null, null, null, null, null, null, null, false, 0, false, 268419071, null);
            case 1:
                return new ClientMessage(null, null, null, (PlainMessage) this.f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, false, 268435447, null);
            case 2:
                return new ClientMessage(null, null, null, (PlainMessage) this.f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, false, 268435447, null);
            default:
                return (ClientMessage) ((eq2) this.f).invoke();
        }
    }

    public boolean R(PostMessageResponse postMessageResponse) {
        switch (this.e) {
            case 1:
                mqd.z(postMessageResponse, "errorResponse");
                ((pq7) this.g).p();
                return true;
            case 2:
                mqd.z(postMessageResponse, "errorResponse");
                ((pb5) this.g).p();
                return true;
            case 3:
                gw3 gw3Var = (gw3) this.g;
                mqd.z(postMessageResponse, "errorResponse");
                if (!gw3Var.y()) {
                    return true;
                }
                gw3Var.f(nzn.E(new qsj(postMessageResponse)));
                return true;
            default:
                return super.R(postMessageResponse);
        }
    }

    public final void S(PostMessageResponse postMessageResponse) {
        switch (this.e) {
            case 0:
                mqd.z(postMessageResponse, "response");
                ((mu3) this.g).run();
                u84 u84Var = (u84) this.f;
                u84Var.a();
                u84Var.e = null;
                break;
            case 1:
                mqd.z(postMessageResponse, "response");
                ((pq7) this.g).x();
                break;
            case 2:
                mqd.z(postMessageResponse, "response");
                ((pb5) this.g).x();
                break;
            default:
                mqd.z(postMessageResponse, "response");
                gw3 gw3Var = (gw3) this.g;
                if (gw3Var.y()) {
                    gw3Var.f(postMessageResponse);
                }
                break;
        }
    }
}

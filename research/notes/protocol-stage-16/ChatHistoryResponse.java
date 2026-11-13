package com.yandex.messaging.core.net.entities.proto;

import com.google.protobuf.DescriptorProtos;
import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.core.net.entities.proto.telemost.MeetingInfoFanoutResponse;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public class ChatHistoryResponse {

    @Json(name = "ApprovedByMe")
    @g8k(tag = 17)
    public boolean approvedByMe;

    @Json(name = "ChatId")
    @i4e
    @g8k(tag = 1)
    public String chatId;

    @Json(name = "ChatInfo")
    @g8k(tag = 14)
    public ChatInfoFromTransport chatInfo;

    @Json(name = "LastEditTsMcs")
    @g8k(tag = 3)
    public long lastEditTimestamp;

    @Json(name = "LastTsMcs")
    @g8k(tag = DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER)
    public long lastMessageTimestamp;

    @Json(name = "LastSeenByMeVersion")
    @g8k(tag = DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER)
    public Long lastSeenByMeVersion;

    @Json(name = "MeetingInfo")
    @g8k(tag = 26)
    public MeetingInfoFanoutResponse meetingInfo;

    @Json(name = "Messages")
    @g8k(tag = 2)
    public OutMessage[] messages;

    @Json(name = "HistoryStartTsMcs")
    @g8k(tag = DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER)
    public long minMessageTimestamp;

    @Json(name = "MyRole")
    @g8k(tag = DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER)
    public ChatRole myRole;

    @Json(name = "LastSeenSeqNo")
    @g8k(tag = 9)
    public long otherLastSeenSequenceNumber;

    @Json(name = "LastSeenTsMcs")
    @g8k(tag = 6)
    public long otherSeenMarker;

    @Json(name = "LastSeenByMeSeqNo")
    @g8k(tag = 10)
    public long ownerLastSeenSequenceNumber;

    @Json(name = "LastSeenByMeTsMcs")
    @g8k(tag = 7)
    public long ownerSeenMarker;

    @Json(name = "PartnerInfo")
    @g8k(tag = 18)
    public ReducedUserInfo partnerInfo;

    @Json(name = "MentionTsMcs")
    @g8k(tag = DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER)
    public long[] personalMentions;

    @Json(name = "PinnedMessageInfo")
    @g8k(tag = 20)
    public PinnedMessageInfo pinnedMessageInfo;

    @Json(name = "PrivateChatInfo")
    @g8k(tag = 24)
    public PrivateChatInfoFromTransport privateChatInfo;

    @Json(name = "SupportedEvents")
    @g8k(tag = 28)
    public ChatEventTypes supportedEvents;

    @Json(name = "ThreadParentMessage")
    @g8k(tag = 25)
    public ServerMessage threadParentMessage;

    public static class OutMessage {

        @Json(name = "ServerMessage")
        @i4e
        @g8k(tag = 101)
        public ServerMessage serverMessage;
    }
}

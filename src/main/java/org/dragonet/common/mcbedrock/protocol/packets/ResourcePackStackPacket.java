package org.dragonet.common.mcbedrock.protocol.packets;

import org.dragonet.common.mcbedrock.protocol.PEPacket;
import org.dragonet.common.mcbedrock.protocol.ProtocolInfo;

/**
 * Created on 2017/10/23.
 */
public class ResourcePackStackPacket extends PEPacket {

    @Override
    public int pid() {
        return ProtocolInfo.RESOURCE_PACK_STACK_PACKET;
    }

    @Override
    public void encodePayload() {
        putBoolean(false);
        putUnsignedVarInt(0);
        putUnsignedVarInt(0);
    }

    @Override
    public void decodePayload() {

    }
}

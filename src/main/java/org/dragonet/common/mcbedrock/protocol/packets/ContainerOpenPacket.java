package org.dragonet.common.mcbedrock.protocol.packets;

import org.dragonet.common.mcbedrock.protocol.PEPacket;
import org.dragonet.common.mcbedrock.protocol.ProtocolInfo;
import org.dragonet.common.mcbedrock.utilities.BlockPosition;

/**
 * Created on 2017/10/21.
 */
public class ContainerOpenPacket extends PEPacket {

    public int windowId;
    public int type;
    public BlockPosition position;
    public long eid;

    @Override
    public int pid() {
        return ProtocolInfo.CONTAINER_OPEN_PACKET;
    }

    @Override
    public void encodePayload() {
        putByte((byte) (windowId));
        putByte((byte) (type));
        putBlockPosition(position);
        putVarLong(eid);
    }

    @Override
    public void decodePayload() {
        windowId = getByte();
        type = getByte();
        position = getBlockPosition();
        eid = getVarLong();
    }

    //private
}

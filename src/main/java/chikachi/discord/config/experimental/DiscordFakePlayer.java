package chikachi.discord.config.experimental;

import com.mojang.authlib.GameProfile;
import net.dv8tion.jda.entities.User;
import net.minecraft.network.EnumPacketDirection;
import net.minecraft.network.NetworkManager;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.util.FakePlayer;

import java.util.UUID;

public class DiscordFakePlayer extends FakePlayer {
    public DiscordFakePlayer(WorldServer world, GameProfile name) {
        super(world, name);
        this.playerNetServerHandler = new DiscordFakeNetServerHandler(new NetworkManager(EnumPacketDirection.SERVERBOUND), this);
    }

    DiscordFakePlayer(User user) {
        this(MinecraftServer.getServer().worldServers[0], new GameProfile(UUID.randomUUID(), "@" + user.getUsername()));

        this.dimension = Integer.MIN_VALUE;
    }
}
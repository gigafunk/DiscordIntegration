/**
 * Copyright (C) 2016 Chikachi
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses.
 */

package chikachi.discord.config.message;

import chikachi.discord.DiscordClient;
import net.minecraft.stats.Achievement;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.event.entity.player.AchievementEvent;

public class AchievementMessageConfig extends BaseMessageConfig {
    public AchievementMessageConfig(boolean enabled, String message) {
        super("achievement", enabled, message);
    }

    public void handleEvent(AchievementEvent event) {
        if (!this.isEnabled()) {
            return;
        }

        Achievement achievement = event.getAchievement();

        DiscordClient.getInstance().sendMessage(
                this.getMessage()
                        .replace("%USER%", event.getEntityPlayer().getDisplayNameString())
                        .replace("%ACHIEVEMENT%", achievement.getStatName().getUnformattedText())
                        .replace("%DESCRIPTION%", I18n.translateToLocalFormatted(achievement.achievementDescription, "KEY"))
        );
    }
}

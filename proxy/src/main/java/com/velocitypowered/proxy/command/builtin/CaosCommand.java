/*
 * Copyright (C) 2018-2023 Velocity Contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.velocitypowered.proxy.command.builtin;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.velocitypowered.api.command.BrigadierCommand;
import com.velocitypowered.api.command.CommandSource;
import com.velocitypowered.api.util.ProxyVersion;
import com.velocitypowered.proxy.VelocityServer;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

public final class CaosCommand {

    private final VelocityServer velocityServer;

    public CaosCommand(VelocityServer velocityServer) {
        this.velocityServer = velocityServer;
    }

    public void register() {
        final LiteralArgumentBuilder<CommandSource> builder = BrigadierCommand
                .literalArgumentBuilder("caos")
                .executes(this::message);

        velocityServer.getCommandManager().register(new BrigadierCommand(builder.build()));
    }

    private int message(final CommandContext<CommandSource> context) {
        final ProxyVersion version = velocityServer.getVersion();
        final Component message = Component.text("This proxy is running Caos version %s".formatted(version.getVersion()))
                .color(NamedTextColor.YELLOW);

        context.getSource().sendMessage(message);
        return Command.SINGLE_SUCCESS;
    }

}

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

package com.velocitypowered.proxy.connection.util;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

/**
 * Common messages that might be sent a client for various connection-related states.
 */
public class ConnectionMessages {

  public static final Component ALREADY_CONNECTED = Component
      .text("Você já está conectado a esse servidor!", NamedTextColor.RED);
  public static final Component IN_PROGRESS = Component
      .text("Já estamos conectando você a esse servidor!", NamedTextColor.RED);
  public static final Component INTERNAL_SERVER_CONNECTION_ERROR = Component
      .text("Ocorreu um erro!", NamedTextColor.RED);

  private ConnectionMessages() {
    throw new AssertionError();
  }
}

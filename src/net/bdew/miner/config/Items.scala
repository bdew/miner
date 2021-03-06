/*
 * Copyright (c) bdew, 2015
 * https://github.com/bdew/miner
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://bdew.net/minecraft-mod-public-license/
 */

package net.bdew.miner.config

import net.bdew.lib.config.ItemManager
import net.bdew.miner.CreativeTabsMiner
import net.bdew.miner.miner.ItemMiner

object Items extends ItemManager(CreativeTabsMiner.main) {
  regItem(ItemMiner)
}
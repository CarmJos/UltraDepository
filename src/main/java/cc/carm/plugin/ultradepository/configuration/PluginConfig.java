package cc.carm.plugin.ultradepository.configuration;

import cc.carm.plugin.ultradepository.configuration.message.ConfigMessage;
import cc.carm.plugin.ultradepository.configuration.message.ConfigMessageList;
import cc.carm.plugin.ultradepository.configuration.values.ConfigStringCast;
import cc.carm.plugin.ultradepository.configuration.values.ConfigValue;
import org.bukkit.Material;

public class PluginConfig {

	public static final ConfigValue<Boolean> DEBUG = new ConfigValue<>(
			"debug", Boolean.class
	);

	public static final ConfigValue<String> STORAGE_METHOD = new ConfigValue<>(
			"storage.method", String.class
	);

	/**
	 * 收集配置
	 */
	public static class Collect {

		public static final ConfigValue<Boolean> PICKUP = new ConfigValue<>(
				"collect.pickup", Boolean.class, true
		);

		public static final ConfigValue<Boolean> KILL = new ConfigValue<>(
				"collect.kill", Boolean.class, true
		);

		public static final ConfigValue<Boolean> BREAK = new ConfigValue<>(
				"collect.break", Boolean.class, true
		);

	}

	/**
	 * 通用配置
	 */
	public static class General {
		/**
		 * 针对每一件物品的额外介绍
		 * 将添加到背包界面内的物品上，避免重复配置
		 */
		public static final ConfigMessageList ADDITIONAL_LORE = new ConfigMessageList(
				"general.additional-lore", new String[]{
				"%(item_name)", "%(amount)", "%(price)", "%(sold)", "%(limit)"
		});

		/**
		 * 提示玩家点击行为的介绍
		 * 将添加到背包界面内的物品上，避免重复配置
		 */
		public static final ConfigMessageList CLICK_LORE = new ConfigMessageList(
				"general.click-lore", new String[]{
				"%(item_name)", "%(amount)", "%(price)"
		});

		/**
		 * 售出界面的配置
		 */
		public static class SellGUI {


			public static final ConfigMessage TITLE = new ConfigMessage(
					"general.sell-gui.title", "&a&l出售",
					new String[]{
							"%(item_name)", "%(backpack_name)"
					}
			);

			public static class Items {

				public static class Add {

					public static final ConfigStringCast<Material> TYPE = new ConfigStringCast<>(
							"general.sell-gui.items.add.type",
							Material::matchMaterial, Material.STONE
					);


					public static final ConfigValue<Integer> DATA = new ConfigValue<>(
							"general.sell-gui.items.add.data", Integer.class, 0
					);


					public static final ConfigMessage NAME = new ConfigMessage(
							"general.sell-gui.items.add.name", "&a添加物品 %(amount) 个",
							new String[]{
									"%(item_name)", "%(amount)"
							}
					);


					public static final ConfigMessageList LORE = new ConfigMessageList(
							"general.sell-gui.items.add.lore", null,
							new String[]{
									"%(item_name)", "%(amount)"
							}
					);

				}

				public static class Remove {

					public static final ConfigStringCast<Material> TYPE = new ConfigStringCast<>(
							"general.sell-gui.items.remove.type",
							Material::matchMaterial, Material.STONE
					);


					public static final ConfigValue<Integer> DATA = new ConfigValue<>(
							"general.sell-gui.items.remove.data", Integer.class, 0
					);


					public static final ConfigMessage NAME = new ConfigMessage(
							"general.sell-gui.items.remove.name", "&c減少物品 %(amount) 个",
							new String[]{
									"%(item_name)", "%(amount)"
							}
					);


					public static final ConfigMessageList LORE = new ConfigMessageList(
							"general.sell-gui.items.remove.lore", null,
							new String[]{
									"%(item_name)", "%(amount)"
							}
					);

				}

				public static class Confirm {

					public static final ConfigStringCast<Material> TYPE = new ConfigStringCast<>(
							"general.sell-gui.items.confirm.type",
							Material::matchMaterial, Material.EMERALD
					);


					public static final ConfigValue<Integer> DATA = new ConfigValue<>(
							"general.sell-gui.items.confirm.data", Integer.class, 0
					);


					public static final ConfigMessage NAME = new ConfigMessage(
							"general.sell-gui.items.confirm.name", "&2确认售出",
							new String[]{
									"%(item_name)", "%(amount)", "%(money)"
							}
					);


					public static final ConfigMessageList LORE = new ConfigMessageList(
							"general.sell-gui.items.confirm.lore", null,
							new String[]{
									"%(item_name)", "%(amount)", "%(money)"
							}
					);

				}

				public static class Cancel {

					public static final ConfigStringCast<Material> TYPE = new ConfigStringCast<>(
							"general.sell-gui.items.cancel.type",
							Material::matchMaterial, Material.REDSTONE
					);


					public static final ConfigValue<Integer> DATA = new ConfigValue<>(
							"general.sell-gui.items.cancel.data", Integer.class, 0
					);


					public static final ConfigMessage NAME = new ConfigMessage(
							"general.sell-gui.items.cancel.name", "&4取消售出"
					);

					public static final ConfigMessageList LORE = new ConfigMessageList(
							"general.sell-gui.items.cancel.lore"
					);

				}

			}

		}

	}

}
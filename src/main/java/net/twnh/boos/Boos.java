package net.twnh.boos;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.twnh.boos.Entity.TestEntity;
import net.twnh.boos.Item.NewItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Boos implements ModInitializer {

	// This logger is used to write text to the console and the log file.
	public static final Logger LOGGER = LoggerFactory.getLogger("BOOS");

	// ITEMGROUPS
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier("boos", "general"),
			() -> new ItemStack(Boos.NEW_ITEM));

	// ITEMS
	public static final Item NEW_ITEM = new NewItem(new FabricItemSettings().group(Boos.ITEM_GROUP).maxCount(16));

	// ENTITIES
	public static final EntityType<TestEntity> TEST_ENTITY = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier("boos", "test_entity"),
			FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, TestEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
	);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		// ITEMS
		Registry.register(Registry.ITEM, new Identifier("boos", "new_item"), NEW_ITEM);

		// ENTITIES
		FabricDefaultAttributeRegistry.register(TEST_ENTITY, TestEntity.createMobAttributes());
	}
}

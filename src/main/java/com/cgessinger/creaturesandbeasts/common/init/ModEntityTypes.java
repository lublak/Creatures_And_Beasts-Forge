package com.cgessinger.creaturesandbeasts.common.init;

import com.cgessinger.creaturesandbeasts.CreaturesAndBeasts;
import com.cgessinger.creaturesandbeasts.common.entites.*;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes
{
	public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, CreaturesAndBeasts.MOD_ID);

	// Entity Types
	public static final RegistryObject<EntityType<LittleGrebeEntity>> LITTLE_GREBE = ENTITY_TYPES.register("little_grebe",
			() -> EntityType.Builder.create(LittleGrebeEntity::new, EntityClassification.CREATURE)
					.size(0.5f, 0.6f)
					.build(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "little_grebe").toString()));

	public static final RegistryObject<EntityType<LittleGrebeChickEntity>> LITTLE_GREBE_CHICK = ENTITY_TYPES.register("little_grebe_chick",
			() -> EntityType.Builder.create(LittleGrebeChickEntity::new, EntityClassification.CREATURE)
					.size(0.5f, 0.6f)
					.build(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "little_grebe_chick").toString()));

	public static final RegistryObject<EntityType<LizardEntity>> LIZARD = ENTITY_TYPES.register("lizard",
			() -> EntityType.Builder.create(LizardEntity::new, EntityClassification.CREATURE)
					.size(0.52f, 0.3f)
					.build(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "lizard").toString()));

	public static final RegistryObject<EntityType<CyndershellEntity>> CYNDERSHELL = ENTITY_TYPES.register("cyndershell",
			() -> EntityType.Builder.create(CyndershellEntity::new, EntityClassification.CREATURE)
					.size(1.4f, 1.7f)
					.immuneToFire()
					.build(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "cyndershell").toString()));

	public static final RegistryObject<EntityType<FriendlySporelingEntity>> FRIENDLY_SPORELING = ENTITY_TYPES.register("friendly_sporeling",
			() -> EntityType.Builder.create(FriendlySporelingEntity::new, EntityClassification.CREATURE)
					.size(0.5f, 0.6f)
					.build(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "friendly_sporeling").toString()));

	public static final RegistryObject<EntityType<HostileSporelingEntity>> HOSTILE_SPORELING = ENTITY_TYPES.register("hostile_sporeling",
			() -> EntityType.Builder.create(HostileSporelingEntity::new, EntityClassification.MONSTER)
					.size(0.5f, 0.6f)
					.build(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "hostile_sporeling").toString()));

	public static final RegistryObject<EntityType<NeutralSporelingEntity>> NEUTRAL_SPORELING = ENTITY_TYPES.register("neutral_sporeling",
			() -> EntityType.Builder.create(NeutralSporelingEntity::new, EntityClassification.MONSTER)
					.size(0.5f, 0.6f)
					.build(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "neutral_sporeling").toString()));
}

package jonahdepro.more.tools;

import net.minecraft.world.gen.GenerationStep;
import jonahdepro.more.tools.registry.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

public class worldGen {
  private static ConfiguredFeature<?, ?> TIN_ORE_OVERWORLD = Feature.ORE
    .configure(new OreFeatureConfig(
      OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
      ModBlocks.TIN_ORE.getDefaultState(),
      9)) // Vein size
    .range(new RangeDecoratorConfig(
      // You can also use one of the other height providers if you don't want a uniform distribution
      UniformHeightProvider.create(YOffset.aboveBottom(43), YOffset.fixed(84)))) // Inclusive min and max height
    .spreadHorizontally()
    .repeat(15); // Number of veins per chunk
 

  public static void generate() {
    RegistryKey<ConfiguredFeature<?, ?>> tinoreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
      new Identifier("moretools", "tin_ore_overworld"));
    Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, tinoreOverworld.getValue(), TIN_ORE_OVERWORLD);
    BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, tinoreOverworld); //fucking depricated error
  }
}
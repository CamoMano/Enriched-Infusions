package com.enrichedmc.infusions.mixin;

import com.enrichedmc.infusions.recipes.DynamicRecipes;
import com.google.gson.JsonElement;
import java.util.Map;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(RecipeManager.class)
public class RecipeManagerMixin {
    @Inject(method = "apply", at = @At("HEAD"))
    public void interceptApply(
        Map<Identifier, JsonElement> map,
        ResourceManager resourceManager,
        Profiler profiler,
        CallbackInfo ci
    ) { map.putAll(DynamicRecipes.REGISTRY); }
}
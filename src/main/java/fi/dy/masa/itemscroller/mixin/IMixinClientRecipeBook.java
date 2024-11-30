package fi.dy.masa.itemscroller.mixin;

import java.util.Map;

import net.minecraft.client.recipebook.ClientRecipeBook;
import net.minecraft.recipe.NetworkRecipeId;
import net.minecraft.recipe.RecipeDisplayEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ClientRecipeBook.class)
public interface IMixinClientRecipeBook
{
    @Accessor("recipes")
    Map<NetworkRecipeId, RecipeDisplayEntry> itemscroller_getRecipeMap();
}
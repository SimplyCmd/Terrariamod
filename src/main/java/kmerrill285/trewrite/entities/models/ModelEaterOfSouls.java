package kmerrill285.trewrite.entities.models;

import kmerrill285.trewrite.entities.monsters.EntityEaterOfSouls;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class ModelEaterOfSouls extends EntityModel<EntityEaterOfSouls> {
	private final RendererModel body1;
	private final RendererModel body2;
	private final RendererModel body3;
	private final RendererModel body4;
	private final RendererModel body5;
	private final RendererModel body6;
	private final RendererModel body7;
	private final RendererModel body8;
	private final RendererModel body9;
	private final RendererModel body10;
	private final RendererModel eyes;
	private final RendererModel horn1;
	private final RendererModel horn2;
	private final RendererModel smallhorns;
	private final RendererModel tentacles;

	public ModelEaterOfSouls() {
		textureWidth = 128;
		textureHeight = 128;

		body1 = new RendererModel(this);
		body1.setRotationPoint(8.0F, 24.0F, -6.0F);
		body1.cubeList.add(new ModelBox(body1, 0, 31, -15.0F, -6.0F, 4.0F, 15, 1, 1, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 0, 29, -15.0F, -6.0F, 6.0F, 15, 1, 1, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 0, 27, -15.0F, -6.0F, 9.0F, 15, 1, 1, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 32, 10, -14.0F, -6.0F, 10.0F, 13, 1, 2, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 0, 41, -14.0F, -6.0F, 14.0F, 13, 1, 1, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 48, 51, -13.0F, -6.0F, 12.0F, 11, 1, 2, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 24, 50, -13.0F, -6.0F, 15.0F, 11, 1, 2, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 40, 65, -12.0F, -6.0F, 17.0F, 9, 1, 1, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 23, 76, -11.0F, -6.0F, 18.0F, 7, 1, 1, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 77, 27, -10.0F, -6.0F, 19.0F, 5, 1, 2, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 83, 57, -9.0F, -6.0F, 21.0F, 3, 1, 2, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 85, 50, -8.0F, -6.0F, 23.0F, 1, 1, 3, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 0, 6, -16.0F, -6.0F, 7.0F, 17, 1, 2, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 27, 42, -14.0F, -6.0F, 5.0F, 13, 1, 1, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 27, 40, -14.0F, -6.0F, 3.0F, 13, 1, 1, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 23, 59, -13.0F, -6.0F, 2.0F, 11, 1, 1, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 75, 67, -11.0F, -6.0F, 1.0F, 7, 1, 1, 0.0F, false));

		body2 = new RendererModel(this);
		body2.setRotationPoint(8.0F, 23.0F, -6.0F);
		body2.cubeList.add(new ModelBox(body2, 0, 25, -15.0F, -6.0F, 4.0F, 15, 1, 1, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 23, -15.0F, -6.0F, 6.0F, 15, 1, 1, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 21, -15.0F, -6.0F, 9.0F, 15, 1, 1, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 31, 27, -14.0F, -6.0F, 10.0F, 13, 1, 2, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 39, -14.0F, -6.0F, 14.0F, 13, 1, 1, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 49, -13.0F, -6.0F, 12.0F, 11, 1, 2, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 48, 45, -13.0F, -6.0F, 15.0F, 11, 1, 2, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 20, 65, -12.0F, -6.0F, 17.0F, 9, 1, 1, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 39, 75, -11.0F, -6.0F, 18.0F, 7, 1, 1, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 77, 77, -10.0F, -6.0F, 19.0F, 5, 1, 2, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 83, 36, -9.0F, -6.0F, 21.0F, 3, 1, 2, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 3, -16.0F, -6.0F, 7.0F, 17, 1, 2, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 27, 38, -14.0F, -6.0F, 5.0F, 13, 1, 1, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 37, 8, -14.0F, -6.0F, 3.0F, 13, 1, 1, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 58, 30, -13.0F, -6.0F, 2.0F, 11, 1, 1, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 74, 65, -11.0F, -6.0F, 1.0F, 7, 1, 1, 0.0F, false));

		body3 = new RendererModel(this);
		body3.setRotationPoint(8.0F, 25.0F, -6.0F);
		body3.cubeList.add(new ModelBox(body3, 0, 19, -15.0F, -6.0F, 4.0F, 15, 1, 1, 0.0F, false));
		body3.cubeList.add(new ModelBox(body3, 0, 17, -15.0F, -6.0F, 6.0F, 15, 1, 1, 0.0F, false));
		body3.cubeList.add(new ModelBox(body3, 0, 15, -15.0F, -6.0F, 9.0F, 15, 1, 1, 0.0F, false));
		body3.cubeList.add(new ModelBox(body3, 31, 23, -14.0F, -6.0F, 10.0F, 13, 1, 2, 0.0F, false));
		body3.cubeList.add(new ModelBox(body3, 0, 37, -14.0F, -6.0F, 14.0F, 13, 1, 1, 0.0F, false));
		body3.cubeList.add(new ModelBox(body3, 48, 48, -13.0F, -6.0F, 12.0F, 11, 1, 2, 0.0F, false));
		body3.cubeList.add(new ModelBox(body3, 24, 47, -13.0F, -6.0F, 15.0F, 11, 1, 2, 0.0F, false));
		body3.cubeList.add(new ModelBox(body3, 0, 65, -12.0F, -6.0F, 17.0F, 9, 1, 1, 0.0F, false));
		body3.cubeList.add(new ModelBox(body3, 66, 74, -11.0F, -6.0F, 18.0F, 7, 1, 1, 0.0F, false));
		body3.cubeList.add(new ModelBox(body3, 37, 77, -10.0F, -6.0F, 19.0F, 5, 1, 2, 0.0F, false));
		body3.cubeList.add(new ModelBox(body3, 83, 15, -9.0F, -6.0F, 21.0F, 3, 1, 2, 0.0F, false));
		body3.cubeList.add(new ModelBox(body3, 0, 0, -16.0F, -6.0F, 7.0F, 17, 1, 2, 0.0F, false));
		body3.cubeList.add(new ModelBox(body3, 36, 6, -14.0F, -6.0F, 5.0F, 13, 1, 1, 0.0F, false));
		body3.cubeList.add(new ModelBox(body3, 36, 3, -14.0F, -6.0F, 3.0F, 13, 1, 1, 0.0F, false));
		body3.cubeList.add(new ModelBox(body3, 46, 58, -13.0F, -6.0F, 2.0F, 11, 1, 1, 0.0F, false));
		body3.cubeList.add(new ModelBox(body3, 24, 74, -11.0F, -6.0F, 1.0F, 7, 1, 1, 0.0F, false));

		body4 = new RendererModel(this);
		body4.setRotationPoint(8.0F, 22.0F, -6.0F);
		body4.cubeList.add(new ModelBox(body4, 36, 0, -14.0F, -6.0F, 4.0F, 13, 1, 1, 0.0F, false));
		body4.cubeList.add(new ModelBox(body4, 27, 36, -14.0F, -6.0F, 6.0F, 13, 1, 1, 0.0F, false));
		body4.cubeList.add(new ModelBox(body4, 0, 35, -14.0F, -6.0F, 9.0F, 13, 1, 1, 0.0F, false));
		body4.cubeList.add(new ModelBox(body4, 0, 46, -13.0F, -6.0F, 10.0F, 11, 1, 2, 0.0F, false));
		body4.cubeList.add(new ModelBox(body4, 0, 58, -13.0F, -6.0F, 14.0F, 11, 1, 1, 0.0F, false));
		body4.cubeList.add(new ModelBox(body4, 45, 60, -12.0F, -6.0F, 12.0F, 9, 1, 2, 0.0F, false));
		body4.cubeList.add(new ModelBox(body4, 0, 60, -12.0F, -6.0F, 15.0F, 9, 1, 2, 0.0F, false));
		body4.cubeList.add(new ModelBox(body4, 51, 73, -11.0F, -6.0F, 17.0F, 7, 1, 1, 0.0F, false));
		body4.cubeList.add(new ModelBox(body4, 82, 2, -10.0F, -6.0F, 18.0F, 5, 1, 1, 0.0F, false));
		body4.cubeList.add(new ModelBox(body4, 50, 83, -9.0F, -6.0F, 19.0F, 3, 1, 2, 0.0F, false));
		body4.cubeList.add(new ModelBox(body4, 56, 88, -8.0F, -6.0F, 21.0F, 1, 1, 2, 0.0F, false));
		body4.cubeList.add(new ModelBox(body4, 0, 12, -15.0F, -6.0F, 7.0F, 15, 1, 2, 0.0F, false));
		body4.cubeList.add(new ModelBox(body4, 23, 57, -13.0F, -6.0F, 5.0F, 11, 1, 1, 0.0F, false));
		body4.cubeList.add(new ModelBox(body4, 46, 56, -13.0F, -6.0F, 3.0F, 11, 1, 1, 0.0F, false));
		body4.cubeList.add(new ModelBox(body4, 64, 6, -12.0F, -6.0F, 2.0F, 9, 1, 1, 0.0F, false));
		body4.cubeList.add(new ModelBox(body4, 72, 51, -11.0F, -6.0F, 1.0F, 7, 1, 1, 0.0F, false));

		body5 = new RendererModel(this);
		body5.setRotationPoint(8.0F, 26.0F, -6.0F);
		body5.cubeList.add(new ModelBox(body5, 34, 13, -14.0F, -6.0F, 4.0F, 13, 1, 1, 0.0F, false));
		body5.cubeList.add(new ModelBox(body5, 27, 34, -14.0F, -6.0F, 6.0F, 13, 1, 1, 0.0F, false));
		body5.cubeList.add(new ModelBox(body5, 0, 33, -14.0F, -6.0F, 9.0F, 13, 1, 1, 0.0F, false));
		body5.cubeList.add(new ModelBox(body5, 24, 44, -13.0F, -6.0F, 10.0F, 11, 1, 2, 0.0F, false));
		body5.cubeList.add(new ModelBox(body5, 0, 56, -13.0F, -6.0F, 14.0F, 11, 1, 1, 0.0F, false));
		body5.cubeList.add(new ModelBox(body5, 59, 24, -12.0F, -6.0F, 12.0F, 9, 1, 2, 0.0F, false));
		body5.cubeList.add(new ModelBox(body5, 59, 20, -12.0F, -6.0F, 15.0F, 9, 1, 2, 0.0F, false));
		body5.cubeList.add(new ModelBox(body5, 72, 48, -11.0F, -6.0F, 17.0F, 7, 1, 1, 0.0F, false));
		body5.cubeList.add(new ModelBox(body5, 82, 0, -10.0F, -6.0F, 18.0F, 5, 1, 1, 0.0F, false));
		body5.cubeList.add(new ModelBox(body5, 29, 83, -9.0F, -6.0F, 19.0F, 3, 1, 2, 0.0F, false));
		body5.cubeList.add(new ModelBox(body5, 42, 88, -8.0F, -6.0F, 21.0F, 1, 1, 2, 0.0F, false));
		body5.cubeList.add(new ModelBox(body5, 0, 9, -15.0F, -6.0F, 7.0F, 15, 1, 2, 0.0F, false));
		body5.cubeList.add(new ModelBox(body5, 23, 55, -13.0F, -6.0F, 5.0F, 11, 1, 1, 0.0F, false));
		body5.cubeList.add(new ModelBox(body5, 54, 43, -13.0F, -6.0F, 3.0F, 11, 1, 1, 0.0F, false));
		body5.cubeList.add(new ModelBox(body5, 63, 4, -12.0F, -6.0F, 2.0F, 9, 1, 1, 0.0F, false));
		body5.cubeList.add(new ModelBox(body5, 72, 45, -11.0F, -6.0F, 1.0F, 7, 1, 1, 0.0F, false));

		body6 = new RendererModel(this);
		body6.setRotationPoint(8.0F, 21.0F, -6.0F);
		body6.cubeList.add(new ModelBox(body6, 54, 41, -13.0F, -6.0F, 4.0F, 11, 1, 1, 0.0F, false));
		body6.cubeList.add(new ModelBox(body6, 54, 39, -13.0F, -6.0F, 6.0F, 11, 1, 1, 0.0F, false));
		body6.cubeList.add(new ModelBox(body6, 54, 37, -13.0F, -6.0F, 9.0F, 11, 1, 1, 0.0F, false));
		body6.cubeList.add(new ModelBox(body6, 59, 16, -12.0F, -6.0F, 10.0F, 9, 1, 2, 0.0F, false));
		body6.cubeList.add(new ModelBox(body6, 63, 1, -12.0F, -6.0F, 14.0F, 9, 1, 1, 0.0F, false));
		body6.cubeList.add(new ModelBox(body6, 69, 54, -11.0F, -6.0F, 12.0F, 7, 1, 2, 0.0F, false));
		body6.cubeList.add(new ModelBox(body6, 68, 69, -11.0F, -6.0F, 15.0F, 7, 1, 2, 0.0F, false));
		body6.cubeList.add(new ModelBox(body6, 77, 82, -10.0F, -6.0F, 17.0F, 5, 1, 1, 0.0F, false));
		body6.cubeList.add(new ModelBox(body6, 86, 80, -9.0F, -6.0F, 18.0F, 3, 1, 1, 0.0F, false));
		body6.cubeList.add(new ModelBox(body6, 36, 88, -8.0F, -6.0F, 19.0F, 1, 1, 2, 0.0F, false));
		body6.cubeList.add(new ModelBox(body6, 31, 19, -14.0F, -6.0F, 7.0F, 13, 1, 2, 0.0F, false));
		body6.cubeList.add(new ModelBox(body6, 60, 63, -12.0F, -6.0F, 5.0F, 9, 1, 1, 0.0F, false));
		body6.cubeList.add(new ModelBox(body6, 40, 63, -12.0F, -6.0F, 3.0F, 9, 1, 1, 0.0F, false));
		body6.cubeList.add(new ModelBox(body6, 66, 72, -11.0F, -6.0F, 2.0F, 7, 1, 1, 0.0F, false));
		body6.cubeList.add(new ModelBox(body6, 40, 82, -10.0F, -6.0F, 1.0F, 5, 1, 1, 0.0F, false));

		body7 = new RendererModel(this);
		body7.setRotationPoint(8.0F, 27.0F, -6.0F);
		body7.cubeList.add(new ModelBox(body7, 54, 35, -13.0F, -6.0F, 4.0F, 11, 1, 1, 0.0F, false));
		body7.cubeList.add(new ModelBox(body7, 46, 54, -13.0F, -6.0F, 6.0F, 11, 1, 1, 0.0F, false));
		body7.cubeList.add(new ModelBox(body7, 0, 54, -13.0F, -6.0F, 9.0F, 11, 1, 1, 0.0F, false));
		body7.cubeList.add(new ModelBox(body7, 58, 32, -12.0F, -6.0F, 10.0F, 9, 1, 2, 0.0F, false));
		body7.cubeList.add(new ModelBox(body7, 20, 63, -12.0F, -6.0F, 14.0F, 9, 1, 1, 0.0F, false));
		body7.cubeList.add(new ModelBox(body7, 52, 68, -11.0F, -6.0F, 12.0F, 7, 1, 2, 0.0F, false));
		body7.cubeList.add(new ModelBox(body7, 67, 60, -11.0F, -6.0F, 15.0F, 7, 1, 2, 0.0F, false));
		body7.cubeList.add(new ModelBox(body7, 0, 82, -10.0F, -6.0F, 17.0F, 5, 1, 1, 0.0F, false));
		body7.cubeList.add(new ModelBox(body7, 86, 33, -9.0F, -6.0F, 18.0F, 3, 1, 1, 0.0F, false));
		body7.cubeList.add(new ModelBox(body7, 17, 88, -8.0F, -6.0F, 19.0F, 1, 1, 2, 0.0F, false));
		body7.cubeList.add(new ModelBox(body7, 31, 15, -14.0F, -6.0F, 7.0F, 13, 1, 2, 0.0F, false));
		body7.cubeList.add(new ModelBox(body7, 0, 63, -12.0F, -6.0F, 5.0F, 9, 1, 1, 0.0F, false));
		body7.cubeList.add(new ModelBox(body7, 61, 14, -12.0F, -6.0F, 3.0F, 9, 1, 1, 0.0F, false));
		body7.cubeList.add(new ModelBox(body7, 36, 72, -11.0F, -6.0F, 2.0F, 7, 1, 1, 0.0F, false));
		body7.cubeList.add(new ModelBox(body7, 80, 63, -10.0F, -6.0F, 1.0F, 5, 1, 1, 0.0F, false));

		body8 = new RendererModel(this);
		body8.setRotationPoint(8.0F, 20.0F, -6.0F);
		body8.cubeList.add(new ModelBox(body8, 61, 12, -12.0F, -6.0F, 4.0F, 9, 1, 1, 0.0F, false));
		body8.cubeList.add(new ModelBox(body8, 23, 53, -13.0F, -6.0F, 6.0F, 11, 1, 1, 0.0F, false));
		body8.cubeList.add(new ModelBox(body8, 0, 52, -13.0F, -6.0F, 9.0F, 11, 1, 1, 0.0F, false));
		body8.cubeList.add(new ModelBox(body8, 36, 67, -11.0F, -6.0F, 10.0F, 7, 1, 2, 0.0F, false));
		body8.cubeList.add(new ModelBox(body8, 20, 72, -11.0F, -6.0F, 14.0F, 7, 1, 1, 0.0F, false));
		body8.cubeList.add(new ModelBox(body8, 18, 67, -11.0F, -6.0F, 12.0F, 7, 1, 2, 0.0F, false));
		body8.cubeList.add(new ModelBox(body8, 0, 77, -10.0F, -6.0F, 15.0F, 5, 1, 2, 0.0F, false));
		body8.cubeList.add(new ModelBox(body8, 85, 54, -9.0F, -6.0F, 17.0F, 3, 1, 1, 0.0F, false));
		body8.cubeList.add(new ModelBox(body8, 81, 84, -8.0F, -6.0F, 18.0F, 1, 1, 1, 0.0F, false));
		body8.cubeList.add(new ModelBox(body8, 30, 31, -14.0F, -6.0F, 7.0F, 13, 1, 2, 0.0F, false));
		body8.cubeList.add(new ModelBox(body8, 51, 71, -11.0F, -6.0F, 5.0F, 7, 1, 1, 0.0F, false));
		body8.cubeList.add(new ModelBox(body8, 36, 70, -11.0F, -6.0F, 3.0F, 7, 1, 1, 0.0F, false));
		body8.cubeList.add(new ModelBox(body8, 80, 13, -10.0F, -6.0F, 2.0F, 5, 1, 1, 0.0F, false));

		body9 = new RendererModel(this);
		body9.setRotationPoint(8.0F, 28.0F, -6.0F);
		body9.cubeList.add(new ModelBox(body9, 22, 61, -12.0F, -6.0F, 4.0F, 9, 1, 1, 0.0F, false));
		body9.cubeList.add(new ModelBox(body9, 60, 10, -12.0F, -6.0F, 6.0F, 9, 1, 1, 0.0F, false));
		body9.cubeList.add(new ModelBox(body9, 59, 27, -12.0F, -6.0F, 9.0F, 9, 1, 1, 0.0F, false));
		body9.cubeList.add(new ModelBox(body9, 0, 67, -11.0F, -6.0F, 10.0F, 7, 1, 2, 0.0F, false));
		body9.cubeList.add(new ModelBox(body9, 20, 70, -11.0F, -6.0F, 14.0F, 7, 1, 1, 0.0F, false));
		body9.cubeList.add(new ModelBox(body9, 65, 76, -10.0F, -6.0F, 12.0F, 5, 1, 2, 0.0F, false));
		body9.cubeList.add(new ModelBox(body9, 53, 75, -10.0F, -6.0F, 15.0F, 5, 1, 2, 0.0F, false));
		body9.cubeList.add(new ModelBox(body9, 84, 74, -9.0F, -6.0F, 17.0F, 3, 1, 1, 0.0F, false));
		body9.cubeList.add(new ModelBox(body9, 64, 84, -8.0F, -6.0F, 18.0F, 1, 1, 1, 0.0F, false));
		body9.cubeList.add(new ModelBox(body9, 0, 43, -13.0F, -6.0F, 7.0F, 11, 1, 2, 0.0F, false));
		body9.cubeList.add(new ModelBox(body9, 69, 57, -11.0F, -6.0F, 5.0F, 7, 1, 1, 0.0F, false));
		body9.cubeList.add(new ModelBox(body9, 65, 8, -11.0F, -6.0F, 3.0F, 7, 1, 1, 0.0F, false));
		body9.cubeList.add(new ModelBox(body9, 80, 11, -10.0F, -6.0F, 2.0F, 5, 1, 1, 0.0F, false));

		body10 = new RendererModel(this);
		body10.setRotationPoint(8.0F, 29.0F, -6.0F);
		body10.cubeList.add(new ModelBox(body10, 80, 9, -10.0F, -6.0F, 4.0F, 5, 1, 1, 0.0F, false));
		body10.cubeList.add(new ModelBox(body10, 74, 80, -10.0F, -6.0F, 6.0F, 5, 1, 1, 0.0F, false));
		body10.cubeList.add(new ModelBox(body10, 77, 42, -10.0F, -6.0F, 9.0F, 5, 1, 1, 0.0F, false));
		body10.cubeList.add(new ModelBox(body10, 10, 83, -9.0F, -6.0F, 10.0F, 3, 1, 2, 0.0F, false));
		body10.cubeList.add(new ModelBox(body10, 82, 6, -9.0F, -6.0F, 12.0F, 3, 1, 2, 0.0F, false));
		body10.cubeList.add(new ModelBox(body10, 13, 86, -8.0F, -6.0F, 14.0F, 1, 1, 2, 0.0F, false));
		body10.cubeList.add(new ModelBox(body10, 58, 65, -11.0F, -6.0F, 7.0F, 7, 1, 2, 0.0F, false));
		body10.cubeList.add(new ModelBox(body10, 37, 80, -9.0F, -6.0F, 5.0F, 3, 1, 1, 0.0F, false));
		body10.cubeList.add(new ModelBox(body10, 0, 80, -9.0F, -6.0F, 3.0F, 3, 1, 1, 0.0F, false));

		eyes = new RendererModel(this);
		eyes.setRotationPoint(0.0F, 24.0F, 0.0F);
		eyes.cubeList.add(new ModelBox(eyes, 77, 32, -1.0F, -12.0F, -1.0F, 3, 1, 3, 0.0F, false));
		eyes.cubeList.add(new ModelBox(eyes, 86, 30, -5.0F, -11.0F, 1.0F, 2, 1, 2, 0.0F, false));
		eyes.cubeList.add(new ModelBox(eyes, 50, 86, 4.0F, -11.0F, 1.0F, 2, 1, 2, 0.0F, false));
		eyes.cubeList.add(new ModelBox(eyes, 30, 86, 1.0F, -11.0F, 6.0F, 2, 1, 2, 0.0F, false));
		eyes.cubeList.add(new ModelBox(eyes, 85, 60, -2.0F, -11.0F, 6.0F, 2, 1, 2, 0.0F, false));
		eyes.cubeList.add(new ModelBox(eyes, 85, 44, -2.0F, -11.0F, -1.0F, 1, 1, 3, 0.0F, false));
		eyes.cubeList.add(new ModelBox(eyes, 22, 85, 2.0F, -11.0F, -1.0F, 1, 1, 3, 0.0F, false));
		eyes.cubeList.add(new ModelBox(eyes, 83, 39, -1.0F, -11.0F, -2.0F, 3, 1, 1, 0.0F, false));
		eyes.cubeList.add(new ModelBox(eyes, 83, 4, -1.0F, -11.0F, 2.0F, 3, 1, 1, 0.0F, false));

		horn1 = new RendererModel(this);
		horn1.setRotationPoint(0.0F, 24.0F, 0.0F);
		horn1.cubeList.add(new ModelBox(horn1, 12, 70, -6.0F, -7.0F, -8.0F, 2, 3, 4, 0.0F, false));
		horn1.cubeList.add(new ModelBox(horn1, 79, 20, -7.0F, -7.0F, -8.0F, 1, 3, 3, 0.0F, false));
		horn1.cubeList.add(new ModelBox(horn1, 21, 78, -7.0F, -7.0F, -11.0F, 2, 3, 3, 0.0F, false));
		horn1.cubeList.add(new ModelBox(horn1, 75, 84, -6.0F, -6.0F, -13.0F, 2, 2, 2, 0.0F, false));
		horn1.cubeList.add(new ModelBox(horn1, 77, 88, -5.0F, -6.0F, -14.0F, 1, 2, 1, 0.0F, false));
		horn1.cubeList.add(new ModelBox(horn1, 83, 60, -5.0F, -6.0F, -15.0F, 1, 1, 1, 0.0F, false));
		horn1.cubeList.add(new ModelBox(horn1, 83, 84, -7.0F, -6.0F, -5.0F, 1, 1, 3, 0.0F, false));
		horn1.cubeList.add(new ModelBox(horn1, 78, 72, -8.0F, -6.0F, -10.0F, 1, 1, 4, 0.0F, false));
		horn1.cubeList.add(new ModelBox(horn1, 59, 78, -6.0F, -7.0F, -4.0F, 1, 3, 1, 0.0F, false));

		horn2 = new RendererModel(this);
		horn2.setRotationPoint(1.0F, 23.0F, 0.0F);
		setRotationAngle(horn2, 0.0F, 0.0F, -3.1416F);
		horn2.cubeList.add(new ModelBox(horn2, 0, 70, -6.0F, 3.0F, -8.0F, 2, 3, 4, 0.0F, false));
		horn2.cubeList.add(new ModelBox(horn2, 69, 79, -7.0F, 3.0F, -8.0F, 1, 3, 3, 0.0F, false));
		horn2.cubeList.add(new ModelBox(horn2, 11, 77, -7.0F, 3.0F, -11.0F, 2, 3, 3, 0.0F, false));
		horn2.cubeList.add(new ModelBox(horn2, 58, 84, -6.0F, 3.0F, -13.0F, 2, 2, 2, 0.0F, false));
		horn2.cubeList.add(new ModelBox(horn2, 73, 88, -5.0F, 3.0F, -14.0F, 1, 2, 1, 0.0F, false));
		horn2.cubeList.add(new ModelBox(horn2, 77, 38, -5.0F, 4.0F, -15.0F, 1, 1, 1, 0.0F, false));
		horn2.cubeList.add(new ModelBox(horn2, 44, 84, -7.0F, 4.0F, -5.0F, 1, 1, 3, 0.0F, false));
		horn2.cubeList.add(new ModelBox(horn2, 53, 78, -8.0F, 4.0F, -10.0F, 1, 1, 4, 0.0F, false));
		horn2.cubeList.add(new ModelBox(horn2, 0, 70, -6.0F, 3.0F, -4.0F, 1, 3, 1, 0.0F, false));

		smallhorns = new RendererModel(this);
		smallhorns.setRotationPoint(0.0F, 24.0F, 0.0F);
		smallhorns.cubeList.add(new ModelBox(smallhorns, 81, 88, 1.0F, -8.0F, -8.0F, 1, 2, 1, 0.0F, false));
		smallhorns.cubeList.add(new ModelBox(smallhorns, 53, 78, -1.0F, -8.0F, -8.0F, 1, 2, 1, 0.0F, false));
		smallhorns.cubeList.add(new ModelBox(smallhorns, 66, 85, -2.0F, -8.0F, -7.0F, 2, 2, 2, 0.0F, false));
		smallhorns.cubeList.add(new ModelBox(smallhorns, 84, 70, 1.0F, -8.0F, -7.0F, 2, 2, 2, 0.0F, false));

		tentacles = new RendererModel(this);
		tentacles.setRotationPoint(0.0F, 24.0F, 0.0F);
		tentacles.cubeList.add(new ModelBox(tentacles, 84, 18, -1.0F, -5.0F, -11.0F, 1, 1, 3, 0.0F, false));
		tentacles.cubeList.add(new ModelBox(tentacles, 5, 85, -2.0F, -5.0F, -8.0F, 1, 1, 3, 0.0F, false));
		tentacles.cubeList.add(new ModelBox(tentacles, 0, 88, 1.0F, -5.0F, -10.0F, 1, 1, 2, 0.0F, false));
		tentacles.cubeList.add(new ModelBox(tentacles, 84, 23, 2.0F, -5.0F, -8.0F, 1, 1, 3, 0.0F, false));
		tentacles.cubeList.add(new ModelBox(tentacles, 59, 79, -1.0F, -6.0F, 20.0F, 1, 1, 4, 0.0F, false));
		tentacles.cubeList.add(new ModelBox(tentacles, 36, 84, 9.0F, -6.0F, 1.0F, 1, 1, 3, 0.0F, false));
		tentacles.cubeList.add(new ModelBox(tentacles, 17, 84, -9.0F, -6.0F, 1.0F, 1, 1, 3, 0.0F, false));
		tentacles.cubeList.add(new ModelBox(tentacles, 60, 88, -8.0F, -6.0F, 5.0F, 2, 1, 1, 0.0F, false));
		tentacles.cubeList.add(new ModelBox(tentacles, 0, 84, -7.0F, -6.0F, 8.0F, 1, 1, 3, 0.0F, false));
		tentacles.cubeList.add(new ModelBox(tentacles, 31, 78, -5.0F, -6.0F, 12.0F, 1, 1, 4, 0.0F, false));
		tentacles.cubeList.add(new ModelBox(tentacles, 77, 37, 5.0F, -6.0F, 12.0F, 1, 1, 4, 0.0F, false));
		tentacles.cubeList.add(new ModelBox(tentacles, 77, 15, 4.0F, -6.0F, 16.0F, 1, 1, 4, 0.0F, false));
		tentacles.cubeList.add(new ModelBox(tentacles, 47, 77, -4.0F, -6.0F, 16.0F, 1, 1, 4, 0.0F, false));
		tentacles.cubeList.add(new ModelBox(tentacles, 16, 67, -3.0F, -6.0F, 15.0F, 1, 1, 1, 0.0F, false));
		tentacles.cubeList.add(new ModelBox(tentacles, 65, 60, 3.0F, -6.0F, 15.0F, 1, 1, 1, 0.0F, false));
		tentacles.cubeList.add(new ModelBox(tentacles, 8, 70, 7.0F, -6.0F, 8.0F, 1, 1, 3, 0.0F, false));
		tentacles.cubeList.add(new ModelBox(tentacles, 28, 78, -8.0F, -6.0F, 11.0F, 1, 1, 2, 0.0F, false));
		tentacles.cubeList.add(new ModelBox(tentacles, 18, 77, 8.0F, -6.0F, 11.0F, 1, 1, 2, 0.0F, false));
		tentacles.cubeList.add(new ModelBox(tentacles, 82, 30, 7.0F, -6.0F, 5.0F, 2, 1, 1, 0.0F, false));
		tentacles.cubeList.add(new ModelBox(tentacles, 77, 36, -9.0F, -6.0F, 6.0F, 1, 1, 1, 0.0F, false));
		tentacles.cubeList.add(new ModelBox(tentacles, 34, 67, 9.0F, -6.0F, 6.0F, 1, 1, 1, 0.0F, false));
		tentacles.cubeList.add(new ModelBox(tentacles, 41, 84, -10.0F, -6.0F, 7.0F, 1, 1, 2, 0.0F, false));
		tentacles.cubeList.add(new ModelBox(tentacles, 65, 79, 10.0F, -6.0F, 7.0F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(EntityEaterOfSouls entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body1.render(f5);
		body2.render(f5);
		body3.render(f5);
		body4.render(f5);
		body5.render(f5);
		body6.render(f5);
		body7.render(f5);
		body8.render(f5);
		body9.render(f5);
		body10.render(f5);
		eyes.render(f5);
		horn1.render(f5);
		horn2.render(f5);
		smallhorns.render(f5);
		tentacles.render(f5);
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
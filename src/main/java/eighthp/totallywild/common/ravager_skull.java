// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class custom_model extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer horns;
	private final ModelRenderer left_horn;

	public custom_model() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 20.0F, 6.0F);
		head.setTextureOffset(0, 0).addBox(-8.0F, -20.0F, -14.0F, 16.0F, 20.0F, 16.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-2.0F, -6.0F, -18.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		horns = new ModelRenderer(this);
		horns.setRotationPoint(-5.0F, -13.0F, -9.0F);
		head.addChild(horns);
		setRotationAngle(horns, 1.0472F, 0.0F, 0.0F);
		horns.setTextureOffset(74, 55).addBox(-5.0F, -14.0F, -1.0F, 2.0F, 14.0F, 4.0F, 0.0F, false);

		left_horn = new ModelRenderer(this);
		left_horn.setRotationPoint(5.0F, 27.0F, 19.0F);
		horns.addChild(left_horn);
		left_horn.setTextureOffset(74, 55).addBox(8.0F, -41.0F, -20.0F, 2.0F, 14.0F, 4.0F, 0.0F, true);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
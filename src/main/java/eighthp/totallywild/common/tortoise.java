// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class custom_model extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer body2;
	private final ModelRenderer body2_rotation;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 19.0F, -10.0F);
		head.setTextureOffset(0, 1).addBox(-2.0F, 1.0F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(3.5F, 22.0F, 11.0F);
		leg1.setTextureOffset(0, 13).addBox(-11.5F, 1.0F, -6.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-3.5F, 22.0F, 11.0F);
		leg2.setTextureOffset(0, 13).addBox(-4.5F, 1.0F, -16.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(5.0F, 21.0F, -4.0F);
		leg3.setTextureOffset(0, 13).addBox(1.0F, 2.0F, 9.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(-5.0F, 21.0F, -4.0F);
		leg4.setTextureOffset(0, 13).addBox(11.0F, 2.0F, -1.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(0.0F, 11.0F, -10.0F);
		

		body2_rotation = new ModelRenderer(this);
		body2_rotation.setRotationPoint(0.0F, 0.0F, 0.0F);
		body2.addChild(body2_rotation);
		setRotationAngle(body2_rotation, 1.5708F, 0.0F, 0.0F);
		body2_rotation.setTextureOffset(10, 13).addBox(-6.5F, 3.0F, -14.0F, 15.0F, 18.0F, 12.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		leg3.render(matrixStack, buffer, packedLight, packedOverlay);
		leg4.render(matrixStack, buffer, packedLight, packedOverlay);
		body2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
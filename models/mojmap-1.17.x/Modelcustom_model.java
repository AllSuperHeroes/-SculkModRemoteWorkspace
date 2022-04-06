// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart head;
	private final ModelPart left_ear;
	private final ModelPart right_ear;
	private final ModelPart body;
	private final ModelPart right_arm;
	private final ModelPart left_arm;
	private final ModelPart left_leg;
	private final ModelPart right_leg;

	public Modelcustom_model(ModelPart root) {
		this.head = root.getChild("head");
		this.left_ear = root.getChild("left_ear");
		this.right_ear = root.getChild("right_ear");
		this.body = root.getChild("body");
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-8.0F, -16.0F, -5.0F, 16.0F, 16.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -10.0F, 0.0F));

		PartDefinition left_ear = partdefinition.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(106, 46)
				.addBox(0.0F, -6.5F, 0.0F, 10.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, -22.5F, 0.0F));

		PartDefinition right_ear = partdefinition.addOrReplaceChild("right_ear", CubeListBuilder.create()
				.texOffs(106, 36).addBox(-10.0F, -6.5F, 0.0F, 10.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-8.0F, -22.5F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 26)
				.addBox(-9.0F, 0.0F, -5.0F, 18.0F, 21.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -10.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(52, 0)
				.addBox(-6.0F, -4.0F, -4.0F, 8.0F, 28.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-11.0F, -6.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(84, 0)
				.addBox(-2.0F, -4.0F, -4.0F, 8.0F, 28.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(11.0F, -6.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(82, 36)
				.addBox(-3.0F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 11.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create()
				.texOffs(58, 36).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, 11.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, buffer, packedLight, packedOverlay);
		left_ear.render(poseStack, buffer, packedLight, packedOverlay);
		right_ear.render(poseStack, buffer, packedLight, packedOverlay);
		body.render(poseStack, buffer, packedLight, packedOverlay);
		right_arm.render(poseStack, buffer, packedLight, packedOverlay);
		left_arm.render(poseStack, buffer, packedLight, packedOverlay);
		left_leg.render(poseStack, buffer, packedLight, packedOverlay);
		right_leg.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
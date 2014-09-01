package WayofTime.alchemicalWizardry.common.spell.complex.effect.impactEffects;

public abstract class ProjectileUpdateEffect implements IProjectileUpdateEffect
{
	protected int powerUpgrades;
	protected int potencyUpgrades;
	protected int costUpgrades;
	
	public ProjectileUpdateEffect(int power, int potency, int cost)
	{
		this.powerUpgrades = power;
		this.potencyUpgrades = potency;
		this.costUpgrades = cost;
	}	
}

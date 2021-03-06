package net.fe.fightStage;

import net.fe.rng.RNG;
import net.fe.unit.Unit;

// TODO: Auto-generated Javadoc
/**
 * The Class Nosferatu.
 */
public final class Nosferatu extends CombatTrigger{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new nosferatu.
	 */
	public Nosferatu() {
		super(NO_NAME_MOD, YOUR_TURN_PRE + YOUR_TURN_DRAIN);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see net.fe.fightStage.CombatTrigger#attempt(net.fe.unit.Unit, int)
	 */
	@Override
	public boolean attempt(Unit user, int range, Unit opponent, RNG rng) {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see net.fe.fightStage.CombatTrigger#runDrain(net.fe.unit.Unit, net.fe.unit.Unit, int)
	 */
	public int runDrain(Unit a, Unit d, int damage){
		if (damage == 0)
			return 0;
		return Math.min(damage / 2, a.getStats().maxHp - a.getHp());
	}
	
	/* (non-Javadoc)
	 * @see net.fe.fightStage.CombatTrigger#getCopy()
	 */
	public CombatTrigger getCopy(){
		return new Nosferatu();
	}
	
	@Override
	public boolean equals(Object o){
		return o instanceof Nosferatu;
	}
	@Override
	public int hashCode() { return (int)serialVersionUID; }
}

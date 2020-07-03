package com.hibernate;

/**
 * Player entity. @author MyEclipse Persistence Tools
 */

public class Player implements java.io.Serializable {

	// Fields
	private PlayerId id;
	private String name;
	private String minutes;
	private String pts;
	private String assist;
	private String rebound;
	private String steal;
	private String blockShot;
	private String turnover;
	private String foul;
	private String fg;

	// Constructors

	/** default constructor */
	public Player() {
	}

	/** minimal constructor */
	public Player(PlayerId id) {
		this.id = id;
	}

	/** full constructor */
	public Player(PlayerId id, String name, String minutes, String pts, String assist, String rebound,
			String steal, String blockShot, String turnover, String foul, String fg) {
		this.id = id;
		this.name = name;
		this.minutes = minutes;
		this.pts = pts;
		this.assist = assist;
		this.rebound = rebound;
		this.steal = steal;
		this.blockShot = blockShot;
		this.turnover = turnover;
		this.foul = foul;
		this.fg = fg;
	}

	// Property accessors

	public PlayerId getId() {
		return this.id;
	}

	public void setId(PlayerId id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getMinutes() {
		return this.minutes;
	}

	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}

	public String getPts() {
		return this.pts;
	}

	public void setPts(String pts) {
		this.pts = pts;
	}

	public String getAssist() {
		return this.assist;
	}

	public void setAssist(String assist) {
		this.assist = assist;
	}

	public String getRebound() {
		return this.rebound;
	}

	public void setRebound(String rebound) {
		this.rebound = rebound;
	}

	public String getSteal() {
		return this.steal;
	}

	public void setSteal(String steal) {
		this.steal = steal;
	}

	public String getBlockShot() {
		return this.blockShot;
	}

	public void setBlockShot(String blockShot) {
		this.blockShot = blockShot;
	}

	public String getTurnover() {
		return this.turnover;
	}

	public void setTurnover(String turnover) {
		this.turnover = turnover;
	}

	public String getFoul() {
		return this.foul;
	}

	public void setFoul(String foul) {
		this.foul = foul;
	}

	public String getFg() {
		return this.fg;
	}

	public void setFg(String fg) {
		this.fg = fg;
	}


}
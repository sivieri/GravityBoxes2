package me.sivieri.gravityboxes2;

import org.jbox2d.p5.Physics;

import processing.core.PApplet;

public class MainActivity extends PApplet {

	private Physics physics;

	@Override
	public void setup() {
		float gravX = (float) 0.0;
		float gravY = (float) -10.0;
		float AABBWidth = 2 * this.width;
		float AABBHeight = 2 * this.height;
		float borderBoxWidth = this.width;
		float borderBoxHeight = this.height;
		float pixelsPerMeter = 30;
		this.physics = new Physics(this, this.width, this.height, gravX, gravY, AABBWidth, AABBHeight, borderBoxWidth, borderBoxHeight, pixelsPerMeter);
		this.physics.setDensity(1.0f);
	}

	@Override
	public void draw() {
		background(0);
		float sz = random(5, 10);
		if (this.mousePressed) {
			this.physics.createRect(this.mouseX - sz, this.mouseY - sz, this.mouseX + sz, this.mouseY + sz);
		}
	}

	@Override
	public String sketchRenderer() {
		return P3D;
	}

}

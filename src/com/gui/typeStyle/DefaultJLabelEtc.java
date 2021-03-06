package com.gui.typeStyle;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
/**
 * <b>垂直滚动条</b>
 * <p>
 * 描述:<br>
 * 
 * @author 威 
 * <br>2018年6月27日 下午9:19:50 
 * @see
 * @since 1.0
 */
public class DefaultJLabelEtc extends AbstaractDefaultLabel{
	private static final long serialVersionUID = 1L;

	public DefaultJLabelEtc(){
		super(null, null, 0);
	}
	public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(java.awt.Color.gray);
		g2d.fillRoundRect(0, 0, 
				(int) this.getSize().getWidth(), 
				(int) this.getSize().getHeight(), 
				20, 20);
		g2d.dispose();
	}
}

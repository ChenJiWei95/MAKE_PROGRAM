package com.gui.layout;

import com.gui.DComp.DComp;

public class VertLineLayout extends AbstractLayout implements Layout {
	
	@Override
	public void location(DComp comp) {
		Integer temp = (int) comp.getMargin().getY();
		comp.setMargin(allowX+(int) comp.getMargin().getX(),
				allowY+temp);
		allowY += (int) comp.getSize().getHeight() + temp;
	}
}

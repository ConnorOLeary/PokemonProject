package pokemon.view;

import javax.swing.*;
import pokemon.controller.PokemonController;
import pokemon.view.PokemonPanel;

public class PokemonFrame extends JFrame{
	private PokemonController appController;
	private PokemonPanel appPanel;
	
	public PokemonFrame(PokemonController appController) {
		super();
		this.appController = appController;
		this.appPanel = new PokemonPanel(appController);
		setupFrame();
	}
	
	private void setupFrame() {
		this.setContentPane(appPanel);
	}
	
}

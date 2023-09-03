import java.io.IOException;
import javax.swing.JOptionPane;





public class RestauranteMenu {
public static void main(String[] args) throws IOException {
		
	int codMenuPpal = 0, codMenuTipico = 0, codMenuCarta = 0, codMenuInter = 0;
	
	do {
		String menu = "Menu Restaurante\n\n";
		menu += "1. Plato Tipico\n";
		menu += "2. Plato a la Carta\n";
		menu += "3. Plato Internacional\n";
		menu += "4. Salir \n\n";
		menu += "Por Favor seleccione una Opción \n";
		codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog(menu));
	
	switch (codMenuPpal) {
		case 1:
		do {
			String menuTipico = "Menu Tipico\n\n";
			menuTipico += "1. Frijoles\n";
			menuTipico += "2. Sopa de Verduras\n";
			menuTipico += "3. Regresar\n\n";
			menuTipico += "Por favor seleccione una opción\n";
			codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog(menuTipico));
			
				switch (codMenuTipico) {
				case 1:
					JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Frijoles, el costo es: $" + 20000 );
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Sopa de Verduras, el costo es: $" + 10000 );
					break;
				case 3:
				
					break;
				default:
					JOptionPane.showMessageDialog(null, "No corresponde a un " + "Codigo Valido","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
					break;
				}
				
				codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir" + " o 3 para regresar al menú principal"));
					if (codMenuTipico != 1) {
						codMenuTipico = 3;
					} 
			}while (codMenuTipico !=3);
			break;
			
		case 2:
			do {
				String menuCarta = "Menu a la Carta\n\n";
				menuCarta += "1. Carne a la Brasa\n";
				menuCarta += "2. Estofado de Res\n";
				menuCarta += "3. Bandeja Paisa\n";
				menuCarta += "4. Regresar\n\n";
				menuCarta += "Por favor seleccione una opción\n";
				codMenuCarta = Integer.parseInt(JOptionPane.showInputDialog(menuCarta));
				
					switch (codMenuCarta) {
					case 1:
						JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Carne a la Brasa, el costo es: $" + 50000 );
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Estofado de Res, el costo es: $" + 120000 );
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Bandeja Paisa, el costo es: $" + 55000 );
						break;
					case 4:
						
						break;
					default:
						JOptionPane.showMessageDialog(null, "No corresponde a un " + "Codigo Valido","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
						break;
					}
					
					codMenuCarta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir" + " o 4 para regresar al menú principal"));
						if (codMenuCarta != 1) {
							codMenuCarta = 4;
						} 
				}while (codMenuCarta !=4);
			break;

		case 3:
			do {
				String menuInter = "Menu a la Carta\n\n";
				menuInter += "1. Corte Argentino\n";
				menuInter += "2. Sushi\n";
				menuInter += "3. Caviar\n";
				menuInter += "4. Regresar\n\n";
				menuInter += "Por favor seleccione una opción\n";
				codMenuInter = Integer.parseInt(JOptionPane.showInputDialog(menuInter));
				
					switch (codMenuInter) {
					case 1:
						JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Corte Argentino, el costo es: $" + 50000 );
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Sushi, el costo es: $" + 120000 );
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Caviar, el costo es: $" + 150000 );
						break;
					case 4:
						
						break;
					default:
						JOptionPane.showMessageDialog(null, "No corresponde a un " + "Codigo Valido","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
						break;
					}
					
					codMenuInter = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir" + " o 4 para regresar al menú principal"));
						if (codMenuInter != 1) {
							codMenuInter = 4;
						} 
				}while (codMenuInter !=4);;
			break;
			
		case 4:
			System.out.println("\n Ciao!");
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "No corresponde a un " + "Codigo Valido","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
			break;
	}
		
	} while (codMenuPpal != 4);
	System.out.println("Ha salido del programa...");

}
}
